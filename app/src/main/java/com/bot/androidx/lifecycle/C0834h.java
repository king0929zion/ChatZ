package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834h implements InterfaceC0844s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10872c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10873e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10874f;

    public C0834h(InterfaceC0832f interfaceC0832f, InterfaceC0844s interfaceC0844s) {
        AbstractC1276k.f(interfaceC0832f, "defaultLifecycleObserver");
        this.f10873e = interfaceC0832f;
        this.f10874f = interfaceC0844s;
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        switch (this.f10872c) {
            case 0:
                InterfaceC0832f interfaceC0832f = (InterfaceC0832f) this.f10873e;
                switch (AbstractC0833g.a[enumC0841o.ordinal()]) {
                    case 1:
                        interfaceC0832f.getClass();
                        break;
                    case 2:
                        interfaceC0832f.j(interfaceC0846u);
                        break;
                    case 3:
                        interfaceC0832f.c(interfaceC0846u);
                        break;
                    case 4:
                        interfaceC0832f.getClass();
                        break;
                    case AbstractC1787b.f15290g /* 5 */:
                        interfaceC0832f.f(interfaceC0846u);
                        break;
                    case 6:
                        interfaceC0832f.h(interfaceC0846u);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new RuntimeException();
                }
                InterfaceC0844s interfaceC0844s = (InterfaceC0844s) this.f10874f;
                if (interfaceC0844s != null) {
                    interfaceC0844s.d(interfaceC0846u, enumC0841o);
                    return;
                }
                return;
            case 1:
                if (enumC0841o == EnumC0841o.ON_START) {
                    ((O) this.f10873e).j(this);
                    ((M.q) this.f10874f).v();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0828b) this.f10874f).a;
                List list = (List) hashMap.get(enumC0841o);
                Object obj = this.f10873e;
                C0828b.a(list, interfaceC0846u, enumC0841o, obj);
                C0828b.a((List) hashMap.get(EnumC0841o.ON_ANY), interfaceC0846u, enumC0841o, obj);
                return;
        }
    }

    public C0834h(InterfaceC0845t interfaceC0845t) {
        this.f10873e = interfaceC0845t;
        C0830d c0830d = C0830d.f10868c;
        Class<?> cls = interfaceC0845t.getClass();
        C0828b c0828b = (C0828b) c0830d.a.get(cls);
        this.f10874f = c0828b == null ? c0830d.a(cls, null) : c0828b;
    }

    public C0834h(M.q qVar, O o5) {
        this.f10873e = o5;
        this.f10874f = qVar;
    }
}
