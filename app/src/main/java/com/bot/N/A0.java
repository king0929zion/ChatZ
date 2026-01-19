package n;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import f0.C1001x;
import x4.C1928k;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class A0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public H4.c f12974h;

    /* renamed from: i, reason: collision with root package name */
    public N3.s f12975i;

    /* renamed from: j, reason: collision with root package name */
    public int f12976j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ N3.s f12977k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(N3.s sVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12977k = sVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((A0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new A0(this.f12977k, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X3.f] */
    @Override // d4.a
    public final Object r(Object obj) {
        N3.s sVar;
        H4.c cVar;
        int i6 = this.f12976j;
        if (i6 == 0) {
            X3.a.e(obj);
            sVar = this.f12977k;
            C1321e0 c1321e0 = (C1321e0) sVar;
            c1321e0.getClass();
            ((C1001x) C0.f12980b.getValue()).d(c1321e0, C0.a, c1321e0.f13139g);
            H4.c cVar2 = c1321e0.f13142j;
            this.f12974h = cVar2;
            this.f12975i = sVar;
            this.f12976j = 1;
            Object d6 = cVar2.d(this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (d6 == enumC0927a) {
                return enumC0927a;
            }
            cVar = cVar2;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = this.f12975i;
            cVar = this.f12974h;
            X3.a.e(obj);
        }
        try {
            ((C1321e0) sVar).f13136d = ((C1321e0) sVar).f13134b.getValue();
            C1928k c1928k = ((C1321e0) sVar).f13141i;
            if (c1928k != null) {
                c1928k.k(((C1321e0) sVar).f13134b.getValue());
            }
            ((C1321e0) sVar).f13141i = null;
            cVar.c(null);
            return X3.y.a;
        } catch (Throwable th) {
            cVar.c(null);
            throw th;
        }
    }
}
