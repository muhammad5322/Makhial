package com.facebook.stacktracer;

import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p000X.C000600f;
import p000X.C001500q;

public class LeanStackTracer {
    private static boolean sStackTracerLibLoaded;

    static {
        boolean z;
        try {
            z = C001500q.m146C("fb_leanstacktracer");
        } catch (UnsatisfiedLinkError e) {
            C000600f.m82Q("LeanStackTracer", e, "Error loading LeanStackTracer lib.");
            z = false;
        }
        sStackTracerLibLoaded = z;
    }

    private static native long disableJniLogException();

    private static native long disableJniLogExceptionNougat();

    private static native long getArtDexSignature(long j);

    private static native long getArtMarshmallowDexSignature(long j);

    private static native long getArtMarshmallowMethodIdx(long j);

    private static native long getArtNougatOreoMethodIdx(long j);

    private static native long getDalvikMethodIdx(long j);

    private static Object getFieldValueByReflection(Object obj, String str) {
        if (obj == null) {
            C000600f.m81P("LeanStackTracer", "Trying to read field %s of null object", str);
            return null;
        }
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static Object getRawStackTrace(Throwable th) {
        Field field;
        if (!sStackTracerLibLoaded) {
            C000600f.m79N("LeanStackTracer", "LeanStackTracer lib not loaded, aborting.");
        } else {
            Field[] declaredFields = Throwable.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    C000600f.m79N("LeanStackTracer", "Couldn't locate raw stack trace field.");
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if ("stackState".equals(field.getName()) || "backtrace".equals(field.getName())) {
                    break;
                }
                i++;
            }
            if (field != null) {
                field.setAccessible(true);
                return field.get(th);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r1 == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init() {
        /*
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r0 = "uncaughtExceptionPreHandler"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x001a, Throwable -> 0x0012 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ NoSuchFieldException -> 0x001a, Throwable -> 0x0012 }
            r1 = 0
            r0 = 0
            r2.set(r1, r0)     // Catch:{ NoSuchFieldException -> 0x001a, Throwable -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            r2 = move-exception
            java.lang.String r1 = "LeanStackTracer"
            java.lang.String r0 = "Disabling uncaughtExceptionPreHandler failed."
            p000X.C000600f.m82Q(r1, r2, r0)
        L_0x001a:
            boolean r0 = sStackTracerLibLoaded
            if (r0 != 0) goto L_0x0026
            java.lang.String r1 = "LeanStackTracer"
            java.lang.String r0 = "LeanStackTracer lib not loaded, aborting."
            p000X.C000600f.m79N(r1, r0)
        L_0x0025:
            return
        L_0x0026:
            java.lang.String r0 = android.os.Build.MODEL
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r0 = "i4d"
            boolean r1 = r1.contains(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            if (r0 == 0) goto L_0x0025
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0044
            disableJniLogExceptionNougat()
            return
        L_0x0044:
            disableJniLogException()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stacktracer.LeanStackTracer.init():void");
    }

    public static List parseRawStackTrace(Throwable th, Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (!sStackTracerLibLoaded) {
            C000600f.m79N("LeanStackTracer", "LeanStackTracer lib not loaded, aborting.");
        } else {
            ArrayList arrayList3 = new ArrayList();
            Throwable th2 = th;
            Throwable th3 = th2;
            Throwable th4 = null;
            while (true) {
                if (!(th3 == null || th3 == th4)) {
                    Object rawStackTrace = th3 == th2 ? obj : getRawStackTrace(th3);
                    if (rawStackTrace == null) {
                        C000600f.m81P("LeanStackTracer", "Failed collecting stack trace for %s", th3.getClass().getSimpleName());
                    } else {
                        switch (VERSION.SDK_INT) {
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                int[] iArr = (int[]) rawStackTrace;
                                int length = iArr.length >> 1;
                                arrayList = new ArrayList(length << 1);
                                for (int i = 0; i < length; i++) {
                                    long dalvikMethodIdx = getDalvikMethodIdx(((long) iArr[i << 1]) & 4294967295L);
                                    int i2 = iArr[(i << 1) + 1];
                                    arrayList.add(Long.valueOf(dalvikMethodIdx));
                                    arrayList.add(Long.valueOf(((long) i2) & 4294967295L));
                                }
                                break;
                            case 21:
                            case 22:
                                Object[] objArr = (Object[]) rawStackTrace;
                                if (objArr.length > 1) {
                                    int[] iArr2 = (int[]) objArr[objArr.length - 1];
                                    if (iArr2.length >= objArr.length - 1) {
                                        Field declaredField = objArr[0].getClass().getDeclaredField("dexMethodIndex");
                                        declaredField.setAccessible(true);
                                        arrayList = new ArrayList();
                                        for (int i3 = 0; i3 < iArr2.length; i3++) {
                                            int intValue = ((Integer) declaredField.get(objArr[i3])).intValue();
                                            Object fieldValueByReflection = getFieldValueByReflection(getFieldValueByReflection(getFieldValueByReflection(getFieldValueByReflection(getFieldValueByReflection(objArr[i3], "declaringClass"), "dexCache"), "dex"), "tableOfContents"), "signature");
                                            arrayList.add(Long.valueOf((fieldValueByReflection == null ? 4294967295L : ((long) ByteBuffer.wrap((byte[]) fieldValueByReflection).order(ByteOrder.LITTLE_ENDIAN).getInt()) & 4294967295L) | ((((long) intValue) & 4294967295L) << 32)));
                                            arrayList.add(Long.valueOf(((long) iArr2[i3]) & 4294967295L));
                                        }
                                        break;
                                    } else {
                                        throw new InvalidParameterException("Lollipop offsets not sufficient");
                                    }
                                } else {
                                    throw new InvalidParameterException("Lollipop rawStackTrace (almost) empty");
                                }
                            case 23:
                                int[] iArr3 = (int[]) rawStackTrace;
                                int verifyClassObjectNameMarshmallow = verifyClassObjectNameMarshmallow(Class.class);
                                if (verifyClassObjectNameMarshmallow == 0) {
                                    int length2 = iArr3.length >> 1;
                                    arrayList = new ArrayList(length2 << 1);
                                    for (int i4 = 0; i4 < length2; i4++) {
                                        long j = ((long) iArr3[i4]) & 4294967295L;
                                        arrayList.add(Long.valueOf(getArtMarshmallowDexSignature(j) | (getArtMarshmallowMethodIdx(j) << 32)));
                                        arrayList.add(Long.valueOf(((long) iArr3[length2 + i4]) & 4294967295L));
                                    }
                                    break;
                                } else {
                                    throw new IllegalStateException(String.format(Locale.US, "verifyResult: %d", new Object[]{Integer.valueOf(verifyClassObjectNameMarshmallow)}));
                                }
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                                Object[] objArr2 = (Object[]) rawStackTrace;
                                if (objArr2.length > 1) {
                                    int[] iArr4 = (int[]) objArr2[0];
                                    if (iArr4.length >= ((objArr2.length - 1) << 1)) {
                                        int length3 = iArr4.length >> 1;
                                        arrayList = new ArrayList(length3 << 1);
                                        for (int i5 = 0; i5 < length3; i5++) {
                                            Object fieldValueByReflection2 = getFieldValueByReflection(getFieldValueByReflection(objArr2[i5 + 1], "dexCache"), "dexFile");
                                            arrayList.add(Long.valueOf((fieldValueByReflection2 != null ? getArtDexSignature(((Long) fieldValueByReflection2).longValue()) : 4294967295L) | (getArtNougatOreoMethodIdx(((long) iArr4[i5]) & 4294967295L) << 32)));
                                            arrayList.add(Long.valueOf(((long) iArr4[length3 + i5]) & 4294967295L));
                                        }
                                        break;
                                    } else {
                                        throw new InvalidParameterException("Nougat/Oreo offsets not sufficient");
                                    }
                                } else {
                                    throw new InvalidParameterException("Nougat/Oreo rawStackTrace (almost) empty");
                                }
                            default:
                                C000600f.m79N("LeanStackTracer", "Unsupported Android version, not extracting raw stack trace.");
                                arrayList = null;
                                break;
                        }
                        if (arrayList == null) {
                            C000600f.m79N("LeanStackTracer", "Failed to convert rawStackTrace, probably unsupported OS");
                        } else {
                            if (C000600f.m76K()) {
                                th3.getMessage();
                                int min = Math.min(th3.getStackTrace().length, arrayList.size() >> 1);
                                for (int i6 = 0; i6 < min; i6++) {
                                    arrayList.get(i6 << 1);
                                    arrayList.get((i6 << 1) + 1);
                                }
                            }
                            arrayList3.addAll(arrayList);
                            th4 = th3;
                            th3 = th3.getCause();
                        }
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                C000600f.m79N("LeanStackTracer", "methodIDsAndOffsets empty, Shouldn't happen.");
            } else {
                arrayList2 = arrayList3;
            }
            if (arrayList2 != null) {
                C000600f.m81P("LeanStackTracer", "parseRawStackTrace= %s", arrayList2);
                return arrayList2;
            }
        }
        return arrayList2;
    }

    private static native int verifyClassObjectNameMarshmallow(Object obj);
}
