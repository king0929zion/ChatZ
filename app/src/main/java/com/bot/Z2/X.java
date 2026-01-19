package Z2;

import D.C0074j;
import D2.d;
import I1.B;
import I1.C0225d;
import I1.C0228g;
import I1.C0229h;
import I1.j;
import Q.B2;
import Q.C2;
import R.C0513s;
import T.C0599c0;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import X2.C0692g;
import X2.L;
import X2.Y;
import X3.y;
import Y3.C;
import Y4.l;
import Z2.AbstractC0783w;
import a3.C0808F;
import a3.C0811I;
import a3.C0818g;
import a3.w;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.InterfaceC0837k;
import androidx.lifecycle.U;
import androidx.lifecycle.a0;
import b0.C0873f;
import b3.AbstractC0897m;
import com.bot.core.database.dao.ConversationDao_Impl;
import com.bot.core.database.dao.LLMProviderDao_Impl;
import com.bot.core.database.entity.ConversationEntity;
import com.bot.core.database.entity.LLMProviderEntity;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e0.InterfaceC0958c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l4.InterfaceC1193a;
import m.C1230l;
import m4.AbstractC1276k;
import n.C1297F;
import n.C1300I;
import n0.C1353b;
import o0.AbstractC1404o;
import o0.C1383E;
import o0.C1397h;
import o3.e;
import q0.InterfaceC1498d;
import r.AbstractC1601r0;
import r.B1;
import r.C1509A;
import r.C1541S;
import r.C1588n;
import r.C1598q0;
import r.C1603s;
import r.C1609u;
import r.C1613v0;
import r.E1;
import r.h2;
import t.C1682j;
import t.C1683k;
import t.InterfaceC1681i;
import v.AbstractC1787b;
import v.C1792d0;
import v.C1796f0;
import v.C1800h0;
import x4.AbstractC1888A;
import x4.C1933p;
import x4.InterfaceC1942y;
import y.C1964d;
import y.C1965e;
import y4.C1998d;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10119c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10121f;

    public /* synthetic */ X(int i6, Object obj, Object obj2) {
        this.f10119c = i6;
        this.f10120e = obj;
        this.f10121f = obj2;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        X3.y upsertAll$lambda$1;
        X3.y upsert$lambda$0;
        int i6 = this.f10119c;
        int i7 = 12;
        final int i8 = 10;
        int i9 = 11;
        r.X0 x02 = r.X0.f14183c;
        final int i10 = 2;
        final int i11 = 0;
        final int i12 = 1;
        X3.y yVar = X3.y.a;
        Object obj2 = this.f10121f;
        Object obj3 = this.f10120e;
        switch (i6) {
            case 0:
                a3.w wVar = (a3.w) obj3;
                Context context = (Context) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        context.getContentResolver().takePersistableUriPermission(uri, 1);
                    } catch (Throwable th) {
                        X3.a.b(th);
                    }
                    wVar.f10718Q.k(uri.toString());
                    A4.g0 g0Var = wVar.f10726Y;
                    Boolean bool = Boolean.TRUE;
                    g0Var.getClass();
                    g0Var.l(null, bool);
                }
                return yVar;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((l4.e) obj3).m((List) obj2, bool2);
                return yVar;
            case 2:
                C0599c0 c0599c0 = (C0599c0) obj3;
                T.X x5 = (T.X) obj2;
                T.B b5 = AbstractC0897m.a;
                c0599c0.h(c0599c0.g() <= 1.0f ? 2.0f : 1.0f);
                x5.setValue(new C1353b(0L));
                return yVar;
            case 3:
                final I1.B b6 = (I1.B) obj3;
                final G2.d dVar = (G2.d) obj2;
                I1.y yVar2 = (I1.y) obj;
                AbstractC1276k.f(yVar2, "$this$NavHost");
                final int i13 = 7;
                h5.e.K(yVar2, "main", null, new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i13) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i14 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj8) {
                                            switch (i14) {
                                                case 0:
                                                    String str = (String) obj8;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj8;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj8;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj8;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj8;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj8;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i15 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i15) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i16 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i16) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar2 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar, cVar2, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i17 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i17) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i18 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i18) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i19 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i19) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, 1259990844), 254);
                h5.e.K(yVar2, "model-config", null, new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i11) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i14 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i14) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i15 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i15) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i16 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i16) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar2 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar, cVar2, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i17 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i17) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i18 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i18) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i19 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i19) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, -794711195), 254);
                A3.c cVar = new A3.c(9, (byte) 0);
                cVar.r();
                C0225d c0225d = (C0225d) ((A3.c) cVar.f119e).f119e;
                C0225d c0225d2 = I1.F.f2535d;
                if (c0225d == null) {
                    c0225d = c0225d2;
                }
                h5.e.K(yVar2, "model-config/{botId}", Y4.l.H(new C0228g("botId", new C0229h(c0225d))), new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i12) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i14 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i14) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i15 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i15) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar2 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i16 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i16) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar22 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar2, cVar22, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i17 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i17) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i18 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i18) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i19 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i19) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, 1843249860), 252);
                h5.e.K(yVar2, "model-services", null, new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i10) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i14 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i14) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i15 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i15) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar2 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i16 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i16) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar22 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar2, cVar22, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i17 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i17) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i18 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i18) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i19 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i19) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, 186243619), 254);
                final int i14 = 3;
                h5.e.K(yVar2, "model-services/new", null, new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i14) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i142 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i142) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i15 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i15) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar2 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i16 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i16) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar22 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar2, cVar22, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i17 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i17) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i18 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i18) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i19 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i19) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, -1470762622), 254);
                final int i15 = 4;
                h5.e.K(yVar2, "search-services", null, new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i15) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i142 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i142) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i152 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i152) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar2 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i16 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i16) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar22 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar2, cVar22, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i17 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i17) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i18 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i18) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i19 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i19) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, 1167198433), 254);
                A3.c cVar2 = new A3.c(9, (byte) 0);
                cVar2.r();
                C0225d c0225d3 = (C0225d) ((A3.c) cVar2.f119e).f119e;
                if (c0225d3 == null) {
                    c0225d3 = c0225d2;
                }
                final int i16 = 5;
                h5.e.K(yVar2, "search-services/{serviceId}", Y4.l.H(new C0228g("serviceId", new C0229h(c0225d3))), new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i16) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i142 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i142) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i152 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i152) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar22 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i162 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i162) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar222 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar22, cVar222, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i17 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i17) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i18 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i18) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i19 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i19) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, -489807808), 252);
                final int i17 = 6;
                h5.e.K(yVar2, "mcp", null, new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i17) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i142 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i142) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i152 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i152) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar22 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i162 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i162) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar222 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar22, cVar222, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i172 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i172) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i18 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i18) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i19 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i19) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, -2146814049), 254);
                final int i18 = 8;
                h5.e.K(yVar2, "mcp/add", null, new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i18) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i142 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i142) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i152 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i152) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar22 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i162 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i162) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar222 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar22, cVar222, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i172 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i172) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i182 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i182) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i19 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i19) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, 491147006), 254);
                A3.c cVar3 = new A3.c(9, (byte) 0);
                cVar3.r();
                C0225d c0225d4 = (C0225d) ((A3.c) cVar3.f119e).f119e;
                if (c0225d4 == null) {
                    c0225d4 = c0225d2;
                }
                final int i19 = 9;
                h5.e.K(yVar2, "mcp/edit/{serverId}", Y4.l.H(new C0228g("serverId", new C0229h(c0225d4))), new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i19) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i142 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i142) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i152 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i152) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar22 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i162 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i162) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar222 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar22, cVar222, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i172 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i172) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i182 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i182) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i192 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i192) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, -1165859235), 252);
                h5.e.K(yVar2, "model-services/search", null, new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i8) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i142 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i142) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i152 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i152) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar22 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i162 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i162) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar222 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar22, cVar222, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i172 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i172) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i182 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i182) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i192 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i192) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, -896142607), 254);
                A3.c cVar4 = new A3.c(9, (byte) 0);
                cVar4.r();
                C0225d c0225d5 = (C0225d) ((A3.c) cVar4.f119e).f119e;
                if (c0225d5 != null) {
                    c0225d2 = c0225d5;
                }
                final int i20 = 11;
                h5.e.K(yVar2, "model-services/{providerId}", Y4.l.H(new C0228g("providerId", new C0229h(c0225d2))), new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i20) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i142 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i142) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i152 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i152) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar22 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i162 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i162) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar222 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar22, cVar222, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i172 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i172) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i182 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i182) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i192 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i192) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, 1741818448), 252);
                h5.e.K(yVar2, "setting", null, new C0873f(new l4.g() { // from class: c3.c
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C0626q c0626q = (C0626q) obj6;
                        ((Integer) obj7).getClass();
                        AbstractC1276k.f((C1230l) obj4, "$this$composable");
                        AbstractC1276k.f((j) obj5, "$unused$var$");
                        B b7 = B.this;
                        boolean h3 = c0626q.h(b7);
                        Object P5 = c0626q.P();
                        Object obj8 = C0616l.a;
                        if (h3 || P5 == obj8) {
                            P5 = new I1.l(b7, 3);
                            c0626q.m0(P5);
                        }
                        InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P5;
                        boolean h6 = c0626q.h(b7);
                        Object P6 = c0626q.P();
                        if (h6 || P6 == obj8) {
                            P6 = new I1.l(b7, 4);
                            c0626q.m0(P6);
                        }
                        InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P6;
                        boolean h7 = c0626q.h(b7);
                        Object P7 = c0626q.P();
                        if (h7 || P7 == obj8) {
                            P7 = new I1.l(b7, 5);
                            c0626q.m0(P7);
                        }
                        InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P7;
                        boolean h8 = c0626q.h(b7);
                        Object P8 = c0626q.P();
                        if (h8 || P8 == obj8) {
                            P8 = new I1.l(b7, 6);
                            c0626q.m0(P8);
                        }
                        InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P8;
                        boolean h9 = c0626q.h(b7);
                        Object P9 = c0626q.P();
                        if (h9 || P9 == obj8) {
                            P9 = new I1.l(b7, 7);
                            c0626q.m0(P9);
                        }
                        InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P9;
                        boolean h10 = c0626q.h(b7);
                        Object P10 = c0626q.P();
                        if (h10 || P10 == obj8) {
                            P10 = new I1.l(b7, 8);
                            c0626q.m0(P10);
                        }
                        AbstractC0783w.N(interfaceC1193a, interfaceC1193a2, interfaceC1193a3, interfaceC1193a4, interfaceC1193a5, (InterfaceC1193a) P10, dVar, c0626q, PegdownExtensions.TASKLISTITEMS);
                        return y.a;
                    }
                }, true, 84812207), 254);
                final int i21 = 12;
                h5.e.K(yVar2, "about", null, new C0873f(new l4.g() { // from class: c3.a
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // l4.g
                    public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                        C1230l c1230l = (C1230l) obj4;
                        j jVar = (j) obj5;
                        switch (i21) {
                            case 0:
                                C0626q c0626q = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f6 = c0626q.f(jVar);
                                Object P5 = c0626q.P();
                                final B b7 = b6;
                                C0602e c0602e = C0616l.a;
                                if (f6 || P5 == c0602e) {
                                    P5 = b7.a("main");
                                    c0626q.m0(P5);
                                }
                                j jVar2 = (j) P5;
                                c0626q.c0(1890788296);
                                e u5 = l.u(jVar2, c0626q);
                                c0626q.c0(1729797275);
                                U W5 = C.W(w.class, jVar2, u5, jVar2 != null ? jVar2.d() : F1.a.f1544b, c0626q);
                                c0626q.p(false);
                                c0626q.p(false);
                                w wVar2 = (w) W5;
                                boolean h3 = c0626q.h(b7);
                                Object P6 = c0626q.P();
                                if (h3 || P6 == c0602e) {
                                    P6 = new I1.l(b7, 22);
                                    c0626q.m0(P6);
                                }
                                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                boolean h6 = c0626q.h(b7);
                                Object P7 = c0626q.P();
                                if (h6 || P7 == c0602e) {
                                    final int i142 = 4;
                                    P7 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i142) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b7, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b7, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b7, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b7, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b7, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b7, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q.m0(P7);
                                }
                                AbstractC0783w.A(wVar2, interfaceC1193a, (l4.c) P7, c0626q, 8);
                                return y.a;
                            case 1:
                                C0626q c0626q2 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a = jVar.f2550k.a();
                                String string = a != null ? a.getString("botId") : null;
                                if (string == null) {
                                    string = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f7 = c0626q2.f(jVar);
                                Object P8 = c0626q2.P();
                                B b8 = b6;
                                C0602e c0602e2 = C0616l.a;
                                if (f7 || P8 == c0602e2) {
                                    P8 = b8.a("main");
                                    c0626q2.m0(P8);
                                }
                                j jVar3 = (j) P8;
                                c0626q2.c0(1890788296);
                                e u6 = l.u(jVar3, c0626q2);
                                c0626q2.c0(1729797275);
                                U W6 = C.W(w.class, jVar3, u6, jVar3 != null ? jVar3.d() : F1.a.f1544b, c0626q2);
                                c0626q2.p(false);
                                c0626q2.p(false);
                                w wVar3 = (w) W6;
                                boolean h7 = c0626q2.h(b8);
                                Object P9 = c0626q2.P();
                                if (h7 || P9 == c0602e2) {
                                    P9 = new I1.l(b8, 9);
                                    c0626q2.m0(P9);
                                }
                                AbstractC0783w.s(wVar3, string, (InterfaceC1193a) P9, c0626q2, 8);
                                return y.a;
                            case 2:
                                C0626q c0626q3 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q3.c0(1890788296);
                                a0 a6 = G1.a.a(c0626q3);
                                if (a6 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u7 = l.u(a6, c0626q3);
                                c0626q3.c0(1729797275);
                                U W7 = C.W(C0808F.class, a6, u7, a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b, c0626q3);
                                c0626q3.p(false);
                                c0626q3.p(false);
                                C0808F c0808f = (C0808F) W7;
                                final B b9 = b6;
                                boolean h8 = c0626q3.h(b9);
                                Object P10 = c0626q3.P();
                                Object obj8 = C0616l.a;
                                if (h8 || P10 == obj8) {
                                    P10 = new I1.l(b9, 17);
                                    c0626q3.m0(P10);
                                }
                                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P10;
                                boolean h9 = c0626q3.h(b9);
                                Object P11 = c0626q3.P();
                                if (h9 || P11 == obj8) {
                                    final int i152 = 1;
                                    P11 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i152) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P11);
                                }
                                l4.c cVar22 = (l4.c) P11;
                                boolean h10 = c0626q3.h(b9);
                                Object P12 = c0626q3.P();
                                if (h10 || P12 == obj8) {
                                    final int i162 = 2;
                                    P12 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i162) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b9, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b9, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b9, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b9, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b9, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b9, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q3.m0(P12);
                                }
                                l4.c cVar222 = (l4.c) P12;
                                boolean h11 = c0626q3.h(b9);
                                Object P13 = c0626q3.P();
                                if (h11 || P13 == obj8) {
                                    P13 = new I1.l(b9, 18);
                                    c0626q3.m0(P13);
                                }
                                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P13;
                                boolean h12 = c0626q3.h(b9);
                                Object P14 = c0626q3.P();
                                if (h12 || P14 == obj8) {
                                    P14 = new I1.l(b9, 19);
                                    c0626q3.m0(P14);
                                }
                                AbstractC0783w.E(c0808f, interfaceC1193a2, cVar22, cVar222, interfaceC1193a3, (InterfaceC1193a) P14, c0626q3, 8);
                                return y.a;
                            case 3:
                                C0626q c0626q4 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f8 = c0626q4.f(jVar);
                                Object P15 = c0626q4.P();
                                B b10 = b6;
                                Object obj9 = C0616l.a;
                                if (f8 || P15 == obj9) {
                                    P15 = b10.a("model-services");
                                    c0626q4.m0(P15);
                                }
                                j jVar4 = (j) P15;
                                c0626q4.c0(1890788296);
                                e u8 = l.u(jVar4, c0626q4);
                                c0626q4.c0(1729797275);
                                U W8 = C.W(C0808F.class, jVar4, u8, jVar4 != null ? jVar4.d() : F1.a.f1544b, c0626q4);
                                c0626q4.p(false);
                                c0626q4.p(false);
                                C0808F c0808f2 = (C0808F) W8;
                                boolean h13 = c0626q4.h(b10);
                                Object P16 = c0626q4.P();
                                if (h13 || P16 == obj9) {
                                    P16 = new I1.l(b10, 23);
                                    c0626q4.m0(P16);
                                }
                                AbstractC0783w.C(c0808f2, null, (InterfaceC1193a) P16, null, c0626q4, 56);
                                return y.a;
                            case 4:
                                C0626q c0626q5 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q5.c0(1890788296);
                                a0 a7 = G1.a.a(c0626q5);
                                if (a7 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u9 = l.u(a7, c0626q5);
                                c0626q5.c0(1729797275);
                                U W9 = C.W(C0811I.class, a7, u9, a7 instanceof InterfaceC0837k ? ((InterfaceC0837k) a7).d() : F1.a.f1544b, c0626q5);
                                c0626q5.p(false);
                                c0626q5.p(false);
                                C0811I c0811i = (C0811I) W9;
                                final B b11 = b6;
                                boolean h14 = c0626q5.h(b11);
                                Object P17 = c0626q5.P();
                                C0602e c0602e3 = C0616l.a;
                                if (h14 || P17 == c0602e3) {
                                    P17 = new I1.l(b11, 21);
                                    c0626q5.m0(P17);
                                }
                                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P17;
                                boolean h15 = c0626q5.h(b11);
                                Object P18 = c0626q5.P();
                                if (h15 || P18 == c0602e3) {
                                    final int i172 = 3;
                                    P18 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i172) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b11, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b11, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b11, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b11, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b11, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b11, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q5.m0(P18);
                                }
                                AbstractC0783w.M(c0811i, interfaceC1193a4, (l4.c) P18, c0626q5, 0);
                                return y.a;
                            case AbstractC1787b.f15290g /* 5 */:
                                C0626q c0626q6 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a8 = jVar.f2550k.a();
                                String string2 = a8 != null ? a8.getString("serviceId") : null;
                                D2.e.Companion.getClass();
                                D2.e a9 = d.a(string2);
                                boolean f9 = c0626q6.f(jVar);
                                Object P19 = c0626q6.P();
                                B b12 = b6;
                                C0602e c0602e4 = C0616l.a;
                                if (f9 || P19 == c0602e4) {
                                    P19 = b12.a("search-services");
                                    c0626q6.m0(P19);
                                }
                                j jVar5 = (j) P19;
                                c0626q6.c0(1890788296);
                                e u10 = l.u(jVar5, c0626q6);
                                c0626q6.c0(1729797275);
                                U W10 = C.W(C0811I.class, jVar5, u10, jVar5 != null ? jVar5.d() : F1.a.f1544b, c0626q6);
                                c0626q6.p(false);
                                c0626q6.p(false);
                                C0811I c0811i2 = (C0811I) W10;
                                boolean h16 = c0626q6.h(b12);
                                Object P20 = c0626q6.P();
                                if (h16 || P20 == c0602e4) {
                                    P20 = new I1.l(b12, 10);
                                    c0626q6.m0(P20);
                                }
                                AbstractC0783w.K(c0811i2, a9, (InterfaceC1193a) P20, c0626q6, 0);
                                return y.a;
                            case 6:
                                C0626q c0626q7 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q7.c0(1890788296);
                                a0 a10 = G1.a.a(c0626q7);
                                if (a10 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u11 = l.u(a10, c0626q7);
                                c0626q7.c0(1729797275);
                                U W11 = C.W(C0818g.class, a10, u11, a10 instanceof InterfaceC0837k ? ((InterfaceC0837k) a10).d() : F1.a.f1544b, c0626q7);
                                c0626q7.p(false);
                                c0626q7.p(false);
                                C0818g c0818g = (C0818g) W11;
                                final B b13 = b6;
                                boolean h17 = c0626q7.h(b13);
                                Object P21 = c0626q7.P();
                                Object obj10 = C0616l.a;
                                if (h17 || P21 == obj10) {
                                    P21 = new I1.l(b13, 11);
                                    c0626q7.m0(P21);
                                }
                                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P21;
                                boolean h18 = c0626q7.h(b13);
                                Object P22 = c0626q7.P();
                                if (h18 || P22 == obj10) {
                                    P22 = new I1.l(b13, 12);
                                    c0626q7.m0(P22);
                                }
                                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) P22;
                                boolean h19 = c0626q7.h(b13);
                                Object P23 = c0626q7.P();
                                if (h19 || P23 == obj10) {
                                    final int i182 = 0;
                                    P23 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i182) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b13, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b13, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b13, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b13, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b13, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b13, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q7.m0(P23);
                                }
                                AbstractC0783w.o(c0818g, interfaceC1193a5, interfaceC1193a6, (l4.c) P23, c0626q7, 8);
                                return y.a;
                            case 7:
                                C0626q c0626q8 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "it");
                                c0626q8.c0(1890788296);
                                a0 a11 = G1.a.a(c0626q8);
                                if (a11 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u12 = l.u(a11, c0626q8);
                                c0626q8.c0(1729797275);
                                U W12 = C.W(L.class, a11, u12, a11 instanceof InterfaceC0837k ? ((InterfaceC0837k) a11).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                L l3 = (L) W12;
                                c0626q8.c0(1890788296);
                                a0 a12 = G1.a.a(c0626q8);
                                if (a12 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u13 = l.u(a12, c0626q8);
                                c0626q8.c0(1729797275);
                                U W13 = C.W(w.class, a12, u13, a12 instanceof InterfaceC0837k ? ((InterfaceC0837k) a12).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                w wVar4 = (w) W13;
                                c0626q8.c0(1890788296);
                                a0 a13 = G1.a.a(c0626q8);
                                if (a13 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u14 = l.u(a13, c0626q8);
                                c0626q8.c0(1729797275);
                                U W14 = C.W(C0692g.class, a13, u14, a13 instanceof InterfaceC0837k ? ((InterfaceC0837k) a13).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                C0692g c0692g = (C0692g) W14;
                                c0626q8.c0(1890788296);
                                a0 a14 = G1.a.a(c0626q8);
                                if (a14 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                e u15 = l.u(a14, c0626q8);
                                c0626q8.c0(1729797275);
                                U W15 = C.W(Y.class, a14, u15, a14 instanceof InterfaceC0837k ? ((InterfaceC0837k) a14).d() : F1.a.f1544b, c0626q8);
                                c0626q8.p(false);
                                c0626q8.p(false);
                                Y y5 = (Y) W15;
                                B b14 = b6;
                                boolean h20 = c0626q8.h(b14);
                                Object P24 = c0626q8.P();
                                Object obj11 = C0616l.a;
                                if (h20 || P24 == obj11) {
                                    P24 = new I1.l(b14, 14);
                                    c0626q8.m0(P24);
                                }
                                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P24;
                                boolean h21 = c0626q8.h(b14);
                                Object P25 = c0626q8.P();
                                if (h21 || P25 == obj11) {
                                    P25 = new I1.l(b14, 15);
                                    c0626q8.m0(P25);
                                }
                                C.c(l3, wVar4, c0692g, y5, interfaceC1193a7, (InterfaceC1193a) P25, c0626q8, 4672);
                                return y.a;
                            case 8:
                                C0626q c0626q9 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f10 = c0626q9.f(jVar);
                                Object P26 = c0626q9.P();
                                B b15 = b6;
                                C0602e c0602e5 = C0616l.a;
                                if (f10 || P26 == c0602e5) {
                                    P26 = b15.a("mcp");
                                    c0626q9.m0(P26);
                                }
                                j jVar6 = (j) P26;
                                c0626q9.c0(1890788296);
                                e u16 = l.u(jVar6, c0626q9);
                                c0626q9.c0(1729797275);
                                U W16 = C.W(C0818g.class, jVar6, u16, jVar6 != null ? jVar6.d() : F1.a.f1544b, c0626q9);
                                c0626q9.p(false);
                                c0626q9.p(false);
                                C0818g c0818g2 = (C0818g) W16;
                                boolean h22 = c0626q9.h(b15);
                                Object P27 = c0626q9.P();
                                if (h22 || P27 == c0602e5) {
                                    P27 = new I1.l(b15, 16);
                                    c0626q9.m0(P27);
                                }
                                AbstractC0783w.k(c0818g2, (InterfaceC1193a) P27, c0626q9, 8);
                                return y.a;
                            case AbstractC1787b.f15287d /* 9 */:
                                C0626q c0626q10 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a15 = jVar.f2550k.a();
                                String string3 = a15 != null ? a15.getString("serverId") : null;
                                if (string3 == null) {
                                    string3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                boolean f11 = c0626q10.f(jVar);
                                Object P28 = c0626q10.P();
                                B b16 = b6;
                                C0602e c0602e6 = C0616l.a;
                                if (f11 || P28 == c0602e6) {
                                    P28 = b16.a("mcp");
                                    c0626q10.m0(P28);
                                }
                                j jVar7 = (j) P28;
                                c0626q10.c0(1890788296);
                                e u17 = l.u(jVar7, c0626q10);
                                c0626q10.c0(1729797275);
                                U W17 = C.W(C0818g.class, jVar7, u17, jVar7 != null ? jVar7.d() : F1.a.f1544b, c0626q10);
                                c0626q10.p(false);
                                c0626q10.p(false);
                                C0818g c0818g3 = (C0818g) W17;
                                boolean h23 = c0626q10.h(b16);
                                Object P29 = c0626q10.P();
                                if (h23 || P29 == c0602e6) {
                                    P29 = new I1.l(b16, 2);
                                    c0626q10.m0(P29);
                                }
                                AbstractC0783w.l(c0818g3, string3, (InterfaceC1193a) P29, c0626q10, 8);
                                return y.a;
                            case AbstractC1787b.f15289f /* 10 */:
                                C0626q c0626q11 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                boolean f12 = c0626q11.f(jVar);
                                Object P30 = c0626q11.P();
                                final B b17 = b6;
                                C0602e c0602e7 = C0616l.a;
                                if (f12 || P30 == c0602e7) {
                                    P30 = b17.a("model-services");
                                    c0626q11.m0(P30);
                                }
                                j jVar8 = (j) P30;
                                c0626q11.c0(1890788296);
                                e u18 = l.u(jVar8, c0626q11);
                                c0626q11.c0(1729797275);
                                U W18 = C.W(C0808F.class, jVar8, u18, jVar8 != null ? jVar8.d() : F1.a.f1544b, c0626q11);
                                c0626q11.p(false);
                                c0626q11.p(false);
                                C0808F c0808f3 = (C0808F) W18;
                                boolean h24 = c0626q11.h(b17);
                                Object P31 = c0626q11.P();
                                if (h24 || P31 == c0602e7) {
                                    P31 = new I1.l(b17, 24);
                                    c0626q11.m0(P31);
                                }
                                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P31;
                                boolean h25 = c0626q11.h(b17);
                                Object P32 = c0626q11.P();
                                if (h25 || P32 == c0602e7) {
                                    final int i192 = 5;
                                    P32 = new l4.c() { // from class: c3.b
                                        @Override // l4.c
                                        public final Object f(Object obj82) {
                                            switch (i192) {
                                                case 0:
                                                    String str = (String) obj82;
                                                    AbstractC1276k.f(str, "serverId");
                                                    B.b(b17, "mcp/edit/".concat(str));
                                                    break;
                                                case 1:
                                                    String str2 = (String) obj82;
                                                    AbstractC1276k.f(str2, "providerId");
                                                    B.b(b17, "model-services/".concat(str2));
                                                    break;
                                                case 2:
                                                    String str3 = (String) obj82;
                                                    AbstractC1276k.f(str3, "providerId");
                                                    B.b(b17, "model-services/".concat(str3));
                                                    break;
                                                case 3:
                                                    D2.e eVar = (D2.e) obj82;
                                                    AbstractC1276k.f(eVar, "serviceId");
                                                    B.b(b17, "search-services/".concat(eVar.f1281c));
                                                    break;
                                                case 4:
                                                    String str4 = (String) obj82;
                                                    AbstractC1276k.f(str4, "botId");
                                                    B.b(b17, "model-config/".concat(str4));
                                                    break;
                                                default:
                                                    String str5 = (String) obj82;
                                                    AbstractC1276k.f(str5, "providerId");
                                                    B.b(b17, "model-services/".concat(str5));
                                                    break;
                                            }
                                            return y.a;
                                        }
                                    };
                                    c0626q11.m0(P32);
                                }
                                AbstractC0783w.F(c0808f3, interfaceC1193a8, (l4.c) P32, c0626q11, 8);
                                return y.a;
                            case 11:
                                C0626q c0626q12 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "backStackEntry");
                                Bundle a16 = jVar.f2550k.a();
                                String string4 = a16 != null ? a16.getString("providerId") : null;
                                if (string4 == null) {
                                    string4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                String str = string4;
                                boolean f13 = c0626q12.f(jVar);
                                Object P33 = c0626q12.P();
                                B b18 = b6;
                                Object obj12 = C0616l.a;
                                if (f13 || P33 == obj12) {
                                    P33 = b18.a("model-services");
                                    c0626q12.m0(P33);
                                }
                                j jVar9 = (j) P33;
                                c0626q12.c0(1890788296);
                                e u19 = l.u(jVar9, c0626q12);
                                c0626q12.c0(1729797275);
                                U W19 = C.W(C0808F.class, jVar9, u19, jVar9 != null ? jVar9.d() : F1.a.f1544b, c0626q12);
                                c0626q12.p(false);
                                c0626q12.p(false);
                                C0808F c0808f4 = (C0808F) W19;
                                boolean h26 = c0626q12.h(b18);
                                Object P34 = c0626q12.P();
                                if (h26 || P34 == obj12) {
                                    P34 = new I1.l(b18, 13);
                                    c0626q12.m0(P34);
                                }
                                AbstractC0783w.C(c0808f4, str, (InterfaceC1193a) P34, null, c0626q12, 8);
                                return y.a;
                            default:
                                C0626q c0626q13 = (C0626q) obj6;
                                ((Integer) obj7).getClass();
                                AbstractC1276k.f(c1230l, "$this$composable");
                                AbstractC1276k.f(jVar, "$unused$var$");
                                B b19 = b6;
                                boolean h27 = c0626q13.h(b19);
                                Object P35 = c0626q13.P();
                                if (h27 || P35 == C0616l.a) {
                                    P35 = new I1.l(b19, 20);
                                    c0626q13.m0(P35);
                                }
                                AbstractC0783w.a((InterfaceC1193a) P35, c0626q13, 0);
                                return y.a;
                        }
                    }
                }, true, -1572194034), 254);
                return yVar;
            case 4:
                C1300I c1300i = (C1300I) obj3;
                C1297F c1297f = (C1297F) obj2;
                c1300i.a.b(c1297f);
                c1300i.f13005b.setValue(Boolean.TRUE);
                return new D.V0(9, c1300i, c1297f);
            case AbstractC1787b.f15290g /* 5 */:
                AbstractC1888A.y((InterfaceC1942y) obj3, null, new n.w0((n.y0) obj2, null), 1);
                return new Object();
            case 6:
                n.y0 y0Var = (n.y0) obj3;
                n.u0 u0Var = (n.u0) obj2;
                y0Var.f13285i.add(u0Var);
                return new D.V0(i7, y0Var, u0Var);
            case 7:
                n.y0 y0Var2 = (n.y0) obj3;
                n.y0 y0Var3 = (n.y0) obj2;
                y0Var2.f13286j.add(y0Var3);
                return new D.V0(i8, y0Var2, y0Var3);
            case 8:
                return new D.V0(i9, (n.y0) obj3, (n.r0) obj2);
            case AbstractC1787b.f15287d /* 9 */:
                ((C1682j) obj3).b((C1683k) obj2);
                return yVar;
            case AbstractC1787b.f15289f /* 10 */:
                AbstractC1404o abstractC1404o = (AbstractC1404o) obj2;
                H0.L l3 = (H0.L) obj;
                l3.b();
                InterfaceC1498d.f(l3, (C1397h) obj3, abstractC1404o, S.l.f7374V, null, 60);
                return yVar;
            case 11:
                H0.L l5 = (H0.L) obj;
                l5.b();
                InterfaceC1498d.f(l5, ((C1383E) obj3).f13409f, (AbstractC1404o) obj2, S.l.f7374V, null, 60);
                return yVar;
            case 12:
                ((C1682j) obj3).b((InterfaceC1681i) obj2);
                return yVar;
            case 13:
                C1588n c1588n = (C1588n) obj3;
                C1603s c1603s = (C1603s) obj2;
                long j3 = ((C1541S) obj).a;
                long g3 = c1588n.i1() ? C1353b.g(-1.0f, j3) : C1353b.g(1.0f, j3);
                C1603s.b(c1603s, c1588n.f14392L.c(Float.intBitsToFloat((int) (c1588n.f14393M == x02 ? g3 & 4294967295L : g3 >> 32))));
                return yVar;
            case 14:
                ((C1609u) obj3).a.j((C1509A) obj2);
                return yVar;
            case 15:
                B2 b22 = (B2) obj3;
                C1613v0 c1613v0 = (C1613v0) obj2;
                long j4 = ((C1541S) obj).a;
                long g6 = c1613v0.f14496Q ? C1353b.g(-1.0f, j4) : C1353b.g(1.0f, j4);
                r.X0 x03 = c1613v0.f14492M;
                C1598q0 c1598q0 = AbstractC1601r0.a;
                float intBitsToFloat = Float.intBitsToFloat((int) (x03 == x02 ? g6 & 4294967295L : g6 >> 32));
                switch (b22.a) {
                    case 0:
                        ((C2) b22.f5152b).a(intBitsToFloat);
                        return yVar;
                    default:
                        C0513s c0513s = (C0513s) b22.f5152b;
                        R.r.a(c0513s.f6837n, c0513s.e(intBitsToFloat));
                        return yVar;
                }
            case PegdownExtensions.AUTOLINKS /* 16 */:
                B1 b1 = (B1) obj3;
                E1 e12 = (E1) obj2;
                C1541S c1541s = (C1541S) obj;
                float f6 = c1541s.f14144b ? -1.0f : 1.0f;
                long j5 = c1541s.a;
                b1.a(C1353b.g(f6, e12.f14015d == r.X0.f14184e ? C1353b.a(S.l.f7374V, 1, j5) : C1353b.a(S.l.f7374V, 2, j5)), 1);
                return yVar;
            case 17:
                h2 h2Var = (h2) obj3;
                ((Long) obj).longValue();
                float f7 = h2Var.f14346e;
                h2Var.f14346e = S.l.f7374V;
                ((l4.c) obj2).f(Float.valueOf(f7));
                return yVar;
            case 18:
                C1792d0 c1792d0 = (C1792d0) obj3;
                F0.k0 k0Var = (F0.k0) obj2;
                F0.j0 j0Var = (F0.j0) obj;
                if (c1792d0.f15295t) {
                    F0.j0.l(j0Var, k0Var, j0Var.l0(c1792d0.f15293r), j0Var.l0(c1792d0.f15294s));
                } else {
                    j0Var.h(k0Var, j0Var.l0(c1792d0.f15293r), j0Var.l0(c1792d0.f15294s), S.l.f7374V);
                }
                return yVar;
            case 19:
                C1796f0 c1796f0 = (C1796f0) obj3;
                F0.k0 k0Var2 = (F0.k0) obj2;
                F0.j0 j0Var2 = (F0.j0) obj;
                long j6 = ((e1.j) c1796f0.f15299r.f(j0Var2)).a;
                if (c1796f0.f15300s) {
                    F0.j0.m(j0Var2, k0Var2, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                } else {
                    F0.j0.p(j0Var2, k0Var2, (int) (j6 >> 32), (int) (j6 & 4294967295L), null, 12);
                }
                return yVar;
            case 20:
                C1800h0 c1800h0 = (C1800h0) obj3;
                F0.k0 k0Var3 = (F0.k0) obj2;
                F0.j0 j0Var3 = (F0.j0) obj;
                if (c1800h0.f15312v) {
                    F0.j0.l(j0Var3, k0Var3, j0Var3.l0(c1800h0.f15308r), j0Var3.l0(c1800h0.f15309s));
                } else {
                    j0Var3.h(k0Var3, j0Var3.l0(c1800h0.f15308r), j0Var3.l0(c1800h0.f15309s), S.l.f7374V);
                }
                return yVar;
            case 21:
                v.G0 g02 = (v.G0) obj3;
                View view = (View) obj2;
                g02.a(view);
                return new D.V0(13, g02, view);
            case 22:
                C1964d c1964d = (C1964d) obj3;
                C1965e c1965e = (C1965e) obj2;
                Q0.d dVar2 = c1964d.f15846r;
                if (dVar2 != null) {
                    dVar2.b();
                }
                c1964d.f15846r = null;
                C1933p c1933p = c1965e.f15850b;
                if (c1933p != null) {
                    c1933p.Z(yVar);
                }
                c1965e.f15850b = null;
                return yVar;
            case 23:
                y.o0 o0Var = (y.o0) obj3;
                o0Var.f15908f.i(obj2);
                return new D.V0(14, o0Var, obj2);
            case 24:
                return new y.o0((e0.f) obj3, (Map) obj, (InterfaceC0958c) obj2);
            case 25:
                ((C1998d) obj3).f16020f.removeCallbacks((C4.g) obj2);
                return yVar;
            case 26:
                F0.j0 j0Var4 = (F0.j0) obj;
                C0074j c0074j = new C0074j(2, (ArrayList) obj2);
                j0Var4.f1484c = true;
                c0074j.f(j0Var4);
                j0Var4.f1484c = false;
                ((T.X) obj3).getValue();
                return yVar;
            case 27:
                return ConversationDao_Impl.f((ConversationDao_Impl) obj3, (ConversationEntity) obj2, (X1.a) obj);
            case 28:
                upsertAll$lambda$1 = LLMProviderDao_Impl.upsertAll$lambda$1((LLMProviderDao_Impl) obj3, (List) obj2, (X1.a) obj);
                return upsertAll$lambda$1;
            default:
                upsert$lambda$0 = LLMProviderDao_Impl.upsert$lambda$0((LLMProviderDao_Impl) obj3, (LLMProviderEntity) obj2, (X1.a) obj);
                return upsert$lambda$0;
        }
    }
}
