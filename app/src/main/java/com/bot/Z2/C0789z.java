package Z2;

import Q.f3;
import T.C0601d0;
import T.C0626q;
import a3.C0810H;
import b4.C0904b;
import b4.C0906d;
import b4.C0911i;
import b4.InterfaceC0907e;
import b4.InterfaceC0908f;
import b4.InterfaceC0910h;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import i4.AbstractC1117a;
import java.util.Map;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import z.C2004b;

/* renamed from: Z2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0789z implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10494c;

    public /* synthetic */ C0789z(int i6) {
        this.f10494c = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0904b c0904b;
        switch (this.f10494c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.model_services_delete_title, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q2), h5.e.j0(R.string.button_clear, c0626q2), null, ((Q.N) c0626q2.j(Q.O.a)).f5427q, c0626q2, 8, 4);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            case 2:
                C0626q c0626q3 = (C0626q) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.model_services_search_label, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            case 3:
                C0626q c0626q4 = (C0626q) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.model_services_search_placeholder, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            case 4:
                C0626q c0626q5 = (C0626q) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Q.A0.a(Y3.C.L(R.drawable.arrow_back, 0, c0626q5), h5.e.j0(R.string.settings_back, c0626q5), null, ((Q.N) c0626q5.j(Q.O.a)).f5427q, c0626q5, 8, 4);
                } else {
                    c0626q5.V();
                }
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                C0626q c0626q6 = (C0626q) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.search_service_api_key_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                } else {
                    c0626q6.V();
                }
                return X3.y.a;
            case 6:
                C0626q c0626q7 = (C0626q) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.search_service_api_key_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                } else {
                    c0626q7.V();
                }
                return X3.y.a;
            case 7:
                C0626q c0626q8 = (C0626q) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.search_service_api_key_label, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                } else {
                    c0626q8.V();
                }
                return X3.y.a;
            case 8:
                C0626q c0626q9 = (C0626q) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.search_service_api_key_placeholder, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                } else {
                    c0626q9.V();
                }
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                C0626q c0626q10 = (C0626q) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.search_service_api_key_label, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                } else {
                    c0626q10.V();
                }
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                C0626q c0626q11 = (C0626q) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.search_service_api_key_placeholder, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                } else {
                    c0626q11.V();
                }
                return X3.y.a;
            case 11:
                ((Integer) obj).intValue();
                C0810H c0810h = (C0810H) obj2;
                AbstractC1276k.f(c0810h, "state");
                return c0810h.a.a;
            case 12:
                C0626q c0626q12 = (C0626q) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q12), "关闭", null, o0.s.f13477d, c0626q12, 3128, 4);
                } else {
                    c0626q12.V();
                }
                return X3.y.a;
            case 13:
                String str = (String) obj;
                InterfaceC0908f interfaceC0908f = (InterfaceC0908f) obj2;
                AbstractC1276k.f(str, "acc");
                AbstractC1276k.f(interfaceC0908f, "element");
                if (str.length() == 0) {
                    return interfaceC0908f.toString();
                }
                return str + ", " + interfaceC0908f;
            case 14:
                InterfaceC0910h interfaceC0910h = (InterfaceC0910h) obj;
                InterfaceC0908f interfaceC0908f2 = (InterfaceC0908f) obj2;
                AbstractC1276k.f(interfaceC0910h, "acc");
                AbstractC1276k.f(interfaceC0908f2, "element");
                InterfaceC0910h h3 = interfaceC0910h.h(interfaceC0908f2.getKey());
                C0911i c0911i = C0911i.f11057c;
                if (h3 == c0911i) {
                    return interfaceC0908f2;
                }
                C0906d c0906d = C0906d.f11056c;
                InterfaceC0907e interfaceC0907e = (InterfaceC0907e) h3.r(c0906d);
                if (interfaceC0907e == null) {
                    c0904b = new C0904b(interfaceC0908f2, h3);
                } else {
                    InterfaceC0910h h6 = h3.h(c0906d);
                    if (h6 == c0911i) {
                        return new C0904b(interfaceC0907e, interfaceC0908f2);
                    }
                    c0904b = new C0904b(interfaceC0907e, new C0904b(interfaceC0908f2, h6));
                }
                return c0904b;
            case 15:
                e0.d dVar = (e0.d) obj2;
                Map map = dVar.f11553c;
                k.M m3 = dVar.f11554e;
                Object[] objArr = m3.f12485b;
                Object[] objArr2 = m3.f12486c;
                long[] jArr = m3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr[i6];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j3) < 128) {
                                    int i9 = (i6 << 3) + i8;
                                    Object obj3 = objArr[i9];
                                    Map c6 = ((e0.f) objArr2[i9]).c();
                                    if (c6.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, c6);
                                    }
                                }
                                j3 >>= 8;
                            }
                            if (i7 != 8) {
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return obj2;
            case 17:
                return Integer.valueOf(((p.P0) obj2).a.g());
            case 18:
                return Integer.valueOf(Math.round((1 + (((e1.m) obj2) != e1.m.f11576c ? 1.0f * (-1) : 1.0f)) * ((((Integer) obj).intValue() + 0) / 2.0f)));
            case 19:
                return Integer.valueOf(Math.round((1 + (((e1.m) obj2) != e1.m.f11576c ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 20:
                x.s sVar = (x.s) obj2;
                return Y4.l.I(Integer.valueOf(((C0601d0) sVar.f15548e.f378b).g()), Integer.valueOf(((C0601d0) sVar.f15548e.f379c).g()));
            case 21:
                return ((InterfaceC0910h) obj).Y((InterfaceC0908f) obj2);
            case 22:
                return ((InterfaceC0910h) obj).Y((InterfaceC0908f) obj2);
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 24:
                Map c7 = ((y.o0) obj2).c();
                if (c7.isEmpty()) {
                    return null;
                }
                return c7;
            default:
                C2004b c2004b = (C2004b) obj2;
                return Y4.l.I(Integer.valueOf(c2004b.f16051d.f16172b.g()), Float.valueOf(AbstractC1117a.e(c2004b.f16051d.f16173c.g(), -0.5f, 0.5f)), Integer.valueOf(c2004b.m()));
        }
    }
}
