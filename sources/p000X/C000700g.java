package p000X;

import android.util.Log;

/* renamed from: X.00g reason: invalid class name and case insensitive filesystem */
public class C000700g implements C000800h {

    /* renamed from: C */
    public static C000700g f114C = new C000700g();

    /* renamed from: B */
    private int f115B;

    /* renamed from: Ad */
    public final void mo38Ad(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    /* renamed from: EH */
    public final void mo39EH(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: FH */
    public final void mo40FH(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    /* renamed from: Sa */
    public final void mo41Sa() {
        this.f115B = 5;
    }

    /* renamed from: WR */
    public final void mo42WR(String str, String str2) {
        Log.println(3, str, str2);
    }

    /* renamed from: bQ */
    public final boolean mo43bQ(int i) {
        return this.f115B <= i;
    }

    /* renamed from: dc */
    public final void mo44dc(String str, String str2) {
        Log.w(str, str2);
    }

    /* renamed from: ec */
    public final void mo45ec(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    /* renamed from: zc */
    public final void mo46zc(String str, String str2) {
        Log.e(str, str2);
    }
}
