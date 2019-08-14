package p000X;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/* renamed from: X.00E reason: invalid class name */
public class AnonymousClass00E {

    /* renamed from: B */
    public static AnonymousClass01E f33B;

    /* renamed from: C */
    public static AnonymousClass01F f34C;

    /* renamed from: D */
    public static AnonymousClass00D f35D;

    /* renamed from: E */
    private static AnonymousClass00X f36E;

    /* renamed from: F */
    public static final Object f37F = new Object();

    /* renamed from: G */
    private static AnonymousClass00F f38G;

    /* renamed from: H */
    public static final Object f39H = new Object();

    /* renamed from: I */
    private static String f40I;

    /* renamed from: B */
    public static boolean m11B(String str) {
        return f35D.f30B.getSharedPreferences("acra_flags_store", 0).getBoolean(str, false);
    }

    /* renamed from: C */
    public static String m12C(Context context) {
        if (f40I == null) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int myPid = Process.myPid();
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        f40I = runningAppProcessInfo.processName;
                    }
                }
            }
            if (f40I == null) {
                f40I = "unknown";
            }
        }
        return f40I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0355, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0356, code lost:
        if (r7 != null) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0358, code lost:
        if (r4 != null) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0363, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0366, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x043f, code lost:
        if (r3 == null) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04d1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:?, code lost:
        p000X.AnonymousClass01A.m182B(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04da, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04db, code lost:
        p000X.C000600f.m75J("ErrorReporter", r7, "Can't read contents of %s", r8.getAbsolutePath());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04da A[ExcHandler: FileNotFoundException | IllegalStateException | NoSuchElementException (r7v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:251:0x04a8] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0501 A[SYNTHETIC, Splitter:B:278:0x0501] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0504 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0598  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000X.AnonymousClass00G m13D(p000X.AnonymousClass00D r13, long r14, p000X.AnonymousClass00F r16) {
        /*
            X.00G r1 = p000X.AnonymousClass00I.f71B
            r2 = 0
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x000a
            r1.f50F = r14
        L_0x000a:
            X.00D r0 = f35D
            if (r0 != 0) goto L_0x0559
            f35D = r13
            android.content.Context r3 = r13.f30B
            m12C(r3)
            java.lang.String r0 = "report_host.txt"
            java.io.File r2 = r3.getFileStreamPath(r0)     // Catch:{ SecurityException -> 0x004f }
            boolean r0 = r2.exists()     // Catch:{ SecurityException -> 0x004f }
            if (r0 == 0) goto L_0x0057
            boolean r0 = r2.canRead()     // Catch:{ SecurityException -> 0x004f }
            if (r0 == 0) goto L_0x0047
            boolean r0 = r2.canWrite()     // Catch:{ SecurityException -> 0x004f }
            if (r0 == 0) goto L_0x0047
            long r6 = r2.length()     // Catch:{ SecurityException -> 0x004f }
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "report_host.txt"
            boolean r0 = r3.deleteFile(r0)     // Catch:{ SecurityException -> 0x004f }
            if (r0 != 0) goto L_0x0057
            java.lang.String r2 = "ACRA"
            java.lang.String r0 = "could not delete empty host file"
            p000X.C000600f.m71F(r2, r0)     // Catch:{ SecurityException -> 0x004f }
            goto L_0x0057
        L_0x0047:
            java.lang.String r2 = "ACRA"
            java.lang.String r0 = "cannot read or write host file"
            p000X.C000600f.m71F(r2, r0)     // Catch:{ SecurityException -> 0x004f }
            goto L_0x0057
        L_0x004f:
            r4 = move-exception
            java.lang.String r2 = "ACRA"
            java.lang.String r0 = "could not delete empty host file: "
            p000X.C000600f.m74I(r2, r4, r0)
        L_0x0057:
            X.00D r8 = f35D
            boolean r0 = r1.f61Q
            if (r0 == 0) goto L_0x0065
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "ErrorReporter already initialized"
            r1.<init>(r0)
            throw r1
        L_0x0065:
            android.content.Context r0 = r8.f30B
            r1.f57M = r0
            android.content.Context r0 = r1.f57M
            if (r0 != 0) goto L_0x0075
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r0 = "context must be non-null"
            r1.<init>(r0)
            throw r1
        L_0x0075:
            java.io.File r2 = new java.io.File
            android.content.Context r0 = r1.f57M
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            r2.<init>(r0)
            long r4 = r2.lastModified()
            r1.f62R = r4
            long r6 = r1.f62R
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0097
            java.lang.String r2 = "ACRA"
            java.lang.String r0 = "could not retrieve APK mod time"
            p000X.C000600f.m79N(r2, r0)
        L_0x0097:
            r1.f55K = r8
            android.content.Context r0 = r1.f57M
            java.lang.String r6 = p000X.AnonymousClass00U.m57B(r0)
            android.content.Context r4 = r1.f57M
            java.lang.String r2 = "acra_criticaldata_store"
            r0 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r2, r0)
            java.lang.String r2 = "CLIENT_USER_ID"
            java.lang.String r0 = ""
            java.lang.String r5 = r4.getString(r2, r0)
            android.content.Context r4 = r1.f57M
            java.lang.String r2 = "acra_criticaldata_store"
            r0 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r2, r0)
            java.lang.String r2 = "DEVICE_ID"
            java.lang.String r0 = ""
            java.lang.String r2 = r4.getString(r2, r0)
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x00c9
            r1.f58N = r6
        L_0x00c9:
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00d1
            r1.f54J = r5
        L_0x00d1:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00dc
            java.lang.String r0 = "marauder_device_id"
            p000X.AnonymousClass00G.m26H(r0, r2)
        L_0x00dc:
            android.content.Context r7 = r1.f57M
            r5 = 0
            r4 = 0
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 11
            if (r2 < r0) goto L_0x00f7
            java.lang.String r0 = "acra_criticaldata_store"
            android.content.SharedPreferences r2 = r7.getSharedPreferences(r0, r4)
            java.lang.String r0 = "ADDITIONAL_PARAMS"
            java.util.Set r5 = r2.getStringSet(r0, r5)
        L_0x00f7:
            if (r5 == 0) goto L_0x0125
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0125
            java.lang.String r0 = "acra_criticaldata_store"
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r0, r4)
            java.util.Iterator r5 = r5.iterator()
        L_0x0109:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r4 = r5.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = ""
            java.lang.String r2 = r7.getString(r4, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0109
            r6.put(r4, r2)
            goto L_0x0109
        L_0x0125:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x012d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r4 = r5.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r6.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x012d
            p000X.AnonymousClass00G.m26H(r4, r2)
            goto L_0x012d
        L_0x0149:
            r0 = 1
            r1.f61Q = r0
            r6 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch:{ Throwable -> 0x0373 }
            r1.f65U = r0     // Catch:{ Throwable -> 0x0373 }
            android.text.format.Time r5 = r1.f49E     // Catch:{ Throwable -> 0x0373 }
            monitor-enter(r5)     // Catch:{ Throwable -> 0x0373 }
            android.text.format.Time r0 = r1.f49E     // Catch:{ all -> 0x0370 }
            r0.setToNow()     // Catch:{ all -> 0x0370 }
            byte[] r4 = r1.f65U     // Catch:{ all -> 0x0370 }
            r2 = 0
            r0 = 1
            r4[r2] = r0     // Catch:{ all -> 0x0370 }
            monitor-exit(r5)     // Catch:{ all -> 0x0370 }
            r0 = 160320475(0x98e4bdb, float:3.425659E-33)
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Throwable -> 0x0373 }
            r1.f51G = r0     // Catch:{ Throwable -> 0x0373 }
            X.00V r8 = new X.00V     // Catch:{ Throwable -> 0x0373 }
            android.content.Context r0 = r1.f57M     // Catch:{ Throwable -> 0x0373 }
            r8.<init>(r0)     // Catch:{ Throwable -> 0x0373 }
            android.content.Context r0 = r8.f95B     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Throwable -> 0x0373 }
            android.content.pm.PackageInfo r0 = r8.mo26A(r0)     // Catch:{ Throwable -> 0x0373 }
            if (r0 == 0) goto L_0x0193
            int r4 = r0.versionCode     // Catch:{ Throwable -> 0x0373 }
            r2 = 160320475(0x98e4bdb, float:3.425659E-33)
            if (r4 != r2) goto L_0x0193
            java.lang.String r2 = r0.versionName     // Catch:{ Throwable -> 0x0373 }
            if (r2 == 0) goto L_0x0193
            java.lang.String r2 = r0.versionName     // Catch:{ Throwable -> 0x0373 }
            r1.f52H = r2     // Catch:{ Throwable -> 0x0373 }
        L_0x018d:
            java.util.TreeMap r7 = new java.util.TreeMap     // Catch:{ Throwable -> 0x0373 }
            r7.<init>()     // Catch:{ Throwable -> 0x0373 }
            goto L_0x0198
        L_0x0193:
            java.lang.String r2 = "not set"
            r1.f52H = r2     // Catch:{ Throwable -> 0x0373 }
            goto L_0x018d
        L_0x0198:
            android.content.Context r2 = r1.f57M     // Catch:{ Exception -> 0x01a5 }
            android.content.ContentResolver r4 = r2.getContentResolver()     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r2 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r2)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01af
        L_0x01a5:
            r5 = move-exception
            java.lang.String r4 = "ErrorReporter"
            java.lang.String r2 = "Failed to fetch the constant field ANDROID_ID"
            p000X.C000600f.m72G(r4, r2, r5)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "unknown"
        L_0x01af:
            java.lang.String r2 = "ANDROID_ID"
            r7.put(r2, r4)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "APP_VERSION_CODE"
            java.lang.String r2 = r1.f51G     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "APP_VERSION_NAME"
            java.lang.String r2 = r1.f52H     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "PACKAGE_NAME"
            android.content.Context r2 = r1.f57M     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r5 = "INSTALLER_NAME"
            android.content.Context r2 = r8.f95B     // Catch:{ Throwable -> 0x0373 }
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch:{ Throwable -> 0x0373 }
            if (r4 != 0) goto L_0x01d9
            r2 = 0
            goto L_0x01e3
        L_0x01d9:
            android.content.Context r2 = r8.f95B     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r2 = r4.getInstallerPackageName(r2)     // Catch:{ Throwable -> 0x0373 }
        L_0x01e3:
            r7.put(r5, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "PHONE_MODEL"
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "DEVICE"
            java.lang.String r2 = android.os.Build.DEVICE     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "ANDROID_VERSION"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "OS_VERSION"
            java.lang.String r2 = "os.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "BUILD_HOST"
            java.lang.String r2 = android.os.Build.HOST     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "BRAND"
            java.lang.String r2 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "PRODUCT"
            java.lang.String r2 = android.os.Build.PRODUCT     // Catch:{ Throwable -> 0x0373 }
            r7.put(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "n/a"
            android.content.Context r2 = r1.f57M     // Catch:{ Throwable -> 0x0373 }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ Throwable -> 0x0373 }
            if (r2 == 0) goto L_0x0229
            java.lang.String r4 = r2.getAbsolutePath()     // Catch:{ Throwable -> 0x0373 }
        L_0x0229:
            java.lang.String r2 = "FILE_PATH"
            r7.put(r2, r4)     // Catch:{ Throwable -> 0x0373 }
            if (r0 == 0) goto L_0x0249
            java.lang.String r9 = "APP_INSTALL_TIME"
            long r4 = r0.firstInstallTime     // Catch:{ Throwable -> 0x0373 }
            java.util.Date r8 = new java.util.Date     // Catch:{ Throwable -> 0x0373 }
            r8.<init>(r4)     // Catch:{ Throwable -> 0x0373 }
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ"
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Throwable -> 0x0373 }
            r5.<init>(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r2 = r5.format(r8)     // Catch:{ Throwable -> 0x0373 }
            r7.put(r9, r2)     // Catch:{ Throwable -> 0x0373 }
        L_0x0249:
            if (r0 == 0) goto L_0x0256
            java.lang.String r8 = "APP_INSTALL_EPOCH_TIME"
            long r4 = r0.firstInstallTime     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0373 }
            r7.put(r8, r2)     // Catch:{ Throwable -> 0x0373 }
        L_0x0256:
            if (r0 == 0) goto L_0x0271
            java.lang.String r9 = "APP_UPGRADE_TIME"
            long r4 = r0.lastUpdateTime     // Catch:{ Throwable -> 0x0373 }
            java.util.Date r8 = new java.util.Date     // Catch:{ Throwable -> 0x0373 }
            r8.<init>(r4)     // Catch:{ Throwable -> 0x0373 }
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r4 = "yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ"
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Throwable -> 0x0373 }
            r5.<init>(r4, r2)     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r2 = r5.format(r8)     // Catch:{ Throwable -> 0x0373 }
            r7.put(r9, r2)     // Catch:{ Throwable -> 0x0373 }
        L_0x0271:
            if (r0 == 0) goto L_0x027e
            java.lang.String r8 = "APP_UPGRADE_EPOCH_TIME"
            long r4 = r0.lastUpdateTime     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0373 }
            r7.put(r8, r2)     // Catch:{ Throwable -> 0x0373 }
        L_0x027e:
            if (r0 == 0) goto L_0x0290
            java.lang.String r2 = "APP_SINCE_UPGRADE_TIME"
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0373 }
            long r4 = r0.lastUpdateTime     // Catch:{ Throwable -> 0x0373 }
            long r8 = r8 - r4
            java.lang.String r0 = java.lang.Long.toString(r8)     // Catch:{ Throwable -> 0x0373 }
            r7.put(r2, r0)     // Catch:{ Throwable -> 0x0373 }
        L_0x0290:
            android.content.Context r0 = r1.f57M     // Catch:{ Throwable -> 0x0373 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ Throwable -> 0x0373 }
            if (r0 == 0) goto L_0x02c7
            java.lang.String r2 = "PUBLIC_SOURCE_DIR"
            android.content.Context r0 = r1.f57M     // Catch:{ Throwable -> 0x0373 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r0 = r0.publicSourceDir     // Catch:{ Throwable -> 0x0373 }
            r7.put(r2, r0)     // Catch:{ Throwable -> 0x0373 }
        L_0x02a5:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r7)     // Catch:{ Throwable -> 0x0373 }
            r1.f56L = r0     // Catch:{ Throwable -> 0x0373 }
            android.content.Context r4 = r1.f57M     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r2 = "acra-reports"
            r0 = 0
            java.io.File r2 = r4.getDir(r2, r0)     // Catch:{ Throwable -> 0x0373 }
            java.io.File r10 = new java.io.File     // Catch:{ Throwable -> 0x0373 }
            java.lang.String r0 = "reportfile.prealloc"
            r10.<init>(r2, r0)     // Catch:{ Throwable -> 0x0373 }
            r7 = 1572864(0x180000, double:7.77098E-318)
            long r4 = r10.length()     // Catch:{ Throwable -> 0x0373 }
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x036d
            goto L_0x02cf
        L_0x02c7:
            java.lang.String r2 = "PUBLIC_SOURCE_DIR"
            java.lang.String r0 = "null application info"
            r7.put(r2, r0)     // Catch:{ Throwable -> 0x0373 }
            goto L_0x02a5
        L_0x02cf:
            r14 = 1572864(0x180000, double:7.77098E-318)
            r4 = 0
            java.lang.Class<X.00G> r5 = p000X.AnonymousClass00G.class
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ Throwable -> 0x0367 }
            java.lang.String r0 = ".stacktrace"
            java.lang.String r5 = p000X.AnonymousClass00G.m21C(r1, r5, r2, r0)     // Catch:{ Throwable -> 0x0367 }
            X.00P r2 = p000X.AnonymousClass00P.ACRA_CRASH_REPORT     // Catch:{ Throwable -> 0x0367 }
            android.content.Context r0 = r1.f57M     // Catch:{ Throwable -> 0x0367 }
            X.00W r0 = r2.mo22A(r0)     // Catch:{ Throwable -> 0x0367 }
            X.01b r7 = r0.mo27A(r5, r4)     // Catch:{ Throwable -> 0x0367 }
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ all -> 0x034c }
            java.io.File r0 = r7.f248C     // Catch:{ all -> 0x034c }
            r13.<init>(r0)     // Catch:{ all -> 0x034c }
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r2 = new byte[r0]     // Catch:{ Throwable -> 0x033a, all -> 0x0337 }
            r11 = 0
        L_0x02f9:
            int r0 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0305
            r13.write(r2)     // Catch:{ Throwable -> 0x033a, all -> 0x0337 }
            r8 = 32768(0x8000, double:1.61895E-319)
            long r11 = r11 + r8
            goto L_0x02f9
        L_0x0305:
            java.io.FileDescriptor r0 = r13.getFD()     // Catch:{ Throwable -> 0x033a, all -> 0x0337 }
            r0.sync()     // Catch:{ Throwable -> 0x033a, all -> 0x0337 }
            r13.close()     // Catch:{ all -> 0x034c }
            java.io.File r9 = r7.f248C     // Catch:{ all -> 0x034c }
            boolean r0 = r9.renameTo(r10)     // Catch:{ all -> 0x034c }
            if (r0 != 0) goto L_0x032c
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x034c }
            java.lang.String r5 = "rename of %s to %s failed"
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x034c }
            r0 = 0
            r2[r0] = r9     // Catch:{ all -> 0x034c }
            r0 = 1
            r2[r0] = r10     // Catch:{ all -> 0x034c }
            java.lang.String r0 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x034c }
            r8.<init>(r0)     // Catch:{ all -> 0x034c }
            throw r8     // Catch:{ all -> 0x034c }
        L_0x032c:
            java.io.File r0 = r7.f248C     // Catch:{ Throwable -> 0x0353 }
            r0.delete()     // Catch:{ Throwable -> 0x0353 }
            if (r7 == 0) goto L_0x036d
            r7.close()     // Catch:{ Throwable -> 0x0367 }
            goto L_0x036d
        L_0x0337:
            r2 = move-exception
            r5 = r4
            goto L_0x033d
        L_0x033a:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x033c }
        L_0x033c:
            r2 = move-exception
        L_0x033d:
            if (r5 == 0) goto L_0x0348
            r13.close()     // Catch:{ Throwable -> 0x0343 }
            goto L_0x034b
        L_0x0343:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r5, r0)     // Catch:{ all -> 0x034c }
            goto L_0x034b
        L_0x0348:
            r13.close()     // Catch:{ all -> 0x034c }
        L_0x034b:
            throw r2     // Catch:{ all -> 0x034c }
        L_0x034c:
            r2 = move-exception
            java.io.File r0 = r7.f248C     // Catch:{ Throwable -> 0x0353 }
            r0.delete()     // Catch:{ Throwable -> 0x0353 }
            throw r2     // Catch:{ Throwable -> 0x0353 }
        L_0x0353:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0355 }
        L_0x0355:
            r2 = move-exception
            if (r7 == 0) goto L_0x0366
            if (r4 == 0) goto L_0x0363
            r7.close()     // Catch:{ Throwable -> 0x035e }
            goto L_0x0366
        L_0x035e:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r4, r0)     // Catch:{ Throwable -> 0x0367 }
            goto L_0x0366
        L_0x0363:
            r7.close()     // Catch:{ Throwable -> 0x0367 }
        L_0x0366:
            throw r2     // Catch:{ Throwable -> 0x0367 }
        L_0x0367:
            r2 = move-exception
            r0 = 0
            p000X.AnonymousClass00G.m30L(r0, r2)     // Catch:{ Throwable -> 0x0373 }
            r10 = 0
        L_0x036d:
            r1.f67W = r10     // Catch:{ Throwable -> 0x0373 }
            goto L_0x0374
        L_0x0370:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0370 }
            throw r0     // Catch:{ Throwable -> 0x0373 }
        L_0x0373:
            r6 = move-exception
        L_0x0374:
            X.00D r0 = f35D
            X.00X r5 = new X.00X
            r5.<init>(r0)
            f36E = r5
            java.util.ArrayList r4 = r1.f68X
            monitor-enter(r4)
            java.util.ArrayList r2 = r1.f68X     // Catch:{ all -> 0x0526 }
            monitor-enter(r2)     // Catch:{ all -> 0x0526 }
            java.util.ArrayList r0 = r1.f68X     // Catch:{ all -> 0x0523 }
            r0.clear()     // Catch:{ all -> 0x0523 }
            monitor-exit(r2)     // Catch:{ all -> 0x0523 }
            java.util.ArrayList r2 = r1.f68X     // Catch:{ all -> 0x0526 }
            monitor-enter(r2)     // Catch:{ all -> 0x0526 }
            java.util.ArrayList r0 = r1.f68X     // Catch:{ all -> 0x0520 }
            r0.add(r5)     // Catch:{ all -> 0x0520 }
            monitor-exit(r2)     // Catch:{ all -> 0x0520 }
            monitor-exit(r4)     // Catch:{ all -> 0x0526 }
            r5 = 0
            java.lang.String r0 = "report_host.txt"
            java.io.File r2 = r3.getFileStreamPath(r0)     // Catch:{ IOException -> 0x03f2, all -> 0x03ea }
            boolean r0 = r2.canRead()     // Catch:{ IOException -> 0x03f2, all -> 0x03ea }
            if (r0 != 0) goto L_0x03a5
            r0 = 0
            m17H(r0)
            goto L_0x03fa
        L_0x03a5:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x03f2, all -> 0x03ea }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x03f2, all -> 0x03ea }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03f2, all -> 0x03ea }
            r4.<init>(r0)     // Catch:{ IOException -> 0x03f2, all -> 0x03ea }
            java.lang.String r0 = r4.readLine()     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            if (r0 != 0) goto L_0x03b7
            r5 = 0
            goto L_0x03bb
        L_0x03b7:
            java.lang.String r5 = r0.trim()     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
        L_0x03bb:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            if (r0 != 0) goto L_0x03f7
            X.00X r2 = f36E     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            if (r5 == 0) goto L_0x03f7
            java.lang.String r0 = ""
            boolean r0 = r5.equals(r0)     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            if (r0 != 0) goto L_0x03f7
            android.net.Uri r0 = r2.f99C     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            java.lang.String r0 = r0.getHost()     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            boolean r0 = r5.equals(r0)     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            if (r0 != 0) goto L_0x03f7
            android.net.Uri r0 = r2.f99C     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            android.net.Uri$Builder r0 = r0.authority(r5)     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            android.net.Uri r0 = r0.build()     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            r2.f99C = r0     // Catch:{ IOException -> 0x03f3, all -> 0x03ec }
            goto L_0x03f7
        L_0x03ea:
            r0 = move-exception
            goto L_0x03ee
        L_0x03ec:
            r0 = move-exception
            r5 = r4
        L_0x03ee:
            m17H(r5)
            throw r0
        L_0x03f2:
            r4 = r5
        L_0x03f3:
            m17H(r4)
            goto L_0x03fa
        L_0x03f7:
            m17H(r4)
        L_0x03fa:
            java.lang.String r0 = "skip_cert_checks.txt"
            java.io.File r0 = r3.getFileStreamPath(r0)
            boolean r2 = r0.exists()
            X.00X r0 = f36E
            r0.f98B = r2
            r0 = 1
            X.00P[] r3 = new p000X.AnonymousClass00P[r0]
            r2 = 0
            X.00P r0 = p000X.AnonymousClass00P.NATIVE_CRASH_REPORT
            r3[r2] = r0
            int r2 = r1.mo21F(r3)
            r0 = 5
            if (r2 <= r0) goto L_0x0446
            X.01i r4 = new X.01i
            r0 = 1
            X.00P[] r3 = new p000X.AnonymousClass00P[r0]
            r2 = 0
            X.00P r0 = p000X.AnonymousClass00P.NATIVE_CRASH_REPORT
            r3[r2] = r0
            r0 = 0
            r4.<init>(r1, r0, r0, r3)
            r3 = 0
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 9
            if (r2 < r0) goto L_0x0433
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.getThreadPolicy()
            p000X.AnonymousClass023.m292B()
        L_0x0433:
            r4.mo92A()     // Catch:{ Throwable -> 0x0439 }
            if (r3 == 0) goto L_0x0446
            goto L_0x0441
        L_0x0439:
            r2 = move-exception
            java.lang.String r0 = "sending native reports on app launch"
            p000X.AnonymousClass00G.m30L(r0, r2)     // Catch:{ all -> 0x0529 }
            if (r3 == 0) goto L_0x0446
        L_0x0441:
            android.os.StrictMode$ThreadPolicy r3 = (android.os.StrictMode.ThreadPolicy) r3
            android.os.StrictMode.setThreadPolicy(r3)
        L_0x0446:
            X.00P[] r0 = p000X.AnonymousClass00G.f42b
            int r0 = r1.mo21F(r0)
            if (r0 <= 0) goto L_0x045c
            X.00P[] r7 = p000X.AnonymousClass00G.f42b
            X.01i r4 = new X.01i
            r0 = 0
            r4.<init>(r1, r0, r0, r7)
            r4.start()
            r1.mo21F(r7)
        L_0x045c:
            r14 = 0
            r9 = 1
            r13 = 0
            android.content.Context r0 = r1.f57M
            if (r0 == 0) goto L_0x0500
            java.io.File r7 = new java.io.File
            android.content.Context r3 = r1.f57M
            java.lang.String r2 = "deathmon"
            r0 = 0
            java.io.File r0 = r3.getDir(r2, r0)
            java.lang.String r0 = r0.getAbsolutePath()
            r7.<init>(r0)
            X.00c r0 = new X.00c     // Catch:{ SecurityException -> 0x04f0 }
            r0.<init>()     // Catch:{ SecurityException -> 0x04f0 }
            java.io.File[] r11 = r7.listFiles(r0)     // Catch:{ SecurityException -> 0x04f0 }
            if (r11 == 0) goto L_0x0500
            int r10 = r11.length
            r0 = 0
        L_0x0482:
            if (r0 >= r10) goto L_0x0500
            r8 = r11[r0]
            java.lang.String r4 = r8.getName()     // Catch:{ IndexOutOfBoundsException -> 0x049d }
            r2 = 95
            int r2 = r4.lastIndexOf(r2)     // Catch:{ IndexOutOfBoundsException -> 0x049d }
            int r3 = r2 + 1
            r2 = 46
            int r2 = r4.lastIndexOf(r2)     // Catch:{ IndexOutOfBoundsException -> 0x049d }
            java.lang.String r7 = r4.substring(r3, r2)     // Catch:{ IndexOutOfBoundsException -> 0x049d }
            goto L_0x04a6
        L_0x049d:
            r4 = move-exception
            java.lang.String r3 = "ErrorReporter"
            java.lang.String r2 = "couldn't generate session ID from deathmon logcat filename"
            p000X.C000600f.m74I(r3, r4, r2)
            r7 = r14
        L_0x04a6:
            if (r7 == 0) goto L_0x04ea
            java.util.Scanner r5 = new java.util.Scanner     // Catch:{ FileNotFoundException | IllegalStateException | NoSuchElementException -> 0x04da }
            r5.<init>(r8)     // Catch:{ FileNotFoundException | IllegalStateException | NoSuchElementException -> 0x04da }
            java.lang.String r2 = "\\Z"
            java.util.Scanner r2 = r5.useDelimiter(r2)     // Catch:{ Throwable -> 0x04c8, all -> 0x04c5 }
            java.lang.String r4 = r2.next()     // Catch:{ Throwable -> 0x04c8, all -> 0x04c5 }
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch:{ Throwable -> 0x04c8, all -> 0x04c5 }
            r3.<init>()     // Catch:{ Throwable -> 0x04c8, all -> 0x04c5 }
            java.lang.String r2 = "deathmon_logcat"
            p000X.AnonymousClass00G.m27I(r3, r2, r4, r7, r1)     // Catch:{ Throwable -> 0x04c8, all -> 0x04c5 }
            r5.close()     // Catch:{ FileNotFoundException | IllegalStateException | NoSuchElementException -> 0x04da }
            goto L_0x04ea
        L_0x04c5:
            r3 = move-exception
            r4 = r14
            goto L_0x04cb
        L_0x04c8:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x04ca }
        L_0x04ca:
            r3 = move-exception
        L_0x04cb:
            if (r4 == 0) goto L_0x04d6
            r5.close()     // Catch:{ Throwable -> 0x04d1, FileNotFoundException | IllegalStateException | NoSuchElementException -> 0x04da, FileNotFoundException | IllegalStateException | NoSuchElementException -> 0x04da }
            goto L_0x04d9
        L_0x04d1:
            r2 = move-exception
            p000X.AnonymousClass01A.m182B(r4, r2)     // Catch:{ FileNotFoundException | IllegalStateException | NoSuchElementException -> 0x04da }
            goto L_0x04d9
        L_0x04d6:
            r5.close()     // Catch:{ FileNotFoundException | IllegalStateException | NoSuchElementException -> 0x04da }
        L_0x04d9:
            throw r3     // Catch:{ FileNotFoundException | IllegalStateException | NoSuchElementException -> 0x04da }
        L_0x04da:
            r7 = move-exception
            java.lang.String r5 = "ErrorReporter"
            java.lang.String r4 = "Can't read contents of %s"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r2 = r8.getAbsolutePath()
            r3[r13] = r2
            p000X.C000600f.m75J(r5, r7, r4, r3)
        L_0x04ea:
            p000X.AnonymousClass00G.m20B(r8)
            int r0 = r0 + 1
            goto L_0x0482
        L_0x04f0:
            r5 = move-exception
            java.lang.String r4 = "ErrorReporter"
            java.lang.String r3 = "Can't list files in %s"
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r0 = r7.getPath()
            r2[r13] = r0
            p000X.C000600f.m75J(r4, r5, r3, r2)
        L_0x0500:
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x051d }
            r0 = r1
            monitor-enter(r0)
            monitor-exit(r0)
            r0 = 0
            p000X.C000400d.m64B(r1, r0)
            if (r6 == 0) goto L_0x0533
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Class<X.00d> r2 = p000X.C000400d.class
            monitor-enter(r2)
            X.00d r0 = p000X.C000400d.m65C()     // Catch:{ all -> 0x051a }
            r0.uncaughtException(r3, r6)     // Catch:{ all -> 0x051a }
            goto L_0x0532
        L_0x051a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x051d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x051d }
            goto L_0x0531
        L_0x0520:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0520 }
            goto L_0x0525
        L_0x0523:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0523 }
        L_0x0525:
            throw r0     // Catch:{ all -> 0x0526 }
        L_0x0526:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0526 }
            goto L_0x0531
        L_0x0529:
            r0 = move-exception
            if (r3 == 0) goto L_0x0531
            android.os.StrictMode$ThreadPolicy r3 = (android.os.StrictMode.ThreadPolicy) r3
            android.os.StrictMode.setThreadPolicy(r3)
        L_0x0531:
            throw r0
        L_0x0532:
            monitor-exit(r2)
        L_0x0533:
            X.00D r0 = f35D
            boolean r0 = r0.mo13A()
            if (r0 == 0) goto L_0x0559
            X.00D r0 = f35D
            android.content.Context r3 = r0.f30B
            java.lang.String r2 = "acraconfig_logcat_native_crash_periodic_interval_mins"
            r0 = 0
            int r2 = p000X.AnonymousClass01G.m193C(r3, r2, r0)
            if (r2 <= 0) goto L_0x0559
            r0 = 1
            java.util.concurrent.ScheduledExecutorService r3 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            X.01y r4 = new X.01y
            r4.<init>(r1)
            long r5 = (long) r2
            long r7 = (long) r2
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MINUTES
            r3.scheduleWithFixedDelay(r4, r5, r7, r9)
        L_0x0559:
            f38G = r16
            X.00D r0 = f35D
            android.content.Context r5 = r0.f30B
            java.lang.String r4 = m12C(r5)
            java.lang.String r0 = "record_signal_time"
            boolean r0 = m11B(r0)
            if (r0 != 0) goto L_0x0587
            java.lang.String r0 = ":"
            boolean r2 = r4.contains(r0)
            r0 = 0
            if (r2 != 0) goto L_0x0575
            r0 = 1
        L_0x0575:
            if (r0 != 0) goto L_0x0587
            java.lang.String r0 = ":browser"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x05b4
            java.lang.String r0 = "run_anr_detector_on_browser_process"
            boolean r0 = m11B(r0)
            if (r0 == 0) goto L_0x05b4
        L_0x0587:
            r0 = 1
        L_0x0588:
            if (r0 != 0) goto L_0x0598
            java.lang.String r5 = "ACRA"
            java.lang.String r3 = "Skipping ANR Detector for process: %s"
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            r2[r0] = r4
            p000X.C000600f.m73H(r5, r3, r2)
        L_0x0597:
            return r1
        L_0x0598:
            java.lang.String r6 = "ACRA"
            java.lang.String r3 = "Initializing ANR detector for process: %s"
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            r2[r0] = r4
            p000X.C000600f.m73H(r6, r3, r2)
            X.00D r0 = f35D
            boolean r0 = r0.f32D
            if (r0 == 0) goto L_0x0597
            m14E(r5, r1, r4)
            X.01E r0 = f33B
            r0.start()
            return r1
        L_0x05b4:
            r0 = 0
            goto L_0x0588
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass00E.m13D(X.00D, long, X.00F):X.00G");
    }

    /* renamed from: E */
    public static void m14E(Context context, AnonymousClass00G r15, String str) {
        C004401u r0;
        int I = m18I("android_anr_detector_to_use");
        int I2 = m18I("error_monitor_check_interval");
        synchronized (f37F) {
            Context context2 = context;
            f34C = new AnonymousClass01F(context, r15);
            AnonymousClass01F r7 = f34C;
            AnonymousClass00F r8 = f38G;
            Handler handler = new Handler(Looper.getMainLooper());
            m11B("anr_cleanup_on_asl_thread");
            boolean B = m11B("start_process_error_monitor_early");
            m11B("should_report_soft_errors");
            m11B("log_on_signal_handler");
            m11B("avoid_mutex_on_signal_handler");
            int I3 = m18I("anr_recovery_timeout");
            m11B("use_static_method_callback");
            C003901p r4 = new C003901p(context2, str, r7, r8, handler, I, B, I3, m18I("anr_process_monitor_max_checks_before"), m18I("anr_process_monitor_max_checks_after"), m11B("record_signal_time"));
            if (I == 5) {
                f33B = C004501v.m278C(r4, I2);
            } else {
                synchronized (C004401u.class) {
                    if (C004401u.f298F == null) {
                        C004401u.f298F = new C004401u(r4, I2);
                    }
                    r0 = C004401u.f298F;
                }
                f33B = r0;
            }
        }
    }

    /* renamed from: F */
    public static void m15F(String str, boolean z) {
        SharedPreferences sharedPreferences = f35D.f30B.getSharedPreferences("acra_flags_store", 0);
        if (sharedPreferences.getBoolean(str, false) != z) {
            sharedPreferences.edit().putBoolean(str, z).apply();
        }
    }

    /* renamed from: G */
    public static void m16G(String str, int i) {
        SharedPreferences sharedPreferences = f35D.f30B.getSharedPreferences("acra_flags_store", 0);
        if (sharedPreferences.getInt(str, 0) != i) {
            sharedPreferences.edit().putInt(str, i).apply();
        }
    }

    /* renamed from: H */
    private static void m17H(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C000600f.m74I("ACRA", e, "Error while closing stream: ");
            }
        }
    }

    /* renamed from: I */
    private static int m18I(String str) {
        return f35D.f30B.getSharedPreferences("acra_flags_store", 0).getInt(str, 0);
    }
}
