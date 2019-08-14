package p000X;

import android.os.SystemClock;

/* renamed from: X.01r reason: invalid class name and case insensitive filesystem */
public abstract class C004101r implements AnonymousClass01E {

    /* renamed from: B */
    public final C003901p f289B;

    /* renamed from: C */
    public AnonymousClass01C f290C;

    /* renamed from: D */
    public long f291D;

    /* renamed from: E */
    public long f292E;

    /* renamed from: F */
    public volatile boolean f293F;

    /* renamed from: G */
    public Object f294G = new Object();

    /* renamed from: H */
    private final boolean f295H;

    /* renamed from: I */
    private C004601w f296I;

    /* renamed from: J */
    private final boolean f297J;

    public C004101r(C003901p r10, boolean z, boolean z2) {
        this.f289B = r10;
        this.f296I = null;
        this.f297J = z;
        this.f295H = z2;
        if (this.f289B.f288L) {
            this.f296I = new C004601w(this.f289B.f280D, this.f289B.f285I, true, 500, false, this.f289B.f284H, this.f289B.f283G);
        }
    }

    /* renamed from: A */
    public void mo106A() {
    }

    /* renamed from: B */
    public final void mo107B(Integer num) {
        Integer num2;
        AnonymousClass00F r1 = this.f289B.f279C;
        if (num == AnonymousClass01P.f184D) {
            if (r1 != null) {
                boolean A = r1.mo14A();
                if (!this.f295H) {
                    this.f293F = A;
                }
            }
            if (!this.f289B.f288L) {
                synchronized (this.f294G) {
                    if (this.f297J) {
                        if (this.f296I == null) {
                            this.f296I = new C004601w(this.f289B.f280D, this.f289B.f285I, false, 500, false, this.f289B.f284H, this.f289B.f283G);
                        }
                        C004601w r2 = this.f296I;
                        synchronized (r2) {
                            num2 = r2.f316G;
                        }
                        if (num2 != AnonymousClass01P.f183C) {
                            this.f296I.mo116B();
                        }
                        this.f296I.mo115A(new AnonymousClass02B(this), 0);
                    }
                }
            }
        } else if (r1 != null) {
            if (this.f296I != null) {
                synchronized (this.f296I) {
                }
            }
            r1.mo14A();
        }
    }

    /* renamed from: C */
    public final boolean mo108C() {
        return (this.f290C != null ? this.f290C.mo63D() : AnonymousClass00E.f35D.f30B.getSharedPreferences("acra_flags_store", 0).getBoolean("anr_gk_cached", true)) && this.f293F;
    }

    /* renamed from: Na */
    public final synchronized void mo64Na(AnonymousClass01D r1) {
    }

    /* renamed from: aZ */
    public final void mo65aZ(AnonymousClass01C r1) {
        this.f290C = r1;
    }

    public long getReadyTime() {
        return 0;
    }

    public long getSwitchTime() {
        return 0;
    }

    public void processMonitorStopped(int i) {
        if (mo108C()) {
            AnonymousClass01F r6 = this.f289B.f278B;
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (r6.f162C) {
                r6.f162C.put("anr_process_error_detection_failure_time", Long.toString(uptimeMillis));
                r6.f162C.put("anr_process_error_detection_failure_cause", Integer.toString(i));
                r6.mo68A();
            }
        }
    }

    public final void start() {
        start(-1);
    }

    public abstract void start(long j);

    public abstract void stop(C004401u r1);
}
