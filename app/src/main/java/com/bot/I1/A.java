package I1;

import H0.z0;
import android.os.Bundle;
import i4.AbstractC1118b;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k.X;
import m4.AbstractC1276k;

@G("navigation")
/* loaded from: classes.dex */
public class A extends H {

    /* renamed from: c, reason: collision with root package name */
    public final I f2517c;

    public A(I i6) {
        AbstractC1276k.f(i6, "navigatorProvider");
        this.f2517c = i6;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [m4.w, java.lang.Object] */
    @Override // I1.H
    public final void d(List list, D d6) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            v vVar = jVar.f2544e;
            AbstractC1276k.d(vVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            x xVar = (x) vVar;
            z0 z0Var = xVar.f2592e;
            Object obj = new Object();
            obj.f12973c = jVar.f2550k.a();
            L1.l lVar = xVar.f2600i;
            int i6 = lVar.f3045b;
            String str = lVar.f3047d;
            if (i6 == 0 && str == null) {
                z0Var.getClass();
                String valueOf = String.valueOf(z0Var.a);
                AbstractC1276k.f(valueOf, "superName");
                if (((x) lVar.f3048e).f2592e.a == 0) {
                    valueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(valueOf).toString());
            }
            v t5 = str != null ? lVar.t(str, false) : (v) ((X) lVar.f3049f).c(i6);
            if (t5 == null) {
                if (lVar.f3046c == null) {
                    String str2 = lVar.f3047d;
                    if (str2 == null) {
                        str2 = String.valueOf(lVar.f3045b);
                    }
                    lVar.f3046c = str2;
                }
                String str3 = lVar.f3046c;
                AbstractC1276k.c(str3);
                throw new IllegalArgumentException(AbstractC1135a.s("navigation destination ", str3, " is not a direct child of this NavGraph"));
            }
            z0 z0Var2 = t5.f2592e;
            if (str != null) {
                if (!str.equals((String) z0Var2.f2018e)) {
                    u b5 = z0Var2.b(str);
                    Bundle bundle = b5 != null ? b5.f2586e : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle d7 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                        d7.putAll(bundle);
                        Bundle bundle2 = (Bundle) obj.f12973c;
                        if (bundle2 != null) {
                            d7.putAll(bundle2);
                        }
                        obj.f12973c = d7;
                    }
                }
                if (t5.b().isEmpty()) {
                    continue;
                } else {
                    ArrayList e6 = AbstractC0230i.e(t5.b(), new z(obj, 0));
                    if (!e6.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + t5 + ". Missing required arguments [" + e6 + ']').toString());
                    }
                }
            }
            this.f2517c.b(t5.f2591c).d(Y4.l.H(b().b(t5, t5.a((Bundle) obj.f12973c))), d6);
        }
    }

    @Override // I1.H
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public x a() {
        return new x(this);
    }
}
