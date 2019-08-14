package p000X;

/* renamed from: X.01y reason: invalid class name and case insensitive filesystem */
public final class C004801y implements Runnable {
    public static final String __redex_internal_original_name = "com.facebook.acra.ACRA$4";

    /* renamed from: B */
    private /* synthetic */ AnonymousClass00G f320B;

    public C004801y(AnonymousClass00G r1) {
        this.f320B = r1;
    }

    public final void run() {
        AnonymousClass00G r3 = this.f320B;
        AnonymousClass00P r1 = AnonymousClass00P.NATIVE_CRASH_REPORT;
        if (r3.mo21F(r1) > 0) {
            AnonymousClass00P[] r2 = {r1};
            new C003201i(r3, null, null, r2).start();
            r3.mo21F(r2);
        }
    }
}
