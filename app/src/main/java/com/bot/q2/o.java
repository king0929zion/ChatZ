package Q2;

import T.C0626q;
import X3.y;
import b0.AbstractC0874g;
import com.bot.feature.settings.data.ModelConfig;
import java.util.List;
import l4.InterfaceC1193a;
import m.AbstractC1205L;
import m.AbstractC1244z;
import n.AbstractC1318d;
import v.C1814u;
import x.C1851b;

/* loaded from: classes.dex */
public final class o implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6445c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1814u f6446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f6447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f6448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.c f6449h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6450i;

    public o(List list, C1814u c1814u, boolean z5, String str, l4.c cVar, InterfaceC1193a interfaceC1193a) {
        this.f6445c = list;
        this.f6446e = c1814u;
        this.f6447f = z5;
        this.f6448g = str;
        this.f6449h = cVar;
        this.f6450i = interfaceC1193a;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i6;
        C1851b c1851b = (C1851b) obj;
        int intValue = ((Number) obj2).intValue();
        C0626q c0626q = (C0626q) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i6 = (c0626q.f(c1851b) ? 4 : 2) | intValue2;
        } else {
            i6 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i6 |= c0626q.d(intValue) ? 32 : 16;
        }
        if (c0626q.S(i6 & 1, (i6 & 147) != 146)) {
            ModelConfig modelConfig = (ModelConfig) this.f6445c.get(intValue);
            c0626q.b0(518192970);
            String str = modelConfig.f11264b;
            if (str == null) {
                str = modelConfig.a;
            }
            AbstractC1244z.b(this.f6446e, this.f6447f, null, AbstractC1205L.a(AbstractC1318d.s(180, 6, null), 14).a(AbstractC1205L.b(AbstractC1318d.s(180, 6, null), 2)), AbstractC1205L.d(AbstractC1318d.s(160, 6, null), 14).a(AbstractC1205L.c(AbstractC1318d.s(160, 6, null), 2)), null, AbstractC0874g.c(-116528027, new n(modelConfig, str, this.f6448g, this.f6449h, this.f6450i), c0626q), c0626q, 1600512, 18);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        return y.a;
    }
}
