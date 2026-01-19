package P2;

import Q.C0392a1;
import Q.C0396b1;
import Q.C0400c1;
import Q.C0405d2;
import Q.EnumC0409e2;
import T.d1;
import X2.C0691f;
import X2.C0692g;
import Z2.C0779u;
import a3.C0808F;
import a3.C0810H;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.bot.core.model.ConversationInfo;
import com.bot.core.model.LLMProvider;
import com.bot.core.model.LLMSetting;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1296E;
import n.C1297F;
import n.C1316c;
import n.C1327h0;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final /* synthetic */ class J0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4746c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4750h;

    public /* synthetic */ J0(Context context, String str, L2.c cVar, String str2) {
        this.f4746c = 0;
        this.f4747e = context;
        this.f4748f = str;
        this.f4750h = cVar;
        this.f4749g = str2;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        LLMProvider lLMProvider;
        switch (this.f4746c) {
            case 0:
                Context context = (Context) this.f4747e;
                String str = (String) this.f4748f;
                L2.c cVar = (L2.c) this.f4750h;
                String str2 = (String) this.f4749g;
                Object systemService = context.getSystemService("clipboard");
                AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, cVar.f3059c));
                Toast.makeText(context, str2, 0).show();
                break;
            case 1:
                C0405d2 c0405d2 = (C0405d2) this.f4747e;
                C1327h0 c1327h0 = (C1327h0) this.f4748f;
                C1327h0 c1327h02 = (C1327h0) this.f4749g;
                C1327h0 c1327h03 = (C1327h0) this.f4750h;
                c0405d2.f5768e = c1327h0;
                c0405d2.f5769f = c1327h02;
                c0405d2.f5766c = c1327h03;
                break;
            case 2:
                C0405d2 c0405d22 = (C0405d2) this.f4747e;
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f4748f;
                C1316c c1316c = (C1316c) this.f4749g;
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f4750h;
                if (((EnumC0409e2) c0405d22.f5767d.f6830g.getValue()) == EnumC0409e2.f5777e) {
                    if (c0405d22.f5767d.d().a.containsKey(EnumC0409e2.f5778f)) {
                        AbstractC1888A.y(interfaceC1942y, null, new C0392a1(c1316c, null), 3);
                        AbstractC1888A.y(interfaceC1942y, null, new C0396b1(c0405d22, null), 3);
                        return X3.y.a;
                    }
                }
                AbstractC1888A.y(interfaceC1942y, null, new C0400c1(c0405d22, null), 3).S(new O.x0(2, interfaceC1193a));
                return X3.y.a;
            case 3:
                T.X x5 = (T.X) this.f4747e;
                T.X x6 = (T.X) this.f4748f;
                C0692g c0692g = (C0692g) this.f4749g;
                T.X x7 = (T.X) this.f4750h;
                if (!AbstractC1776n.Q((String) x5.getValue())) {
                    ConversationInfo conversationInfo = (ConversationInfo) x6.getValue();
                    if (conversationInfo != null) {
                        String str3 = conversationInfo.a;
                        String str4 = (String) x5.getValue();
                        c0692g.getClass();
                        AbstractC1276k.f(str3, "conversationId");
                        AbstractC1276k.f(str4, "newTitle");
                        AbstractC1888A.y(androidx.lifecycle.O.i(c0692g), null, new C0691f(c0692g, str3, str4, null), 3);
                    }
                    x7.setValue(Boolean.FALSE);
                }
                return X3.y.a;
            case 4:
                String str5 = (String) this.f4748f;
                X2.L l3 = (X2.L) this.f4747e;
                C0692g c0692g2 = (C0692g) this.f4749g;
                d1 d1Var = (d1) this.f4750h;
                if (str5 != null) {
                    l3.f9222w.k(null);
                } else if (((String) d1Var.getValue()) != null) {
                    c0692g2.f9278i.k(null);
                }
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                InterfaceC1942y interfaceC1942y2 = (InterfaceC1942y) this.f4747e;
                T.X x8 = (T.X) this.f4748f;
                a3.w wVar = (a3.w) this.f4749g;
                T.X x9 = (T.X) this.f4750h;
                LLMSetting lLMSetting = (LLMSetting) x8.getValue();
                if ((lLMSetting != null ? lLMSetting.a : null) == null) {
                    x8.setValue(null);
                } else {
                    AbstractC1888A.y(interfaceC1942y2, null, new C0779u(wVar, lLMSetting, x9, x8, null), 3);
                }
                return X3.y.a;
            case 6:
                InterfaceC1942y interfaceC1942y3 = (InterfaceC1942y) this.f4747e;
                T.X x10 = (T.X) this.f4748f;
                T.X x11 = (T.X) this.f4749g;
                C0808F c0808f = (C0808F) this.f4750h;
                C0810H c0810h = (C0810H) x10.getValue();
                if (((c0810h == null || (lLMProvider = c0810h.a) == null) ? null : lLMProvider.a) == null) {
                    x10.setValue(null);
                } else if (c0810h.a.f11174j) {
                    x10.setValue(null);
                } else {
                    x11.setValue(Boolean.TRUE);
                    AbstractC1888A.y(interfaceC1942y3, null, new Z2.P0(c0808f, c0810h, x11, x10, null), 3);
                }
                return X3.y.a;
            case 7:
                G2.d dVar = (G2.d) this.f4748f;
                Context context2 = (Context) this.f4747e;
                T.X x12 = (T.X) this.f4749g;
                T.X x13 = (T.X) this.f4750h;
                G2.a aVar = (G2.a) x12.getValue();
                AbstractC1276k.f(aVar, "language");
                androidx.lifecycle.N n3 = i5.a.a;
                String str6 = aVar.f1651c;
                n3.getClass();
                androidx.lifecycle.N.k(new Object[0]);
                A4.g0 g0Var = dVar.f1656e;
                g0Var.getClass();
                g0Var.l(null, aVar);
                dVar.f1653b.encode("language", str6);
                androidx.lifecycle.N.k(new Object[0]);
                if (aVar == G2.a.f1647f) {
                    dVar.c();
                } else {
                    dVar.a(aVar.f1652e);
                }
                Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity != null) {
                    activity.recreate();
                }
                x13.setValue(Boolean.FALSE);
                break;
            default:
                Float f6 = (Float) this.f4747e;
                C1297F c1297f = (C1297F) this.f4748f;
                Float f7 = (Float) this.f4749g;
                C1296E c1296e = (C1296E) this.f4750h;
                if (!f6.equals(c1297f.f12989c) || !f7.equals(c1297f.f12990e)) {
                    c1297f.f12989c = f6;
                    c1297f.f12990e = f7;
                    c1297f.f12992g = new n.o0(c1296e, AbstractC1318d.f13114j, f6, f7, null);
                    c1297f.f12996k.f13005b.setValue(Boolean.TRUE);
                    c1297f.f12993h = false;
                    c1297f.f12994i = true;
                }
                return X3.y.a;
        }
        return X3.y.a;
    }

    public /* synthetic */ J0(Object obj, Object obj2, Object obj3, d1 d1Var, int i6) {
        this.f4746c = i6;
        this.f4748f = obj;
        this.f4747e = obj2;
        this.f4749g = obj3;
        this.f4750h = d1Var;
    }

    public /* synthetic */ J0(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f4746c = i6;
        this.f4747e = obj;
        this.f4748f = obj2;
        this.f4749g = obj3;
        this.f4750h = obj4;
    }
}
