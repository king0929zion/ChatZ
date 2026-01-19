package Q2;

import T.X;
import X3.y;
import Z2.a1;
import a3.C0811I;
import com.bot.core.model.LLMSetting;
import com.bot.core.model.McpServer;
import com.bot.feature.settings.data.ModelConfig;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class m implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6436c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6439g;

    public /* synthetic */ m(int i6, Object obj, Object obj2, l4.c cVar) {
        this.f6436c = i6;
        this.f6439g = obj;
        this.f6437e = obj2;
        this.f6438f = cVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f6436c) {
            case 0:
                ((l4.c) this.f6438f).f(((ModelConfig) this.f6439g).a);
                ((InterfaceC1193a) this.f6437e).b();
                return y.a;
            case 1:
                ((InterfaceC1193a) this.f6437e).b();
                ((X) this.f6439g).setValue((LLMSetting) this.f6438f);
                return y.a;
            case 2:
                X x5 = (X) this.f6437e;
                if (((String) x5.getValue()) != null) {
                    x5.setValue(null);
                } else {
                    String str = ((LLMSetting) this.f6439g).a;
                    if (str != null) {
                        ((l4.c) this.f6438f).f(str);
                    }
                }
                return y.a;
            case 3:
                ((InterfaceC1193a) this.f6437e).b();
                ((X) this.f6439g).setValue((McpServer) this.f6438f);
                return y.a;
            case 4:
                ((InterfaceC1193a) this.f6437e).b();
                ((l4.c) this.f6438f).f((String) this.f6439g);
                return y.a;
            default:
                C0811I c0811i = (C0811I) this.f6439g;
                a1 a1Var = (a1) this.f6437e;
                c0811i.e(a1Var.a);
                if (a1Var.f10146c) {
                    ((l4.c) this.f6438f).f(a1Var.a);
                }
                return y.a;
        }
    }

    public /* synthetic */ m(InterfaceC1193a interfaceC1193a, Object obj, Object obj2, int i6) {
        this.f6436c = i6;
        this.f6437e = interfaceC1193a;
        this.f6438f = obj;
        this.f6439g = obj2;
    }

    public m(l4.c cVar, ModelConfig modelConfig, InterfaceC1193a interfaceC1193a) {
        this.f6436c = 0;
        this.f6438f = cVar;
        this.f6439g = modelConfig;
        this.f6437e = interfaceC1193a;
    }
}
