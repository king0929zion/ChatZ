package S0;

import S2.AbstractC0565e;
import android.util.Log;
import com.vladsch.flexmark.parser.PegdownExtensions;
import d1.C0934a;
import d1.C0937d;
import d1.C0938e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m4.AbstractC1276k;
import n0.C1353b;
import o0.C1389K;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7677c;

    public /* synthetic */ z(int i6) {
        this.f7677c = i6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        d1.s sVar;
        int i10 = 0;
        switch (this.f7677c) {
            case 0:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Integer num = obj2 != null ? (Integer) obj2 : null;
                AbstractC1276k.c(num);
                int intValue = num.intValue();
                Object obj3 = list.get(1);
                Integer num2 = obj3 != null ? (Integer) obj3 : null;
                AbstractC1276k.c(num2);
                return new O(F.b(intValue, num2.intValue()));
            case 1:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                int i11 = o0.s.f13482i;
                Boolean bool = Boolean.FALSE;
                AbstractC1276k.b(obj4, bool);
                o0.s sVar2 = obj4 != null ? AbstractC1276k.b(obj4, Boolean.FALSE) ? new o0.s(o0.s.f13481h) : new o0.s(o0.y.c(((Integer) obj4).intValue())) : null;
                AbstractC1276k.c(sVar2);
                long j4 = sVar2.a;
                Object obj5 = list2.get(1);
                D d6 = E.f7564x;
                AbstractC1276k.b(obj5, bool);
                C1353b c1353b = obj5 != null ? (C1353b) d6.f7537e.f(obj5) : null;
                AbstractC1276k.c(c1353b);
                long j5 = c1353b.a;
                Object obj6 = list2.get(2);
                Float f6 = obj6 != null ? (Float) obj6 : null;
                AbstractC1276k.c(f6);
                return new C1389K(j4, j5, f6.floatValue());
            case 2:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new d1.k(((Integer) obj).intValue());
            case 3:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj7 = list3.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                AbstractC1276k.c(str);
                Object obj8 = list3.get(1);
                return new C0551m(str, (AbstractC1276k.b(obj8, Boolean.FALSE) || obj8 == null) ? null : (M) ((l4.c) E.f7549i.f11565f).f(obj8), 4);
            case 4:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new d1.m(((Integer) obj).intValue());
            case AbstractC1787b.f15290g /* 5 */:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C0937d(((Integer) obj).intValue());
            case 6:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                ArrayList arrayList = new ArrayList(list4.size());
                int size = list4.size();
                while (i10 < size) {
                    Object obj9 = list4.get(i10);
                    C0543e c0543e = (AbstractC1276k.b(obj9, Boolean.FALSE) || obj9 == null) ? null : (C0543e) ((l4.c) E.f7542b.f11565f).f(obj9);
                    AbstractC1276k.c(c0543e);
                    arrayList.add(c0543e);
                    i10++;
                }
                return arrayList;
            case 7:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new W0.i(((Integer) obj).intValue());
            case 8:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new W0.j(((Integer) obj).intValue());
            case AbstractC1787b.f15287d /* 9 */:
                Boolean bool2 = Boolean.FALSE;
                if (AbstractC1276k.b(obj, bool2)) {
                    return new e1.o(e1.o.f11580c);
                }
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                Float f7 = obj10 != null ? (Float) obj10 : null;
                AbstractC1276k.c(f7);
                float floatValue = f7.floatValue();
                Object obj11 = list5.get(1);
                D d7 = E.f7563w;
                AbstractC1276k.b(obj11, bool2);
                e1.p pVar = obj11 != null ? (e1.p) d7.f7537e.f(obj11) : null;
                AbstractC1276k.c(pVar);
                return new e1.o(s4.j.B(floatValue, pVar.a));
            case AbstractC1787b.f15289f /* 10 */:
                return AbstractC1276k.b(obj, 0) ? new e1.p(8589934592L) : AbstractC1276k.b(obj, 1) ? new e1.p(4294967296L) : new e1.p(0L);
            case 11:
                if (AbstractC1276k.b(obj, Boolean.FALSE)) {
                    return new C1353b(9205357640488583168L);
                }
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list6 = (List) obj;
                Object obj12 = list6.get(0);
                Float f8 = obj12 != null ? (Float) obj12 : null;
                AbstractC1276k.c(f8);
                float floatValue2 = f8.floatValue();
                Object obj13 = list6.get(1);
                AbstractC1276k.c(obj13 != null ? (Float) obj13 : null);
                return new C1353b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r14.floatValue()) & 4294967295L));
            case 12:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list7.size());
                int size2 = list7.size();
                while (i10 < size2) {
                    Object obj14 = list7.get(i10);
                    Z0.a aVar = (AbstractC1276k.b(obj14, Boolean.FALSE) || obj14 == null) ? null : (Z0.a) ((l4.c) E.f7566z.f11565f).f(obj14);
                    AbstractC1276k.c(aVar);
                    arrayList2.add(aVar);
                    i10++;
                }
                return new Z0.b(arrayList2);
            case 13:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj;
                Z0.c.a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str2);
                if (AbstractC1276k.b(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new Z0.a(forLanguageTag);
            case 14:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str3 = obj15 != null ? (String) obj15 : null;
                AbstractC1276k.c(str3);
                Object obj16 = list8.get(1);
                return new C0550l(str3, (AbstractC1276k.b(obj16, Boolean.FALSE) || obj16 == null) ? null : (M) ((l4.c) E.f7549i.f11565f).f(obj16));
            case 15:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                float f9 = d1.f.f11384b;
                D d8 = E.f7539B;
                Boolean bool3 = Boolean.FALSE;
                AbstractC1276k.b(obj17, bool3);
                d1.f fVar = obj17 != null ? (d1.f) d8.f7537e.f(obj17) : null;
                AbstractC1276k.c(fVar);
                float f10 = fVar.a;
                Object obj18 = list9.get(1);
                D d9 = E.f7540C;
                AbstractC1276k.b(obj18, bool3);
                d1.h hVar = obj18 != null ? (d1.h) d9.f7537e.f(obj18) : null;
                AbstractC1276k.c(hVar);
                int i12 = hVar.a;
                Object obj19 = list9.get(2);
                D d10 = E.f7541D;
                AbstractC1276k.b(obj19, bool3);
                d1.g gVar = obj19 != null ? (d1.g) d10.f7537e.f(obj19) : null;
                AbstractC1276k.c(gVar);
                return new d1.i(f10, i12, gVar.a);
            case PegdownExtensions.AUTOLINKS /* 16 */:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Float");
                float floatValue3 = ((Float) obj).floatValue();
                d1.f.a(floatValue3);
                return new d1.f(floatValue3);
            case 17:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new d1.h(((Integer) obj).intValue());
            case 18:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                Object obj20 = list10.get(0);
                EnumC0547i enumC0547i = obj20 != null ? (EnumC0547i) obj20 : null;
                AbstractC1276k.c(enumC0547i);
                Object obj21 = list10.get(2);
                Integer num3 = obj21 != null ? (Integer) obj21 : null;
                AbstractC1276k.c(num3);
                int intValue2 = num3.intValue();
                Object obj22 = list10.get(3);
                Integer num4 = obj22 != null ? (Integer) obj22 : null;
                AbstractC1276k.c(num4);
                int intValue3 = num4.intValue();
                Object obj23 = list10.get(4);
                String str4 = obj23 != null ? (String) obj23 : null;
                AbstractC1276k.c(str4);
                switch (enumC0547i.ordinal()) {
                    case 0:
                        Object obj24 = list10.get(1);
                        u uVar = (AbstractC1276k.b(obj24, Boolean.FALSE) || obj24 == null) ? null : (u) ((l4.c) E.f7547g.f11565f).f(obj24);
                        AbstractC1276k.c(uVar);
                        return new C0543e(uVar, intValue2, intValue3, str4);
                    case 1:
                        Object obj25 = list10.get(1);
                        G g3 = (AbstractC1276k.b(obj25, Boolean.FALSE) || obj25 == null) ? null : (G) ((l4.c) E.f7548h.f11565f).f(obj25);
                        AbstractC1276k.c(g3);
                        return new C0543e(g3, intValue2, intValue3, str4);
                    case 2:
                        Object obj26 = list10.get(1);
                        S s5 = (AbstractC1276k.b(obj26, Boolean.FALSE) || obj26 == null) ? null : (S) ((l4.c) E.f7543c.f11565f).f(obj26);
                        AbstractC1276k.c(s5);
                        return new C0543e(s5, intValue2, intValue3, str4);
                    case 3:
                        Object obj27 = list10.get(1);
                        Q q3 = (AbstractC1276k.b(obj27, Boolean.FALSE) || obj27 == null) ? null : (Q) ((l4.c) E.f7544d.f11565f).f(obj27);
                        AbstractC1276k.c(q3);
                        return new C0543e(q3, intValue2, intValue3, str4);
                    case 4:
                        Object obj28 = list10.get(1);
                        C0551m c0551m = (AbstractC1276k.b(obj28, Boolean.FALSE) || obj28 == null) ? null : (C0551m) ((l4.c) E.f7545e.f11565f).f(obj28);
                        AbstractC1276k.c(c0551m);
                        return new C0543e(c0551m, intValue2, intValue3, str4);
                    case AbstractC1787b.f15290g /* 5 */:
                        Object obj29 = list10.get(1);
                        C0550l c0550l = (AbstractC1276k.b(obj29, Boolean.FALSE) || obj29 == null) ? null : (C0550l) ((l4.c) E.f7546f.f11565f).f(obj29);
                        AbstractC1276k.c(c0550l);
                        return new C0543e(c0550l, intValue2, intValue3, str4);
                    case 6:
                        Object obj30 = list10.get(1);
                        String str5 = obj30 != null ? (String) obj30 : null;
                        AbstractC1276k.c(str5);
                        return new C0543e(new I(str5), intValue2, intValue3, str4);
                    default:
                        throw new RuntimeException();
                }
            case 19:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new d1.g(((Integer) obj).intValue());
            case 20:
                String str6 = obj != null ? (String) obj : null;
                AbstractC1276k.c(str6);
                return new S(str6);
            case 21:
                String str7 = obj != null ? (String) obj : null;
                AbstractC1276k.c(str7);
                return new Q(str7);
            case 22:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj31 = list11.get(0);
                D d11 = E.f7557q;
                Boolean bool4 = Boolean.FALSE;
                AbstractC1276k.b(obj31, bool4);
                d1.k kVar = obj31 != null ? (d1.k) d11.f7537e.f(obj31) : null;
                AbstractC1276k.c(kVar);
                int i13 = kVar.a;
                Object obj32 = list11.get(1);
                D d12 = E.f7558r;
                AbstractC1276k.b(obj32, bool4);
                d1.m mVar = obj32 != null ? (d1.m) d12.f7537e.f(obj32) : null;
                AbstractC1276k.c(mVar);
                int i14 = mVar.a;
                Object obj33 = list11.get(2);
                e1.p[] pVarArr = e1.o.f11579b;
                D d13 = E.f7562v;
                AbstractC1276k.b(obj33, bool4);
                e1.o oVar = obj33 != null ? (e1.o) d13.f7537e.f(obj33) : null;
                AbstractC1276k.c(oVar);
                long j6 = oVar.a;
                Object obj34 = list11.get(3);
                d1.q qVar = d1.q.f11398c;
                d1.q qVar2 = (AbstractC1276k.b(obj34, bool4) || obj34 == null) ? null : (d1.q) ((l4.c) E.f7552l.f11565f).f(obj34);
                Object obj35 = list11.get(4);
                w wVar = (AbstractC1276k.b(obj35, bool4) || obj35 == null) ? null : (w) ((l4.c) F.a.f11565f).f(obj35);
                Object obj36 = list11.get(5);
                d1.i iVar = d1.i.f11387d;
                d1.i iVar2 = (AbstractC1276k.b(obj36, bool4) || obj36 == null) ? null : (d1.i) ((l4.c) E.f7538A.f11565f).f(obj36);
                Object obj37 = list11.get(6);
                C0938e c0938e = (AbstractC1276k.b(obj37, bool4) || obj37 == null) ? null : (C0938e) ((l4.c) F.f7568c.f11565f).f(obj37);
                AbstractC1276k.c(c0938e);
                int i15 = c0938e.a;
                Object obj38 = list11.get(7);
                D d14 = E.f7559s;
                AbstractC1276k.b(obj38, bool4);
                C0937d c0937d = obj38 != null ? (C0937d) d14.f7537e.f(obj38) : null;
                AbstractC1276k.c(c0937d);
                int i16 = c0937d.a;
                Object obj39 = list11.get(8);
                boolean b5 = AbstractC1276k.b(obj39, bool4);
                e0.k kVar2 = F.f7569d;
                if (b5 || obj39 == null) {
                    i6 = i13;
                    i7 = i16;
                    i8 = i15;
                    i9 = i14;
                    j3 = j6;
                    sVar = null;
                } else {
                    i6 = i13;
                    i7 = i16;
                    i8 = i15;
                    i9 = i14;
                    j3 = j6;
                    sVar = (d1.s) ((l4.c) kVar2.f11565f).f(obj39);
                }
                return new u(i6, i9, j3, qVar2, wVar, iVar2, i8, i7, sVar);
            case 23:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list12 = (List) obj;
                Object obj40 = list12.get(0);
                int i17 = o0.s.f13482i;
                Boolean bool5 = Boolean.FALSE;
                AbstractC1276k.b(obj40, bool5);
                o0.s sVar3 = obj40 != null ? obj40.equals(bool5) ? new o0.s(o0.s.f13481h) : new o0.s(o0.y.c(((Integer) obj40).intValue())) : null;
                AbstractC1276k.c(sVar3);
                long j7 = sVar3.a;
                Object obj41 = list12.get(1);
                e1.p[] pVarArr2 = e1.o.f11579b;
                l4.c cVar = E.f7562v.f7537e;
                AbstractC1276k.b(obj41, bool5);
                e1.o oVar2 = obj41 != null ? (e1.o) cVar.f(obj41) : null;
                AbstractC1276k.c(oVar2);
                long j8 = oVar2.a;
                Object obj42 = list12.get(2);
                W0.k kVar3 = W0.k.f8831e;
                W0.k kVar4 = (AbstractC1276k.b(obj42, bool5) || obj42 == null) ? null : (W0.k) ((l4.c) E.f7553m.f11565f).f(obj42);
                Object obj43 = list12.get(3);
                W0.i iVar3 = (AbstractC1276k.b(obj43, bool5) || obj43 == null) ? null : (W0.i) ((l4.c) E.f7560t.f11565f).f(obj43);
                Object obj44 = list12.get(4);
                W0.j jVar = (AbstractC1276k.b(obj44, bool5) || obj44 == null) ? null : (W0.j) ((l4.c) E.f7561u.f11565f).f(obj44);
                Object obj45 = list12.get(6);
                String str8 = obj45 != null ? (String) obj45 : null;
                Object obj46 = list12.get(7);
                AbstractC1276k.b(obj46, bool5);
                e1.o oVar3 = obj46 != null ? (e1.o) cVar.f(obj46) : null;
                AbstractC1276k.c(oVar3);
                long j9 = oVar3.a;
                Object obj47 = list12.get(8);
                C0934a c0934a = (AbstractC1276k.b(obj47, bool5) || obj47 == null) ? null : (C0934a) ((l4.c) E.f7554n.f11565f).f(obj47);
                Object obj48 = list12.get(9);
                d1.p pVar2 = (AbstractC1276k.b(obj48, bool5) || obj48 == null) ? null : (d1.p) ((l4.c) E.f7551k.f11565f).f(obj48);
                Object obj49 = list12.get(10);
                Z0.b bVar = Z0.b.f9854f;
                Z0.b bVar2 = (AbstractC1276k.b(obj49, bool5) || obj49 == null) ? null : (Z0.b) ((l4.c) E.f7565y.f11565f).f(obj49);
                Object obj50 = list12.get(11);
                AbstractC1276k.b(obj50, bool5);
                o0.s sVar4 = obj50 != null ? obj50.equals(bool5) ? new o0.s(o0.s.f13481h) : new o0.s(o0.y.c(((Integer) obj50).intValue())) : null;
                AbstractC1276k.c(sVar4);
                long j10 = sVar4.a;
                Object obj51 = list12.get(12);
                d1.l lVar = (AbstractC1276k.b(obj51, bool5) || obj51 == null) ? null : (d1.l) ((l4.c) E.f7550j.f11565f).f(obj51);
                Object obj52 = list12.get(13);
                C1389K c1389k = C1389K.f13435d;
                return new G(j7, j8, kVar4, iVar3, jVar, (W0.p) null, str8, j9, c0934a, pVar2, bVar2, j10, lVar, (AbstractC1276k.b(obj52, bool5) || obj52 == null) ? null : (C1389K) ((l4.c) E.f7555o.f11565f).f(obj52), 49184);
            case 24:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj53 = list13.get(0);
                Boolean bool6 = obj53 != null ? (Boolean) obj53 : null;
                AbstractC1276k.c(bool6);
                boolean booleanValue = bool6.booleanValue();
                Object obj54 = list13.get(1);
                C0549k c0549k = (AbstractC1276k.b(obj54, Boolean.FALSE) || obj54 == null) ? null : (C0549k) ((l4.c) F.f7567b.f11565f).f(obj54);
                AbstractC1276k.c(c0549k);
                return new w(c0549k.a, booleanValue);
            case 25:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C0549k(((Integer) obj).intValue());
            case 26:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C0938e(((Integer) obj).intValue());
            case 27:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj55 = list14.get(0);
                d1.r rVar = (AbstractC1276k.b(obj55, Boolean.FALSE) || obj55 == null) ? null : (d1.r) ((l4.c) F.f7570e.f11565f).f(obj55);
                AbstractC1276k.c(rVar);
                int i18 = rVar.a;
                Object obj56 = list14.get(1);
                Boolean bool7 = obj56 != null ? (Boolean) obj56 : null;
                AbstractC1276k.c(bool7);
                return new d1.s(i18, bool7.booleanValue());
            case 28:
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new d1.r(((Integer) obj).intValue());
            default:
                String str9 = (String) obj;
                AbstractC1276k.f(str9, "it");
                return AbstractC0565e.z(str9);
        }
    }
}
