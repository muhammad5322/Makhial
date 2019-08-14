package com.facebook.common.stringformat;

import java.util.Formattable;
import java.util.Formatter;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;

public class StringFormatUtil {
    private static final int APPENDED_TO_OUTPUT = -3;
    public static final int FALLBACK_TO_SYSTEM = -1;
    private static final int INVALID_FORMAT_PERCENT = -101;
    private static final int NEXT_SEG_RESULT_FINISHED = -200;
    private static final int NEXT_SEG_RESULT_FINISHED_PERCENT = -201;
    public static final int NO_FORMATTING_REQUIRED = -2;
    private static final String NULL_STRING = "null";
    private static final Object[] SINGLE_ITEM_NULL_OBJECT_ARRAY = {null};
    private static final int VALID_FORMAT_PERCENT = -100;

    public static void appendFormatStrLocaleSafe(StringBuilder sb, String str, Object... objArr) {
        int doDryRunInternal = doDryRunInternal(str, -1, null, null, null, null, objArr);
        if (doDryRunInternal == -1) {
            new Formatter(sb).format(null, str, objArr);
        } else if (doDryRunInternal == -2) {
            sb.append(str);
        } else {
            sb.ensureCapacity(doDryRunInternal);
            doFormatArray(sb, str, objArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        if (r2 == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int appendIntTypeArg(java.lang.StringBuilder r3, java.lang.Object r4) {
        /*
            r1 = 4
            r2 = 0
            if (r3 != 0) goto L_0x0005
            r2 = 1
        L_0x0005:
            if (r4 != 0) goto L_0x0013
            if (r2 != 0) goto L_0x000f
            java.lang.String r0 = "null"
            r3.append(r0)
            r1 = 0
        L_0x000f:
            if (r2 != 0) goto L_0x0012
            r1 = -3
        L_0x0012:
            return r1
        L_0x0013:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x001c
            if (r2 == 0) goto L_0x002a
            r1 = 11
            goto L_0x000f
        L_0x001c:
            boolean r0 = r4 instanceof java.lang.Short
            if (r0 == 0) goto L_0x0024
            if (r2 == 0) goto L_0x002a
            r1 = 6
            goto L_0x000f
        L_0x0024:
            boolean r0 = r4 instanceof java.lang.Byte
            if (r0 == 0) goto L_0x0035
            if (r2 != 0) goto L_0x000f
        L_0x002a:
            java.lang.Number r4 = (java.lang.Number) r4
            int r0 = r4.intValue()
            r3.append(r0)
            r1 = 0
            goto L_0x000f
        L_0x0035:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0049
            if (r2 == 0) goto L_0x003e
            r1 = 20
            goto L_0x000f
        L_0x003e:
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r3.append(r0)
            r1 = 0
            goto L_0x000f
        L_0x0049:
            if (r2 == 0) goto L_0x004d
            r1 = -1
            return r1
        L_0x004d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.appendIntTypeArg(java.lang.StringBuilder, java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0026 A[EDGE_INSN: B:40:0x0026->B:12:0x0026 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int appendSegmentFormat(java.lang.StringBuilder r7, java.lang.String r8, int r9, java.lang.Object r10, boolean r11) {
        /*
            r4 = 37
            r3 = -1
            int r2 = r8.length()
            r6 = 0
            if (r7 != 0) goto L_0x000b
            r6 = 1
        L_0x000b:
            r5 = 0
        L_0x000c:
            if (r9 >= r2) goto L_0x005c
            char r0 = r8.charAt(r9)
            if (r0 != r4) goto L_0x0051
            int r1 = validateFormatPercent(r8, r9)
            r0 = -100
            if (r1 != r0) goto L_0x0026
            int r0 = r9 + 1
            char r1 = r8.charAt(r0)
            if (r11 != 0) goto L_0x0028
            if (r1 == r4) goto L_0x0028
        L_0x0026:
            r0 = -1
        L_0x0027:
            return r0
        L_0x0028:
            r0 = 115(0x73, float:1.61E-43)
            if (r1 != r0) goto L_0x0039
            int r1 = appendStringTypeArg(r7, r10)
        L_0x0030:
            r0 = 1
        L_0x0031:
            if (r1 == r3) goto L_0x0026
            if (r6 == 0) goto L_0x0036
            int r5 = r5 + r1
        L_0x0036:
            if (r0 != 0) goto L_0x005c
            goto L_0x0055
        L_0x0039:
            r0 = 100
            if (r1 != r0) goto L_0x0042
            int r1 = appendIntTypeArg(r7, r10)
            goto L_0x0030
        L_0x0042:
            if (r1 != r4) goto L_0x004e
            if (r6 != 0) goto L_0x0049
            r7.append(r4)
        L_0x0049:
            int r9 = r9 + 1
            r0 = 0
            r1 = 1
            goto L_0x0031
        L_0x004e:
            r0 = 1
            r1 = -1
            goto L_0x0031
        L_0x0051:
            if (r6 == 0) goto L_0x0058
            int r5 = r5 + 1
        L_0x0055:
            int r9 = r9 + 1
            goto L_0x000c
        L_0x0058:
            r7.append(r0)
            goto L_0x0055
        L_0x005c:
            r0 = -3
            if (r6 == 0) goto L_0x0027
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.appendSegmentFormat(java.lang.StringBuilder, java.lang.String, int, java.lang.Object, boolean):int");
    }

    private static int appendSegmentFormatArgs(StringBuilder sb, String str, int i, Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        switch (i2) {
            case FALLBACK_TO_SYSTEM /*-1*/:
                return appendSegmentFormat(sb, str, i, null, false);
            case 0:
                return appendSegmentFormat(sb, str, i, obj, true);
            case 1:
                return appendSegmentFormat(sb, str, i, obj2, true);
            case 2:
                return appendSegmentFormat(sb, str, i, obj3, true);
            case 3:
                return appendSegmentFormat(sb, str, i, obj4, true);
            default:
                throw new AssertionError();
        }
    }

    private static int appendStringTypeArg(StringBuilder sb, Object obj) {
        boolean z = false;
        if (sb == null) {
            z = true;
        }
        if (!(obj instanceof Formattable)) {
            String str = null;
            if (obj instanceof String) {
                str = (String) obj;
            } else if (obj != null) {
                str = obj.toString();
            }
            if (str == null) {
                str = NULL_STRING;
            }
            if (z) {
                return str.length();
            }
            sb.append(str);
            return APPENDED_TO_OUTPUT;
        } else if (z) {
            return -1;
        } else {
            throw new AssertionError();
        }
    }

    public static int doDryRun(String str) {
        return doFormatArgs(null, str, 0, null, null, null, null);
    }

    public static int doDryRun(String str, Object obj) {
        return doFormatArgs(null, str, 1, obj, null, null, null);
    }

    public static int doDryRun(String str, Object obj, Object obj2) {
        return doFormatArgs(null, str, 2, obj, obj2, null, null);
    }

    public static int doDryRun(String str, Object obj, Object obj2, Object obj3) {
        return doFormatArgs(null, str, 3, obj, obj2, obj3, null);
    }

    public static int doDryRun(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return doFormatArgs(null, str, 4, obj, obj2, obj3, obj4);
    }

    public static int doDryRun(String str, Object[] objArr) {
        return doFormatArray(null, str, objArr);
    }

    private static int doDryRunInternal(String str, int i, Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        switch (i) {
            case 0:
                return doDryRun(str);
            case 1:
                return doDryRun(str, obj);
            case 2:
                return doDryRun(str, obj, obj2);
            case 3:
                return doDryRun(str, obj, obj2, obj3);
            case 4:
                return doDryRun(str, obj, obj2, obj3, obj4);
            default:
                return doDryRun(str, objArr);
        }
    }

    private static String doFallbackToSystem(String str, Object... objArr) {
        try {
            return String.format(null, str, objArr);
        } catch (MissingFormatArgumentException | UnknownFormatConversionException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append(": ");
            sb.append(str);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        if (r7 == NEXT_SEG_RESULT_FINISHED) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        if (r7 == NEXT_SEG_RESULT_FINISHED_PERCENT) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        return processRemainingString(r5, r13, r7, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (r3 != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
        return APPENDED_TO_OUTPUT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int doFormatArgs(java.lang.StringBuilder r12, java.lang.String r13, int r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r7 = 0
            r4 = 0
            r3 = 0
            r5 = r12
            if (r12 != 0) goto L_0x0007
            r3 = 1
        L_0x0007:
            r2 = 0
            if (r14 != 0) goto L_0x000b
            r2 = -1
        L_0x000b:
            r12 = r2
        L_0x000c:
            r1 = r4
            r6 = r13
            if (r12 >= r14) goto L_0x0038
            r8 = r15
            r9 = r16
            r11 = r18
            r10 = r17
            int r1 = appendSegmentFormatArgs(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            if (r1 != r0) goto L_0x0020
            r1 = -1
        L_0x001f:
            return r1
        L_0x0020:
            int r1 = r1 + r4
            if (r3 != 0) goto L_0x0024
            r1 = r4
        L_0x0024:
            int r7 = getNextFormatSegmentIndex(r13, r7)
            if (r12 != r2) goto L_0x0032
            r0 = -200(0xffffffffffffff38, float:NaN)
            if (r7 != r0) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            r1 = -2
            return r1
        L_0x0032:
            if (r7 < 0) goto L_0x0038
            int r12 = r12 + 1
            r4 = r1
            goto L_0x000c
        L_0x0038:
            r0 = -200(0xffffffffffffff38, float:NaN)
            if (r7 == r0) goto L_0x0045
            r0 = -201(0xffffffffffffff37, float:NaN)
            if (r7 == r0) goto L_0x0045
            int r1 = processRemainingString(r5, r13, r7, r1, r3)
            return r1
        L_0x0045:
            if (r3 != 0) goto L_0x001f
            r1 = -3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.doFormatArgs(java.lang.StringBuilder, java.lang.String, int, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        if (r6 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        if (r5 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        return -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        if (r2 == NEXT_SEG_RESULT_FINISHED) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        if (r2 == NEXT_SEG_RESULT_FINISHED_PERCENT) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004d, code lost:
        return processRemainingString(r9, r10, r2, r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        if (r6 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0051, code lost:
        return APPENDED_TO_OUTPUT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int doFormatArray(java.lang.StringBuilder r9, java.lang.String r10, java.lang.Object... r11) {
        /*
            r2 = 0
            r8 = 0
            r6 = 0
            if (r9 != 0) goto L_0x0006
            r6 = 1
        L_0x0006:
            r7 = 0
            if (r11 == 0) goto L_0x000c
            int r0 = r11.length
            if (r0 != 0) goto L_0x000f
        L_0x000c:
            java.lang.Object[] r11 = SINGLE_ITEM_NULL_OBJECT_ARRAY
            r7 = 1
        L_0x000f:
            r5 = 0
            int r4 = r11.length
            r0 = 0
        L_0x0012:
            if (r0 >= r4) goto L_0x003a
            r3 = r11[r0]
            r1 = 0
            if (r7 != 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            int r3 = appendSegmentFormat(r9, r10, r2, r3, r1)
            r1 = -1
            if (r3 != r1) goto L_0x0023
            r3 = -1
        L_0x0022:
            return r3
        L_0x0023:
            int r3 = r3 + r8
            if (r6 != 0) goto L_0x0027
            r3 = r8
        L_0x0027:
            int r2 = getNextFormatSegmentIndex(r10, r2)
            r1 = -200(0xffffffffffffff38, float:NaN)
            if (r2 == r1) goto L_0x003b
            r1 = -201(0xffffffffffffff37, float:NaN)
            if (r2 != r1) goto L_0x0035
            r5 = 1
            goto L_0x003b
        L_0x0035:
            int r0 = r0 + 1
            r5 = 1
            r8 = r3
            goto L_0x0012
        L_0x003a:
            r3 = r8
        L_0x003b:
            if (r6 == 0) goto L_0x0041
            if (r5 != 0) goto L_0x0041
            r3 = -2
            return r3
        L_0x0041:
            r0 = -200(0xffffffffffffff38, float:NaN)
            if (r2 == r0) goto L_0x004e
            r0 = -201(0xffffffffffffff37, float:NaN)
            if (r2 == r0) goto L_0x004e
            int r3 = processRemainingString(r9, r10, r2, r3, r6)
            return r3
        L_0x004e:
            if (r6 != 0) goto L_0x0022
            r3 = -3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.doFormatArray(java.lang.StringBuilder, java.lang.String, java.lang.Object[]):int");
    }

    private static String fallbackToSystem(String str, int i, Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        switch (i) {
            case 0:
                return doFallbackToSystem(str, new Object[0]);
            case 1:
                return doFallbackToSystem(str, obj);
            case 2:
                return doFallbackToSystem(str, obj, obj2);
            case 3:
                return doFallbackToSystem(str, obj, obj2, obj3);
            case 4:
                return doFallbackToSystem(str, obj, obj2, obj3, obj4);
            default:
                return doFallbackToSystem(str, objArr);
        }
    }

    public static String formatBytes(long j) {
        String str;
        float f;
        if (((float) j) < 1024.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append("B");
            return sb.toString();
        }
        if (((float) j) < 1048576.0f) {
            str = "%.2fKB";
            f = ((float) j) / 1024.0f;
        } else if (((float) j) < 1.07374182E9f) {
            str = "%.2fMB";
            f = ((float) j) / 1048576.0f;
        } else {
            str = "%.2fGB";
            f = ((float) j) / 1.07374182E9f;
        }
        return formatStrLocaleSafe(str, (Object) Float.valueOf(f));
    }

    public static String formatStrLocaleSafe(String str) {
        return formatStrLocaleSafeInner(str, 0, null, null, null, null, null);
    }

    public static String formatStrLocaleSafe(String str, Object obj) {
        return formatStrLocaleSafeInner(str, 1, obj, null, null, null, null);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2) {
        return formatStrLocaleSafeInner(str, 2, obj, obj2, null, null, null);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3) {
        return formatStrLocaleSafeInner(str, 3, obj, obj2, obj3, null, null);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return formatStrLocaleSafeInner(str, 4, obj, obj2, obj3, obj4, null);
    }

    public static String formatStrLocaleSafe(String str, Object... objArr) {
        return formatStrLocaleSafeInner(str, -1, null, null, null, null, objArr);
    }

    private static String formatStrLocaleSafeInner(String str, int i, Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        int doDryRunInternal = doDryRunInternal(str, i, obj, obj2, obj3, obj4, objArr);
        if (doDryRunInternal == -1) {
            str = fallbackToSystem(str, i, obj, obj2, obj3, obj4, objArr);
        } else if (doDryRunInternal != -2) {
            StringBuilder sb = new StringBuilder(doDryRunInternal);
            if (i == -1) {
                doFormatArray(sb, str, objArr);
            } else {
                doFormatArgs(sb, str, i, obj, obj2, obj3, obj4);
            }
            return sb.toString();
        }
        return str;
    }

    private static int getNextFormatSegmentIndex(String str, int i) {
        int length = str.length();
        boolean z = false;
        while (i < length) {
            if (str.charAt(i) == '%' && validateFormatPercent(str, i) == VALID_FORMAT_PERCENT) {
                int i2 = i + 2;
                if (str.charAt(i + 1) != '%') {
                    return i2;
                }
                i++;
                z = true;
            }
            i++;
        }
        return z ? NEXT_SEG_RESULT_FINISHED_PERCENT : NEXT_SEG_RESULT_FINISHED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int processRemainingString(java.lang.StringBuilder r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
            r4 = 37
            int r3 = r6.length()
            r2 = 0
        L_0x0007:
            if (r7 >= r3) goto L_0x0028
            char r1 = r6.charAt(r7)
            if (r1 != r4) goto L_0x001d
            int r0 = r7 + 1
            if (r3 <= r0) goto L_0x002d
            int r0 = r7 + 1
            char r0 = r6.charAt(r0)
            if (r0 != r4) goto L_0x002d
            int r7 = r7 + 1
        L_0x001d:
            if (r9 == 0) goto L_0x0024
            int r2 = r2 + 1
        L_0x0021:
            int r7 = r7 + 1
            goto L_0x0007
        L_0x0024:
            r5.append(r1)
            goto L_0x0021
        L_0x0028:
            int r2 = r2 + r8
            if (r9 != 0) goto L_0x0030
            r2 = -3
            return r2
        L_0x002d:
            if (r9 == 0) goto L_0x0031
            r2 = -1
        L_0x0030:
            return r2
        L_0x0031:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.processRemainingString(java.lang.StringBuilder, java.lang.String, int, int, boolean):int");
    }

    private static int validateFormatPercent(String str, int i) {
        int i2 = i + 1;
        if (str.length() > i2) {
            char charAt = str.charAt(i2);
            if (charAt == 's' || charAt == 'd' || charAt == '%') {
                return VALID_FORMAT_PERCENT;
            }
        }
        return INVALID_FORMAT_PERCENT;
    }
}
