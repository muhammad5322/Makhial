package p000X;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: X.001 reason: invalid class name */
public class AnonymousClass001 {

    /* renamed from: B */
    private final Context f0B;

    public AnonymousClass001(Context context) {
        this.f0B = context;
    }

    /* renamed from: A */
    public final InputStream mo1A(String str) {
        AssetManager assets = this.f0B.getAssets();
        StringBuilder sb = new StringBuilder("secondary-program-dex-jars/");
        sb.append(str);
        return assets.open(sb.toString());
    }
}
