package p000X;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.00T reason: invalid class name */
public class AnonymousClass00T {

    /* renamed from: B */
    public Queue f94B;

    public AnonymousClass00T() {
        synchronized (this) {
            this.f94B = new LinkedList();
        }
    }

    /* renamed from: A */
    public final synchronized String mo24A(int i) {
        StringBuilder sb;
        sb = new StringBuilder();
        int max = i <= 0 ? 0 : Math.max(this.f94B.size() - i, 0);
        int i2 = 0;
        for (AnonymousClass02Z r1 : this.f94B) {
            if (i2 >= max) {
                sb.append(r1.toString());
                sb.append(10);
            }
            i2++;
        }
        return sb.toString();
    }

    public final synchronized String toString() {
        return mo24A(0);
    }
}
