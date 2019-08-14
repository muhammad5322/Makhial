package p000X;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: X.004 reason: invalid class name */
public final class AnonymousClass004 implements Closeable {

    /* renamed from: B */
    private final FileLock f3B;

    /* renamed from: C */
    private final FileOutputStream f4C;

    public AnonymousClass004(File file) {
        this.f4C = new FileOutputStream(file);
        try {
            FileLock lock = this.f4C.getChannel().lock();
            if (lock == null) {
            }
            this.f3B = lock;
        } finally {
            this.f4C.close();
        }
    }

    public final void close() {
        try {
            if (this.f3B != null) {
                this.f3B.release();
            }
        } finally {
            this.f4C.close();
        }
    }
}
