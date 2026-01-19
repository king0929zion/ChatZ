package A4;

import b4.InterfaceC0905c;

/* renamed from: A4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015p extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0016q f290h;

    /* renamed from: i, reason: collision with root package name */
    public int f291i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015p(C0016q c0016q, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f290h = c0016q;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f289g = obj;
        this.f291i |= Integer.MIN_VALUE;
        return this.f290h.a(null, this);
    }
}
