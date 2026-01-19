package j0;

import z4.C2052c;

/* loaded from: classes.dex */
public final class b extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public C2052c f12318g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12319h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f12320i;

    /* renamed from: j, reason: collision with root package name */
    public int f12321j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, d4.c cVar) {
        super(cVar);
        this.f12320i = dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12319h = obj;
        this.f12321j |= Integer.MIN_VALUE;
        return this.f12320i.a(this);
    }
}
