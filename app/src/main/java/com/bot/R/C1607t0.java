package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n0.C1353b;
import x4.InterfaceC1942y;

/* renamed from: r.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1607t0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14477h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14478i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1613v0 f14479j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f14480k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1607t0(C1613v0 c1613v0, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14479j = c1613v0;
        this.f14480k = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1607t0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1607t0 c1607t0 = new C1607t0(this.f14479j, this.f14480k, interfaceC0905c);
        c1607t0.f14478i = obj;
        return c1607t0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14477h;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f14478i;
            l4.f fVar = this.f14479j.f14494O;
            C1353b c1353b = new C1353b(this.f14480k);
            this.f14477h = 1;
            Object d6 = fVar.d(interfaceC1942y, c1353b, this);
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
