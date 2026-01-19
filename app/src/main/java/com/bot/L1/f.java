package L1;

import Y3.m;
import a3.r;
import a3.w;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.O;
import java.util.ArrayList;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0844s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3005c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3006e;

    public /* synthetic */ f(Object obj, int i6) {
        this.f3005c = i6;
        this.f3006e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        switch (this.f3005c) {
            case 0:
                i iVar = (i) this.f3006e;
                iVar.f3030q = enumC0841o.a();
                if (iVar.f3016c != null) {
                    ArrayList K0 = m.K0(iVar.f3019f);
                    int size = K0.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = K0.get(i6);
                        i6++;
                        I1.j jVar = (I1.j) obj;
                        jVar.getClass();
                        c cVar = jVar.f2550k;
                        cVar.getClass();
                        cVar.a.f2546g = enumC0841o.a();
                        cVar.f2992d = enumC0841o.a();
                        cVar.b();
                    }
                    return;
                }
                return;
            case 1:
                ((l4.c) this.f3006e).f(enumC0841o);
                return;
            case 2:
                W1.a aVar = (W1.a) this.f3006e;
                if (enumC0841o == EnumC0841o.ON_START) {
                    aVar.f8857h = true;
                    return;
                } else {
                    if (enumC0841o == EnumC0841o.ON_STOP) {
                        aVar.f8857h = false;
                        return;
                    }
                    return;
                }
            default:
                w wVar = (w) this.f3006e;
                if (enumC0841o == EnumC0841o.ON_RESUME) {
                    wVar.getClass();
                    AbstractC1888A.y(O.i(wVar), null, new r(wVar, null), 3);
                    return;
                }
                return;
        }
    }
}
