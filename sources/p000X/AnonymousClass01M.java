package p000X;

/* renamed from: X.01M reason: invalid class name */
public class AnonymousClass01M {

    /* renamed from: B */
    public final AnonymousClass01N f172B;

    /* renamed from: C */
    public final String f173C;

    /* renamed from: D */
    public final String f174D;

    /* renamed from: E */
    public final int f175E;

    public AnonymousClass01M(String str, int i) {
        AnonymousClass01N r2;
        this.f174D = AnonymousClass01N.m209B(str);
        this.f175E = i;
        String C = AnonymousClass01N.m210C(str);
        if (C != null) {
            AnonymousClass01N[] values = AnonymousClass01N.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                r2 = values[i2];
                if (r2.f180B.equals(C)) {
                    break;
                }
                i2++;
            }
        }
        r2 = null;
        this.f172B = r2;
        this.f173C = str;
        if (this.f172B == null) {
            String C2 = AnonymousClass01N.m210C(str);
            if (C2 != null) {
                AnonymousClass019.m180E("UnresolvedSocketAddress", "Unknown VIP: %s", C2);
            }
        }
    }

    public AnonymousClass01M(String str, int i, byte b) {
        this.f174D = AnonymousClass01N.m209B(str);
        this.f175E = i;
        this.f172B = null;
        this.f173C = AnonymousClass01N.m211D(this.f174D, null);
    }

    /* renamed from: A */
    public final boolean mo73A(AnonymousClass01M r4) {
        return r4 != null && this.f173C.equals(r4.f173C) && this.f175E == r4.f175E;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f173C);
        sb.append(":");
        sb.append(this.f175E);
        return sb.toString();
    }
}
