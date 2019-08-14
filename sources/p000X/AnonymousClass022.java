package p000X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.022 reason: invalid class name */
public class AnonymousClass022 implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
    }
}
