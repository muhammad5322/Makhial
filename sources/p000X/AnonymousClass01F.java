package p000X;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.01F reason: invalid class name */
public class AnonymousClass01F {

    /* renamed from: B */
    public AnonymousClass01C f161B;

    /* renamed from: C */
    public final Map f162C = new HashMap();

    /* renamed from: D */
    public Context f163D;

    /* renamed from: E */
    public final AnonymousClass00G f164E;

    /* renamed from: F */
    public final C003801o f165F;

    /* renamed from: G */
    public File f166G;

    public AnonymousClass01F(Context context, AnonymousClass00G r5) {
        this.f163D = context;
        this.f164E = r5;
        this.f165F = new C003801o(context, ".cachedreport", "traces");
    }

    /* renamed from: B */
    public static void m190B(File file) {
        File[] listFiles;
        if (file != null && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m190B(file2);
                }
                if (file2 != null) {
                    boolean delete = file2.delete();
                    if (!delete && !file2.exists()) {
                        delete = true;
                    }
                    if (!delete) {
                        C000600f.m81P("ANRReport", "Could not delete error report: %s", file2.getName());
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public final void mo68A() {
        boolean z;
        synchronized (this.f162C) {
            try {
                AnonymousClass00G r1 = this.f164E;
                Map map = this.f162C;
                if (r1.f48D.isEmpty()) {
                    z = false;
                } else {
                    String str = (String) r1.f48D.iterator().next();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".upd");
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(sb.toString()), true);
                    AnonymousClass01R r5 = new AnonymousClass01R(map);
                    synchronized (r5) {
                        Writer B = AnonymousClass01R.m215B((OutputStream) fileOutputStream);
                        synchronized (r5) {
                            for (Entry entry : r5.entrySet()) {
                                AnonymousClass01R.m216C(B, (String) entry.getKey(), (String) entry.getValue());
                            }
                            B.flush();
                        }
                    }
                    fileOutputStream.close();
                    z = true;
                }
            } catch (IOException unused) {
                z = false;
            }
        }
        if (z) {
            this.f162C.clear();
        }
    }
}
