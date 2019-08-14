package p000X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.01a reason: invalid class name and case insensitive filesystem */
public class C002501a {

    /* renamed from: B */
    public final File f242B;

    /* renamed from: C */
    public final List f243C = new ArrayList();

    /* renamed from: D */
    public final String f244D;

    /* renamed from: E */
    public final File f245E;

    /* renamed from: F */
    public final File f246F;

    public C002501a(String str, File file, File file2, File file3, List list) {
        this.f244D = str;
        this.f242B = file;
        this.f246F = file2;
        this.f245E = file3;
        this.f243C.addAll(list);
    }
}
