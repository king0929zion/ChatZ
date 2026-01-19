package I1;

import H0.C0158m;
import java.util.ArrayList;
import java.util.Iterator;
import k.X;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;
import t4.C1729a;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public class x extends v implements Iterable, InterfaceC1372a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f2599j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final L1.l f2600i;

    public x(A a) {
        super(a);
        this.f2600i = new L1.l(this);
    }

    @Override // I1.v
    public final u c(C0158m c0158m) {
        u c6 = super.c(c0158m);
        L1.l lVar = this.f2600i;
        lVar.getClass();
        return lVar.x(c6, c0158m, false, (x) lVar.f3048e);
    }

    public final u d(C0158m c0158m, v vVar) {
        return this.f2600i.x(super.c(c0158m), c0158m, true, vVar);
    }

    public final u e(String str, boolean z5, v vVar) {
        u uVar;
        AbstractC1276k.f(str, "route");
        L1.l lVar = this.f2600i;
        lVar.getClass();
        x xVar = (x) lVar.f3048e;
        u b5 = xVar.f2592e.b(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = xVar.iterator();
        while (true) {
            L1.k kVar = (L1.k) it;
            uVar = null;
            if (!kVar.hasNext()) {
                break;
            }
            v vVar2 = (v) kVar.next();
            if (!AbstractC1276k.b(vVar2, vVar)) {
                if (vVar2 instanceof x) {
                    uVar = ((x) vVar2).e(str, false, xVar);
                } else {
                    vVar2.getClass();
                    uVar = vVar2.f2592e.b(str);
                }
            }
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        u uVar2 = (u) Y3.m.y0(arrayList);
        x xVar2 = xVar.f2593f;
        if (xVar2 != null && z5 && !xVar2.equals(vVar)) {
            uVar = xVar2.e(str, true, xVar);
        }
        return (u) Y3.m.y0(Y3.k.r0(new u[]{b5, uVar2, uVar}));
    }

    @Override // I1.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x) || !super.equals(obj)) {
            return false;
        }
        L1.l lVar = this.f2600i;
        int f6 = ((X) lVar.f3049f).f();
        L1.l lVar2 = ((x) obj).f2600i;
        if (f6 != ((X) lVar2.f3049f).f() || lVar.f3045b != lVar2.f3045b) {
            return false;
        }
        X x5 = (X) lVar.f3049f;
        AbstractC1276k.f(x5, "<this>");
        Iterator it = ((C1729a) t4.j.p(new K4.h(x5, 6))).iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (!vVar.equals(((X) lVar2.f3049f).c(vVar.f2592e.a))) {
                return false;
            }
        }
        return true;
    }

    @Override // I1.v
    public final int hashCode() {
        L1.l lVar = this.f2600i;
        int i6 = lVar.f3045b;
        X x5 = (X) lVar.f3049f;
        int f6 = x5.f();
        for (int i7 = 0; i7 < f6; i7++) {
            i6 = (((i6 * 31) + x5.d(i7)) * 31) + ((v) x5.g(i7)).hashCode();
        }
        return i6;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        L1.l lVar = this.f2600i;
        lVar.getClass();
        return new L1.k(lVar);
    }

    @Override // I1.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        L1.l lVar = this.f2600i;
        String str = lVar.f3047d;
        lVar.getClass();
        v t5 = (str == null || AbstractC1776n.Q(str)) ? null : lVar.t(str, true);
        if (t5 == null) {
            t5 = lVar.s(lVar.f3045b);
        }
        sb.append(" startDestination=");
        if (t5 == null) {
            String str2 = lVar.f3047d;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = lVar.f3046c;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(lVar.f3045b));
                }
            }
        } else {
            sb.append("{");
            sb.append(t5.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
