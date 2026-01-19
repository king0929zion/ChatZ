package J1;

import T.G;
import androidx.lifecycle.InterfaceC0846u;
import f0.C0996s;
import java.util.Map;
import k.M;
import l4.InterfaceC1193a;
import m.C1237s;

/* loaded from: classes.dex */
public final class n implements G {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2848d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i6) {
        this.a = i6;
        this.f2846b = obj;
        this.f2847c = obj2;
        this.f2848d = obj3;
    }

    @Override // T.G
    public final void dispose() {
        switch (this.a) {
            case 0:
                r rVar = (r) this.f2846b;
                I1.j jVar = (I1.j) this.f2847c;
                rVar.b().c(jVar);
                ((C0996s) this.f2848d).remove(jVar);
                return;
            case 1:
                ((InterfaceC1193a) this.f2846b).b();
                ((InterfaceC0846u) this.f2847c).g().j((L1.f) this.f2848d);
                return;
            case 2:
                e0.d dVar = (e0.d) this.f2846b;
                M m3 = dVar.f11554e;
                Object obj = this.f2847c;
                Object k3 = m3.k(obj);
                e0.i iVar = (e0.i) this.f2848d;
                if (k3 == iVar) {
                    Map map = dVar.f11553c;
                    Map c6 = iVar.c();
                    if (c6.isEmpty()) {
                        map.remove(obj);
                        return;
                    } else {
                        map.put(obj, c6);
                        return;
                    }
                }
                return;
            default:
                C0996s c0996s = (C0996s) this.f2848d;
                Object obj2 = this.f2846b;
                c0996s.remove(obj2);
                ((C1237s) this.f2847c).f12834e.k(obj2);
                return;
        }
    }

    public n(C0996s c0996s, Object obj, C1237s c1237s) {
        this.a = 3;
        this.f2848d = c0996s;
        this.f2846b = obj;
        this.f2847c = c1237s;
    }
}
