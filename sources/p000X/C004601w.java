package p000X;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: X.01w reason: invalid class name and case insensitive filesystem */
public class C004601w {

    /* renamed from: B */
    public final boolean f311B;

    /* renamed from: C */
    public final int f312C;

    /* renamed from: D */
    public final int f313D;

    /* renamed from: E */
    public final int f314E;

    /* renamed from: F */
    public final String f315F;

    /* renamed from: G */
    public Integer f316G = AnonymousClass01P.f183C;

    /* renamed from: H */
    private final Context f317H;

    /* renamed from: I */
    private long f318I;

    /* renamed from: J */
    private AnonymousClass02E f319J;

    public C004601w(Context context, String str, boolean z, int i, boolean z2, int i2, int i3) {
        this.f317H = context;
        this.f315F = str;
        this.f314E = i;
        this.f311B = z2;
        this.f313D = i2;
        this.f312C = i3;
        if (z) {
            mo115A(null, 0);
        }
    }

    /* renamed from: A */
    public final void mo115A(C003701n r11, long j) {
        boolean z = false;
        ActivityManager activityManager = (ActivityManager) this.f317H.getSystemService("activity");
        synchronized (this) {
            C003701n r5 = r11;
            long j2 = j;
            if (r11 != null || j == 0) {
                if (this.f319J != null) {
                    if (this.f319J.f347E != null) {
                        z = true;
                    }
                    if (!z) {
                        if (r11 != null) {
                            AnonymousClass02E r0 = this.f319J;
                            synchronized (r0.f348F) {
                                try {
                                    r0.f347E = r11;
                                    r0.f348F.notifyAll();
                                } catch (Throwable th) {
                                    while (true) {
                                        th = th;
                                        break;
                                    }
                                }
                            }
                        } else {
                            th = new IllegalArgumentException("Listener cannot be null");
                        }
                    }
                }
                if (this.f316G != AnonymousClass01P.f183C) {
                    AnonymousClass02E.m302B(this.f319J);
                }
                this.f318I++;
                this.f319J = new AnonymousClass02E(this, activityManager, r5, this.f318I, j2);
                if (r11 == null) {
                    this.f316G = AnonymousClass01P.f183C;
                } else {
                    this.f316G = AnonymousClass01P.f184D;
                }
                this.f319J.start();
            } else {
                th = new IllegalArgumentException("Cannot delay and wait for listener at the same time");
            }
            throw th;
        }
    }

    /* renamed from: B */
    public final void mo116B() {
        synchronized (this) {
            if (this.f316G != AnonymousClass01P.f183C) {
                AnonymousClass02E.m302B(this.f319J);
            }
        }
    }

    /* renamed from: C */
    public final synchronized void mo117C(Integer num, C003701n r6) {
        String str;
        if (this.f319J.f346D == this.f318I) {
            switch (num.intValue()) {
                case 0:
                    r6.mo104uV();
                    break;
                case 1:
                    if (this.f311B) {
                        this.f316G = AnonymousClass01P.f184D;
                    } else {
                        this.f316G = AnonymousClass01P.f183C;
                    }
                    r6.mo101fT();
                    break;
                case 2:
                    this.f316G = AnonymousClass01P.f195O;
                    r6.mo102gT();
                    break;
                case 3:
                    this.f316G = AnonymousClass01P.f183C;
                    r6.mo100XU();
                    break;
                case 4:
                    this.f316G = AnonymousClass01P.f183C;
                    r6.mo99WU();
                    break;
                case 5:
                    this.f316G = AnonymousClass01P.f183C;
                    break;
                case 6:
                    this.f316G = AnonymousClass01P.f183C;
                    r6.mo103qS();
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unexpected state change reason: ");
                    if (num != null) {
                        switch (num.intValue()) {
                            case 1:
                                str = "ERROR_CLEARED";
                                break;
                            case 2:
                                str = "ERROR_DETECTED";
                                break;
                            case 3:
                                str = "MAX_NUMBER_BEFORE_ERROR";
                                break;
                            case 4:
                                str = "MAX_NUMBER_AFTER_ERROR";
                                break;
                            case 5:
                                str = "STOP_REQUESTED";
                                break;
                            case 6:
                                str = "ERROR_QUERYING_ACTIVITY_MANAGER";
                                break;
                            default:
                                str = "MONITOR_STARTED";
                                break;
                        }
                    } else {
                        str = "null";
                    }
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
