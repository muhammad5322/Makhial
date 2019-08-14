package p000X;

import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.00t reason: invalid class name and case insensitive filesystem */
public class C001800t extends C001700s {

    /* renamed from: B */
    public final int f138B;

    /* renamed from: C */
    public final File f139C;

    public C001800t(File file, int i) {
        this.f139C = file;
        this.f138B = i;
    }

    /* renamed from: B */
    public static long m153B(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m156E(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    /* renamed from: C */
    public static int m154C(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m156E(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: D */
    public static long m155D(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m156E(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* renamed from: E */
    public static void m156E(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0) {
            int read = fileChannel.read(byteBuffer, j);
            if (read == -1) {
                break;
            }
            j += (long) read;
        }
        if (byteBuffer.remaining() > 0) {
            throw new C004001q("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    /* renamed from: A */
    public int mo51A(String str, int i, ThreadPolicy threadPolicy) {
        return mo54C(str, i, this.f139C, threadPolicy);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cb, code lost:
        r4 = r4 + 1;
        r8 = ((long) r13) + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d1, code lost:
        r16 = m155D(r7, r6, 4 + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d9, code lost:
        r16 = m153B(r7, r6, 8 + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e1, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e4, code lost:
        r16 = r16 + (r20 - r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ec, code lost:
        if (r16 != 0) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ee, code lost:
        r1 = new p000X.C004001q("did not find file offset of DT_STRTAB table");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f7, code lost:
        r4 = new java.lang.String[r12];
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r22 == false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01fc, code lost:
        r12 = m155D(r7, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0201, code lost:
        r12 = m153B(r7, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0209, code lost:
        if (r12 != 1) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020b, code lost:
        if (r22 == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x020e, code lost:
        r0 = m153B(r7, r6, 8 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0216, code lost:
        r0 = m155D(r7, r6, 4 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021d, code lost:
        r0 = r0 + r16;
        r8 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0224, code lost:
        r10 = 1 + r0;
        m156E(r7, r6, 1, r0);
        r0 = (short) (r6.get() & 255);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0232, code lost:
        if (r0 == 0) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0234, code lost:
        r8.append((char) r0);
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x023a, code lost:
        r4[r5] = r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0243, code lost:
        if (r5 != Integer.MAX_VALUE) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0246, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0248, code lost:
        if (r22 == false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x024a, code lost:
        r8 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x024c, code lost:
        r8 = r8 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0251, code lost:
        if (r12 != 0) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0254, code lost:
        r8 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0257, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0259, code lost:
        r1 = new p000X.C004001q("malformed DT_NEEDED section");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0263, code lost:
        if (r5 == r4.length) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0265, code lost:
        r1 = new p000X.C004001q("malformed DT_NEEDED section");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0273, code lost:
        if (p000X.C001500q.f122B == false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0275, code lost:
        p000X.C002300y.m171C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0278, code lost:
        java.util.Arrays.toString(r4);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x027d, code lost:
        if (r3 >= r4.length) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x027f, code lost:
        r2 = r4[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0287, code lost:
        if (r2.startsWith("/") != false) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0289, code lost:
        p000X.C001500q.m147D(r2, null, r25 | 1, r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0291, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0350, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0351, code lost:
        if (r2 != null) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x035c, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x035f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0171, code lost:
        if (r20 != 0) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0183, code lost:
        r1 = new p000X.C004001q("Dynamic section string-table not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018c, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0190, code lost:
        if (((long) r4) >= r10) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x019a, code lost:
        if (m155D(r7, r6, r8) != 1) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019c, code lost:
        if (r22 == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019e, code lost:
        r18 = m155D(r7, r6, 8 + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a6, code lost:
        r18 = m153B(r7, r6, 16 + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ad, code lost:
        if (r22 == false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01af, code lost:
        r16 = m155D(r7, r6, 20 + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b7, code lost:
        r16 = m153B(r7, r6, 40 + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c0, code lost:
        if (r18 > r20) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c6, code lost:
        if (r20 >= (r16 + r18)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c8, code lost:
        if (r22 == false) goto L_0x01d9;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo54C(java.lang.String r24, int r25, java.io.File r26, android.os.StrictMode.ThreadPolicy r27) {
        /*
            r23 = this;
            java.io.File r14 = new java.io.File
            r0 = r24
            r1 = r26
            r14.<init>(r1, r0)
            boolean r0 = r14.exists()
            if (r0 != 0) goto L_0x0014
            r1.getCanonicalPath()
            r0 = 0
            return r0
        L_0x0014:
            r1.getCanonicalPath()
            r0 = r25 & 1
            r1 = r23
            if (r0 == 0) goto L_0x0025
            int r0 = r1.f138B
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0025
            r0 = 2
            return r0
        L_0x0025:
            int r0 = r1.f138B
            r0 = r0 & 1
            if (r0 == 0) goto L_0x02a2
            boolean r0 = p000X.C001500q.f122B
            if (r0 == 0) goto L_0x0049
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "SoLoader.getElfDependencies["
            r1.<init>(r0)
            java.lang.String r0 = r14.getName()
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000X.C002300y.m170B(r0)
        L_0x0049:
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ all -> 0x0299 }
            r15.<init>(r14)     // Catch:{ all -> 0x0299 }
            java.nio.channels.FileChannel r7 = r15.getChannel()     // Catch:{ all -> 0x0294 }
            r0 = 8
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0294 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0294 }
            r6.order(r0)     // Catch:{ all -> 0x0294 }
            r0 = 0
            long r2 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            r0 = 1179403647(0x464c457f, double:5.827028246E-315)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0072
            X.01q r1 = new X.01q     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "file is not ELF"
            r1.<init>(r0)     // Catch:{ all -> 0x0294 }
        L_0x0071:
            throw r1     // Catch:{ all -> 0x0294 }
        L_0x0072:
            r0 = 4
            r2 = 1
            m156E(r7, r6, r2, r0)     // Catch:{ all -> 0x0294 }
            byte r0 = r6.get()     // Catch:{ all -> 0x0294 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r1 = (short) r0     // Catch:{ all -> 0x0294 }
            r0 = 1
            r22 = 0
            if (r1 != r0) goto L_0x0086
            r22 = 1
        L_0x0086:
            r0 = 5
            r2 = 1
            m156E(r7, r6, r2, r0)     // Catch:{ all -> 0x0294 }
            byte r0 = r6.get()     // Catch:{ all -> 0x0294 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r1 = (short) r0     // Catch:{ all -> 0x0294 }
            r0 = 2
            if (r1 != r0) goto L_0x009b
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0294 }
            r6.order(r1)     // Catch:{ all -> 0x0294 }
        L_0x009b:
            if (r22 == 0) goto L_0x00a4
            r0 = 28
            long r8 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x00aa
        L_0x00a4:
            r0 = 32
            long r8 = m153B(r7, r6, r0)     // Catch:{ all -> 0x0294 }
        L_0x00aa:
            if (r22 == 0) goto L_0x00b4
            r0 = 44
            int r0 = m154C(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            long r10 = (long) r0     // Catch:{ all -> 0x0294 }
            goto L_0x00bb
        L_0x00b4:
            r0 = 56
            int r0 = m154C(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            long r10 = (long) r0     // Catch:{ all -> 0x0294 }
        L_0x00bb:
            if (r22 == 0) goto L_0x00c4
            r0 = 42
            int r13 = m154C(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x00ca
        L_0x00c4:
            r0 = 54
            int r13 = m154C(r7, r6, r0)     // Catch:{ all -> 0x0294 }
        L_0x00ca:
            r0 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00f1
            if (r22 == 0) goto L_0x00da
            r0 = 32
            long r0 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x00e0
        L_0x00da:
            r0 = 40
            long r0 = m153B(r7, r6, r0)     // Catch:{ all -> 0x0294 }
        L_0x00e0:
            if (r22 == 0) goto L_0x00ea
            r2 = 28
            long r0 = r0 + r2
            long r10 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x00f1
        L_0x00ea:
            r2 = 44
            long r0 = r0 + r2
            long r10 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
        L_0x00f1:
            r2 = 0
            r18 = 0
            r0 = r8
        L_0x00f6:
            int r4 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x011d
            long r16 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            r4 = 2
            int r4 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0105
            goto L_0x010c
        L_0x0105:
            long r4 = (long) r13     // Catch:{ all -> 0x0294 }
            long r0 = r0 + r4
            r4 = 1
            long r18 = r18 + r4
            goto L_0x00f6
        L_0x010c:
            if (r22 == 0) goto L_0x0116
            r2 = 4
            long r2 = r2 + r0
            long r2 = m155D(r7, r6, r2)     // Catch:{ all -> 0x0294 }
            goto L_0x011d
        L_0x0116:
            r2 = 8
            long r2 = r2 + r0
            long r2 = m153B(r7, r6, r2)     // Catch:{ all -> 0x0294 }
        L_0x011d:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x012c
            X.01q r1 = new X.01q     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "ELF file does not contain dynamic linking information"
            r1.<init>(r0)     // Catch:{ all -> 0x0294 }
            goto L_0x0071
        L_0x012c:
            r12 = 0
            r20 = 0
            r4 = r2
        L_0x0130:
            if (r22 == 0) goto L_0x0137
            long r18 = m155D(r7, r6, r4)     // Catch:{ all -> 0x0294 }
            goto L_0x013b
        L_0x0137:
            long r18 = m153B(r7, r6, r4)     // Catch:{ all -> 0x0294 }
        L_0x013b:
            r0 = 1
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0147
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r12 != r0) goto L_0x015f
            goto L_0x017a
        L_0x0147:
            r0 = 5
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0161
            if (r22 == 0) goto L_0x0157
            r0 = 4
            long r0 = r0 + r4
            long r20 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x0161
        L_0x0157:
            r0 = 8
            long r0 = r0 + r4
            long r20 = m153B(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x0161
        L_0x015f:
            int r12 = r12 + 1
        L_0x0161:
            if (r22 == 0) goto L_0x0174
            r16 = 8
        L_0x0165:
            long r16 = r16 + r4
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0177
            r0 = 0
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x018c
            goto L_0x0183
        L_0x0174:
            r16 = 16
            goto L_0x0165
        L_0x0177:
            r4 = r16
            goto L_0x0130
        L_0x017a:
            X.01q r1 = new X.01q     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "malformed DT_NEEDED section"
            r1.<init>(r0)     // Catch:{ all -> 0x0294 }
            goto L_0x0071
        L_0x0183:
            X.01q r1 = new X.01q     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "Dynamic section string-table not found"
            r1.<init>(r0)     // Catch:{ all -> 0x0294 }
            goto L_0x0071
        L_0x018c:
            r4 = 0
        L_0x018d:
            long r0 = (long) r4     // Catch:{ all -> 0x0294 }
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e1
            long r16 = m155D(r7, r6, r8)     // Catch:{ all -> 0x0294 }
            r0 = 1
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01cb
            if (r22 == 0) goto L_0x01a6
            r0 = 8
            long r0 = r0 + r8
            long r18 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x01ad
        L_0x01a6:
            r0 = 16
            long r0 = r0 + r8
            long r18 = m153B(r7, r6, r0)     // Catch:{ all -> 0x0294 }
        L_0x01ad:
            if (r22 == 0) goto L_0x01b7
            r0 = 20
            long r0 = r0 + r8
            long r16 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x01be
        L_0x01b7:
            r0 = 40
            long r0 = r0 + r8
            long r16 = m153B(r7, r6, r0)     // Catch:{ all -> 0x0294 }
        L_0x01be:
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x01cb
            long r16 = r16 + r18
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x01cb
            if (r22 == 0) goto L_0x01d9
            goto L_0x01d1
        L_0x01cb:
            long r0 = (long) r13     // Catch:{ all -> 0x0294 }
            long r0 = r0 + r8
            int r4 = r4 + 1
            r8 = r0
            goto L_0x018d
        L_0x01d1:
            r0 = 4
            long r0 = r0 + r8
            long r16 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x01e4
        L_0x01d9:
            r0 = 8
            long r0 = r0 + r8
            long r16 = m153B(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x01e4
        L_0x01e1:
            r16 = 0
            goto L_0x01e8
        L_0x01e4:
            long r20 = r20 - r18
            long r16 = r16 + r20
        L_0x01e8:
            r0 = 0
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01f7
            X.01q r1 = new X.01q     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "did not find file offset of DT_STRTAB table"
            r1.<init>(r0)     // Catch:{ all -> 0x0294 }
            goto L_0x0071
        L_0x01f7:
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ all -> 0x0294 }
            r5 = 0
        L_0x01fa:
            if (r22 == 0) goto L_0x0201
            long r12 = m155D(r7, r6, r2)     // Catch:{ all -> 0x0294 }
            goto L_0x0205
        L_0x0201:
            long r12 = m153B(r7, r6, r2)     // Catch:{ all -> 0x0294 }
        L_0x0205:
            r0 = 1
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0248
            if (r22 == 0) goto L_0x020e
            goto L_0x0216
        L_0x020e:
            r0 = 8
            long r0 = r0 + r2
            long r0 = m153B(r7, r6, r0)     // Catch:{ all -> 0x0294 }
            goto L_0x021d
        L_0x0216:
            r0 = 4
            long r0 = r0 + r2
            long r0 = m155D(r7, r6, r0)     // Catch:{ all -> 0x0294 }
        L_0x021d:
            long r0 = r0 + r16
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0294 }
            r8.<init>()     // Catch:{ all -> 0x0294 }
        L_0x0224:
            r10 = 1
            long r10 = r10 + r0
            r9 = 1
            m156E(r7, r6, r9, r0)     // Catch:{ all -> 0x0294 }
            byte r0 = r6.get()     // Catch:{ all -> 0x0294 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0     // Catch:{ all -> 0x0294 }
            if (r0 == 0) goto L_0x023a
            char r0 = (char) r0     // Catch:{ all -> 0x0294 }
            r8.append(r0)     // Catch:{ all -> 0x0294 }
            r0 = r10
            goto L_0x0224
        L_0x023a:
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0294 }
            r4[r5] = r0     // Catch:{ all -> 0x0294 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r0) goto L_0x0246
            goto L_0x0259
        L_0x0246:
            int r5 = r5 + 1
        L_0x0248:
            if (r22 == 0) goto L_0x0254
            r8 = 8
        L_0x024c:
            long r8 = r8 + r2
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0257
            goto L_0x0262
        L_0x0254:
            r8 = 16
            goto L_0x024c
        L_0x0257:
            r2 = r8
            goto L_0x01fa
        L_0x0259:
            X.01q r1 = new X.01q     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "malformed DT_NEEDED section"
            r1.<init>(r0)     // Catch:{ all -> 0x0294 }
            goto L_0x0071
        L_0x0262:
            int r0 = r4.length     // Catch:{ all -> 0x0294 }
            if (r5 == r0) goto L_0x026e
            X.01q r1 = new X.01q     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "malformed DT_NEEDED section"
            r1.<init>(r0)     // Catch:{ all -> 0x0294 }
            goto L_0x0071
        L_0x026e:
            r15.close()     // Catch:{ all -> 0x0299 }
            boolean r0 = p000X.C001500q.f122B
            if (r0 == 0) goto L_0x0278
            p000X.C002300y.m171C()
        L_0x0278:
            java.util.Arrays.toString(r4)
            r3 = 0
        L_0x027c:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x02a2
            r2 = r4[r3]
            java.lang.String r0 = "/"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L_0x0291
            r1 = r25 | 1
            r0 = 0
            r5 = r27
            p000X.C001500q.m147D(r2, r0, r1, r5)
        L_0x0291:
            int r3 = r3 + 1
            goto L_0x027c
        L_0x0294:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x0299 }
            throw r0     // Catch:{ all -> 0x0299 }
        L_0x0299:
            r1 = move-exception
            boolean r0 = p000X.C001500q.f122B
            if (r0 == 0) goto L_0x02a1
            p000X.C002300y.m171C()
        L_0x02a1:
            throw r1
        L_0x02a2:
            X.00r r5 = p000X.C001500q.f129I     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            java.lang.String r3 = r14.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            r2 = 1
            r4 = 0
            boolean r0 = r5.f133B     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            if (r0 == 0) goto L_0x0384
            r1 = r25 & 4
            r0 = 4
            if (r1 == r0) goto L_0x02b4
            r2 = 0
        L_0x02b4:
            if (r2 == 0) goto L_0x02b9
            java.lang.String r8 = r5.f134C     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            goto L_0x02bb
        L_0x02b9:
            java.lang.String r8 = r5.f135D     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
        L_0x02bb:
            java.lang.Runtime r7 = r5.f137F     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x02eb }
            monitor-enter(r7)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x02eb }
            java.lang.reflect.Method r6 = r5.f136E     // Catch:{ all -> 0x02e8 }
            java.lang.Runtime r5 = r5.f137F     // Catch:{ all -> 0x02e8 }
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x02e8 }
            r0 = 0
            r2[r0] = r3     // Catch:{ all -> 0x02e8 }
            r1 = 1
            java.lang.Class<X.00q> r0 = p000X.C001500q.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ all -> 0x02e8 }
            r2[r1] = r0     // Catch:{ all -> 0x02e8 }
            r0 = 2
            r2[r0] = r8     // Catch:{ all -> 0x02e8 }
            java.lang.Object r1 = r6.invoke(r5, r2)     // Catch:{ all -> 0x02e8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x02e8 }
            if (r1 == 0) goto L_0x02e2
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x02e5 }
            r0.<init>(r1)     // Catch:{ all -> 0x02e5 }
            throw r0     // Catch:{ all -> 0x02e5 }
        L_0x02e2:
            monitor-exit(r7)     // Catch:{ all -> 0x02e5 }
            goto L_0x0387
        L_0x02e5:
            r0 = move-exception
            r4 = r1
            goto L_0x02e9
        L_0x02e8:
            r0 = move-exception
        L_0x02e9:
            monitor-exit(r7)     // Catch:{ all -> 0x02e8 }
            throw r0     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x02eb }
        L_0x02eb:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = "Error: Cannot load "
            r1.<init>(r0)     // Catch:{ all -> 0x0300 }
            r1.append(r3)     // Catch:{ all -> 0x0300 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0300 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0300 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0300 }
            throw r0     // Catch:{ all -> 0x0300 }
        L_0x0300:
            r12 = move-exception
            if (r4 == 0) goto L_0x0383
            java.lang.String r7 = "SoLoader"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            java.lang.String r0 = "Error when loading lib: "
            r6.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            r6.append(r4)     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            java.lang.String r0 = " lib hash: "
            r6.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0366, SecurityException -> 0x0360, NoSuchAlgorithmException -> 0x036c }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0366, SecurityException -> 0x0360, NoSuchAlgorithmException -> 0x036c }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r0)     // Catch:{ IOException -> 0x0366, SecurityException -> 0x0360, NoSuchAlgorithmException -> 0x036c }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0366, SecurityException -> 0x0360, NoSuchAlgorithmException -> 0x036c }
            r10.<init>(r1)     // Catch:{ IOException -> 0x0366, SecurityException -> 0x0360, NoSuchAlgorithmException -> 0x036c }
            r2 = 0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch:{ Throwable -> 0x034e }
        L_0x0329:
            int r1 = r10.read(r3)     // Catch:{ Throwable -> 0x034e }
            if (r1 <= 0) goto L_0x0334
            r0 = 0
            r11.update(r3, r0, r1)     // Catch:{ Throwable -> 0x034e }
            goto L_0x0329
        L_0x0334:
            java.lang.String r9 = "%32x"
            r0 = 1
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x034e }
            r4 = 0
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ Throwable -> 0x034e }
            r1 = 1
            byte[] r0 = r11.digest()     // Catch:{ Throwable -> 0x034e }
            r3.<init>(r1, r0)     // Catch:{ Throwable -> 0x034e }
            r5[r4] = r3     // Catch:{ Throwable -> 0x034e }
            java.lang.String r0 = java.lang.String.format(r9, r5)     // Catch:{ Throwable -> 0x034e }
            r10.close()     // Catch:{ IOException -> 0x0366, SecurityException -> 0x0360, NoSuchAlgorithmException -> 0x036c }
            goto L_0x0371
        L_0x034e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0350 }
        L_0x0350:
            r1 = move-exception
            if (r2 == 0) goto L_0x035c
            r10.close()     // Catch:{ Throwable -> 0x0357 }
            goto L_0x035f
        L_0x0357:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r2, r0)     // Catch:{ IOException -> 0x0366, SecurityException -> 0x0360, NoSuchAlgorithmException -> 0x036c }
            goto L_0x035f
        L_0x035c:
            r10.close()     // Catch:{ IOException -> 0x0366, SecurityException -> 0x0360, NoSuchAlgorithmException -> 0x036c }
        L_0x035f:
            throw r1     // Catch:{ IOException -> 0x0366, SecurityException -> 0x0360, NoSuchAlgorithmException -> 0x036c }
        L_0x0360:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            goto L_0x0371
        L_0x0366:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            goto L_0x0371
        L_0x036c:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
        L_0x0371:
            r6.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            java.lang.String r0 = " search path is "
            r6.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            r6.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            java.lang.String r0 = r6.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
            android.util.Log.e(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
        L_0x0383:
            throw r12     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
        L_0x0384:
            java.lang.System.load(r3)     // Catch:{ UnsatisfiedLinkError -> 0x0389 }
        L_0x0387:
            r0 = 1
            return r0
        L_0x0389:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "bad ELF magic"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0398
            r0 = 3
            return r0
        L_0x0398:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C001800t.mo54C(java.lang.String, int, java.io.File, android.os.StrictMode$ThreadPolicy):int");
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f139C.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f139C.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.f138B);
        sb.append(']');
        return sb.toString();
    }
}
