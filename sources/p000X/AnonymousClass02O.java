package p000X;

import com.facebook.xzdecoder.XzInputStream;
import java.io.InputStream;

/* renamed from: X.02O reason: invalid class name */
public final class AnonymousClass02O extends C006802t {

    /* renamed from: B */
    public final InputStream f363B;

    /* renamed from: C */
    private int f364C;

    /* renamed from: D */
    private /* synthetic */ AnonymousClass02H f365D;

    public AnonymousClass02O(AnonymousClass02H r6) {
        InputStream inputStream;
        this.f365D = r6;
        InputStream inputStream2 = r6.f358D.getInputStream(r6.f356B);
        try {
            AnonymousClass011 r1 = r6.f359E.f156D;
            if (r1 == AnonymousClass011.XZ) {
                inputStream = new XzInputStream(inputStream2);
            } else if (r1 == AnonymousClass011.ZSTD) {
                inputStream = (InputStream) Class.forName("com.facebook.zstd.ZstdInputStream").getConstructor(new Class[]{InputStream.class}).newInstance(new Object[]{inputStream2});
            } else {
                throw new IllegalStateException("Unknown compression algorithm");
            }
            this.f363B = inputStream;
            if (!mo121A()) {
                close();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        } catch (Throwable th) {
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    /* renamed from: A */
    public final boolean mo121A() {
        int i = this.f364C;
        while (i < this.f365D.f357C.length && !this.f365D.f357C[i].f378C) {
            i++;
        }
        return i < this.f365D.f357C.length;
    }

    /* renamed from: B */
    public final C006102m mo122B() {
        while (this.f364C < this.f365D.f357C.length) {
            C005102b[] r2 = this.f365D.f357C;
            int i = this.f364C;
            this.f364C = i + 1;
            C005102b r3 = r2[i];
            C005002a r22 = new C005002a(this, r3.f379D);
            try {
                C006102m r1 = new C006102m(r3, r22);
                if (r3.f378C) {
                    return r1;
                }
                r1.close();
            } catch (Throwable th) {
                r22.close();
                throw th;
            }
        }
        return null;
    }

    public final void close() {
        this.f363B.close();
    }
}
