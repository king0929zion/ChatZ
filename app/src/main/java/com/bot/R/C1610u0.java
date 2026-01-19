package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: r.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1610u0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14484h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14485i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1613v0 f14486j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1543U f14487k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610u0(C1613v0 c1613v0, C1543U c1543u, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14486j = c1613v0;
        this.f14487k = c1543u;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1610u0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1610u0 c1610u0 = new C1610u0(this.f14486j, this.f14487k, interfaceC0905c);
        c1610u0.f14485i = obj;
        return c1610u0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14484h;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f14485i;
            C1613v0 c1613v0 = this.f14486j;
            l4.f fVar = c1613v0.f14495P;
            long f6 = e1.q.f(c1613v0.f14496Q ? -1.0f : 1.0f, this.f14487k.a);
            X0 x02 = c1613v0.f14492M;
            C1598q0 c1598q0 = AbstractC1601r0.a;
            Float f7 = new Float(x02 == X0.f14183c ? e1.q.c(f6) : e1.q.b(f6));
            this.f14484h = 1;
            Object d6 = fVar.d(interfaceC1942y, f7, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (d6 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
