package p000X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: X.01K reason: invalid class name */
public abstract class AnonymousClass01K {

    /* renamed from: B */
    private static volatile ConnectivityManager f169B;

    /* renamed from: B */
    public static AnonymousClass01I m206B(int i, Context context) {
        NetworkInfo networkInfo = m207C(context).getNetworkInfo(i);
        if (networkInfo == null) {
            return null;
        }
        return new AnonymousClass01I(networkInfo);
    }

    /* renamed from: C */
    public static ConnectivityManager m207C(Context context) {
        if (f169B == null) {
            synchronized (AnonymousClass01K.class) {
                if (f169B == null) {
                    f169B = (ConnectivityManager) context.getSystemService("connectivity");
                }
            }
        }
        return f169B;
    }
}
