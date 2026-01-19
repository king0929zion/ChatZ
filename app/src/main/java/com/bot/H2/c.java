package H2;

import X3.l;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2026g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f2027h;

    /* renamed from: i, reason: collision with root package name */
    public int f2028i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, d4.c cVar) {
        super(cVar);
        this.f2027h = gVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f2026g = obj;
        this.f2028i |= Integer.MIN_VALUE;
        Object b5 = this.f2027h.b(0, null, this);
        return b5 == EnumC0927a.f11114c ? b5 : new l(b5);
    }
}
