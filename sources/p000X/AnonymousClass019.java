package p000X;

import android.util.Log;

/* renamed from: X.019 reason: invalid class name */
public final class AnonymousClass019 {
    /* renamed from: B */
    public static void m177B(String str, String str2, Object... objArr) {
        Log.e(str, String.format(null, str2, objArr));
    }

    /* renamed from: C */
    public static void m178C(String str, Throwable th, String str2, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(null, str2, objArr));
        sb.append(th);
        Log.e(str, sb.toString());
    }

    /* renamed from: D */
    public static void m179D(Class cls, String str, Object... objArr) {
        Log.w(cls.getSimpleName(), String.format(null, str, objArr));
    }

    /* renamed from: E */
    public static void m180E(String str, String str2, Object... objArr) {
        Log.w(str, String.format(null, str2, objArr));
    }

    /* renamed from: F */
    public static void m181F(String str, Throwable th, String str2, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(null, str2, objArr));
        sb.append(th);
        Log.w(str, sb.toString());
    }
}
