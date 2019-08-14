package p000X;

import java.util.Formatter;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.00o reason: invalid class name and case insensitive filesystem */
public class C001300o implements C001200n {

    /* renamed from: B */
    private final Map f121B = new TreeMap();

    /* renamed from: PN */
    public final Map mo47PN() {
        return new TreeMap(this.f121B);
    }

    /* renamed from: ZJ */
    public final String mo48ZJ(String str) {
        return (String) this.f121B.get(str);
    }

    /* renamed from: bY */
    public final void mo49bY(String str) {
        if (str != null) {
            this.f121B.remove(str);
        }
    }

    /* renamed from: nZ */
    public final void mo50nZ(String str, String str2, Object... objArr) {
        if (str != null) {
            if (str2 != null) {
                if (objArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    Formatter formatter = new Formatter(sb);
                    formatter.format(str2, objArr);
                    formatter.close();
                    str2 = sb.toString();
                }
                this.f121B.put(str, str2);
            } else {
                mo49bY(str);
            }
        }
    }
}
