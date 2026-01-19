package X2;

import b4.InterfaceC0905c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class z extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Map f9382h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ String f9383i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f9384j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(L l3, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f9384j = l3;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        z zVar = new z(this.f9384j, (InterfaceC0905c) obj3);
        zVar.f9382h = (Map) obj;
        zVar.f9383i = (String) obj2;
        return zVar.r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Map map = this.f9382h;
        String str = this.f9383i;
        X3.a.e(obj);
        M2.A a = (M2.A) map.get(str);
        L2.e eVar = a != null ? a.f3272e : null;
        L l3 = this.f9384j;
        boolean g3 = L.g(l3, eVar);
        Collection values = map.values();
        boolean z5 = false;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (L.g(l3, ((M2.A) it.next()).f3272e)) {
                    z5 = true;
                    break;
                }
            }
        }
        return new X3.i(Boolean.valueOf(g3), Boolean.valueOf(z5));
    }
}
