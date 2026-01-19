package O0;

import S.l;

/* loaded from: classes.dex */
public final class h extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f4303h;

    /* renamed from: i, reason: collision with root package name */
    public int f4304i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, d4.c cVar) {
        super(cVar);
        this.f4303h = iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f4302g = obj;
        this.f4304i |= Integer.MIN_VALUE;
        return this.f4303h.b(l.f7374V, this);
    }
}
