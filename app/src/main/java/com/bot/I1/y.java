package I1;

import H0.z0;
import java.util.ArrayList;
import k.X;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class y extends w {

    /* renamed from: f, reason: collision with root package name */
    public final I f2601f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2602g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2603h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(I i6) {
        super(i6.b(AbstractC0230i.d(A.class)), null);
        AbstractC1276k.f(i6, "provider");
        this.f2603h = new ArrayList();
        this.f2601f = i6;
        this.f2602g = "main";
    }

    public final x c() {
        x xVar = (x) super.a();
        ArrayList arrayList = this.f2603h;
        AbstractC1276k.f(arrayList, "nodes");
        L1.l lVar = xVar.f2600i;
        lVar.getClass();
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar != null) {
                X x5 = (X) lVar.f3049f;
                x xVar2 = (x) lVar.f3048e;
                z0 z0Var = xVar2.f2592e;
                z0 z0Var2 = vVar.f2592e;
                int i8 = z0Var2.a;
                String str = (String) z0Var2.f2018e;
                if (i8 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = (String) z0Var.f2018e;
                if (str2 != null && AbstractC1276k.b(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same route as graph " + xVar2).toString());
                }
                if (i8 == z0Var.a) {
                    throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same id as graph " + xVar2).toString());
                }
                v vVar2 = (v) x5.c(i8);
                if (vVar2 == vVar) {
                    continue;
                } else {
                    if (vVar.f2593f != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (vVar2 != null) {
                        vVar2.f2593f = null;
                    }
                    vVar.f2593f = xVar2;
                    x5.e(z0Var2.a, vVar);
                }
            }
        }
        String str3 = this.f2602g;
        if (str3 == null) {
            if (this.f2595b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        x xVar3 = (x) lVar.f3048e;
        if (str3 != null) {
            if (str3.equals((String) xVar3.f2592e.f2018e)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + xVar3).toString());
            }
            if (AbstractC1776n.Q(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i9 = v.f2590h;
            i6 = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        lVar.f3045b = i6;
        lVar.f3047d = str3;
        return xVar;
    }
}
