package Q2;

import T.C0616l;
import T.C0626q;
import X3.y;
import com.bot.feature.settings.data.ModelConfig;
import l4.InterfaceC1193a;
import m.InterfaceC1194A;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class n implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelConfig f6440c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.c f6443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6444h;

    public n(ModelConfig modelConfig, String str, String str2, l4.c cVar, InterfaceC1193a interfaceC1193a) {
        this.f6440c = modelConfig;
        this.f6441e = str;
        this.f6442f = str2;
        this.f6443g = cVar;
        this.f6444h = interfaceC1193a;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0626q c0626q = (C0626q) obj2;
        ((Number) obj3).intValue();
        AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
        ModelConfig modelConfig = this.f6440c;
        String str = modelConfig.a;
        boolean b5 = AbstractC1276k.b(str, this.f6442f);
        l4.c cVar = this.f6443g;
        boolean f6 = c0626q.f(cVar) | c0626q.f(modelConfig);
        InterfaceC1193a interfaceC1193a = this.f6444h;
        boolean f7 = f6 | c0626q.f(interfaceC1193a);
        Object P5 = c0626q.P();
        if (f7 || P5 == C0616l.a) {
            P5 = new m(cVar, modelConfig, interfaceC1193a);
            c0626q.m0(P5);
        }
        a.a(str, this.f6441e, b5, (InterfaceC1193a) P5, c0626q, 0);
        return y.a;
    }
}
