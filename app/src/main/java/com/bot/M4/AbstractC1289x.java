package m4;

import java.util.Collections;
import java.util.List;

/* renamed from: m4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1289x {
    public static final C1290y a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [m4.y] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r02 = 0;
        try {
            r02 = (C1290y) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r02 == 0) {
            r02 = new Object();
        }
        a = r02;
    }

    public static C1270e a(Class cls) {
        a.getClass();
        return new C1270e(cls);
    }

    public static C1265A b(Class cls) {
        C1270e a6 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new C1265A(a6);
    }
}
