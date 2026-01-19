package e0;

import H0.C0158m;
import i4.AbstractC1120d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k.M;
import k.V;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: c, reason: collision with root package name */
    public final l4.c f11557c;

    /* renamed from: e, reason: collision with root package name */
    public final M f11558e;

    /* renamed from: f, reason: collision with root package name */
    public M f11559f;

    public g(Map map, l4.c cVar) {
        M m3;
        this.f11557c = cVar;
        if (map == null || map.isEmpty()) {
            m3 = null;
        } else {
            m3 = new M(map.size());
            for (Map.Entry entry : map.entrySet()) {
                m3.m(entry.getKey(), entry.getValue());
            }
        }
        this.f11558e = m3;
    }

    @Override // e0.f
    public final boolean b(Object obj) {
        return ((Boolean) this.f11557c.f(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // e0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.g.c():java.util.Map");
    }

    @Override // e0.f
    public final Object d(String str) {
        M m3 = this.f11558e;
        List list = m3 != null ? (List) m3.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && m3 != null) {
            List subList = list.subList(1, list.size());
            int f6 = m3.f(str);
            if (f6 < 0) {
                f6 = ~f6;
            }
            Object[] objArr = m3.f12486c;
            Object obj = objArr[f6];
            m3.f12485b[f6] = str;
            objArr[f6] = subList;
        }
        return list.get(0);
    }

    @Override // e0.f
    public final e e(String str, InterfaceC1193a interfaceC1193a) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (!AbstractC1120d.r(str.charAt(i6))) {
                M m3 = this.f11559f;
                if (m3 == null) {
                    long[] jArr = V.a;
                    m3 = new M();
                    this.f11559f = m3;
                }
                Object g3 = m3.g(str);
                if (g3 == null) {
                    g3 = new ArrayList();
                    m3.m(str, g3);
                }
                ((List) g3).add(interfaceC1193a);
                return new C0158m(m3, str, interfaceC1193a, 9);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
