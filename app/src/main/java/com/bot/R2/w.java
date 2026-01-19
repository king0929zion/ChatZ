package R2;

import T.X;
import com.bot.core.model.ConversationInfo;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import w0.InterfaceC1830a;

/* loaded from: classes.dex */
public final class w implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationInfo f7044c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1830a f7045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X f7046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X f7047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X f7048h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X f7049i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X f7050j;

    public w(ConversationInfo conversationInfo, InterfaceC1830a interfaceC1830a, X x5, X x6, X x7, X x8, X x9) {
        this.f7044c = conversationInfo;
        this.f7045e = interfaceC1830a;
        this.f7046f = x5;
        this.f7047g = x6;
        this.f7048h = x7;
        this.f7049i = x8;
        this.f7050j = x9;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        String str = (String) this.f7046f.getValue();
        ConversationInfo conversationInfo = this.f7044c;
        String str2 = conversationInfo.a;
        if (!AbstractC1276k.b(str, str2) && !AbstractC1276k.b((String) this.f7047g.getValue(), str2)) {
            this.f7045e.a(0);
            this.f7048h.setValue(conversationInfo);
            this.f7049i.setValue(conversationInfo.f11153b);
            this.f7050j.setValue(Boolean.TRUE);
        }
        return X3.y.a;
    }
}
