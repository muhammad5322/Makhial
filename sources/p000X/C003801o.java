package p000X;

import android.content.Context;
import java.io.File;
import java.util.UUID;

/* renamed from: X.01o reason: invalid class name and case insensitive filesystem */
public class C003801o {

    /* renamed from: B */
    private final Context f275B;

    /* renamed from: C */
    private final String f276C;

    /* renamed from: D */
    private final String f277D;

    public C003801o(Context context, String str, String str2) {
        this.f275B = context;
        this.f277D = str;
        this.f276C = str2;
    }

    /* renamed from: A */
    public final File mo105A() {
        File dir = this.f275B.getDir(this.f276C, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        sb.append(this.f277D);
        return new File(dir, sb.toString());
    }
}
