package p000X;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.00j reason: invalid class name and case insensitive filesystem */
public class C001000j implements C000800h {

    /* renamed from: C */
    public static C001000j f117C = new C001000j();

    /* renamed from: B */
    private int f118B = 5;

    private C001000j() {
    }

    /* renamed from: B */
    private static String m117B(String str) {
        String str2 = "unknown";
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: C */
    private void m118C(int i, String str, String str2, Throwable th) {
        String stringWriter;
        String B = m117B(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(10);
        if (th == null) {
            stringWriter = "";
        } else {
            StringWriter stringWriter2 = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter2));
            stringWriter = stringWriter2.toString();
        }
        sb.append(stringWriter);
        Log.println(i, B, sb.toString());
    }

    /* renamed from: Ad */
    public final void mo38Ad(String str, String str2, Throwable th) {
        m118C(6, str, str2, th);
    }

    /* renamed from: EH */
    public final void mo39EH(String str, String str2) {
        Log.println(6, m117B(str), str2);
    }

    /* renamed from: FH */
    public final void mo40FH(String str, String str2, Throwable th) {
        m118C(6, str, str2, th);
    }

    /* renamed from: Sa */
    public final void mo41Sa() {
        this.f118B = 5;
    }

    /* renamed from: WR */
    public final void mo42WR(String str, String str2) {
        Log.println(3, m117B(str), str2);
    }

    /* renamed from: bQ */
    public final boolean mo43bQ(int i) {
        return this.f118B <= i;
    }

    /* renamed from: dc */
    public final void mo44dc(String str, String str2) {
        Log.println(5, m117B(str), str2);
    }

    /* renamed from: ec */
    public final void mo45ec(String str, String str2, Throwable th) {
        m118C(5, str, str2, th);
    }

    /* renamed from: zc */
    public final void mo46zc(String str, String str2) {
        Log.println(6, m117B(str), str2);
    }
}
