package p;

import t.C1679g;

/* renamed from: p.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1436h0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public C1679g f13718g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13719h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1444l0 f13720i;

    /* renamed from: j, reason: collision with root package name */
    public int f13721j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436h0(C1444l0 c1444l0, d4.c cVar) {
        super(cVar);
        this.f13720i = c1444l0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f13719h = obj;
        this.f13721j |= Integer.MIN_VALUE;
        return C1444l0.M0(this.f13720i, this);
    }
}
