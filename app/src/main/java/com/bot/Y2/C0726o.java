package Y2;

import c4.EnumC0927a;

/* renamed from: Y2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726o extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0730t f9750h;

    /* renamed from: i, reason: collision with root package name */
    public int f9751i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0726o(C0730t c0730t, d4.c cVar) {
        super(cVar);
        this.f9750h = c0730t;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9749g = obj;
        this.f9751i |= Integer.MIN_VALUE;
        Object h3 = this.f9750h.h(this);
        return h3 == EnumC0927a.f11114c ? h3 : new X3.l(h3);
    }
}
