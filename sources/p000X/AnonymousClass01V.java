package p000X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.01V reason: invalid class name */
public class AnonymousClass01V {

    /* renamed from: B */
    public final AnonymousClass008 f235B;

    /* renamed from: C */
    public final Set f236C = new HashSet();

    /* renamed from: D */
    public final AnonymousClass01Y f237D;

    /* renamed from: E */
    private final AnonymousClass01X f238E;

    /* renamed from: F */
    private final AnonymousClass01Z f239F;

    /* renamed from: G */
    private final AnonymousClass01W f240G;

    public AnonymousClass01V(AnonymousClass01W r2, AnonymousClass01Z r3, AnonymousClass01X r4, AnonymousClass01Y r5, AnonymousClass008 r6) {
        this.f238E = r4;
        this.f240G = r2;
        this.f239F = r3;
        this.f237D = r5;
        this.f235B = r6;
    }

    /* renamed from: A */
    public final void mo80A(String str) {
        if (!this.f236C.contains(str)) {
            C002501a A = this.f240G.mo81A(this.f239F, str);
            for (String A2 : new ArrayList(A.f243C)) {
                mo80A(A2);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z = true;
            synchronized (this) {
                boolean z2 = false;
                if (A.f242B != null) {
                    z2 = true;
                }
                if (z2) {
                    this.f235B.mo4YE(A.f242B, A.f246F);
                }
                if (A.f245E == null) {
                    z = false;
                }
                if (z) {
                    if (this.f237D == null) {
                        throw new IllegalArgumentException("Native loader must not be null");
                    }
                    this.f237D.mo83QR(A);
                }
                this.f236C.add(A.f244D);
            }
            this.f238E.mo82LS(str, SystemClock.uptimeMillis() - uptimeMillis);
        }
    }
}
