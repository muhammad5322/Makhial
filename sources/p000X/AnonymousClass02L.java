package p000X;

import android.os.SystemClock;
import java.io.OutputStream;

/* renamed from: X.02L reason: invalid class name */
public class AnonymousClass02L extends OutputStream {

    /* renamed from: B */
    private final OutputStream f361B;

    /* renamed from: C */
    private final C004701x f362C;

    public AnonymousClass02L(OutputStream outputStream, C004701x r2) {
        this.f361B = outputStream;
        this.f362C = r2;
    }

    public final void close() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f361B.close();
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), 0);
        } catch (Throwable th) {
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), 0);
            throw th;
        }
    }

    public final void flush() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f361B.flush();
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), 0);
        } catch (Throwable th) {
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), 0);
            throw th;
        }
    }

    public final void write(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f361B.write(i);
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), 1);
        } catch (Throwable th) {
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), 1);
            throw th;
        }
    }

    public final void write(byte[] bArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f361B.write(bArr);
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), bArr.length);
        } catch (Throwable th) {
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), bArr.length);
            throw th;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = i2;
        try {
            this.f361B.write(bArr, i, i2);
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), i3);
        } catch (Throwable th) {
            this.f362C.mo118IV(elapsedRealtime, SystemClock.elapsedRealtime(), i2);
            throw th;
        }
    }
}
