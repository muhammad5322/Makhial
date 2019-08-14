package p000X;

/* renamed from: X.00i reason: invalid class name and case insensitive filesystem */
public class C000900i {

    /* renamed from: B */
    public static C000800h f116B = C001000j.f117C;

    /* renamed from: B */
    public static void m106B(Class cls, String str) {
        if (f116B.mo43bQ(6)) {
            f116B.mo39EH(cls.getSimpleName(), str);
        }
    }

    /* renamed from: C */
    public static void m107C(Class cls, String str, Throwable th) {
        if (f116B.mo43bQ(6)) {
            f116B.mo40FH(cls.getSimpleName(), str, th);
        }
    }

    /* renamed from: D */
    public static void m108D(String str, String str2) {
        if (f116B.mo43bQ(6)) {
            f116B.mo39EH(str, str2);
        }
    }

    /* renamed from: E */
    public static void m109E(String str, String str2, Throwable th) {
        if (f116B.mo43bQ(6)) {
            f116B.mo40FH(str, str2, th);
        }
    }

    /* renamed from: F */
    public static boolean m110F(int i) {
        return f116B.mo43bQ(i);
    }

    /* renamed from: G */
    public static void m111G(Class cls, String str) {
        if (f116B.mo43bQ(5)) {
            f116B.mo44dc(cls.getSimpleName(), str);
        }
    }

    /* renamed from: H */
    public static void m112H(Class cls, String str, Object... objArr) {
        if (f116B.mo43bQ(5)) {
            f116B.mo44dc(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    /* renamed from: I */
    public static void m113I(Class cls, Throwable th, String str, Object... objArr) {
        if (m110F(5)) {
            String format = String.format(null, str, objArr);
            if (f116B.mo43bQ(5)) {
                f116B.mo45ec(cls.getSimpleName(), format, th);
            }
        }
    }

    /* renamed from: J */
    public static void m114J(String str, String str2, Object... objArr) {
        if (f116B.mo43bQ(5)) {
            f116B.mo44dc(str, String.format(null, str2, objArr));
        }
    }

    /* renamed from: K */
    public static void m115K(String str, String str2) {
        if (f116B.mo43bQ(6)) {
            f116B.mo46zc(str, str2);
        }
    }

    /* renamed from: L */
    public static void m116L(String str, String str2, Object... objArr) {
        if (f116B.mo43bQ(6)) {
            f116B.mo46zc(str, String.format(null, str2, objArr));
        }
    }
}
