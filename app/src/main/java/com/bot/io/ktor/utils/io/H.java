package io.ktor.utils.io;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m4.AbstractC1276k;
import m4.AbstractC1289x;

/* loaded from: classes.dex */
public abstract class H {
    public static final int a = a(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    public static final ReentrantReadWriteLock f12102b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f12103c = new WeakHashMap();

    public static final int a(Class cls, int i6) {
        Object b5;
        AbstractC1289x.a(cls);
        int i7 = 0;
        do {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC1276k.e(declaredFields, "declaredFields");
                int i8 = 0;
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i8++;
                    }
                }
                i7 += i8;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                b5 = X3.a.b(th);
            }
        } while (cls != null);
        b5 = Integer.valueOf(i7);
        Object valueOf = Integer.valueOf(i6);
        if (b5 instanceof X3.k) {
            b5 = valueOf;
        }
        return ((Number) b5).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[EDGE_INSN: B:51:0x0123->B:52:0x0123 BREAK  A[LOOP:3: B:40:0x00c2->B:83:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[LOOP:3: B:40:0x00c2->B:83:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable b(java.lang.Throwable r12, java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.H.b(java.lang.Throwable, java.lang.Throwable):java.lang.Throwable");
    }
}
