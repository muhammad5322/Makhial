package p000X;

/* renamed from: X.028 reason: invalid class name */
public class AnonymousClass028 {
    static {
        try {
            Class cls = Class.forName("com.facebook.logcatinterceptor.LogcatInterceptor");
            cls.getMethod("getLogcatContents", new Class[0]);
            cls.getMethod("isInstalled", new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (NoSuchMethodException e) {
            C000600f.m74I("LogCatCollector", e, "Could not find method on LogcatInterceptor");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff A[RETURN] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m293B(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = 0
            java.lang.String r0 = "acraconfig_logcat_interceptor_after_crash_enabled"
            boolean r0 = p000X.AnonymousClass01G.m192B(r8, r0)
            if (r0 == 0) goto L_0x0054
            if (r9 == 0) goto L_0x0013
            java.lang.String r0 = "main"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0054
        L_0x0013:
            if (r10 == 0) goto L_0x0054
            java.io.File r1 = new java.io.File
            r1.<init>(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x003c }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x003c }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0045 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0045 }
        L_0x0029:
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0045 }
            if (r0 == 0) goto L_0x0038
            r3.append(r0)     // Catch:{ IOException -> 0x0045 }
            r0 = 10
            r3.append(r0)     // Catch:{ IOException -> 0x0045 }
            goto L_0x0029
        L_0x0038:
            r1.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x004d
        L_0x003c:
            r2 = move-exception
            java.lang.String r1 = "LogCatCollector"
            java.lang.String r0 = "Could not find LogcatInterceptor file"
            p000X.C000600f.m74I(r1, r2, r0)     // Catch:{ all -> 0x0052 }
            goto L_0x004d
        L_0x0045:
            r2 = move-exception
            java.lang.String r1 = "LogCatCollector"
            java.lang.String r0 = "Could not close LogcatInterceptor buffer reader"
            p000X.C000600f.m74I(r1, r2, r0)
        L_0x004d:
            java.lang.String r6 = r3.toString()
            goto L_0x0055
        L_0x0052:
            r0 = move-exception
            throw r0
        L_0x0054:
            r6 = r7
        L_0x0055:
            if (r6 != 0) goto L_0x00fc
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            if (r1 < r0) goto L_0x00fc
            java.lang.String r3 = "200"
            r0 = 4
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "-t"
            r2[r1] = r0
            r0 = 1
            r2[r0] = r3
            r1 = 2
            java.lang.String r0 = "-v"
            r2[r1] = r0
            r1 = 3
            java.lang.String r0 = "threadtime"
            r2[r1] = r0
            java.lang.String r5 = "\n"
            r6 = 0
            r0 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00eb }
            r3.<init>()     // Catch:{ IOException -> 0x00eb }
            java.lang.String r1 = "logcat"
            r3.add(r1)     // Catch:{ IOException -> 0x00eb }
            if (r9 == 0) goto L_0x008c
            java.lang.String r1 = "-b"
            r3.add(r1)     // Catch:{ IOException -> 0x00eb }
            r3.add(r9)     // Catch:{ IOException -> 0x00eb }
        L_0x008c:
            java.util.List r1 = java.util.Arrays.asList(r2)     // Catch:{ IOException -> 0x00eb }
            r3.addAll(r1)     // Catch:{ IOException -> 0x00eb }
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x00eb }
            int r1 = r3.size()     // Catch:{ IOException -> 0x00eb }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ IOException -> 0x00eb }
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch:{ IOException -> 0x00eb }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ IOException -> 0x00eb }
            java.lang.Process r1 = r2.exec(r1)     // Catch:{ IOException -> 0x00eb }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00eb }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00eb }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x00eb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x00eb }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00eb }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00eb }
            r1 = 200(0xc8, float:2.8E-43)
            r4.<init>(r1)     // Catch:{ IOException -> 0x00eb }
            r2 = 0
        L_0x00bd:
            java.lang.String r1 = r3.readLine()     // Catch:{ IOException -> 0x00eb }
            if (r1 == 0) goto L_0x00d1
            r4.add(r1)     // Catch:{ IOException -> 0x00eb }
            int r1 = r1.length()     // Catch:{ IOException -> 0x00eb }
            int r2 = r2 + r1
            int r1 = r5.length()     // Catch:{ IOException -> 0x00eb }
            int r2 = r2 + r1
            goto L_0x00bd
        L_0x00d1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00eb }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00eb }
        L_0x00d6:
            int r1 = r4.size()     // Catch:{ IOException -> 0x00ee }
            if (r0 >= r1) goto L_0x00f6
            java.lang.Object r1 = r4.get(r0)     // Catch:{ IOException -> 0x00ee }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x00ee }
            r3.append(r1)     // Catch:{ IOException -> 0x00ee }
            r3.append(r5)     // Catch:{ IOException -> 0x00ee }
            int r0 = r0 + 1
            goto L_0x00d6
        L_0x00eb:
            r2 = move-exception
            r3 = r6
            goto L_0x00ef
        L_0x00ee:
            r2 = move-exception
        L_0x00ef:
            java.lang.String r1 = "LogCatCollector"
            java.lang.String r0 = "LogCatCollector.collectLogcat could not retrieve data."
            p000X.C000600f.m74I(r1, r2, r0)
        L_0x00f6:
            if (r3 == 0) goto L_0x00fc
            java.lang.String r6 = r3.toString()
        L_0x00fc:
            if (r6 == 0) goto L_0x00ff
            return r6
        L_0x00ff:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass028.m293B(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }
}
