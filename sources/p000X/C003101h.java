package p000X;

import android.os.Process;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: X.01h reason: invalid class name and case insensitive filesystem */
public class C003101h extends C002901e {

    /* renamed from: B */
    private static final String f258B = String.format("/proc/%s/fd", new Object[]{Integer.valueOf(Process.myPid())});

    /* renamed from: C */
    private static final int[] f259C = {32, 32, 288, 4384, 4384, 288};

    /* renamed from: D */
    public static C003101h f260D;

    public final int getOpenFDCount() {
        try {
            String[] list = new File(f258B).list();
            if (list != null) {
                return list.length;
            }
            return -1;
        } catch (SecurityException e) {
            C000600f.m71F("JavaProcFileReader", e.getMessage());
            return -2;
        }
    }

    public final C003001f getOpenFDLimits() {
        Throwable th;
        C003001f r13 = null;
        byte[] bArr = new byte[8192];
        byte[] bytes = "Max open files".getBytes();
        String[] strArr = new String[2];
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/self/limits");
            try {
                int read = fileInputStream.read(bArr, 0, 8191);
                bArr[read] = 0;
                fileInputStream.close();
                int i = 0;
                while (true) {
                    if ((read - 1) - i <= bytes.length) {
                        break;
                    }
                    int i2 = i;
                    if (i >= 8192) {
                        i2 = -1;
                    } else {
                        while (i2 < 8191 && bArr[i2] != 10 && bArr[i2] != 0) {
                            i2++;
                        }
                    }
                    boolean z = false;
                    if (8192 - i >= bytes.length) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < bytes.length) {
                                if (bArr[i3 + i] != bytes[i3]) {
                                    break;
                                }
                                i3++;
                            } else {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (z) {
                        if (AnonymousClass01S.f217C == null ? false : AnonymousClass01S.f217C.mo87zW(bArr, i, i2, f259C, strArr, null)) {
                            r13 = new C003001f(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));
                        }
                    } else {
                        i = i2 + 1;
                    }
                }
                return r13;
            } catch (Throwable th2) {
                th = th2;
            }
            throw th;
            if (th != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    AnonymousClass01A.m182B(th, th3);
                }
            } else {
                fileInputStream.close();
            }
            throw th;
        } catch (IOException e) {
            C000600f.m82Q("JavaProcFileReader", e, "Failed to read /proc/self/limits");
            return null;
        }
    }

    public final String getOpenFileDescriptors() {
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            String[] split = AnonymousClass02N.m306B("/system/bin/ls", "-l", String.format(f258B, new Object[0])).split("\n");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 1; i < split.length; i++) {
                String str2 = split[i];
                int lastIndexOf = str2.lastIndexOf(" -> ");
                if (lastIndexOf != -1) {
                    String substring = str2.substring(lastIndexOf + 4);
                    int lastIndexOf2 = substring.lastIndexOf("/fd/");
                    String substring2 = lastIndexOf2 == -1 ? substring : substring.substring(lastIndexOf2 + 4);
                    if (substring2.startsWith("pipe")) {
                        str = "pipe";
                    } else {
                        str = "socket";
                        if (!substring2.startsWith(str)) {
                            str = substring;
                        }
                    }
                    AnonymousClass02T r3 = (AnonymousClass02T) linkedHashMap.get(str);
                    if (r3 == null) {
                        r3 = new AnonymousClass02T();
                        linkedHashMap.put(str, r3);
                    }
                    r3.f370B++;
                }
            }
            for (Entry entry : linkedHashMap.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(" ");
                sb.append(((AnonymousClass02T) entry.getValue()).f370B);
                sb.append("\n");
            }
            return sb.toString();
        } catch (IOException | IndexOutOfBoundsException | SecurityException e) {
            C000600f.m74I("JavaProcFileReader", e, "Exception caught while reading open file descriptors");
            return e.getMessage();
        }
    }
}
