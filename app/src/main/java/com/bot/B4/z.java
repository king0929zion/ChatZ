package B4;

import D.Z0;
import F0.U;
import O.z0;
import P2.L0;
import Q.C0405d2;
import Q.EnumC0409e2;
import Q.f3;
import R2.AbstractC0530j;
import S0.C0543e;
import S0.C0545g;
import S0.C0551m;
import S0.O;
import T.C0626q;
import android.os.Bundle;
import android.os.Parcelable;
import b4.InterfaceC0908f;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import d1.C0934a;
import e0.C0957b;
import i4.AbstractC1118b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;
import n0.C1353b;
import o0.C1389K;
import o4.AbstractC1410a;
import r.X0;
import s4.InterfaceC1672b;
import v.AbstractC1787b;
import x4.u0;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f641c;

    public /* synthetic */ z(int i6) {
        this.f641c = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        Bundle bundle;
        switch (this.f641c) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                InterfaceC0908f interfaceC0908f = (InterfaceC0908f) obj2;
                if (!(interfaceC0908f instanceof u0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC0908f : Integer.valueOf(intValue + 1);
            case 2:
                u0 u0Var = (u0) obj;
                InterfaceC0908f interfaceC0908f2 = (InterfaceC0908f) obj2;
                if (u0Var != null) {
                    return u0Var;
                }
                if (interfaceC0908f2 instanceof u0) {
                    return (u0) interfaceC0908f2;
                }
                return null;
            case 3:
                C4.z zVar = (C4.z) obj;
                InterfaceC0908f interfaceC0908f3 = (InterfaceC0908f) obj2;
                if (interfaceC0908f3 instanceof u0) {
                    u0 u0Var2 = (u0) interfaceC0908f3;
                    Object u5 = u0Var2.u(zVar.a);
                    Object[] objArr = zVar.f723b;
                    int i6 = zVar.f725d;
                    objArr[i6] = u5;
                    u0[] u0VarArr = zVar.f724c;
                    zVar.f725d = i6 + 1;
                    u0VarArr[i6] = u0Var2;
                }
                return zVar;
            case 4:
                Z0 z02 = (Z0) obj2;
                return Y4.l.I(Float.valueOf(z02.a.g()), Boolean.valueOf(((X0) z02.f972f.getValue()) == X0.f14183c));
            case AbstractC1787b.f15290g /* 5 */:
                InterfaceC1672b interfaceC1672b = (InterfaceC1672b) obj;
                List list = (List) obj2;
                AbstractC1276k.f(interfaceC1672b, "clazz");
                AbstractC1276k.f(list, "types");
                ArrayList P5 = AbstractC1410a.P(P4.a.a, list, true);
                AbstractC1276k.c(P5);
                return AbstractC1410a.A(interfaceC1672b, P5, new I4.f(list, 0));
            case 6:
                InterfaceC1672b interfaceC1672b2 = (InterfaceC1672b) obj;
                List list2 = (List) obj2;
                AbstractC1276k.f(interfaceC1672b2, "clazz");
                AbstractC1276k.f(list2, "types");
                ArrayList P6 = AbstractC1410a.P(P4.a.a, list2, true);
                AbstractC1276k.c(P6);
                KSerializer A5 = AbstractC1410a.A(interfaceC1672b2, P6, new I4.f(list2, 1));
                if (A5 != null) {
                    return Y4.d.J(A5);
                }
                return null;
            case 7:
                I1.B b5 = (I1.B) obj2;
                L1.i iVar = b5.f2518b;
                LinkedHashMap linkedHashMap = iVar.f3026m;
                Y3.j jVar = iVar.f3019f;
                LinkedHashMap linkedHashMap2 = iVar.f3025l;
                ArrayList arrayList = new ArrayList();
                Bundle d6 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                for (Map.Entry entry : Y3.B.d0(iVar.f3032s.a).entrySet()) {
                    ((I1.H) entry.getValue()).getClass();
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                    AbstractC1410a.H(d6, "android-support-nav:controller:navigatorState:names", arrayList);
                    AbstractC1410a.F(bundle, "android-support-nav:controller:navigatorState", d6);
                }
                if (!jVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator<E> it = jVar.iterator();
                    while (it.hasNext()) {
                        I1.j jVar2 = (I1.j) it.next();
                        AbstractC1276k.f(jVar2, "entry");
                        int i7 = jVar2.f2544e.f2592e.a;
                        String str = jVar2.f2548i;
                        L1.c cVar = jVar2.f2550k;
                        Bundle a = cVar.a();
                        Bundle d7 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                        cVar.f2996h.t(d7);
                        Bundle d8 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                        AbstractC1410a.G("nav-entry-state:id", str, d8);
                        d8.putInt("nav-entry-state:destination-id", i7);
                        if (a == null) {
                            a = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                        }
                        AbstractC1410a.F(d8, "nav-entry-state:args", a);
                        AbstractC1410a.F(d8, "nav-entry-state:saved-state", d7);
                        arrayList2.add(d8);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i8 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue2 = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        int i9 = i8 + 1;
                        iArr[i8] = intValue2;
                        if (str2 == null) {
                            str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                        }
                        arrayList3.add(str2);
                        i8 = i9;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    AbstractC1410a.H(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        Y3.j jVar3 = (Y3.j) entry3.getValue();
                        arrayList4.add(str3);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = jVar3.iterator();
                        while (it2.hasNext()) {
                            L1.d dVar = ((I1.k) it2.next()).a;
                            dVar.getClass();
                            Bundle d9 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                            AbstractC1410a.G("nav-entry-state:id", (String) dVar.f3002b, d9);
                            d9.putInt("nav-entry-state:destination-id", dVar.a);
                            Bundle bundle2 = (Bundle) dVar.f3003c;
                            if (bundle2 == null) {
                                bundle2 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                            }
                            AbstractC1410a.F(d9, "nav-entry-state:args", bundle2);
                            AbstractC1410a.F(d9, "nav-entry-state:saved-state", (Bundle) dVar.f3004d);
                            arrayList5.add(d9);
                        }
                        String str4 = "android-support-nav:controller:backStackStates:" + str3;
                        AbstractC1276k.f(str4, "key");
                        bundle.putParcelableArrayList(str4, arrayList5);
                    }
                    AbstractC1410a.H(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (b5.f2521e) {
                    if (bundle == null) {
                        bundle = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", b5.f2521e);
                }
                return bundle;
            case 8:
                return Long.valueOf(((z0) obj2).f4266d.get());
            case AbstractC1787b.f15287d /* 9 */:
                ((Integer) obj2).getClass();
                L0.e(T.r.J(1), (C0626q) obj);
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                return Integer.valueOf(((U) obj).a0(((Integer) obj2).intValue()));
            case 11:
                return Integer.valueOf(((U) obj).q(((Integer) obj2).intValue()));
            case 12:
                return Integer.valueOf(((U) obj).d(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((U) obj).o(((Integer) obj2).intValue()));
            case 14:
                return (EnumC0409e2) ((C0405d2) obj2).f5767d.f6830g.getValue();
            case 15:
                C0626q c0626q = (C0626q) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c0626q.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.chat_rename_dialog_title, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                C0626q c0626q2 = (C0626q) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.chat_rename_dialog_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            case 17:
                C0626q c0626q3 = (C0626q) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c0626q3.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.chat_delete_dialog_title, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            case 18:
                C0626q c0626q4 = (C0626q) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c0626q4.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.chat_delete_dialog_message, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC0530j.h(T.r.J(1), (C0626q) obj);
                return X3.y.a;
            case 20:
                C0545g c0545g = (C0545g) obj2;
                return Y4.l.m(c0545g.f7630e, S0.E.a(c0545g.f7629c, S0.E.a, (C0957b) obj));
            case 21:
                return Integer.valueOf(((d1.l) obj2).a);
            case 22:
                d1.p pVar = (d1.p) obj2;
                return Y4.l.m(Float.valueOf(pVar.a), Float.valueOf(pVar.f11397b));
            case 23:
                C0957b c0957b = (C0957b) obj;
                d1.q qVar = (d1.q) obj2;
                e1.o oVar = new e1.o(qVar.a);
                S0.D d10 = S0.E.f7562v;
                return Y4.l.m(S0.E.a(oVar, d10, c0957b), S0.E.a(new e1.o(qVar.f11399b), d10, c0957b));
            case 24:
                return Integer.valueOf(((W0.k) obj2).f8840c);
            case 25:
                C0551m c0551m = (C0551m) obj2;
                return Y4.l.m(c0551m.a, S0.E.a(c0551m.f7642b, S0.E.f7549i, (C0957b) obj));
            case 26:
                return Float.valueOf(((C0934a) obj2).a);
            case 27:
                C0957b c0957b2 = (C0957b) obj;
                List list3 = (List) obj2;
                ArrayList arrayList6 = new ArrayList(list3.size());
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList6.add(S0.E.a((C0543e) list3.get(i10), S0.E.f7542b, c0957b2));
                }
                return arrayList6;
            case 28:
                O o5 = (O) obj2;
                return Y4.l.m(Integer.valueOf((int) (o5.a >> 32)), Integer.valueOf((int) (o5.a & 4294967295L)));
            default:
                C0957b c0957b3 = (C0957b) obj;
                C1389K c1389k = (C1389K) obj2;
                return Y4.l.m(S0.E.a(new o0.s(c1389k.a), S0.E.f7556p, c0957b3), S0.E.a(new C1353b(c1389k.f13436b), S0.E.f7564x, c0957b3), Float.valueOf(c1389k.f13437c));
        }
    }
}
