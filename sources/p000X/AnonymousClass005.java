package p000X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.005 reason: invalid class name */
public class AnonymousClass005 {

    /* renamed from: B */
    public static long f5B;

    /* renamed from: C */
    public static long f6C;

    /* renamed from: D */
    public static long f7D;

    /* renamed from: E */
    public static Map f8E;

    /* renamed from: F */
    public static boolean f9F;

    /* renamed from: B */
    public static void m1B() {
        f8E.put("total_time", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - f5B)));
    }
}
