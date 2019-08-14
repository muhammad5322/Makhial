package p000X;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: X.02Y reason: invalid class name */
public class AnonymousClass02Y implements AnonymousClass02P {
    /* renamed from: QJ */
    public final HttpURLConnection mo135QJ(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(3000);
        httpURLConnection.setReadTimeout(3000);
        return httpURLConnection;
    }
}
