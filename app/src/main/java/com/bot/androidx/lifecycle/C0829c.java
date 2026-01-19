package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f10867b;

    public C0829c(int i6, Method method) {
        this.a = i6;
        this.f10867b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0829c)) {
            return false;
        }
        C0829c c0829c = (C0829c) obj;
        return this.a == c0829c.a && this.f10867b.getName().equals(c0829c.f10867b.getName());
    }

    public final int hashCode() {
        return this.f10867b.getName().hashCode() + (this.a * 31);
    }
}
