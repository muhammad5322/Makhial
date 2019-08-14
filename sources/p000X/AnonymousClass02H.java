package p000X;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.02H reason: invalid class name */
public final class AnonymousClass02H extends C006302o {

    /* renamed from: B */
    public final ZipEntry f356B;

    /* renamed from: C */
    public final C005102b[] f357C;

    /* renamed from: D */
    public final ZipFile f358D;

    /* renamed from: E */
    public final /* synthetic */ AnonymousClass012 f359E;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
        r9.toArray(new java.lang.String[r9.size()]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0108, code lost:
        if (r10 == null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        r2 = r11.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0119, code lost:
        if (r2.hasNext() == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        ((p000X.C005102b) r2.next()).f378C = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0125, code lost:
        r2 = r16;
        r2.f357C = (p000X.C005102b[]) r5.toArray(new p000X.C005102b[r5.size()]);
        r2.f356B = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013b, code lost:
        if (r10 != null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013d, code lost:
        if (r2 != null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0148, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass02H(p000X.AnonymousClass012 r17) {
        /*
            r16 = this;
            r2 = r16
            r4 = r17
            r2.f359E = r4
            r16.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String[] r13 = p000X.C001400p.m143E()
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile
            java.io.File r0 = r4.f157E
            r3.<init>(r0)
            java.lang.String r0 = r4.f154B     // Catch:{ all -> 0x0154 }
            java.util.zip.ZipEntry r1 = r3.getEntry(r0)     // Catch:{ all -> 0x0154 }
            java.lang.String r0 = r4.f155C     // Catch:{ all -> 0x0154 }
            java.util.zip.ZipEntry r4 = r3.getEntry(r0)     // Catch:{ all -> 0x0154 }
            if (r1 == 0) goto L_0x014c
            if (r4 == 0) goto L_0x014c
            java.io.InputStream r10 = r3.getInputStream(r1)     // Catch:{ all -> 0x0154 }
            r2 = 0
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet     // Catch:{ Throwable -> 0x0138 }
            r9.<init>()     // Catch:{ Throwable -> 0x0138 }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0138 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0138 }
            r0.<init>(r10)     // Catch:{ Throwable -> 0x0138 }
            r12.<init>(r0)     // Catch:{ Throwable -> 0x0138 }
            android.text.TextUtils$SimpleStringSplitter r8 = new android.text.TextUtils$SimpleStringSplitter     // Catch:{ Throwable -> 0x0138 }
            r0 = 32
            r8.<init>(r0)     // Catch:{ Throwable -> 0x0138 }
        L_0x0049:
            java.lang.String r7 = r12.readLine()     // Catch:{ Throwable -> 0x0138 }
            if (r7 == 0) goto L_0x00ff
            int r0 = r7.length()     // Catch:{ Throwable -> 0x0138 }
            if (r0 == 0) goto L_0x0049
            r6 = 0
            r14 = 0
            r15 = 0
            r8.setString(r7)     // Catch:{ Throwable -> 0x0138 }
            boolean r0 = r8.hasNext()     // Catch:{ Throwable -> 0x0138 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r6 = r8.next()     // Catch:{ Throwable -> 0x0138 }
            boolean r0 = r8.hasNext()     // Catch:{ Throwable -> 0x0138 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r14 = r8.next()     // Catch:{ Throwable -> 0x0138 }
            boolean r0 = r8.hasNext()     // Catch:{ Throwable -> 0x0138 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r15 = r8.next()     // Catch:{ Throwable -> 0x0138 }
        L_0x0079:
            if (r6 == 0) goto L_0x00e6
            if (r14 == 0) goto L_0x00e6
            if (r15 == 0) goto L_0x00e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0138 }
            java.lang.String r0 = "assets/lib/"
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0138 }
            r1.append(r6)     // Catch:{ Throwable -> 0x0138 }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x0138 }
            java.util.zip.ZipEntry r0 = r3.getEntry(r0)     // Catch:{ Throwable -> 0x0138 }
            if (r0 != 0) goto L_0x0049
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ Throwable -> 0x0138 }
            r0 = 47
            int r1 = r6.indexOf(r0)     // Catch:{ Throwable -> 0x0138 }
            r0 = -1
            if (r1 != r0) goto L_0x00b9
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x0138 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0138 }
            java.lang.String r0 = "illegal line in compressed metadata: ["
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0138 }
            r1.append(r7)     // Catch:{ Throwable -> 0x0138 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ Throwable -> 0x0138 }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x0138 }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x0138 }
            goto L_0x00fe
        L_0x00b9:
            r0 = 0
            java.lang.String r0 = r6.substring(r0, r1)     // Catch:{ Throwable -> 0x0138 }
            int r1 = r1 + 1
            java.lang.String r7 = r6.substring(r1)     // Catch:{ Throwable -> 0x0138 }
            int r6 = p000X.C001400p.m141C(r13, r0)     // Catch:{ Throwable -> 0x0138 }
            X.02b r1 = new X.02b     // Catch:{ Throwable -> 0x0138 }
            r1.<init>(r7, r15, r14, r6)     // Catch:{ Throwable -> 0x0138 }
            r5.add(r1)     // Catch:{ Throwable -> 0x0138 }
            if (r6 < 0) goto L_0x0049
            r9.add(r0)     // Catch:{ Throwable -> 0x0138 }
            java.lang.Object r0 = r11.get(r7)     // Catch:{ Throwable -> 0x0138 }
            X.02b r0 = (p000X.C005102b) r0     // Catch:{ Throwable -> 0x0138 }
            if (r0 == 0) goto L_0x00e1
            int r0 = r0.f377B     // Catch:{ Throwable -> 0x0138 }
            if (r6 >= r0) goto L_0x0049
        L_0x00e1:
            r11.put(r7, r1)     // Catch:{ Throwable -> 0x0138 }
            goto L_0x0049
        L_0x00e6:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x0138 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0138 }
            java.lang.String r0 = "illegal line in compressed metadata: ["
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0138 }
            r1.append(r7)     // Catch:{ Throwable -> 0x0138 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ Throwable -> 0x0138 }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x0138 }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x0138 }
        L_0x00fe:
            throw r4     // Catch:{ Throwable -> 0x0138 }
        L_0x00ff:
            int r0 = r9.size()     // Catch:{ Throwable -> 0x0138 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x0138 }
            r9.toArray(r0)     // Catch:{ Throwable -> 0x0138 }
            if (r10 == 0) goto L_0x010d
            r10.close()     // Catch:{ all -> 0x0154 }
        L_0x010d:
            java.util.Collection r0 = r11.values()     // Catch:{ all -> 0x0154 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0154 }
        L_0x0115:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x0125
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0154 }
            X.02b r1 = (p000X.C005102b) r1     // Catch:{ all -> 0x0154 }
            r0 = 1
            r1.f378C = r0     // Catch:{ all -> 0x0154 }
            goto L_0x0115
        L_0x0125:
            int r0 = r5.size()     // Catch:{ all -> 0x0154 }
            X.02b[] r0 = new p000X.C005102b[r0]     // Catch:{ all -> 0x0154 }
            java.lang.Object[] r0 = r5.toArray(r0)     // Catch:{ all -> 0x0154 }
            X.02b[] r0 = (p000X.C005102b[]) r0     // Catch:{ all -> 0x0154 }
            r2 = r16
            r2.f357C = r0     // Catch:{ all -> 0x0154 }
            r2.f356B = r4     // Catch:{ all -> 0x0154 }
            goto L_0x0151
        L_0x0138:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x013a }
        L_0x013a:
            r1 = move-exception
            if (r10 == 0) goto L_0x014b
            if (r2 == 0) goto L_0x0148
            r10.close()     // Catch:{ Throwable -> 0x0143 }
            goto L_0x014b
        L_0x0143:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r2, r0)     // Catch:{ all -> 0x0154 }
            goto L_0x014b
        L_0x0148:
            r10.close()     // Catch:{ all -> 0x0154 }
        L_0x014b:
            throw r1     // Catch:{ all -> 0x0154 }
        L_0x014c:
            r0 = 0
            X.02b[] r0 = new p000X.C005102b[r0]     // Catch:{ all -> 0x0154 }
            r2.f357C = r0     // Catch:{ all -> 0x0154 }
        L_0x0151:
            r2.f358D = r3     // Catch:{ all -> 0x0154 }
            return
        L_0x0154:
            r0 = move-exception
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass02H.<init>(X.012):void");
    }

    /* renamed from: A */
    public final C007002v mo126A() {
        return new C007002v(this.f357C);
    }

    /* renamed from: B */
    public final C006802t mo127B() {
        return this.f356B == null ? new AnonymousClass02A() : new AnonymousClass02O(this);
    }

    public final void close() {
        this.f358D.close();
    }
}
