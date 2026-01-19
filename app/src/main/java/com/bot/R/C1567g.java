package r;

import R.C0505j;
import b4.InterfaceC0905c;

/* renamed from: r.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567g extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f14317g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14318h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0505j f14319i;

    /* renamed from: j, reason: collision with root package name */
    public int f14320j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567g(C0505j c0505j, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f14319i = c0505j;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14318h = obj;
        this.f14320j |= Integer.MIN_VALUE;
        return this.f14319i.a(null, this);
    }
}
