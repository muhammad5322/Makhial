package p000X;

import android.content.Context;
import java.io.File;

/* renamed from: X.010 reason: invalid class name */
public class AnonymousClass010 extends C002000v {
    public AnonymousClass010(Context context, String str) {
        super(context, str, new File(context.getApplicationInfo().sourceDir), "^assets/lib/([^/]+)/([^/]+\\.so)$");
    }

    /* renamed from: D */
    public final byte[] mo55D() {
        return C001400p.m144F(this.f141B, this.f143B);
    }
}
