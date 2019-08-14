package p000X;

import android.os.Looper;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.01v reason: invalid class name and case insensitive filesystem */
public class C004501v extends C004101r implements C003701n {

    /* renamed from: I */
    private static C004501v f303I;

    /* renamed from: B */
    public boolean f304B;

    /* renamed from: C */
    public boolean f305C;

    /* renamed from: D */
    public final Object f306D = new Object();

    /* renamed from: E */
    private final C004601w f307E;

    /* renamed from: F */
    private long f308F;

    /* renamed from: G */
    private boolean f309G = true;

    /* renamed from: H */
    private boolean f310H;

    private C004501v(C003901p r9, int i) {
        super(r9, false, false);
        this.f307E = new C004601w(r9.f280D, r9.f285I, false, i, true, 0, r9.f283G);
        this.f310H = true;
    }

    /* renamed from: B */
    public static void m277B(OutputStream outputStream, String str, String str2) {
        PrintWriter printWriter = new PrintWriter(outputStream);
        if (str != null) {
            printWriter.println(str);
            printWriter.println(str2);
        }
        Map allStackTraces = Thread.getAllStackTraces();
        Thread thread = Looper.getMainLooper().getThread();
        for (Entry entry : allStackTraces.entrySet()) {
            m279D(printWriter, (Thread) entry.getKey(), (StackTraceElement[]) entry.getValue());
        }
        if (!allStackTraces.containsKey(thread)) {
            m279D(printWriter, thread, thread.getStackTrace());
        }
        printWriter.flush();
    }

    /* renamed from: C */
    public static synchronized C004501v m278C(C003901p r2, int i) {
        C004501v r0;
        synchronized (C004501v.class) {
            if (f303I == null) {
                f303I = new C004501v(r2, i);
            }
            r0 = f303I;
        }
        return r0;
    }

    /* renamed from: D */
    private static void m279D(PrintWriter printWriter, Thread thread, StackTraceElement[] stackTraceElementArr) {
        printWriter.print(thread);
        printWriter.print(" ");
        printWriter.print(thread.getState());
        printWriter.println(":");
        for (StackTraceElement println : stackTraceElementArr) {
            printWriter.println(println);
        }
        printWriter.println();
    }

    /* renamed from: A */
    public final void mo106A() {
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        C004201s r2 = new C004201s("ANR detected by ProcessErrorMonitorAnrDetector");
        r2.setStackTrace(stackTrace);
        C000600f.m74I("ProcessErrorMonitorANRDetector", r2, "Generating ANR Report");
    }

    /* renamed from: WU */
    public final void mo99WU() {
    }

    /* renamed from: XU */
    public final void mo100XU() {
    }

    /* renamed from: fT */
    public final synchronized void mo101fT() {
        if (!this.f304B) {
            this.f304B = true;
            mo107B(AnonymousClass01P.f183C);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:12|13|2d|17|18|(1:20)|21|(1:23)(1:29)|24|(21:26|92|33|34|35|(1:37)|38|(1:40)|41|(1:43)(9:44|45|46|47|(2:50|48)|196|51|52|53)|56|(3:58|(1:(10:60|61|62|63|64|(1:66)(4:67|(2:70|68)|200|71)|72|73|199|90)(5:197|91|(4:94|(2:96|203)(2:97|202)|98|92)|201|99))|85)|100|(2:102|108)(4:103|104|(1:106)|107)|109|(1:111)(1:112)|(4:114|2e7|119|120)(6:125|126|308|131|132|30f)|137|138|31c|143)|168|169|33d|175|184|185) */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x034d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021d, code lost:
        if (r3 != null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:184:0x034b */
    /* renamed from: gT */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102gT() {
        /*
            r20 = this;
            r11 = r20
            monitor-enter(r11)
            boolean r1 = r11.f310H     // Catch:{ all -> 0x0351 }
            boolean r0 = r11.f310H     // Catch:{ all -> 0x0351 }
            if (r0 != 0) goto L_0x0014
            r0 = 1
            r11.f305C = r0     // Catch:{ all -> 0x0351 }
            r0 = 0
            r11.f304B = r0     // Catch:{ all -> 0x0351 }
            java.lang.Integer r0 = p000X.AnonymousClass01P.f184D     // Catch:{ all -> 0x0351 }
            r11.mo107B(r0)     // Catch:{ all -> 0x0351 }
        L_0x0014:
            monitor-exit(r11)     // Catch:{ all -> 0x0351 }
            if (r1 != 0) goto L_0x0350
            boolean r2 = r11.mo108C()
            X.01p r0 = r11.f289B
            android.os.Handler r1 = r0.f282F
            X.02F r0 = new X.02F
            r0.<init>(r11, r2)
            r1.post(r0)
            if (r2 == 0) goto L_0x0350
            java.lang.Object r4 = r11.f306D
            monitor-enter(r4)
            r6 = r11
            monitor-enter(r6)     // Catch:{ IOException -> 0x034b }
            monitor-exit(r6)     // Catch:{ all -> 0x0345 }
            r11.mo106A()     // Catch:{ IOException -> 0x034b }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x034b }
            r11.f291D = r0     // Catch:{ IOException -> 0x034b }
            X.01p r0 = r11.f289B     // Catch:{ IOException -> 0x034b }
            X.01F r8 = r0.f278B     // Catch:{ IOException -> 0x034b }
            X.01C r0 = r11.f290C     // Catch:{ IOException -> 0x034b }
            r19 = 0
            if (r0 != 0) goto L_0x0044
            r19 = 1
        L_0x0044:
            X.01p r0 = r11.f289B     // Catch:{ IOException -> 0x034b }
            int r7 = r0.f281E     // Catch:{ IOException -> 0x034b }
            boolean r5 = r11.f293F     // Catch:{ IOException -> 0x034b }
            long r9 = r11.f291D     // Catch:{ IOException -> 0x034b }
            long r2 = r11.f292E     // Catch:{ IOException -> 0x034b }
            long r17 = r11.getReadyTime()     // Catch:{ IOException -> 0x034b }
            long r15 = r11.getSwitchTime()     // Catch:{ IOException -> 0x034b }
            X.01p r0 = r11.f289B     // Catch:{ IOException -> 0x034b }
            boolean r0 = r0.f287K     // Catch:{ IOException -> 0x034b }
            if (r0 == 0) goto L_0x0094
            X.01p r0 = r11.f289B     // Catch:{ IOException -> 0x034b }
            android.content.Context r6 = r0.f280D     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "sigquit"
            r0 = 0
            java.io.File r14 = r6.getDir(r1, r0)     // Catch:{ IOException -> 0x034b }
        L_0x0067:
            X.01p r0 = r11.f289B     // Catch:{ IOException -> 0x034b }
            java.lang.String r6 = r0.f285I     // Catch:{ IOException -> 0x034b }
            r1 = 46
            r0 = 95
            java.lang.String r6 = r6.replace(r1, r0)     // Catch:{ IOException -> 0x034b }
            r1 = 58
            r0 = 95
            java.lang.String r6 = r6.replace(r1, r0)     // Catch:{ IOException -> 0x034b }
            X.00G r1 = r8.f164E     // Catch:{ IOException -> 0x034b }
            X.00P r0 = p000X.AnonymousClass00P.ANR_REPORT     // Catch:{ IOException -> 0x034b }
            boolean r0 = r1.mo16B(r0)     // Catch:{ IOException -> 0x034b }
            if (r0 != 0) goto L_0x0337
            X.00G r0 = r8.f164E     // Catch:{ IOException -> 0x034b }
            long r0 = r0.f50F     // Catch:{ IOException -> 0x034b }
            long r12 = r9 - r0
            X.00G r0 = r8.f164E     // Catch:{ IOException -> 0x034b }
            long r0 = r0.f50F     // Catch:{ IOException -> 0x034b }
            long r2 = r2 - r0
            java.util.Map r11 = r8.f162C     // Catch:{ IOException -> 0x034b }
            monitor-enter(r11)     // Catch:{ IOException -> 0x034b }
            goto L_0x0096
        L_0x0094:
            r14 = 0
            goto L_0x0067
        L_0x0096:
            java.util.Map r0 = r8.f162C     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = "anr_process_error_detected_time"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0334 }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ all -> 0x0334 }
            java.util.Map r0 = r8.f162C     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = "anr_process_error_detection_failure_time"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0334 }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ all -> 0x0334 }
            java.util.Map r0 = r8.f162C     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = "anr_process_error_detection_failure_cause"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0334 }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ all -> 0x0334 }
            java.util.Map r0 = r8.f162C     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = "anr_system_error_msg"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0334 }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ all -> 0x0334 }
            java.util.Map r0 = r8.f162C     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = "anr_system_tag"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0334 }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ all -> 0x0334 }
            java.util.Map r0 = r8.f162C     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = "anr_process_error_started_time"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0334 }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ all -> 0x0334 }
            java.util.Map r0 = r8.f162C     // Catch:{ all -> 0x0334 }
            r0.clear()     // Catch:{ all -> 0x0334 }
            monitor-exit(r11)     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = "anr_detected_uptime"
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "anr_detect_time_tag"
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "anr_recovery_delay"
            java.lang.String r0 = "-1"
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "anr_detected_pre_gkstore"
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "anr_detector_id"
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "anr_detector_start_time"
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "asl_app_in_foreground"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            r0 = 0
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x013c
            X.00G r0 = r8.f164E     // Catch:{ IOException -> 0x034b }
            long r0 = r0.f50F     // Catch:{ IOException -> 0x034b }
            long r17 = r17 - r0
            java.lang.String r1 = "anr_detector_actual_start_time"
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
        L_0x013c:
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0150
            X.00G r0 = r8.f164E     // Catch:{ IOException -> 0x034b }
            long r0 = r0.f50F     // Catch:{ IOException -> 0x034b }
            long r15 = r15 - r0
            java.lang.String r1 = "anr_detector_switch_time"
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
        L_0x0150:
            java.lang.String r1 = "black_box_trace"
            r0 = 0
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "long_stall_trace"
            r0 = 0
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r3 = "anr_async_broadcast_receivers"
            java.util.concurrent.ConcurrentHashMap r0 = p000X.AnonymousClass02J.f360B     // Catch:{ IOException -> 0x034b }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x034b }
            if (r0 == 0) goto L_0x0168
            r0 = 0
            goto L_0x01af
        L_0x0168:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ IOException -> 0x034b }
            r5.<init>()     // Catch:{ IOException -> 0x034b }
            java.lang.String r2 = "current_uptime_ms"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ JSONException -> 0x01aa }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r1 = "active_receivers_count"
            java.util.concurrent.ConcurrentHashMap r0 = p000X.AnonymousClass02J.f360B     // Catch:{ JSONException -> 0x01aa }
            int r0 = r0.size()     // Catch:{ JSONException -> 0x01aa }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01aa }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01aa }
            r2.<init>()     // Catch:{ JSONException -> 0x01aa }
            java.util.concurrent.ConcurrentHashMap r0 = p000X.AnonymousClass02J.f360B     // Catch:{ JSONException -> 0x01aa }
            java.util.Collection r0 = r0.values()     // Catch:{ JSONException -> 0x01aa }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x01aa }
        L_0x0190:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x01aa }
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x01aa }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01aa }
            r2.put(r0)     // Catch:{ JSONException -> 0x01aa }
            goto L_0x0190
        L_0x01a0:
            java.lang.String r0 = "active_receivers"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x034b }
            goto L_0x01af
        L_0x01aa:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x034b }
        L_0x01af:
            p000X.AnonymousClass00G.m26H(r3, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "first_sigquit"
            r0 = 0
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r1 = "sigquit_times"
            r0 = 0
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            if (r14 == 0) goto L_0x0295
            java.util.TreeMap r9 = new java.util.TreeMap     // Catch:{ IOException -> 0x034b }
            r9.<init>()     // Catch:{ IOException -> 0x034b }
            java.io.File[] r11 = r14.listFiles()     // Catch:{ IOException -> 0x034b }
            int r10 = r11.length     // Catch:{ IOException -> 0x034b }
            r0 = 0
        L_0x01cb:
            if (r0 >= r10) goto L_0x0240
            r12 = r11[r0]     // Catch:{ IOException -> 0x034b }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x022c }
            r5.<init>(r12)     // Catch:{ IOException -> 0x022c }
            r3 = 0
            r1 = 8
            byte[] r15 = new byte[r1]     // Catch:{ Throwable -> 0x021a }
            int r2 = r5.read(r15)     // Catch:{ Throwable -> 0x021a }
            r1 = 8
            if (r2 == r1) goto L_0x01f3
            java.lang.String r14 = "ANRReport"
            java.lang.String r13 = "Corrupted file %s"
            r1 = 1
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x021a }
            r2 = 0
            java.lang.String r1 = r12.getName()     // Catch:{ Throwable -> 0x021a }
            r7[r2] = r1     // Catch:{ Throwable -> 0x021a }
            p000X.C000600f.m81P(r14, r13, r7)     // Catch:{ Throwable -> 0x021a }
            goto L_0x0216
        L_0x01f3:
            r7 = 0
            r17 = 0
            r16 = 0
        L_0x01f8:
            r1 = 8
            if (r7 >= r1) goto L_0x020b
            byte r1 = r15[r7]     // Catch:{ Throwable -> 0x021a }
            long r1 = (long) r1     // Catch:{ Throwable -> 0x021a }
            r13 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r13
            long r1 = r1 << r16
            long r17 = r17 + r1
            int r16 = r16 + 8
            int r7 = r7 + 1
            goto L_0x01f8
        L_0x020b:
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ Throwable -> 0x021a }
            java.lang.String r1 = r12.getName()     // Catch:{ Throwable -> 0x021a }
            r9.put(r2, r1)     // Catch:{ Throwable -> 0x021a }
        L_0x0216:
            r5.close()     // Catch:{ IOException -> 0x022c }
            goto L_0x023d
        L_0x021a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x021c }
        L_0x021c:
            r2 = move-exception
            if (r3 == 0) goto L_0x0223
            r5.close()     // Catch:{ Throwable -> 0x0227 }
            goto L_0x022b
        L_0x0223:
            r5.close()     // Catch:{ IOException -> 0x022c }
            goto L_0x022b
        L_0x0227:
            r1 = move-exception
            p000X.AnonymousClass01A.m182B(r3, r1)     // Catch:{ IOException -> 0x022c }
        L_0x022b:
            throw r2     // Catch:{ IOException -> 0x022c }
        L_0x022c:
            java.lang.String r7 = "ANRReport"
            java.lang.String r5 = "Could not read from file %s"
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x034b }
            r2 = 0
            java.lang.String r1 = r12.getName()     // Catch:{ IOException -> 0x034b }
            r3[r2] = r1     // Catch:{ IOException -> 0x034b }
            p000X.C000600f.m81P(r7, r5, r3)     // Catch:{ IOException -> 0x034b }
        L_0x023d:
            int r0 = r0 + 1
            goto L_0x01cb
        L_0x0240:
            r1 = 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x034b }
            r5.<init>()     // Catch:{ IOException -> 0x034b }
            java.util.Set r0 = r9.entrySet()     // Catch:{ IOException -> 0x034b }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ IOException -> 0x034b }
        L_0x024e:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x034b }
            if (r0 == 0) goto L_0x028c
            java.lang.Object r2 = r3.next()     // Catch:{ IOException -> 0x034b }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x034b }
            if (r1 == 0) goto L_0x0271
            java.lang.String r1 = "first_sigquit"
            java.lang.Object r0 = r2.getValue()     // Catch:{ IOException -> 0x034b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x034b }
            boolean r0 = r0.equals(r6)     // Catch:{ IOException -> 0x034b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
            r1 = 0
            goto L_0x0276
        L_0x0271:
            java.lang.String r0 = ","
            r5.append(r0)     // Catch:{ IOException -> 0x034b }
        L_0x0276:
            java.lang.Object r0 = r2.getValue()     // Catch:{ IOException -> 0x034b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x034b }
            r5.append(r0)     // Catch:{ IOException -> 0x034b }
            java.lang.String r0 = ","
            r5.append(r0)     // Catch:{ IOException -> 0x034b }
            java.lang.Object r0 = r2.getKey()     // Catch:{ IOException -> 0x034b }
            r5.append(r0)     // Catch:{ IOException -> 0x034b }
            goto L_0x024e
        L_0x028c:
            java.lang.String r1 = "sigquit_times"
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x034b }
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x034b }
        L_0x0295:
            java.lang.String r0 = "should_dedup_disk_persistence_gk_cached"
            boolean r5 = p000X.AnonymousClass00E.m11B(r0)     // Catch:{ IOException -> 0x034b }
            r7 = 0
            if (r5 == 0) goto L_0x029f
            goto L_0x02bc
        L_0x029f:
            java.io.File r0 = r8.f166G     // Catch:{ IOException -> 0x032b }
            if (r0 != 0) goto L_0x02b4
            X.01o r3 = new X.01o     // Catch:{ IOException -> 0x032b }
            android.content.Context r2 = r8.f163D     // Catch:{ IOException -> 0x032b }
            java.lang.String r1 = ".stacktrace"
            java.lang.String r0 = "traces"
            r3.<init>(r2, r1, r0)     // Catch:{ IOException -> 0x032b }
            java.io.File r0 = r3.mo105A()     // Catch:{ IOException -> 0x032b }
            r8.f166G = r0     // Catch:{ IOException -> 0x032b }
        L_0x02b4:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x032b }
            java.io.File r0 = r8.f166G     // Catch:{ IOException -> 0x032b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x032b }
            goto L_0x02c1
        L_0x02bc:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x032b }
            r1.<init>()     // Catch:{ IOException -> 0x032b }
        L_0x02c1:
            r7 = r1
            java.lang.String r1 = "anr_with_sigquit_traces"
            java.lang.String r0 = "0"
            p000X.AnonymousClass00G.m26H(r1, r0)     // Catch:{ IOException -> 0x032b }
            if (r5 != 0) goto L_0x02d7
            X.00G r0 = r8.f164E     // Catch:{ IOException -> 0x032b }
            java.lang.String r1 = r0.f51G     // Catch:{ IOException -> 0x032b }
            X.00G r0 = r8.f164E     // Catch:{ IOException -> 0x032b }
            java.lang.String r0 = r0.f52H     // Catch:{ IOException -> 0x032b }
            m277B(r7, r1, r0)     // Catch:{ IOException -> 0x032b }
            goto L_0x02db
        L_0x02d7:
            r0 = 0
            m277B(r7, r0, r0)     // Catch:{ IOException -> 0x032b }
        L_0x02db:
            if (r5 == 0) goto L_0x02f6
            X.00G r5 = r8.f164E     // Catch:{ IOException -> 0x032b }
            java.lang.String r3 = r7.toString()     // Catch:{ IOException -> 0x032b }
            X.01o r2 = r8.f165F     // Catch:{ IOException -> 0x032b }
            java.lang.Object r1 = p000X.AnonymousClass00G.f43c     // Catch:{ IOException -> 0x032b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x032b }
            r1.notify()     // Catch:{ all -> 0x02f3 }
            monitor-exit(r1)     // Catch:{ all -> 0x02f3 }
            X.00P r1 = p000X.AnonymousClass00P.ANR_REPORT     // Catch:{ IOException -> 0x032b }
            r0 = 0
            r5.mo15A(r1, r3, r0, r2)     // Catch:{ IOException -> 0x032b }
            goto L_0x0317
        L_0x02f3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02f3 }
            goto L_0x032a
        L_0x02f6:
            java.io.File r0 = r8.f166G     // Catch:{ IOException -> 0x032b }
            r0.getCanonicalPath()     // Catch:{ IOException -> 0x032b }
            java.io.File r0 = r8.f166G     // Catch:{ IOException -> 0x032b }
            r0.length()     // Catch:{ IOException -> 0x032b }
            X.00G r6 = r8.f164E     // Catch:{ IOException -> 0x032b }
            java.io.File r5 = r8.f166G     // Catch:{ IOException -> 0x032b }
            X.01o r3 = r8.f165F     // Catch:{ IOException -> 0x032b }
            java.lang.Object r1 = p000X.AnonymousClass00G.f43c     // Catch:{ IOException -> 0x032b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x032b }
            r1.notify()     // Catch:{ all -> 0x0328 }
            monitor-exit(r1)     // Catch:{ all -> 0x0328 }
            java.lang.Object r2 = p000X.AnonymousClass00G.f41a     // Catch:{ IOException -> 0x032b }
            monitor-enter(r2)     // Catch:{ IOException -> 0x032b }
            X.00P r1 = p000X.AnonymousClass00P.ANR_REPORT     // Catch:{ all -> 0x0325 }
            r0 = 0
            r6.mo15A(r1, r0, r5, r3)     // Catch:{ all -> 0x0325 }
            monitor-exit(r2)     // Catch:{ all -> 0x0325 }
        L_0x0317:
            r7.close()     // Catch:{ IOException -> 0x034b }
            java.util.Map r1 = r8.f162C     // Catch:{ IOException -> 0x034b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x034b }
            r8.mo68A()     // Catch:{ all -> 0x0322 }
            monitor-exit(r1)     // Catch:{ all -> 0x0322 }
            goto L_0x0337
        L_0x0322:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0322 }
            goto L_0x034a
        L_0x0325:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0325 }
            goto L_0x032a
        L_0x0328:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0328 }
        L_0x032a:
            throw r0     // Catch:{ IOException -> 0x032b }
        L_0x032b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x032d }
        L_0x032d:
            r0 = move-exception
            if (r7 == 0) goto L_0x034a
            r7.close()     // Catch:{ IOException -> 0x034b }
            goto L_0x034a
        L_0x0334:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0334 }
            goto L_0x034a
        L_0x0337:
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ IOException -> 0x034b }
            java.lang.Class<X.02l> r1 = p000X.C006002l.class
            monitor-enter(r1)     // Catch:{ IOException -> 0x034b }
            java.util.Map r0 = p000X.C006002l.f384B     // Catch:{ all -> 0x0348 }
            r0.get(r2)     // Catch:{ all -> 0x0348 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x034b }
            goto L_0x034b
        L_0x0345:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0345 }
            goto L_0x034a
        L_0x0348:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x034b }
        L_0x034a:
            throw r0     // Catch:{ IOException -> 0x034b }
        L_0x034b:
            monitor-exit(r4)     // Catch:{ all -> 0x034d }
            return
        L_0x034d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x034d }
            goto L_0x0353
        L_0x0350:
            return
        L_0x0351:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0351 }
        L_0x0353:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C004501v.mo102gT():void");
    }

    /* renamed from: qS */
    public final void mo103qS() {
    }

    public final synchronized void start(long j) {
        if (this.f308F <= 0) {
            this.f308F = j;
        }
        if (this.f309G) {
            this.f309G = false;
            this.f307E.mo115A(this, 4000);
        }
        this.f310H = false;
    }

    public final void stop(C004401u r2) {
        synchronized (this) {
            this.f307E.mo116B();
        }
        if (r2 != null) {
            r2.mo114A();
        }
    }

    /* renamed from: uV */
    public final void mo104uV() {
    }
}
