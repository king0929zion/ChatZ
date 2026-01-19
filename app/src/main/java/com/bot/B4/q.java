package B4;

import P2.C0367m0;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class q extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0367m0 f616h;

    /* renamed from: i, reason: collision with root package name */
    public int f617i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C0367m0 c0367m0, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f616h = c0367m0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f615g = obj;
        this.f617i |= Integer.MIN_VALUE;
        return this.f616h.a(null, this);
    }
}
