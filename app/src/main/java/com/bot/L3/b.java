package L3;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class b extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3097g;

    /* renamed from: h, reason: collision with root package name */
    public int f3098h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0008i f3099i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K3.b f3100j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(K3.b bVar, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f3100j = bVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3097g = obj;
        this.f3098h |= Integer.MIN_VALUE;
        return this.f3100j.a(null, this);
    }
}
