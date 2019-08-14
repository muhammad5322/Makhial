package p000X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: X.00V reason: invalid class name */
public final class AnonymousClass00V {

    /* renamed from: B */
    public final Context f95B;

    public AnonymousClass00V(Context context) {
        this.f95B = context;
    }

    /* renamed from: A */
    public final PackageInfo mo26A(String str) {
        PackageManager packageManager = this.f95B.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(str, 0);
            } catch (NameNotFoundException unused) {
                this.f95B.getPackageName();
            } catch (RuntimeException unused2) {
            }
        }
        return null;
    }
}
