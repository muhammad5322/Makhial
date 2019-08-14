package p000X;

/* renamed from: X.00z reason: invalid class name and case insensitive filesystem */
public final class C002400z extends UnsatisfiedLinkError {
    public C002400z(Throwable th) {
        super("APK was built for a different platform");
        initCause(th);
    }
}
