package b3;

import X3.y;
import b4.InterfaceC0905c;

/* renamed from: b3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893i extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ int f11033h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.c f11034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0893i(InterfaceC0905c interfaceC0905c, l4.c cVar) {
        super(2, interfaceC0905c);
        this.f11034i = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0893i c0893i = (C0893i) p((InterfaceC0905c) obj2, Integer.valueOf(((Number) obj).intValue()));
        y yVar = y.a;
        c0893i.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0893i c0893i = new C0893i(interfaceC0905c, this.f11034i);
        c0893i.f11033h = ((Number) obj).intValue();
        return c0893i;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f11033h;
        X3.a.e(obj);
        this.f11034i.f(new Integer(i6));
        return y.a;
    }
}
