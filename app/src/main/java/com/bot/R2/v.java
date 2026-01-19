package R2;

import T.X;
import X2.C0692g;
import com.bot.core.model.ConversationInfo;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class v implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationInfo f7038c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X2.L f7039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f7040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0692g f7041g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X f7042h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X f7043i;

    public v(ConversationInfo conversationInfo, X2.L l3, InterfaceC1193a interfaceC1193a, C0692g c0692g, X x5, X x6) {
        this.f7038c = conversationInfo;
        this.f7039e = l3;
        this.f7040f = interfaceC1193a;
        this.f7041g = c0692g;
        this.f7042h = x5;
        this.f7043i = x6;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        String str = (String) this.f7042h.getValue();
        String str2 = this.f7038c.a;
        if (!AbstractC1276k.b(str, str2) && !AbstractC1276k.b((String) this.f7043i.getValue(), str2)) {
            this.f7039e.o(str2);
            this.f7040f.b();
            this.f7041g.f(str2);
        }
        return X3.y.a;
    }
}
