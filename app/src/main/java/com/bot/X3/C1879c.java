package x3;

import Q4.t;
import X3.y;
import b4.InterfaceC0905c;
import b4.InterfaceC0908f;
import c4.EnumC0927a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import m4.AbstractC1276k;
import x4.C1940w;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1879c extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f15604h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1883g f15605i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879c(C1883g c1883g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15605i = c1883g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1879c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1879c(this.f15605i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Iterator it;
        C1883g c1883g = this.f15605i;
        Map map = c1883g.f15624k;
        int i6 = this.f15604h;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                InterfaceC0908f r5 = c1883g.f15622i.r(C1940w.f15731e);
                AbstractC1276k.c(r5);
                this.f15604h = 1;
                Object Q5 = ((InterfaceC1922e0) r5).Q(this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (Q5 == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X3.a.e(obj);
            }
            while (it.hasNext()) {
                t tVar = (t) ((Map.Entry) it.next()).getValue();
                tVar.f6606e.j();
                ((ThreadPoolExecutor) tVar.f6605c.d()).shutdown();
            }
            return y.a;
        } finally {
            it = map.entrySet().iterator();
            while (it.hasNext()) {
                t tVar2 = (t) ((Map.Entry) it.next()).getValue();
                tVar2.f6606e.j();
                ((ThreadPoolExecutor) tVar2.f6605c.d()).shutdown();
            }
        }
    }
}
