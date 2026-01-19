package S0;

import Q.A0;
import Q.f3;
import T.C0626q;
import com.bot.core.model.LLMSetting;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import d1.C0937d;
import d1.C0938e;
import e0.C0957b;
import h0.C1038o;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1276k;
import n0.C1353b;
import o0.C1389K;
import v.AbstractC1787b;
import v.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7533c;

    public /* synthetic */ A(int i6) {
        this.f7533c = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        EnumC0547i enumC0547i;
        Object a;
        int i6 = this.f7533c;
        X3.y yVar = X3.y.a;
        switch (i6) {
            case 0:
                return Integer.valueOf(((d1.k) obj2).a);
            case 1:
                return Integer.valueOf(((d1.m) obj2).a);
            case 2:
                return Integer.valueOf(((C0937d) obj2).a);
            case 3:
                return Integer.valueOf(((W0.i) obj2).a);
            case 4:
                return Integer.valueOf(((W0.j) obj2).a);
            case AbstractC1787b.f15290g /* 5 */:
                e1.o oVar = (e1.o) obj2;
                return oVar != null ? e1.o.a(oVar.a, e1.o.f11580c) : false ? Boolean.FALSE : Y4.l.m(Float.valueOf(e1.o.c(oVar.a)), E.a(new e1.p(e1.o.b(oVar.a)), E.f7563w, (C0957b) obj));
            case 6:
                C0550l c0550l = (C0550l) obj2;
                return Y4.l.m(c0550l.a, E.a(c0550l.f7641b, E.f7549i, (C0957b) obj));
            case 7:
                long j3 = ((e1.p) obj2).a;
                if (e1.p.a(j3, 8589934592L)) {
                    return 0;
                }
                if (e1.p.a(j3, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 8:
                C1353b c1353b = (C1353b) obj2;
                return c1353b != null ? C1353b.c(c1353b.a, 9205357640488583168L) : false ? Boolean.FALSE : Y4.l.m(Float.valueOf(Float.intBitsToFloat((int) (c1353b.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (c1353b.a & 4294967295L))));
            case AbstractC1787b.f15287d /* 9 */:
                C0957b c0957b = (C0957b) obj;
                C0543e c0543e = (C0543e) obj2;
                Object obj3 = c0543e.a;
                if (obj3 instanceof u) {
                    enumC0547i = EnumC0547i.f7633c;
                } else if (obj3 instanceof G) {
                    enumC0547i = EnumC0547i.f7634e;
                } else if (obj3 instanceof S) {
                    enumC0547i = EnumC0547i.f7635f;
                } else if (obj3 instanceof Q) {
                    enumC0547i = EnumC0547i.f7636g;
                } else if (obj3 instanceof C0551m) {
                    enumC0547i = EnumC0547i.f7637h;
                } else if (obj3 instanceof C0550l) {
                    enumC0547i = EnumC0547i.f7638i;
                } else {
                    if (!(obj3 instanceof I)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC0547i = EnumC0547i.f7639j;
                }
                switch (enumC0547i.ordinal()) {
                    case 0:
                        AbstractC1276k.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        a = E.a((u) obj3, E.f7547g, c0957b);
                        break;
                    case 1:
                        AbstractC1276k.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        a = E.a((G) obj3, E.f7548h, c0957b);
                        break;
                    case 2:
                        AbstractC1276k.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        a = E.a((S) obj3, E.f7543c, c0957b);
                        break;
                    case 3:
                        AbstractC1276k.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        a = E.a((Q) obj3, E.f7544d, c0957b);
                        break;
                    case 4:
                        AbstractC1276k.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        a = E.a((C0551m) obj3, E.f7545e, c0957b);
                        break;
                    case AbstractC1787b.f15290g /* 5 */:
                        AbstractC1276k.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        a = E.a((C0550l) obj3, E.f7546f, c0957b);
                        break;
                    case 6:
                        AbstractC1276k.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        a = ((I) obj3).a;
                        break;
                    default:
                        throw new RuntimeException();
                }
                return Y4.l.m(enumC0547i, a, Integer.valueOf(c0543e.f7626b), Integer.valueOf(c0543e.f7627c), c0543e.f7628d);
            case AbstractC1787b.f15289f /* 10 */:
                C0957b c0957b2 = (C0957b) obj;
                List list = ((Z0.b) obj2).f9855c;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(E.a((Z0.a) list.get(i7), E.f7566z, c0957b2));
                }
                return arrayList;
            case 11:
                return ((Z0.a) obj2).a.toLanguageTag();
            case 12:
                C0957b c0957b3 = (C0957b) obj;
                d1.i iVar = (d1.i) obj2;
                return Y4.l.m(E.a(new d1.f(iVar.a), E.f7539B, c0957b3), E.a(new d1.h(iVar.f11388b), E.f7540C, c0957b3), E.a(new d1.g(iVar.f11389c), E.f7541D, c0957b3));
            case 13:
                return Float.valueOf(((d1.f) obj2).a);
            case 14:
                return Integer.valueOf(((d1.h) obj2).a);
            case 15:
                return Integer.valueOf(((d1.g) obj2).a);
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return ((S) obj2).a;
            case 17:
                C0957b c0957b4 = (C0957b) obj;
                u uVar = (u) obj2;
                Object a6 = E.a(new d1.k(uVar.a), E.f7557q, c0957b4);
                Object a7 = E.a(new d1.m(uVar.f7665b), E.f7558r, c0957b4);
                Object a8 = E.a(new e1.o(uVar.f7666c), E.f7562v, c0957b4);
                d1.q qVar = uVar.f7667d;
                d1.q qVar2 = d1.q.f11398c;
                Object a9 = E.a(qVar, E.f7552l, c0957b4);
                Object a10 = E.a(uVar.f7668e, F.a, c0957b4);
                d1.i iVar2 = uVar.f7669f;
                d1.i iVar3 = d1.i.f11387d;
                return Y4.l.m(a6, a7, a8, a9, a10, E.a(iVar2, E.f7538A, c0957b4), E.a(new C0938e(uVar.f7670g), F.f7568c, c0957b4), E.a(new C0937d(uVar.f7671h), E.f7559s, c0957b4), E.a(uVar.f7672i, F.f7569d, c0957b4));
            case 18:
                return ((Q) obj2).a;
            case 19:
                C0957b c0957b5 = (C0957b) obj;
                G g3 = (G) obj2;
                o0.s sVar = new o0.s(g3.a.b());
                D d6 = E.f7556p;
                Object a11 = E.a(sVar, d6, c0957b5);
                e1.o oVar2 = new e1.o(g3.f7571b);
                D d7 = E.f7562v;
                Object a12 = E.a(oVar2, d7, c0957b5);
                W0.k kVar = g3.f7572c;
                W0.k kVar2 = W0.k.f8831e;
                Object a13 = E.a(kVar, E.f7553m, c0957b5);
                Object a14 = E.a(g3.f7573d, E.f7560t, c0957b5);
                Object a15 = E.a(g3.f7574e, E.f7561u, c0957b5);
                String str = g3.f7576g;
                Object a16 = E.a(new e1.o(g3.f7577h), d7, c0957b5);
                Object a17 = E.a(g3.f7578i, E.f7554n, c0957b5);
                Object a18 = E.a(g3.f7579j, E.f7551k, c0957b5);
                Z0.b bVar = g3.f7580k;
                Z0.b bVar2 = Z0.b.f9854f;
                Object a19 = E.a(bVar, E.f7565y, c0957b5);
                Object a20 = E.a(new o0.s(g3.f7581l), d6, c0957b5);
                Object a21 = E.a(g3.f7582m, E.f7550j, c0957b5);
                C1389K c1389k = g3.f7583n;
                C1389K c1389k2 = C1389K.f13435d;
                return Y4.l.m(a11, a12, a13, a14, a15, -1, str, a16, a17, a18, a19, a20, a21, E.a(c1389k, E.f7555o, c0957b5));
            case 20:
                C0957b c0957b6 = (C0957b) obj;
                M m3 = (M) obj2;
                G g6 = m3.a;
                e0.k kVar3 = E.f7548h;
                return Y4.l.m(E.a(g6, kVar3, c0957b6), E.a(m3.f7604b, kVar3, c0957b6), E.a(m3.f7605c, kVar3, c0957b6), E.a(m3.f7606d, kVar3, c0957b6));
            case 21:
                w wVar = (w) obj2;
                Boolean valueOf = Boolean.valueOf(wVar.a);
                e0.k kVar4 = E.a;
                return Y4.l.m(valueOf, E.a(new C0549k(wVar.f7675b), F.f7567b, (C0957b) obj));
            case 22:
                return Integer.valueOf(((C0549k) obj2).a);
            case 23:
                return Integer.valueOf(((C0938e) obj2).a);
            case 24:
                d1.s sVar2 = (d1.s) obj2;
                return Y4.l.m(E.a(new d1.r(sVar2.a), F.f7570e, (C0957b) obj), Boolean.valueOf(sVar2.f11402b));
            case 25:
                return Integer.valueOf(((d1.r) obj2).a);
            case 26:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    A0.a(Y3.C.L(R.drawable.outline_content_copy_24, 0, c0626q), h5.e.j0(R.string.markdown_copy_code, c0626q), t0.j(C1038o.a, 16), ((Q.N) c0626q.j(Q.O.a)).f5429s, c0626q, 392, 0);
                } else {
                    c0626q.V();
                }
                return yVar;
            case 27:
                ((Integer) obj).intValue();
                LLMSetting lLMSetting = (LLMSetting) obj2;
                AbstractC1276k.f(lLMSetting, "bot");
                String str2 = lLMSetting.a;
                return str2 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : str2;
            case 28:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.bot_delete_title, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                } else {
                    c0626q2.V();
                }
                return yVar;
            default:
                C0626q c0626q3 = (C0626q) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.bot_delete_message, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                } else {
                    c0626q3.V();
                }
                return yVar;
        }
    }
}
