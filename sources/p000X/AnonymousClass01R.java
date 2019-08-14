package p000X;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.01R reason: invalid class name */
public class AnonymousClass01R extends LinkedHashMap<String, String> {

    /* renamed from: F */
    private static final char[] f211F = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: B */
    public ArrayList f212B;

    /* renamed from: C */
    public Throwable f213C;

    /* renamed from: D */
    public Map f214D = new LinkedHashMap();

    /* renamed from: E */
    public boolean f215E;

    public AnonymousClass01R() {
    }

    public AnonymousClass01R(Map map) {
        try {
            mo77C(map, true, (Writer) null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: B */
    public static Writer m215B(OutputStream outputStream) {
        try {
            return new OutputStreamWriter(outputStream, "ISO8859_1");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static void m216C(Writer writer, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        int length = str.length() + str2.length() + 1;
        StringBuilder sb = new StringBuilder(length + (length / 5));
        m217D((Appendable) sb, str, true);
        sb.append('=');
        m217D((Appendable) sb, str2, false);
        sb.append("\n");
        writer.write(sb.toString());
        writer.flush();
    }

    /* renamed from: D */
    private static void m217D(Appendable appendable, String str, boolean z) {
        int i = 0;
        int length = str.length();
        if (!z && length > 0 && str.charAt(0) == ' ') {
            appendable.append("\\ ");
            i = 1;
        }
        while (i < length) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case 9:
                    appendable.append("\\t");
                    break;
                case 10:
                    appendable.append("\\n");
                    break;
                case 12:
                    appendable.append("\\f");
                    break;
                case 13:
                    appendable.append("\\r");
                    break;
                default:
                    if ((z && charAt == ' ') || charAt == '\\' || charAt == '#' || charAt == '!' || charAt == ':') {
                        appendable.append('\\');
                    }
                    if (charAt >= ' ' && charAt <= '~') {
                        appendable.append(charAt);
                        break;
                    } else {
                        appendable.append("\\u");
                        char[] cArr = f211F;
                        appendable.append(cArr[(charAt >>> 12) & 15]);
                        appendable.append(cArr[(charAt >>> 8) & 15]);
                        appendable.append(cArr[(charAt >>> 4) & 15]);
                        appendable.append(cArr[charAt & 15]);
                        break;
                    }
            }
            i++;
        }
    }

    /* renamed from: A */
    public final String mo75A(String str) {
        return (String) super.get(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x010d, code lost:
        r5 = new java.lang.String(r8, 0, r3);
        put(r5.substring(0, r2), r5.substring(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x011f, code lost:
        r2 = -1;
        r3 = 0;
        r12 = true;
        r11 = r7;
        r5 = 0;
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0149, code lost:
        if (r5 != 2) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x014c, code lost:
        if (r6 > 4) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x014e, code lost:
        r1 = new java.lang.IllegalArgumentException("luni.08");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0157, code lost:
        if (r2 != -1) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0159, code lost:
        if (r3 <= 0) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x015b, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x015c, code lost:
        if (r2 < 0) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x015e, code lost:
        r1 = new java.lang.String(r10, 0, r3);
        r3 = r1.substring(0, r2);
        r2 = r1.substring(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x016e, code lost:
        if (r5 != 1) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0170, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r2);
        r1.append("\u0000");
        r2 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0181, code lost:
        put(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c3, code lost:
        if (java.lang.Character.isWhitespace(r1) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c6, code lost:
        if (r5 != 3) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c8, code lost:
        r5 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c9, code lost:
        if (r3 == 0) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00cb, code lost:
        if (r3 == r2) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ce, code lost:
        if (r5 == 5) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d1, code lost:
        if (r2 != -1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d3, code lost:
        r10 = r8;
        r11 = r7;
        r5 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00d9, code lost:
        if (r5 == 5) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00dc, code lost:
        if (r5 != 3) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00de, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00fc, code lost:
        if (r5 == 3) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00fe, code lost:
        r10 = r8;
        r11 = r7;
        r5 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0103, code lost:
        if (r3 > 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0105, code lost:
        if (r3 != 0) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0107, code lost:
        if (r2 != 0) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x010a, code lost:
        if (r2 != -1) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x010c, code lost:
        r2 = r3;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo76B(java.io.InputStream r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ all -> 0x018a }
            r3.<init>(r14)     // Catch:{ all -> 0x018a }
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.mark(r0)     // Catch:{ all -> 0x018a }
            r2 = 0
        L_0x000d:
            int r0 = r3.read()     // Catch:{ all -> 0x018a }
            byte r1 = (byte) r0     // Catch:{ all -> 0x018a }
            r0 = -1
            if (r1 == r0) goto L_0x0026
            r0 = 35
            if (r1 == r0) goto L_0x0026
            r0 = 10
            if (r1 == r0) goto L_0x0026
            r0 = 61
            if (r1 == r0) goto L_0x0026
            r0 = 21
            if (r1 != r0) goto L_0x000d
            r2 = 1
        L_0x0026:
            r3.reset()     // Catch:{ all -> 0x018a }
            if (r2 != 0) goto L_0x0033
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "ISO8859-1"
            r1.<init>(r3, r0)     // Catch:{ all -> 0x018a }
            goto L_0x0038
        L_0x0033:
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x018a }
            r1.<init>(r3)     // Catch:{ all -> 0x018a }
        L_0x0038:
            r4 = r13
            monitor-enter(r4)     // Catch:{ all -> 0x018a }
            r0 = 40
            char[] r10 = new char[r0]     // Catch:{ all -> 0x0187 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ all -> 0x0187 }
            r9.<init>(r1)     // Catch:{ all -> 0x0187 }
            r12 = 1
            r2 = -1
            r3 = 0
            r6 = 0
            r11 = 0
            r5 = 0
        L_0x0049:
            int r1 = r9.read()     // Catch:{ all -> 0x0187 }
            r0 = -1
            if (r1 == r0) goto L_0x0148
            if (r1 == 0) goto L_0x0148
            char r1 = (char) r1     // Catch:{ all -> 0x0187 }
            int r0 = r10.length     // Catch:{ all -> 0x0187 }
            if (r3 != r0) goto L_0x0061
            int r0 = r10.length     // Catch:{ all -> 0x0187 }
            int r0 = r0 << 1
            char[] r8 = new char[r0]     // Catch:{ all -> 0x0187 }
            r7 = 0
            r0 = 0
            java.lang.System.arraycopy(r10, r7, r8, r0, r3)     // Catch:{ all -> 0x0187 }
            goto L_0x0062
        L_0x0061:
            r8 = r10
        L_0x0062:
            r0 = 2
            if (r5 != r0) goto L_0x0090
            r0 = 16
            int r7 = java.lang.Character.digit(r1, r0)     // Catch:{ all -> 0x0187 }
            if (r7 < 0) goto L_0x0078
            int r0 = r11 << 4
            int r7 = r7 + r0
            int r6 = r6 + 1
            r0 = 4
            if (r6 >= r0) goto L_0x007e
            r11 = r7
            r10 = r8
            goto L_0x0049
        L_0x0078:
            r0 = 4
            if (r6 > r0) goto L_0x007d
            goto L_0x0140
        L_0x007d:
            r7 = r11
        L_0x007e:
            int r5 = r3 + 1
            char r0 = (char) r7     // Catch:{ all -> 0x0187 }
            r8[r3] = r0     // Catch:{ all -> 0x0187 }
            r0 = 10
            if (r1 == r0) goto L_0x0092
            r0 = 133(0x85, float:1.86E-43)
            if (r1 == r0) goto L_0x0092
            r3 = r5
            r11 = r7
            r5 = 0
            r10 = r8
            goto L_0x0049
        L_0x0090:
            r7 = r11
            goto L_0x0094
        L_0x0092:
            r3 = r5
            r5 = 0
        L_0x0094:
            r0 = 1
            if (r5 != r0) goto L_0x00b0
            r5 = 0
            switch(r1) {
                case 10: goto L_0x00fe;
                case 13: goto L_0x00ed;
                case 98: goto L_0x00ad;
                case 102: goto L_0x00aa;
                case 110: goto L_0x00a7;
                case 114: goto L_0x00a4;
                case 116: goto L_0x00a1;
                case 117: goto L_0x00e7;
                case 133: goto L_0x00fe;
                default: goto L_0x009b;
            }     // Catch:{ all -> 0x0187 }
        L_0x009b:
            r0 = 4
            if (r5 != r0) goto L_0x00e0
            r5 = 0
            r2 = r3
            goto L_0x00e0
        L_0x00a1:
            r1 = 9
            goto L_0x009b
        L_0x00a4:
            r1 = 13
            goto L_0x009b
        L_0x00a7:
            r1 = 10
            goto L_0x009b
        L_0x00aa:
            r1 = 12
            goto L_0x009b
        L_0x00ad:
            r1 = 8
            goto L_0x009b
        L_0x00b0:
            switch(r1) {
                case 10: goto L_0x00fb;
                case 13: goto L_0x0103;
                case 33: goto L_0x00bc;
                case 35: goto L_0x00bc;
                case 58: goto L_0x00b4;
                case 61: goto L_0x00b4;
                case 92: goto L_0x00f2;
                case 133: goto L_0x0103;
                default: goto L_0x00b3;
            }     // Catch:{ all -> 0x0187 }
        L_0x00b3:
            goto L_0x00bf
        L_0x00b4:
            r0 = -1
            if (r2 != r0) goto L_0x00bf
            r2 = r3
            r10 = r8
            r11 = r7
            r5 = 0
            goto L_0x0049
        L_0x00bc:
            if (r12 == 0) goto L_0x00bf
            goto L_0x0138
        L_0x00bf:
            boolean r0 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x00d8
            r0 = 3
            if (r5 != r0) goto L_0x00c9
            r5 = 5
        L_0x00c9:
            if (r3 == 0) goto L_0x0134
            if (r3 == r2) goto L_0x0134
            r0 = 5
            if (r5 == r0) goto L_0x0134
            r0 = -1
            if (r2 != r0) goto L_0x00d8
            r10 = r8
            r11 = r7
            r5 = 4
            goto L_0x0049
        L_0x00d8:
            r0 = 5
            if (r5 == r0) goto L_0x00de
            r0 = 3
            if (r5 != r0) goto L_0x009b
        L_0x00de:
            r5 = 0
            goto L_0x009b
        L_0x00e0:
            int r0 = r3 + 1
            r8[r3] = r1     // Catch:{ all -> 0x0187 }
            r3 = r0
            r12 = 0
            goto L_0x0134
        L_0x00e7:
            r11 = 0
            r10 = r8
            r5 = 2
            r6 = 0
            goto L_0x0049
        L_0x00ed:
            r10 = r8
            r11 = r7
            r5 = 3
            goto L_0x0049
        L_0x00f2:
            r0 = 4
            if (r5 != r0) goto L_0x00f6
            r2 = r3
        L_0x00f6:
            r10 = r8
            r11 = r7
            r5 = 1
            goto L_0x0049
        L_0x00fb:
            r0 = 3
            if (r5 != r0) goto L_0x0103
        L_0x00fe:
            r10 = r8
            r11 = r7
            r5 = 5
            goto L_0x0049
        L_0x0103:
            if (r3 > 0) goto L_0x0109
            if (r3 != 0) goto L_0x011f
            if (r2 != 0) goto L_0x011f
        L_0x0109:
            r0 = -1
            if (r2 != r0) goto L_0x010d
            r2 = r3
        L_0x010d:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0187 }
            r0 = 0
            r5.<init>(r8, r0, r3)     // Catch:{ all -> 0x0187 }
            r0 = 0
            java.lang.String r1 = r5.substring(r0, r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r5.substring(r2)     // Catch:{ all -> 0x0187 }
            r13.put(r1, r0)     // Catch:{ all -> 0x0187 }
        L_0x011f:
            r2 = -1
            r3 = 0
            r12 = 1
            r11 = r7
            r5 = 0
            r10 = r8
            goto L_0x0049
        L_0x0127:
            char r1 = (char) r1     // Catch:{ all -> 0x0187 }
            r0 = 13
            if (r1 == r0) goto L_0x0134
            r0 = 10
            if (r1 == r0) goto L_0x0134
            r0 = 133(0x85, float:1.86E-43)
            if (r1 != r0) goto L_0x0138
        L_0x0134:
            r10 = r8
            r11 = r7
            goto L_0x0049
        L_0x0138:
            int r1 = r9.read()     // Catch:{ all -> 0x0187 }
            r0 = -1
            if (r1 == r0) goto L_0x0134
            goto L_0x0127
        L_0x0140:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "luni.09"
            r1.<init>(r0)     // Catch:{ all -> 0x0187 }
            goto L_0x0155
        L_0x0148:
            r0 = 2
            if (r5 != r0) goto L_0x0156
            r0 = 4
            if (r6 > r0) goto L_0x0156
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "luni.08"
            r1.<init>(r0)     // Catch:{ all -> 0x0187 }
        L_0x0155:
            throw r1     // Catch:{ all -> 0x0187 }
        L_0x0156:
            r0 = -1
            if (r2 != r0) goto L_0x015c
            if (r3 <= 0) goto L_0x015c
            r2 = r3
        L_0x015c:
            if (r2 < 0) goto L_0x0184
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0187 }
            r0 = 0
            r1.<init>(r10, r0, r3)     // Catch:{ all -> 0x0187 }
            r0 = 0
            java.lang.String r3 = r1.substring(r0, r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r1.substring(r2)     // Catch:{ all -> 0x0187 }
            r0 = 1
            if (r5 != r0) goto L_0x0181
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r1.<init>()     // Catch:{ all -> 0x0187 }
            r1.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "\u0000"
            r1.append(r0)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0187 }
        L_0x0181:
            r13.put(r3, r2)     // Catch:{ all -> 0x0187 }
        L_0x0184:
            monitor-exit(r4)     // Catch:{ all -> 0x018a }
            monitor-exit(r13)
            return
        L_0x0187:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x018a }
            throw r0     // Catch:{ all -> 0x018a }
        L_0x018a:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass01R.mo76B(java.io.InputStream):void");
    }

    /* renamed from: C */
    public final void mo77C(Map map, boolean z, Writer writer) {
        for (String str : map.keySet()) {
            String str2 = (String) map.get(str);
            if (str2 != null && (z || get(str) == null)) {
                mo79E(str, str2, writer);
            }
        }
        if (map instanceof AnonymousClass01R) {
            for (Entry entry : ((AnonymousClass01R) map).f214D.entrySet()) {
                if (!this.f214D.containsKey(entry.getKey())) {
                    this.f214D.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* renamed from: D */
    public final void mo78D(Map map, String str, Writer writer) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            mo79E(str, str2, writer);
        }
    }

    /* renamed from: E */
    public final void mo79E(String str, String str2, Writer writer) {
        if (!this.f215E) {
            put(str, str2);
        }
        if (writer != null) {
            m216C(writer, str, str2);
        }
    }
}
