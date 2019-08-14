package p000X;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.01b reason: invalid class name and case insensitive filesystem */
public final class C002601b implements Closeable {

    /* renamed from: B */
    public final RandomAccessFile f247B;

    /* renamed from: C */
    public final File f248C;

    /* renamed from: D */
    private /* synthetic */ AnonymousClass00W f249D;

    public C002601b(AnonymousClass00W r1, File file, RandomAccessFile randomAccessFile) {
        this.f249D = r1;
        this.f248C = file;
        this.f247B = randomAccessFile;
    }

    public final void close() {
        synchronized (this.f249D) {
            this.f249D.f97C.remove(this.f248C);
        }
        this.f247B.close();
    }
}
