package p000X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.02a reason: invalid class name and case insensitive filesystem */
public final class C005002a extends InputStream {

    /* renamed from: B */
    private int f375B;

    /* renamed from: C */
    private /* synthetic */ AnonymousClass02O f376C;

    public C005002a(AnonymousClass02O r1, int i) {
        this.f376C = r1;
        this.f375B = i;
    }

    public final int available() {
        return this.f375B;
    }

    public final void close() {
        while (available() > 0) {
            skip((long) available());
        }
    }

    public final int read() {
        if (this.f375B == 0) {
            return -1;
        }
        int read = this.f376C.f363B.read();
        if (read == -1) {
            throw new IOException("compressed stream terminated prematurely");
        }
        this.f375B--;
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read;
        if (i2 <= 0 || this.f375B != 0) {
            read = this.f376C.f363B.read(bArr, i, Math.min(this.f375B, i2));
            if (read > 0) {
                this.f375B -= read;
                return read;
            }
        } else {
            read = -1;
        }
        return read;
    }
}
