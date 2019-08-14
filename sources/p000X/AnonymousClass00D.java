package p000X;

import android.content.Context;

/* renamed from: X.00D reason: invalid class name */
public class AnonymousClass00D {

    /* renamed from: B */
    public final Context f30B;

    /* renamed from: C */
    public final String f31C;

    /* renamed from: D */
    public final boolean f32D;

    public AnonymousClass00D(Context context, String str, boolean z) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null.");
        } else if (str == null) {
            throw new IllegalArgumentException("Crash report url cannot be null.");
        } else {
            this.f30B = context;
            this.f31C = str;
            this.f32D = z;
        }
    }

    /* renamed from: A */
    public boolean mo13A() {
        return true;
    }
}
