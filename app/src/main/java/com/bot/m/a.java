package M;

import A4.C0016q;
import A4.N;
import A4.V;
import T.U;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import f0.C0990m;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class a extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3129h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f3130i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f3131j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, q qVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3130i = eVar;
        this.f3131j = qVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((a) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new a(this.f3130i, this.f3131j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3129h;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (i6 == 0) {
            X3.a.e(obj);
            C0990m c0990m = new C0990m(27);
            this.f3129h = 1;
            InterfaceC0910h interfaceC0910h = this.f11435e;
            AbstractC1276k.c(interfaceC0910h);
            if (T.r.w(interfaceC0910h).a(this, new U(c0990m, 0)) == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X3.a.e(obj);
                throw new RuntimeException();
            }
            X3.a.e(obj);
        }
        N i7 = this.f3130i.i();
        if (i7 == null) {
            return X3.y.a;
        }
        C0016q c0016q = new C0016q(this.f3131j, 3);
        this.f3129h = 2;
        V.l((V) i7, c0016q, this);
        return enumC0927a;
    }
}
