package p000X;

import com.facebook.stacktracer.LeanStackTracer;

/* renamed from: X.00K reason: invalid class name */
public class AnonymousClass00K {

    /* renamed from: B */
    private static boolean f75B;

    /* renamed from: B */
    public static void m50B() {
        if (!f75B) {
            f75B = true;
            AnonymousClass00G r2 = AnonymousClass00I.f71B;
            Thread.setDefaultUncaughtExceptionHandler(new AnonymousClass013());
            LeanStackTracer.init();
            AnonymousClass015 r1 = new AnonymousClass015();
            r1.f160B = (AnonymousClass016) r2.f59O.getAndSet(r1);
        }
    }
}
