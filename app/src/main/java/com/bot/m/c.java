package M;

import I0.S;
import android.view.View;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class c extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3133h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3134i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f3135j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.c f3136k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f3137l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f3138m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(S s5, l4.c cVar, e eVar, t tVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3135j = s5;
        this.f3136k = cVar;
        this.f3137l = eVar;
        this.f3138m = tVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        c cVar = new c(this.f3135j, this.f3136k, this.f3137l, this.f3138m, interfaceC0905c);
        cVar.f3134i = obj;
        return cVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        int i6 = this.f3133h;
        e eVar = this.f3137l;
        try {
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X3.a.e(obj);
                throw new RuntimeException();
            }
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f3134i;
            w wVar = x.a;
            S s5 = this.f3135j;
            View view = s5.f2242c;
            wVar.getClass();
            q qVar = new q(view);
            y yVar = new y(s5.f2242c, new b(this.f3138m), qVar);
            if (L.e.a) {
                AbstractC1888A.y(interfaceC1942y, null, new a(eVar, qVar, null), 3);
            }
            l4.c cVar = this.f3136k;
            if (cVar != null) {
                cVar.f(yVar);
            }
            eVar.f3145c = yVar;
            this.f3133h = 1;
            s5.a(yVar, this);
            return enumC0927a;
        } catch (Throwable th) {
            eVar.f3145c = null;
            throw th;
        }
    }
}
