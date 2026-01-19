package M2;

import A4.g0;
import Y3.B;
import Y3.C;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.Map;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f3381i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3382j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3381i = tVar;
        this.f3382j = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((r) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new r(this.f3381i, this.f3382j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Object value;
        Map e02;
        int i6 = this.f3380h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f3380h = 1;
            Object m3 = AbstractC1888A.m(1000L, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (m3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        g0 g0Var = this.f3381i.f3400d;
        do {
            value = g0Var.getValue();
            Map map = (Map) value;
            AbstractC1276k.f(map, "<this>");
            e02 = B.e0(map);
            e02.remove(this.f3382j);
            int size = e02.size();
            if (size == 0) {
                e02 = Y3.w.f9813c;
            } else if (size == 1) {
                e02 = C.V(e02);
            }
        } while (!g0Var.j(value, e02));
        return X3.y.a;
    }
}
