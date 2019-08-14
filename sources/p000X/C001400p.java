package p000X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import com.facebook.soloader.SysUtil$LollipopSysdeps;
import java.io.File;
import java.io.IOException;

/* renamed from: X.00p reason: invalid class name and case insensitive filesystem */
public final class C001400p {
    /* renamed from: B */
    public static void m140B(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File B : listFiles) {
                    m140B(B);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sb = new StringBuilder("could not delete: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: C */
    public static int m141C(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D */
    public static int m142D(Context context) {
        int i = 0;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return i;
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException | RuntimeException unused) {
            return i;
        }
    }

    /* renamed from: E */
    public static String[] m143E() {
        if (VERSION.SDK_INT >= 21) {
            return SysUtil$LollipopSysdeps.getSupportedAbis();
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    /* renamed from: F */
    public static byte[] m144F(File file, Context context) {
        File canonicalFile = file.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte(1);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(m142D(context));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
