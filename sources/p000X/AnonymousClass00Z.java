package p000X;

import java.util.Comparator;

/* renamed from: X.00Z reason: invalid class name */
public final class AnonymousClass00Z implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        C000100a r5 = (C000100a) obj;
        C000100a r6 = (C000100a) obj2;
        if (r5.f102C == r6.f102C) {
            i = 0;
        } else {
            i = 1;
            if (r5.f102C < r6.f102C) {
                return -1;
            }
        }
        return i;
    }
}
