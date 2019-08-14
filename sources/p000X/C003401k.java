package p000X;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.01k reason: invalid class name and case insensitive filesystem */
public final class C003401k implements Closeable {

    /* renamed from: B */
    public final RandomAccessFile f268B;

    /* renamed from: C */
    public final File f269C;

    /* renamed from: D */
    private /* synthetic */ AnonymousClass00W f270D;

    public C003401k(AnonymousClass00W r1, File file, RandomAccessFile randomAccessFile) {
        this.f270D = r1;
        this.f269C = file;
        this.f268B = randomAccessFile;
    }

    public final void close() {
        synchronized (this.f270D) {
            this.f270D.f97C.remove(this.f269C);
        }
        AnonymousClass00W.m59B(this.f268B);
    }
}
