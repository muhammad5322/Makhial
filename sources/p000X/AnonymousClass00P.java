package p000X;

import android.content.Context;

/* renamed from: X.00P reason: invalid class name */
public enum AnonymousClass00P {
    ACRA_CRASH_REPORT("acra-reports", 1572864, null, new AnonymousClass00Q(), ".stacktrace"),
    NATIVE_CRASH_REPORT("minidumps", 8388608, "MINIDUMP", null, ".dmp"),
    ANR_REPORT(r5, 524288, r8, null, ".stacktrace"),
    CACHED_ANR_REPORT(r5, 524288, r8, new AnonymousClass00S(), ".cachedreport");
    

    /* renamed from: B */
    public final String f87B;

    /* renamed from: C */
    public final long f88C;

    /* renamed from: D */
    public final String f89D;

    /* renamed from: E */
    public final AnonymousClass00R f90E;

    /* renamed from: F */
    private final String[] f91F;

    /* renamed from: G */
    private final Object f92G;

    /* renamed from: H */
    private AnonymousClass00W f93H;

    private AnonymousClass00P(String str, long j, String str2, AnonymousClass00R r8, String... strArr) {
        this.f92G = new Object();
        this.f89D = str;
        this.f88C = j;
        this.f87B = str2;
        this.f90E = r8;
        this.f91F = strArr;
    }

    /* renamed from: A */
    public final AnonymousClass00W mo22A(Context context) {
        AnonymousClass00W r0;
        synchronized (this.f92G) {
            if (this.f93H == null) {
                this.f93H = new AnonymousClass00W(context.getDir(this.f89D, 0));
            }
            r0 = this.f93H;
        }
        return r0;
    }
}
