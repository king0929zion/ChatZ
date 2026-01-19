package Z;

import W.e;
import Y3.h;
import a0.C0792b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends h implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final b f9846g;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9847c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9848e;

    /* renamed from: f, reason: collision with root package name */
    public final Y.c f9849f;

    static {
        C0792b c0792b = C0792b.a;
        f9846g = new b(c0792b, c0792b, Y.c.f9543f);
    }

    public b(Object obj, Object obj2, Y.c cVar) {
        this.f9847c = obj;
        this.f9848e = obj2;
        this.f9849f = cVar;
    }

    @Override // Y3.AbstractC0734a
    public final int a() {
        Y.c cVar = this.f9849f;
        cVar.getClass();
        return cVar.f9545e;
    }

    @Override // Y3.AbstractC0734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f9849f.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f9847c, this.f9849f);
    }
}
