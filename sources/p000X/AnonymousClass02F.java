package p000X;

/* renamed from: X.02F reason: invalid class name */
public class AnonymousClass02F implements Runnable {
    public static final String __redex_internal_original_name = "com.facebook.acra.anr.ProcessErrorMonitorANRDetector$1";

    /* renamed from: B */
    private /* synthetic */ C004501v f352B;

    /* renamed from: C */
    private /* synthetic */ boolean f353C;

    public AnonymousClass02F(C004501v r1, boolean z) {
        this.f352B = r1;
        this.f353C = z;
    }

    public final void run() {
        C004501v r3 = this.f352B;
        boolean z = this.f353C;
        synchronized (r3) {
            if (r3.f305C) {
                r3.f305C = false;
                new Thread(new AnonymousClass02G(r3, z), "ProcessErrorMonitorANRDetectorThread").start();
            }
        }
    }
}
