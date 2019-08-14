package p000X;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.006 reason: invalid class name */
public class AnonymousClass006 implements Closeable {

    /* renamed from: B */
    public final String f10B;

    /* renamed from: C */
    public long f11C = -1;

    /* renamed from: D */
    private final long f12D = System.nanoTime();

    public AnonymousClass006(String str) {
        this.f10B = str;
    }

    public final void close() {
        this.f11C = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f12D);
        AnonymousClass005.f8E.put(this.f10B, Long.valueOf(this.f11C));
    }
}
