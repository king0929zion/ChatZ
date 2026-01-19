package A4;

import B4.AbstractC0050c;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class M implements InterfaceC0007h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f196c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h f197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X3.e f199g;

    /* JADX WARN: Multi-variable type inference failed */
    public M(InterfaceC0007h interfaceC0007h, InterfaceC0007h interfaceC0007h2, l4.f fVar) {
        this.f197e = interfaceC0007h;
        this.f198f = interfaceC0007h2;
        this.f199g = (d4.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l4.f, d4.i] */
    @Override // A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        int i6 = this.f196c;
        X3.y yVar = X3.y.a;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        X3.e eVar = this.f199g;
        Object obj = this.f198f;
        InterfaceC0007h interfaceC0007h = this.f197e;
        switch (i6) {
            case 0:
                Object a = AbstractC0050c.a(interfaceC0008i, interfaceC0905c, new L((l4.f) eVar, (InterfaceC0905c) null), new InterfaceC0007h[]{interfaceC0007h, (InterfaceC0007h) obj});
                return a == enumC0927a ? a : yVar;
            default:
                Object b5 = interfaceC0007h.b(new C0024z(interfaceC0008i, (N1.v) obj, (l4.c) eVar), interfaceC0905c);
                return b5 == enumC0927a ? b5 : yVar;
        }
    }

    public M(InterfaceC0007h interfaceC0007h, N1.v vVar, l4.c cVar) {
        this.f197e = interfaceC0007h;
        this.f198f = vVar;
        this.f199g = cVar;
    }
}
