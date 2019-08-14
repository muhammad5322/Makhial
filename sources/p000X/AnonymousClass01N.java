package p000X;

/* renamed from: X.01N reason: invalid class name */
public enum AnonymousClass01N {
    MINI("192.0.2.1", "edge-snaptu-dev-mini"),
    P2("203.0.113.2", "edge-snaptu-dev-p2");
    

    /* renamed from: E */
    public static final AnonymousClass01N f177E = null;

    /* renamed from: B */
    public final String f180B;

    /* renamed from: C */
    public final String f181C;

    /* access modifiers changed from: public */
    static {
        AnonymousClass01N r1;
        f177E = r1;
    }

    private AnonymousClass01N(String str, String str2) {
        this.f181C = str;
        this.f180B = str2;
    }

    /* renamed from: B */
    public static String m209B(String str) {
        int indexOf = str.indexOf("@");
        return indexOf != -1 ? str.substring(indexOf + 1) : str;
    }

    /* renamed from: C */
    public static String m210C(String str) {
        int indexOf = str.indexOf("@");
        if (indexOf == -1 || indexOf == 0) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: D */
    public static String m211D(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("@");
        sb.append(str);
        return sb.toString();
    }
}
