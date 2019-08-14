package p000X;

import android.os.Build.VERSION;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.00q reason: invalid class name and case insensitive filesystem */
public class C001500q {

    /* renamed from: B */
    public static final boolean f122B;

    /* renamed from: C */
    private static boolean f123C;

    /* renamed from: D */
    public static C002200x f124D;

    /* renamed from: E */
    public static C002100w[] f125E;

    /* renamed from: F */
    private static final Set f126F = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: G */
    private static final HashSet f127G = new HashSet();

    /* renamed from: H */
    private static final Map f128H = new HashMap();

    /* renamed from: I */
    public static C001600r f129I;

    /* renamed from: J */
    public static C001700s[] f130J;

    /* renamed from: K */
    public static final ReentrantReadWriteLock f131K = new ReentrantReadWriteLock();

    /* renamed from: L */
    public static int f132L;

    static {
        boolean z = false;
        try {
            if (VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f122B = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if ((r9.getApplicationInfo().flags & 129) == 0) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[Catch:{ NoSuchMethodException | SecurityException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a A[Catch:{ NoSuchMethodException | SecurityException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3 A[Catch:{ NoSuchMethodException | SecurityException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7 A[Catch:{ NoSuchMethodException | SecurityException -> 0x004b }] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m145B(android.content.Context r19) {
        /*
            r8 = 0
            android.os.StrictMode$ThreadPolicy r13 = android.os.StrictMode.allowThreadDiskWrites()
            r9 = r19
            if (r19 == 0) goto L_0x0014
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()     // Catch:{ all -> 0x01e0 }
            int r0 = r0.flags     // Catch:{ all -> 0x01e0 }
            r1 = r0 & 129(0x81, float:1.81E-43)
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            f123C = r0     // Catch:{ all -> 0x01e0 }
            r17 = 0
            r7 = 0
            java.lang.Class<X.00q> r10 = p000X.C001500q.class
            monitor-enter(r10)     // Catch:{ all -> 0x01e0 }
            java.lang.Runtime r18 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x01dd }
            r5 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01dd }
            r0 = 23
            if (r1 < r0) goto L_0x0053
            r0 = 27
            if (r1 > r0) goto L_0x0053
            java.lang.Class<java.lang.Runtime> r4 = java.lang.Runtime.class
            java.lang.String r3 = "nativeLoad"
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException | SecurityException -> 0x004b }
            r1 = 0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException | SecurityException -> 0x004b }
            r1 = 1
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException | SecurityException -> 0x004b }
            r1 = 2
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException | SecurityException -> 0x004b }
            java.lang.reflect.Method r6 = r4.getDeclaredMethod(r3, r2)     // Catch:{ NoSuchMethodException | SecurityException -> 0x004b }
            r0 = 1
            r6.setAccessible(r0)     // Catch:{ NoSuchMethodException | SecurityException -> 0x004b }
            goto L_0x0054
        L_0x004b:
            r2 = move-exception
            java.lang.String r1 = "SoLoader"
            java.lang.String r0 = "Cannot get nativeLoad method"
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x01dd }
        L_0x0053:
            r6 = r5
        L_0x0054:
            r15 = 0
            if (r6 == 0) goto L_0x0058
            r15 = 1
        L_0x0058:
            if (r15 == 0) goto L_0x00a3
            java.lang.ClassLoader r3 = r10.getClassLoader()     // Catch:{ all -> 0x01dd }
            boolean r0 = r3 instanceof dalvik.system.BaseDexClassLoader     // Catch:{ all -> 0x01dd }
            if (r0 != 0) goto L_0x0083
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01dd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "ClassLoader "
            r1.<init>(r0)     // Catch:{ all -> 0x01dd }
            java.lang.Class r0 = r3.getClass()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x01dd }
            r1.append(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = " should be of type BaseDexClassLoader"
            r1.append(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01dd }
            r2.<init>(r0)     // Catch:{ all -> 0x01dd }
        L_0x0082:
            throw r2     // Catch:{ all -> 0x01dd }
        L_0x0083:
            dalvik.system.BaseDexClassLoader r3 = (dalvik.system.BaseDexClassLoader) r3     // Catch:{ Exception -> 0x009a }
            java.lang.Class<dalvik.system.BaseDexClassLoader> r2 = dalvik.system.BaseDexClassLoader.class
            java.lang.String r1 = "getLdLibraryPath"
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x009a }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x009a }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x009a }
            java.lang.Object r5 = r1.invoke(r3, r0)     // Catch:{ Exception -> 0x009a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x009a }
            goto L_0x00a5
        L_0x009a:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "Cannot call getLdLibraryPath"
            r2.<init>(r0, r1)     // Catch:{ all -> 0x01dd }
            goto L_0x0082
        L_0x00a3:
            r5 = r17
        L_0x00a5:
            if (r5 == 0) goto L_0x00cc
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r5.split(r0)     // Catch:{ all -> 0x01dd }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01dd }
            int r0 = r4.length     // Catch:{ all -> 0x01dd }
            r3.<init>(r0)     // Catch:{ all -> 0x01dd }
            int r2 = r4.length     // Catch:{ all -> 0x01dd }
        L_0x00b4:
            if (r7 >= r2) goto L_0x00c6
            r1 = r4[r7]     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "!"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x01dd }
            if (r0 != 0) goto L_0x00c3
            r3.add(r1)     // Catch:{ all -> 0x01dd }
        L_0x00c3:
            int r7 = r7 + 1
            goto L_0x00b4
        L_0x00c6:
            java.lang.String r0 = ":"
            java.lang.String r17 = android.text.TextUtils.join(r0, r3)     // Catch:{ all -> 0x01dd }
        L_0x00cc:
            X.00r r14 = new X.00r     // Catch:{ all -> 0x01dd }
            r19 = r6
            r16 = r5
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01dd }
            f129I = r14     // Catch:{ all -> 0x01dd }
            monitor-exit(r10)     // Catch:{ all -> 0x01e0 }
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ all -> 0x01e0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch:{ all -> 0x01e0 }
            r0.lock()     // Catch:{ all -> 0x01e0 }
            X.00s[] r0 = f130J     // Catch:{ all -> 0x01d2 }
            if (r0 != 0) goto L_0x01c5
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x01d2 }
            r7.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "LD_LIBRARY_PATH"
            java.lang.String r1 = java.lang.System.getenv(r0)     // Catch:{ all -> 0x01d2 }
            if (r1 != 0) goto L_0x00f4
            java.lang.String r1 = "/vendor/lib:/system/lib"
        L_0x00f4:
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r1.split(r0)     // Catch:{ all -> 0x01d2 }
            r3 = 0
        L_0x00fb:
            int r0 = r4.length     // Catch:{ all -> 0x01d2 }
            if (r3 >= r0) goto L_0x0111
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x01d2 }
            r0 = r4[r3]     // Catch:{ all -> 0x01d2 }
            r2.<init>(r0)     // Catch:{ all -> 0x01d2 }
            X.00t r1 = new X.00t     // Catch:{ all -> 0x01d2 }
            r0 = 2
            r1.<init>(r2, r0)     // Catch:{ all -> 0x01d2 }
            r7.add(r1)     // Catch:{ all -> 0x01d2 }
            int r3 = r3 + 1
            goto L_0x00fb
        L_0x0111:
            if (r9 == 0) goto L_0x01a1
            boolean r0 = f123C     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0119
            r12 = 0
            goto L_0x0134
        L_0x0119:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01d2 }
            r0 = 17
            r1 = 0
            if (r2 > r0) goto L_0x0121
            r1 = 1
        L_0x0121:
            X.00x r0 = new X.00x     // Catch:{ all -> 0x01d2 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x01d2 }
            f124D = r0     // Catch:{ all -> 0x01d2 }
            X.00x r0 = f124D     // Catch:{ all -> 0x01d2 }
            r0.toString()     // Catch:{ all -> 0x01d2 }
            r1 = 0
            X.00x r0 = f124D     // Catch:{ all -> 0x01d2 }
            r7.add(r1, r0)     // Catch:{ all -> 0x01d2 }
            r12 = 1
        L_0x0134:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x01d2 }
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r0.sourceDir     // Catch:{ all -> 0x01d2 }
            r2.<init>(r0)     // Catch:{ all -> 0x01d2 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01d2 }
            r6.<init>()     // Catch:{ all -> 0x01d2 }
            X.00u r1 = new X.00u     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "lib-main"
            r1.<init>(r9, r2, r0, r12)     // Catch:{ all -> 0x01d2 }
            r6.add(r1)     // Catch:{ all -> 0x01d2 }
            r1.toString()     // Catch:{ all -> 0x01d2 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01d2 }
            r0 = 21
            if (r1 < r0) goto L_0x018f
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()     // Catch:{ all -> 0x01d2 }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x018f
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()     // Catch:{ all -> 0x01d2 }
            java.lang.String[] r11 = r0.splitSourceDirs     // Catch:{ all -> 0x01d2 }
            int r10 = r11.length     // Catch:{ all -> 0x01d2 }
            r5 = 0
        L_0x0167:
            if (r8 >= r10) goto L_0x018f
            r0 = r11[r8]     // Catch:{ all -> 0x01d2 }
            X.00u r4 = new X.00u     // Catch:{ all -> 0x01d2 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x01d2 }
            r3.<init>(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "lib-"
            r2.<init>(r0)     // Catch:{ all -> 0x01d2 }
            int r1 = r5 + 1
            r2.append(r5)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01d2 }
            r4.<init>(r9, r3, r0, r12)     // Catch:{ all -> 0x01d2 }
            r4.toString()     // Catch:{ all -> 0x01d2 }
            r6.add(r4)     // Catch:{ all -> 0x01d2 }
            int r8 = r8 + 1
            r5 = r1
            goto L_0x0167
        L_0x018f:
            int r0 = r6.size()     // Catch:{ all -> 0x01d2 }
            X.00w[] r0 = new p000X.C002100w[r0]     // Catch:{ all -> 0x01d2 }
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch:{ all -> 0x01d2 }
            X.00w[] r0 = (p000X.C002100w[]) r0     // Catch:{ all -> 0x01d2 }
            f125E = r0     // Catch:{ all -> 0x01d2 }
            r0 = 0
            r7.addAll(r0, r6)     // Catch:{ all -> 0x01d2 }
        L_0x01a1:
            int r0 = r7.size()     // Catch:{ all -> 0x01d2 }
            X.00s[] r0 = new p000X.C001700s[r0]     // Catch:{ all -> 0x01d2 }
            java.lang.Object[] r3 = r7.toArray(r0)     // Catch:{ all -> 0x01d2 }
            X.00s[] r3 = (p000X.C001700s[]) r3     // Catch:{ all -> 0x01d2 }
            m150G()     // Catch:{ all -> 0x01d2 }
            int r0 = r3.length     // Catch:{ all -> 0x01d2 }
        L_0x01b1:
            int r2 = r0 + -1
            if (r0 <= 0) goto L_0x01bd
            r1 = r3[r2]     // Catch:{ all -> 0x01d2 }
            r0 = 0
            r1.mo52B(r0)     // Catch:{ all -> 0x01d2 }
            r0 = r2
            goto L_0x01b1
        L_0x01bd:
            f130J = r3     // Catch:{ all -> 0x01d2 }
            int r0 = f132L     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + 1
            f132L = r0     // Catch:{ all -> 0x01d2 }
        L_0x01c5:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ all -> 0x01e0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch:{ all -> 0x01e0 }
            r0.unlock()     // Catch:{ all -> 0x01e0 }
            android.os.StrictMode.setThreadPolicy(r13)
            return
        L_0x01d2:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ all -> 0x01e0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch:{ all -> 0x01e0 }
            r0.unlock()     // Catch:{ all -> 0x01e0 }
            throw r1     // Catch:{ all -> 0x01e0 }
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01e0 }
            throw r0     // Catch:{ all -> 0x01e0 }
        L_0x01e0:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C001500q.m145B(android.content.Context):void");
    }

    /* renamed from: C */
    public static boolean m146C(String str) {
        boolean z;
        f131K.readLock().lock();
        try {
            if (f130J == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    m149F();
                } else {
                    synchronized (C001500q.class) {
                        z = false;
                        if (!f127G.contains(str)) {
                            z = true;
                        }
                        if (z) {
                            System.loadLibrary(str);
                        }
                    }
                    f131K.readLock().unlock();
                    return z;
                }
            }
            f131K.readLock().unlock();
            return m147D(System.mapLibraryName(str), str, 2, null);
        } catch (Throwable th) {
            f131K.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0179, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        f131K.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0183, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0184, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x018a, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        f131K.writeLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0195, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0198, code lost:
        if (f122B == false) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x019a, code lost:
        p000X.C002300y.m171C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x019d, code lost:
        if (r15 == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x019f, code lost:
        android.os.StrictMode.setThreadPolicy(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01a2, code lost:
        if (r6 == 0) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01a4, code lost:
        if (r6 != 3) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01a6, code lost:
        r1 = new java.lang.StringBuilder("couldn't find DSO to load: ");
        r1.append(r4);
        r1 = r1.toString();
        android.util.Log.e("SoLoader", r1);
        r3 = new java.lang.UnsatisfiedLinkError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01c0, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c3, code lost:
        if (f122B != false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01c5, code lost:
        p000X.C002300y.m171C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01c8, code lost:
        if (r15 != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01ca, code lost:
        android.os.StrictMode.setThreadPolicy(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01cd, code lost:
        if (r6 != 0) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01cf, code lost:
        if (r6 == 3) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01d2, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01d5, code lost:
        if (f122B != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01d7, code lost:
        p000X.C002300y.m171C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01da, code lost:
        if (r15 != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01dc, code lost:
        android.os.StrictMode.setThreadPolicy(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01df, code lost:
        if (r6 != 0) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01e1, code lost:
        if (r6 == 3) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        monitor-enter(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        f127G.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01ef, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x01f1, code lost:
        f126F.contains(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01f6, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x01f8, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x01f9, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r1 = new java.lang.StringBuilder("couldn't find DSO to load: ");
        r1.append(r4);
        r0 = r1.toString();
        r3 = r5.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x020e, code lost:
        if (r3 == null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0210, code lost:
        r3 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0214, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" caused by: ");
        r1.append(r3);
        r1 = r1.toString();
        android.util.Log.e("SoLoader", r1);
        r3 = new java.lang.UnsatisfiedLinkError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0233, code lost:
        r1 = new java.lang.StringBuilder("couldn't find DSO to load: ");
        r1.append(r4);
        r1 = r1.toString();
        android.util.Log.e("SoLoader", r1);
        r3 = new java.lang.UnsatisfiedLinkError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x024b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x024c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x024d, code lost:
        f131K.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0256, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0257, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        r1 = r3.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0266, code lost:
        r0 = new p000X.C002400z(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x026c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x026d, code lost:
        r0 = new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0272, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0273, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0276, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x027b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        monitor-enter(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (f127G.contains(r15) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        f131K.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0058, code lost:
        if (f130J != null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        r1 = new java.lang.StringBuilder("Could not load: ");
        r1.append(r15);
        r1.append(" because no SO source exists");
        android.util.Log.e("SoLoader", r1.toString());
        r1 = new java.lang.StringBuilder("couldn't find DSO to load: ");
        r1.append(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        throw new java.lang.UnsatisfiedLinkError(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        f131K.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008f, code lost:
        if (r18 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        r8 = android.os.StrictMode.allowThreadDiskReads();
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        if (f122B == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009d, code lost:
        r1 = new java.lang.StringBuilder("SoLoader.loadLibrary[");
        r1.append(r4);
        r1.append("]");
        p000X.C002300y.m170B(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b3, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        f131K.readLock().lock();
        r9 = f132L;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        r12 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r6 != 0) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c7, code lost:
        if (r1 >= f130J.length) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c9, code lost:
        r6 = f130J[r1].mo51A(r4, r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d1, code lost:
        if (r6 != 3) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d5, code lost:
        if (f125E == null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        r14 = f125E;
        r13 = r14.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00dc, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00df, code lost:
        if (r0 >= r13) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e1, code lost:
        r11 = r14[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e3, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r10 = p000X.C002100w.m162F(r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e8, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r11.f144C = r4;
        r11.mo52B(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ef, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f5, code lost:
        if (r11.mo51A(r4, r12, r8) != 1) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f8, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fb, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        f131K.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0108, code lost:
        if ((r17 & 2) != 2) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010a, code lost:
        if (r6 != 0) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x010c, code lost:
        f131K.writeLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0117, code lost:
        if (f124D == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0119, code lost:
        r11 = f124D;
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r13 = r11.f148D.f139C;
        r10 = r11.f146B.createPackageContext(r11.f146B.getPackageName(), 0);
        r12 = new java.io.File(r10.getApplicationInfo().nativeLibraryDir);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x013c, code lost:
        if (r13.equals(r12) != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x013e, code lost:
        r11.f147C |= 1;
        r11.f148D = new p000X.C001800t(r12, r11.f147C);
        r11.f148D.mo52B(r11.f147C);
        r11.f146B = r10;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0157, code lost:
        if (r14 == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        f132L++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0162, code lost:
        if (f132L == r9) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0164, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        f131K.writeLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0170, code lost:
        if (r1 != false) goto L_0x00b4;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m147D(java.lang.String r15, java.lang.String r16, int r17, android.os.StrictMode.ThreadPolicy r18) {
        /*
            r8 = r18
            r1 = 0
            r3 = r16
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0014
            java.util.Set r0 = f126F
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0014
            return r1
        L_0x0014:
            java.lang.Class<X.00q> r16 = p000X.C001500q.class
            monitor-enter(r16)
            java.util.HashSet r0 = f127G     // Catch:{ all -> 0x0279 }
            r4 = r15
            boolean r0 = r0.contains(r15)     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r16)     // Catch:{ all -> 0x0279 }
            return r1
        L_0x0022:
            java.util.Map r0 = f128H     // Catch:{ all -> 0x0279 }
            boolean r0 = r0.containsKey(r15)     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0032
            java.util.Map r0 = f128H     // Catch:{ all -> 0x0279 }
            java.lang.Object r2 = r0.get(r15)     // Catch:{ all -> 0x0279 }
        L_0x0030:
            monitor-exit(r16)     // Catch:{ all -> 0x0279 }
            goto L_0x003d
        L_0x0032:
            java.lang.Object r2 = new java.lang.Object     // Catch:{ all -> 0x0279 }
            r2.<init>()     // Catch:{ all -> 0x0279 }
            java.util.Map r0 = f128H     // Catch:{ all -> 0x0279 }
            r0.put(r15, r2)     // Catch:{ all -> 0x0279 }
            goto L_0x0030
        L_0x003d:
            monitor-enter(r2)
            monitor-enter(r16)     // Catch:{ all -> 0x0276 }
            java.util.HashSet r0 = f127G     // Catch:{ all -> 0x0273 }
            boolean r0 = r0.contains(r15)     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x004a
            monitor-exit(r16)     // Catch:{ all -> 0x0273 }
            monitor-exit(r2)     // Catch:{ all -> 0x0276 }
            return r1
        L_0x004a:
            monitor-exit(r16)     // Catch:{ all -> 0x0273 }
            r5 = 1
            r7 = 3
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r0.lock()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            X.00s[] r0 = f130J     // Catch:{ all -> 0x024c }
            if (r0 != 0) goto L_0x0086
            java.lang.String r3 = "SoLoader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x024c }
            java.lang.String r0 = "Could not load: "
            r1.<init>(r0)     // Catch:{ all -> 0x024c }
            r1.append(r15)     // Catch:{ all -> 0x024c }
            java.lang.String r0 = " because no SO source exists"
            r1.append(r0)     // Catch:{ all -> 0x024c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x024c }
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x024c }
            java.lang.UnsatisfiedLinkError r3 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x024c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x024c }
            java.lang.String r0 = "couldn't find DSO to load: "
            r1.<init>(r0)     // Catch:{ all -> 0x024c }
            r1.append(r15)     // Catch:{ all -> 0x024c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x024c }
            r3.<init>(r0)     // Catch:{ all -> 0x024c }
            throw r3     // Catch:{ all -> 0x024c }
        L_0x0086:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r0.unlock()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            if (r18 != 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r15 = 0
            goto L_0x0099
        L_0x0094:
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r15 = 1
        L_0x0099:
            boolean r0 = f122B     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            if (r0 == 0) goto L_0x00b3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = "SoLoader.loadLibrary["
            r1.<init>(r0)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r1.append(r4)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            p000X.C002300y.m170B(r0)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x00b3:
            r6 = 0
        L_0x00b4:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            r0.lock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            int r9 = f132L     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            r1 = 0
        L_0x00c0:
            r12 = r17
            if (r6 != 0) goto L_0x00fc
            X.00s[] r0 = f130J     // Catch:{ all -> 0x0179 }
            int r0 = r0.length     // Catch:{ all -> 0x0179 }
            if (r1 >= r0) goto L_0x00fc
            X.00s[] r0 = f130J     // Catch:{ all -> 0x0179 }
            r0 = r0[r1]     // Catch:{ all -> 0x0179 }
            int r6 = r0.mo51A(r4, r12, r8)     // Catch:{ all -> 0x0179 }
            if (r6 != r7) goto L_0x00dc
            X.00w[] r0 = f125E     // Catch:{ all -> 0x0179 }
            if (r0 == 0) goto L_0x00dc
            X.00w[] r14 = f125E     // Catch:{ all -> 0x0179 }
            int r13 = r14.length     // Catch:{ all -> 0x0179 }
            r0 = 0
            goto L_0x00df
        L_0x00dc:
            int r1 = r1 + 1
            goto L_0x00c0
        L_0x00df:
            if (r0 >= r13) goto L_0x00fc
            r11 = r14[r0]     // Catch:{ all -> 0x0179 }
            monitor-enter(r11)     // Catch:{ all -> 0x0179 }
            java.lang.Object r10 = p000X.C002100w.m162F(r11, r4)     // Catch:{ all -> 0x0176 }
            monitor-enter(r10)     // Catch:{ all -> 0x0176 }
            r11.f144C = r4     // Catch:{ all -> 0x0173 }
            r1 = 2
            r11.mo52B(r1)     // Catch:{ all -> 0x0173 }
            monitor-exit(r10)     // Catch:{ all -> 0x0173 }
            monitor-exit(r11)     // Catch:{ all -> 0x0179 }
            int r1 = r11.mo51A(r4, r12, r8)     // Catch:{ all -> 0x0179 }
            if (r1 != r5) goto L_0x00f8
            goto L_0x00fb
        L_0x00f8:
            int r0 = r0 + 1
            goto L_0x00df
        L_0x00fb:
            r6 = 1
        L_0x00fc:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            r0.unlock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            r1 = r17 & 2
            r0 = 2
            if (r1 != r0) goto L_0x016f
            if (r6 != 0) goto L_0x016f
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            r0.lock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            X.00x r0 = f124D     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x015f
            X.00x r11 = f124D     // Catch:{ all -> 0x018b }
            r14 = 0
            X.00t r0 = r11.f148D     // Catch:{ NameNotFoundException -> 0x0184 }
            java.io.File r13 = r0.f139C     // Catch:{ NameNotFoundException -> 0x0184 }
            android.content.Context r10 = r11.f146B     // Catch:{ NameNotFoundException -> 0x0184 }
            android.content.Context r0 = r11.f146B     // Catch:{ NameNotFoundException -> 0x0184 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0184 }
            r0 = 0
            android.content.Context r10 = r10.createPackageContext(r1, r0)     // Catch:{ NameNotFoundException -> 0x0184 }
            java.io.File r12 = new java.io.File     // Catch:{ NameNotFoundException -> 0x0184 }
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x0184 }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ NameNotFoundException -> 0x0184 }
            r12.<init>(r0)     // Catch:{ NameNotFoundException -> 0x0184 }
            boolean r0 = r13.equals(r12)     // Catch:{ NameNotFoundException -> 0x0184 }
            if (r0 != 0) goto L_0x0157
            int r0 = r11.f147C     // Catch:{ NameNotFoundException -> 0x0184 }
            r0 = r0 | 1
            r11.f147C = r0     // Catch:{ NameNotFoundException -> 0x0184 }
            X.00t r1 = new X.00t     // Catch:{ NameNotFoundException -> 0x0184 }
            int r0 = r11.f147C     // Catch:{ NameNotFoundException -> 0x0184 }
            r1.<init>(r12, r0)     // Catch:{ NameNotFoundException -> 0x0184 }
            r11.f148D = r1     // Catch:{ NameNotFoundException -> 0x0184 }
            X.00t r1 = r11.f148D     // Catch:{ NameNotFoundException -> 0x0184 }
            int r0 = r11.f147C     // Catch:{ NameNotFoundException -> 0x0184 }
            r1.mo52B(r0)     // Catch:{ NameNotFoundException -> 0x0184 }
            r11.f146B = r10     // Catch:{ NameNotFoundException -> 0x0184 }
            r14 = 1
        L_0x0157:
            if (r14 == 0) goto L_0x015f
            int r0 = f132L     // Catch:{ all -> 0x018b }
            int r0 = r0 + 1
            f132L = r0     // Catch:{ all -> 0x018b }
        L_0x015f:
            int r0 = f132L     // Catch:{ all -> 0x018b }
            r1 = 0
            if (r0 == r9) goto L_0x0165
            r1 = 1
        L_0x0165:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            r0.unlock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            goto L_0x0170
        L_0x016f:
            r1 = 0
        L_0x0170:
            if (r1 != 0) goto L_0x00b4
            goto L_0x0196
        L_0x0173:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0173 }
            throw r0     // Catch:{ all -> 0x0176 }
        L_0x0176:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0179 }
            throw r0     // Catch:{ all -> 0x0179 }
        L_0x0179:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            r0.unlock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            throw r1     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
        L_0x0184:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x018b }
            r0.<init>(r1)     // Catch:{ all -> 0x018b }
            throw r0     // Catch:{ all -> 0x018b }
        L_0x018b:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            r0.unlock()     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
            throw r1     // Catch:{ Throwable -> 0x01d2, all -> 0x01c0 }
        L_0x0196:
            boolean r0 = f122B     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            if (r0 == 0) goto L_0x019d
            p000X.C002300y.m171C()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x019d:
            if (r15 == 0) goto L_0x01a2
            android.os.StrictMode.setThreadPolicy(r8)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x01a2:
            if (r6 == 0) goto L_0x01a6
            if (r6 != r7) goto L_0x01e4
        L_0x01a6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = "couldn't find DSO to load: "
            r1.<init>(r0)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r1.append(r4)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = "SoLoader"
            android.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.UnsatisfiedLinkError r3 = new java.lang.UnsatisfiedLinkError     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            goto L_0x024b
        L_0x01c0:
            r3 = move-exception
            boolean r0 = f122B     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            if (r0 == 0) goto L_0x01c8
            p000X.C002300y.m171C()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x01c8:
            if (r15 == 0) goto L_0x01cd
            android.os.StrictMode.setThreadPolicy(r8)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x01cd:
            if (r6 == 0) goto L_0x0233
            if (r6 != r7) goto L_0x024b
            goto L_0x0233
        L_0x01d2:
            r5 = move-exception
            boolean r0 = f122B     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            if (r0 == 0) goto L_0x01da
            p000X.C002300y.m171C()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x01da:
            if (r15 == 0) goto L_0x01df
            android.os.StrictMode.setThreadPolicy(r8)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x01df:
            if (r6 == 0) goto L_0x01fc
            if (r6 != r7) goto L_0x01e4
            goto L_0x01fc
        L_0x01e4:
            monitor-enter(r16)     // Catch:{ all -> 0x0276 }
            java.util.HashSet r0 = f127G     // Catch:{ all -> 0x01f9 }
            r0.add(r4)     // Catch:{ all -> 0x01f9 }
            monitor-exit(r16)     // Catch:{ all -> 0x01f9 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0276 }
            if (r0 != 0) goto L_0x01f6
            java.util.Set r0 = f126F     // Catch:{ all -> 0x0276 }
            r0.contains(r3)     // Catch:{ all -> 0x0276 }
        L_0x01f6:
            monitor-exit(r2)     // Catch:{ all -> 0x0276 }
            r1 = 1
            return r1
        L_0x01f9:
            r3 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x01f9 }
            goto L_0x0275
        L_0x01fc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = "couldn't find DSO to load: "
            r1.<init>(r0)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r1.append(r4)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r3 = r5.getMessage()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            if (r3 != 0) goto L_0x0214
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x0214:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r1.<init>()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r1.append(r0)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = " caused by: "
            r1.append(r0)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r1.append(r3)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = "SoLoader"
            android.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.UnsatisfiedLinkError r3 = new java.lang.UnsatisfiedLinkError     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            goto L_0x024b
        L_0x0233:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = "couldn't find DSO to load: "
            r1.<init>(r0)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r1.append(r4)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.String r0 = "SoLoader"
            android.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.lang.UnsatisfiedLinkError r3 = new java.lang.UnsatisfiedLinkError     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x024b:
            throw r3     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x024c:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f131K     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            r0.unlock()     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
            throw r1     // Catch:{ IOException -> 0x026c, UnsatisfiedLinkError -> 0x0257 }
        L_0x0257:
            r3 = move-exception
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x0276 }
            if (r1 == 0) goto L_0x0275
            java.lang.String r0 = "unexpected e_machine:"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0275
            X.00z r0 = new X.00z     // Catch:{ all -> 0x0276 }
            r0.<init>(r3)     // Catch:{ all -> 0x0276 }
            goto L_0x0272
        L_0x026c:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0276 }
            r0.<init>(r1)     // Catch:{ all -> 0x0276 }
        L_0x0272:
            throw r0     // Catch:{ all -> 0x0276 }
        L_0x0273:
            r3 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0273 }
        L_0x0275:
            throw r3     // Catch:{ all -> 0x0276 }
        L_0x0276:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0276 }
            goto L_0x027b
        L_0x0279:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0279 }
        L_0x027b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C001500q.m147D(java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    /* renamed from: E */
    public static void m148E(C001700s r5) {
        f131K.writeLock().lock();
        try {
            m149F();
            r5.mo52B(m150G());
            C001700s[] r4 = new C001700s[(f130J.length + 1)];
            r4[0] = r5;
            System.arraycopy(f130J, 0, r4, 1, f130J.length);
            f130J = r4;
            f132L++;
        } finally {
            f131K.writeLock().unlock();
        }
    }

    /* renamed from: F */
    private static void m149F() {
        f131K.readLock().lock();
        try {
            if (f130J == null) {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            f131K.readLock().unlock();
        }
    }

    /* renamed from: G */
    private static int m150G() {
        f131K.writeLock().lock();
        f131K.writeLock().unlock();
        return 0;
    }
}
