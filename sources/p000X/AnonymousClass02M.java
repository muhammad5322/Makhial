package p000X;

/* renamed from: X.02M reason: invalid class name */
public class AnonymousClass02M {
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        p000X.AnonymousClass01A.m182B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2 != null) goto L_0x0025;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m305B(byte[] r5) {
        /*
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream
            r3.<init>(r4)
            r2 = 0
            r1 = 0
            int r0 = r5.length     // Catch:{ Throwable -> 0x0020 }
            r3.write(r5, r1, r0)     // Catch:{ Throwable -> 0x0020 }
            r3.finish()     // Catch:{ Throwable -> 0x0020 }
            byte[] r1 = r4.toByteArray()     // Catch:{ Throwable -> 0x0020 }
            r0 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ Throwable -> 0x0020 }
            r3.close()
            return r0
        L_0x0020:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r1 = move-exception
            if (r2 == 0) goto L_0x0029
            r3.close()     // Catch:{ Throwable -> 0x002d }
            goto L_0x0031
        L_0x0029:
            r3.close()
            goto L_0x0031
        L_0x002d:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r2, r0)
        L_0x0031:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass02M.m305B(byte[]):java.lang.String");
    }
}
