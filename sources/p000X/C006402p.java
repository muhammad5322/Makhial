package p000X;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.02p reason: invalid class name and case insensitive filesystem */
public class C006402p extends C006302o {

    /* renamed from: B */
    public C006702s[] f393B;

    /* renamed from: C */
    public final ZipFile f394C;

    /* renamed from: D */
    private /* synthetic */ C002000v f395D;

    public C006402p(C002000v r3) {
        this.f395D = r3;
        this.f394C = new ZipFile(r3.f141B);
    }

    /* renamed from: A */
    public final C007002v mo126A() {
        return new C007002v(mo152C());
    }

    /* renamed from: B */
    public final C006802t mo127B() {
        return new C006902u(this);
    }

    /* renamed from: C */
    public final C006702s[] mo152C() {
        if (this.f393B == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap hashMap = new HashMap();
            Pattern compile = Pattern.compile(this.f395D.f142C);
            String[] E = C001400p.m143E();
            Enumeration entries = this.f394C.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                Matcher matcher = compile.matcher(zipEntry.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    int C = C001400p.m141C(E, group);
                    if (C >= 0) {
                        linkedHashSet.add(group);
                        C006702s r0 = (C006702s) hashMap.get(group2);
                        if (r0 == null || C < r0.f401B) {
                            hashMap.put(group2, new C006702s(group2, zipEntry, C));
                        }
                    }
                }
            }
            linkedHashSet.toArray(new String[linkedHashSet.size()]);
            C006702s[] r4 = (C006702s[]) hashMap.values().toArray(new C006702s[hashMap.size()]);
            Arrays.sort(r4);
            int i = 0;
            for (int i2 = 0; i2 < r4.length; i2++) {
                C006702s r02 = r4[i2];
                if (mo153D(r02.f402C, r02.f400C)) {
                    i++;
                } else {
                    r4[i2] = null;
                }
            }
            C006702s[] r3 = new C006702s[i];
            int i3 = 0;
            for (C006702s r1 : r4) {
                if (r1 != null) {
                    int i4 = i3 + 1;
                    r3[i3] = r1;
                    i3 = i4;
                }
            }
            this.f393B = r3;
        }
        return this.f393B;
    }

    /* renamed from: D */
    public boolean mo153D(ZipEntry zipEntry, String str) {
        return true;
    }

    public final void close() {
        this.f394C.close();
    }
}
