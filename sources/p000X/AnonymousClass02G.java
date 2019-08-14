package p000X;

import android.os.SystemClock;

/* renamed from: X.02G reason: invalid class name */
public class AnonymousClass02G implements Runnable {
    public static final String __redex_internal_original_name = "com.facebook.acra.anr.ProcessErrorMonitorANRDetector$2";

    /* renamed from: B */
    private /* synthetic */ C004501v f354B;

    /* renamed from: C */
    private /* synthetic */ boolean f355C;

    public AnonymousClass02G(C004501v r1, boolean z) {
        this.f354B = r1;
        this.f355C = z;
    }

    public final void run() {
        synchronized (this.f354B) {
            try {
                if (!this.f354B.f304B) {
                    this.f354B.mo107B(AnonymousClass01P.f195O);
                }
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        synchronized (this.f354B.f306D) {
            try {
                C004501v r2 = this.f354B;
                if (this.f355C) {
                    long uptimeMillis = SystemClock.uptimeMillis() - r2.f291D;
                    AnonymousClass01F r22 = r2.f289B.f278B;
                    synchronized (r22.f162C) {
                        r22.f162C.clear();
                    }
                    AnonymousClass00G.m26H("anr_recovery_delay", String.valueOf(uptimeMillis));
                    if (r22.f161B == null || r22.f161B.mo62C()) {
                        r22.f164E.mo19D(AnonymousClass00P.CACHED_ANR_REPORT);
                    } else {
                        AnonymousClass01F.m190B(r22.f163D.getDir("traces", 0));
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                    break;
                }
            }
        }
        return;
        throw th;
    }
}
