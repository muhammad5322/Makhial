package p000X;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.00w reason: invalid class name and case insensitive filesystem */
public abstract class C002100w extends C001800t {

    /* renamed from: B */
    public final Context f143B;

    /* renamed from: C */
    public String f144C;

    /* renamed from: D */
    private final Map f145D = new HashMap();

    public C002100w(Context context, File file) {
        super(file, 1);
        this.f143B = context;
    }

    public C002100w(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        sb.append("/");
        sb.append(str);
        super(new File(sb.toString()), 1);
        this.f143B = context;
    }

    /* renamed from: F */
    public static Object m162F(C002100w r3, String str) {
        Object obj;
        synchronized (r3.f145D) {
            obj = r3.f145D.get(str);
            if (obj == null) {
                obj = new Object();
                r3.f145D.put(str, obj);
            }
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        p000X.AnonymousClass01A.m182B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m163G(java.io.File r4, byte r5) {
        /*
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r3.<init>(r4, r0)
            r2 = 0
            r0 = 0
            r3.seek(r0)     // Catch:{ Throwable -> 0x0022 }
            r3.write(r5)     // Catch:{ Throwable -> 0x0022 }
            long r0 = r3.getFilePointer()     // Catch:{ Throwable -> 0x0022 }
            r3.setLength(r0)     // Catch:{ Throwable -> 0x0022 }
            java.io.FileDescriptor r0 = r3.getFD()     // Catch:{ Throwable -> 0x0022 }
            r0.sync()     // Catch:{ Throwable -> 0x0022 }
            r3.close()
            return
        L_0x0022:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r1 = move-exception
            if (r2 == 0) goto L_0x0030
            r3.close()     // Catch:{ Throwable -> 0x002b }
            goto L_0x0033
        L_0x002b:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r2, r0)
            goto L_0x0033
        L_0x0030:
            r3.close()
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C002100w.m163G(java.io.File, byte):void");
    }

    /* renamed from: A */
    public final int mo51A(String str, int i, ThreadPolicy threadPolicy) {
        int C;
        synchronized (m162F(this, str)) {
            C = mo54C(str, i, this.f139C, threadPolicy);
        }
        return C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02df, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02e0, code lost:
        if (r7 != null) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02eb, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02ee, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02f1, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0301, code lost:
        p000X.AnonymousClass01A.m182B(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0309, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x030a, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0311, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0317, code lost:
        p000X.AnonymousClass01A.m182B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x031d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x031e, code lost:
        if (r8 != null) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0328, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0329, code lost:
        p000X.AnonymousClass01A.m182B(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x032d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x032e, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0331, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x0057, B:24:0x0062] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0309 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:37:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x030d A[SYNTHETIC, Splitter:B:199:0x030d] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0313 A[SYNTHETIC, Splitter:B:202:0x0313] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52B(int r29) {
        /*
            r28 = this;
            r11 = r28
            java.io.File r3 = r11.f139C
            boolean r0 = r3.mkdirs()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L_0x0024
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "cannot mkdir: "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L_0x0024:
            java.io.File r2 = new java.io.File
            java.io.File r1 = r11.f139C
            java.lang.String r0 = "dso_lock"
            r2.<init>(r1, r0)
            X.004 r10 = new X.004
            r10.<init>(r2)
            byte[] r23 = r11.mo55D()     // Catch:{ all -> 0x032d }
            r4 = 1
            r8 = 0
            r22 = 0
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x032d }
            java.io.File r1 = r11.f139C     // Catch:{ all -> 0x032d }
            java.lang.String r0 = "dso_state"
            r9.<init>(r1, r0)     // Catch:{ all -> 0x032d }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x032d }
            java.lang.String r0 = "rw"
            r3.<init>(r9, r0)     // Catch:{ all -> 0x032d }
            byte r2 = r3.readByte()     // Catch:{ EOFException -> 0x0061, Throwable -> 0x0052 }
            if (r2 == r4) goto L_0x0062
            r2 = 0
            goto L_0x0062
        L_0x0052:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            if (r8 == 0) goto L_0x005c
            r3.close()     // Catch:{ Throwable -> 0x0328 }
            goto L_0x032c
        L_0x005c:
            r3.close()     // Catch:{ all -> 0x032d }
            goto L_0x032c
        L_0x0061:
            r2 = 0
        L_0x0062:
            r3.close()     // Catch:{ all -> 0x032d }
            java.io.File r21 = new java.io.File     // Catch:{ all -> 0x032d }
            java.io.File r3 = r11.f139C     // Catch:{ all -> 0x032d }
            java.lang.String r1 = "dso_deps"
            r0 = r21
            r0.<init>(r3, r1)     // Catch:{ all -> 0x032d }
            java.io.RandomAccessFile r20 = new java.io.RandomAccessFile     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "rw"
            r1 = r20
            r1.<init>(r0, r3)     // Catch:{ all -> 0x032d }
            long r0 = r20.length()     // Catch:{ Throwable -> 0x031b }
            int r0 = (int) r0     // Catch:{ Throwable -> 0x031b }
            byte[] r3 = new byte[r0]     // Catch:{ Throwable -> 0x031b }
            r0 = r20
            int r1 = r0.read(r3)     // Catch:{ Throwable -> 0x031b }
            int r0 = r3.length     // Catch:{ Throwable -> 0x031b }
            if (r1 == r0) goto L_0x008a
            r2 = 0
        L_0x008a:
            r0 = r23
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ Throwable -> 0x031b }
            if (r0 != 0) goto L_0x0093
            r2 = 0
        L_0x0093:
            if (r2 == 0) goto L_0x0099
            r0 = r29 & 2
            if (r0 == 0) goto L_0x029c
        L_0x0099:
            r0 = 0
            m163G(r9, r0)     // Catch:{ Throwable -> 0x031b }
            X.02o r19 = r11.mo56E()     // Catch:{ Throwable -> 0x031b }
            X.02v r18 = r19.mo126A()     // Catch:{ Throwable -> 0x0305, all -> 0x0309 }
            X.02t r17 = r19.mo127B()     // Catch:{ Throwable -> 0x0305, all -> 0x0309 }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x02ef, all -> 0x02f3 }
            java.io.File r1 = r11.f139C     // Catch:{ Throwable -> 0x02ef, all -> 0x02f3 }
            java.lang.String r0 = "dso_manifest"
            r3.<init>(r1, r0)     // Catch:{ Throwable -> 0x02ef, all -> 0x02f3 }
            java.io.RandomAccessFile r16 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x02ef, all -> 0x02f3 }
            java.lang.String r1 = "rw"
            r0 = r16
            r0.<init>(r3, r1)     // Catch:{ Throwable -> 0x02ef, all -> 0x02f3 }
            r7 = 0
            r6 = 0
            r0 = 1
            if (r2 != r0) goto L_0x00fa
            byte r1 = r16.readByte()     // Catch:{ Exception -> 0x00fa }
            r0 = 1
            if (r1 == r0) goto L_0x00cf
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = "wrong dso manifest version"
            r1.<init>(r0)     // Catch:{ Exception -> 0x00fa }
        L_0x00ce:
            throw r1     // Catch:{ Exception -> 0x00fa }
        L_0x00cf:
            int r5 = r16.readInt()     // Catch:{ Exception -> 0x00fa }
            if (r5 >= 0) goto L_0x00dd
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = "illegal number of shared libraries"
            r1.<init>(r0)     // Catch:{ Exception -> 0x00fa }
            goto L_0x00ce
        L_0x00dd:
            X.02r[] r4 = new p000X.C006602r[r5]     // Catch:{ Exception -> 0x00fa }
            r3 = 0
        L_0x00e0:
            if (r3 >= r5) goto L_0x00f4
            X.02r r2 = new X.02r     // Catch:{ Exception -> 0x00fa }
            java.lang.String r1 = r16.readUTF()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = r16.readUTF()     // Catch:{ Exception -> 0x00fa }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x00fa }
            r4[r3] = r2     // Catch:{ Exception -> 0x00fa }
            int r3 = r3 + 1
            goto L_0x00e0
        L_0x00f4:
            X.02v r0 = new X.02v     // Catch:{ Exception -> 0x00fa }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00fa }
            r6 = r0
        L_0x00fa:
            if (r6 != 0) goto L_0x0104
            X.02v r6 = new X.02v     // Catch:{ Throwable -> 0x02dd }
            r0 = 0
            X.02r[] r0 = new p000X.C006602r[r0]     // Catch:{ Throwable -> 0x02dd }
            r6.<init>(r0)     // Catch:{ Throwable -> 0x02dd }
        L_0x0104:
            r0 = r18
            X.02r[] r5 = r0.f405B     // Catch:{ Throwable -> 0x02dd }
            java.io.File r0 = r11.f139C     // Catch:{ Throwable -> 0x02dd }
            java.lang.String[] r4 = r0.list()     // Catch:{ Throwable -> 0x02dd }
            if (r4 != 0) goto L_0x0126
            java.io.IOException r2 = new java.io.IOException     // Catch:{ Throwable -> 0x02dd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02dd }
            java.lang.String r0 = "unable to list directory "
            r1.<init>(r0)     // Catch:{ Throwable -> 0x02dd }
            java.io.File r0 = r11.f139C     // Catch:{ Throwable -> 0x02dd }
            r1.append(r0)     // Catch:{ Throwable -> 0x02dd }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x02dd }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x02dd }
        L_0x0125:
            throw r2     // Catch:{ Throwable -> 0x02dd }
        L_0x0126:
            r3 = 0
        L_0x0127:
            int r0 = r4.length     // Catch:{ Throwable -> 0x02dd }
            if (r3 >= r0) goto L_0x0170
            r2 = r4[r3]     // Catch:{ Throwable -> 0x02dd }
            java.lang.String r0 = "dso_state"
            boolean r0 = r2.equals(r0)     // Catch:{ Throwable -> 0x02dd }
            if (r0 != 0) goto L_0x016d
            java.lang.String r0 = "dso_lock"
            boolean r0 = r2.equals(r0)     // Catch:{ Throwable -> 0x02dd }
            if (r0 != 0) goto L_0x016d
            java.lang.String r0 = "dso_deps"
            boolean r0 = r2.equals(r0)     // Catch:{ Throwable -> 0x02dd }
            if (r0 != 0) goto L_0x016d
            java.lang.String r0 = "dso_manifest"
            boolean r0 = r2.equals(r0)     // Catch:{ Throwable -> 0x02dd }
            if (r0 != 0) goto L_0x016d
            r1 = 0
            r12 = 0
        L_0x014e:
            if (r12 != 0) goto L_0x0161
            int r0 = r5.length     // Catch:{ Throwable -> 0x02dd }
            if (r1 >= r0) goto L_0x0161
            r0 = r5[r1]     // Catch:{ Throwable -> 0x02dd }
            java.lang.String r0 = r0.f400C     // Catch:{ Throwable -> 0x02dd }
            boolean r0 = r0.equals(r2)     // Catch:{ Throwable -> 0x02dd }
            if (r0 == 0) goto L_0x015e
            r12 = 1
        L_0x015e:
            int r1 = r1 + 1
            goto L_0x014e
        L_0x0161:
            if (r12 != 0) goto L_0x016d
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x02dd }
            java.io.File r0 = r11.f139C     // Catch:{ Throwable -> 0x02dd }
            r1.<init>(r0, r2)     // Catch:{ Throwable -> 0x02dd }
            p000X.C001400p.m140B(r1)     // Catch:{ Throwable -> 0x02dd }
        L_0x016d:
            int r3 = r3 + 1
            goto L_0x0127
        L_0x0170:
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r15 = new byte[r0]     // Catch:{ Throwable -> 0x02dd }
        L_0x0175:
            boolean r0 = r17.mo121A()     // Catch:{ Throwable -> 0x02dd }
            if (r0 == 0) goto L_0x0291
            X.02m r5 = r17.mo122B()     // Catch:{ Throwable -> 0x02dd }
            r0 = 0
            r4 = 1
            r3 = 0
        L_0x0182:
            if (r4 == 0) goto L_0x01ad
            X.02r[] r1 = r6.f405B     // Catch:{ Throwable -> 0x027a }
            int r1 = r1.length     // Catch:{ Throwable -> 0x027a }
            if (r3 >= r1) goto L_0x01ad
            X.02r[] r1 = r6.f405B     // Catch:{ Throwable -> 0x027a }
            r1 = r1[r3]     // Catch:{ Throwable -> 0x027a }
            java.lang.String r2 = r1.f400C     // Catch:{ Throwable -> 0x027a }
            X.02r r1 = r5.f386C     // Catch:{ Throwable -> 0x027a }
            java.lang.String r1 = r1.f400C     // Catch:{ Throwable -> 0x027a }
            boolean r1 = r2.equals(r1)     // Catch:{ Throwable -> 0x027a }
            if (r1 == 0) goto L_0x01aa
            X.02r[] r1 = r6.f405B     // Catch:{ Throwable -> 0x027a }
            r1 = r1[r3]     // Catch:{ Throwable -> 0x027a }
            java.lang.String r2 = r1.f399B     // Catch:{ Throwable -> 0x027a }
            X.02r r1 = r5.f386C     // Catch:{ Throwable -> 0x027a }
            java.lang.String r1 = r1.f399B     // Catch:{ Throwable -> 0x027a }
            boolean r1 = r2.equals(r1)     // Catch:{ Throwable -> 0x027a }
            if (r1 == 0) goto L_0x01aa
            r4 = 0
        L_0x01aa:
            int r3 = r3 + 1
            goto L_0x0182
        L_0x01ad:
            if (r4 == 0) goto L_0x0273
            java.io.File r3 = r11.f139C     // Catch:{ Throwable -> 0x027a }
            r2 = 1
            r1 = 1
            boolean r1 = r3.setWritable(r2, r1)     // Catch:{ Throwable -> 0x027a }
            if (r1 != 0) goto L_0x01cf
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Throwable -> 0x027a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x027a }
            java.lang.String r1 = "cannot make directory writable for us: "
            r2.<init>(r1)     // Catch:{ Throwable -> 0x027a }
            java.io.File r1 = r11.f139C     // Catch:{ Throwable -> 0x027a }
            r2.append(r1)     // Catch:{ Throwable -> 0x027a }
            java.lang.String r1 = r2.toString()     // Catch:{ Throwable -> 0x027a }
            r4.<init>(r1)     // Catch:{ Throwable -> 0x027a }
        L_0x01ce:
            throw r4     // Catch:{ Throwable -> 0x027a }
        L_0x01cf:
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x027a }
            java.io.File r2 = r11.f139C     // Catch:{ Throwable -> 0x027a }
            X.02r r1 = r5.f386C     // Catch:{ Throwable -> 0x027a }
            java.lang.String r1 = r1.f400C     // Catch:{ Throwable -> 0x027a }
            r4.<init>(r2, r1)     // Catch:{ Throwable -> 0x027a }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x01e2 }
            java.lang.String r1 = "rw"
            r3.<init>(r4, r1)     // Catch:{ IOException -> 0x01e2 }
            goto L_0x0205
        L_0x01e2:
            r3 = move-exception
            java.lang.String r2 = "fb-UnpackingSoSource"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x027a }
            java.lang.String r1 = "error overwriting "
            r12.<init>(r1)     // Catch:{ Throwable -> 0x027a }
            r12.append(r4)     // Catch:{ Throwable -> 0x027a }
            java.lang.String r1 = " trying to delete and start over"
            r12.append(r1)     // Catch:{ Throwable -> 0x027a }
            java.lang.String r1 = r12.toString()     // Catch:{ Throwable -> 0x027a }
            android.util.Log.w(r2, r1, r3)     // Catch:{ Throwable -> 0x027a }
            p000X.C001400p.m140B(r4)     // Catch:{ Throwable -> 0x027a }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x027a }
            java.lang.String r1 = "rw"
            r3.<init>(r4, r1)     // Catch:{ Throwable -> 0x027a }
        L_0x0205:
            java.io.InputStream r1 = r5.f385B     // Catch:{ IOException -> 0x0265 }
            int r2 = r1.available()     // Catch:{ IOException -> 0x0265 }
            r1 = 1
            if (r2 <= r1) goto L_0x021c
            java.io.FileDescriptor r14 = r3.getFD()     // Catch:{ IOException -> 0x0265 }
            long r1 = (long) r2     // Catch:{ IOException -> 0x0265 }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0265 }
            r12 = 21
            if (r13 < r12) goto L_0x021c
            com.facebook.soloader.SysUtil$LollipopSysdeps.fallocateIfSupported(r14, r1)     // Catch:{ IOException -> 0x0265 }
        L_0x021c:
            java.io.InputStream r1 = r5.f385B     // Catch:{ IOException -> 0x0265 }
            r24 = r1
            r14 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r12 = 0
        L_0x0225:
            if (r12 >= r14) goto L_0x0242
            r2 = 32768(0x8000, float:4.5918E-41)
            int r1 = r14 - r12
            int r1 = java.lang.Math.min(r2, r1)     // Catch:{ IOException -> 0x0265 }
            r25 = r15
            r26 = r13
            r27 = r1
            int r2 = r24.read(r25, r26, r27)     // Catch:{ IOException -> 0x0265 }
            r1 = -1
            if (r2 == r1) goto L_0x0242
            r3.write(r15, r13, r2)     // Catch:{ IOException -> 0x0265 }
            int r12 = r12 + r2
            goto L_0x0225
        L_0x0242:
            long r1 = r3.getFilePointer()     // Catch:{ IOException -> 0x0265 }
            r3.setLength(r1)     // Catch:{ IOException -> 0x0265 }
            r2 = 1
            r1 = 0
            boolean r1 = r4.setExecutable(r2, r1)     // Catch:{ IOException -> 0x0265 }
            if (r1 != 0) goto L_0x0270
            java.io.IOException r6 = new java.io.IOException     // Catch:{ IOException -> 0x0265 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0265 }
            java.lang.String r1 = "cannot make file executable: "
            r2.<init>(r1)     // Catch:{ IOException -> 0x0265 }
            r2.append(r4)     // Catch:{ IOException -> 0x0265 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x0265 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0265 }
            throw r6     // Catch:{ IOException -> 0x0265 }
        L_0x0265:
            r1 = move-exception
            p000X.C001400p.m140B(r4)     // Catch:{ all -> 0x026a }
            throw r1     // Catch:{ all -> 0x026a }
        L_0x026a:
            r4 = move-exception
            r3.close()     // Catch:{ Throwable -> 0x027a }
            goto L_0x01ce
        L_0x0270:
            r3.close()     // Catch:{ Throwable -> 0x027a }
        L_0x0273:
            if (r5 == 0) goto L_0x0175
            r5.close()     // Catch:{ Throwable -> 0x02dd }
            goto L_0x0175
        L_0x027a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x027c }
        L_0x027c:
            r2 = move-exception
            if (r5 == 0) goto L_0x0125
            if (r0 == 0) goto L_0x028c
            r5.close()     // Catch:{ Throwable -> 0x0286 }
            goto L_0x0125
        L_0x0286:
            r1 = move-exception
            p000X.AnonymousClass01A.m182B(r0, r1)     // Catch:{ Throwable -> 0x02dd }
            goto L_0x0125
        L_0x028c:
            r5.close()     // Catch:{ Throwable -> 0x02dd }
            goto L_0x0125
        L_0x0291:
            r16.close()     // Catch:{ Throwable -> 0x02ef, all -> 0x02f3 }
            r17.close()     // Catch:{ Throwable -> 0x0305, all -> 0x0309 }
            r19.close()     // Catch:{ Throwable -> 0x031b }
            r8 = r18
        L_0x029c:
            r20.close()     // Catch:{ all -> 0x032d }
            if (r8 == 0) goto L_0x02d4
            X.02n r3 = new X.02n     // Catch:{ all -> 0x032d }
            r4 = r11
            r5 = r21
            r6 = r23
            r7 = r8
            r8 = r9
            r9 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x032d }
            r0 = r29 & 1
            if (r0 == 0) goto L_0x02cf
            java.lang.Thread r2 = new java.lang.Thread     // Catch:{ all -> 0x032d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x032d }
            java.lang.String r0 = "SoSync:"
            r1.<init>(r0)     // Catch:{ all -> 0x032d }
            java.io.File r0 = r11.f139C     // Catch:{ all -> 0x032d }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x032d }
            r1.append(r0)     // Catch:{ all -> 0x032d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x032d }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x032d }
            r2.start()     // Catch:{ all -> 0x032d }
            goto L_0x02d2
        L_0x02cf:
            r3.run()     // Catch:{ all -> 0x032d }
        L_0x02d2:
            r22 = 1
        L_0x02d4:
            if (r22 == 0) goto L_0x02d7
            r10 = 0
        L_0x02d7:
            if (r10 == 0) goto L_0x02dc
            r10.close()
        L_0x02dc:
            return
        L_0x02dd:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x02df }
        L_0x02df:
            r1 = move-exception
            if (r7 == 0) goto L_0x02eb
            r16.close()     // Catch:{ Throwable -> 0x02e6 }
            goto L_0x02ee
        L_0x02e6:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r7, r0)     // Catch:{ Throwable -> 0x02ef, all -> 0x02f3 }
            goto L_0x02ee
        L_0x02eb:
            r16.close()     // Catch:{ Throwable -> 0x02ef, all -> 0x02f3 }
        L_0x02ee:
            throw r1     // Catch:{ Throwable -> 0x02ef, all -> 0x02f3 }
        L_0x02ef:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02f1 }
        L_0x02f1:
            r2 = move-exception
            goto L_0x02f5
        L_0x02f3:
            r2 = move-exception
            r1 = r8
        L_0x02f5:
            if (r1 == 0) goto L_0x02fd
            r17.close()     // Catch:{ Throwable -> 0x02fb, all -> 0x0309 }
            goto L_0x0304
        L_0x02fb:
            r0 = move-exception
            goto L_0x0301
        L_0x02fd:
            r17.close()     // Catch:{ Throwable -> 0x0305, all -> 0x0309 }
            goto L_0x0304
        L_0x0301:
            p000X.AnonymousClass01A.m182B(r1, r0)     // Catch:{ Throwable -> 0x0305, all -> 0x0309 }
        L_0x0304:
            throw r2     // Catch:{ Throwable -> 0x0305, all -> 0x0309 }
        L_0x0305:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0307 }
        L_0x0307:
            r1 = move-exception
            goto L_0x030b
        L_0x0309:
            r1 = move-exception
            r2 = r8
        L_0x030b:
            if (r2 == 0) goto L_0x0313
            r19.close()     // Catch:{ Throwable -> 0x0311 }
            goto L_0x031a
        L_0x0311:
            r0 = move-exception
            goto L_0x0317
        L_0x0313:
            r19.close()     // Catch:{ Throwable -> 0x031b }
            goto L_0x031a
        L_0x0317:
            p000X.AnonymousClass01A.m182B(r2, r0)     // Catch:{ Throwable -> 0x031b }
        L_0x031a:
            throw r1     // Catch:{ Throwable -> 0x031b }
        L_0x031b:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x031d }
        L_0x031d:
            r1 = move-exception
            if (r8 == 0) goto L_0x0324
            r20.close()     // Catch:{ Throwable -> 0x0328 }
            goto L_0x032c
        L_0x0324:
            r20.close()     // Catch:{ all -> 0x032d }
            goto L_0x032c
        L_0x0328:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r8, r0)     // Catch:{ all -> 0x032d }
        L_0x032c:
            throw r1     // Catch:{ all -> 0x032d }
        L_0x032d:
            r0 = move-exception
            r10.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C002100w.mo52B(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r2 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        p000X.AnonymousClass01A.m182B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        throw r1;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo55D() {
        /*
            r6 = this;
            android.os.Parcel r5 = android.os.Parcel.obtain()
            X.02o r4 = r6.mo56E()
            r2 = 0
            X.02v r0 = r4.mo126A()     // Catch:{ Throwable -> 0x0037 }
            X.02r[] r3 = r0.f405B     // Catch:{ Throwable -> 0x0037 }
            r0 = 1
            r5.writeByte(r0)     // Catch:{ Throwable -> 0x0037 }
            int r0 = r3.length     // Catch:{ Throwable -> 0x0037 }
            r5.writeInt(r0)     // Catch:{ Throwable -> 0x0037 }
            r1 = 0
        L_0x0018:
            int r0 = r3.length     // Catch:{ Throwable -> 0x0037 }
            if (r1 >= r0) goto L_0x002c
            r0 = r3[r1]     // Catch:{ Throwable -> 0x0037 }
            java.lang.String r0 = r0.f400C     // Catch:{ Throwable -> 0x0037 }
            r5.writeString(r0)     // Catch:{ Throwable -> 0x0037 }
            r0 = r3[r1]     // Catch:{ Throwable -> 0x0037 }
            java.lang.String r0 = r0.f399B     // Catch:{ Throwable -> 0x0037 }
            r5.writeString(r0)     // Catch:{ Throwable -> 0x0037 }
            int r1 = r1 + 1
            goto L_0x0018
        L_0x002c:
            r4.close()
            byte[] r0 = r5.marshall()
            r5.recycle()
            return r0
        L_0x0037:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r1 = move-exception
            if (r2 == 0) goto L_0x0040
            r4.close()     // Catch:{ Throwable -> 0x0044 }
            goto L_0x0048
        L_0x0040:
            r4.close()
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r2, r0)
        L_0x0048:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C002100w.mo55D():byte[]");
    }

    /* renamed from: E */
    public abstract C006302o mo56E();
}
