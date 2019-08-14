package p000X;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: X.012 reason: invalid class name */
public class AnonymousClass012 extends C002100w {

    /* renamed from: B */
    public final String f154B;

    /* renamed from: C */
    public final String f155C;

    /* renamed from: D */
    public AnonymousClass011 f156D;

    /* renamed from: E */
    public final File f157E;

    /* renamed from: F */
    private final File f158F;

    public AnonymousClass012(Context context, AnonymousClass011 r4) {
        super(context, r4.f153C);
        File file = new File(this.f143B.getApplicationInfo().sourceDir);
        this.f158F = file;
        this.f157E = file;
        this.f156D = r4;
        this.f155C = r4.f152B;
        this.f154B = "assets/lib/metadata.txt";
    }

    public AnonymousClass012(Context context, File file, File file2, String str, String str2, AnonymousClass011 r8) {
        super(context, file);
        this.f158F = new File(context.getApplicationInfo().sourceDir);
        this.f157E = file2;
        this.f156D = r8;
        this.f155C = str;
        this.f154B = str2;
    }

    /* renamed from: D */
    public final byte[] mo55D() {
        return C001400p.m144F(this.f158F, this.f143B);
    }

    /* renamed from: E */
    public final C006302o mo56E() {
        return new AnonymousClass02H(this);
    }

    public final String toString() {
        String str;
        try {
            str = String.valueOf(this.f139C.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f139C.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.f138B);
        sb.append(" zipSource = ");
        sb.append(this.f157E.getPath());
        sb.append(" compressedPath = ");
        sb.append(this.f155C);
        sb.append(']');
        return sb.toString();
    }
}
