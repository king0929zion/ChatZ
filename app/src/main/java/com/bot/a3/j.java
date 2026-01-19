package A3;

import I3.H;

/* loaded from: classes.dex */
public final class j extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public H f140g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f141h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f142i;

    /* renamed from: j, reason: collision with root package name */
    public int f143j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, d4.c cVar) {
        super(cVar);
        this.f142i = kVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f141h = obj;
        this.f143j |= Integer.MIN_VALUE;
        return this.f142i.b(null, null, null, null, null, this);
    }
}
