package p000X;

import java.io.File;
import java.util.zip.ZipEntry;

/* renamed from: X.02q reason: invalid class name and case insensitive filesystem */
public class C006502q extends C006402p {

    /* renamed from: B */
    private final int f396B;

    /* renamed from: C */
    private File f397C;

    /* renamed from: D */
    private /* synthetic */ C001900u f398D;

    public C006502q(C001900u r3) {
        this.f398D = r3;
        super(r3);
        this.f397C = new File(r3.f143B.getApplicationInfo().nativeLibraryDir);
        this.f396B = r3.f140B;
    }

    /* renamed from: D */
    public final boolean mo153D(ZipEntry zipEntry, String str) {
        String name = zipEntry.getName();
        if (str.equals(this.f398D.f144C)) {
            this.f398D.f144C = null;
            String.format("allowing consideration of corrupted lib %s", new Object[]{str});
        } else if ((this.f396B & 1) != 0) {
            File file = new File(this.f397C, str);
            if (!file.isFile()) {
                String.format("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                return true;
            }
            long length = file.length();
            long size = zipEntry.getSize();
            if (length == size) {
                return false;
            }
            String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
            return true;
        }
        return true;
    }
}
