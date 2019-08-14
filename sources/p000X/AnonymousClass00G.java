package p000X;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Time;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.00G reason: invalid class name */
public final class AnonymousClass00G implements AnonymousClass00H {

    /* renamed from: a */
    public static final Object f41a = new Object();

    /* renamed from: b */
    public static final AnonymousClass00P[] f42b = {AnonymousClass00P.ACRA_CRASH_REPORT, AnonymousClass00P.NATIVE_CRASH_REPORT};

    /* renamed from: c */
    public static final Object f43c = new Object();

    /* renamed from: d */
    public static final AtomicInteger f44d = new AtomicInteger();

    /* renamed from: e */
    private static final Pattern f45e = Pattern.compile("^Cmd line: (.*)", 8);

    /* renamed from: B */
    public volatile AnonymousClass01C f46B;

    /* renamed from: C */
    public final AnonymousClass00T f47C = new AnonymousClass00T();

    /* renamed from: D */
    public final Set f48D = new HashSet();

    /* renamed from: E */
    public final Time f49E = new Time();

    /* renamed from: F */
    public volatile long f50F;

    /* renamed from: G */
    public volatile String f51G;

    /* renamed from: H */
    public volatile String f52H;

    /* renamed from: I */
    public volatile UncaughtExceptionHandler f53I;

    /* renamed from: J */
    public volatile String f54J;

    /* renamed from: K */
    public volatile AnonymousClass00D f55K;

    /* renamed from: L */
    public volatile Map f56L;

    /* renamed from: M */
    public volatile Context f57M;

    /* renamed from: N */
    public volatile String f58N;

    /* renamed from: O */
    public final AtomicReference f59O = new AtomicReference();

    /* renamed from: P */
    public volatile boolean f60P;

    /* renamed from: Q */
    public volatile boolean f61Q;

    /* renamed from: R */
    public volatile long f62R;

    /* renamed from: S */
    public final Map f63S = new HashMap();

    /* renamed from: T */
    public volatile long f64T = 1572864;

    /* renamed from: U */
    public volatile byte[] f65U = null;

    /* renamed from: V */
    public int f66V;

    /* renamed from: W */
    public volatile File f67W = null;

    /* renamed from: X */
    public final ArrayList f68X = new ArrayList();

    /* renamed from: Y */
    private volatile AnonymousClass026 f69Y;

    /* renamed from: Z */
    private volatile AnonymousClass027 f70Z;

    /* renamed from: B */
    public static void m20B(File file) {
        if (file != null) {
            boolean delete = file.delete();
            if (!delete && !file.exists()) {
                delete = true;
            }
            file.getName();
            if (!delete) {
                C000600f.m81P("ACRA", "Could not delete error report: %s", file.getName());
            }
        }
    }

    /* renamed from: C */
    public static String m21C(AnonymousClass00G r3, Class cls, UUID uuid, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(uuid.toString());
        sb.append("-");
        sb.append(cls.getSimpleName());
        if (r3.f51G != null) {
            StringBuilder sb2 = new StringBuilder("-");
            sb2.append(r3.f51G);
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: D */
    public static UUID m22D() {
        try {
            return UUID.randomUUID();
        } catch (Throwable unused) {
            return UUID.nameUUIDFromBytes(String.format("%s-%s-%s", new Object[]{Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.nanoTime()), Integer.valueOf(Process.myTid())}).getBytes());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x020b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x020c, code lost:
        if (r13 != null) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0214, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x021c, code lost:
        p000X.AnonymousClass01A.m182B(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x021f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0222, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0223, code lost:
        if (r12 != null) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0232, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x029e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02a4, code lost:
        p000X.AnonymousClass01A.m182B(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02ac, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x02ad, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x02b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02ba, code lost:
        p000X.AnonymousClass01A.m182B(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x034e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x034f, code lost:
        if (r2 != null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0355, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0359, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x035a, code lost:
        p000X.AnonymousClass01A.m182B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x035d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        if ((r10 - r8) <= 604800000) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0100, code lost:
        if (r2 != false) goto L_0x0102;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x02ac A[ExcHandler: all (th java.lang.Throwable), Splitter:B:172:0x0277] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02b0 A[SYNTHETIC, Splitter:B:206:0x02b0] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02b6 A[SYNTHETIC, Splitter:B:209:0x02b6] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ff A[Catch:{ IOException -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0105 A[Catch:{ IOException -> 0x0119 }] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000X.AnonymousClass01R m23E(p000X.AnonymousClass00G r21, java.io.File r22, java.io.RandomAccessFile r23, p000X.AnonymousClass00P r24, long r25, boolean r27) {
        /*
            r13 = r22
            java.lang.String r5 = r13.getName()
            long r10 = java.lang.System.currentTimeMillis()
            long r8 = r13.lastModified()
            long r19 = r13.length()
            r0 = 0
            X.01R r4 = new X.01R
            r4.<init>()
            java.lang.String r2 = "TIME_OF_CRASH"
            java.lang.String r1 = java.lang.Long.toString(r8)
            r4.put(r2, r1)
            X.00P r1 = p000X.AnonymousClass00P.ANR_REPORT
            r7 = r21
            r6 = r24
            if (r6 != r1) goto L_0x0033
            android.content.Context r2 = r7.f57M
            java.lang.String r1 = "acraconfig_report_old_anrs"
            boolean r1 = p000X.AnonymousClass01G.m192B(r2, r1)
            if (r1 != 0) goto L_0x003c
        L_0x0033:
            long r10 = r10 - r8
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r1 = 1
            if (r2 > 0) goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            r3 = 0
            if (r1 == 0) goto L_0x0055
            java.lang.String r3 = "DUMP_TOO_OLD"
        L_0x0042:
            android.content.Context r2 = r7.f57M
            java.lang.String r1 = "android_acra_delete_corrupted_minidumps"
            boolean r1 = p000X.AnonymousClass01G.m192B(r2, r1)
            if (r1 == 0) goto L_0x0121
            r2 = r23
            if (r23 == 0) goto L_0x0121
            X.00P r1 = p000X.AnonymousClass00P.NATIVE_CRASH_REPORT
            if (r6 != r1) goto L_0x0121
            goto L_0x0067
        L_0x0055:
            int r1 = (r19 > r25 ? 1 : (r19 == r25 ? 0 : -1))
            if (r1 <= 0) goto L_0x0042
            java.lang.String r2 = "ATTACHMENT_ORIGINAL_SIZE"
            r8 = r19
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r4.put(r2, r1)
            java.lang.String r3 = "DUMP_TOO_BIG"
            goto L_0x0042
        L_0x0067:
            X.01l r10 = new X.01l     // Catch:{ IOException -> 0x0119 }
            r10.<init>(r2)     // Catch:{ IOException -> 0x0119 }
            r8 = 0
            r1 = -87162880(0xffffffffface0000, float:-5.3480658E35)
            X.02U r1 = r10.mo95A(r1)     // Catch:{ IOException -> 0x008b }
            if (r1 == 0) goto L_0x0095
            java.io.RandomAccessFile r9 = r10.f271B     // Catch:{ IOException -> 0x008b }
            int r1 = r1.f371B     // Catch:{ IOException -> 0x008b }
            long r1 = (long) r1     // Catch:{ IOException -> 0x008b }
            r9.seek(r1)     // Catch:{ IOException -> 0x008b }
            X.02V r9 = new X.02V     // Catch:{ IOException -> 0x008b }
            long r11 = p000X.C003501l.m255B(r10)     // Catch:{ IOException -> 0x008b }
            long r1 = p000X.C003501l.m255B(r10)     // Catch:{ IOException -> 0x008b }
            r9.<init>(r11, r1)     // Catch:{ IOException -> 0x008b }
            goto L_0x0094
        L_0x008b:
            r9 = move-exception
            java.lang.String r2 = "MinidumpReader"
            java.lang.String r1 = "getMinidumpMarkers failed to read"
            p000X.C000600f.m74I(r2, r9, r1)     // Catch:{ IOException -> 0x0119 }
            goto L_0x0095
        L_0x0094:
            r8 = r9
        L_0x0095:
            r14 = 0
            if (r8 == 0) goto L_0x00c5
            long r1 = r8.f374C     // Catch:{ IOException -> 0x0119 }
            long r8 = r8.f373B     // Catch:{ IOException -> 0x0119 }
            long r1 = r1 ^ r8
            r15 = 0
            r14 = 0
            r8 = 16
            long r8 = r8 & r1
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            r12 = 0
            if (r8 == 0) goto L_0x00a9
            r12 = 1
        L_0x00a9:
            r8 = 8
            long r8 = r8 & r1
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            r11 = 0
            if (r8 == 0) goto L_0x00b2
            r11 = 1
        L_0x00b2:
            r8 = 17592186044416(0x100000000000, double:8.6916947597938E-311)
            long r8 = r8 & r1
            int r2 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            r1 = 0
            if (r2 == 0) goto L_0x00be
            r1 = 1
        L_0x00be:
            if (r12 != 0) goto L_0x00c4
            if (r11 == 0) goto L_0x00c5
            if (r1 == 0) goto L_0x00c5
        L_0x00c4:
            r14 = 1
        L_0x00c5:
            java.lang.String r12 = ""
            r1 = -87110912(0xfffffffffacecb00, float:-5.3686524E35)
            java.lang.String r1 = r10.mo97C(r1)     // Catch:{ IOException -> 0x00cf }
            goto L_0x00de
        L_0x00cf:
            r11 = move-exception
            java.lang.String r9 = "MinidumpReader"
            java.lang.String r8 = "getErrorLogData error: %s"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0119 }
            r1 = 0
            r2[r1] = r12     // Catch:{ IOException -> 0x0119 }
            p000X.C000600f.m75J(r9, r11, r8, r2)     // Catch:{ IOException -> 0x0119 }
            r1 = 0
        L_0x00de:
            r2 = r1
            if (r1 == 0) goto L_0x00fa
            java.lang.String r1 = "WriteMappings failed"
            boolean r1 = r2.contains(r1)     // Catch:{ IOException -> 0x0119 }
            if (r1 != 0) goto L_0x00fc
            java.lang.String r1 = "WriteThreadListStream failed"
            boolean r1 = r2.contains(r1)     // Catch:{ IOException -> 0x0119 }
            if (r1 == 0) goto L_0x00fa
            java.lang.String r1 = "WriteThreadUnwindStream failed"
            boolean r1 = r2.contains(r1)     // Catch:{ IOException -> 0x0119 }
            if (r1 == 0) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r2 = 0
            goto L_0x00fd
        L_0x00fc:
            r2 = 1
        L_0x00fd:
            if (r14 != 0) goto L_0x0102
            r1 = 0
            if (r2 == 0) goto L_0x0103
        L_0x0102:
            r1 = 1
        L_0x0103:
            if (r1 == 0) goto L_0x0121
            java.lang.String r3 = "CORRUPTED_MINIDUMP"
            r1 = -87110915(0xfffffffffacecafd, float:-5.3686512E35)
            java.lang.String r0 = r10.mo97C(r1)     // Catch:{ IOException -> 0x010f }
            goto L_0x0121
        L_0x010f:
            r8 = move-exception
            java.lang.String r2 = "MinidumpReader"
            java.lang.String r1 = "getJavaStack error"
            p000X.C000600f.m74I(r2, r8, r1)     // Catch:{ IOException -> 0x0119 }
            r0 = 0
            goto L_0x0121
        L_0x0119:
            r8 = move-exception
            java.lang.String r2 = "ACRA"
            java.lang.String r1 = "Failed to read minidump file"
            p000X.C000600f.m74I(r2, r8, r1)
        L_0x0121:
            if (r3 == 0) goto L_0x014c
            java.lang.String r8 = "ACRA"
            java.lang.String r7 = "deleting crash report %s: %s"
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r5
            r1 = 1
            r2[r1] = r3
            p000X.C000600f.m81P(r8, r7, r2)
            m20B(r13)
            java.lang.String r1 = r6.f87B
            if (r1 == 0) goto L_0x013f
            java.lang.String r1 = r6.f87B
            r4.put(r1, r3)
        L_0x013f:
            java.lang.String r1 = "MINIDUMP_EXCLUDE_REASON"
            r4.put(r1, r3)
            if (r0 == 0) goto L_0x014b
            java.lang.String r1 = "JAVA_STACK_FROM_DUMP"
            r4.put(r1, r0)
        L_0x014b:
            return r4
        L_0x014c:
            if (r27 == 0) goto L_0x035e
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r13)
            r2 = 0
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ Throwable -> 0x034c }
            r9.<init>(r8)     // Catch:{ Throwable -> 0x034c }
            r3 = 0
            X.00P r0 = p000X.AnonymousClass00P.ACRA_CRASH_REPORT     // Catch:{ Throwable -> 0x0308 }
            if (r6 != r0) goto L_0x0163
            r4.mo76B(r9)     // Catch:{ Throwable -> 0x0308 }
            goto L_0x0332
        L_0x0163:
            r11 = 0
            r10 = 0
            X.00P r0 = p000X.AnonymousClass00P.ANR_REPORT     // Catch:{ Throwable -> 0x0308 }
            if (r6 != r0) goto L_0x01b0
            java.lang.String r11 = m37S(r9)     // Catch:{ Throwable -> 0x0308 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x0308 }
            if (r0 != 0) goto L_0x0177
            java.lang.String r10 = m37S(r9)     // Catch:{ Throwable -> 0x0308 }
        L_0x0177:
            boolean r0 = r9.markSupported()     // Catch:{ Throwable -> 0x0308 }
            if (r0 == 0) goto L_0x01b0
            r0 = 1024(0x400, float:1.435E-42)
            r9.mark(r0)     // Catch:{ Throwable -> 0x0308 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r13 = new byte[r0]     // Catch:{ Throwable -> 0x0308 }
            r1 = 0
            r0 = 1024(0x400, float:1.435E-42)
            int r12 = r9.read(r13, r1, r0)     // Catch:{ Throwable -> 0x0308 }
            if (r12 <= 0) goto L_0x01ad
            java.lang.String r1 = new java.lang.String     // Catch:{ Throwable -> 0x0308 }
            r0 = 0
            r1.<init>(r13, r0, r12)     // Catch:{ Throwable -> 0x0308 }
            java.util.regex.Pattern r0 = f45e     // Catch:{ Throwable -> 0x0308 }
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch:{ Throwable -> 0x0308 }
            boolean r0 = r1.find()     // Catch:{ Throwable -> 0x0308 }
            if (r0 == 0) goto L_0x01ad
            r0 = 1
            java.lang.String r1 = r1.group(r0)     // Catch:{ Throwable -> 0x0308 }
            if (r1 == 0) goto L_0x01ad
            java.lang.String r0 = "PROCESS_NAME"
            r4.put(r0, r1)     // Catch:{ Throwable -> 0x0308 }
        L_0x01ad:
            r9.reset()     // Catch:{ Throwable -> 0x0308 }
        L_0x01b0:
            X.00P r0 = p000X.AnonymousClass00P.NATIVE_CRASH_REPORT     // Catch:{ Throwable -> 0x0308 }
            if (r6 != r0) goto L_0x02c8
            java.io.File r15 = new java.io.File     // Catch:{ IOException -> 0x0233 }
            android.content.Context r0 = r7.f57M     // Catch:{ IOException -> 0x0233 }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ IOException -> 0x0233 }
            java.lang.String r0 = "last_activity_opened"
            r15.<init>(r1, r0)     // Catch:{ IOException -> 0x0233 }
            boolean r0 = r15.exists()     // Catch:{ IOException -> 0x0233 }
            if (r0 != 0) goto L_0x01cf
            java.lang.String r1 = "LAST_ACTIVITY_LOGGED"
            java.lang.String r0 = "NO_FILE"
            r4.put(r1, r0)     // Catch:{ IOException -> 0x0233 }
            goto L_0x023b
        L_0x01cf:
            java.io.FileReader r14 = new java.io.FileReader     // Catch:{ IOException -> 0x0233 }
            r14.<init>(r15)     // Catch:{ IOException -> 0x0233 }
            r12 = 0
            java.io.BufferedReader r18 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0220 }
            r0 = 1024(0x400, float:1.435E-42)
            r21 = r18
            r22 = r14
            r23 = r0
            r21.<init>(r22, r23)     // Catch:{ Throwable -> 0x0220 }
            r13 = 0
            r0 = r18
            java.lang.String r1 = r0.readLine()     // Catch:{ Throwable -> 0x0209 }
            if (r1 == 0) goto L_0x01fd
            java.lang.String r0 = "LAST_ACTIVITY_LOGGED"
            r4.put(r0, r1)     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r1 = "LAST_ACTIVITY_LOGGED_TIME"
            long r16 = r15.lastModified()     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r0 = java.lang.Long.toString(r16)     // Catch:{ Throwable -> 0x0209 }
            r4.put(r1, r0)     // Catch:{ Throwable -> 0x0209 }
        L_0x01fd:
            r15.delete()     // Catch:{ Throwable -> 0x0209 }
            r0 = r18
            r0.close()     // Catch:{ Throwable -> 0x0220 }
            r14.close()     // Catch:{ IOException -> 0x0233 }
            goto L_0x023b
        L_0x0209:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x020b }
        L_0x020b:
            r1 = move-exception
            if (r13 == 0) goto L_0x0216
            r0 = r18
            r0.close()     // Catch:{ Throwable -> 0x0214 }
            goto L_0x021f
        L_0x0214:
            r0 = move-exception
            goto L_0x021c
        L_0x0216:
            r0 = r18
            r0.close()     // Catch:{ Throwable -> 0x0220 }
            goto L_0x021f
        L_0x021c:
            p000X.AnonymousClass01A.m182B(r13, r0)     // Catch:{ Throwable -> 0x0220 }
        L_0x021f:
            throw r1     // Catch:{ Throwable -> 0x0220 }
        L_0x0220:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0222 }
        L_0x0222:
            r1 = move-exception
            if (r12 == 0) goto L_0x022b
            r14.close()     // Catch:{ Throwable -> 0x0229 }
            goto L_0x0232
        L_0x0229:
            r0 = move-exception
            goto L_0x022f
        L_0x022b:
            r14.close()     // Catch:{ IOException -> 0x0233 }
            goto L_0x0232
        L_0x022f:
            p000X.AnonymousClass01A.m182B(r12, r0)     // Catch:{ IOException -> 0x0233 }
        L_0x0232:
            throw r1     // Catch:{ IOException -> 0x0233 }
        L_0x0233:
            r12 = move-exception
            java.lang.String r1 = "ErrorReporter"
            java.lang.String r0 = "error attaching activity information"
            p000X.C000600f.m82Q(r1, r12, r0)     // Catch:{ Throwable -> 0x0308 }
        L_0x023b:
            java.io.File r12 = new java.io.File     // Catch:{ IOException -> 0x02c0 }
            android.content.Context r0 = r7.f57M     // Catch:{ IOException -> 0x02c0 }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ IOException -> 0x02c0 }
            java.lang.String r0 = "iab_open_times"
            r12.<init>(r1, r0)     // Catch:{ IOException -> 0x02c0 }
            r15 = 0
            boolean r0 = r12.exists()     // Catch:{ IOException -> 0x02c0 }
            if (r0 != 0) goto L_0x0272
            java.lang.String r1 = "NO_FILE"
        L_0x0251:
            java.lang.String r0 = "NO_FILE"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02c0 }
            if (r0 == 0) goto L_0x026a
            java.lang.String r1 = "IAB_OPEN_TIMES"
            java.lang.String r0 = "0"
            r4.put(r1, r0)     // Catch:{ IOException -> 0x02c0 }
        L_0x0260:
            boolean r0 = r12.exists()     // Catch:{ IOException -> 0x02c0 }
            if (r0 == 0) goto L_0x02c8
            r12.delete()     // Catch:{ IOException -> 0x02c0 }
            goto L_0x02c8
        L_0x026a:
            if (r1 == 0) goto L_0x0260
            java.lang.String r0 = "IAB_OPEN_TIMES"
            r4.put(r0, r1)     // Catch:{ IOException -> 0x02c0 }
            goto L_0x0260
        L_0x0272:
            java.io.FileReader r14 = new java.io.FileReader     // Catch:{ Exception -> 0x02be }
            r14.<init>(r12)     // Catch:{ Exception -> 0x02be }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x02a8, all -> 0x02ac }
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r14, r1)     // Catch:{ Throwable -> 0x02a8, all -> 0x02ac }
            java.lang.String r1 = r0.readLine()     // Catch:{ Throwable -> 0x0292, all -> 0x0296 }
            if (r1 == 0) goto L_0x028b
            r0.close()     // Catch:{ Throwable -> 0x02a8, all -> 0x02ac }
            r14.close()     // Catch:{ Exception -> 0x02be }
            goto L_0x0251
        L_0x028b:
            r0.close()     // Catch:{ Throwable -> 0x02a8, all -> 0x02ac }
            r14.close()     // Catch:{ Exception -> 0x02be }
            goto L_0x02be
        L_0x0292:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0294 }
        L_0x0294:
            r13 = move-exception
            goto L_0x0298
        L_0x0296:
            r13 = move-exception
            r1 = r15
        L_0x0298:
            if (r1 == 0) goto L_0x02a0
            r0.close()     // Catch:{ Throwable -> 0x029e, all -> 0x02ac }
            goto L_0x02a7
        L_0x029e:
            r0 = move-exception
            goto L_0x02a4
        L_0x02a0:
            r0.close()     // Catch:{ Throwable -> 0x02a8, all -> 0x02ac }
            goto L_0x02a7
        L_0x02a4:
            p000X.AnonymousClass01A.m182B(r1, r0)     // Catch:{ Throwable -> 0x02a8, all -> 0x02ac }
        L_0x02a7:
            throw r13     // Catch:{ Throwable -> 0x02a8, all -> 0x02ac }
        L_0x02a8:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x02aa }
        L_0x02aa:
            r1 = move-exception
            goto L_0x02ae
        L_0x02ac:
            r1 = move-exception
            r13 = r15
        L_0x02ae:
            if (r13 == 0) goto L_0x02b6
            r14.close()     // Catch:{ Throwable -> 0x02b4 }
            goto L_0x02bd
        L_0x02b4:
            r0 = move-exception
            goto L_0x02ba
        L_0x02b6:
            r14.close()     // Catch:{ Exception -> 0x02be }
            goto L_0x02bd
        L_0x02ba:
            p000X.AnonymousClass01A.m182B(r13, r0)     // Catch:{ Exception -> 0x02be }
        L_0x02bd:
            throw r1     // Catch:{ Exception -> 0x02be }
        L_0x02be:
            r1 = r15
            goto L_0x0251
        L_0x02c0:
            r12 = move-exception
            java.lang.String r1 = "ErrorReporter"
            java.lang.String r0 = "error attaching IAB information"
            p000X.C000600f.m82Q(r1, r12, r0)     // Catch:{ Throwable -> 0x0308 }
        L_0x02c8:
            r0 = r19
            int r13 = (int) r0     // Catch:{ Throwable -> 0x0308 }
            r14 = 0
            byte[] r12 = new byte[r13]     // Catch:{ Throwable -> 0x0308 }
            r1 = 0
        L_0x02cf:
            int r0 = r13 - r1
            if (r0 <= 0) goto L_0x02de
            int r0 = r13 - r1
            int r14 = r9.read(r12, r1, r0)     // Catch:{ Throwable -> 0x0308 }
            r0 = -1
            if (r14 == r0) goto L_0x02de
            int r1 = r1 + r14
            goto L_0x02cf
        L_0x02de:
            if (r14 != 0) goto L_0x02e3
            java.lang.String r1 = ""
            goto L_0x02e7
        L_0x02e3:
            java.lang.String r1 = p000X.AnonymousClass02M.m305B(r12)     // Catch:{ Throwable -> 0x0308 }
        L_0x02e7:
            java.lang.String r0 = r6.f87B     // Catch:{ Throwable -> 0x0308 }
            r4.put(r0, r1)     // Catch:{ Throwable -> 0x0308 }
            java.lang.String r1 = "ATTACHMENT_ORIGINAL_SIZE"
            r12 = r19
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x0308 }
            r4.put(r1, r0)     // Catch:{ Throwable -> 0x0308 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x0308 }
            if (r0 != 0) goto L_0x0332
            java.lang.String r0 = "APP_VERSION_CODE"
            r4.put(r0, r11)     // Catch:{ Throwable -> 0x0308 }
            java.lang.String r0 = "APP_VERSION_NAME"
            r4.put(r0, r10)     // Catch:{ Throwable -> 0x0308 }
            goto L_0x0332
        L_0x0308:
            r11 = move-exception
            java.lang.String r6 = "REPORT_LOAD_THROW"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0339 }
            java.lang.String r0 = "throwable: "
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0339 }
            java.lang.String r0 = r11.getMessage()     // Catch:{ Throwable -> 0x0339 }
            r1.append(r0)     // Catch:{ Throwable -> 0x0339 }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x0339 }
            r4.put(r6, r0)     // Catch:{ Throwable -> 0x0339 }
            java.lang.String r10 = "ACRA"
            java.lang.String r6 = "Could not load crash report: %s. File will be deleted."
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0339 }
            r0 = 0
            r1[r0] = r5     // Catch:{ Throwable -> 0x0339 }
            p000X.C000600f.m75J(r10, r11, r6, r1)     // Catch:{ Throwable -> 0x0339 }
            android.content.Context r0 = r7.f57M     // Catch:{ Throwable -> 0x0339 }
            r0.deleteFile(r5)     // Catch:{ Throwable -> 0x0339 }
        L_0x0332:
            r9.close()     // Catch:{ Throwable -> 0x034c }
            r8.close()
            goto L_0x0372
        L_0x0339:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x033b }
        L_0x033b:
            r1 = move-exception
            if (r3 == 0) goto L_0x0344
            r9.close()     // Catch:{ Throwable -> 0x0342 }
            goto L_0x034b
        L_0x0342:
            r0 = move-exception
            goto L_0x0348
        L_0x0344:
            r9.close()     // Catch:{ Throwable -> 0x034c }
            goto L_0x034b
        L_0x0348:
            p000X.AnonymousClass01A.m182B(r3, r0)     // Catch:{ Throwable -> 0x034c }
        L_0x034b:
            throw r1     // Catch:{ Throwable -> 0x034c }
        L_0x034c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x034e }
        L_0x034e:
            r1 = move-exception
            if (r2 == 0) goto L_0x0355
            r8.close()     // Catch:{ Throwable -> 0x0359 }
            goto L_0x035d
        L_0x0355:
            r8.close()
            goto L_0x035d
        L_0x0359:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r2, r0)
        L_0x035d:
            throw r1
        L_0x035e:
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r13)
            java.util.Map r2 = r4.f214D
            java.lang.String r1 = r6.f87B
            X.02R r0 = new X.02R
            r13.length()
            r0.<init>(r3)
            r2.put(r1, r0)
        L_0x0372:
            java.lang.String r0 = "ACRA_REPORT_FILENAME"
            r4.put(r0, r5)
            r7.m31M(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass00G.m23E(X.00G, java.io.File, java.io.RandomAccessFile, X.00P, long, boolean):X.01R");
    }

    /* renamed from: F */
    public static void m24F(File file, String str) {
        if (file != null) {
            File[] listFiles = file.listFiles(null);
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m24F(file2, str);
                    }
                    m20B(file2);
                }
            }
        }
    }

    /* renamed from: G */
    public static void m25G(String str, String str2, AnonymousClass01R r3, Writer writer) {
        if (r3.f213C != null) {
            writer = null;
        }
        try {
            r3.mo79E(str, str2, writer);
        } catch (IOException e) {
            r3.f213C = e;
        }
    }

    /* renamed from: H */
    public static void m26H(String str, String str2) {
        AnonymousClass00l.f119B.mo50nZ(str, str2, new Object[0]);
    }

    /* renamed from: I */
    public static void m27I(Throwable th, String str, String str2, String str3, AnonymousClass00G r6) {
        AnonymousClass01R r1 = new AnonymousClass01R();
        r1.put("soft_error_category", str);
        r1.put("soft_error_message", str2);
        if (str3 != null) {
            r1.put("ASL_SESSION_ID", str3);
        }
        r6.mo17C(th, r1);
    }

    /* renamed from: J */
    public static void m28J(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                m30L("safeClose", th);
            }
        }
    }

    /* renamed from: K */
    public static void m29K(AnonymousClass00G r14, AnonymousClass01R r15) {
        ArrayList arrayList;
        HttpURLConnection QJ;
        synchronized (r14.f68X) {
            arrayList = new ArrayList(r14.f68X);
        }
        if (arrayList.isEmpty()) {
            throw new AnonymousClass02K("no configured report senders", null);
        }
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass00X r6 = (AnonymousClass00X) it.next();
            try {
                URL url = new URL(r6.f99C.toString());
                AnonymousClass02P r9 = r6.f98B ? new C005402e() : new AnonymousClass02Y();
                String str = "Android";
                HashMap hashMap = new HashMap();
                String str2 = null;
                if (r15.containsKey("UID")) {
                    str2 = (String) r15.get("UID");
                }
                if (str2 != null && !str2.equals("") && !str2.equals("0")) {
                    StringBuilder sb = new StringBuilder("c_user=");
                    sb.append(str2);
                    hashMap.put("Cookie", sb.toString());
                }
                AnonymousClass02Q r2 = new AnonymousClass02Q(r9);
                r2.f367C = hashMap;
                QJ = r2.f366B.mo135QJ(url);
                QJ.setRequestMethod("POST");
                QJ.setRequestProperty("User-Agent", str);
                QJ.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                QJ.setRequestProperty("Content-Encoding", "gzip");
                if (r2.f367C != null && !r2.f367C.isEmpty()) {
                    for (Entry entry : r2.f367C.entrySet()) {
                        QJ.setRequestProperty(entry.getKey().toString(), entry.getValue().toString());
                    }
                }
                QJ.setDoOutput(true);
                OutputStream outputStream = QJ.getOutputStream();
                if (C003601m.f274B != null) {
                    outputStream = new AnonymousClass02L(outputStream, C003601m.f274B);
                }
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                C005502f r7 = new C005502f(bufferedWriter);
                boolean z2 = true;
                for (Entry entry2 : r15.entrySet()) {
                    Object key = entry2.getKey();
                    if (!z2) {
                        bufferedWriter.append('&');
                    }
                    Object value = entry2.getValue();
                    if (value == null) {
                        value = "";
                    }
                    r7.write(key.toString());
                    bufferedWriter.write(61);
                    if (value instanceof InputStream) {
                        InputStreamReader inputStreamReader = new InputStreamReader((InputStream) value);
                        char[] cArr = new char[256];
                        while (true) {
                            try {
                                int read = inputStreamReader.read(cArr);
                                if (read == -1) {
                                    break;
                                }
                                r7.write(cArr, 0, read);
                            } catch (IOException unused) {
                            }
                        }
                    } else {
                        r7.write(value.toString());
                    }
                    z2 = false;
                }
                bufferedWriter.flush();
                gZIPOutputStream.close();
                QJ.getResponseCode();
                QJ.getInputStream().close();
                QJ.disconnect();
                z = true;
            } catch (Throwable th) {
                try {
                    throw new AnonymousClass02K("Error while sending report to Http Post Form.", th);
                } catch (AnonymousClass02K e) {
                    if (!z) {
                        throw e;
                    }
                    C000600f.m83R("ACRA", e, "ReportSender of class %s failed but other senders completed their task. ACRA will not send this report again.", r6.getClass().getName());
                }
            }
        }
    }

    /* renamed from: L */
    public static void m30L(String str, Throwable th) {
        if (str == null) {
            str = "???";
        }
        try {
            C000600f.m75J("ACRA", th, "internal ACRA error: %s: ", str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: M */
    private void m31M(AnonymousClass01R r5) {
        String str = (String) r5.get("REPORT_ID");
        if (str == null || str.length() == 0) {
            for (Entry entry : this.f56L.entrySet()) {
                if (r5.get(entry.getKey()) == null) {
                    r5.put(entry.getKey(), entry.getValue());
                }
            }
        }
        String str2 = this.f58N;
        String str3 = (String) r5.get("UID");
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            r5.put("UID", str2);
        }
    }

    /* renamed from: N */
    private static void m32N(AnonymousClass01R r2) {
        for (Entry value : r2.f214D.entrySet()) {
            AnonymousClass02R r1 = (AnonymousClass02R) value.getValue();
            if (!(r1 == null || r1.f368B == null)) {
                try {
                    r1.f368B.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: O */
    private void m33O(AnonymousClass00P... r6) {
        for (AnonymousClass00P r1 : r6) {
            if (r1 == AnonymousClass00P.NATIVE_CRASH_REPORT || r1 == AnonymousClass00P.ACRA_CRASH_REPORT) {
                if (mo21F(r1) > 0) {
                    m24F(this.f57M.getDir("traces", 0), null);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.01b] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.01b] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v3
      assigns: []
      uses: []
      mth insns count: 212
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3 A[SYNTHETIC, Splitter:B:42:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b8 A[SYNTHETIC, Splitter:B:51:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c9 A[Catch:{ Throwable -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e6 A[SYNTHETIC, Splitter:B:61:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014f A[SYNTHETIC, Splitter:B:89:0x014f] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0170 A[Catch:{ all -> 0x01b5, Throwable -> 0x0141 }] */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34P(java.lang.Throwable r18, p000X.AnonymousClass01R r19, java.lang.String r20, int r21) {
        /*
            r17 = this;
            r11 = r20
            r2 = 1
            r8 = 0
            r5 = r17
            boolean r0 = r5.f61Q
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r1 = f43c
            monitor-enter(r1)
            r1.notify()     // Catch:{ all -> 0x01c8 }
            monitor-exit(r1)     // Catch:{ all -> 0x01c8 }
            r12 = r18
            r1 = r12
            boolean r0 = r12 instanceof p000X.C004301t
            if (r0 == 0) goto L_0x004b
        L_0x0018:
            java.lang.Class r4 = r1.getClass()
            X.01R r13 = new X.01R
            r13.<init>()
            r0 = r21 & 4
            if (r0 == 0) goto L_0x0029
            r21 = r21 & -4
            r13.f215E = r2
        L_0x0029:
            boolean r0 = r12 instanceof p000X.C004301t
            if (r0 == 0) goto L_0x0048
            r0 = r12
            X.01t r0 = (p000X.C004301t) r0
            java.lang.String r3 = r0.mo113xJ()
        L_0x0034:
            java.lang.String r2 = "ACRA"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Handling exception for "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            m40V(r2, r0, r12)
            goto L_0x0056
        L_0x0048:
            java.lang.String r3 = "crash"
            goto L_0x0034
        L_0x004b:
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto L_0x0018
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x004b
        L_0x0056:
            X.00P r1 = p000X.AnonymousClass00P.ACRA_CRASH_REPORT     // Catch:{ Throwable -> 0x005f }
            android.content.Context r0 = r5.f57M     // Catch:{ Throwable -> 0x005f }
            X.00W r1 = r1.mo22A(r0)     // Catch:{ Throwable -> 0x005f }
            goto L_0x0067
        L_0x005f:
            r1 = move-exception
            r13.f213C = r1     // Catch:{ all -> 0x01b8 }
            r0 = 0
            m30L(r0, r1)     // Catch:{ all -> 0x01b8 }
            r1 = r8
        L_0x0067:
            if (r1 == 0) goto L_0x0088
            r3 = r8
            r7 = r8
            r6 = r8
        L_0x006c:
            if (r3 != 0) goto L_0x008b
            java.util.UUID r6 = m22D()     // Catch:{ Throwable -> 0x007f }
            java.lang.String r0 = ".stacktrace"
            java.lang.String r7 = m21C(r5, r4, r6, r0)     // Catch:{ Throwable -> 0x007f }
            java.io.File r0 = r5.f67W     // Catch:{ Throwable -> 0x007f }
            X.01b r3 = r1.mo27A(r7, r0)     // Catch:{ Throwable -> 0x007f }
            goto L_0x006c
        L_0x007f:
            r1 = move-exception
            r13.f213C = r1     // Catch:{ all -> 0x01bc }
            r0 = 0
            m30L(r0, r1)     // Catch:{ all -> 0x01bc }
            r7 = r8
            goto L_0x008b
        L_0x0088:
            r3 = r8
            r7 = r8
            r6 = r8
        L_0x008b:
            if (r3 == 0) goto L_0x00a0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0099 }
            java.io.RandomAccessFile r0 = r3.f247B     // Catch:{ Throwable -> 0x0099 }
            java.io.FileDescriptor r0 = r0.getFD()     // Catch:{ Throwable -> 0x0099 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0099 }
            goto L_0x00a1
        L_0x0099:
            r1 = move-exception
            r13.f213C = r1     // Catch:{ all -> 0x01bc }
            r0 = 0
            m30L(r0, r1)     // Catch:{ all -> 0x01bc }
        L_0x00a0:
            r2 = r8
        L_0x00a1:
            if (r2 == 0) goto L_0x00b5
            java.io.Writer r14 = p000X.AnonymousClass01R.m215B(r2)     // Catch:{ Throwable -> 0x00a8 }
            goto L_0x00b6
        L_0x00a8:
            r1 = move-exception
            r13.f213C = r1     // Catch:{ all -> 0x00b0 }
            r0 = 0
            m30L(r0, r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x00b5
        L_0x00b0:
            r0 = move-exception
            r14 = r8
            r8 = r2
            goto L_0x01be
        L_0x00b5:
            r14 = r8
        L_0x00b6:
            if (r6 != 0) goto L_0x00bc
            java.util.UUID r6 = m22D()     // Catch:{ Throwable -> 0x0131 }
        L_0x00bc:
            java.lang.String r1 = "ACRA_REPORT_TYPE"
            X.00P r0 = p000X.AnonymousClass00P.ACRA_CRASH_REPORT     // Catch:{ Throwable -> 0x0131 }
            java.lang.String r0 = r0.name()     // Catch:{ Throwable -> 0x0131 }
            m25G(r1, r0, r13, r14)     // Catch:{ Throwable -> 0x0131 }
            if (r7 == 0) goto L_0x00ce
            java.lang.String r0 = "ACRA_REPORT_FILENAME"
            m25G(r0, r7, r13, r14)     // Catch:{ Throwable -> 0x0131 }
        L_0x00ce:
            java.lang.String r1 = "REPORT_ID"
            java.lang.String r0 = r6.toString()     // Catch:{ Throwable -> 0x0131 }
            m25G(r1, r0, r13, r14)     // Catch:{ Throwable -> 0x0131 }
            java.lang.String r1 = "EXCEPTION_CAUSE"
            java.lang.String r0 = r4.getName()     // Catch:{ Throwable -> 0x0131 }
            m25G(r1, r0, r13, r14)     // Catch:{ Throwable -> 0x0131 }
            java.lang.String r11 = m39U(r12)     // Catch:{ Throwable -> 0x00e4 }
        L_0x00e4:
            if (r19 == 0) goto L_0x0127
            java.util.Set r0 = r19.entrySet()     // Catch:{ Throwable -> 0x0121 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Throwable -> 0x0121 }
        L_0x00ee:
            boolean r0 = r6.hasNext()     // Catch:{ Throwable -> 0x0121 }
            if (r0 == 0) goto L_0x0127
            java.lang.Object r4 = r6.next()     // Catch:{ Throwable -> 0x0121 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Throwable -> 0x0121 }
            java.lang.Object r0 = r4.getKey()     // Catch:{ Throwable -> 0x0121 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0121 }
            boolean r0 = p000X.C003301j.m253K(r0, r13)     // Catch:{ Throwable -> 0x0121 }
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r1 = r4.getKey()     // Catch:{ Throwable -> 0x0116 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0116 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ Throwable -> 0x0116 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0116 }
            m25G(r1, r0, r13, r14)     // Catch:{ Throwable -> 0x0116 }
            goto L_0x00ee
        L_0x0116:
            r1 = move-exception
            java.lang.Object r0 = r4.getKey()     // Catch:{ Throwable -> 0x0121 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0121 }
            p000X.C003301j.m252J(r13, r0, r1)     // Catch:{ Throwable -> 0x0121 }
            goto L_0x00ee
        L_0x0121:
            r1 = move-exception
            java.lang.String r0 = "pre-populating fields from draft"
            m30L(r0, r1)     // Catch:{ Throwable -> 0x0131 }
        L_0x0127:
            X.00D r10 = r5.f55K     // Catch:{ Throwable -> 0x0131 }
            r15 = 0
            r16 = 1
            r9 = r5
            p000X.C003301j.m244B(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x0131 }
            goto L_0x014d
        L_0x0131:
            r4 = move-exception
            java.lang.String r0 = "gathering crash data"
            m30L(r0, r4)     // Catch:{ all -> 0x01b5 }
            java.lang.String r1 = "ACRA_INTERNAL"
            java.lang.String r0 = m39U(r4)     // Catch:{ Throwable -> 0x0141 }
            m25G(r1, r0, r13, r14)     // Catch:{ Throwable -> 0x0141 }
            goto L_0x014d
        L_0x0141:
            r1 = move-exception
            r0 = 0
            m30L(r0, r1)     // Catch:{ all -> 0x01b5 }
            java.lang.String r1 = "ACRA_INTERNAL"
            java.lang.String r0 = "ACRA_INTERNAL=java.lang.Exception: An exception occurred while trying to collect data about an ACRA internal error\n\tat com.facebook.acra.ErrorReporter.handleException(ErrorReporter.java:810)\n\tat com.facebook.acra.ErrorReporter.handleException(ErrorReporter.java:866)\n\tat com.facebook.acra.ErrorReporter.uncaughtException(ErrorReporter.java:666)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:693)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:690)\n"
            m25G(r1, r0, r13, r14)     // Catch:{ all -> 0x01b5 }
        L_0x014d:
            if (r14 == 0) goto L_0x016c
            r14.flush()     // Catch:{ Throwable -> 0x0165 }
            if (r2 == 0) goto L_0x0157
            r2.flush()     // Catch:{ Throwable -> 0x0165 }
        L_0x0157:
            java.io.RandomAccessFile r0 = r3.f247B     // Catch:{ Throwable -> 0x0165 }
            java.nio.channels.FileChannel r4 = r0.getChannel()     // Catch:{ Throwable -> 0x0165 }
            long r0 = r4.position()     // Catch:{ Throwable -> 0x0165 }
            r4.truncate(r0)     // Catch:{ Throwable -> 0x0165 }
            goto L_0x016c
        L_0x0165:
            r1 = move-exception
            r13.f213C = r1     // Catch:{ all -> 0x01b5 }
            r0 = 0
            m30L(r0, r1)     // Catch:{ all -> 0x01b5 }
        L_0x016c:
            java.lang.Throwable r0 = r13.f213C     // Catch:{ all -> 0x01b5 }
            if (r0 == 0) goto L_0x017b
            java.lang.String r1 = "GENERATING_IO_ERROR"
            java.lang.Throwable r0 = r13.f213C     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01b5 }
            m25G(r1, r0, r13, r14)     // Catch:{ all -> 0x01b5 }
        L_0x017b:
            java.lang.Throwable r0 = r13.f213C     // Catch:{ all -> 0x01b5 }
            if (r0 == 0) goto L_0x0185
            r0 = r21 & 4
            if (r0 != 0) goto L_0x0185
            r21 = r21 | 1
        L_0x0185:
            r0 = r21 & 1
            if (r0 == 0) goto L_0x01aa
            java.lang.String r1 = "SENT_IMMEDIATELY"
            java.lang.String r0 = "true"
            r13.put(r1, r0)     // Catch:{ Throwable -> 0x01a4 }
            X.01i r4 = new X.01i     // Catch:{ Throwable -> 0x01a4 }
            r0 = 0
            r4.<init>(r5, r13, r3, r0)     // Catch:{ Throwable -> 0x01a4 }
            r0 = r21 & 2
            if (r0 == 0) goto L_0x019e
            r4.mo92A()     // Catch:{ Throwable -> 0x01a4 }
            goto L_0x01aa
        L_0x019e:
            r4.start()     // Catch:{ Throwable -> 0x01a2 }
            goto L_0x01ab
        L_0x01a2:
            r0 = move-exception
            throw r0     // Catch:{ Throwable -> 0x01a4 }
        L_0x01a4:
            r1 = move-exception
            java.lang.String r0 = "sending in-memory report"
            m30L(r0, r1)     // Catch:{ all -> 0x01b5 }
        L_0x01aa:
            r8 = r3
        L_0x01ab:
            m28J(r14)
            m28J(r2)
            m28J(r8)
            return
        L_0x01b5:
            r0 = move-exception
            r8 = r2
            goto L_0x01be
        L_0x01b8:
            r0 = move-exception
            r14 = r8
            r3 = r8
            goto L_0x01be
        L_0x01bc:
            r0 = move-exception
            r14 = r8
        L_0x01be:
            m28J(r14)
            m28J(r8)
            m28J(r3)
            throw r0
        L_0x01c8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01c8 }
            throw r0
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass00G.m34P(java.lang.Throwable, X.01R, java.lang.String, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[Catch:{ Throwable -> 0x0070, all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[Catch:{ Throwable -> 0x0070, all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9 A[SYNTHETIC, Splitter:B:31:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6 A[SYNTHETIC, Splitter:B:41:0x00d6] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m35Q(p000X.AnonymousClass00P r15, p000X.AnonymousClass01R r16, p000X.C003401k r17, p000X.C003801o r18) {
        /*
            r14 = this;
            r12 = 0
            r5 = 1
            r13 = 0
            r3 = r17
            if (r18 == 0) goto L_0x0022
            java.io.File r1 = r18.mo105A()     // Catch:{ all -> 0x00d2 }
            java.lang.String r4 = r1.getCanonicalPath()     // Catch:{ all -> 0x00d2 }
            X.00P r0 = p000X.AnonymousClass00P.ANR_REPORT     // Catch:{ all -> 0x00d2 }
            if (r15 != r0) goto L_0x0018
            java.util.Set r0 = r14.f48D     // Catch:{ all -> 0x00d2 }
            r0.add(r4)     // Catch:{ all -> 0x00d2 }
        L_0x0018:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x00d2 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d2 }
            java.io.Writer r11 = p000X.AnonymousClass01R.m215B(r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x0029
        L_0x0022:
            java.io.File r0 = r3.f269C     // Catch:{ all -> 0x00d2 }
            java.lang.String r4 = r0.getName()     // Catch:{ all -> 0x00d2 }
            r11 = r12
        L_0x0029:
            X.01R r10 = new X.01R     // Catch:{ all -> 0x00d0 }
            r10.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r15.f87B     // Catch:{ all -> 0x00d0 }
            r1 = r16
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r15.f87B     // Catch:{ all -> 0x00d0 }
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r15.f87B     // Catch:{ all -> 0x00d0 }
            r10.mo79E(r0, r2, r11)     // Catch:{ all -> 0x00d0 }
        L_0x0041:
            X.00P r0 = p000X.AnonymousClass00P.ANR_REPORT     // Catch:{ all -> 0x00d0 }
            if (r15 != r0) goto L_0x0053
            java.lang.String r0 = "PROCESS_NAME"
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x0053
            r10.mo79E(r0, r2, r11)     // Catch:{ all -> 0x00d0 }
            goto L_0x0054
        L_0x0053:
            r13 = 1
        L_0x0054:
            java.lang.String r2 = "ACRA_REPORT_TYPE"
            java.lang.String r0 = r15.name()     // Catch:{ Throwable -> 0x0070 }
            r10.mo79E(r2, r0, r11)     // Catch:{ Throwable -> 0x0070 }
            X.00D r7 = r14.f55K     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r8 = "crash attachment"
            X.024 r9 = new X.024     // Catch:{ Throwable -> 0x0070 }
            r9.<init>()     // Catch:{ Throwable -> 0x0070 }
            X.00P r0 = p000X.AnonymousClass00P.NATIVE_CRASH_REPORT     // Catch:{ Throwable -> 0x0070 }
            if (r15 != r0) goto L_0x006b
            r12 = r3
        L_0x006b:
            r6 = r14
            p000X.C003301j.m244B(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Throwable -> 0x0070 }
            goto L_0x0088
        L_0x0070:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "retrieve exception: "
            r2.<init>(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x00d0 }
            r2.append(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "REPORT_LOAD_THROW"
            m25G(r0, r2, r10, r11)     // Catch:{ all -> 0x00d0 }
        L_0x0088:
            java.lang.String r3 = "REPORT_ID"
            r2 = 0
            r0 = 46
            int r0 = r4.lastIndexOf(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r4.substring(r2, r0)     // Catch:{ all -> 0x00d0 }
            r10.mo79E(r3, r0, r11)     // Catch:{ all -> 0x00d0 }
            r0 = 0
            r10.mo77C(r1, r0, r11)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "APP_VERSION_CODE"
            r10.mo78D(r1, r0, r11)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "APP_VERSION_NAME"
            r10.mo78D(r1, r0, r11)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "ASL_SESSION_ID"
            r10.mo78D(r1, r0, r11)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "EXCEPTION_CAUSE"
            java.lang.String r0 = "crash attachment"
            r10.mo79E(r1, r0, r11)     // Catch:{ all -> 0x00d0 }
            if (r11 != 0) goto L_0x00b7
            m29K(r14, r10)     // Catch:{ all -> 0x00d0 }
        L_0x00b7:
            if (r11 == 0) goto L_0x00cf
            r11.close()     // Catch:{ IOException -> 0x00bd }
            return r5
        L_0x00bd:
            r4 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "IO Exception"
            p000X.C000600f.m74I(r1, r4, r0)
            java.lang.String r3 = "ANRValidationError<IOException::Non-cached>"
            java.lang.String r2 = r4.toString()
            r0 = 0
            m27I(r4, r3, r2, r0, r14)
        L_0x00cf:
            return r5
        L_0x00d0:
            r5 = move-exception
            goto L_0x00d4
        L_0x00d2:
            r5 = move-exception
            r11 = r12
        L_0x00d4:
            if (r11 == 0) goto L_0x00ec
            r11.close()     // Catch:{ IOException -> 0x00da }
            goto L_0x00ec
        L_0x00da:
            r4 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "IO Exception"
            p000X.C000600f.m74I(r1, r4, r0)
            java.lang.String r3 = "ANRValidationError<IOException::Non-cached>"
            java.lang.String r2 = r4.toString()
            r0 = 0
            m27I(r4, r3, r2, r0, r14)
        L_0x00ec:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass00G.m35Q(X.00P, X.01R, X.01k, X.01o):int");
    }

    /* renamed from: R */
    private boolean m36R(AnonymousClass00P r3) {
        if (r3 == AnonymousClass00P.NATIVE_CRASH_REPORT) {
            Iterator it = this.f68X.iterator();
            if (!it.hasNext()) {
                return false;
            }
            it.next();
        }
        return true;
    }

    /* renamed from: S */
    private static String m37S(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(21);
        int read = bufferedInputStream.read();
        char[] cArr = new char[20];
        int i = 0;
        while (true) {
            if (read != -1 && i < 20 && read != 10) {
                if (!Character.isDigit(read) && read != 46) {
                    bufferedInputStream.reset();
                    i = 0;
                    break;
                }
                int i2 = i + 1;
                cArr[i] = (char) read;
                read = bufferedInputStream.read();
                i = i2;
            } else {
                break;
            }
        }
        return new String(cArr, 0, i);
    }

    /* renamed from: T */
    private boolean m38T(AnonymousClass00P r4) {
        return new File(this.f57M.getDir(r4.f89D, 0), ".noupload").exists();
    }

    /* renamed from: U */
    private static String m39U(Throwable th) {
        if (th == null) {
            th = new Exception("Report requested by developer");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    /* renamed from: V */
    private static void m40V(String str, String str2, Throwable th) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[0];
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            StackTraceElement stackTraceElement2 = stackTrace[i];
            if (!stackTraceElement2.getClassName().equals(stackTraceElement.getClassName()) || !stackTraceElement2.getMethodName().equals(stackTraceElement.getMethodName())) {
                i++;
            } else {
                C000600f.m74I("ErrorReporter", th, "Unable to log over log bridge due to exception.");
                return;
            }
        }
        C000600f.m75J(str, th, "%s", str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b5, code lost:
        if (r4 != null) goto L_0x00b7;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15A(p000X.AnonymousClass00P r14, java.lang.String r15, java.io.File r16, p000X.C003801o r17) {
        /*
            r13 = this;
            r4 = 0
            r9 = r14
            boolean r0 = r13.m38T(r14)
            if (r0 != 0) goto L_0x00cc
            r7 = r16
            if (r15 != 0) goto L_0x0016
            if (r16 != 0) goto L_0x0016
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "stackTrace and traceFile can't be null at the same time"
            r1.<init>(r0)
            throw r1
        L_0x0016:
            if (r15 == 0) goto L_0x005f
            X.01R r5 = new X.01R     // Catch:{ Throwable -> 0x0074 }
            r5.<init>()     // Catch:{ Throwable -> 0x0074 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0074 }
            java.lang.String r1 = "TIME_OF_CRASH"
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ Throwable -> 0x0074 }
            r5.put(r1, r0)     // Catch:{ Throwable -> 0x0074 }
            byte[] r0 = r15.getBytes()     // Catch:{ IOException -> 0x0038 }
            java.lang.String r1 = p000X.AnonymousClass02M.m305B(r0)     // Catch:{ IOException -> 0x0038 }
            java.lang.String r0 = r14.f87B     // Catch:{ IOException -> 0x0038 }
            r5.put(r0, r1)     // Catch:{ IOException -> 0x0038 }
            goto L_0x005a
        L_0x0038:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{ Throwable -> 0x0074 }
            java.lang.String r2 = "REPORT_LOAD_THROW"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0074 }
            java.lang.String r0 = "throwable: "
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0074 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ Throwable -> 0x0074 }
            r1.append(r0)     // Catch:{ Throwable -> 0x0074 }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x0074 }
            r5.put(r2, r0)     // Catch:{ Throwable -> 0x0074 }
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "Could not load crash report. File will be deleted."
            p000X.C000600f.m74I(r1, r3, r0)     // Catch:{ Throwable -> 0x0074 }
        L_0x005a:
            r13.m31M(r5)     // Catch:{ Throwable -> 0x0074 }
            r4 = r5
            goto L_0x006d
        L_0x005f:
            if (r16 == 0) goto L_0x006d
            boolean r12 = r13.m36R(r14)     // Catch:{ Throwable -> 0x0074 }
            r8 = 0
            long r10 = r14.f88C     // Catch:{ Throwable -> 0x0074 }
            r6 = r13
            X.01R r4 = m23E(r6, r7, r8, r9, r10, r12)     // Catch:{ Throwable -> 0x0074 }
        L_0x006d:
            r0 = 0
            r1 = r17
            r13.m35Q(r14, r4, r0, r1)     // Catch:{ Throwable -> 0x0074 }
            goto L_0x00b5
        L_0x0074:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "Failed to build cached crash report"
            r2.<init>(r0)     // Catch:{ all -> 0x00c0 }
            if (r16 == 0) goto L_0x0086
            r0 = 32
            r2.append(r0)     // Catch:{ all -> 0x00c0 }
            r2.append(r7)     // Catch:{ all -> 0x00c0 }
        L_0x0086:
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00c0 }
            p000X.C000600f.m74I(r1, r5, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "ANRValidationError<"
            r1.<init>(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.Class r0 = r5.getClass()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x00c0 }
            r1.append(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "::Non-cached>"
            r1.append(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x00c0 }
            r0 = 0
            m27I(r5, r3, r2, r0, r13)     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x00ba
            goto L_0x00b7
        L_0x00b5:
            if (r4 == 0) goto L_0x00ba
        L_0x00b7:
            m32N(r4)
        L_0x00ba:
            if (r16 == 0) goto L_0x00cc
            m20B(r7)
            return
        L_0x00c0:
            r0 = move-exception
            if (r4 == 0) goto L_0x00c6
            m32N(r4)
        L_0x00c6:
            if (r16 == 0) goto L_0x00cb
            m20B(r7)
        L_0x00cb:
            throw r0
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass00G.mo15A(X.00P, java.lang.String, java.io.File, X.01o):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r2 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        throw r1;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16B(p000X.AnonymousClass00P r9) {
        /*
            r8 = this;
            r6 = 1
            r7 = 0
            android.content.Context r1 = r8.f57M
            r3 = 0
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r9.f89D
            java.io.File r1 = r1.getDir(r0, r3)
            java.lang.String r0 = "report_count"
            r2.<init>(r1, r0)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x004d }
            java.lang.String r0 = "r"
            r4.<init>(r2, r0)     // Catch:{ IOException -> 0x004d }
            r2 = 0
            r0 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ Throwable -> 0x003a }
            byte[] r0 = r1.array()     // Catch:{ Throwable -> 0x003a }
            r4.read(r0)     // Catch:{ Throwable -> 0x003a }
            r1.getLong()     // Catch:{ Throwable -> 0x003a }
            r1.getInt()     // Catch:{ Throwable -> 0x003a }
            int r0 = r1.getInt()     // Catch:{ Throwable -> 0x003a }
            X.025 r5 = new X.025     // Catch:{ Throwable -> 0x003a }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x005a
        L_0x003a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0045
            r4.close()     // Catch:{ Throwable -> 0x0043 }
            goto L_0x004c
        L_0x0043:
            r0 = move-exception
            goto L_0x0049
        L_0x0045:
            r4.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004c
        L_0x0049:
            p000X.AnonymousClass01A.m182B(r2, r0)     // Catch:{ IOException -> 0x004d }
        L_0x004c:
            throw r1     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r2 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "Failed to get crash report count"
            p000X.C000600f.m74I(r1, r2, r0)
            X.025 r5 = new X.025
            r5.<init>(r3)
        L_0x005a:
            int r1 = r5.f339B
            r0 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            if (r1 < r0) goto L_0x0063
            r4 = 1
        L_0x0063:
            if (r4 == 0) goto L_0x0076
            java.lang.String r3 = "ErrorReporter"
            java.lang.String r2 = "Maximum daily sent crash reports threshold reached, Not storing count=%d"
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r0 = r5.f339B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r7] = r0
            p000X.C000600f.m73H(r3, r2, r1)
        L_0x0076:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass00G.mo16B(X.00P):boolean");
    }

    /* renamed from: C */
    public final void mo17C(Throwable th, AnonymousClass01R r4) {
        m34P(th, r4, null, 1);
    }

    /* renamed from: CP */
    public final void mo18CP(Throwable th) {
        Throwable th2;
        if (!mo16B(AnonymousClass00P.ACRA_CRASH_REPORT)) {
            synchronized (f43c) {
                boolean z = false;
                while (true) {
                    try {
                        this.f65U = null;
                        m33O(AnonymousClass00P.ACRA_CRASH_REPORT);
                        if (VERSION.SDK_INT >= 9) {
                            AnonymousClass023.m292B();
                        }
                    } catch (Throwable th3) {
                        m30L(null, th3);
                    }
                    try {
                        C000600f.m73H("ACRA", "ACRA caught a %s exception for %s version %s. Building report.", th.getClass().getSimpleName(), this.f57M.getPackageName(), this.f51G);
                    } catch (Throwable th4) {
                        m30L(null, th4);
                    }
                    TreeMap treeMap = new TreeMap();
                    AnonymousClass016 r8 = (AnonymousClass016) this.f59O.get();
                    int i = 0;
                    while (true) {
                        th2 = th;
                        for (AnonymousClass016 r5 = r8; r5 != null && th2 != null; r5 = r5.f160B) {
                            try {
                                th2 = r5.mo58A(th2, treeMap);
                            } catch (Throwable th5) {
                                C000600f.m83R("ACRA", th5, "ignoring error in exception translation hook %s", r5);
                            }
                        }
                        if (th2 == th) {
                            break;
                        }
                        i++;
                        if (i >= 4) {
                            break;
                        }
                        th = th2;
                    }
                    if (th2 == null) {
                        break;
                    }
                    int i2 = 3;
                    if (z) {
                        i2 = 4;
                    }
                    Throwable th6 = th2;
                    if (!(th2 instanceof C004301t)) {
                        while (th6.getCause() != null) {
                            th6 = th6.getCause();
                        }
                    }
                    if (th6 instanceof OutOfMemoryError) {
                        i2 &= -2;
                    }
                    m34P(th2, new AnonymousClass01R(treeMap), null, i2);
                    break;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x022e, code lost:
        if (r2.equals("false") == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03ff, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0400, code lost:
        if (r2 != null) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0406, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0407, code lost:
        p000X.AnonymousClass01A.m182B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x040b, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x040e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0418, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0419, code lost:
        if (r5 != null) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x041b, code lost:
        if (r20 != null) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0421, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        p000X.AnonymousClass01A.m182B(r20, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0428, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x042b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x042e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x042f, code lost:
        if (r21 != null) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0435, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0436, code lost:
        p000X.AnonymousClass01A.m182B(r21, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x043c, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x043f, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fc A[ADDED_TO_REGION, Catch:{ Throwable -> 0x0421 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0109 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0115 A[Catch:{ Throwable -> 0x0421 }] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19D(p000X.AnonymousClass00P... r36) {
        /*
            r35 = this;
            r25 = 0
            java.lang.Object r1 = f43c
            monitor-enter(r1)
            r1.notify()     // Catch:{ all -> 0x0453 }
            monitor-exit(r1)     // Catch:{ all -> 0x0453 }
            r4 = r35
            r26 = r36
            r0 = r26
            r4.m33O(r0)
            int r0 = r0.length
            r34 = r0
            r7 = 0
            r24 = 0
        L_0x0018:
            r0 = r34
            if (r7 >= r0) goto L_0x0440
            r8 = r36[r7]
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r1 - r24
            r0 = r25
            int r9 = java.lang.Math.max(r0, r1)
            X.00R r0 = r8.f90E
            if (r0 == 0) goto L_0x009d
            r2 = 0
            X.00R r0 = r8.f90E
            if (r0 != 0) goto L_0x003a
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "ErrorReporter::checkAndHandleReportsLocked report type requires a handler"
            r1.<init>(r0)
            throw r1
        L_0x003a:
            android.content.Context r0 = r4.f57M
            java.lang.String r10 = p000X.C003301j.m248F(r0)
            if (r10 != 0) goto L_0x0044
            java.lang.String r10 = "n/a"
        L_0x0044:
            android.content.Context r0 = r4.f57M
            X.00b r12 = p000X.AnonymousClass00P.m51B(r8, r0)
            r3 = 0
            r0 = 0
        L_0x004c:
            boolean r1 = r12.hasNext()     // Catch:{ Throwable -> 0x03fd }
            if (r1 == 0) goto L_0x03dd
            if (r0 >= r9) goto L_0x03dd
            X.01k r5 = r12.next()     // Catch:{ Throwable -> 0x03fd }
            int r11 = r3 + 1
            r1 = 5
            if (r3 < r1) goto L_0x0068
            java.io.File r1 = r5.f269C     // Catch:{ Throwable -> 0x03e9, all -> 0x03e6 }
            m20B(r1)     // Catch:{ Throwable -> 0x03e9, all -> 0x03e6 }
            if (r5 == 0) goto L_0x0094
            r5.close()     // Catch:{ Throwable -> 0x03fd }
            goto L_0x0094
        L_0x0068:
            java.io.File r1 = r5.f269C     // Catch:{ IOException -> 0x006f }
            java.lang.String r6 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x006f }
            goto L_0x0070
        L_0x006f:
            r6 = r2
        L_0x0070:
            X.00P r1 = p000X.AnonymousClass00P.CACHED_ANR_REPORT     // Catch:{ Throwable -> 0x03e9, all -> 0x03e6 }
            if (r8 != r1) goto L_0x008b
            java.util.Set r1 = r4.f48D     // Catch:{ Throwable -> 0x03e9, all -> 0x03e6 }
            boolean r1 = r1.contains(r6)     // Catch:{ Throwable -> 0x03e9, all -> 0x03e6 }
            if (r1 == 0) goto L_0x008b
            r3 = 1
            java.util.Set r1 = r4.f48D     // Catch:{ Throwable -> 0x03e9, all -> 0x03e6 }
            r1.remove(r6)     // Catch:{ Throwable -> 0x03e9, all -> 0x03e6 }
        L_0x0082:
            X.00R r1 = r8.f90E     // Catch:{ Throwable -> 0x03e9, all -> 0x03e6 }
            boolean r1 = r1.mo23BP(r4, r5, r10, r3)     // Catch:{ Throwable -> 0x03e9, all -> 0x03e6 }
            if (r1 != 0) goto L_0x008d
            goto L_0x0096
        L_0x008b:
            r3 = 0
            goto L_0x0082
        L_0x008d:
            int r0 = r0 + 1
            if (r5 == 0) goto L_0x0094
            r5.close()     // Catch:{ Throwable -> 0x03fd }
        L_0x0094:
            r3 = r11
            goto L_0x004c
        L_0x0096:
            if (r5 == 0) goto L_0x03dd
            r5.close()     // Catch:{ Throwable -> 0x03fd }
            goto L_0x03dd
        L_0x009d:
            r23 = 0
            r6 = 0
            boolean r0 = r4.m38T(r8)
            if (r0 == 0) goto L_0x00ac
            r23 = 0
        L_0x00a8:
            int r24 = r24 + r23
            goto L_0x03e2
        L_0x00ac:
            X.00P r0 = p000X.AnonymousClass00P.NATIVE_CRASH_REPORT
            if (r8 != r0) goto L_0x00ec
            android.content.Context r1 = r4.f57M
            java.lang.String r0 = "android_acra_save_native_reports"
            boolean r0 = p000X.AnonymousClass01G.m192B(r1, r0)
            if (r0 == 0) goto L_0x00ec
            r10 = 0
            r3 = 0
            android.content.Context r2 = r4.f57M     // Catch:{ NullPointerException -> 0x00dc }
            java.lang.String r1 = r8.f89D     // Catch:{ NullPointerException -> 0x00dc }
            r0 = 0
            java.io.File r0 = r2.getDir(r1, r0)     // Catch:{ NullPointerException -> 0x00dc }
            java.io.File r6 = new java.io.File     // Catch:{ NullPointerException -> 0x00dc }
            java.lang.String r1 = r0.getParent()     // Catch:{ NullPointerException -> 0x00dc }
            java.lang.String r0 = "reported_crashes"
            r6.<init>(r1, r0)     // Catch:{ NullPointerException -> 0x00dc }
            boolean r0 = r6.exists()     // Catch:{ NullPointerException -> 0x00da }
            if (r0 != 0) goto L_0x00ec
            r6.mkdir()     // Catch:{ NullPointerException -> 0x00da }
            goto L_0x00ec
        L_0x00da:
            r5 = move-exception
            goto L_0x00de
        L_0x00dc:
            r5 = move-exception
            r6 = r3
        L_0x00de:
            java.lang.String r3 = "ACRA"
            java.lang.String r2 = "Failed to create backup directory %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "reported_crashes"
            r1[r10] = r0
            p000X.C000600f.m75J(r3, r5, r2, r1)
        L_0x00ec:
            android.content.Context r1 = r4.f57M
            X.00b r22 = p000X.AnonymousClass00P.m51B(r8, r1)
            r21 = 0
            r1 = 0
            r2 = 0
        L_0x00f6:
            boolean r0 = r22.hasNext()     // Catch:{ Throwable -> 0x042c }
            if (r0 == 0) goto L_0x03ae
            if (r1 >= r9) goto L_0x03ae
            X.01k r5 = r22.next()     // Catch:{ Throwable -> 0x042c }
            r20 = 0
            int r19 = r2 + 1
            r0 = 5
            if (r2 < r0) goto L_0x0115
            java.io.File r0 = r5.f269C     // Catch:{ Throwable -> 0x0416 }
            m20B(r0)     // Catch:{ Throwable -> 0x0416 }
            if (r5 == 0) goto L_0x0355
            r5.close()     // Catch:{ Throwable -> 0x042c }
            goto L_0x0355
        L_0x0115:
            r18 = 0
            boolean r11 = r4.m36R(r8)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            long r2 = r8.f88C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.io.File r10 = r5.f269C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.io.RandomAccessFile r0 = r5.f268B     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r27 = r4
            r33 = r11
            r28 = r10
            r29 = r0
            r30 = r8
            r31 = r2
            X.01R r18 = m23E(r27, r28, r29, r30, r31, r33)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            X.00P r0 = p000X.AnonymousClass00P.NATIVE_CRASH_REPORT     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r8 != r0) goto L_0x02e3
            if (r11 != 0) goto L_0x0218
            java.io.File r11 = new java.io.File     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            android.content.Context r0 = r4.f57M     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r2 = r0.dataDir     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r0 = "core"
            r11.<init>(r2, r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            boolean r0 = r11.exists()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r0 == 0) goto L_0x0218
            java.io.File r13 = new java.io.File     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r0 = "/system/bin/app_process32"
            r13.<init>(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            boolean r0 = r13.exists()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r0 != 0) goto L_0x0160
            java.io.File r13 = new java.io.File     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r0 = "/system/bin/app_process"
            r13.<init>(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x0160:
            boolean r0 = r13.exists()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r0 == 0) goto L_0x0218
            long r14 = r11.lastModified()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.io.File r0 = r5.f269C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            long r2 = r0.lastModified()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            long r14 = r14 - r2
            long r14 = java.lang.Math.abs(r14)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r2 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0218
            android.content.Context r2 = r4.f57M     // Catch:{ Throwable -> 0x0190 }
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch:{ Throwable -> 0x0190 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ Throwable -> 0x0190 }
            r0 = 1
            android.net.NetworkInfo r0 = r2.getNetworkInfo(r0)     // Catch:{ Throwable -> 0x0190 }
            boolean r0 = r0.isConnected()     // Catch:{ Throwable -> 0x0190 }
            goto L_0x0199
        L_0x0190:
            r3 = move-exception
            java.lang.String r2 = "ACRA"
            java.lang.String r0 = "Error retrieving wifi state"
            m40V(r2, r0, r3)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r0 = 0
        L_0x0199:
            if (r0 == 0) goto L_0x0218
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            long r16 = r2 - r14
            java.io.File r10 = new java.io.File     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            android.content.Context r0 = r4.f57M     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r12 = r0.dataDir     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r0 = "core_dump_proccessed"
            r10.<init>(r12, r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            boolean r0 = r10.exists()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r0 == 0) goto L_0x01c1
            long r14 = r10.lastModified()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0218
        L_0x01c1:
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0200 }
            r14.<init>(r11)     // Catch:{ Exception -> 0x0200 }
            r0 = r18
            java.util.Map r15 = r0.f214D     // Catch:{ Exception -> 0x0200 }
            java.lang.String r12 = "CORE_DUMP"
            X.02R r0 = new X.02R     // Catch:{ Exception -> 0x0200 }
            r11.length()     // Catch:{ Exception -> 0x0200 }
            r0.<init>(r14)     // Catch:{ Exception -> 0x0200 }
            r15.put(r12, r0)     // Catch:{ Exception -> 0x0200 }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0200 }
            r14.<init>(r13)     // Catch:{ Exception -> 0x0200 }
            r0 = r18
            java.util.Map r15 = r0.f214D     // Catch:{ Exception -> 0x0200 }
            java.lang.String r12 = "APP_PROCESS_FILE"
            X.02R r0 = new X.02R     // Catch:{ Exception -> 0x0200 }
            r13.length()     // Catch:{ Exception -> 0x0200 }
            r0.<init>(r14)     // Catch:{ Exception -> 0x0200 }
            r15.put(r12, r0)     // Catch:{ Exception -> 0x0200 }
            boolean r0 = r10.exists()     // Catch:{ Exception -> 0x0200 }
            if (r0 != 0) goto L_0x01fc
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0200 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x0200 }
            r0.close()     // Catch:{ Exception -> 0x0200 }
            goto L_0x0218
        L_0x01fc:
            r10.setLastModified(r2)     // Catch:{ Exception -> 0x0200 }
            goto L_0x0218
        L_0x0200:
            r10 = move-exception
            java.lang.String r3 = "ACRA"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r0 = "Error openning core dump file: "
            r2.<init>(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r2.append(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r0 = r2.toString()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            m40V(r3, r0, r10)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x0218:
            X.01l r3 = new X.01l     // Catch:{ Exception -> 0x026d }
            java.io.RandomAccessFile r0 = r5.f268B     // Catch:{ Exception -> 0x026d }
            r3.<init>(r0)     // Catch:{ Exception -> 0x026d }
            java.lang.String r0 = "APP_STARTED_IN_BACKGROUND"
            java.lang.String r2 = r3.mo96B(r0)     // Catch:{ Exception -> 0x026d }
            if (r2 == 0) goto L_0x0230
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x026d }
            r10 = 1
            if (r0 != 0) goto L_0x0231
        L_0x0230:
            r10 = 0
        L_0x0231:
            r0 = -87110452(0xfffffffffacecccc, float:-5.3688346E35)
            java.lang.String r3 = r3.mo97C(r0)     // Catch:{ Exception -> 0x026d }
            if (r3 == 0) goto L_0x0243
            java.lang.String r0 = "Resumed"
            int r2 = r3.indexOf(r0)     // Catch:{ Exception -> 0x026d }
            r0 = -1
            if (r2 != r0) goto L_0x0250
        L_0x0243:
            if (r10 == 0) goto L_0x0275
            if (r3 == 0) goto L_0x0275
            java.lang.String r0 = "\"activities\":[]"
            int r2 = r3.indexOf(r0)     // Catch:{ Exception -> 0x026d }
            r0 = -1
            if (r2 == r0) goto L_0x0275
        L_0x0250:
            android.content.Context r3 = r4.f57M     // Catch:{ Exception -> 0x026d }
            java.lang.String r2 = "FacebookApplication"
            r0 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r2, r0)     // Catch:{ Exception -> 0x026d }
            android.content.SharedPreferences$Editor r11 = r0.edit()     // Catch:{ Exception -> 0x026d }
            java.lang.String r10 = "crash_foreground_timestamp"
            java.io.File r0 = r5.f269C     // Catch:{ Exception -> 0x026d }
            long r2 = r0.lastModified()     // Catch:{ Exception -> 0x026d }
            android.content.SharedPreferences$Editor r0 = r11.putLong(r10, r2)     // Catch:{ Exception -> 0x026d }
            r0.commit()     // Catch:{ Exception -> 0x026d }
            goto L_0x0275
        L_0x026d:
            r3 = move-exception
            java.lang.String r2 = "ACRA"
            java.lang.String r0 = "Error writing into the SharedPreferences"
            m40V(r2, r0, r3)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x0275:
            X.01l r10 = new X.01l     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.io.RandomAccessFile r0 = r5.f268B     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r10.<init>(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r0 = "session_id"
            java.lang.String r2 = r10.mo96B(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r0 != 0) goto L_0x028f
            java.lang.String r0 = "ASL_SESSION_ID"
            r11 = r18
            r11.put(r0, r2)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x028f:
            r0 = -87110917(0xfffffffffacecafb, float:-5.3686504E35)
            X.02U r3 = r10.mo95A(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r3 == 0) goto L_0x02ae
            int r2 = r3.f372C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r0 = 4
            if (r2 != r0) goto L_0x02ae
            java.io.RandomAccessFile r11 = r10.f271B     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            int r0 = r3.f371B     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            long r2 = (long) r0     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r11.seek(r2)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            int r0 = r10.mo98D()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            goto L_0x02af
        L_0x02ae:
            r0 = 0
        L_0x02af:
            if (r0 == 0) goto L_0x02bc
            java.lang.String r2 = "APP_VERSION_CODE"
            java.lang.String r0 = r0.toString()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r11 = r18
            r11.put(r2, r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x02bc:
            r0 = -87110916(0xfffffffffacecafc, float:-5.368651E35)
            java.lang.String r2 = r10.mo97C(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r0 != 0) goto L_0x02d0
            java.lang.String r0 = "APP_VERSION_NAME"
            r11 = r18
            r11.put(r0, r2)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x02d0:
            java.lang.String r0 = "breakpad_lib_name"
            java.lang.String r3 = r10.mo96B(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r0 != 0) goto L_0x02e3
            java.lang.String r2 = "BREAKPAD_LIB_NAME"
            r0 = r18
            r0.put(r2, r3)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x02e3:
            r3 = 0
            X.00P r0 = p000X.AnonymousClass00P.NATIVE_CRASH_REPORT     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r8 != r0) goto L_0x0306
            X.01l r2 = new X.01l     // Catch:{ IOException -> 0x02f6 }
            java.io.RandomAccessFile r0 = r5.f268B     // Catch:{ IOException -> 0x02f6 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x02f6 }
            java.lang.String r0 = "logcatFileName"
            java.lang.String r3 = r2.mo96B(r0)     // Catch:{ IOException -> 0x02f6 }
            goto L_0x0306
        L_0x02f6:
            r13 = move-exception
            java.lang.String r12 = "ACRA"
            java.lang.String r11 = "Failed to find logcat file %s"
            r0 = 1
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r2 = 0
            java.io.File r0 = r5.f269C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r10[r2] = r0     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            p000X.C000600f.m75J(r12, r13, r11, r10)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x0306:
            r0 = 0
            r12 = r18
            int r0 = r4.m35Q(r8, r12, r5, r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            int r23 = r23 + r0
            X.00P r0 = p000X.AnonymousClass00P.NATIVE_CRASH_REPORT     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r8 != r0) goto L_0x0337
            if (r6 == 0) goto L_0x0337
            boolean r0 = r6.exists()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            if (r0 == 0) goto L_0x0337
            java.io.File r2 = new java.io.File     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.io.File r0 = r5.f269C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.lang.String r0 = r0.getName()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r2.<init>(r6, r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r2.delete()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.io.File r0 = r5.f269C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r0.renameTo(r2)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.io.File r0 = r5.f269C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r0.getCanonicalPath()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r2.getCanonicalPath()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            goto L_0x0341
        L_0x0337:
            java.io.File r0 = r5.f269C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r0.getCanonicalPath()     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            java.io.File r0 = r5.f269C     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            m20B(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x0341:
            if (r3 == 0) goto L_0x034b
            java.io.File r0 = new java.io.File     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            r0.<init>(r3)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
            m20B(r0)     // Catch:{ 02K -> 0x0394, Throwable -> 0x0359 }
        L_0x034b:
            int r1 = r1 + 1
            m32N(r18)     // Catch:{ Throwable -> 0x0416 }
            if (r5 == 0) goto L_0x0355
            r5.close()     // Catch:{ Throwable -> 0x042c }
        L_0x0355:
            r2 = r19
            goto L_0x00f6
        L_0x0359:
            r8 = move-exception
            java.lang.String r9 = "ACRA"
            java.lang.String r3 = "Failed on crash attachment file %s"
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x040f }
            r1 = 0
            java.io.File r0 = r5.f269C     // Catch:{ all -> 0x040f }
            r2[r1] = r0     // Catch:{ all -> 0x040f }
            p000X.C000600f.m75J(r9, r8, r3, r2)     // Catch:{ all -> 0x040f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x040f }
            java.lang.String r0 = "ANRValidationError<"
            r1.<init>(r0)     // Catch:{ all -> 0x040f }
            java.lang.Class r0 = r8.getClass()     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x040f }
            r1.append(r0)     // Catch:{ all -> 0x040f }
            java.lang.String r0 = "::Non-cached>"
            r1.append(r0)     // Catch:{ all -> 0x040f }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x040f }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x040f }
            r0 = 0
            m27I(r8, r3, r2, r0, r4)     // Catch:{ all -> 0x040f }
            java.io.File r0 = r5.f269C     // Catch:{ all -> 0x040f }
            m20B(r0)     // Catch:{ all -> 0x040f }
            if (r18 == 0) goto L_0x03a9
            goto L_0x03a6
        L_0x0394:
            r9 = move-exception
            java.lang.String r8 = "ACRA"
            java.lang.String r3 = "Failed to send crash attachment report %s"
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x040f }
            r1 = 0
            java.io.File r0 = r5.f269C     // Catch:{ all -> 0x040f }
            r2[r1] = r0     // Catch:{ all -> 0x040f }
            p000X.C000600f.m75J(r8, r9, r3, r2)     // Catch:{ all -> 0x040f }
            if (r18 == 0) goto L_0x03a9
        L_0x03a6:
            m32N(r18)     // Catch:{ Throwable -> 0x0416 }
        L_0x03a9:
            if (r5 == 0) goto L_0x03ae
            r5.close()     // Catch:{ Throwable -> 0x042c }
        L_0x03ae:
            r22.close()
            if (r6 == 0) goto L_0x00a8
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x00a8
            java.io.File[] r10 = r6.listFiles()
            if (r10 == 0) goto L_0x00a8
            X.022 r0 = new X.022
            r0.<init>()
            java.util.Arrays.sort(r10, r0)
            int r9 = r10.length
            r8 = 0
            r6 = 0
        L_0x03ca:
            if (r8 >= r9) goto L_0x00a8
            r5 = r10[r8]
            int r6 = r6 + 1
            long r2 = (long) r6
            r0 = 5
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03da
            r5.delete()
        L_0x03da:
            int r8 = r8 + 1
            goto L_0x03ca
        L_0x03dd:
            r12.close()
            int r24 = r24 + r0
        L_0x03e2:
            int r7 = r7 + 1
            goto L_0x0018
        L_0x03e6:
            r1 = move-exception
            r3 = r2
            goto L_0x03ec
        L_0x03e9:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x03eb }
        L_0x03eb:
            r1 = move-exception
        L_0x03ec:
            if (r5 == 0) goto L_0x03fc
            if (r3 == 0) goto L_0x03f9
            r5.close()     // Catch:{ Throwable -> 0x03f4 }
            goto L_0x03fc
        L_0x03f4:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r3, r0)     // Catch:{ Throwable -> 0x03fd }
            goto L_0x03fc
        L_0x03f9:
            r5.close()     // Catch:{ Throwable -> 0x03fd }
        L_0x03fc:
            throw r1     // Catch:{ Throwable -> 0x03fd }
        L_0x03fd:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x03ff }
        L_0x03ff:
            r1 = move-exception
            if (r2 == 0) goto L_0x040b
            r12.close()     // Catch:{ Throwable -> 0x0406 }
            goto L_0x040e
        L_0x0406:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r2, r0)
            goto L_0x040e
        L_0x040b:
            r12.close()
        L_0x040e:
            throw r1
        L_0x040f:
            r0 = move-exception
            if (r18 == 0) goto L_0x0415
            m32N(r18)     // Catch:{ Throwable -> 0x0416 }
        L_0x0415:
            throw r0     // Catch:{ Throwable -> 0x0416 }
        L_0x0416:
            r20 = move-exception
            throw r20     // Catch:{ all -> 0x0418 }
        L_0x0418:
            r2 = move-exception
            if (r5 == 0) goto L_0x042b
            if (r20 == 0) goto L_0x0428
            r5.close()     // Catch:{ Throwable -> 0x0421 }
            goto L_0x042b
        L_0x0421:
            r1 = move-exception
            r0 = r20
            p000X.AnonymousClass01A.m182B(r0, r1)     // Catch:{ Throwable -> 0x042c }
            goto L_0x042b
        L_0x0428:
            r5.close()     // Catch:{ Throwable -> 0x042c }
        L_0x042b:
            throw r2     // Catch:{ Throwable -> 0x042c }
        L_0x042c:
            r21 = move-exception
            throw r21     // Catch:{ all -> 0x042e }
        L_0x042e:
            r2 = move-exception
            if (r21 == 0) goto L_0x043c
            r22.close()     // Catch:{ Throwable -> 0x0435 }
            goto L_0x043f
        L_0x0435:
            r1 = move-exception
            r0 = r21
            p000X.AnonymousClass01A.m182B(r0, r1)
            goto L_0x043f
        L_0x043c:
            r22.close()
        L_0x043f:
            throw r2
        L_0x0440:
            java.io.File r2 = new java.io.File
            android.content.Context r0 = r4.f57M
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            java.lang.String r1 = r0.dataDir
            java.lang.String r0 = "core"
            r2.<init>(r1, r0)
            r2.delete()
            return
        L_0x0453:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0453 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass00G.mo19D(X.00P[]):void");
    }

    /* renamed from: E */
    public final void mo20E(String str, AnonymousClass01B r4) {
        synchronized (this.f63S) {
            this.f63S.put(str, r4);
        }
    }

    /* renamed from: F */
    public final int mo21F(AnonymousClass00P... r6) {
        int i = 0;
        if (this.f57M == null) {
            C000600f.m71F("ACRA", "Trying to get ACRA reports but ACRA is not initialized.");
        } else {
            int i2 = 0;
            while (i2 < r6.length) {
                i2++;
                i = AnonymousClass00P.m51B(r6[i2], this.f57M).f103B.length + i;
            }
        }
        return i;
    }
}
