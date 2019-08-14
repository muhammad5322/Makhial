package p000X;

/* renamed from: X.00S reason: invalid class name */
public class AnonymousClass00S implements AnonymousClass00R {
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0255, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0256, code lost:
        if (r16 != null) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0263, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0266, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ee, code lost:
        if (r6 != java.lang.Integer.parseInt(r2.group(1))) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f0, code lost:
        r0 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0163, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0164, code lost:
        if (r0 != null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0173, code lost:
        throw r2;
     */
    /* renamed from: BP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23BP(p000X.AnonymousClass00G r27, p000X.C003401k r28, java.lang.String r29, boolean r30) {
        /*
            r26 = this;
            r14 = r27
            X.01C r0 = r14.f46B
            if (r0 == 0) goto L_0x000d
            boolean r1 = r0.mo62C()
            r0 = 1
            if (r1 != 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 != 0) goto L_0x001f
            android.content.Context r2 = r14.f57M
            java.lang.String r1 = "traces"
            r0 = 0
            java.io.File r1 = r2.getDir(r1, r0)
            r0 = 0
            p000X.AnonymousClass00G.m24F(r1, r0)
            r0 = 1
            return r0
        L_0x001f:
            r0 = r28
            java.io.File r0 = r0.f269C
            r25 = r0
            java.lang.String r24 = r25.getName()
            java.lang.String r0 = r25.getCanonicalPath()     // Catch:{ IOException -> 0x0286 }
            java.io.File r13 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".upd"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ RuntimeException -> 0x0276, IOException -> 0x0267, 02K -> 0x028c }
            r0 = r25
            r12.<init>(r0)     // Catch:{ RuntimeException -> 0x0276, IOException -> 0x0267, 02K -> 0x028c }
            r16 = 0
            X.01R r11 = new X.01R     // Catch:{ Throwable -> 0x0253 }
            r11.<init>()     // Catch:{ Throwable -> 0x0253 }
            r11.mo76B(r12)     // Catch:{ Throwable -> 0x0253 }
            X.01R r10 = new X.01R     // Catch:{ Throwable -> 0x0253 }
            r10.<init>()     // Catch:{ Throwable -> 0x0253 }
            boolean r0 = r13.exists()     // Catch:{ Throwable -> 0x0253 }
            if (r0 == 0) goto L_0x0067
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0253 }
            r0.<init>(r13)     // Catch:{ Throwable -> 0x0253 }
            r10.mo76B(r0)     // Catch:{ Throwable -> 0x0253 }
        L_0x0067:
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Throwable -> 0x0253 }
            r9.<init>()     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = "should_upload_system_anr_traces_gk_cached"
            boolean r0 = p000X.AnonymousClass00E.m11B(r0)     // Catch:{ Throwable -> 0x0253 }
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = "anr_with_sigquit_traces"
            java.lang.Object r1 = r11.get(r0)     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0253 }
            if (r1 == 0) goto L_0x0086
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)     // Catch:{ Throwable -> 0x0253 }
            if (r0 == 0) goto L_0x01ae
        L_0x0086:
            java.lang.String r0 = "SIGQUIT"
            java.lang.Object r0 = r10.get(r0)     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0253 }
            if (r0 != 0) goto L_0x01ae
            java.lang.String r0 = "PROCESS_NAME"
            java.lang.String r23 = r11.mo75A(r0)     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = "TIME_OF_CRASH"
            java.lang.String r0 = r11.mo75A(r0)     // Catch:{ Throwable -> 0x0253 }
            long r21 = java.lang.Long.parseLong(r0)     // Catch:{ Throwable -> 0x0253 }
            if (r23 == 0) goto L_0x018e
            java.io.BufferedReader r20 = new java.io.BufferedReader     // Catch:{ ParseException -> 0x0186, IOException -> 0x017d, NumberFormatException -> 0x0174 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ ParseException -> 0x0186, IOException -> 0x017d, NumberFormatException -> 0x0174 }
            java.lang.String r0 = "/data/anr/traces.txt"
            r1.<init>(r0)     // Catch:{ ParseException -> 0x0186, IOException -> 0x017d, NumberFormatException -> 0x0174 }
            r0 = r20
            r0.<init>(r1)     // Catch:{ ParseException -> 0x0186, IOException -> 0x017d, NumberFormatException -> 0x0174 }
            r0 = 0
            java.lang.String r1 = "----- pid (\\d+) at (\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}).* -----"
            java.util.regex.Pattern r15 = java.util.regex.Pattern.compile(r1)     // Catch:{ Throwable -> 0x0161 }
            java.lang.String r1 = "----- end (\\d+) -----"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r1)     // Catch:{ Throwable -> 0x0161 }
            java.lang.String r1 = "Cmd line: (.*)"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r1)     // Catch:{ Throwable -> 0x0161 }
            r6 = -1
            r19 = 0
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0161 }
            r5.<init>()     // Catch:{ Throwable -> 0x0161 }
        L_0x00cb:
            java.lang.String r4 = r20.readLine()     // Catch:{ Throwable -> 0x0161 }
            if (r4 == 0) goto L_0x015d
            if (r19 == 0) goto L_0x00f5
            r5.append(r4)     // Catch:{ Throwable -> 0x0161 }
            java.lang.String r1 = "\n"
            r5.append(r1)     // Catch:{ Throwable -> 0x0161 }
            java.util.regex.Matcher r2 = r8.matcher(r4)     // Catch:{ Throwable -> 0x0161 }
            boolean r1 = r2.find()     // Catch:{ Throwable -> 0x0161 }
            if (r1 == 0) goto L_0x00cb
            r1 = 1
            java.lang.String r1 = r2.group(r1)     // Catch:{ Throwable -> 0x0161 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Throwable -> 0x0161 }
            if (r6 != r1) goto L_0x015d
            java.lang.String r0 = r5.toString()     // Catch:{ Throwable -> 0x0161 }
            goto L_0x0159
        L_0x00f5:
            java.util.regex.Matcher r2 = r15.matcher(r4)     // Catch:{ Throwable -> 0x0161 }
            boolean r1 = r2.find()     // Catch:{ Throwable -> 0x0161 }
            if (r1 == 0) goto L_0x00cb
            r1 = 0
            r5.setLength(r1)     // Catch:{ Throwable -> 0x0161 }
            r1 = 1
            java.lang.String r1 = r2.group(r1)     // Catch:{ Throwable -> 0x0161 }
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ Throwable -> 0x0161 }
            r1 = 2
            java.lang.String r3 = r2.group(r1)     // Catch:{ Throwable -> 0x0161 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Throwable -> 0x0161 }
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0161 }
            java.util.Date r1 = r2.parse(r3)     // Catch:{ Throwable -> 0x0161 }
            long r17 = r1.getTime()     // Catch:{ Throwable -> 0x0161 }
            java.lang.String r3 = r20.readLine()     // Catch:{ Throwable -> 0x0161 }
            java.util.regex.Matcher r2 = r7.matcher(r3)     // Catch:{ Throwable -> 0x0161 }
            boolean r1 = r2.find()     // Catch:{ Throwable -> 0x0161 }
            if (r1 == 0) goto L_0x00cb
            r1 = 1
            java.lang.String r1 = r2.group(r1)     // Catch:{ Throwable -> 0x0161 }
            r2 = r23
            boolean r1 = r1.equals(r2)     // Catch:{ Throwable -> 0x0161 }
            if (r1 == 0) goto L_0x00cb
            long r1 = r21 - r17
            long r17 = java.lang.Math.abs(r1)     // Catch:{ Throwable -> 0x0161 }
            r1 = 15000(0x3a98, double:7.411E-320)
            int r1 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00cb
            r5.append(r4)     // Catch:{ Throwable -> 0x0161 }
            java.lang.String r1 = "\n"
            r5.append(r1)     // Catch:{ Throwable -> 0x0161 }
            r5.append(r3)     // Catch:{ Throwable -> 0x0161 }
            r5.append(r1)     // Catch:{ Throwable -> 0x0161 }
            r19 = 1
            goto L_0x00cb
        L_0x0159:
            r20.close()     // Catch:{ ParseException -> 0x0186, IOException -> 0x017d, NumberFormatException -> 0x0174 }
            goto L_0x018f
        L_0x015d:
            r20.close()     // Catch:{ ParseException -> 0x0186, IOException -> 0x017d, NumberFormatException -> 0x0174 }
            goto L_0x018e
        L_0x0161:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r2 = move-exception
            if (r0 == 0) goto L_0x016c
            r20.close()     // Catch:{ Throwable -> 0x016a }
            goto L_0x0173
        L_0x016a:
            r1 = move-exception
            goto L_0x0170
        L_0x016c:
            r20.close()     // Catch:{ ParseException -> 0x0186, IOException -> 0x017d, NumberFormatException -> 0x0174 }
            goto L_0x0173
        L_0x0170:
            p000X.AnonymousClass01A.m182B(r0, r1)     // Catch:{ ParseException -> 0x0186, IOException -> 0x017d, NumberFormatException -> 0x0174 }
        L_0x0173:
            throw r2     // Catch:{ ParseException -> 0x0186, IOException -> 0x017d, NumberFormatException -> 0x0174 }
        L_0x0174:
            r2 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "Failed to extract pid from ANR traces."
            p000X.C000600f.m74I(r1, r2, r0)     // Catch:{ Throwable -> 0x0253 }
            goto L_0x018e
        L_0x017d:
            r2 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "Failed to read ANR traces."
            p000X.C000600f.m74I(r1, r2, r0)     // Catch:{ Throwable -> 0x0253 }
            goto L_0x018e
        L_0x0186:
            r2 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "Failed to parse ANR timestamp."
            p000X.C000600f.m74I(r1, r2, r0)     // Catch:{ Throwable -> 0x0253 }
        L_0x018e:
            r0 = 0
        L_0x018f:
            if (r0 == 0) goto L_0x0192
            goto L_0x019a
        L_0x0192:
            java.lang.String r1 = "anr_system_traces_present"
            java.lang.String r0 = "false"
            r9.put(r1, r0)     // Catch:{ Throwable -> 0x0253 }
            goto L_0x01ae
        L_0x019a:
            java.lang.String r1 = "SIGQUIT"
            byte[] r0 = r0.getBytes()     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = p000X.AnonymousClass02M.m305B(r0)     // Catch:{ Throwable -> 0x0253 }
            r9.put(r1, r0)     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r1 = "anr_system_traces_present"
            java.lang.String r0 = "true"
            r9.put(r1, r0)     // Catch:{ Throwable -> 0x0253 }
        L_0x01ae:
            java.lang.String r0 = "UPLOADED_BY_PROCESS"
            r1 = r29
            r9.put(r0, r1)     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = "anr_recovery_delay"
            java.lang.Object r0 = r10.get(r0)     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0253 }
            if (r0 != 0) goto L_0x01cc
            java.lang.String r1 = "anr_recovery_delay"
            X.00m r0 = p000X.AnonymousClass00l.f119B     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r1 = r0.mo48ZJ(r1)     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = "anr_recovery_delay"
            r9.put(r0, r1)     // Catch:{ Throwable -> 0x0253 }
        L_0x01cc:
            java.lang.String r0 = "anr_system_error_msg"
            java.lang.Object r0 = r10.get(r0)     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0253 }
            if (r0 != 0) goto L_0x01e5
            java.lang.String r1 = "anr_system_error_msg"
            X.00m r0 = p000X.AnonymousClass00l.f119B     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r1 = r0.mo48ZJ(r1)     // Catch:{ Throwable -> 0x0253 }
            if (r1 == 0) goto L_0x01e5
            java.lang.String r0 = "anr_system_error_msg"
            r9.put(r0, r1)     // Catch:{ Throwable -> 0x0253 }
        L_0x01e5:
            java.lang.String r0 = "anr_system_tag"
            java.lang.Object r0 = r10.get(r0)     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0253 }
            if (r0 != 0) goto L_0x01fe
            java.lang.String r1 = "anr_system_tag"
            X.00m r0 = p000X.AnonymousClass00l.f119B     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r1 = r0.mo48ZJ(r1)     // Catch:{ Throwable -> 0x0253 }
            if (r1 == 0) goto L_0x01fe
            java.lang.String r0 = "anr_system_tag"
            r9.put(r0, r1)     // Catch:{ Throwable -> 0x0253 }
        L_0x01fe:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0253 }
            r0 = 1
            r4.<init>(r13, r0)     // Catch:{ Throwable -> 0x0253 }
            java.io.Writer r3 = p000X.AnonymousClass01R.m215B(r4)     // Catch:{ Throwable -> 0x0253 }
            r10.putAll(r9)     // Catch:{ Throwable -> 0x0253 }
            if (r3 == 0) goto L_0x0234
            java.util.Set r0 = r9.entrySet()     // Catch:{ Throwable -> 0x0253 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Throwable -> 0x0253 }
        L_0x0215:
            boolean r0 = r2.hasNext()     // Catch:{ Throwable -> 0x0253 }
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r2.next()     // Catch:{ Throwable -> 0x0253 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Throwable -> 0x0253 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0253 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Throwable -> 0x0253 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0253 }
            p000X.AnonymousClass01R.m216C(r3, r1, r0)     // Catch:{ Throwable -> 0x0253 }
            goto L_0x0215
        L_0x0231:
            r3.flush()     // Catch:{ Throwable -> 0x0253 }
        L_0x0234:
            r4.close()     // Catch:{ Throwable -> 0x0253 }
            r1 = 1
            r0 = 0
            r11.mo77C(r10, r1, r0)     // Catch:{ Throwable -> 0x0253 }
            if (r30 == 0) goto L_0x0245
            java.lang.String r1 = "SENT_IMMEDIATELY"
            java.lang.String r0 = "true"
            r11.put(r1, r0)     // Catch:{ Throwable -> 0x0253 }
        L_0x0245:
            p000X.AnonymousClass00G.m29K(r14, r11)     // Catch:{ Throwable -> 0x0253 }
            p000X.AnonymousClass00G.m20B(r25)     // Catch:{ Throwable -> 0x0253 }
            p000X.AnonymousClass00G.m20B(r13)     // Catch:{ Throwable -> 0x0253 }
            r12.close()     // Catch:{ RuntimeException -> 0x0276, IOException -> 0x0267, 02K -> 0x028c }
            r0 = 1
            return r0
        L_0x0253:
            r16 = move-exception
            throw r16     // Catch:{ all -> 0x0255 }
        L_0x0255:
            r2 = move-exception
            if (r16 == 0) goto L_0x0263
            r12.close()     // Catch:{ Throwable -> 0x025c }
            goto L_0x0266
        L_0x025c:
            r1 = move-exception
            r0 = r16
            p000X.AnonymousClass01A.m182B(r0, r1)     // Catch:{ RuntimeException -> 0x0276, IOException -> 0x0267, 02K -> 0x028c }
            goto L_0x0266
        L_0x0263:
            r12.close()     // Catch:{ RuntimeException -> 0x0276, IOException -> 0x0267, 02K -> 0x028c }
        L_0x0266:
            throw r2     // Catch:{ RuntimeException -> 0x0276, IOException -> 0x0267, 02K -> 0x028c }
        L_0x0267:
            r4 = move-exception
            java.lang.String r3 = "ACRA"
            java.lang.String r2 = "Failed to load crash report for %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r24
            p000X.C000600f.m75J(r3, r4, r2, r1)
            goto L_0x027e
        L_0x0276:
            r2 = move-exception
            java.lang.String r1 = "ACRA"
            java.lang.String r0 = "Failed to send crash reports"
            p000X.C000600f.m74I(r1, r2, r0)
        L_0x027e:
            p000X.AnonymousClass00G.m20B(r25)
            p000X.AnonymousClass00G.m20B(r13)
            r0 = 0
            return r0
        L_0x0286:
            r4 = move-exception
            java.lang.String r3 = "ACRA"
            java.lang.String r2 = "Failed to get full path of crash report for %s"
            goto L_0x0291
        L_0x028c:
            r4 = move-exception
            java.lang.String r3 = "ACRA"
            java.lang.String r2 = "Failed to send crash report for %s"
        L_0x0291:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r24
            p000X.C000600f.m75J(r3, r4, r2, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass00S.mo23BP(X.00G, X.01k, java.lang.String, boolean):boolean");
    }
}
