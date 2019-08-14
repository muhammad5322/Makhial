package p000X;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.01j reason: invalid class name and case insensitive filesystem */
public class C003301j {

    /* renamed from: B */
    private static volatile String f265B = "!";

    /* renamed from: C */
    public static final Map f266C = Collections.synchronizedMap(new TreeMap());

    /* renamed from: D */
    public static volatile AnonymousClass00V f267D;

    /* JADX WARNING: Can't wrap try/catch for region: R(13:300|301|372|383|(1:385)|386|387|388|(1:390)|391|392|840|397) */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0ccb, code lost:
        r5 = null;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:780:0x1020, code lost:
        f266C.put(r7, r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:391:0x07ff */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x08ac A[SYNTHETIC, Splitter:B:438:0x08ac] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x08f2  */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x08f5  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0999 A[ADDED_TO_REGION, Catch:{ all -> 0x0b03, Throwable -> 0x0b08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x0a13 A[SYNTHETIC, Splitter:B:516:0x0a13] */
    /* JADX WARNING: Removed duplicated region for block: B:630:0x0cb6  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m244B(p000X.AnonymousClass00G r22, p000X.AnonymousClass00D r23, java.lang.String r24, java.lang.Throwable r25, p000X.AnonymousClass01R r26, java.io.Writer r27, p000X.C003401k r28, boolean r29) {
        /*
            java.lang.String r0 = "UID"
            r3 = r26
            boolean r0 = m253K(r0, r3)
            r2 = r27
            r4 = r22
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = "UID"
            java.lang.String r0 = r4.f58N     // Catch:{ Throwable -> 0x0016 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r1 = move-exception
            java.lang.String r0 = "UID"
            m252J(r3, r0, r1)
        L_0x001c:
            java.lang.String r0 = "CLIENT_UID"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r4.f54J
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r4.f54J
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x003e
            java.lang.String r1 = "CLIENT_UID"
            java.lang.String r0 = r4.f54J     // Catch:{ Throwable -> 0x0038 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "CLIENT_UID"
            m252J(r3, r0, r1)
        L_0x003e:
            java.lang.String r0 = "STACK_TRACE"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "STACK_TRACE"
            r1 = r24
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Throwable -> 0x004e }
            goto L_0x0054
        L_0x004e:
            r1 = move-exception
            java.lang.String r0 = "STACK_TRACE"
            m252J(r3, r0, r1)
        L_0x0054:
            java.util.Map r0 = r4.f56L
            if (r0 == 0) goto L_0x0095
            java.util.Map r0 = r4.f56L
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x0062:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r5.getKey()     // Catch:{ Throwable -> 0x008a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x008a }
            java.lang.Object r0 = r5.getValue()     // Catch:{ Throwable -> 0x008a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x008a }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x008a }
            goto L_0x0062
        L_0x008a:
            r1 = move-exception
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = (java.lang.String) r0
            m252J(r3, r0, r1)
            goto L_0x0062
        L_0x0095:
            android.content.Context r10 = r4.f57M
            r16 = 0
            r14 = r28
            if (r28 == 0) goto L_0x009f
            r16 = 1
        L_0x009f:
            r15 = 0
            if (r16 == 0) goto L_0x00b4
            X.01l r1 = new X.01l     // Catch:{ Exception -> 0x00aa }
            java.io.RandomAccessFile r0 = r14.f268B     // Catch:{ Exception -> 0x00aa }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b3
        L_0x00aa:
            r5 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "There was a problem reading the minidump"
            p000X.C000600f.m74I(r1, r5, r0)
            goto L_0x00b4
        L_0x00b3:
            r15 = r1
        L_0x00b4:
            if (r29 == 0) goto L_0x00fc
            java.lang.String r0 = "PROCESS_NAME"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x00fc
            if (r16 != 0) goto L_0x00d5
            java.lang.String r5 = m248F(r10)     // Catch:{ Throwable -> 0x00f6 }
            if (r5 != 0) goto L_0x00d2
            java.lang.String r0 = "/proc/self/cmdline"
            java.lang.String r5 = p000X.AnonymousClass01S.m223B(r0)     // Catch:{ Throwable -> 0x00f6 }
            if (r5 == 0) goto L_0x00d2
            java.lang.String r5 = r5.trim()     // Catch:{ Throwable -> 0x00f6 }
        L_0x00d2:
            if (r5 != 0) goto L_0x00f0
            goto L_0x00ee
        L_0x00d5:
            r0 = 1197932550(0x47670006, float:59136.023)
            java.lang.String r5 = r15.mo97C(r0)     // Catch:{ Throwable -> 0x00f6 }
            if (r5 != 0) goto L_0x00e0
            java.lang.String r5 = ""
        L_0x00e0:
            r0 = 0
            int r1 = r5.indexOf(r0)     // Catch:{ Throwable -> 0x00f6 }
            r0 = -1
            if (r1 == r0) goto L_0x00f0
            r0 = 0
            java.lang.String r5 = r5.substring(r0, r1)     // Catch:{ Throwable -> 0x00f6 }
            goto L_0x00f0
        L_0x00ee:
            java.lang.String r5 = ""
        L_0x00f0:
            java.lang.String r0 = "PROCESS_NAME"
            p000X.AnonymousClass00G.m25G(r0, r5, r3, r2)     // Catch:{ Throwable -> 0x00f6 }
            goto L_0x00fc
        L_0x00f6:
            r1 = move-exception
            java.lang.String r0 = "PROCESS_NAME"
            m252J(r3, r0, r1)
        L_0x00fc:
            java.lang.String r0 = "USER_APP_START_DATE"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0120
            if (r16 != 0) goto L_0x0120
            java.lang.String r6 = "USER_APP_START_DATE"
            android.text.format.Time r5 = r4.f49E     // Catch:{ Throwable -> 0x011a }
            monitor-enter(r5)     // Catch:{ Throwable -> 0x011a }
            android.text.format.Time r1 = r4.f49E     // Catch:{ all -> 0x0117 }
            r0 = 0
            java.lang.String r0 = r1.format3339(r0)     // Catch:{ all -> 0x0117 }
            monitor-exit(r5)     // Catch:{ all -> 0x0117 }
            p000X.AnonymousClass00G.m25G(r6, r0, r3, r2)     // Catch:{ Throwable -> 0x011a }
            goto L_0x0120
        L_0x0117:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ Throwable -> 0x011a }
        L_0x011a:
            r1 = move-exception
            java.lang.String r0 = "USER_APP_START_DATE"
            m252J(r3, r0, r1)
        L_0x0120:
            java.lang.String r0 = "PROCESS_UPTIME"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0141
            if (r16 != 0) goto L_0x0141
            java.lang.String r7 = "PROCESS_UPTIME"
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x013b }
            long r0 = r4.f50F     // Catch:{ Throwable -> 0x013b }
            long r5 = r5 - r0
            java.lang.String r0 = java.lang.Long.toString(r5)     // Catch:{ Throwable -> 0x013b }
            p000X.AnonymousClass00G.m25G(r7, r0, r3, r2)     // Catch:{ Throwable -> 0x013b }
            goto L_0x0141
        L_0x013b:
            r1 = move-exception
            java.lang.String r0 = "PROCESS_UPTIME"
            m252J(r3, r0, r1)
        L_0x0141:
            java.lang.String r0 = "DEVICE_UPTIME"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x015d
            java.lang.String r5 = "DEVICE_UPTIME"
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x0157 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ Throwable -> 0x0157 }
            p000X.AnonymousClass00G.m25G(r5, r0, r3, r2)     // Catch:{ Throwable -> 0x0157 }
            goto L_0x015d
        L_0x0157:
            r1 = move-exception
            java.lang.String r0 = "DEVICE_UPTIME"
            m252J(r3, r0, r1)
        L_0x015d:
            java.lang.String r0 = "APP_VERSION_CODE_IN_PACKAGE_MANAGER"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0197
            java.lang.String r5 = "APP_VERSION_CODE_IN_PACKAGE_MANAGER"
            android.content.pm.PackageManager r6 = r10.getPackageManager()     // Catch:{ Throwable -> 0x0191 }
            if (r6 != 0) goto L_0x0173
            java.lang.String r0 = "no package manager"
        L_0x016f:
            p000X.AnonymousClass00G.m25G(r5, r0, r3, r2)     // Catch:{ Throwable -> 0x0191 }
            goto L_0x0197
        L_0x0173:
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x018b }
            java.lang.String r1 = r0.packageName     // Catch:{ NameNotFoundException -> 0x018b }
            r0 = 0
            android.content.pm.PackageInfo r0 = r6.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x018b }
            if (r0 != 0) goto L_0x0183
            java.lang.String r0 = "no package info"
            goto L_0x016f
        L_0x0183:
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x018b }
            long r0 = (long) r0     // Catch:{ NameNotFoundException -> 0x018b }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ NameNotFoundException -> 0x018b }
            goto L_0x016f
        L_0x018b:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0191 }
            goto L_0x016f
        L_0x0191:
            r1 = move-exception
            java.lang.String r0 = "APP_VERSION_CODE_IN_PACKAGE_MANAGER"
            m252J(r3, r0, r1)
        L_0x0197:
            java.lang.String r0 = "PUBLIC_SOURCE_DIR_IN_PACKAGE_MANAGER"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x01af
            java.lang.String r1 = "PUBLIC_SOURCE_DIR_IN_PACKAGE_MANAGER"
            java.lang.String r0 = m254L(r10)     // Catch:{ Throwable -> 0x01a9 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x01a9 }
            goto L_0x01af
        L_0x01a9:
            r1 = move-exception
            java.lang.String r0 = "PUBLIC_SOURCE_DIR_IN_PACKAGE_MANAGER"
            m252J(r3, r0, r1)
        L_0x01af:
            java.lang.String r0 = "PUBLIC_SOURCE_DIR_LAST_MODIFIED"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x01dc
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r0 = m254L(r10)     // Catch:{ Throwable -> 0x01d6 }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r1 = "File doesn't exist"
            boolean r0 = r5.exists()     // Catch:{ Throwable -> 0x01d6 }
            if (r0 == 0) goto L_0x01d0
            long r0 = r5.lastModified()     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ Throwable -> 0x01d6 }
        L_0x01d0:
            java.lang.String r0 = "PUBLIC_SOURCE_DIR_LAST_MODIFIED"
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Throwable -> 0x01d6 }
            goto L_0x01dc
        L_0x01d6:
            r1 = move-exception
            java.lang.String r0 = "PUBLIC_SOURCE_DIR_LAST_MODIFIED"
            m252J(r3, r0, r1)
        L_0x01dc:
            java.lang.String r0 = "CRASH_CONFIGURATION"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0300
            android.content.res.Resources r0 = r10.getResources()     // Catch:{ Throwable -> 0x02fa }
            if (r0 == 0) goto L_0x0300
            android.content.res.Configuration r13 = r0.getConfiguration()     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r12 = "CRASH_CONFIGURATION"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02fa }
            r11.<init>()     // Catch:{ Throwable -> 0x02fa }
            java.lang.Class r0 = r13.getClass()     // Catch:{ Throwable -> 0x02fa }
            java.lang.reflect.Field[] r9 = r0.getFields()     // Catch:{ Throwable -> 0x02fa }
            int r8 = r9.length     // Catch:{ Throwable -> 0x02fa }
            r0 = 0
        L_0x01ff:
            if (r0 >= r8) goto L_0x02f2
            r7 = r9[r0]     // Catch:{ Throwable -> 0x02fa }
            int r1 = r7.getModifiers()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r1 != 0) goto L_0x02ee
            java.lang.String r1 = r7.getName()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            r11.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            r1 = 61
            r11.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.Class r5 = r7.getType()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            boolean r1 = r5.equals(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r1 == 0) goto L_0x02be
            java.lang.String r1 = r7.getName()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r5 = "mcc"
            boolean r5 = r1.equals(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r5 != 0) goto L_0x02b5
            java.lang.String r5 = "mnc"
            boolean r5 = r1.equals(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r5 != 0) goto L_0x02b5
            java.lang.String r5 = "uiMode"
            boolean r5 = r1.equals(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r5 == 0) goto L_0x025d
            java.util.TreeMap r5 = p000X.AnonymousClass021.f338K     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = "UI_MODE_"
            java.lang.Object r5 = r5.get(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            int r1 = r7.getInt(r13)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = p000X.AnonymousClass021.m291B(r5, r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
        L_0x0253:
            r11.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
        L_0x0256:
            r1 = 10
            r11.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            goto L_0x02ee
        L_0x025d:
            java.lang.String r5 = "screenLayout"
            boolean r5 = r1.equals(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r5 == 0) goto L_0x0278
            java.util.TreeMap r5 = p000X.AnonymousClass021.f338K     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = "SCREENLAYOUT_"
            java.lang.Object r5 = r5.get(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            int r1 = r7.getInt(r13)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = p000X.AnonymousClass021.m291B(r5, r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            goto L_0x0253
        L_0x0278:
            java.util.TreeMap r6 = p000X.AnonymousClass021.f338K     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            r5.<init>()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = r1.toUpperCase()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            r5.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            r1 = 95
            r5.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = r5.toString()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.Object r5 = r6.get(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r5 != 0) goto L_0x02a0
            int r1 = r7.getInt(r13)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            goto L_0x0253
        L_0x02a0:
            int r1 = r7.getInt(r13)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.Object r1 = r5.get(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r1 != 0) goto L_0x0253
            int r1 = r7.getInt(r13)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            goto L_0x0253
        L_0x02b5:
            int r1 = r7.getInt(r13)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            goto L_0x0253
        L_0x02be:
            java.lang.Object r5 = r7.get(r13)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r5 != 0) goto L_0x02ca
            java.lang.String r1 = "null"
            r11.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            goto L_0x0256
        L_0x02ca:
            boolean r1 = r5 instanceof java.lang.Object[]     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            if (r1 == 0) goto L_0x02d9
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = java.util.Arrays.deepToString(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            r11.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            goto L_0x0256
        L_0x02d9:
            java.lang.Object r1 = r7.get(r13)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            r11.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x02e6 }
            goto L_0x0256
        L_0x02e6:
            r6 = move-exception
            java.lang.String r5 = "ACRA"
            java.lang.String r1 = "Error while inspecting device configuration: "
            p000X.C000600f.m74I(r5, r6, r1)     // Catch:{ Throwable -> 0x02fa }
        L_0x02ee:
            int r0 = r0 + 1
            goto L_0x01ff
        L_0x02f2:
            java.lang.String r0 = r11.toString()     // Catch:{ Throwable -> 0x02fa }
            p000X.AnonymousClass00G.m25G(r12, r0, r3, r2)     // Catch:{ Throwable -> 0x02fa }
            goto L_0x0300
        L_0x02fa:
            r1 = move-exception
            java.lang.String r0 = "CRASH_CONFIGURATION"
            m252J(r3, r0, r1)
        L_0x0300:
            java.lang.String r0 = "AVAILABLE_MEM_SIZE"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0320
            if (r16 != 0) goto L_0x0320
            r0 = 1
            long r0 = m245C(r0)     // Catch:{ Throwable -> 0x031a }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ Throwable -> 0x031a }
            java.lang.String r0 = "AVAILABLE_MEM_SIZE"
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Throwable -> 0x031a }
            goto L_0x0320
        L_0x031a:
            r1 = move-exception
            java.lang.String r0 = "AVAILABLE_MEM_SIZE"
            m252J(r3, r0, r1)
        L_0x0320:
            java.lang.String r0 = "DUMPSYS_MEMINFO"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x052a
            if (r16 != 0) goto L_0x052a
            java.lang.String r21 = "DUMPSYS_MEMINFO"
            r12 = 1149239296(0x44800000, float:1024.0)
            r9 = 3
            r20 = 2
            r19 = 1
            r18 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0524 }
            r8.<init>()     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r10.getSystemService(r0)     // Catch:{ Throwable -> 0x0524 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ Throwable -> 0x0524 }
            android.app.ActivityManager$MemoryInfo r11 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Throwable -> 0x0524 }
            r11.<init>()     // Catch:{ Throwable -> 0x0524 }
            r0.getMemoryInfo(r11)     // Catch:{ Throwable -> 0x0524 }
            android.os.Debug$MemoryInfo r7 = new android.os.Debug$MemoryInfo     // Catch:{ Throwable -> 0x0524 }
            r7.<init>()     // Catch:{ Throwable -> 0x0524 }
            android.os.Debug.getMemoryInfo(r7)     // Catch:{ Throwable -> 0x0524 }
            int r6 = r0.getMemoryClass()     // Catch:{ Throwable -> 0x0524 }
            r5 = 1120403456(0x42c80000, float:100.0)
            int r1 = r7.nativePrivateDirty     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.dalvikPrivateDirty     // Catch:{ Throwable -> 0x0524 }
            int r1 = r1 + r0
            float r1 = (float) r1     // Catch:{ Throwable -> 0x0524 }
            float r0 = (float) r6     // Catch:{ Throwable -> 0x0524 }
            float r0 = r0 * r12
            float r1 = r1 / r0
            float r5 = r5 * r1
            int r0 = (int) r5     // Catch:{ Throwable -> 0x0524 }
            r17 = r0
            int r0 = r7.nativePrivateDirty     // Catch:{ Throwable -> 0x0524 }
            int r0 = r0 * 100
            float r1 = (float) r0     // Catch:{ Throwable -> 0x0524 }
            float r0 = (float) r6     // Catch:{ Throwable -> 0x0524 }
            float r0 = r0 * r12
            float r1 = r1 / r0
            int r0 = (int) r1     // Catch:{ Throwable -> 0x0524 }
            r22 = r0
            int r1 = r7.nativePrivateDirty     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.dalvikPrivateDirty     // Catch:{ Throwable -> 0x0524 }
            int r1 = r1 + r0
            int r0 = r7.otherPrivateDirty     // Catch:{ Throwable -> 0x0524 }
            int r1 = r1 + r0
            int r0 = r1 * 100
            float r1 = (float) r0     // Catch:{ Throwable -> 0x0524 }
            float r0 = (float) r6     // Catch:{ Throwable -> 0x0524 }
            float r0 = r0 * r12
            float r1 = r1 / r0
            int r13 = (int) r1     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.otherPrivateDirty     // Catch:{ Throwable -> 0x0524 }
            int r0 = r0 * 100
            float r1 = (float) r0     // Catch:{ Throwable -> 0x0524 }
            float r0 = (float) r6     // Catch:{ Throwable -> 0x0524 }
            float r0 = r0 * r12
            float r1 = r1 / r0
            int r12 = (int) r1     // Catch:{ Throwable -> 0x0524 }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r1 = "percent dalvik+native / native / d+n+other / other %d / %d / %d / %d"
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ Throwable -> 0x0524 }
            r0[r18] = r17     // Catch:{ Throwable -> 0x0524 }
            r17 = r22
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ Throwable -> 0x0524 }
            r0[r19] = r17     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0524 }
            r0[r20] = r13     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Throwable -> 0x0524 }
            r0[r9] = r12     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = java.lang.String.format(r5, r1, r0)     // Catch:{ Throwable -> 0x0524 }
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = "avail/thresh/low? "
            r5.<init>(r0)     // Catch:{ Throwable -> 0x0524 }
            long r0 = r11.availMem     // Catch:{ Throwable -> 0x0524 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r12 = "/"
            r5.append(r12)     // Catch:{ Throwable -> 0x0524 }
            long r0 = r11.threshold     // Catch:{ Throwable -> 0x0524 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0524 }
            r5.append(r12)     // Catch:{ Throwable -> 0x0524 }
            boolean r0 = r11.lowMemory     // Catch:{ Throwable -> 0x0524 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = "/("
            r5.append(r0)     // Catch:{ Throwable -> 0x0524 }
            r0 = 100
            long r12 = r11.threshold     // Catch:{ Throwable -> 0x0524 }
            long r0 = r0 * r12
            float r12 = (float) r0     // Catch:{ Throwable -> 0x0524 }
            long r0 = r11.availMem     // Catch:{ Throwable -> 0x0524 }
            float r0 = (float) r0     // Catch:{ Throwable -> 0x0524 }
            float r12 = r12 / r0
            int r0 = (int) r12     // Catch:{ Throwable -> 0x0524 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = "%) memclass="
            r5.append(r0)     // Catch:{ Throwable -> 0x0524 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = r5.toString()     // Catch:{ Throwable -> 0x0524 }
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = "DebugMemInfo(kB): Private / Proportional / Shared"
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r5 = "          dalvik: %7d / %7d / %7d"
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.dalvikPrivateDirty     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r18] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.dalvikPss     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r19] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.dalvikSharedDirty     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r20] = r0     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = java.lang.String.format(r6, r5, r1)     // Catch:{ Throwable -> 0x0524 }
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r5 = "          native: %7d / %7d / %7d"
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.nativePrivateDirty     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r18] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.nativePss     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r19] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.nativeSharedDirty     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r20] = r0     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = java.lang.String.format(r6, r5, r1)     // Catch:{ Throwable -> 0x0524 }
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r5 = "           other: %7d / %7d / %7d"
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.otherPrivateDirty     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r18] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.otherPss     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r19] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = r7.otherSharedDirty     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r20] = r0     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = java.lang.String.format(r6, r5, r1)     // Catch:{ Throwable -> 0x0524 }
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r5 = "GC: %d GCs, %d freed, %d free count"
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0524 }
            int r0 = android.os.Debug.getGlobalGcInvocationCount()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r18] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = android.os.Debug.getGlobalFreedSize()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r19] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = android.os.Debug.getGlobalFreedCount()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r20] = r0     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = java.lang.String.format(r6, r5, r1)     // Catch:{ Throwable -> 0x0524 }
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r6 = "Native Heap: size/allocated/free %7d / %7d / %7d"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0524 }
            long r0 = android.os.Debug.getNativeHeapSize()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r5[r18] = r0     // Catch:{ Throwable -> 0x0524 }
            long r0 = android.os.Debug.getNativeHeapAllocatedSize()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r5[r19] = r0     // Catch:{ Throwable -> 0x0524 }
            long r0 = android.os.Debug.getNativeHeapFreeSize()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r5[r20] = r0     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = java.lang.String.format(r7, r6, r5)     // Catch:{ Throwable -> 0x0524 }
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r5 = "Threads: alloc count/alloc size/ext ac/ext as %7d / %7d / %7d / %7d"
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0524 }
            int r0 = android.os.Debug.getThreadAllocCount()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r18] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = android.os.Debug.getThreadAllocSize()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r19] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = android.os.Debug.getThreadExternalAllocCount()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r20] = r0     // Catch:{ Throwable -> 0x0524 }
            int r0 = android.os.Debug.getThreadExternalAllocSize()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r1[r9] = r0     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = java.lang.String.format(r7, r5, r1)     // Catch:{ Throwable -> 0x0524 }
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.Runtime r13 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r6 = "Java Heap: size/allocated/free %7d / %7d / %7d"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0524 }
            long r0 = r13.maxMemory()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r5[r18] = r0     // Catch:{ Throwable -> 0x0524 }
            long r11 = r13.totalMemory()     // Catch:{ Throwable -> 0x0524 }
            long r0 = r13.freeMemory()     // Catch:{ Throwable -> 0x0524 }
            long r11 = r11 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ Throwable -> 0x0524 }
            r5[r19] = r0     // Catch:{ Throwable -> 0x0524 }
            long r0 = r13.freeMemory()     // Catch:{ Throwable -> 0x0524 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Throwable -> 0x0524 }
            r5[r20] = r0     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r0 = java.lang.String.format(r7, r6, r5)     // Catch:{ Throwable -> 0x0524 }
            r8.append(r0)     // Catch:{ Throwable -> 0x0524 }
            java.lang.String r1 = r8.toString()     // Catch:{ Throwable -> 0x0524 }
            r0 = r21
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Throwable -> 0x0524 }
            goto L_0x052a
        L_0x0524:
            r1 = move-exception
            java.lang.String r0 = "DUMPSYS_MEMINFO"
            m252J(r3, r0, r1)
        L_0x052a:
            java.lang.String r0 = "DUMPSYS_USERINFO"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x055b
            java.lang.String r5 = "DUMPSYS_USERINFO"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0555 }
            r0 = 17
            if (r1 < r0) goto L_0x0552
            java.lang.String r0 = "user"
            java.lang.Object r1 = r10.getSystemService(r0)     // Catch:{ Throwable -> 0x0555 }
            android.os.UserManager r1 = (android.os.UserManager) r1     // Catch:{ Throwable -> 0x0555 }
            android.os.UserHandle r0 = android.os.Process.myUserHandle()     // Catch:{ Throwable -> 0x0555 }
            long r0 = r1.getSerialNumberForUser(r0)     // Catch:{ Throwable -> 0x0555 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ Throwable -> 0x0555 }
        L_0x054e:
            p000X.AnonymousClass00G.m25G(r5, r0, r3, r2)     // Catch:{ Throwable -> 0x0555 }
            goto L_0x055b
        L_0x0552:
            java.lang.String r0 = ""
            goto L_0x054e
        L_0x0555:
            r1 = move-exception
            java.lang.String r0 = "DUMPSYS_USERINFO"
            m252J(r3, r0, r1)
        L_0x055b:
            if (r16 != 0) goto L_0x05bf
            java.lang.String r0 = "DISK_SIZE_TOTAL"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x057b
            r0 = 1024(0x400, double:5.06E-321)
            long r0 = m249G(r0)     // Catch:{ Exception -> 0x0575 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x0575 }
            java.lang.String r0 = "DISK_SIZE_TOTAL"
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Exception -> 0x0575 }
            goto L_0x057b
        L_0x0575:
            r1 = move-exception
            java.lang.String r0 = "DISK_SIZE_TOTAL"
            m252J(r3, r0, r1)
        L_0x057b:
            java.lang.String r0 = "DISK_SIZE_AVAILABLE"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0599
            r0 = 1024(0x400, double:5.06E-321)
            long r0 = m245C(r0)     // Catch:{ Exception -> 0x0593 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x0593 }
            java.lang.String r0 = "DISK_SIZE_AVAILABLE"
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Exception -> 0x0593 }
            goto L_0x0599
        L_0x0593:
            r1 = move-exception
            java.lang.String r0 = "DISK_SIZE_AVAILABLE"
            m252J(r3, r0, r1)
        L_0x0599:
            java.lang.String r0 = "DISK_SIZE_USED"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x05bf
            r0 = 1
            long r5 = m249G(r0)     // Catch:{ Exception -> 0x05b9 }
            long r0 = m245C(r0)     // Catch:{ Exception -> 0x05b9 }
            long r5 = r5 - r0
            r0 = 1024(0x400, double:5.06E-321)
            long r5 = r5 / r0
            java.lang.String r1 = java.lang.Long.toString(r5)     // Catch:{ Exception -> 0x05b9 }
            java.lang.String r0 = "DISK_SIZE_USED"
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Exception -> 0x05b9 }
            goto L_0x05bf
        L_0x05b9:
            r1 = move-exception
            java.lang.String r0 = "DISK_SIZE_USED"
            m252J(r3, r0, r1)
        L_0x05bf:
            java.lang.String r0 = "USER_CRASH_DATE"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x05ed
            android.text.format.Time r5 = new android.text.format.Time     // Catch:{ Throwable -> 0x05e7 }
            r5.<init>()     // Catch:{ Throwable -> 0x05e7 }
            if (r16 != 0) goto L_0x05cf
            goto L_0x05d9
        L_0x05cf:
            java.io.File r0 = r14.f269C     // Catch:{ Throwable -> 0x05e7 }
            long r0 = r0.lastModified()     // Catch:{ Throwable -> 0x05e7 }
            r5.set(r0)     // Catch:{ Throwable -> 0x05e7 }
            goto L_0x05dc
        L_0x05d9:
            r5.setToNow()     // Catch:{ Throwable -> 0x05e7 }
        L_0x05dc:
            java.lang.String r1 = "USER_CRASH_DATE"
            r0 = 0
            java.lang.String r0 = r5.format3339(r0)     // Catch:{ Throwable -> 0x05e7 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x05e7 }
            goto L_0x05ed
        L_0x05e7:
            r1 = move-exception
            java.lang.String r0 = "USER_CRASH_DATE"
            m252J(r3, r0, r1)
        L_0x05ed:
            java.lang.String r0 = "ACTIVITY_LOG"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0617
            if (r16 != 0) goto L_0x0617
            r0 = r25
            boolean r0 = r0 instanceof java.lang.OutOfMemoryError     // Catch:{ Throwable -> 0x0611 }
            if (r0 == 0) goto L_0x0609
            X.00T r0 = r4.f47C     // Catch:{ Throwable -> 0x0611 }
            java.lang.String r1 = r0.toString()     // Catch:{ Throwable -> 0x0611 }
        L_0x0603:
            java.lang.String r0 = "ACTIVITY_LOG"
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Throwable -> 0x0611 }
            goto L_0x0617
        L_0x0609:
            X.00T r1 = r4.f47C     // Catch:{ Throwable -> 0x0611 }
            r0 = 5
            java.lang.String r1 = r1.mo24A(r0)     // Catch:{ Throwable -> 0x0611 }
            goto L_0x0603
        L_0x0611:
            r1 = move-exception
            java.lang.String r0 = "ACTIVITY_LOG"
            m252J(r3, r0, r1)
        L_0x0617:
            java.lang.String r0 = "PROCESS_NAME_BY_AMS"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0639
            if (r16 != 0) goto L_0x0639
            java.lang.String r1 = "PROCESS_NAME_BY_AMS"
            java.lang.String r0 = m248F(r10)     // Catch:{ Throwable -> 0x0633 }
            if (r0 != 0) goto L_0x062b
            java.lang.String r0 = "n/a"
        L_0x062b:
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0633 }
            java.lang.String r0 = "!"
            f265B = r0     // Catch:{ Throwable -> 0x0633 }
            goto L_0x0639
        L_0x0633:
            r1 = move-exception
            java.lang.String r0 = "PROCESS_NAME_BY_AMS"
            m252J(r3, r0, r1)
        L_0x0639:
            java.lang.String r0 = "OPEN_FD_COUNT"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0659
            java.lang.String r1 = "OPEN_FD_COUNT"
            X.01e r0 = p000X.C002901e.m242B()     // Catch:{ Throwable -> 0x0653 }
            int r0 = r0.getOpenFDCount()     // Catch:{ Throwable -> 0x0653 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x0653 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0653 }
            goto L_0x0659
        L_0x0653:
            r1 = move-exception
            java.lang.String r0 = "OPEN_FD_COUNT"
            m252J(r3, r0, r1)
        L_0x0659:
            r5 = 0
            X.01e r0 = p000X.C002901e.m242B()     // Catch:{ Throwable -> 0x0663 }
            X.01f r5 = r0.getOpenFDLimits()     // Catch:{ Throwable -> 0x0663 }
            goto L_0x066b
        L_0x0663:
            r6 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "unable to retrieve open FD info: not logging FD fields"
            p000X.C000600f.m82Q(r1, r6, r0)
        L_0x066b:
            if (r5 == 0) goto L_0x06a1
            java.lang.String r0 = "OPEN_FD_SOFT_LIMIT"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0687
            java.lang.String r1 = "OPEN_FD_SOFT_LIMIT"
            int r0 = r5.f257C     // Catch:{ Throwable -> 0x0681 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Throwable -> 0x0681 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0681 }
            goto L_0x0687
        L_0x0681:
            r1 = move-exception
            java.lang.String r0 = "OPEN_FD_SOFT_LIMIT"
            m252J(r3, r0, r1)
        L_0x0687:
            java.lang.String r0 = "OPEN_FD_HARD_LIMIT"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x06a1
            java.lang.String r1 = "OPEN_FD_HARD_LIMIT"
            int r0 = r5.f256B     // Catch:{ Throwable -> 0x069b }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Throwable -> 0x069b }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x069b }
            goto L_0x06a1
        L_0x069b:
            r1 = move-exception
            java.lang.String r0 = "OPEN_FD_HARD_LIMIT"
            m252J(r3, r0, r1)
        L_0x06a1:
            java.lang.String r0 = "RUNTIME_PERMISSIONS"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x081f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0819 }
            r0 = 23
            if (r1 < r0) goto L_0x081f
            r8 = 9
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0819 }
            r7.<init>()     // Catch:{ Throwable -> 0x0819 }
            r0 = 0
        L_0x06b7:
            if (r0 >= r8) goto L_0x080f
            java.lang.String[] r1 = p000X.AnonymousClass029.f340B     // Catch:{ Throwable -> 0x0819 }
            r5 = r1[r0]     // Catch:{ Throwable -> 0x0819 }
            r6 = -1
            int r1 = r5.hashCode()     // Catch:{ Throwable -> 0x0819 }
            switch(r1) {
                case -2062386608: goto L_0x079b;
                case -1928411001: goto L_0x06c7;
                case -1921431796: goto L_0x0743;
                case -1888586689: goto L_0x0709;
                case -1479758289: goto L_0x07a6;
                case -1238066820: goto L_0x077a;
                case -895673731: goto L_0x0790;
                case -406040016: goto L_0x07b1;
                case -63024214: goto L_0x0714;
                case -5573545: goto L_0x072b;
                case 52602690: goto L_0x0785;
                case 112197485: goto L_0x0737;
                case 214526995: goto L_0x06f3;
                case 463403621: goto L_0x06dd;
                case 603653886: goto L_0x06d2;
                case 610633091: goto L_0x074e;
                case 784519842: goto L_0x0764;
                case 952819282: goto L_0x076f;
                case 1271781903: goto L_0x06fe;
                case 1365911975: goto L_0x07bc;
                case 1831139720: goto L_0x071f;
                case 1977429404: goto L_0x06e8;
                case 2133799037: goto L_0x0759;
                default: goto L_0x06c5;
            }     // Catch:{ Throwable -> 0x0819 }
        L_0x06c5:
            goto L_0x07c6
        L_0x06c7:
            java.lang.String r1 = "android.permission.READ_CALENDAR"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 0
            goto L_0x07c6
        L_0x06d2:
            java.lang.String r1 = "android.permission.WRITE_CALENDAR"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 1
            goto L_0x07c6
        L_0x06dd:
            java.lang.String r1 = "android.permission.CAMERA"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 2
            goto L_0x07c6
        L_0x06e8:
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 3
            goto L_0x07c6
        L_0x06f3:
            java.lang.String r1 = "android.permission.WRITE_CONTACTS"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 4
            goto L_0x07c6
        L_0x06fe:
            java.lang.String r1 = "android.permission.GET_ACCOUNTS"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 5
            goto L_0x07c6
        L_0x0709:
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 6
            goto L_0x07c6
        L_0x0714:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 7
            goto L_0x07c6
        L_0x071f:
            java.lang.String r1 = "android.permission.RECORD_AUDIO"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 8
            goto L_0x07c6
        L_0x072b:
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 9
            goto L_0x07c6
        L_0x0737:
            java.lang.String r1 = "android.permission.CALL_PHONE"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 10
            goto L_0x07c6
        L_0x0743:
            java.lang.String r1 = "android.permission.READ_CALL_LOG"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 11
            goto L_0x07c6
        L_0x074e:
            java.lang.String r1 = "android.permission.WRITE_CALL_LOG"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 12
            goto L_0x07c6
        L_0x0759:
            java.lang.String r1 = "com.android.voicemail.permission.ADD_VOICEMAIL"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 13
            goto L_0x07c6
        L_0x0764:
            java.lang.String r1 = "android.permission.USE_SIP"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 14
            goto L_0x07c6
        L_0x076f:
            java.lang.String r1 = "android.permission.PROCESS_OUTGOING_CALLS"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 15
            goto L_0x07c6
        L_0x077a:
            java.lang.String r1 = "android.permission.BODY_SENSORS"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 16
            goto L_0x07c6
        L_0x0785:
            java.lang.String r1 = "android.permission.SEND_SMS"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 17
            goto L_0x07c6
        L_0x0790:
            java.lang.String r1 = "android.permission.RECEIVE_SMS"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 18
            goto L_0x07c6
        L_0x079b:
            java.lang.String r1 = "android.permission.READ_SMS"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 19
            goto L_0x07c6
        L_0x07a6:
            java.lang.String r1 = "android.permission.RECEIVE_WAP_PUSH"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 20
            goto L_0x07c6
        L_0x07b1:
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 21
            goto L_0x07c6
        L_0x07bc:
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 == 0) goto L_0x07c6
            r6 = 22
        L_0x07c6:
            switch(r6) {
                case 0: goto L_0x07cb;
                case 1: goto L_0x07cb;
                case 2: goto L_0x07ce;
                case 3: goto L_0x07d1;
                case 4: goto L_0x07d1;
                case 5: goto L_0x07d1;
                case 6: goto L_0x07d4;
                case 7: goto L_0x07d4;
                case 8: goto L_0x07d7;
                case 9: goto L_0x07da;
                case 10: goto L_0x07da;
                case 11: goto L_0x07da;
                case 12: goto L_0x07da;
                case 13: goto L_0x07da;
                case 14: goto L_0x07da;
                case 15: goto L_0x07da;
                case 16: goto L_0x07dd;
                case 17: goto L_0x07e0;
                case 18: goto L_0x07e0;
                case 19: goto L_0x07e0;
                case 20: goto L_0x07e0;
                case 21: goto L_0x07e3;
                case 22: goto L_0x07e3;
                default: goto L_0x07c9;
            }     // Catch:{ Throwable -> 0x0819 }
        L_0x07c9:
            r6 = 0
            goto L_0x07e5
        L_0x07cb:
            java.lang.String r6 = "android.permission-group.CALENDAR"
            goto L_0x07e5
        L_0x07ce:
            java.lang.String r6 = "android.permission-group.CAMERA"
            goto L_0x07e5
        L_0x07d1:
            java.lang.String r6 = "android.permission-group.CONTACTS"
            goto L_0x07e5
        L_0x07d4:
            java.lang.String r6 = "android.permission-group.LOCATION"
            goto L_0x07e5
        L_0x07d7:
            java.lang.String r6 = "android.permission-group.MICROPHONE"
            goto L_0x07e5
        L_0x07da:
            java.lang.String r6 = "android.permission-group.PHONE"
            goto L_0x07e5
        L_0x07dd:
            java.lang.String r6 = "android.permission-group.SENSORS"
            goto L_0x07e5
        L_0x07e0:
            java.lang.String r6 = "android.permission-group.SMS"
            goto L_0x07e5
        L_0x07e3:
            java.lang.String r6 = "android.permission-group.STORAGE"
        L_0x07e5:
            r1 = 46
            int r1 = r6.lastIndexOf(r1)     // Catch:{ Throwable -> 0x0819 }
            if (r1 < 0) goto L_0x07f3
            int r1 = r1 + 1
            java.lang.String r6 = r6.substring(r1)     // Catch:{ Throwable -> 0x0819 }
        L_0x07f3:
            java.lang.String[] r1 = p000X.AnonymousClass029.f340B     // Catch:{ Throwable -> 0x0819 }
            r1 = r1[r0]     // Catch:{ Throwable -> 0x0819 }
            r5 = 0
            int r1 = r10.checkCallingOrSelfPermission(r1)     // Catch:{ RuntimeException -> 0x07ff }
            if (r1 != 0) goto L_0x07ff
            r5 = 1
        L_0x07ff:
            r7.put(r6, r5)     // Catch:{ JSONException -> 0x0803 }
            goto L_0x080b
        L_0x0803:
            r6 = move-exception
            java.lang.String r5 = "PermissionsReporter"
            java.lang.String r1 = "Caught JSONException"
            p000X.C000600f.m74I(r5, r6, r1)     // Catch:{ Throwable -> 0x0819 }
        L_0x080b:
            int r0 = r0 + 1
            goto L_0x06b7
        L_0x080f:
            java.lang.String r1 = r7.toString()     // Catch:{ Throwable -> 0x0819 }
            java.lang.String r0 = "RUNTIME_PERMISSIONS"
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Throwable -> 0x0819 }
            goto L_0x081f
        L_0x0819:
            r1 = move-exception
            java.lang.String r0 = "RUNTIME_PERMISSIONS"
            m252J(r3, r0, r1)
        L_0x081f:
            if (r16 != 0) goto L_0x0875
            java.lang.String r0 = "LOGCAT"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x083b
            r1 = 0
            r0 = 0
            java.lang.String r1 = p000X.AnonymousClass028.m293B(r10, r1, r0)     // Catch:{ Throwable -> 0x0835 }
            java.lang.String r0 = "LOGCAT"
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Throwable -> 0x0835 }
            goto L_0x083b
        L_0x0835:
            r1 = move-exception
            java.lang.String r0 = "LOGCAT"
            m252J(r3, r0, r1)
        L_0x083b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 >= r0) goto L_0x08a4
            java.lang.String r0 = "EVENTSLOG"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x085c
            java.lang.String r5 = "EVENTSLOG"
            java.lang.String r1 = "events"
            r0 = 0
            java.lang.String r0 = p000X.AnonymousClass028.m293B(r10, r1, r0)     // Catch:{ Throwable -> 0x0856 }
            p000X.AnonymousClass00G.m25G(r5, r0, r3, r2)     // Catch:{ Throwable -> 0x0856 }
            goto L_0x085c
        L_0x0856:
            r1 = move-exception
            java.lang.String r0 = "EVENTSLOG"
            m252J(r3, r0, r1)
        L_0x085c:
            java.lang.String r0 = "RADIOLOG"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x08a4
            java.lang.String r5 = "RADIOLOG"
            java.lang.String r1 = "radio"
            r0 = 0
            java.lang.String r0 = p000X.AnonymousClass028.m293B(r10, r1, r0)     // Catch:{ Throwable -> 0x0871 }
            p000X.AnonymousClass00G.m25G(r5, r0, r3, r2)     // Catch:{ Throwable -> 0x0871 }
            goto L_0x08a4
        L_0x0871:
            r1 = move-exception
            java.lang.String r0 = "RADIOLOG"
            goto L_0x08a1
        L_0x0875:
            java.lang.String r0 = "LOGCAT"
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x08a4
            r7 = 0
            if (r16 == 0) goto L_0x0893
            java.lang.String r0 = "logcatFileName"
            java.lang.String r7 = r15.mo96B(r0)     // Catch:{ Throwable -> 0x089e }
            java.lang.String r6 = "ACRA"
            java.lang.String r5 = "logcat Logcat file name from minidump : %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x089e }
            r0 = 0
            r1[r0] = r7     // Catch:{ Throwable -> 0x089e }
            p000X.C000600f.m81P(r6, r5, r1)     // Catch:{ Throwable -> 0x089e }
        L_0x0893:
            r0 = 0
            java.lang.String r1 = p000X.AnonymousClass028.m293B(r10, r0, r7)     // Catch:{ Throwable -> 0x089e }
            java.lang.String r0 = "LOGCAT"
            p000X.AnonymousClass00G.m25G(r0, r1, r3, r2)     // Catch:{ Throwable -> 0x089e }
            goto L_0x08a4
        L_0x089e:
            r1 = move-exception
            java.lang.String r0 = "LOGCAT"
        L_0x08a1:
            m252J(r3, r0, r1)
        L_0x08a4:
            java.lang.String r0 = "LARGE_MEM_HEAP"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x08eb
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x08e5 }
            r0 = 11
            if (r1 < r0) goto L_0x08eb
            java.lang.String r7 = "LARGE_MEM_HEAP"
            r0 = 11
            if (r1 < r0) goto L_0x08e2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x08e5 }
            r6.<init>()     // Catch:{ Throwable -> 0x08e5 }
            java.lang.String r0 = "activity"
            java.lang.Object r5 = r10.getSystemService(r0)     // Catch:{ Throwable -> 0x08e5 }
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch:{ Throwable -> 0x08e5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x08e5 }
            java.lang.String r0 = "Large heap size ="
            r1.<init>(r0)     // Catch:{ Throwable -> 0x08e5 }
            int r0 = r5.getLargeMemoryClass()     // Catch:{ Throwable -> 0x08e5 }
            r1.append(r0)     // Catch:{ Throwable -> 0x08e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x08e5 }
            r6.append(r0)     // Catch:{ Throwable -> 0x08e5 }
            java.lang.String r0 = r6.toString()     // Catch:{ Throwable -> 0x08e5 }
        L_0x08de:
            p000X.AnonymousClass00G.m25G(r7, r0, r3, r2)     // Catch:{ Throwable -> 0x08e5 }
            goto L_0x08eb
        L_0x08e2:
            java.lang.String r0 = ""
            goto L_0x08de
        L_0x08e5:
            r1 = move-exception
            java.lang.String r0 = "LARGE_MEM_HEAP"
            m252J(r3, r0, r1)
        L_0x08eb:
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            r0 = 0
            if (r5 < r1) goto L_0x08f3
            r0 = 1
        L_0x08f3:
            if (r0 == 0) goto L_0x093f
            java.lang.String r0 = "OPEN_FILE_DESCRIPTORS"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0911
            java.lang.String r1 = "OPEN_FILE_DESCRIPTORS"
            X.01e r0 = p000X.C002901e.m242B()     // Catch:{ Throwable -> 0x090b }
            java.lang.String r0 = r0.getOpenFileDescriptors()     // Catch:{ Throwable -> 0x090b }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x090b }
            goto L_0x0911
        L_0x090b:
            r1 = move-exception
            java.lang.String r0 = "OPEN_FILE_DESCRIPTORS"
            m252J(r3, r0, r1)
        L_0x0911:
            java.lang.String r0 = "DATA_FILE_LS_LR"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x093f
            java.lang.String r6 = "DATA_FILE_LS_LR"
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x0939 }
            r1 = 0
            java.lang.String r0 = "/system/bin/ls"
            r5[r1] = r0     // Catch:{ Throwable -> 0x0939 }
            r1 = 1
            java.lang.String r0 = "-lLR"
            r5[r1] = r0     // Catch:{ Throwable -> 0x0939 }
            r1 = 2
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()     // Catch:{ Throwable -> 0x0939 }
            java.lang.String r0 = r0.dataDir     // Catch:{ Throwable -> 0x0939 }
            r5[r1] = r0     // Catch:{ Throwable -> 0x0939 }
            java.lang.String r0 = p000X.AnonymousClass02N.m306B(r5)     // Catch:{ Throwable -> 0x0939 }
            p000X.AnonymousClass00G.m25G(r6, r0, r3, r2)     // Catch:{ Throwable -> 0x0939 }
            goto L_0x093f
        L_0x0939:
            r1 = move-exception
            java.lang.String r0 = "DATA_FILE_LS_LR"
            m252J(r3, r0, r1)
        L_0x093f:
            if (r16 != 0) goto L_0x0b15
            java.lang.String r0 = "COMPONENTS_TOTAL"
            boolean r0 = m253K(r0, r3)
            if (r0 != 0) goto L_0x0979
            java.lang.String r0 = "COMPONENTS_ENABLED"
            boolean r0 = m253K(r0, r3)
            if (r0 != 0) goto L_0x0979
            java.lang.String r0 = "COMPONENTS_DISABLED"
            boolean r0 = m253K(r0, r3)
            if (r0 != 0) goto L_0x0979
            java.lang.String r0 = "COMPONENTS_DEFAULT"
            boolean r0 = m253K(r0, r3)
            if (r0 != 0) goto L_0x0979
            java.lang.String r0 = "COMPONENTS_DISABLED_NAMES"
            boolean r0 = m253K(r0, r3)
            if (r0 != 0) goto L_0x0979
            java.lang.String r0 = "COMPONENTS_DEFAULT_NAMES"
            boolean r0 = m253K(r0, r3)
            if (r0 != 0) goto L_0x0979
            java.lang.String r0 = "COMPONENTS_FLAG_STATE"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x0b15
        L_0x0979:
            X.020 r1 = new X.020     // Catch:{ Throwable -> 0x0b08 }
            r1.<init>(r10)     // Catch:{ Throwable -> 0x0b08 }
            r13 = 0
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0b08 }
            r9.<init>()     // Catch:{ Throwable -> 0x0b08 }
            r12 = 3
            r11 = 2
            r10 = 1
            android.content.Context r0 = r1.f328B     // Catch:{ Throwable -> 0x0b08 }
            android.content.res.AssetManager r5 = r0.getAssets()     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r0 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r8 = r5.openXmlResourceParser(r0)     // Catch:{ Throwable -> 0x0b08 }
        L_0x0993:
            int r0 = r8.next()     // Catch:{ all -> 0x0b03 }
            if (r0 == r10) goto L_0x0a13
            if (r0 != r11) goto L_0x0993
            java.lang.String r5 = r8.getName()     // Catch:{ all -> 0x0b03 }
            java.lang.String r0 = "manifest"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0b03 }
            if (r0 == 0) goto L_0x0993
            int r7 = r8.getDepth()     // Catch:{ all -> 0x0b03 }
        L_0x09ab:
            int r5 = r8.next()     // Catch:{ all -> 0x0b03 }
            if (r5 == r10) goto L_0x0993
            if (r5 != r12) goto L_0x09b9
            int r0 = r8.getDepth()     // Catch:{ all -> 0x0b03 }
            if (r0 == r7) goto L_0x0993
        L_0x09b9:
            if (r5 != r11) goto L_0x09ab
            java.lang.String r5 = r8.getName()     // Catch:{ all -> 0x0b03 }
            java.lang.String r0 = "application"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0b03 }
            if (r0 == 0) goto L_0x09ab
            int r6 = r8.getDepth()     // Catch:{ all -> 0x0b03 }
        L_0x09cb:
            int r5 = r8.next()     // Catch:{ all -> 0x0b03 }
            if (r5 == r10) goto L_0x09ab
            if (r5 != r12) goto L_0x09d9
            int r0 = r8.getDepth()     // Catch:{ all -> 0x0b03 }
            if (r0 == r6) goto L_0x09ab
        L_0x09d9:
            if (r5 != r11) goto L_0x09cb
            java.lang.String r5 = r8.getName()     // Catch:{ all -> 0x0b03 }
            java.lang.String r0 = "activity"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0b03 }
            if (r0 != 0) goto L_0x0a07
            java.lang.String r0 = "activity-alias"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0b03 }
            if (r0 != 0) goto L_0x0a07
            java.lang.String r0 = "receiver"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0b03 }
            if (r0 != 0) goto L_0x0a07
            java.lang.String r0 = "service"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0b03 }
            if (r0 != 0) goto L_0x0a07
            java.lang.String r0 = "provider"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0b03 }
            if (r0 == 0) goto L_0x09cb
        L_0x0a07:
            java.lang.String r5 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = "name"
            java.lang.String r0 = r8.getAttributeValue(r5, r0)     // Catch:{ all -> 0x0b03 }
            r9.add(r0)     // Catch:{ all -> 0x0b03 }
            goto L_0x09cb
        L_0x0a13:
            r8.close()     // Catch:{ Throwable -> 0x0b08 }
            int r10 = r9.size()     // Catch:{ Throwable -> 0x0b08 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0b08 }
            r15.<init>()     // Catch:{ Throwable -> 0x0b08 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0b08 }
            r7.<init>()     // Catch:{ Throwable -> 0x0b08 }
            android.content.Context r0 = r1.f328B     // Catch:{ Throwable -> 0x0b08 }
            android.content.pm.PackageManager r8 = r0.getPackageManager()     // Catch:{ Throwable -> 0x0b08 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Throwable -> 0x0b08 }
            r12 = 0
            r11 = 0
        L_0x0a30:
            boolean r0 = r9.hasNext()     // Catch:{ Throwable -> 0x0b08 }
            if (r0 == 0) goto L_0x0a5a
            java.lang.Object r6 = r9.next()     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x0b08 }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ Throwable -> 0x0b08 }
            android.content.Context r0 = r1.f328B     // Catch:{ Throwable -> 0x0b08 }
            r5.<init>(r0, r6)     // Catch:{ Throwable -> 0x0b08 }
            int r0 = r8.getComponentEnabledSetting(r5)     // Catch:{ Throwable -> 0x0b08 }
            switch(r0) {
                case 0: goto L_0x0a4b;
                case 1: goto L_0x0a51;
                case 2: goto L_0x0a54;
                case 3: goto L_0x0a54;
                case 4: goto L_0x0a54;
                default: goto L_0x0a4a;
            }     // Catch:{ Throwable -> 0x0b08 }
        L_0x0a4a:
            goto L_0x0a30
        L_0x0a4b:
            int r13 = r13 + 1
            r7.add(r6)     // Catch:{ Throwable -> 0x0b08 }
            goto L_0x0a30
        L_0x0a51:
            int r11 = r11 + 1
            goto L_0x0a30
        L_0x0a54:
            int r12 = r12 + 1
            r15.add(r6)     // Catch:{ Throwable -> 0x0b08 }
            goto L_0x0a30
        L_0x0a5a:
            android.content.Context r0 = r1.f328B     // Catch:{ Throwable -> 0x0a6e }
            android.content.pm.PackageManager r6 = r0.getPackageManager()     // Catch:{ Throwable -> 0x0a6e }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ Throwable -> 0x0a6e }
            android.content.Context r1 = r1.f328B     // Catch:{ Throwable -> 0x0a6e }
            java.lang.String r0 = "com.facebook.appcomponentmanager.IndicatorFlagReceiver"
            r5.<init>(r1, r0)     // Catch:{ Throwable -> 0x0a6e }
            int r14 = r6.getComponentEnabledSetting(r5)     // Catch:{ Throwable -> 0x0a6e }
            goto L_0x0a70
        L_0x0a6e:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0a70:
            java.util.Collections.sort(r15)     // Catch:{ Throwable -> 0x0b08 }
            java.util.Collections.sort(r7)     // Catch:{ Throwable -> 0x0b08 }
            X.01z r9 = new X.01z     // Catch:{ Throwable -> 0x0b08 }
            r16 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r0 = "COMPONENTS_TOTAL"
            boolean r0 = m253K(r0, r3)     // Catch:{ Throwable -> 0x0b08 }
            if (r0 == 0) goto L_0x0a90
            java.lang.String r1 = "COMPONENTS_TOTAL"
            int r0 = r9.f327H     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Throwable -> 0x0b08 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0b08 }
        L_0x0a90:
            java.lang.String r0 = "COMPONENTS_ENABLED"
            boolean r0 = m253K(r0, r3)     // Catch:{ Throwable -> 0x0b08 }
            if (r0 == 0) goto L_0x0aa3
            java.lang.String r1 = "COMPONENTS_ENABLED"
            int r0 = r9.f325F     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Throwable -> 0x0b08 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0b08 }
        L_0x0aa3:
            java.lang.String r0 = "COMPONENTS_DISABLED"
            boolean r0 = m253K(r0, r3)     // Catch:{ Throwable -> 0x0b08 }
            if (r0 == 0) goto L_0x0ab6
            java.lang.String r1 = "COMPONENTS_DISABLED"
            int r0 = r9.f324E     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Throwable -> 0x0b08 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0b08 }
        L_0x0ab6:
            java.lang.String r0 = "COMPONENTS_DEFAULT"
            boolean r0 = m253K(r0, r3)     // Catch:{ Throwable -> 0x0b08 }
            if (r0 == 0) goto L_0x0ac9
            java.lang.String r1 = "COMPONENTS_DEFAULT"
            int r0 = r9.f322C     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Throwable -> 0x0b08 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0b08 }
        L_0x0ac9:
            java.lang.String r0 = "COMPONENTS_DEFAULT_NAMES"
            boolean r0 = m253K(r0, r3)     // Catch:{ Throwable -> 0x0b08 }
            if (r0 == 0) goto L_0x0adc
            java.lang.String r1 = "COMPONENTS_DEFAULT_NAMES"
            java.util.List r0 = r9.f321B     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0b08 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0b08 }
        L_0x0adc:
            java.lang.String r0 = "COMPONENTS_DISABLED_NAMES"
            boolean r0 = m253K(r0, r3)     // Catch:{ Throwable -> 0x0b08 }
            if (r0 == 0) goto L_0x0aef
            java.lang.String r1 = "COMPONENTS_DISABLED_NAMES"
            java.util.List r0 = r9.f323D     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0b08 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0b08 }
        L_0x0aef:
            java.lang.String r0 = "COMPONENTS_FLAG_STATE"
            boolean r0 = m253K(r0, r3)     // Catch:{ Throwable -> 0x0b08 }
            if (r0 == 0) goto L_0x0b15
            java.lang.String r1 = "COMPONENTS_FLAG_STATE"
            int r0 = r9.f326G     // Catch:{ Throwable -> 0x0b08 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Throwable -> 0x0b08 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x0b08 }
            goto L_0x0b15
        L_0x0b03:
            r0 = move-exception
            r8.close()     // Catch:{ Throwable -> 0x0b08 }
            throw r0     // Catch:{ Throwable -> 0x0b08 }
        L_0x0b08:
            r5 = move-exception
            java.lang.String r1 = "COMPONENTS_TOTAL"
            java.lang.String r0 = r5.toString()
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)
            m252J(r3, r1, r5)
        L_0x0b15:
            r0 = r23
            android.content.Context r9 = r0.f30B
            r0 = 13
            java.lang.String[] r8 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "BUILD"
            r8[r1] = r0
            r1 = 1
            java.lang.String r0 = "JAIL_BROKEN"
            r8[r1] = r0
            r1 = 2
            java.lang.String r0 = "INSTALLATION_ID"
            r8[r1] = r0
            r1 = 3
            java.lang.String r0 = "TOTAL_MEM_SIZE"
            r8[r1] = r0
            r1 = 4
            java.lang.String r0 = "ENVIRONMENT"
            r8[r1] = r0
            r1 = 5
            java.lang.String r0 = "ANDROID_RUNTIME"
            r8[r1] = r0
            r1 = 6
            java.lang.String r0 = "device_cpu_abis"
            r8[r1] = r0
            r1 = 7
            java.lang.String r0 = "is_64_bit_build"
            r8[r1] = r0
            r1 = 8
            java.lang.String r0 = "DISPLAY"
            r8[r1] = r0
            r1 = 9
            java.lang.String r0 = "DEVICE_FEATURES"
            r8[r1] = r0
            r1 = 10
            java.lang.String r0 = "IS_LOW_RAM_DEVICE"
            r8[r1] = r0
            r1 = 11
            java.lang.String r0 = "WEBVIEW_VERSION"
            r8[r1] = r0
            r1 = 12
            java.lang.String r0 = "PLAY_SERVICES_VERSION"
            r8[r1] = r0
            r0 = 0
        L_0x0b64:
            r1 = 13
            if (r0 >= r1) goto L_0x1035
            r7 = r8[r0]
            boolean r1 = m253K(r7, r3)
            if (r1 == 0) goto L_0x1031
            r17 = 0
            r10 = 1
            java.util.Map r1 = f266C     // Catch:{ Throwable -> 0x102b }
            boolean r1 = r1.containsKey(r7)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0b85
            java.util.Map r1 = f266C     // Catch:{ Throwable -> 0x102b }
            java.lang.Object r5 = r1.get(r7)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x102b }
            goto L_0x1025
        L_0x0b85:
            r5 = -1
            int r1 = r7.hashCode()     // Catch:{ Throwable -> 0x102b }
            switch(r1) {
                case -2055404088: goto L_0x0be4;
                case -1905220446: goto L_0x0bc5;
                case -1605187834: goto L_0x0bf8;
                case -522074816: goto L_0x0c02;
                case -450347134: goto L_0x0b99;
                case -94228910: goto L_0x0ba4;
                case 52048902: goto L_0x0bba;
                case 63557198: goto L_0x0b8f;
                case 1052445527: goto L_0x0baf;
                case 1171703578: goto L_0x0c0c;
                case 1460053360: goto L_0x0bd0;
                case 1730504971: goto L_0x0bda;
                case 2067056115: goto L_0x0bee;
                default: goto L_0x0b8d;
            }     // Catch:{ Throwable -> 0x102b }
        L_0x0b8d:
            goto L_0x0c15
        L_0x0b8f:
            java.lang.String r1 = "BUILD"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 0
            goto L_0x0c15
        L_0x0b99:
            java.lang.String r1 = "PLAY_SERVICES_VERSION"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 12
            goto L_0x0c15
        L_0x0ba4:
            java.lang.String r1 = "WEBVIEW_VERSION"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 11
            goto L_0x0c15
        L_0x0baf:
            java.lang.String r1 = "IS_LOW_RAM_DEVICE"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 10
            goto L_0x0c15
        L_0x0bba:
            java.lang.String r1 = "DEVICE_FEATURES"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 9
            goto L_0x0c15
        L_0x0bc5:
            java.lang.String r1 = "DISPLAY"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 8
            goto L_0x0c15
        L_0x0bd0:
            java.lang.String r1 = "is_64_bit_build"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 7
            goto L_0x0c15
        L_0x0bda:
            java.lang.String r1 = "device_cpu_abis"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 6
            goto L_0x0c15
        L_0x0be4:
            java.lang.String r1 = "ANDROID_RUNTIME"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 5
            goto L_0x0c15
        L_0x0bee:
            java.lang.String r1 = "ENVIRONMENT"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 4
            goto L_0x0c15
        L_0x0bf8:
            java.lang.String r1 = "TOTAL_MEM_SIZE"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 3
            goto L_0x0c15
        L_0x0c02:
            java.lang.String r1 = "INSTALLATION_ID"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 2
            goto L_0x0c15
        L_0x0c0c:
            java.lang.String r1 = "JAIL_BROKEN"
            boolean r1 = r7.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0c15
            r5 = 1
        L_0x0c15:
            switch(r5) {
                case 0: goto L_0x0fc3;
                case 1: goto L_0x0f53;
                case 2: goto L_0x0ee8;
                case 3: goto L_0x1016;
                case 4: goto L_0x0e89;
                case 5: goto L_0x0e5b;
                case 6: goto L_0x0e1c;
                case 7: goto L_0x0e0a;
                case 8: goto L_0x0d4f;
                case 9: goto L_0x0ccf;
                case 10: goto L_0x0cb9;
                case 11: goto L_0x0c2c;
                case 12: goto L_0x0c4d;
                default: goto L_0x0c18;
            }     // Catch:{ Throwable -> 0x102b }
        L_0x0c18:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x102b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "Missing case for "
            r5.<init>(r1)     // Catch:{ Throwable -> 0x102b }
            r5.append(r7)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = r5.toString()     // Catch:{ Throwable -> 0x102b }
            r6.<init>(r1)     // Catch:{ Throwable -> 0x102b }
            throw r6     // Catch:{ Throwable -> 0x102b }
        L_0x0c2c:
            r17 = 1
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x102b }
            r1 = 21
            if (r5 < r1) goto L_0x0ccb
            X.00V r1 = f267D     // Catch:{ Throwable -> 0x102b }
            if (r1 != 0) goto L_0x0c3f
            X.00V r1 = new X.00V     // Catch:{ Throwable -> 0x102b }
            r1.<init>(r9)     // Catch:{ Throwable -> 0x102b }
            f267D = r1     // Catch:{ Throwable -> 0x102b }
        L_0x0c3f:
            X.00V r5 = f267D     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "com.google.android.webview"
            android.content.pm.PackageInfo r1 = r5.mo26A(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0ccb
            java.lang.String r5 = r1.versionName     // Catch:{ Throwable -> 0x102b }
            goto L_0x1020
        L_0x0c4d:
            r17 = 1
            java.lang.String r1 = "com.google.android.gms.common.GoogleApiAvailability"
            java.lang.Class r10 = java.lang.Class.forName(r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.String r5 = "getInstance"
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.reflect.Method r5 = r10.getMethod(r5, r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.Object r11 = r5.invoke(r10, r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.String r12 = "isGooglePlayServicesAvailable"
            r1 = 1
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            r5 = 0
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r6[r5] = r1     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.reflect.Method r6 = r10.getMethod(r12, r6)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            r1 = 0
            r5[r1] = r9     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.Object r1 = r6.invoke(r11, r5)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            int r6 = r1.intValue()     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.String r1 = "com.google.android.gms.common.ConnectionResult"
            java.lang.Class r5 = java.lang.Class.forName(r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.String r1 = "SUCCESS"
            java.lang.reflect.Field r1 = r5.getField(r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            int r1 = r1.getInt(r5)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            if (r6 != r1) goto L_0x0cb2
            java.lang.String r1 = "GOOGLE_PLAY_SERVICES_PACKAGE"
            java.lang.reflect.Field r1 = r10.getField(r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.Object r6 = r1.get(r10)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            android.content.pm.PackageManager r5 = r9.getPackageManager()     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            r1 = 0
            android.content.pm.PackageInfo r1 = r5.getPackageInfo(r6, r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            long r5 = (long) r1     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0cb2 }
            goto L_0x0cb3
        L_0x0cb2:
            r5 = 0
        L_0x0cb3:
            r10 = 0
            if (r5 == 0) goto L_0x1020
            r10 = 1
            goto L_0x1020
        L_0x0cb9:
            r17 = 1
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x102b }
            r1 = 19
            if (r5 < r1) goto L_0x0ccb
            boolean r1 = m251I(r9)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r5 = java.lang.Boolean.toString(r1)     // Catch:{ Throwable -> 0x102b }
            goto L_0x1020
        L_0x0ccb:
            r5 = 0
            r10 = 0
            goto L_0x1020
        L_0x0ccf:
            r17 = 1
            r16 = 0
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x102b }
            r12.<init>()     // Catch:{ Throwable -> 0x102b }
            android.content.pm.PackageManager r11 = r9.getPackageManager()     // Catch:{ Throwable -> 0x0d2c }
            java.lang.Class<android.content.pm.PackageManager> r6 = android.content.pm.PackageManager.class
            java.lang.String r5 = "getSystemAvailableFeatures"
            r1 = 0
            java.lang.reflect.Method r5 = r6.getMethod(r5, r1)     // Catch:{ Throwable -> 0x0d2c }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0d2c }
            java.lang.Object r13 = r5.invoke(r11, r1)     // Catch:{ Throwable -> 0x0d2c }
            java.lang.Object[] r13 = (java.lang.Object[]) r13     // Catch:{ Throwable -> 0x0d2c }
            if (r13 == 0) goto L_0x0d49
            int r11 = r13.length     // Catch:{ Throwable -> 0x0d2c }
            r1 = 0
        L_0x0cf2:
            if (r1 >= r11) goto L_0x0d49
            r14 = r13[r1]     // Catch:{ Throwable -> 0x0d2c }
            java.lang.Class r6 = r14.getClass()     // Catch:{ Throwable -> 0x0d2c }
            java.lang.String r5 = "name"
            java.lang.reflect.Field r5 = r6.getField(r5)     // Catch:{ Throwable -> 0x0d2c }
            java.lang.Object r6 = r5.get(r14)     // Catch:{ Throwable -> 0x0d2c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x0d2c }
            if (r6 != 0) goto L_0x0d21
            java.lang.Class r15 = r14.getClass()     // Catch:{ Throwable -> 0x0d2c }
            java.lang.String r6 = "getGlEsVersion"
            r5 = 0
            java.lang.reflect.Method r6 = r15.getMethod(r6, r5)     // Catch:{ Throwable -> 0x0d2c }
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0d2c }
            java.lang.Object r6 = r6.invoke(r14, r5)     // Catch:{ Throwable -> 0x0d2c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x0d2c }
            java.lang.String r5 = "glEsVersion = "
            r12.append(r5)     // Catch:{ Throwable -> 0x0d2c }
        L_0x0d21:
            r12.append(r6)     // Catch:{ Throwable -> 0x0d2c }
            java.lang.String r5 = "\n"
            r12.append(r5)     // Catch:{ Throwable -> 0x0d2c }
            int r1 = r1 + 1
            goto L_0x0cf2
        L_0x0d2c:
            r13 = move-exception
            java.lang.String r11 = "ACRA"
            java.lang.String r6 = "Couldn't retrieve device features for %s"
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = r9.getPackageName()     // Catch:{ Throwable -> 0x102b }
            r5[r16] = r1     // Catch:{ Throwable -> 0x102b }
            p000X.C000600f.m83R(r11, r13, r6, r5)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "Could not retrieve data: "
            r12.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = r13.getMessage()     // Catch:{ Throwable -> 0x102b }
            r12.append(r1)     // Catch:{ Throwable -> 0x102b }
        L_0x0d49:
            java.lang.String r5 = r12.toString()     // Catch:{ Throwable -> 0x102b }
            goto L_0x1020
        L_0x0d4f:
            r17 = 1
            java.lang.String r1 = "window"
            java.lang.Object r1 = r9.getSystemService(r1)     // Catch:{ Throwable -> 0x102b }
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch:{ Throwable -> 0x102b }
            android.view.Display r11 = r1.getDefaultDisplay()     // Catch:{ Throwable -> 0x102b }
            if (r11 != 0) goto L_0x0d63
            java.lang.String r5 = ""
            goto L_0x1020
        L_0x0d63:
            android.util.DisplayMetrics r6 = new android.util.DisplayMetrics     // Catch:{ Throwable -> 0x102b }
            r6.<init>()     // Catch:{ Throwable -> 0x102b }
            r11.getMetrics(r6)     // Catch:{ Throwable -> 0x102b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x102b }
            r5.<init>()     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "width="
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            int r1 = r11.getWidth()     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 10
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "height="
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            int r1 = r11.getHeight()     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 10
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "pixelFormat="
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            int r1 = r11.getPixelFormat()     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 10
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "refreshRate="
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            float r1 = r11.getRefreshRate()     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "fps\nmetrics.density=x"
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            float r1 = r6.density     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 10
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "metrics.scaledDensity=x"
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            float r1 = r6.scaledDensity     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 10
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "metrics.widthPixels="
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            int r1 = r6.widthPixels     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 10
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "metrics.heightPixels="
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            int r1 = r6.heightPixels     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 10
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "metrics.xdpi="
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            float r1 = r6.xdpi     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 10
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "metrics.ydpi="
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            float r1 = r6.ydpi     // Catch:{ Throwable -> 0x102b }
            r5.append(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x102b }
            goto L_0x1020
        L_0x0e0a:
            java.lang.String r5 = "armv7"
            if (r5 == 0) goto L_0x0e1a
            java.lang.String r1 = "64"
            boolean r1 = r5.contains(r1)     // Catch:{ Throwable -> 0x102b }
        L_0x0e14:
            java.lang.String r5 = java.lang.Boolean.toString(r1)     // Catch:{ Throwable -> 0x102b }
            goto L_0x1020
        L_0x0e1a:
            r1 = 0
            goto L_0x0e14
        L_0x0e1c:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x102b }
            r1 = 21
            if (r5 < r1) goto L_0x0e4d
            java.lang.String[] r6 = m247E()     // Catch:{ Throwable -> 0x102b }
        L_0x0e26:
            java.lang.String r5 = java.util.Arrays.toString(r6)     // Catch:{ Throwable -> 0x102b }
            int r11 = r5.length()     // Catch:{ Throwable -> 0x102b }
            r1 = 2
            if (r11 < r1) goto L_0x1020
            r1 = 0
            char r6 = r5.charAt(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 91
            if (r6 != r1) goto L_0x1020
            int r1 = r11 + -1
            char r6 = r5.charAt(r1)     // Catch:{ Throwable -> 0x102b }
            r1 = 93
            if (r6 != r1) goto L_0x1020
            r6 = 1
            int r1 = r11 + -1
            java.lang.String r5 = r5.substring(r6, r1)     // Catch:{ Throwable -> 0x102b }
            goto L_0x1020
        L_0x0e4d:
            r1 = 2
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x102b }
            r5 = 0
            java.lang.String r1 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x102b }
            r6[r5] = r1     // Catch:{ Throwable -> 0x102b }
            r5 = 1
            java.lang.String r1 = android.os.Build.CPU_ABI2     // Catch:{ Throwable -> 0x102b }
            r6[r5] = r1     // Catch:{ Throwable -> 0x102b }
            goto L_0x0e26
        L_0x0e5b:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x102b }
            r1 = 19
            if (r5 >= r1) goto L_0x0e65
            java.lang.String r5 = "DALVIK"
            goto L_0x1020
        L_0x0e65:
            java.lang.String r1 = "java.boot.class.path"
            java.lang.String r5 = java.lang.System.getProperty(r1)     // Catch:{ Throwable -> 0x102b }
            if (r5 == 0) goto L_0x0e85
            java.lang.String r1 = "/system/framework/core-libart.jar"
            boolean r1 = r5.contains(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0e79
            java.lang.String r5 = "ART"
            goto L_0x1020
        L_0x0e79:
            java.lang.String r1 = "/system/framework/core.jar"
            boolean r1 = r5.contains(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0e85
            java.lang.String r5 = "DALVIK"
            goto L_0x1020
        L_0x0e85:
            java.lang.String r5 = "UNKNOWN"
            goto L_0x1020
        L_0x0e89:
            java.lang.Class<android.os.Environment> r1 = android.os.Environment.class
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x102b }
            r13.<init>()     // Catch:{ Throwable -> 0x102b }
            java.lang.reflect.Method[] r12 = r1.getMethods()     // Catch:{ Throwable -> 0x102b }
            int r11 = r12.length     // Catch:{ Throwable -> 0x102b }
            r6 = 0
        L_0x0e96:
            if (r6 >= r11) goto L_0x0ee2
            r14 = r12[r6]     // Catch:{ Throwable -> 0x102b }
            java.lang.Class[] r1 = r14.getParameterTypes()     // Catch:{ Throwable -> 0x102b }
            int r1 = r1.length     // Catch:{ Throwable -> 0x102b }
            if (r1 != 0) goto L_0x0edf
            java.lang.String r5 = r14.getName()     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "get"
            boolean r1 = r5.startsWith(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 != 0) goto L_0x0eb9
            java.lang.String r5 = r14.getName()     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "is"
            boolean r1 = r5.startsWith(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0edf
        L_0x0eb9:
            java.lang.String r5 = r14.getName()     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = "getClass"
            boolean r1 = r5.equals(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 != 0) goto L_0x0edf
            java.lang.String r1 = r14.getName()     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0edf }
            r13.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0edf }
            r1 = 61
            r13.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0edf }
            r5 = 0
            r1 = 0
            java.lang.Object r1 = r14.invoke(r5, r1)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0edf }
            r13.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0edf }
            java.lang.String r1 = "\n"
            r13.append(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0edf }
        L_0x0edf:
            int r6 = r6 + 1
            goto L_0x0e96
        L_0x0ee2:
            java.lang.String r5 = r13.toString()     // Catch:{ Throwable -> 0x102b }
            goto L_0x1020
        L_0x0ee8:
            java.lang.Class<X.02S> r12 = p000X.AnonymousClass02S.class
            monitor-enter(r12)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = p000X.AnonymousClass02S.f369B     // Catch:{ all -> 0x0f50 }
            if (r1 != 0) goto L_0x0f4b
            java.io.File r1 = r9.getFilesDir()     // Catch:{ all -> 0x0f50 }
            if (r1 != 0) goto L_0x0ef8
            java.lang.String r5 = "n/a"
            goto L_0x0f4d
        L_0x0ef8:
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0f50 }
            java.lang.String r5 = r1.getParent()     // Catch:{ all -> 0x0f50 }
            java.lang.String r1 = "ACRA-INSTALLATION"
            r6.<init>(r5, r1)     // Catch:{ all -> 0x0f50 }
            boolean r1 = r6.exists()     // Catch:{ Exception -> 0x0f48 }
            if (r1 != 0) goto L_0x0f23
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0f48 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0f48 }
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0f1e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0f1e }
            byte[] r1 = r1.getBytes()     // Catch:{ all -> 0x0f1e }
            r5.write(r1)     // Catch:{ all -> 0x0f1e }
            goto L_0x0f20
        L_0x0f1e:
            r1 = move-exception
            goto L_0x0f44
        L_0x0f20:
            r5.close()     // Catch:{ Exception -> 0x0f48 }
        L_0x0f23:
            java.io.RandomAccessFile r11 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0f48 }
            java.lang.String r1 = "r"
            r11.<init>(r6, r1)     // Catch:{ Exception -> 0x0f48 }
            long r5 = r11.length()     // Catch:{ all -> 0x0f3f }
            int r1 = (int) r5     // Catch:{ all -> 0x0f3f }
            byte[] r5 = new byte[r1]     // Catch:{ all -> 0x0f3f }
            r11.readFully(r5)     // Catch:{ all -> 0x0f3f }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0f3f }
            r1.<init>(r5)     // Catch:{ all -> 0x0f3f }
            r11.close()     // Catch:{ Exception -> 0x0f48 }
            p000X.AnonymousClass02S.f369B = r1     // Catch:{ Exception -> 0x0f48 }
            goto L_0x0f4b
        L_0x0f3f:
            r1 = move-exception
            r11.close()     // Catch:{ Exception -> 0x0f48 }
            goto L_0x0f47
        L_0x0f44:
            r5.close()     // Catch:{ Exception -> 0x0f48 }
        L_0x0f47:
            throw r1     // Catch:{ Exception -> 0x0f48 }
        L_0x0f48:
            java.lang.String r5 = "n/a"
            goto L_0x0f4d
        L_0x0f4b:
            java.lang.String r5 = p000X.AnonymousClass02S.f369B     // Catch:{ all -> 0x0f50 }
        L_0x0f4d:
            monitor-exit(r12)     // Catch:{ Throwable -> 0x102b }
            goto L_0x1020
        L_0x0f50:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ Throwable -> 0x102b }
            throw r1     // Catch:{ Throwable -> 0x102b }
        L_0x0f53:
            java.lang.String r5 = android.os.Build.TAGS     // Catch:{ Throwable -> 0x102b }
            if (r5 == 0) goto L_0x0f63
            java.lang.String r1 = "test-keys"
            boolean r1 = r5.contains(r1)     // Catch:{ Throwable -> 0x102b }
            if (r1 == 0) goto L_0x0f63
            java.lang.String r5 = "yes"
            goto L_0x1020
        L_0x0f63:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0f74 }
            java.lang.String r1 = "/system/app/Superuser.apk"
            r5.<init>(r1)     // Catch:{ Exception -> 0x0f74 }
            boolean r1 = r5.exists()     // Catch:{ Exception -> 0x0f74 }
            if (r1 == 0) goto L_0x0f7c
            java.lang.String r5 = "yes"
            goto L_0x1020
        L_0x0f74:
            r6 = move-exception
            java.lang.String r5 = "ACRA"
            java.lang.String r1 = "Failed to find Superuser.pak"
            p000X.C000600f.m74I(r5, r6, r1)     // Catch:{ Throwable -> 0x102b }
        L_0x0f7c:
            java.util.Map r5 = java.lang.System.getenv()     // Catch:{ Throwable -> 0x102b }
            if (r5 == 0) goto L_0x0fc0
            java.lang.String r1 = "PATH"
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x102b }
            java.lang.String r1 = ":"
            java.lang.String[] r13 = r5.split(r1)     // Catch:{ Throwable -> 0x102b }
            int r12 = r13.length     // Catch:{ Throwable -> 0x102b }
            r1 = 0
        L_0x0f92:
            if (r1 >= r12) goto L_0x0fc0
            r5 = r13[r1]     // Catch:{ Throwable -> 0x102b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x102b }
            r6.<init>()     // Catch:{ Throwable -> 0x102b }
            r6.append(r5)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r5 = "/su"
            r6.append(r5)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x102b }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0fb5 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0fb5 }
            boolean r5 = r5.exists()     // Catch:{ Exception -> 0x0fb5 }
            if (r5 == 0) goto L_0x0fbd
            java.lang.String r5 = "yes"
            goto L_0x1020
        L_0x0fb5:
            r11 = move-exception
            java.lang.String r6 = "ACRA"
            java.lang.String r5 = "Failed to find su binary in the PATH"
            p000X.C000600f.m74I(r6, r11, r5)     // Catch:{ Throwable -> 0x102b }
        L_0x0fbd:
            int r1 = r1 + 1
            goto L_0x0f92
        L_0x0fc0:
            java.lang.String r5 = "no"
            goto L_0x1020
        L_0x0fc3:
            java.lang.Class<android.os.Build> r1 = android.os.Build.class
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x102b }
            r12.<init>()     // Catch:{ Throwable -> 0x102b }
            java.lang.reflect.Field[] r11 = r1.getFields()     // Catch:{ Throwable -> 0x102b }
            int r6 = r11.length     // Catch:{ Throwable -> 0x102b }
            r1 = 0
        L_0x0fd0:
            if (r1 >= r6) goto L_0x1011
            r13 = r11[r1]     // Catch:{ Throwable -> 0x102b }
            java.lang.String r5 = r13.getName()     // Catch:{ Throwable -> 0x102b }
            r12.append(r5)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r5 = "="
            r12.append(r5)     // Catch:{ Throwable -> 0x102b }
            r5 = 0
            java.lang.Object r14 = r13.get(r5)     // Catch:{ Exception -> 0x1004 }
            boolean r5 = r14 instanceof java.lang.Object[]     // Catch:{ Exception -> 0x1004 }
            if (r5 == 0) goto L_0x0ffc
            java.lang.Object[] r14 = (java.lang.Object[]) r14     // Catch:{ Exception -> 0x1004 }
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ Exception -> 0x1004 }
            java.util.List r5 = java.util.Arrays.asList(r14)     // Catch:{ Exception -> 0x1004 }
            r13.<init>(r5)     // Catch:{ Exception -> 0x1004 }
            java.lang.String r5 = r13.toString()     // Catch:{ Exception -> 0x1004 }
            r12.append(r5)     // Catch:{ Exception -> 0x1004 }
            goto L_0x1009
        L_0x0ffc:
            java.lang.String r5 = r14.toString()     // Catch:{ Exception -> 0x1004 }
            r12.append(r5)     // Catch:{ Exception -> 0x1004 }
            goto L_0x1009
        L_0x1004:
            java.lang.String r5 = "N/A"
            r12.append(r5)     // Catch:{ Throwable -> 0x102b }
        L_0x1009:
            java.lang.String r5 = "\n"
            r12.append(r5)     // Catch:{ Throwable -> 0x102b }
            int r1 = r1 + 1
            goto L_0x0fd0
        L_0x1011:
            java.lang.String r5 = r12.toString()     // Catch:{ Throwable -> 0x102b }
            goto L_0x1020
        L_0x1016:
            r5 = 1
            long r5 = m249G(r5)     // Catch:{ Throwable -> 0x102b }
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ Throwable -> 0x102b }
        L_0x1020:
            java.util.Map r1 = f266C     // Catch:{ Throwable -> 0x102b }
            r1.put(r7, r5)     // Catch:{ Throwable -> 0x102b }
        L_0x1025:
            if (r10 == 0) goto L_0x1031
            p000X.AnonymousClass00G.m25G(r7, r5, r3, r2)     // Catch:{ Throwable -> 0x102b }
            goto L_0x1031
        L_0x102b:
            r1 = move-exception
            if (r17 != 0) goto L_0x1031
            m252J(r3, r7, r1)
        L_0x1031:
            int r0 = r0 + 1
            goto L_0x0b64
        L_0x1035:
            X.00m r0 = p000X.AnonymousClass00l.f119B
            java.util.Map r0 = r0.mo47PN()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x1043:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x1076
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x1043
            java.lang.Object r1 = r5.getKey()     // Catch:{ Throwable -> 0x106b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x106b }
            java.lang.Object r0 = r5.getValue()     // Catch:{ Throwable -> 0x106b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x106b }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x106b }
            goto L_0x1043
        L_0x106b:
            r1 = move-exception
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = (java.lang.String) r0
            m252J(r3, r0, r1)
            goto L_0x1043
        L_0x1076:
            java.util.Map r5 = r4.f63S
            monitor-enter(r5)
            java.util.TreeMap r1 = new java.util.TreeMap     // Catch:{ all -> 0x10e6 }
            java.util.Map r0 = r4.f63S     // Catch:{ all -> 0x10e6 }
            r1.<init>(r0)     // Catch:{ all -> 0x10e6 }
            monitor-exit(r5)     // Catch:{ all -> 0x10e6 }
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x1089:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x10c0
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x1089
            java.lang.Object r1 = r4.getKey()     // Catch:{ Throwable -> 0x10b5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x10b5 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ Throwable -> 0x10b5 }
            X.01B r0 = (p000X.AnonymousClass01B) r0     // Catch:{ Throwable -> 0x10b5 }
            java.lang.String r0 = r0.mo59aJ()     // Catch:{ Throwable -> 0x10b5 }
            p000X.AnonymousClass00G.m25G(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x10b5 }
            goto L_0x1089
        L_0x10b5:
            r1 = move-exception
            java.lang.Object r0 = r4.getKey()
            java.lang.String r0 = (java.lang.String) r0
            m252J(r3, r0, r1)
            goto L_0x1089
        L_0x10c0:
            java.util.ArrayList r0 = r3.f212B
            if (r0 == 0) goto L_0x10e5
            java.lang.String r0 = "FIELD_FAILURES"
            boolean r0 = m253K(r0, r3)
            if (r0 == 0) goto L_0x10e2
            java.lang.String r4 = "FIELD_FAILURES"
            java.lang.String r1 = "\n"
            java.util.ArrayList r0 = r3.f212B     // Catch:{ Throwable -> 0x10da }
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)     // Catch:{ Throwable -> 0x10da }
            p000X.AnonymousClass00G.m25G(r4, r0, r3, r2)     // Catch:{ Throwable -> 0x10da }
            goto L_0x10e2
        L_0x10da:
            r2 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "error attaching field failures to report: continuing"
            p000X.C000600f.m82Q(r1, r2, r0)     // Catch:{ Throwable -> 0x10e2 }
        L_0x10e2:
            r0 = 0
            r3.f212B = r0
        L_0x10e5:
            return
        L_0x10e6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x10e6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C003301j.m244B(X.00G, X.00D, java.lang.String, java.lang.Throwable, X.01R, java.io.Writer, X.01k, boolean):void");
    }

    /* renamed from: C */
    public static long m245C(long j) {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            if (VERSION.SDK_INT >= 18) {
                return m246D(statFs) / j;
            }
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / j;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: D */
    public static long m246D(StatFs statFs) {
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    /* renamed from: E */
    public static String[] m247E() {
        return Build.SUPPORTED_ABIS;
    }

    /* renamed from: F */
    public static String m248F(Context context) {
        String str = null;
        String str2 = f265B;
        if (!"!".equals(str2)) {
            return str2;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            List runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
                f265B = str;
                return str;
            }
        }
        return null;
    }

    /* renamed from: G */
    public static long m249G(long j) {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            if (VERSION.SDK_INT >= 18) {
                return m250H(statFs) / j;
            }
            return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / j;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: H */
    public static long m250H(StatFs statFs) {
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    /* renamed from: I */
    public static boolean m251I(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return activityManager != null && activityManager.isLowRamDevice();
    }

    /* renamed from: J */
    public static void m252J(AnonymousClass01R r4, String str, Throwable th) {
        try {
            if (r4.f212B == null) {
                r4.f212B = new ArrayList();
            }
            r4.f212B.add(String.format("%s: [%s]", new Object[]{str, th}));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: K */
    public static boolean m253K(String str, AnonymousClass01R r1) {
        return !r1.containsKey(str);
    }

    /* renamed from: L */
    private static String m254L(Context context) {
        try {
            return context.createPackageContext(context.getPackageName(), 0).getApplicationInfo().publicSourceDir;
        } catch (NameNotFoundException unused) {
            return "package name not found";
        }
    }
}
