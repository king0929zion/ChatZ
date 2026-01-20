package P2;

import H0.AbstractC0157l;
import Q.AbstractC0452p1;
import Q.f3;
import R.AbstractC0497b;
import S0.C0545g;
import S0.InterfaceC0540b;
import com.bot.core.model.ConversationInfo;
import com.vladsch.flexmark.parser.PegdownExtensions;
import d1.C0934a;
import e.C0954b;
import java.util.List;
import m4.AbstractC1276k;
import n.C1302K;
import o0.C1387I;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class D0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4678c;

    public /* synthetic */ D0(int i6) {
        this.f4678c = i6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f4678c;
        S0.G g3 = null;
        g3 = null;
        X3.y yVar = X3.y.a;
        switch (i6) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() / 8);
            case 1:
                return Integer.valueOf(((Integer) obj).intValue() / 10);
            case 2:
                P0.v.e((P0.x) obj, 0);
                return yVar;
            case 3:
                P0.v.e((P0.x) obj, 0);
                return yVar;
            case 4:
                float f6 = AbstractC0452p1.a;
                return Boolean.TRUE;
            case AbstractC1787b.f15290g /* 5 */:
                P0.v.h((P0.x) obj);
                return yVar;
            case 6:
                s4.e[] eVarArr = P0.v.a;
                ((P0.x) obj).a(P0.t.f4545x, yVar);
                return yVar;
            case 7:
                return yVar;
            case 8:
                C1302K c1302k = (C1302K) obj;
                c1302k.a = 6000;
                Float valueOf = Float.valueOf(90.0f);
                c1302k.a(valueOf, 300).f13008b = S.q.a;
                c1302k.a(valueOf, 1500);
                Float valueOf2 = Float.valueOf(180.0f);
                c1302k.a(valueOf2, 1800);
                c1302k.a(valueOf2, 3000);
                Float valueOf3 = Float.valueOf(270.0f);
                c1302k.a(valueOf3, 3300);
                c1302k.a(valueOf3, 4500);
                Float valueOf4 = Float.valueOf(360.0f);
                c1302k.a(valueOf4, 4800);
                c1302k.a(valueOf4, 6000);
                return yVar;
            case AbstractC1787b.f15287d /* 9 */:
                s4.e[] eVarArr2 = P0.v.a;
                P0.w wVar = P0.t.f4533l;
                s4.e eVar = P0.v.a[5];
                ((P0.x) obj).a(wVar, Boolean.TRUE);
                return yVar;
            case AbstractC1787b.f15289f /* 10 */:
                T.B b5 = f3.a;
                return yVar;
            case 11:
                return Integer.valueOf((-((Integer) obj).intValue()) / 12);
            case 12:
                return Integer.valueOf((-((Integer) obj).intValue()) / 8);
            case 13:
                float f7 = AbstractC0497b.a;
                return yVar;
            case 14:
                H0.F0Inner f02 = (H0.F0InnerInner) obj;
                AbstractC1276k.d(f02, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                R.Z z5 = (R.Z) f02;
                z5.f6733s = false;
                AbstractC0157l.m(z5);
                return Boolean.FALSE;
            case 15:
                C1387I c1387i = (C1387I) obj;
                AbstractC1276k.f(c1387i, "$this$graphicsLayer");
                c1387i.d(0.6f);
                return yVar;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            case 17:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            case 18:
                ConversationInfo conversationInfo = (ConversationInfo) obj;
                AbstractC1276k.f(conversationInfo, "it");
                return conversationInfo.a;
            case 19:
                AbstractC1276k.f((C0954b) obj, "<unused var>");
                return yVar;
            case 20:
                return Float.valueOf(((Float) obj).floatValue() * 0.3f);
            case 21:
                return Boolean.valueOf(!(((InterfaceC0540b) obj) instanceof S0.u));
            case 22:
                S0.r rVar = (S0.r) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(rVar.f7657b);
                sb.append(", ");
                return B3.e.q(sb, rVar.f7658c, ')');
            case 23:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                l4.c cVar = (l4.c) S0.E.f7548h.f11565f;
                Boolean bool = Boolean.FALSE;
                S0.G g6 = (AbstractC1276k.b(obj2, bool) || obj2 == null) ? null : (S0.G) cVar.f(obj2);
                Object obj3 = list.get(1);
                S0.G g7 = (AbstractC1276k.b(obj3, bool) || obj3 == null) ? null : (S0.G) cVar.f(obj3);
                Object obj4 = list.get(2);
                S0.G g8 = (AbstractC1276k.b(obj4, bool) || obj4 == null) ? null : (S0.G) cVar.f(obj4);
                Object obj5 = list.get(3);
                if (!AbstractC1276k.b(obj5, bool) && obj5 != null) {
                    g3 = (S0.G) cVar.f(obj5);
                }
                return new S0.M(g6, g7, g8, g3);
            case 24:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (AbstractC1276k.b(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((l4.c) S0.E.a.f11565f).f(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                AbstractC1276k.c(str);
                return new C0545g(list3, str);
            case 25:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new d1.l(((Integer) obj).intValue());
            case 26:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new d1.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 27:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                e1.p[] pVarArr = e1.o.f11579b;
                l4.c cVar2 = S0.E.f7562v.f7537e;
                Boolean bool2 = Boolean.FALSE;
                AbstractC1276k.b(obj8, bool2);
                e1.o oVar = obj8 != null ? (e1.o) cVar2.f(obj8) : null;
                AbstractC1276k.c(oVar);
                long j3 = oVar.a;
                Object obj9 = list5.get(1);
                AbstractC1276k.b(obj9, bool2);
                e1.o oVar2 = obj9 != null ? (e1.o) cVar2.f(obj9) : null;
                AbstractC1276k.c(oVar2);
                return new d1.q(j3, oVar2.a);
            case 28:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new W0.k(((Integer) obj).intValue());
            default:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return new C0934a(((Float) obj).floatValue());
        }
    }
}
