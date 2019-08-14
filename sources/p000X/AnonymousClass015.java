package p000X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.015 reason: invalid class name */
public final class AnonymousClass015 extends AnonymousClass016 {
    /* renamed from: A */
    public final Throwable mo58A(Throwable th, Map map) {
        map.put("RAW_STACK_TRACE_ATTEMPTED", Boolean.toString(true));
        map.put("RAW_STACK_TRACE_STRIPPED_APK", Boolean.toString(true));
        if (!(th instanceof AnonymousClass01Q)) {
            return th;
        }
        AnonymousClass01Q r4 = (AnonymousClass01Q) th;
        List list = r4.f210C != null ? Collections.unmodifiableList(r4.f210C) : null;
        if (list != null) {
            map.put("STACK_TRACE_OFFSETS", list.toString());
        }
        return r4.f209B;
    }
}
