package p000X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.02m reason: invalid class name and case insensitive filesystem */
public final class C006102m implements Closeable {

    /* renamed from: B */
    public final InputStream f385B;

    /* renamed from: C */
    public final C006602r f386C;

    public C006102m(C006602r r1, InputStream inputStream) {
        this.f386C = r1;
        this.f385B = inputStream;
    }

    public final void close() {
        this.f385B.close();
    }
}
