package p000X;

import android.content.res.Configuration;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.TreeMap;

/* renamed from: X.021 reason: invalid class name */
public class AnonymousClass021 {

    /* renamed from: B */
    private static SparseArray f329B = new SparseArray();

    /* renamed from: C */
    private static SparseArray f330C = new SparseArray();

    /* renamed from: D */
    private static SparseArray f331D = new SparseArray();

    /* renamed from: E */
    private static SparseArray f332E = new SparseArray();

    /* renamed from: F */
    private static SparseArray f333F = new SparseArray();

    /* renamed from: G */
    private static SparseArray f334G = new SparseArray();

    /* renamed from: H */
    private static SparseArray f335H = new SparseArray();

    /* renamed from: I */
    private static SparseArray f336I = new SparseArray();

    /* renamed from: J */
    private static SparseArray f337J = new SparseArray();

    /* renamed from: K */
    public static final TreeMap f338K;

    static {
        Field[] fields;
        TreeMap treeMap = new TreeMap();
        f338K = treeMap;
        treeMap.put("HARDKEYBOARDHIDDEN_", f329B);
        TreeMap treeMap2 = f338K;
        treeMap2.put("KEYBOARD_", f331D);
        treeMap2.put("KEYBOARDHIDDEN_", f330C);
        treeMap2.put("NAVIGATION_", f333F);
        treeMap2.put("NAVIGATIONHIDDEN_", f332E);
        treeMap2.put("ORIENTATION_", f334G);
        treeMap2.put("SCREENLAYOUT_", f335H);
        treeMap2.put("TOUCHSCREEN_", f336I);
        treeMap2.put("UI_MODE_", f337J);
        for (Field field : Configuration.class.getFields()) {
            if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                String name = field.getName();
                try {
                    if (name.startsWith("HARDKEYBOARDHIDDEN_")) {
                        f329B.put(field.getInt(null), name);
                    } else if (name.startsWith("KEYBOARD_")) {
                        f331D.put(field.getInt(null), name);
                    } else if (name.startsWith("KEYBOARDHIDDEN_")) {
                        f330C.put(field.getInt(null), name);
                    } else if (name.startsWith("NAVIGATION_")) {
                        f333F.put(field.getInt(null), name);
                    } else if (name.startsWith("NAVIGATIONHIDDEN_")) {
                        f332E.put(field.getInt(null), name);
                    } else if (name.startsWith("ORIENTATION_")) {
                        f334G.put(field.getInt(null), name);
                    } else if (name.startsWith("SCREENLAYOUT_")) {
                        f335H.put(field.getInt(null), name);
                    } else if (name.startsWith("TOUCHSCREEN_")) {
                        f336I.put(field.getInt(null), name);
                    } else if (name.startsWith("UI_MODE_")) {
                        f337J.put(field.getInt(null), name);
                    }
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    C000600f.m82Q("ACRA", e, "Error while inspecting device configuration: ");
                }
            }
        }
    }

    /* renamed from: B */
    public static String m291B(SparseArray sparseArray, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int keyAt = sparseArray.keyAt(i2);
            if (((String) sparseArray.get(keyAt)).endsWith("_MASK")) {
                int i3 = i & keyAt;
                if (i3 > 0) {
                    if (sb.length() > 0) {
                        sb.append('+');
                    }
                    sb.append((String) sparseArray.get(i3));
                }
            }
        }
        return sb.toString();
    }
}
