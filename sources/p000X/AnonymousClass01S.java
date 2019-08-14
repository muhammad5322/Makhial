package p000X;

/* renamed from: X.01S reason: invalid class name */
public class AnonymousClass01S {

    /* renamed from: B */
    private static final int[] f216B = {4096};

    /* renamed from: C */
    public static C002701c f217C;

    static {
        C002701c B = C002801d.m233B();
        if (B == null) {
            B = C005802j.m315B();
        }
        f217C = B;
    }

    /* renamed from: B */
    public static String m223B(String str) {
        String[] strArr = {null};
        int[] iArr = f216B;
        if (f217C != null) {
            f217C.mo88zX(str, iArr, strArr, null);
        }
        return strArr[0];
    }

    /* renamed from: C */
    public static boolean m224C(String str, String[] strArr, long[] jArr) {
        return f217C.mo86AY(str, strArr, jArr);
    }
}
