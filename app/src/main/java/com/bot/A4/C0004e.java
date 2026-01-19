package A4;

import b4.InterfaceC0905c;

/* renamed from: A4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0005f f248h;

    /* renamed from: i, reason: collision with root package name */
    public int f249i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004e(C0005f c0005f, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f248h = c0005f;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f247g = obj;
        this.f249i |= Integer.MIN_VALUE;
        return this.f248h.a(null, this);
    }
}
