package p000X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.OverlappingFileLockException;
import java.util.HashSet;

/* renamed from: X.00W reason: invalid class name */
public final class AnonymousClass00W {

    /* renamed from: B */
    public final File f96B;

    /* renamed from: C */
    public final HashSet f97C = new HashSet();

    public AnonymousClass00W(File file) {
        this.f96B = file;
    }

    /* renamed from: B */
    public static void m59B(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: C */
    public static boolean m60C(RandomAccessFile randomAccessFile) {
        try {
            return randomAccessFile.getChannel().tryLock(0, Long.MAX_VALUE, false) != null;
        } catch (OverlappingFileLockException unused) {
            return false;
        } catch (IOException e) {
            String message = e.getMessage();
            if (message != null && (message.contains(": EAGAIN (") || message.contains(": errno 11 ("))) {
                return false;
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x00d1, code lost:
        m59B(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x00d4, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x00d5, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x00d6, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x00d8, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x00d9, code lost:
        r0 = r4;
        r4 = null;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x00e4, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x00e5, code lost:
        r2 = r4;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x00e7, code lost:
        if (r4 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x00e9, code lost:
        r4.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x00ec, code lost:
        m59B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x00ef, code lost:
        if (r2 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x00f1, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r9.f97C.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x00f9, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x00fb, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r4.exists() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        m59B(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r9.f97C.remove(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r11 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        if (r11.exists() == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r7 = new java.io.RandomAccessFile(r11, "rw");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005d, code lost:
        if (m60C(r7) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
        if (r11.renameTo(r4) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0066, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0067, code lost:
        if (r1 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0069, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0070, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0071, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        p000X.C000600f.m83R("Spool", r6, "error using donor file %s; falling back to regular path", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        m59B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0083, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        m59B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0088, code lost:
        r7 = null;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008a, code lost:
        if (r7 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r7 = new java.io.RandomAccessFile(r4, "rw");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0097, code lost:
        if (m60C(r7) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0099, code lost:
        r4.delete();
        m59B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x009f, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r9.f97C.remove(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00a6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00a7, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00aa, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00ac, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ad, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00af, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00b0, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00b2, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00b7, code lost:
        if (r4.exists() != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00b9, code lost:
        if (r1 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00bb, code lost:
        r1.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00be, code lost:
        m59B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00c1, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r9.f97C.remove(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x00c8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00c9, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r0 = new p000X.C002601b(r9, r4, r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x008c A[SYNTHETIC, Splitter:B:63:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00b9 A[Catch:{ all -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00cc A[SYNTHETIC, Splitter:B:98:0x00cc] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x0084=Splitter:B:57:0x0084, B:54:0x007f=Splitter:B:54:0x007f} */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000X.C002601b mo27A(java.lang.String r10, java.io.File r11) {
        /*
            r9 = this;
            r1 = 1
            r2 = 0
            java.lang.String r0 = "/"
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = "."
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = ".."
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00fc
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00e0 }
            java.io.File r0 = r9.f96B     // Catch:{ all -> 0x00e0 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00e0 }
            monitor-enter(r9)     // Catch:{ all -> 0x00e0 }
            java.util.HashSet r0 = r9.f97C     // Catch:{ all -> 0x00dd }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x002f
            monitor-exit(r9)     // Catch:{ all -> 0x00dd }
            m59B(r2)
            return r2
        L_0x002f:
            java.util.HashSet r0 = r9.f97C     // Catch:{ all -> 0x00dd }
            r0.add(r4)     // Catch:{ all -> 0x00dd }
            monitor-exit(r9)     // Catch:{ all -> 0x00dd }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x004a
            m59B(r2)
            monitor-enter(r9)
            java.util.HashSet r0 = r9.f97C     // Catch:{ all -> 0x0046 }
            r0.remove(r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r9)     // Catch:{ all -> 0x0046 }
            return r2
        L_0x0046:
            r3 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0046 }
            goto L_0x00fb
        L_0x004a:
            if (r11 == 0) goto L_0x0088
            boolean r0 = r11.exists()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x0088
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            java.lang.String r0 = "rw"
            r7.<init>(r11, r0)     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            boolean r0 = m60C(r7)     // Catch:{ Exception -> 0x006b }
            if (r0 == 0) goto L_0x0066
            boolean r0 = r11.renameTo(r4)     // Catch:{ Exception -> 0x006b }
            if (r0 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 == 0) goto L_0x007f
            r1 = r7
            goto L_0x008a
        L_0x006b:
            r6 = move-exception
            goto L_0x0072
        L_0x006d:
            r0 = move-exception
            r7 = r2
            goto L_0x0084
        L_0x0070:
            r6 = move-exception
            r7 = r2
        L_0x0072:
            java.lang.String r5 = "Spool"
            java.lang.String r3 = "error using donor file %s; falling back to regular path"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0083 }
            r0 = 0
            r1[r0] = r11     // Catch:{ all -> 0x0083 }
            p000X.C000600f.m83R(r5, r6, r3, r1)     // Catch:{ all -> 0x0083 }
        L_0x007f:
            m59B(r7)     // Catch:{ all -> 0x00d8 }
            goto L_0x0088
        L_0x0083:
            r0 = move-exception
        L_0x0084:
            m59B(r7)     // Catch:{ all -> 0x00d8 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x0088:
            r7 = r2
            r1 = r2
        L_0x008a:
            if (r7 != 0) goto L_0x00b2
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "rw"
            r7.<init>(r4, r0)     // Catch:{ all -> 0x00af }
            boolean r0 = m60C(r7)     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x00aa
            r4.delete()
            m59B(r7)
            monitor-enter(r9)
            java.util.HashSet r0 = r9.f97C     // Catch:{ all -> 0x00a7 }
            r0.remove(r4)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r9)     // Catch:{ all -> 0x00a7 }
            return r2
        L_0x00a7:
            r3 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00a7 }
            goto L_0x00fb
        L_0x00aa:
            r1 = r4
            goto L_0x00b3
        L_0x00ac:
            r3 = move-exception
            r2 = r4
            goto L_0x00e7
        L_0x00af:
            r3 = move-exception
            r7 = r1
            goto L_0x00d9
        L_0x00b2:
            r1 = r2
        L_0x00b3:
            boolean r0 = r4.exists()     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00cc
            if (r1 == 0) goto L_0x00be
            r1.delete()
        L_0x00be:
            m59B(r7)
            monitor-enter(r9)
            java.util.HashSet r0 = r9.f97C     // Catch:{ all -> 0x00c9 }
            r0.remove(r4)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r9)     // Catch:{ all -> 0x00c9 }
            return r2
        L_0x00c9:
            r3 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00c9 }
            goto L_0x00fb
        L_0x00cc:
            X.01b r0 = new X.01b     // Catch:{ all -> 0x00e4 }
            r0.<init>(r9, r4, r7)     // Catch:{ all -> 0x00e4 }
            m59B(r2)
            return r0
        L_0x00d5:
            r3 = move-exception
            r7 = r2
            goto L_0x00d9
        L_0x00d8:
            r3 = move-exception
        L_0x00d9:
            r0 = r4
            r4 = r2
            r2 = r0
            goto L_0x00e7
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00dd }
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r3 = move-exception
            r7 = r2
            r4 = r2
            goto L_0x00e7
        L_0x00e4:
            r3 = move-exception
            r2 = r4
            r4 = r1
        L_0x00e7:
            if (r4 == 0) goto L_0x00ec
            r4.delete()
        L_0x00ec:
            m59B(r7)
            if (r2 == 0) goto L_0x00fb
            monitor-enter(r9)
            java.util.HashSet r0 = r9.f97C     // Catch:{ all -> 0x00f9 }
            r0.remove(r2)     // Catch:{ all -> 0x00f9 }
        L_0x00f7:
            monitor-exit(r9)     // Catch:{ all -> 0x00f9 }
            goto L_0x00fb
        L_0x00f9:
            r3 = move-exception
            goto L_0x00f7
        L_0x00fb:
            throw r3
        L_0x00fc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "illegal spool file name: "
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass00W.mo27A(java.lang.String, java.io.File):X.01b");
    }
}
