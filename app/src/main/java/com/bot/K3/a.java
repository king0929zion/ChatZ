package K3;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class a extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2921g;

    /* renamed from: h, reason: collision with root package name */
    public int f2922h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0008i f2923i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f2924j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f2924j = bVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f2921g = obj;
        this.f2922h |= Integer.MIN_VALUE;
        return this.f2924j.a(null, this);
    }
}
