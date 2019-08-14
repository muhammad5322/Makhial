package p000X;

import android.content.Context;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.00J reason: invalid class name */
public final class AnonymousClass00J {

    /* renamed from: B */
    public static Context f72B;

    /* renamed from: C */
    public static boolean f73C;

    /* renamed from: D */
    public static ArrayList f74D;

    /* renamed from: B */
    public static synchronized void m49B(Context context) {
        synchronized (AnonymousClass00J.class) {
            synchronized (AnonymousClass00J.class) {
                if (!f73C) {
                    ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        new File("/data/local/tmp/ctscan_test_running").exists();
                        StringBuilder sb = new StringBuilder();
                        sb.append(context.getApplicationInfo().dataDir);
                        sb.append("/app_libs");
                        C001400p.m140B(new File(sb.toString()));
                        C001500q.m145B(context);
                        f74D = new ArrayList();
                        String str = "lib-assets";
                        C001500q.m148E(new AnonymousClass010(context, str));
                        f74D.add(str);
                        AnonymousClass011 r2 = AnonymousClass011.XZ;
                        C001500q.m148E(new AnonymousClass012(context, r2));
                        f74D.add(r2.f153C);
                        AnonymousClass011 r22 = AnonymousClass011.ZSTD;
                        C001500q.m148E(new AnonymousClass012(context, r22));
                        f74D.add(r22.f153C);
                        f72B = context;
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        f73C = true;
                    } catch (IOException e) {
                        Log.e("FbSoLoader", "IOException during init", e);
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        f73C = true;
                        throw th;
                    }
                }
            }
        }
    }
}
