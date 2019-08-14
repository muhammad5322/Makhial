package p000X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.00Q reason: invalid class name */
public class AnonymousClass00Q implements AnonymousClass00R {
    /* renamed from: BP */
    public final boolean mo23BP(AnonymousClass00G r15, C003401k r16, String str, boolean z) {
        C003401k r1 = r16;
        File file = r1.f269C;
        String name = file.getName();
        try {
            AnonymousClass00P r10 = AnonymousClass00P.ACRA_CRASH_REPORT;
            AnonymousClass01R E = AnonymousClass00G.m23E(r15, r1.f269C, r1.f268B, r10, r15.f64T, true);
            E.put("ACRA_REPORT_TYPE", r10.name());
            E.put("ACRA_REPORT_FILENAME", name);
            E.put("UPLOADED_BY_PROCESS", str);
            AnonymousClass00G.m29K(r15, E);
            AnonymousClass00G.m20B(file);
            return true;
        } catch (RuntimeException e) {
            C000600f.m74I("ACRA", e, "Failed to send crash reports");
            AnonymousClass00G.m20B(file);
            return false;
        } catch (IOException e2) {
            C000600f.m75J("ACRA", e2, "Failed to load crash report for %s", name);
            AnonymousClass00G.m20B(file);
            return false;
        } catch (AnonymousClass02K e3) {
            C000600f.m75J("ACRA", e3, "Failed to send crash report for %s", name);
            return false;
        }
    }
}
