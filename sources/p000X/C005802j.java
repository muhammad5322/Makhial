package p000X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.02j reason: invalid class name and case insensitive filesystem */
public final class C005802j implements C002701c {

    /* renamed from: B */
    private final Set f383B = new HashSet();

    /* renamed from: B */
    public static C005802j m315B() {
        return new C005802j();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002d */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m316C(java.lang.String r8, byte[] r9) {
        /*
            r7 = this;
            r4 = 9
            java.util.Set r0 = r7.f383B
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x005f
            r3 = 0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0013
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskReads()
        L_0x0013:
            r6 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            int r5 = r9.length     // Catch:{ all -> 0x0047 }
            r1 = 0
            r0 = 0
            java.io.FileDescriptor r2 = android.system.Os.open(r8, r1, r0)     // Catch:{ ErrnoException -> 0x0030 }
            r1 = 0
            int r0 = r5 + -1
            int r6 = android.system.Os.read(r2, r9, r1, r0)     // Catch:{ ErrnoException | InterruptedIOException -> 0x002d, all -> 0x0028 }
            android.system.Os.close(r2)     // Catch:{ ErrnoException -> 0x0030 }
            goto L_0x0030
        L_0x0028:
            r0 = move-exception
            android.system.Os.close(r2)     // Catch:{ ErrnoException -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x002d:
            android.system.Os.close(r2)     // Catch:{ ErrnoException -> 0x0030 }
        L_0x0030:
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r6 != r0) goto L_0x003b
            java.util.Set r0 = r7.f383B     // Catch:{ all -> 0x0047 }
            r0.add(r8)     // Catch:{ all -> 0x0047 }
            goto L_0x0054
        L_0x003b:
            if (r3 == 0) goto L_0x0060
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0060
            android.os.StrictMode$ThreadPolicy r3 = (android.os.StrictMode.ThreadPolicy) r3
            android.os.StrictMode.setThreadPolicy(r3)
            return r6
        L_0x0047:
            r1 = move-exception
            if (r3 == 0) goto L_0x0053
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0053
            android.os.StrictMode$ThreadPolicy r3 = (android.os.StrictMode.ThreadPolicy) r3
            android.os.StrictMode.setThreadPolicy(r3)
        L_0x0053:
            throw r1
        L_0x0054:
            if (r3 == 0) goto L_0x005f
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x005f
            android.os.StrictMode$ThreadPolicy r3 = (android.os.StrictMode.ThreadPolicy) r3
            android.os.StrictMode.setThreadPolicy(r3)
        L_0x005f:
            r6 = -1
        L_0x0060:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C005802j.m316C(java.lang.String, byte[]):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009f, code lost:
        if (r5[r2] != 10) goto L_0x00a1;
     */
    /* renamed from: AY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo86AY(java.lang.String r17, java.lang.String[] r18, long[] r19) {
        /*
            r16 = this;
            r3 = r17
            if (r17 == 0) goto L_0x00de
            r8 = r18
            if (r18 == 0) goto L_0x00de
            r7 = r19
            if (r19 == 0) goto L_0x00de
            int r6 = r8.length
            int r0 = r7.length
            if (r6 <= r0) goto L_0x0018
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Array lengths differ"
            r1.<init>(r0)
            throw r1
        L_0x0018:
            r2 = 0
        L_0x0019:
            if (r2 >= r6) goto L_0x0022
            r0 = 0
            r19[r2] = r0
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0022:
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r5 = new byte[r0]
            r0 = r16
            int r4 = r0.m316C(r3, r5)
            r15 = 1
            if (r4 >= 0) goto L_0x0031
            r4 = 0
            r15 = 0
        L_0x0031:
            r0 = 2048(0x800, float:2.87E-42)
            if (r4 >= r0) goto L_0x0038
            r0 = 0
            r5[r4] = r0
        L_0x0038:
            r3 = 0
            r11 = 0
        L_0x003a:
            if (r11 >= r4) goto L_0x00dd
            byte r0 = r5[r11]
            if (r0 == 0) goto L_0x00dd
            if (r3 >= r6) goto L_0x00dd
            r9 = 0
        L_0x0043:
            if (r9 >= r6) goto L_0x00bb
            r14 = r18[r9]
            r13 = r11
            r12 = 0
            int r10 = r14.length()
            r2 = 0
        L_0x004e:
            r0 = 2048(0x800, float:2.87E-42)
            if (r13 >= r0) goto L_0x0061
            if (r2 >= r10) goto L_0x0061
            byte r1 = r5[r13]
            char r0 = r14.charAt(r2)
            if (r1 != r0) goto L_0x0064
            int r13 = r13 + 1
            int r2 = r2 + 1
            goto L_0x004e
        L_0x0061:
            if (r2 != r10) goto L_0x0064
            r12 = 1
        L_0x0064:
            if (r12 == 0) goto L_0x00b8
            int r0 = r14.length()
            int r11 = r11 + r0
        L_0x006b:
            r0 = 2048(0x800, float:2.87E-42)
            if (r11 >= r0) goto L_0x0082
            byte r0 = r5[r11]
            if (r0 == 0) goto L_0x007f
            byte r1 = r5[r11]
            r0 = 32
            if (r1 == r0) goto L_0x007f
            byte r1 = r5[r11]
            r0 = 9
            if (r1 != r0) goto L_0x0082
        L_0x007f:
            int r11 = r11 + 1
            goto L_0x006b
        L_0x0082:
            r2 = r11
        L_0x0083:
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 >= r0) goto L_0x0096
            byte r1 = r5[r2]
            r0 = 48
            if (r1 < r0) goto L_0x0096
            byte r1 = r5[r2]
            r0 = 57
            if (r1 > r0) goto L_0x0096
            int r2 = r2 + 1
            goto L_0x0083
        L_0x0096:
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 >= r0) goto L_0x00a1
            byte r1 = r5[r2]
            r0 = 10
            r10 = 0
            if (r1 == r0) goto L_0x00a2
        L_0x00a1:
            r10 = 1
        L_0x00a2:
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 >= r0) goto L_0x00af
            byte r0 = r5[r2]
            if (r0 == 0) goto L_0x00af
            r0 = 0
            r5[r2] = r0
            int r2 = r2 + 1
        L_0x00af:
            long r0 = p000X.AnonymousClass02i.m314B(r5, r11)
            r19[r9] = r0
            int r3 = r3 + 1
            goto L_0x00bd
        L_0x00b8:
            int r9 = r9 + 1
            goto L_0x0043
        L_0x00bb:
            r2 = r11
            r10 = 1
        L_0x00bd:
            if (r10 == 0) goto L_0x00da
        L_0x00bf:
            if (r2 >= r4) goto L_0x00ce
            byte r0 = r5[r2]
            if (r0 == 0) goto L_0x00ce
            byte r1 = r5[r2]
            r0 = 10
            if (r1 == r0) goto L_0x00ce
            int r2 = r2 + 1
            goto L_0x00bf
        L_0x00ce:
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 >= r0) goto L_0x00da
            byte r1 = r5[r2]
            r0 = 10
            if (r1 != r0) goto L_0x00da
            int r2 = r2 + 1
        L_0x00da:
            r11 = r2
            goto L_0x003a
        L_0x00dd:
            return r15
        L_0x00de:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "Cannot pass null values"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C005802j.mo86AY(java.lang.String, java.lang.String[], long[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0031 A[SYNTHETIC] */
    /* renamed from: zW */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87zW(byte[] r19, int r20, int r21, int[] r22, java.lang.String[] r23, long[] r24) {
        /*
            r18 = this;
            r10 = r20
            r11 = r19
            int r8 = r11.length
            r17 = r22
            r0 = r17
            int r7 = r0.length
            r12 = r23
            if (r23 == 0) goto L_0x00d2
            int r6 = r12.length
        L_0x000f:
            r9 = r24
            if (r24 == 0) goto L_0x00cf
            int r5 = r9.length
        L_0x0014:
            r3 = 0
            r2 = 0
        L_0x0016:
            if (r2 >= r7) goto L_0x00d5
            r4 = r22[r2]
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x00cb
            r0 = r4 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x002a
            byte r1 = r19[r10]
            r0 = 34
            if (r1 == r0) goto L_0x00cb
            r4 = r4 & -1025(0xfffffffffffffbff, float:NaN)
        L_0x002a:
            r0 = r4 & 255(0xff, float:3.57E-43)
            char r1 = (char) r0
            r15 = r21
            if (r10 < r15) goto L_0x0033
            r0 = 0
            return r0
        L_0x0033:
            r13 = -1
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0047
            r13 = r10
        L_0x0039:
            if (r13 >= r15) goto L_0x0044
            byte r14 = r19[r13]
            r0 = 41
            if (r14 == r0) goto L_0x0044
            int r13 = r13 + 1
            goto L_0x0039
        L_0x0044:
            int r14 = r13 + 1
            goto L_0x005b
        L_0x0047:
            r0 = r4 & 1024(0x400, float:1.435E-42)
            r14 = r10
            if (r0 == 0) goto L_0x005b
        L_0x004c:
            byte r13 = r19[r14]
            r0 = 34
            if (r13 == r0) goto L_0x0057
            if (r14 >= r15) goto L_0x0057
            int r14 = r14 + 1
            goto L_0x004c
        L_0x0057:
            int r0 = r14 + 1
            r13 = r14
            r14 = r0
        L_0x005b:
            if (r14 >= r15) goto L_0x0064
            byte r0 = r19[r14]
            if (r0 == r1) goto L_0x0064
            int r14 = r14 + 1
            goto L_0x005b
        L_0x0064:
            if (r13 >= 0) goto L_0x0067
            r13 = r14
        L_0x0067:
            if (r14 >= r15) goto L_0x0078
            int r14 = r14 + 1
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0078
        L_0x006f:
            if (r14 >= r15) goto L_0x0078
            byte r0 = r19[r14]
            if (r0 != r1) goto L_0x0078
            int r14 = r14 + 1
            goto L_0x006f
        L_0x0078:
            r0 = r4 & 28672(0x7000, float:4.0178E-41)
            if (r0 == 0) goto L_0x00c6
            r16 = 0
            if (r13 >= r8) goto L_0x0082
            r16 = 1
        L_0x0082:
            if (r16 == 0) goto L_0x00b5
            byte r15 = r19[r13]
            r0 = 0
            r19[r13] = r0
        L_0x0089:
            r0 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x009a
            if (r3 >= r5) goto L_0x009a
            if (r24 == 0) goto L_0x009a
            r0 = r4 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00ae
            byte r0 = r19[r10]
            long r0 = (long) r0
            r24[r3] = r0
        L_0x009a:
            r0 = r4 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00c0
            if (r3 >= r6) goto L_0x00c0
            if (r23 == 0) goto L_0x00c0
            int r4 = r11.length
            r1 = r10
        L_0x00a4:
            int r0 = r11.length
            if (r1 >= r0) goto L_0x00b7
            byte r0 = r19[r1]
            if (r0 == 0) goto L_0x00b8
            int r1 = r1 + 1
            goto L_0x00a4
        L_0x00ae:
            long r0 = p000X.AnonymousClass02i.m314B(r11, r10)
            r24[r3] = r0
            goto L_0x009a
        L_0x00b5:
            r15 = 0
            goto L_0x0089
        L_0x00b7:
            r1 = r4
        L_0x00b8:
            java.lang.String r0 = new java.lang.String
            int r1 = r1 - r10
            r0.<init>(r11, r10, r1)
            r23[r3] = r0
        L_0x00c0:
            if (r16 == 0) goto L_0x00c4
            r19[r13] = r15
        L_0x00c4:
            int r3 = r3 + 1
        L_0x00c6:
            int r2 = r2 + 1
            r10 = r14
            goto L_0x0016
        L_0x00cb:
            int r10 = r10 + 1
            goto L_0x002a
        L_0x00cf:
            r5 = 0
            goto L_0x0014
        L_0x00d2:
            r6 = 0
            goto L_0x000f
        L_0x00d5:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C005802j.mo87zW(byte[], int, int, int[], java.lang.String[], long[]):boolean");
    }

    /* renamed from: zX */
    public final boolean mo88zX(String str, int[] iArr, String[] strArr, long[] jArr) {
        byte[] bArr = new byte[256];
        int C = m316C(str, bArr);
        if (C < 0) {
            return false;
        }
        return mo87zW(bArr, 0, C, iArr, strArr, jArr);
    }
}
