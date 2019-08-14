package p000X;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;

/* renamed from: X.00x reason: invalid class name and case insensitive filesystem */
public class C002200x extends C001700s {

    /* renamed from: B */
    public Context f146B;

    /* renamed from: C */
    public int f147C;

    /* renamed from: D */
    public C001800t f148D;

    public C002200x(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f146B = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.f146B = context;
        }
        this.f147C = i;
        this.f148D = new C001800t(new File(this.f146B.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: A */
    public final int mo51A(String str, int i, ThreadPolicy threadPolicy) {
        return this.f148D.mo51A(str, i, threadPolicy);
    }

    /* renamed from: B */
    public final void mo52B(int i) {
        this.f148D.mo52B(i);
    }

    public final String toString() {
        return this.f148D.toString();
    }
}
