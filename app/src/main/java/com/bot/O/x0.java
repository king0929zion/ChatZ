package O;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n0.C1353b;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4244c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f4245e;

    public /* synthetic */ x0(int i6, InterfaceC1193a interfaceC1193a) {
        this.f4244c = i6;
        this.f4245e = interfaceC1193a;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f4244c;
        X3.y yVar = X3.y.a;
        InterfaceC1193a interfaceC1193a = this.f4245e;
        switch (i6) {
            case 0:
                return (C1353b) interfaceC1193a.b();
            case 1:
                return (C1353b) interfaceC1193a.b();
            case 2:
                interfaceC1193a.b();
                return yVar;
            case 3:
                interfaceC1193a.b();
                return yVar;
            case 4:
                P0.x xVar = (P0.x) obj;
                Object b5 = interfaceC1193a.b();
                if (Float.isNaN(((Number) b5).floatValue())) {
                    b5 = null;
                }
                Float f6 = (Float) b5;
                P0.h hVar = new P0.h(f6 != null ? f6.floatValue() : 0.0f, new r4.d(S.l.f7374V, 1.0f), 0);
                s4.e[] eVarArr = P0.v.a;
                P0.w wVar = P0.t.f4524c;
                s4.e eVar = P0.v.a[1];
                xVar.a(wVar, hVar);
                return yVar;
            case AbstractC1787b.f15290g /* 5 */:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) interfaceC1193a.b()).floatValue());
            case 6:
                Map map = (Map) obj;
                AbstractC1276k.f(map, "permissions");
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            return yVar;
                        }
                    }
                }
                interfaceC1193a.b();
                return yVar;
            default:
                interfaceC1193a.b();
                return yVar;
        }
    }
}
