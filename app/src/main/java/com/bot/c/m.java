package c;

import A4.C0003d;
import A4.C0020v;
import B0.C0033i;
import Q.C0480w2;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.C1283r;
import x4.InterfaceC1942y;
import z4.C2057h;

/* loaded from: classes.dex */
public final class m extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C1283r f11084h;

    /* renamed from: i, reason: collision with root package name */
    public int f11085i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f11086j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.e f11087k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0033i f11088l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, l4.e eVar, C0033i c0033i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f11086j = nVar;
        this.f11087k = eVar;
        this.f11088l = c0033i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((m) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new m(this.f11086j, this.f11087k, this.f11088l, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [m4.r, java.lang.Object] */
    @Override // d4.a
    public final Object r(Object obj) {
        C1283r c1283r;
        int i6 = this.f11085i;
        boolean z5 = true;
        if (i6 == 0) {
            X3.a.e(obj);
            if (this.f11086j.a) {
                Object obj2 = new Object();
                C0020v c0020v = new C0020v(new C0003d((C2057h) this.f11088l.f453e, z5), new C0480w2(obj2, null, 1));
                this.f11084h = obj2;
                this.f11085i = 1;
                Object m3 = this.f11087k.m(c0020v, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                c1283r = obj2;
                if (m3 == enumC0927a) {
                    return enumC0927a;
                }
            }
            return y.a;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1283r c1283r2 = this.f11084h;
        X3.a.e(obj);
        c1283r = c1283r2;
        if (!c1283r.f12968c) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return y.a;
    }
}
