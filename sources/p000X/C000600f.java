package p000X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.00f reason: invalid class name and case insensitive filesystem */
public class C000600f {

    /* renamed from: B */
    public static volatile C000800h f113B = C000700g.f114C;

    static {
        f113B.mo41Sa();
        C000900i.f116B = f113B;
    }

    /* renamed from: B */
    public static void m67B(Class cls, String str) {
        if (f113B.mo43bQ(6)) {
            f113B.mo39EH(C005902k.m320B(cls), str);
        }
    }

    /* renamed from: C */
    public static void m68C(Class cls, String str, Throwable th) {
        if (f113B.mo43bQ(6)) {
            f113B.mo40FH(C005902k.m320B(cls), str, th);
        }
    }

    /* renamed from: D */
    public static void m69D(Class cls, String str, Object... objArr) {
        if (f113B.mo43bQ(6)) {
            m71F(C005902k.m320B(cls), StringFormatUtil.formatStrLocaleSafe(str, objArr));
        }
    }

    /* renamed from: E */
    public static void m70E(Class cls, Throwable th, String str, Object... objArr) {
        if (f113B.mo43bQ(6)) {
            m72G(C005902k.m320B(cls), StringFormatUtil.formatStrLocaleSafe(str, objArr), th);
        }
    }

    /* renamed from: F */
    public static void m71F(String str, String str2) {
        if (f113B.mo43bQ(6)) {
            f113B.mo39EH(str, str2);
        }
    }

    /* renamed from: G */
    public static void m72G(String str, String str2, Throwable th) {
        if (f113B.mo43bQ(6)) {
            f113B.mo40FH(str, str2, th);
        }
    }

    /* renamed from: H */
    public static void m73H(String str, String str2, Object... objArr) {
        if (f113B.mo43bQ(6)) {
            m71F(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    /* renamed from: I */
    public static void m74I(String str, Throwable th, String str2) {
        if (f113B.mo43bQ(6)) {
            f113B.mo40FH(str, str2, th);
        }
    }

    /* renamed from: J */
    public static void m75J(String str, Throwable th, String str2, Object... objArr) {
        if (f113B.mo43bQ(6)) {
            m72G(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    /* renamed from: K */
    public static boolean m76K() {
        return f113B.mo43bQ(3);
    }

    /* renamed from: L */
    public static void m77L(Class cls, String str) {
        if (f113B.mo43bQ(5)) {
            f113B.mo44dc(C005902k.m320B(cls), str);
        }
    }

    /* renamed from: M */
    public static void m78M(Class cls, String str, Throwable th) {
        if (f113B.mo43bQ(5)) {
            f113B.mo45ec(C005902k.m320B(cls), str, th);
        }
    }

    /* renamed from: N */
    public static void m79N(String str, String str2) {
        if (f113B.mo43bQ(5)) {
            f113B.mo44dc(str, str2);
        }
    }

    /* renamed from: O */
    public static void m80O(String str, String str2, Throwable th) {
        if (f113B.mo43bQ(5)) {
            f113B.mo45ec(str, str2, th);
        }
    }

    /* renamed from: P */
    public static void m81P(String str, String str2, Object... objArr) {
        if (f113B.mo43bQ(5)) {
            m79N(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    /* renamed from: Q */
    public static void m82Q(String str, Throwable th, String str2) {
        if (f113B.mo43bQ(5)) {
            f113B.mo45ec(str, str2, th);
        }
    }

    /* renamed from: R */
    public static void m83R(String str, Throwable th, String str2, Object... objArr) {
        if (f113B.mo43bQ(5)) {
            m80O(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    /* renamed from: S */
    public static void m84S(String str, String str2) {
        if (f113B.mo43bQ(6)) {
            f113B.mo46zc(str, str2);
        }
    }

    /* renamed from: T */
    public static void m85T(String str, String str2, Throwable th) {
        if (f113B.mo43bQ(6)) {
            f113B.mo38Ad(str, str2, th);
        }
    }

    /* renamed from: U */
    public static void m86U(String str, String str2, Object... objArr) {
        if (f113B.mo43bQ(6)) {
            m84S(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    /* renamed from: V */
    public static void m87V(String str, Throwable th, String str2) {
        if (f113B.mo43bQ(6)) {
            f113B.mo38Ad(str, str2, th);
        }
    }
}
