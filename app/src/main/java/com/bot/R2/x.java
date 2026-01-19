package R2;

import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.X;
import T.d1;
import X2.C0692g;
import com.bot.core.model.ConversationInfo;
import java.util.Set;
import l4.InterfaceC1193a;
import m.InterfaceC1194A;
import m4.AbstractC1276k;
import w0.InterfaceC1830a;

/* loaded from: classes.dex */
public final class x implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationInfo f7051c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X2.L f7053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f7054g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0692g f7055h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1830a f7056i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X f7057j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d1 f7058k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X f7059l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f7060m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X f7061n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X f7062o;

    public x(ConversationInfo conversationInfo, String str, X2.L l3, InterfaceC1193a interfaceC1193a, C0692g c0692g, InterfaceC1830a interfaceC1830a, X x5, d1 d1Var, X x6, X x7, X x8, X x9) {
        this.f7051c = conversationInfo;
        this.f7052e = str;
        this.f7053f = l3;
        this.f7054g = interfaceC1193a;
        this.f7055h = c0692g;
        this.f7056i = interfaceC1830a;
        this.f7057j = x5;
        this.f7058k = d1Var;
        this.f7059l = x6;
        this.f7060m = x7;
        this.f7061n = x8;
        this.f7062o = x9;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0626q c0626q = (C0626q) obj2;
        ((Number) obj3).intValue();
        AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
        ConversationInfo conversationInfo = this.f7051c;
        String str = conversationInfo.a;
        boolean b5 = AbstractC1276k.b(str, this.f7052e);
        boolean b6 = AbstractC1276k.b((String) this.f7057j.getValue(), str);
        boolean contains = ((Set) this.f7058k.getValue()).contains(str);
        boolean h3 = c0626q.h(conversationInfo) | c0626q.h(this.f7053f) | c0626q.f(this.f7054g) | c0626q.h(this.f7055h);
        Object P5 = c0626q.P();
        C0602e c0602e = C0616l.a;
        if (h3 || P5 == c0602e) {
            v vVar = new v(conversationInfo, this.f7053f, this.f7054g, this.f7055h, this.f7057j, this.f7059l);
            c0626q.m0(vVar);
            P5 = vVar;
        }
        InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P5;
        boolean h6 = c0626q.h(conversationInfo) | c0626q.h(this.f7056i);
        Object P6 = c0626q.P();
        if (h6 || P6 == c0602e) {
            w wVar = new w(conversationInfo, this.f7056i, this.f7057j, this.f7059l, this.f7060m, this.f7061n, this.f7062o);
            c0626q.m0(wVar);
            P6 = wVar;
        }
        ConversationInfo.Companion companion = ConversationInfo.Companion;
        AbstractC0530j.a(conversationInfo, b5, b6, contains, interfaceC1193a, (InterfaceC1193a) P6, c0626q, 8);
        return X3.y.a;
    }
}
