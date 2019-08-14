package p000X;

import java.io.InputStream;

/* renamed from: X.02u reason: invalid class name and case insensitive filesystem */
public final class C006902u extends C006802t {

    /* renamed from: B */
    private int f403B;

    /* renamed from: C */
    private /* synthetic */ C006402p f404C;

    public C006902u(C006402p r1) {
        this.f404C = r1;
    }

    /* renamed from: A */
    public final boolean mo121A() {
        this.f404C.mo152C();
        return this.f403B < this.f404C.f393B.length;
    }

    /* renamed from: B */
    public final C006102m mo122B() {
        this.f404C.mo152C();
        C006702s[] r2 = this.f404C.f393B;
        int i = this.f403B;
        this.f403B = i + 1;
        C006702s r22 = r2[i];
        InputStream inputStream = this.f404C.f394C.getInputStream(r22.f402C);
        try {
            return new C006102m(r22, inputStream);
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }
}
