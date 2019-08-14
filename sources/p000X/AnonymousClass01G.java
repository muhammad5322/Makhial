package p000X;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.01G reason: invalid class name */
public final class AnonymousClass01G {

    /* renamed from: B */
    public static final Map f167B = Collections.synchronizedMap(new HashMap());

    /* renamed from: B */
    public static boolean m192B(Context context, String str) {
        return m193C(context, str, 0) == 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:73|(2:75|76)|77|78) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007f, code lost:
        p000X.AnonymousClass01A.m182B(r1, r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00c2 */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m193C(android.content.Context r10, java.lang.String r11, int r12) {
        /*
            if (r10 == 0) goto L_0x00c3
            r2 = 0
            java.util.Map r0 = f167B     // Catch:{ IOException -> 0x00c3 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ IOException -> 0x00c3 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IOException -> 0x00c3 }
            if (r0 == 0) goto L_0x0012
            int r8 = r0.intValue()     // Catch:{ IOException -> 0x00c3 }
            return r8
        L_0x0012:
            java.io.File r0 = m194D(r10, r11)     // Catch:{ IOException -> 0x00c3 }
            boolean r9 = r0.exists()     // Catch:{ IOException -> 0x00c3 }
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch:{ all -> 0x00bc }
            if (r9 == 0) goto L_0x002b
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x00bc }
            java.io.File r0 = m194D(r10, r11)     // Catch:{ all -> 0x00bc }
            r1.<init>(r0)     // Catch:{ all -> 0x00bc }
        L_0x0027:
            r7.<init>(r1)     // Catch:{ all -> 0x00bc }
            goto L_0x0030
        L_0x002b:
            java.io.FileInputStream r1 = r10.openFileInput(r11)     // Catch:{ all -> 0x00bc }
            goto L_0x0027
        L_0x0030:
            int r8 = r7.readInt()     // Catch:{ Throwable -> 0x00a9 }
            java.util.Map r1 = f167B     // Catch:{ Throwable -> 0x00a9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x00a9 }
            r1.put(r11, r0)     // Catch:{ Throwable -> 0x00a9 }
            if (r9 != 0) goto L_0x00a0
            if (r10 == 0) goto L_0x00a0
            java.io.File r3 = new java.io.File     // Catch:{ SecurityException -> 0x0092 }
            java.io.File r1 = r10.getFilesDir()     // Catch:{ SecurityException -> 0x0092 }
            java.lang.String r0 = "GkBootstrap"
            r3.<init>(r1, r0)     // Catch:{ SecurityException -> 0x0092 }
            boolean r0 = r3.exists()     // Catch:{ SecurityException -> 0x0092 }
            if (r0 != 0) goto L_0x0059
            boolean r0 = r3.mkdir()     // Catch:{ SecurityException -> 0x0092 }
            if (r0 != 0) goto L_0x0059
            goto L_0x00a0
        L_0x0059:
            java.io.File r1 = m194D(r10, r11)     // Catch:{ Throwable -> 0x00a9 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException | SecurityException -> 0x0083 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException | SecurityException -> 0x0083 }
            r0.<init>(r1)     // Catch:{ IOException | SecurityException -> 0x0083 }
            r4.<init>(r0)     // Catch:{ IOException | SecurityException -> 0x0083 }
            r4.writeInt(r8)     // Catch:{ Throwable -> 0x006e, all -> 0x0072 }
            r4.close()     // Catch:{ IOException | SecurityException -> 0x0083 }
            goto L_0x00a0
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r3 = move-exception
            goto L_0x0074
        L_0x0072:
            r3 = move-exception
            r1 = r2
        L_0x0074:
            if (r1 == 0) goto L_0x007a
            r4.close()     // Catch:{ Throwable -> 0x007e, IOException | SecurityException -> 0x0083 }
            goto L_0x0082
        L_0x007a:
            r4.close()     // Catch:{ IOException | SecurityException -> 0x0083 }
            goto L_0x0082
        L_0x007e:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r1, r0)     // Catch:{ IOException | SecurityException -> 0x0083 }
        L_0x0082:
            throw r3     // Catch:{ IOException | SecurityException -> 0x0083 }
        L_0x0083:
            r5 = move-exception
            java.lang.String r4 = "GkBootstrap"
            java.lang.String r3 = "Unable to persist GK value to %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x00a9 }
            r0 = 0
            r1[r0] = r11     // Catch:{ Throwable -> 0x00a9 }
            p000X.C000600f.m83R(r4, r5, r3, r1)     // Catch:{ Throwable -> 0x00a9 }
            goto L_0x00a0
        L_0x0092:
            r6 = move-exception
            java.lang.String r5 = "GkBootstrap"
            java.lang.String r4 = "Unable to create %s directory"
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x00a9 }
            r1 = 0
            r3[r1] = r5     // Catch:{ Throwable -> 0x00a9 }
            p000X.C000600f.m75J(r5, r6, r4, r3)     // Catch:{ Throwable -> 0x00a9 }
        L_0x00a0:
            r7.close()     // Catch:{ all -> 0x00bc }
            if (r9 != 0) goto L_0x00a8
            r10.deleteFile(r11)     // Catch:{ SecurityException -> 0x00a8 }
        L_0x00a8:
            return r8
        L_0x00a9:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            if (r2 == 0) goto L_0x00b4
            r7.close()     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x00bb
        L_0x00b2:
            r0 = move-exception
            goto L_0x00b8
        L_0x00b4:
            r7.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00bb
        L_0x00b8:
            p000X.AnonymousClass01A.m182B(r2, r0)     // Catch:{ all -> 0x00bc }
        L_0x00bb:
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            if (r9 != 0) goto L_0x00c2
            r10.deleteFile(r11)     // Catch:{ SecurityException -> 0x00c2 }
        L_0x00c2:
            throw r0     // Catch:{ IOException -> 0x00c3 }
        L_0x00c3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass01G.m193C(android.content.Context, java.lang.String, int):int");
    }

    /* renamed from: D */
    private static File m194D(Context context, String str) {
        return new File(new File(context.getFilesDir(), "GkBootstrap"), str);
    }
}
