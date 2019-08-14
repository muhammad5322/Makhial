package p000X;

import java.io.File;

/* renamed from: X.02n reason: invalid class name and case insensitive filesystem */
public class C006202n implements Runnable {
    public static final String __redex_internal_original_name = "com.facebook.soloader.UnpackingSoSource$1";

    /* renamed from: B */
    private /* synthetic */ C002100w f387B;

    /* renamed from: C */
    private /* synthetic */ byte[] f388C;

    /* renamed from: D */
    private /* synthetic */ File f389D;

    /* renamed from: E */
    private /* synthetic */ AnonymousClass004 f390E;

    /* renamed from: F */
    private /* synthetic */ C007002v f391F;

    /* renamed from: G */
    private /* synthetic */ File f392G;

    public C006202n(C002100w r1, File file, byte[] bArr, C007002v r4, File file2, AnonymousClass004 r6) {
        this.f387B = r1;
        this.f389D = file;
        this.f388C = bArr;
        this.f391F = r4;
        this.f392G = file2;
        this.f390E = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        p000X.AnonymousClass01A.m182B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        throw r1;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m321B(java.io.File r4) {
        /*
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x002c
            java.io.File[] r2 = r4.listFiles()
            if (r2 != 0) goto L_0x0020
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "cannot list directory "
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L_0x0020:
            r1 = 0
        L_0x0021:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x005d
            r0 = r2[r1]
            m321B(r0)
            int r1 = r1 + 1
            goto L_0x0021
        L_0x002c:
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "_lock"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x005d
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile
            java.lang.String r0 = "r"
            r3.<init>(r4, r0)
            r2 = 0
            java.io.FileDescriptor r0 = r3.getFD()     // Catch:{ Throwable -> 0x0048 }
            r0.sync()     // Catch:{ Throwable -> 0x0048 }
            goto L_0x005a
        L_0x0048:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0056
            r3.close()     // Catch:{ Throwable -> 0x0051 }
            goto L_0x0059
        L_0x0051:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r2, r0)
            goto L_0x0059
        L_0x0056:
            r3.close()
        L_0x0059:
            throw r1
        L_0x005a:
            r3.close()
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C006202n.m321B(java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        p000X.AnonymousClass01A.m182B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r2 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        p000X.AnonymousClass01A.m182B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0089 }
            java.io.File r1 = r5.f389D     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "rw"
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0089 }
            byte[] r0 = r5.f388C     // Catch:{ Throwable -> 0x0076 }
            r3.write(r0)     // Catch:{ Throwable -> 0x0076 }
            long r0 = r3.getFilePointer()     // Catch:{ Throwable -> 0x0076 }
            r3.setLength(r0)     // Catch:{ Throwable -> 0x0076 }
            r3.close()     // Catch:{ all -> 0x0089 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0089 }
            X.00w r0 = r5.f387B     // Catch:{ all -> 0x0089 }
            java.io.File r1 = r0.f139C     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "dso_manifest"
            r4.<init>(r1, r0)     // Catch:{ all -> 0x0089 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "rw"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0089 }
            X.02v r4 = r5.f391F     // Catch:{ Throwable -> 0x0068 }
            r0 = 1
            r3.writeByte(r0)     // Catch:{ Throwable -> 0x0068 }
            X.02r[] r0 = r4.f405B     // Catch:{ Throwable -> 0x0068 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0068 }
            r3.writeInt(r0)     // Catch:{ Throwable -> 0x0068 }
            r1 = 0
        L_0x0038:
            X.02r[] r0 = r4.f405B     // Catch:{ Throwable -> 0x0068 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0068 }
            if (r1 >= r0) goto L_0x0052
            X.02r[] r0 = r4.f405B     // Catch:{ Throwable -> 0x0068 }
            r0 = r0[r1]     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r0 = r0.f400C     // Catch:{ Throwable -> 0x0068 }
            r3.writeUTF(r0)     // Catch:{ Throwable -> 0x0068 }
            X.02r[] r0 = r4.f405B     // Catch:{ Throwable -> 0x0068 }
            r0 = r0[r1]     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r0 = r0.f399B     // Catch:{ Throwable -> 0x0068 }
            r3.writeUTF(r0)     // Catch:{ Throwable -> 0x0068 }
            int r1 = r1 + 1
            goto L_0x0038
        L_0x0052:
            r3.close()     // Catch:{ all -> 0x0089 }
            X.00w r0 = r5.f387B     // Catch:{ all -> 0x0089 }
            java.io.File r0 = r0.f139C     // Catch:{ all -> 0x0089 }
            m321B(r0)     // Catch:{ all -> 0x0089 }
            java.io.File r1 = r5.f392G     // Catch:{ all -> 0x0089 }
            r0 = 1
            p000X.C002100w.m163G(r1, r0)     // Catch:{ all -> 0x0089 }
            X.004 r0 = r5.f390E     // Catch:{ IOException -> 0x0090 }
            r0.close()     // Catch:{ IOException -> 0x0090 }
            return
        L_0x0068:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x006a }
        L_0x006a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0081
            r3.close()     // Catch:{ Throwable -> 0x0071 }
            goto L_0x0088
        L_0x0071:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r2, r0)     // Catch:{ all -> 0x0089 }
            goto L_0x0088
        L_0x0076:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            if (r2 == 0) goto L_0x0081
            r3.close()     // Catch:{ Throwable -> 0x007f }
            goto L_0x0088
        L_0x007f:
            r0 = move-exception
            goto L_0x0085
        L_0x0081:
            r3.close()     // Catch:{ all -> 0x0089 }
            goto L_0x0088
        L_0x0085:
            p000X.AnonymousClass01A.m182B(r2, r0)     // Catch:{ all -> 0x0089 }
        L_0x0088:
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            X.004 r0 = r5.f390E     // Catch:{ IOException -> 0x0090 }
            r0.close()     // Catch:{ IOException -> 0x0090 }
            throw r1     // Catch:{ IOException -> 0x0090 }
        L_0x0090:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C006202n.run():void");
    }
}
