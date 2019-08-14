package p000X;

import android.os.Process;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.01d reason: invalid class name and case insensitive filesystem */
public final class C002801d implements C002701c {

    /* renamed from: B */
    private static volatile Method f250B;

    /* renamed from: C */
    private static volatile boolean f251C;

    /* renamed from: D */
    private static volatile Method f252D;

    /* renamed from: E */
    private static volatile boolean f253E;

    /* renamed from: F */
    private static volatile Method f254F;

    /* renamed from: G */
    private static volatile boolean f255G;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (m236E() == null) goto L_0x0019;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000X.C002801d m233B() {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r1 > r0) goto L_0x0022
            java.lang.reflect.Method r0 = m234C()
            if (r0 == 0) goto L_0x0019
            java.lang.reflect.Method r0 = m235D()
            if (r0 == 0) goto L_0x0019
            java.lang.reflect.Method r1 = m236E()
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x0022
            X.01d r0 = new X.01d
            r0.<init>()
            return r0
        L_0x0022:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C002801d.m233B():X.01d");
    }

    /* renamed from: C */
    private static Method m234C() {
        if (!f251C) {
            Class cls = Integer.TYPE;
            f250B = m237F("parseProcLine", byte[].class, cls, cls, int[].class, String[].class, long[].class, float[].class);
            f251C = true;
        }
        return f250B;
    }

    /* renamed from: D */
    private static Method m235D() {
        if (!f253E) {
            f252D = m237F("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class);
            f253E = true;
        }
        return f252D;
    }

    /* renamed from: E */
    private static Method m236E() {
        if (!f255G) {
            f254F = m237F("readProcLines", String.class, String[].class, long[].class);
            f255G = true;
        }
        return f254F;
    }

    /* renamed from: F */
    private static Method m237F(String str, Class... clsArr) {
        try {
            return Process.class.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String str2 = "OldProcReader";
            if (Log.isLoggable(str2, 5)) {
                StringBuilder sb = new StringBuilder("Warning! Could not get access to JNI method - ");
                sb.append(str);
                Log.w(str2, sb.toString(), e);
            }
            return null;
        }
    }

    /* renamed from: G */
    private static Object m238G(Method method, Object... objArr) {
        StringBuilder sb;
        String str;
        if (method != null) {
            try {
                return method.invoke(null, objArr);
            } catch (IllegalAccessException e) {
                if (Log.isLoggable("OldProcReader", 6)) {
                    sb = new StringBuilder("Error (IllegalAccessException - ");
                    str = e.getLocalizedMessage();
                    r3 = e;
                    sb.append(str);
                    sb.append(")");
                    Log.e("OldProcReader", sb.toString(), r3);
                }
            } catch (InvocationTargetException e2) {
                if (Log.isLoggable("OldProcReader", 6)) {
                    sb = new StringBuilder("Error (InvocationTargetException - ");
                    str = e2.getLocalizedMessage();
                    r3 = e2;
                    sb.append(str);
                    sb.append(")");
                    Log.e("OldProcReader", sb.toString(), r3);
                }
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: AY */
    public final boolean mo86AY(String str, String[] strArr, long[] jArr) {
        return !Boolean.FALSE.equals(m238G(m236E(), str, strArr, jArr));
    }

    /* renamed from: zW */
    public final boolean mo87zW(byte[] bArr, int i, int i2, int[] iArr, String[] strArr, long[] jArr) {
        Object G = m238G(m234C(), bArr, Integer.valueOf(i), Integer.valueOf(i2), iArr, strArr, jArr, null);
        if (G == null) {
            return false;
        }
        return ((Boolean) G).booleanValue();
    }

    /* renamed from: zX */
    public final boolean mo88zX(String str, int[] iArr, String[] strArr, long[] jArr) {
        Object G = m238G(m235D(), str, iArr, strArr, jArr, null);
        if (G == null) {
            return false;
        }
        return ((Boolean) G).booleanValue();
    }
}
