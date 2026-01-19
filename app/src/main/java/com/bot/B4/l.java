package B4;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class l extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public m f600g;

    /* renamed from: h, reason: collision with root package name */
    public Object f601h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f602i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f603j;

    /* renamed from: k, reason: collision with root package name */
    public int f604k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f603j = mVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f602i = obj;
        this.f604k |= Integer.MIN_VALUE;
        return this.f603j.a(null, this);
    }
}
