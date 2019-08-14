package p000X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.01W reason: invalid class name */
public class AnonymousClass01W {

    /* renamed from: B */
    private final Context f241B;

    public AnonymousClass01W(Context context) {
        this.f241B = context;
    }

    /* renamed from: A */
    public C002501a mo81A(AnonymousClass01Z r12, String str) {
        r12.mo84yX();
        File dir = this.f241B.getDir("modules", 0);
        StringBuilder sb = new StringBuilder();
        sb.append(null);
        sb.append("_");
        sb.append(null);
        File file = new File(dir, sb.toString());
        if (file.mkdirs() || file.isDirectory()) {
            return new C002501a(str, null, null, null, new ArrayList(null));
        }
        throw new IOException(String.format(null, "Unable to create directory %b %b %b %d", new Object[]{Boolean.valueOf(file.exists()), Boolean.valueOf(file.canRead()), Boolean.valueOf(file.canWrite()), Long.valueOf(file.getFreeSpace())}));
    }
}
