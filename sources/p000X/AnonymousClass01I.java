package p000X;

import android.net.NetworkInfo;

/* renamed from: X.01I reason: invalid class name */
public class AnonymousClass01I {

    /* renamed from: B */
    public final NetworkInfo f168B;

    public AnonymousClass01I(NetworkInfo networkInfo) {
        this.f168B = networkInfo;
    }

    /* renamed from: A */
    public final String mo69A() {
        return this.f168B.getTypeName();
    }

    /* renamed from: B */
    public final boolean mo70B() {
        return this.f168B.isConnected();
    }

    /* renamed from: C */
    public final boolean mo71C() {
        return this.f168B.isConnectedOrConnecting();
    }

    public final String toString() {
        return this.f168B.toString();
    }
}
