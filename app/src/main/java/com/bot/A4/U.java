package A4;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1922e0;

/* loaded from: classes.dex */
public final class U extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public V f206g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0008i f207h;

    /* renamed from: i, reason: collision with root package name */
    public X f208i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1922e0 f209j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f210k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V f211l;

    /* renamed from: m, reason: collision with root package name */
    public int f212m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v5, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f211l = v5;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f210k = obj;
        this.f212m |= Integer.MIN_VALUE;
        V.l(this.f211l, null, this);
        return EnumC0927a.f11114c;
    }
}
