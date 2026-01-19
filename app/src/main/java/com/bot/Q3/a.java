package Q3;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class a extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public b f6451g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6452h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f6453i;

    /* renamed from: j, reason: collision with root package name */
    public int f6454j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f6453i = bVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f6452h = obj;
        this.f6454j |= Integer.MIN_VALUE;
        return this.f6453i.f(this);
    }
}
