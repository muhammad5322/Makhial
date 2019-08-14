package p000X;

import java.util.zip.ZipEntry;

/* renamed from: X.02s reason: invalid class name and case insensitive filesystem */
public final class C006702s extends C006602r implements Comparable {

    /* renamed from: B */
    public final int f401B;

    /* renamed from: C */
    public final ZipEntry f402C;

    public C006702s(String str, ZipEntry zipEntry, int i) {
        super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
        this.f402C = zipEntry;
        this.f401B = i;
    }

    public final int compareTo(Object obj) {
        return this.f400C.compareTo(((C006702s) obj).f400C);
    }
}
