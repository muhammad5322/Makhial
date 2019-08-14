package p000X;

import java.io.Closeable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.00b reason: invalid class name and case insensitive filesystem */
public final class C000200b implements Iterator, Closeable {

    /* renamed from: B */
    public final C000100a[] f103B;

    /* renamed from: C */
    public /* synthetic */ AnonymousClass00W f104C;

    /* renamed from: D */
    private C003401k f105D = null;

    /* renamed from: E */
    private int f106E = 0;

    public C000200b(AnonymousClass00W r2, C000100a[] r3) {
        this.f104C = r2;
        this.f103B = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        p000X.AnonymousClass00W.m59B(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r8 = new java.io.RandomAccessFile(r5, "rw");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (p000X.AnonymousClass00W.m60C(r8) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        p000X.AnonymousClass00W.m59B(r8);
        r1 = r10.f104C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r10.f104C.f97C.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        if (r5.exists() != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        p000X.AnonymousClass00W.m59B(r8);
        r1 = r10.f104C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r10.f104C.f97C.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006e, code lost:
        if (r8.length() != 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        r5.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        p000X.AnonymousClass00W.m59B(r8);
        r1 = r10.f104C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0078, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r10.f104C.f97C.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0080, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1 = new p000X.C003401k(r10.f104C, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008a, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008c, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008d, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        p000X.C000600f.m83R("Spool", r6, "unexpected failure opening %s: deleting and continuing scan", r5.getName());
        r5.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ac, code lost:
        p000X.AnonymousClass00W.m59B(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00af, code lost:
        if (r9 != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b3, code lost:
        monitor-enter(r10.f104C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r10.f104C.f97C.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00bd, code lost:
        p000X.AnonymousClass00W.m59B(null);
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c5, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00c8, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00cb, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00d2, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00d5, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00d7, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x00d8, code lost:
        r8 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00de  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m62B() {
        /*
            r10 = this;
        L_0x0000:
            X.01k r0 = r10.f105D
            if (r0 != 0) goto L_0x00ed
            int r1 = r10.f106E
            X.00a[] r0 = r10.f103B
            int r0 = r0.length
            if (r1 >= r0) goto L_0x00ed
            X.00a[] r2 = r10.f103B
            int r1 = r10.f106E
            int r0 = r1 + 1
            r10.f106E = r0
            r0 = r2[r1]
            r9 = 1
            r3 = 0
            r7 = 0
            java.io.File r5 = r0.f101B
            X.00W r1 = r10.f104C     // Catch:{ IOException -> 0x0095, all -> 0x00ce }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0095, all -> 0x00ce }
            X.00W r0 = r10.f104C     // Catch:{ all -> 0x0092 }
            java.util.HashSet r0 = r0.f97C     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x002d
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            p000X.AnonymousClass00W.m59B(r7)
            goto L_0x00c1
        L_0x002d:
            X.00W r0 = r10.f104C     // Catch:{ all -> 0x0092 }
            java.util.HashSet r0 = r0.f97C     // Catch:{ all -> 0x0092 }
            r0.add(r5)     // Catch:{ all -> 0x0092 }
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x008c, all -> 0x00d7 }
            java.lang.String r0 = "rw"
            r8.<init>(r5, r0)     // Catch:{ IOException -> 0x008c, all -> 0x00d7 }
            boolean r0 = p000X.AnonymousClass00W.m60C(r8)     // Catch:{ IOException -> 0x008a }
            if (r0 != 0) goto L_0x0051
            p000X.AnonymousClass00W.m59B(r8)
            X.00W r1 = r10.f104C
            monitor-enter(r1)
            X.00W r0 = r10.f104C     // Catch:{ all -> 0x00c5 }
            java.util.HashSet r0 = r0.f97C     // Catch:{ all -> 0x00c5 }
            r0.remove(r5)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c1
        L_0x0051:
            boolean r0 = r5.exists()     // Catch:{ IOException -> 0x008a }
            if (r0 != 0) goto L_0x0066
            p000X.AnonymousClass00W.m59B(r8)
            X.00W r1 = r10.f104C
            monitor-enter(r1)
            X.00W r0 = r10.f104C     // Catch:{ all -> 0x00c8 }
            java.util.HashSet r0 = r0.f97C     // Catch:{ all -> 0x00c8 }
            r0.remove(r5)     // Catch:{ all -> 0x00c8 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c1
        L_0x0066:
            long r2 = r8.length()     // Catch:{ IOException -> 0x008a }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0082
            r5.delete()     // Catch:{ IOException -> 0x008a }
            p000X.AnonymousClass00W.m59B(r8)
            X.00W r1 = r10.f104C
            monitor-enter(r1)
            X.00W r0 = r10.f104C     // Catch:{ all -> 0x00cb }
            java.util.HashSet r0 = r0.f97C     // Catch:{ all -> 0x00cb }
            r0.remove(r5)     // Catch:{ all -> 0x00cb }
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            goto L_0x00c1
        L_0x0082:
            X.01k r1 = new X.01k     // Catch:{ IOException -> 0x008a }
            X.00W r0 = r10.f104C     // Catch:{ IOException -> 0x008a }
            r1.<init>(r0, r5, r8)     // Catch:{ IOException -> 0x008a }
            goto L_0x00bd
        L_0x008a:
            r6 = move-exception
            goto L_0x0098
        L_0x008c:
            r6 = move-exception
            r8 = r7
            goto L_0x0098
        L_0x008f:
            r0 = move-exception
            r3 = 1
            goto L_0x0093
        L_0x0092:
            r0 = move-exception
        L_0x0093:
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ IOException -> 0x0095, all -> 0x00ce }
        L_0x0095:
            r6 = move-exception
            r9 = r3
            r8 = r7
        L_0x0098:
            java.lang.String r4 = "Spool"
            java.lang.String r3 = "unexpected failure opening %s: deleting and continuing scan"
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d5 }
            r1 = 0
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x00d5 }
            r2[r1] = r0     // Catch:{ all -> 0x00d5 }
            p000X.C000600f.m83R(r4, r6, r3, r2)     // Catch:{ all -> 0x00d5 }
            r5.delete()     // Catch:{ all -> 0x00d5 }
            p000X.AnonymousClass00W.m59B(r8)
            if (r9 == 0) goto L_0x00c1
            X.00W r1 = r10.f104C
            monitor-enter(r1)
            X.00W r0 = r10.f104C     // Catch:{ all -> 0x00d2 }
            java.util.HashSet r0 = r0.f97C     // Catch:{ all -> 0x00d2 }
            r0.remove(r5)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x00c1
        L_0x00bd:
            p000X.AnonymousClass00W.m59B(r7)
            r7 = r1
        L_0x00c1:
            r10.f105D = r7
            goto L_0x0000
        L_0x00c5:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c5 }
            goto L_0x00ec
        L_0x00c8:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            goto L_0x00ec
        L_0x00cb:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            goto L_0x00ec
        L_0x00ce:
            r2 = move-exception
            r9 = r3
            r8 = r7
            goto L_0x00d9
        L_0x00d2:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x00ec
        L_0x00d5:
            r2 = move-exception
            goto L_0x00d9
        L_0x00d7:
            r2 = move-exception
            r8 = r7
        L_0x00d9:
            p000X.AnonymousClass00W.m59B(r8)
            if (r9 == 0) goto L_0x00ec
            X.00W r1 = r10.f104C
            monitor-enter(r1)
            X.00W r0 = r10.f104C     // Catch:{ all -> 0x00ea }
            java.util.HashSet r0 = r0.f97C     // Catch:{ all -> 0x00ea }
            r0.remove(r5)     // Catch:{ all -> 0x00ea }
        L_0x00e8:
            monitor-exit(r1)     // Catch:{ all -> 0x00ea }
            goto L_0x00ec
        L_0x00ea:
            r2 = move-exception
            goto L_0x00e8
        L_0x00ec:
            throw r2
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C000200b.m62B():void");
    }

    /* renamed from: A */
    public final C003401k next() {
        m62B();
        if (this.f105D == null) {
            throw new NoSuchElementException();
        }
        C003401k r1 = this.f105D;
        this.f105D = null;
        return r1;
    }

    public final void close() {
        AnonymousClass00W.m59B(this.f105D);
    }

    public final boolean hasNext() {
        m62B();
        return this.f105D != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
