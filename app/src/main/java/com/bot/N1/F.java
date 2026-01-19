package N1;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class F extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public B4.m f3649g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f3650h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3651i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B4.m f3652j;

    /* renamed from: k, reason: collision with root package name */
    public int f3653k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(B4.m mVar, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f3652j = mVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3651i = obj;
        this.f3653k |= Integer.MIN_VALUE;
        return this.f3652j.b(null, this);
    }
}
