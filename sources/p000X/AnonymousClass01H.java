package p000X;

/* renamed from: X.01H reason: invalid class name */
public final class AnonymousClass01H {
    /* renamed from: B */
    public static void m195B(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: C */
    public static void m196C(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: D */
    public static void m197D(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
    }

    /* renamed from: E */
    public static void m198E(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    /* renamed from: F */
    public static void m199F(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: G */
    public static void m200G(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: H */
    public static String m201H(String str, Object... objArr) {
        int i = 0;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length << 4));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf.substring(i2, indexOf));
            int i3 = i + 1;
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i = i3;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            String str2 = " [";
            while (true) {
                sb.append(str2);
                int i4 = i + 1;
                sb.append(objArr[i]);
                i = i4;
                if (i4 >= objArr.length) {
                    break;
                }
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
