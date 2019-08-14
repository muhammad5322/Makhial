package p000X;

import android.content.Context;
import android.os.Parcel;
import java.io.File;

/* renamed from: X.00u reason: invalid class name and case insensitive filesystem */
public class C001900u extends C002000v {

    /* renamed from: B */
    public final int f140B;

    public C001900u(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f140B = i;
    }

    /* renamed from: D */
    public final byte[] mo55D() {
        File canonicalFile = this.f141B.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte(2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(C001400p.m142D(this.f143B));
            if ((this.f140B & 1) == 0) {
                obtain.writeByte(0);
                return obtain.marshall();
            }
            String str = this.f143B.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte(1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte(1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte(2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: E */
    public final C006302o mo56E() {
        return new C006502q(this);
    }
}
