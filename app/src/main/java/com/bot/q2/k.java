package Q2;

import P2.C0367m0;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class k extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6424g;

    /* renamed from: h, reason: collision with root package name */
    public int f6425h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0367m0 f6426i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0367m0 c0367m0, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f6426i = c0367m0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f6424g = obj;
        this.f6425h |= Integer.MIN_VALUE;
        return this.f6426i.a(null, this);
    }
}
