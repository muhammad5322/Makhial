package p000X;

/* renamed from: X.00e reason: invalid class name and case insensitive filesystem */
public class C000500e implements Comparable {

    /* renamed from: B */
    public AnonymousClass00H f111B;

    /* renamed from: C */
    public int f112C;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        C000500e r4 = (C000500e) obj;
        if (this.f112C == r4.f112C) {
            i = 0;
        } else {
            i = -1;
            if (this.f112C > r4.f112C) {
                return 1;
            }
        }
        return i;
    }
}
