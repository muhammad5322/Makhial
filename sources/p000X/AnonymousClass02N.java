package p000X;

/* renamed from: X.02N reason: invalid class name */
public class AnonymousClass02N {
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|(2:5|(1:7)(1:8))|9|10|11|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003e */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m306B(java.lang.String... r7) {
        /*
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.ProcessBuilder r1 = new java.lang.ProcessBuilder
            r1.<init>(r7)
            r0 = 1
            java.lang.ProcessBuilder r0 = r1.redirectErrorStream(r0)
            java.lang.Process r5 = r0.start()
            java.io.OutputStream r0 = r5.getOutputStream()     // Catch:{ all -> 0x0060 }
            r0.close()     // Catch:{ all -> 0x0060 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0060 }
            java.io.InputStream r0 = r5.getInputStream()     // Catch:{ all -> 0x0060 }
            r4.<init>(r0)     // Catch:{ all -> 0x0060 }
            r2 = 0
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r3 = new char[r0]     // Catch:{ Throwable -> 0x004d }
        L_0x0028:
            r1 = 0
            r0 = 4096(0x1000, float:5.74E-42)
            int r1 = r4.read(r3, r1, r0)     // Catch:{ Throwable -> 0x004d }
            r0 = -1
            if (r1 == r0) goto L_0x0037
            r0 = 0
            r6.append(r3, r0, r1)     // Catch:{ Throwable -> 0x004d }
            goto L_0x0028
        L_0x0037:
            r4.close()     // Catch:{ all -> 0x0060 }
            r5.waitFor()     // Catch:{ InterruptedException -> 0x003e }
            goto L_0x0045
        L_0x003e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0060 }
            r0.interrupt()     // Catch:{ all -> 0x0060 }
        L_0x0045:
            r5.destroy()
            java.lang.String r0 = r6.toString()
            return r0
        L_0x004d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            if (r2 == 0) goto L_0x0058
            r4.close()     // Catch:{ Throwable -> 0x0056 }
            goto L_0x005f
        L_0x0056:
            r0 = move-exception
            goto L_0x005c
        L_0x0058:
            r4.close()     // Catch:{ all -> 0x0060 }
            goto L_0x005f
        L_0x005c:
            p000X.AnonymousClass01A.m182B(r2, r0)     // Catch:{ all -> 0x0060 }
        L_0x005f:
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            r5.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass02N.m306B(java.lang.String[]):java.lang.String");
    }
}
