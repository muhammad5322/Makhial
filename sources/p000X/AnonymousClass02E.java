package p000X;

import android.app.ActivityManager;

/* renamed from: X.02E reason: invalid class name */
public class AnonymousClass02E extends Thread {
    public static final String __redex_internal_original_name = "com.facebook.acra.anr.ProcessAnrErrorMonitor$MonitorThread";

    /* renamed from: B */
    public final ActivityManager f344B;

    /* renamed from: C */
    public boolean f345C;

    /* renamed from: D */
    public final long f346D;

    /* renamed from: E */
    public volatile C003701n f347E;

    /* renamed from: F */
    public final Object f348F = new Object();

    /* renamed from: G */
    public /* synthetic */ C004601w f349G;

    /* renamed from: H */
    private final long f350H;

    /* renamed from: I */
    private boolean f351I;

    public AnonymousClass02E(C004601w r2, ActivityManager activityManager, C003701n r4, long j, long j2) {
        this.f349G = r2;
        super("ProcessAnrErrorMonitorThread");
        this.f344B = activityManager;
        this.f347E = r4;
        this.f346D = j;
        this.f350H = j2;
        this.f345C = true;
    }

    /* renamed from: B */
    public static /* synthetic */ void m302B(AnonymousClass02E r2) {
        synchronized (r2.f348F) {
            r2.f351I = true;
            r2.f348F.notifyAll();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:98|99|100|101) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r12.f347E == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        if (r12.f347E == null) goto L_0x003c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0154 */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0055 A[EDGE_INSN: B:112:0x0055->B:37:0x0055 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0162 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a A[SYNTHETIC, Splitter:B:18:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0095 A[Catch:{ RuntimeException -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r10 = 0
            r5 = 0
            long r0 = r12.f350H
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x000d
            X.01n r0 = r12.f347E
            if (r0 != 0) goto L_0x005d
        L_0x000d:
            long r2 = r12.f350H
            java.lang.Object r4 = r12.f348F
            monitor-enter(r4)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
            boolean r0 = r12.f351I     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0021
            goto L_0x001f
        L_0x001b:
            X.01n r0 = r12.f347E     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0021
        L_0x001f:
            r9 = 1
            goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            boolean r8 = r12.f351I     // Catch:{ all -> 0x0057 }
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0057 }
        L_0x0028:
            if (r9 == 0) goto L_0x0055
            java.lang.Object r0 = r12.f348F     // Catch:{ InterruptedException -> 0x002f }
            r0.wait(r2)     // Catch:{ InterruptedException -> 0x002f }
        L_0x002f:
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            boolean r0 = r12.f351I     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x003e
            goto L_0x003c
        L_0x0038:
            X.01n r0 = r12.f347E     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r9 = 1
            goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            boolean r8 = r12.f351I     // Catch:{ all -> 0x0057 }
            if (r9 == 0) goto L_0x0028
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            long r2 = r12.f350H     // Catch:{ all -> 0x0057 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0057 }
            long r0 = r0 - r6
            long r2 = r2 - r0
            r0 = 1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0028
        L_0x0055:
            monitor-exit(r4)     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0057 }
            goto L_0x0165
        L_0x005b:
            if (r8 != 0) goto L_0x0162
        L_0x005d:
            X.02D r4 = new X.02D
            r4.<init>()
            r4.f342B = r5
            r4.f343C = r5
        L_0x0066:
            r8 = 2
            r6 = 1
            r5 = 0
            X.01w r3 = r12.f349G     // Catch:{ RuntimeException -> 0x00a4 }
            android.app.ActivityManager r0 = r12.f344B     // Catch:{ RuntimeException -> 0x00a4 }
            java.util.List r0 = r0.getProcessesInErrorState()     // Catch:{ RuntimeException -> 0x00a4 }
            if (r0 == 0) goto L_0x00a2
            java.util.Iterator r2 = r0.iterator()     // Catch:{ RuntimeException -> 0x00a4 }
        L_0x0077:
            boolean r0 = r2.hasNext()     // Catch:{ RuntimeException -> 0x00a4 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r7 = r2.next()     // Catch:{ RuntimeException -> 0x00a4 }
            android.app.ActivityManager$ProcessErrorStateInfo r7 = (android.app.ActivityManager.ProcessErrorStateInfo) r7     // Catch:{ RuntimeException -> 0x00a4 }
            java.lang.String r1 = r3.f315F     // Catch:{ RuntimeException -> 0x00a4 }
            java.lang.String r0 = r7.processName     // Catch:{ RuntimeException -> 0x00a4 }
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00a4 }
            if (r0 == 0) goto L_0x0077
            int r0 = r7.condition     // Catch:{ RuntimeException -> 0x00a4 }
            if (r0 != r8) goto L_0x0077
        L_0x0091:
            boolean r0 = r12.f345C     // Catch:{ RuntimeException -> 0x00a4 }
            if (r0 == 0) goto L_0x00f0
            r0 = 0
            r12.f345C = r0     // Catch:{ RuntimeException -> 0x00a4 }
            X.01w r2 = r12.f349G     // Catch:{ RuntimeException -> 0x00a4 }
            java.lang.Integer r1 = p000X.AnonymousClass01P.f183C     // Catch:{ RuntimeException -> 0x00a4 }
            X.01n r0 = r12.f347E     // Catch:{ RuntimeException -> 0x00a4 }
            r2.mo117C(r1, r0)     // Catch:{ RuntimeException -> 0x00a4 }
            goto L_0x00f0
        L_0x00a2:
            r7 = 0
            goto L_0x0091
        L_0x00a4:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x0166
            X.01w r2 = r12.f349G
            java.lang.Integer r1 = p000X.AnonymousClass01P.f205Y
            goto L_0x00d0
        L_0x00b2:
            if (r1 != 0) goto L_0x00d7
            boolean r0 = r4.f342B
            if (r0 != 0) goto L_0x00d7
            int r0 = r4.f343C
            int r0 = r0 + 1
            r4.f343C = r0
            X.01w r0 = r12.f349G
            int r0 = r0.f313D
            if (r0 <= 0) goto L_0x0118
            int r1 = r4.f343C
            X.01w r0 = r12.f349G
            int r0 = r0.f313D
            if (r1 < r0) goto L_0x0118
            X.01w r2 = r12.f349G
            java.lang.Integer r1 = p000X.AnonymousClass01P.f202V
        L_0x00d0:
            X.01n r0 = r12.f347E
            r2.mo117C(r1, r0)
            r0 = 0
            goto L_0x0119
        L_0x00d7:
            int r0 = r4.f343C
            int r0 = r0 + 1
            r4.f343C = r0
            X.01w r0 = r12.f349G
            int r0 = r0.f312C
            if (r0 <= 0) goto L_0x0118
            int r1 = r4.f343C
            X.01w r0 = r12.f349G
            int r0 = r0.f312C
            if (r1 < r0) goto L_0x0118
            X.01w r2 = r12.f349G
            java.lang.Integer r1 = p000X.AnonymousClass01P.f203W
            goto L_0x00d0
        L_0x00f0:
            r1 = 0
            if (r7 == 0) goto L_0x00f4
            r1 = 1
        L_0x00f4:
            if (r1 == 0) goto L_0x011f
            boolean r0 = r4.f342B
            if (r0 != 0) goto L_0x011f
            r4.f342B = r6
            r4.f343C = r5
            java.lang.String r3 = "ProcessAnrErrorMonitor"
            java.lang.String r2 = "ANR detected Short msg: %s Tag: %s"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = r7.shortMsg
            r1[r5] = r0
            java.lang.String r0 = r7.tag
            r1[r6] = r0
            p000X.C000600f.m81P(r3, r2, r1)
            X.01w r2 = r12.f349G
            java.lang.Integer r1 = p000X.AnonymousClass01P.f195O
            X.01n r0 = r12.f347E
            r2.mo117C(r1, r0)
        L_0x0118:
            r0 = 1
        L_0x0119:
            if (r0 == 0) goto L_0x0162
            java.lang.Object r3 = r12.f348F
            monitor-enter(r3)
            goto L_0x0144
        L_0x011f:
            if (r1 != 0) goto L_0x00b2
            boolean r0 = r4.f342B
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = "ProcessAnrErrorMonitor"
            java.lang.String r0 = "On error cleared"
            p000X.C000600f.m79N(r1, r0)
            X.01w r2 = r12.f349G
            java.lang.Integer r1 = p000X.AnonymousClass01P.f184D
            X.01n r0 = r12.f347E
            r2.mo117C(r1, r0)
            X.01w r0 = r12.f349G
            boolean r0 = r0.f311B
            if (r0 == 0) goto L_0x013f
            r4.f342B = r5
            r4.f343C = r5
        L_0x013f:
            X.01w r0 = r12.f349G
            boolean r0 = r0.f311B
            goto L_0x0119
        L_0x0144:
            boolean r1 = r12.f351I     // Catch:{ all -> 0x0163 }
            boolean r0 = r12.f351I     // Catch:{ all -> 0x0163 }
            if (r0 != 0) goto L_0x0156
            java.lang.Object r2 = r12.f348F     // Catch:{ InterruptedException -> 0x0154 }
            X.01w r0 = r12.f349G     // Catch:{ InterruptedException -> 0x0154 }
            int r0 = r0.f314E     // Catch:{ InterruptedException -> 0x0154 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0154 }
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0154 }
        L_0x0154:
            boolean r1 = r12.f351I     // Catch:{ all -> 0x0163 }
        L_0x0156:
            monitor-exit(r3)     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x0066
            X.01w r2 = r12.f349G
            java.lang.Integer r1 = p000X.AnonymousClass01P.f204X
            X.01n r0 = r12.f347E
            r2.mo117C(r1, r0)
        L_0x0162:
            return
        L_0x0163:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0163 }
        L_0x0165:
            throw r0
        L_0x0166:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass02E.run():void");
    }
}
