package com.facebook.lite;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.lite.verifier.Verifier;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import p000X.AnonymousClass001;
import p000X.AnonymousClass003;
import p000X.AnonymousClass00A;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass00C;
import p000X.AnonymousClass00E;
import p000X.AnonymousClass00G;
import p000X.AnonymousClass00I;
import p000X.AnonymousClass00J;
import p000X.AnonymousClass00K;
import p000X.AnonymousClass00M;
import p000X.AnonymousClass00N;
import p000X.AnonymousClass00O;

public class ClientApplicationSplittedShell extends Application {

    /* renamed from: B */
    private AnonymousClass00A f406B;

    /* renamed from: B */
    public static void m335B(File file) {
        if (file.getCanonicalFile().equals(file.getAbsoluteFile())) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    StringBuilder sb = new StringBuilder("Failed to list files in: ");
                    sb.append(file.getAbsolutePath());
                    Log.e("DexStore", sb.toString());
                } else {
                    for (File file2 : listFiles) {
                        file2.getAbsolutePath();
                        m335B(file2);
                    }
                }
            }
            file.getAbsolutePath();
            if (!file.delete()) {
                StringBuilder sb2 = new StringBuilder("Failed to delete: ");
                sb2.append(file.getAbsolutePath());
                Log.e("DexStore", sb2.toString());
            }
        }
    }

    /* renamed from: C */
    public static long m336C(String str) {
        try {
            StatFs statFs = new StatFs(str);
            if (VERSION.SDK_INT >= 18) {
                return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r11v6, types: [com.facebook.xzdecoder.XzInputStream] */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        throw r4;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v7
      assigns: []
      uses: []
      mth insns count: 297
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
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02f7  */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m337D(android.content.Context r15, p000X.AnonymousClass001 r16, java.io.File r17) {
        /*
            r6 = r17
            boolean r0 = r6.mkdirs()
            if (r0 != 0) goto L_0x0022
            boolean r0 = r6.isDirectory()
            if (r0 != 0) goto L_0x0022
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "cannot mkdir: "
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L_0x0022:
            r7 = 0
            java.lang.String r0 = "metadata.txt"
            r10 = r16
            java.io.InputStream r3 = r10.mo1A(r0)
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x02f0 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x02f0 }
            java.lang.String r0 = "UTF-8"
            r1.<init>(r3, r0)     // Catch:{ all -> 0x02f0 }
            r2.<init>(r1)     // Catch:{ all -> 0x02f0 }
            r5 = r7
        L_0x0038:
            java.lang.String r8 = r2.readLine()     // Catch:{ all -> 0x02ee }
            if (r8 == 0) goto L_0x00a0
            java.lang.String r0 = "."
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x02ee }
            if (r0 == 0) goto L_0x005a
            java.lang.String r4 = "DexStore"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ee }
            java.lang.String r0 = "Ignoring dex metadata pragma: "
            r1.<init>(r0)     // Catch:{ all -> 0x02ee }
            r1.append(r8)     // Catch:{ all -> 0x02ee }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02ee }
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x02ee }
            goto L_0x0038
        L_0x005a:
            java.lang.String r0 = " "
            java.lang.String[] r4 = r8.split(r0)     // Catch:{ all -> 0x02ee }
            int r1 = r4.length     // Catch:{ all -> 0x02ee }
            r0 = 3
            if (r1 == r0) goto L_0x0078
            X.002 r4 = new X.002     // Catch:{ all -> 0x02ee }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ee }
            java.lang.String r0 = "Illegal line in manifest file: "
            r1.<init>(r0)     // Catch:{ all -> 0x02ee }
            r1.append(r8)     // Catch:{ all -> 0x02ee }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02ee }
            r4.<init>(r0)     // Catch:{ all -> 0x02ee }
        L_0x0077:
            throw r4     // Catch:{ all -> 0x02ee }
        L_0x0078:
            if (r5 == 0) goto L_0x008d
            java.lang.String r1 = r5.f1B     // Catch:{ all -> 0x02ee }
            java.lang.String r0 = ".dex"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x02ee }
            if (r0 == 0) goto L_0x0085
            goto L_0x0099
        L_0x0085:
            X.002 r4 = new X.002     // Catch:{ all -> 0x02ee }
            java.lang.String r0 = "More then one secondary dex isn't supported"
            r4.<init>(r0)     // Catch:{ all -> 0x02ee }
            goto L_0x0077
        L_0x008d:
            X.003 r5 = new X.003     // Catch:{ all -> 0x02ee }
            r0 = 0
            r1 = r4[r0]     // Catch:{ all -> 0x02ee }
            r0 = 1
            r0 = r4[r0]     // Catch:{ all -> 0x02ee }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x02ee }
            goto L_0x0038
        L_0x0099:
            m338E(r3)
            m338E(r2)
            goto L_0x00a7
        L_0x00a0:
            m338E(r3)
            m338E(r2)
            r7 = r5
        L_0x00a7:
            if (r7 != 0) goto L_0x00b1
            java.lang.String r1 = "DexStore"
            java.lang.String r0 = "No secondary dex file, trying to start anyway"
            android.util.Log.w(r1, r0)
            return
        L_0x00b1:
            java.lang.String r3 = "Dex asset name is: %s, hash is: %s"
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r0 = r7.f1B
            r2[r1] = r0
            r1 = 1
            java.lang.String r0 = r7.f2C
            r2[r1] = r0
            java.lang.String.format(r3, r2)
            java.io.File r1 = new java.io.File
            java.lang.String r0 = "dex_lock"
            r1.<init>(r6, r0)
            X.004 r4 = new X.004
            r4.<init>(r1)
            long r0 = java.lang.System.nanoTime()
            p000X.AnonymousClass005.f7D = r0
            java.lang.String r0 = m340G(r7)     // Catch:{ all -> 0x02e3 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x02e3 }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x02e3 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x02e3 }
            if (r0 != 0) goto L_0x02b1
            r14 = 0
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x02e3 }
            r0.<init>()     // Catch:{ all -> 0x02e3 }
            p000X.AnonymousClass005.f8E = r0     // Catch:{ all -> 0x02e3 }
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x02e3 }
            p000X.AnonymousClass005.f5B = r0     // Catch:{ all -> 0x02e3 }
            java.io.File r0 = r6.getCanonicalFile()     // Catch:{ all -> 0x02a9 }
            java.io.File[] r9 = r0.listFiles()     // Catch:{ all -> 0x02a9 }
            if (r9 != 0) goto L_0x0110
            java.lang.String r1 = "DexStore"
            java.lang.String r0 = "Failed to list files in dex store root"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x02a9 }
        L_0x0103:
            java.lang.String r8 = r7.f1B     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = ".xzs.tmp~"
            boolean r0 = r8.endsWith(r0)     // Catch:{ all -> 0x02a9 }
            if (r0 == 0) goto L_0x0128
            java.lang.String r8 = "secondary.dex.jar.xzs"
            goto L_0x0128
        L_0x0110:
            int r8 = r9.length     // Catch:{ all -> 0x02a9 }
            r5 = 0
        L_0x0112:
            if (r5 >= r8) goto L_0x0103
            r2 = r9[r5]     // Catch:{ all -> 0x02a9 }
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = "dex_lock"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x0125
            m335B(r2)     // Catch:{ all -> 0x02a9 }
        L_0x0125:
            int r5 = r5 + 1
            goto L_0x0112
        L_0x0128:
            java.lang.String r1 = "extract_dex"
            X.006 r0 = new X.006     // Catch:{ all -> 0x02a4 }
            r0.<init>(r1)     // Catch:{ all -> 0x02a4 }
            r14 = r0
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "tmp_dex.dex"
            r9.<init>(r6, r0)     // Catch:{ all -> 0x02a4 }
            r0 = 1
            p000X.AnonymousClass005.f9F = r0     // Catch:{ all -> 0x02a4 }
            java.io.InputStream r5 = r10.mo1A(r8)     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = ".xzs"
            boolean r0 = r8.endsWith(r0)     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = ".xz"
            boolean r0 = r8.endsWith(r0)     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x0151
            r10 = r8
            r11 = r5
            goto L_0x015a
        L_0x0151:
            com.facebook.xzdecoder.XzInputStream r11 = new com.facebook.xzdecoder.XzInputStream     // Catch:{ all -> 0x029f }
            r11.<init>(r5)     // Catch:{ all -> 0x029f }
            java.lang.String r10 = m342I(r8)     // Catch:{ all -> 0x029c }
        L_0x015a:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x029c }
            r0 = 10
            if (r1 <= r0) goto L_0x01b9
            java.lang.String r0 = ".jar"
            boolean r0 = r10.endsWith(r0)     // Catch:{ all -> 0x029c }
            if (r0 == 0) goto L_0x0196
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x029c }
            r5.<init>(r11)     // Catch:{ all -> 0x029c }
        L_0x016d:
            java.util.zip.ZipEntry r2 = r5.getNextEntry()     // Catch:{ all -> 0x029f }
            if (r2 == 0) goto L_0x0182
            r2.getName()     // Catch:{ all -> 0x029f }
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "classes.dex"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x016d
        L_0x0182:
            if (r2 != 0) goto L_0x0198
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x029f }
            java.lang.String r2 = "zip file %s did not contain a classes.dex"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x029f }
            r0 = 0
            r1[r0] = r10     // Catch:{ all -> 0x029f }
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x029f }
            r3.<init>(r0)     // Catch:{ all -> 0x029f }
            throw r3     // Catch:{ all -> 0x029f }
        L_0x0196:
            r5 = r11
            goto L_0x019c
        L_0x0198:
            java.lang.String r10 = m342I(r10)     // Catch:{ all -> 0x029f }
        L_0x019c:
            java.lang.String r0 = ".dex"
            boolean r0 = r10.endsWith(r0)     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x01d6
            X.002 r2 = new X.002     // Catch:{ all -> 0x029f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "malformed dex asset name: "
            r1.<init>(r0)     // Catch:{ all -> 0x029f }
            r1.append(r8)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029f }
            r2.<init>(r0)     // Catch:{ all -> 0x029f }
            goto L_0x029b
        L_0x01b9:
            java.lang.String r0 = ".jar"
            boolean r0 = r10.endsWith(r0)     // Catch:{ all -> 0x029c }
            if (r0 != 0) goto L_0x01d5
            X.002 r2 = new X.002     // Catch:{ all -> 0x029c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029c }
            java.lang.String r0 = "malformed jar asset name: "
            r1.<init>(r0)     // Catch:{ all -> 0x029c }
            r1.append(r8)     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029c }
            r2.<init>(r0)     // Catch:{ all -> 0x029c }
            throw r2     // Catch:{ all -> 0x029c }
        L_0x01d5:
            r5 = r11
        L_0x01d6:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x029f }
            r8.<init>(r9)     // Catch:{ all -> 0x029f }
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r13 = new byte[r0]     // Catch:{ IOException -> 0x027a }
            r12 = 2147483647(0x7fffffff, float:NaN)
            r2 = -1
            r11 = 0
        L_0x01e5:
            if (r11 >= r12) goto L_0x022e
            int r1 = r12 - r11
            r0 = 32768(0x8000, float:4.5918E-41)
            int r1 = java.lang.Math.min(r0, r1)     // Catch:{ IOException -> 0x027a }
            r0 = 0
            r10 = 0
        L_0x01f2:
            if (r10 >= r1) goto L_0x01fe
            int r0 = r1 - r10
            int r0 = r5.read(r13, r10, r0)     // Catch:{ IOException -> 0x027a }
            if (r0 < 0) goto L_0x01fe
            int r10 = r10 + r0
            goto L_0x01f2
        L_0x01fe:
            if (r0 != r2) goto L_0x0203
            if (r10 != 0) goto L_0x0203
            r10 = -1
        L_0x0203:
            if (r10 == r2) goto L_0x022e
            r0 = 0
            r8.write(r13, r0, r10)     // Catch:{ IOException -> 0x020c }
            int r10 = r10 + r11
            r11 = r10
            goto L_0x01e5
        L_0x020c:
            r3 = move-exception
            java.lang.String r2 = "DexStore"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x027a }
            java.lang.String r0 = "failed to write file (after writing "
            r1.<init>(r0)     // Catch:{ IOException -> 0x027a }
            r1.append(r11)     // Catch:{ IOException -> 0x027a }
            java.lang.String r0 = " and reading "
            r1.append(r0)     // Catch:{ IOException -> 0x027a }
            r1.append(r10)     // Catch:{ IOException -> 0x027a }
            java.lang.String r0 = " bytes)"
            r1.append(r0)     // Catch:{ IOException -> 0x027a }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x027a }
            android.util.Log.e(r2, r0)     // Catch:{ IOException -> 0x027a }
            throw r3     // Catch:{ IOException -> 0x027a }
        L_0x022e:
            m338E(r8)     // Catch:{ all -> 0x029f }
            m338E(r5)     // Catch:{ all -> 0x02a4 }
            r14.close()     // Catch:{ all -> 0x02a9 }
            boolean r0 = r9.renameTo(r3)     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x025e
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x02a9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = "rename of "
            r1.<init>(r0)     // Catch:{ all -> 0x02a9 }
            r1.append(r9)     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x02a9 }
            r1.append(r3)     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = " failed"
            r1.append(r0)     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02a9 }
            r2.<init>(r0)     // Catch:{ all -> 0x02a9 }
            throw r2     // Catch:{ all -> 0x02a9 }
        L_0x025e:
            java.lang.String r1 = "load_dex"
            X.006 r0 = new X.006     // Catch:{ all -> 0x02a4 }
            r0.<init>(r1)     // Catch:{ all -> 0x02a4 }
            r14 = r0
            java.lang.String r0 = r3.getCanonicalPath()     // Catch:{ all -> 0x02a4 }
            java.lang.String r2 = m341H(r0)     // Catch:{ all -> 0x02a4 }
            java.lang.String r1 = r3.getCanonicalPath()     // Catch:{ all -> 0x02a4 }
            r0 = 0
            dalvik.system.DexFile.loadDex(r1, r2, r0)     // Catch:{ all -> 0x02a4 }
            r14.close()     // Catch:{ all -> 0x02a9 }
            goto L_0x02ae
        L_0x027a:
            r7 = move-exception
            java.lang.String r0 = r9.getPath()     // Catch:{ all -> 0x0297 }
            long r2 = m336C(r0)     // Catch:{ all -> 0x0297 }
            java.lang.String r6 = "DexStore"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = "failed to extract secondary dex, available space: "
            r1.<init>(r0)     // Catch:{ all -> 0x0297 }
            r1.append(r2)     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0297 }
            android.util.Log.e(r6, r0)     // Catch:{ all -> 0x0297 }
            throw r7     // Catch:{ all -> 0x0297 }
        L_0x0297:
            r2 = move-exception
            m338E(r8)     // Catch:{ all -> 0x029f }
        L_0x029b:
            throw r2     // Catch:{ all -> 0x029f }
        L_0x029c:
            r0 = move-exception
            r5 = r11
            goto L_0x02a0
        L_0x029f:
            r0 = move-exception
        L_0x02a0:
            m338E(r5)     // Catch:{ all -> 0x02a4 }
            throw r0     // Catch:{ all -> 0x02a4 }
        L_0x02a4:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x02a9 }
            throw r0     // Catch:{ all -> 0x02a9 }
        L_0x02a9:
            r0 = move-exception
            p000X.AnonymousClass005.m1B()     // Catch:{ all -> 0x02e3 }
            throw r0     // Catch:{ all -> 0x02e3 }
        L_0x02ae:
            p000X.AnonymousClass005.m1B()     // Catch:{ all -> 0x02e3 }
        L_0x02b1:
            X.007 r2 = p000X.AnonymousClass007.m2B(r15)     // Catch:{ all -> 0x02e3 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x02cf }
            java.lang.String r0 = m340G(r7)     // Catch:{ IOException -> 0x02cf }
            java.lang.String r0 = m341H(r0)     // Catch:{ IOException -> 0x02cf }
            r1.<init>(r6, r0)     // Catch:{ IOException -> 0x02cf }
            r2.mo4YE(r3, r1)     // Catch:{ IOException -> 0x02cf }
            r4.close()
            long r0 = java.lang.System.nanoTime()
            p000X.AnonymousClass005.f6C = r0
            return
        L_0x02cf:
            r2 = move-exception
            java.lang.String r1 = "DexStore"
            java.lang.String r0 = "Failed to load secondary dex file"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x02e3 }
            boolean r0 = r3.delete()     // Catch:{ all -> 0x02e3 }
            if (r0 != 0) goto L_0x02e2
            java.lang.String r0 = "Failed to delete secondary dex file after trying to load"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x02e3 }
        L_0x02e2:
            throw r2     // Catch:{ all -> 0x02e3 }
        L_0x02e3:
            r2 = move-exception
            r4.close()
            long r0 = java.lang.System.nanoTime()
            p000X.AnonymousClass005.f6C = r0
            throw r2
        L_0x02ee:
            r0 = move-exception
            goto L_0x02f2
        L_0x02f0:
            r0 = move-exception
            r2 = r7
        L_0x02f2:
            m338E(r3)
            if (r2 == 0) goto L_0x02fa
            m338E(r2)
        L_0x02fa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.lite.ClientApplicationSplittedShell.m337D(android.content.Context, X.001, java.io.File):void");
    }

    /* renamed from: E */
    public static void m338E(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                Log.w("DexStore", String.format("error closing %s", new Object[]{closeable}), e);
            }
        }
    }

    /* renamed from: F */
    private void m339F() {
        if (this.f406B == null) {
            boolean z = false;
            try {
                File file = new File(getFilesDir(), "enable_lean_client_application");
                if (file.exists() && !file.isDirectory()) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            try {
                this.f406B = (AnonymousClass00A) Class.forName(z ? "com.facebook.lite.LeanClientApplication" : "com.facebook.lite.ClientApplication").getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this});
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: G */
    private static String m340G(AnonymousClass003 r2) {
        StringBuilder sb = new StringBuilder("prog-");
        sb.append(r2.f2C);
        sb.append(".dex");
        return sb.toString();
    }

    /* renamed from: H */
    private static String m341H(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m342I(str));
        sb.append(".odex");
        return sb.toString();
    }

    /* renamed from: I */
    private static String m342I(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    public final void attachBaseContext(Context context) {
        boolean z;
        super.attachBaseContext(context);
        AnonymousClass00B.f27F = Long.valueOf(System.nanoTime());
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        AnonymousClass00B.f28G = valueOf;
        AnonymousClass00E.m13D(new AnonymousClass00C(this, AnonymousClass00C.m8B("275254692598279").toString(), false, true), valueOf.longValue(), null);
        AnonymousClass00G.m26H("app", "EMA for Android");
        AnonymousClass00G.m26H("fb_app_id", "275254692598279");
        AnonymousClass00B.f25D = Long.valueOf(System.nanoTime());
        long j = getSharedPreferences(getPackageName(), 0).getLong("current_user_id", 0);
        AnonymousClass00B.f24C = Long.valueOf(System.nanoTime());
        AnonymousClass00I.f71B.f58N = j == 0 ? null : Long.toString(j);
        String str = "marauder_device_id";
        SharedPreferences sharedPreferences = getSharedPreferences(getPackageName(), 0);
        String string = sharedPreferences.getString("device_id", null);
        if (TextUtils.isEmpty(string)) {
            string = sharedPreferences.getString("primary_dex_device_id_key", null);
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString();
                sharedPreferences.edit().putString("primary_dex_device_id_key", string).apply();
            }
        }
        AnonymousClass00G.m26H(str, string);
        RuntimeException e = null;
        try {
            AnonymousClass00J.m49B(this);
        } catch (RuntimeException e2) {
            e = e2;
            Log.e("ClientApplicationSplittedShell", "FbSoLoader failed init: ", e);
        }
        if (e != null) {
            AnonymousClass00B.f26E = e.getMessage();
        }
        AnonymousClass00K.m50B();
        try {
            z = new File(context.getFilesDir(), "pref_key_disable_class_verification").exists();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            Verifier.disableRuntimeVerification(context);
            AnonymousClass00M.f76B = Boolean.valueOf(Verifier.didDisableRuntimeVerification());
        }
        if (AnonymousClass00N.f77B) {
            throw new IllegalStateException("LeanMockConnectivityProvider was already initialized");
        }
        AnonymousClass00N.f77B = true;
        if (AnonymousClass00O.f78D) {
            throw new IllegalStateException("LeanAndroidSharedPrefsProvider was already initialized");
        }
        AnonymousClass00O.f78D = true;
        AnonymousClass00O.f79E = new AnonymousClass00O(context, context.getPackageName());
        AnonymousClass00B.f23B = Long.valueOf(System.nanoTime());
        try {
            File file = new File(getApplicationInfo().dataDir, "dex");
            AnonymousClass001 r1 = new AnonymousClass001(this);
            try {
                r1.mo1A("metadata.txt").close();
                m337D(this, r1, file);
            } catch (NotFoundException | IOException unused2) {
                Log.w("SecondaryDexLoader", "No secondary dex manifest file, trying to start anyway");
            }
            m339F();
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final Object getSystemService(String str) {
        if (this.f406B != null) {
            Object systemService = this.f406B.getSystemService(str);
            if (systemService != null) {
                return systemService;
            }
        }
        return super.getSystemService(str);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f406B != null) {
            this.f406B.onConfigurationChanged(configuration);
        }
    }

    public final void onCreate() {
        super.onCreate();
        m339F();
        this.f406B.onCreate();
    }

    public final void onLowMemory() {
        super.onLowMemory();
        if (this.f406B != null) {
            this.f406B.onLowMemory();
        }
    }

    public final void onTerminate() {
        super.onTerminate();
        if (this.f406B != null) {
            this.f406B.onTerminate();
        }
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (this.f406B != null) {
            this.f406B.onTrimMemory(i);
        }
    }
}
