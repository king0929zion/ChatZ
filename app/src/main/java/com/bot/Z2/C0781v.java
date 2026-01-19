package Z2;

import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bot.core.model.LLMSetting;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.C1045v;
import h0.InterfaceC1041r;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1316c;
import v.AbstractC1806l;
import v.C1810p;
import v.C1818y;
import w0.InterfaceC1830a;
import x.C1851b;
import x4.InterfaceC1942y;

/* renamed from: Z2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781v implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f10372c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f10373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f10374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T.X f10375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a3.w f10376h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.c f10377i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1830a f10378j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f10379k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.d1 f10380l;

    public C0781v(List list, B b5, InterfaceC1942y interfaceC1942y, T.X x5, a3.w wVar, l4.c cVar, InterfaceC1830a interfaceC1830a, T.X x6, T.d1 d1Var) {
        this.f10372c = list;
        this.f10373e = b5;
        this.f10374f = interfaceC1942y;
        this.f10375g = x5;
        this.f10376h = wVar;
        this.f10377i = cVar;
        this.f10378j = interfaceC1830a;
        this.f10379k = x6;
        this.f10380l = d1Var;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i6;
        boolean z5;
        float f6;
        InterfaceC1041r a;
        Object c0754h;
        InterfaceC1193a interfaceC1193a;
        Object obj5;
        T.X x5;
        T.X x6;
        String str;
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
            LLMSetting lLMSetting = (LLMSetting) this.f10372c.get(intValue);
            c0626q.b0(733678650);
            String str2 = lLMSetting.a;
            String str3 = str2 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : str2;
            float e02 = ((InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h)).e0(140);
            Object P5 = c0626q.P();
            Object obj6 = C0616l.a;
            if (P5 == obj6) {
                P5 = AbstractC1318d.a(S.l.f7374V);
                c0626q.m0(P5);
            }
            C1316c c1316c = (C1316c) P5;
            T.X x7 = this.f10375g;
            boolean b5 = AbstractC1276k.b((String) x7.getValue(), str3);
            String str4 = (String) x7.getValue();
            boolean g3 = c0626q.g(b5) | c0626q.h(c1316c);
            Object P6 = c0626q.P();
            if (g3 || P6 == obj6) {
                P6 = new C0748e(b5, c1316c, null);
                c0626q.m0(P6);
            }
            T.r.f(c0626q, str4, (l4.e) P6);
            B b6 = this.f10373e;
            b6.getClass();
            boolean b7 = AbstractC1276k.b((String) b6.f9893f.getValue(), str3);
            float floatValue = b7 ? ((Number) b6.f9894g.getValue()).floatValue() : S.l.f7374V;
            C1038o c1038o = C1038o.a;
            if (b7) {
                f6 = e02;
                a = c1038o;
                z5 = b7;
            } else {
                z5 = b7;
                f6 = e02;
                a = C1851b.a(c1851b, AbstractC1318d.r(1.0f, 400.0f, null, 4));
            }
            InterfaceC1942y interfaceC1942y = this.f10374f;
            boolean h3 = c0626q.h(interfaceC1942y) | c0626q.h(c1316c);
            Object P7 = c0626q.P();
            if (h3 || P7 == obj6) {
                P7 = new C0775s(interfaceC1942y, x7, c1316c, 0);
                c0626q.m0(P7);
            }
            InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P7;
            C1818y c1818y = v.t0.a;
            InterfaceC1041r c6 = c1818y.c(a).c(new C1045v(z5 ? 1.0f : S.l.f7374V));
            boolean c7 = c0626q.c(floatValue);
            Object P8 = c0626q.P();
            if (c7 || P8 == obj6) {
                P8 = new C0750f(floatValue, 0);
                c0626q.m0(P8);
            }
            InterfaceC1041r o5 = o0.y.o(c6, (l4.c) P8);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            String str5 = str3;
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q, o5);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a3 = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a3);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c8, C0150g.f1926d);
            InterfaceC1041r e6 = C1810p.f15333b.e(c1038o, C1026c.f11791i);
            boolean f7 = c0626q.f(interfaceC1193a2) | c0626q.f(lLMSetting) | c0626q.h(interfaceC1942y) | c0626q.h(this.f10376h);
            l4.c cVar = this.f10377i;
            boolean f8 = f7 | c0626q.f(cVar);
            Object P9 = c0626q.P();
            if (f8 || P9 == obj6) {
                interfaceC1193a = interfaceC1193a2;
                obj5 = obj6;
                x5 = x7;
                c0754h = new C0754h(interfaceC1193a, lLMSetting, this.f10374f, this.f10376h, this.f10377i);
                c0626q.m0(c0754h);
            } else {
                c0754h = P9;
                obj5 = obj6;
                interfaceC1193a = interfaceC1193a2;
                x5 = x7;
            }
            InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) c0754h;
            boolean f9 = c0626q.f(interfaceC1193a) | c0626q.f(lLMSetting);
            Object P10 = c0626q.P();
            if (f9 || P10 == obj5) {
                P10 = new Q2.m(interfaceC1193a, lLMSetting, this.f10379k, 1);
                c0626q.m0(P10);
            }
            AbstractC0783w.c(e6, interfaceC1193a4, (InterfaceC1193a) P10, c0626q, 0);
            boolean b8 = AbstractC1276k.b(str2, (String) this.f10380l.getValue());
            boolean h6 = c0626q.h(c1316c);
            Object P11 = c0626q.P();
            if (h6 || P11 == obj5) {
                P11 = new C0756i(c1316c, 0);
                c0626q.m0(P11);
            }
            InterfaceC1041r o6 = o0.y.o(c1818y, (l4.c) P11);
            InterfaceC1830a interfaceC1830a = this.f10378j;
            boolean h7 = c0626q.h(interfaceC1830a) | c0626q.h(b6) | c0626q.f(str5);
            Object P12 = c0626q.P();
            if (h7 || P12 == obj5) {
                P12 = new C0760k(interfaceC1830a, b6, str5, 0);
                c0626q.m0(P12);
            }
            InterfaceC1041r a6 = B0.Q.a(o6, str2, (PointerInputEventHandler) P12);
            float f10 = f6;
            boolean h8 = c0626q.h(interfaceC1942y) | c0626q.f(str5) | c0626q.h(c1316c) | c0626q.c(f10);
            Object P13 = c0626q.P();
            if (h8 || P13 == obj5) {
                T.X x8 = x5;
                Object c0772q = new C0772q(f10, 0, x8, str5, c1316c, this.f10374f);
                x6 = x8;
                str = str5;
                c0626q.m0(c0772q);
                P13 = c0772q;
            } else {
                x6 = x5;
                str = str5;
            }
            InterfaceC1041r a7 = B0.Q.a(a6, str, (PointerInputEventHandler) P13);
            boolean f11 = c0626q.f(lLMSetting) | c0626q.f(cVar);
            Object P14 = c0626q.P();
            if (f11 || P14 == obj5) {
                P14 = new Q2.m(2, lLMSetting, x6, cVar);
                c0626q.m0(P14);
            }
            AbstractC0783w.b(lLMSetting, b8, a7, (InterfaceC1193a) P14, c0626q, 0);
            c0626q.p(true);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
