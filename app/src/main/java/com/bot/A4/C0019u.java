package A4;

import b4.InterfaceC0905c;

/* renamed from: A4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019u extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f308g;

    /* renamed from: h, reason: collision with root package name */
    public int f309h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0020v f310i;

    /* renamed from: j, reason: collision with root package name */
    public Object f311j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0008i f312k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0019u(C0020v c0020v, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f310i = c0020v;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f308g = obj;
        this.f309h |= Integer.MIN_VALUE;
        return this.f310i.b(null, this);
    }
}
