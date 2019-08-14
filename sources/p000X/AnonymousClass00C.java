package p000X;

import android.app.Application;
import android.net.Uri;

/* renamed from: X.00C reason: invalid class name */
public class AnonymousClass00C extends AnonymousClass00D {

    /* renamed from: B */
    private boolean f29B;

    public AnonymousClass00C(Application application, String str, boolean z, boolean z2) {
        boolean z3 = false;
        super(application, str, z);
        if (!z2) {
            z3 = true;
        }
        this.f29B = z3;
    }

    /* renamed from: B */
    public static Uri m8B(String str) {
        return Uri.parse("https://www.facebook.com/mobile/generic_android_crash_logs/").buildUpon().appendPath(str).build();
    }

    /* renamed from: A */
    public final boolean mo13A() {
        return this.f29B;
    }
}
