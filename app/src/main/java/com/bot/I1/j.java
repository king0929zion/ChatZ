package I1;

import android.os.Bundle;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.InterfaceC0837k;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.O;
import androidx.lifecycle.W;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class j implements InterfaceC0846u, a0, InterfaceC0837k, U1.e {

    /* renamed from: c, reason: collision with root package name */
    public final L1.e f2543c;

    /* renamed from: e, reason: collision with root package name */
    public v f2544e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f2545f;

    /* renamed from: g, reason: collision with root package name */
    public EnumC0842p f2546g;

    /* renamed from: h, reason: collision with root package name */
    public final o f2547h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2548i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f2549j;

    /* renamed from: k, reason: collision with root package name */
    public final L1.c f2550k = new L1.c(this);

    public j(L1.e eVar, v vVar, Bundle bundle, EnumC0842p enumC0842p, o oVar, String str, Bundle bundle2) {
        this.f2543c = eVar;
        this.f2544e = vVar;
        this.f2545f = bundle;
        this.f2546g = enumC0842p;
        this.f2547h = oVar;
        this.f2548i = str;
        this.f2549j = bundle2;
        X3.a.d(new A.b(this, 9));
    }

    public final void b(EnumC0842p enumC0842p) {
        L1.c cVar = this.f2550k;
        cVar.getClass();
        cVar.f2999k = enumC0842p;
        cVar.b();
    }

    @Override // androidx.lifecycle.InterfaceC0837k
    public final W c() {
        return this.f2550k.f3000l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // androidx.lifecycle.InterfaceC0837k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F1.f d() {
        /*
            r5 = this;
            L1.c r0 = r5.f2550k
            r0.getClass()
            F1.f r1 = new F1.f
            r1.<init>()
            z3.F r2 = androidx.lifecycle.O.a
            I1.j r3 = r0.a
            java.util.LinkedHashMap r4 = r1.a
            r4.put(r2, r3)
            androidx.lifecycle.N r2 = androidx.lifecycle.O.f10850b
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L23
            androidx.lifecycle.N r2 = androidx.lifecycle.O.f10851c
            r4.put(r2, r0)
        L23:
            r0 = 0
            L1.e r2 = r5.f2543c
            if (r2 == 0) goto L39
            android.content.Context r2 = r2.a
            if (r2 == 0) goto L31
            android.content.Context r2 = r2.getApplicationContext()
            goto L32
        L31:
            r2 = r0
        L32:
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L39
            android.app.Application r2 = (android.app.Application) r2
            goto L3a
        L39:
            r2 = r0
        L3a:
            if (r2 == 0) goto L3d
            r0 = r2
        L3d:
            if (r0 == 0) goto L44
            androidx.lifecycle.N r2 = androidx.lifecycle.V.f10863d
            r4.put(r2, r0)
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.j.d():F1.f");
    }

    @Override // androidx.lifecycle.a0
    public final Z e() {
        L1.c cVar = this.f2550k;
        if (!cVar.f2997i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.f2998j.f10884g == EnumC0842p.f10875c) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        o oVar = cVar.f2993e;
        if (oVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = cVar.f2994f;
        AbstractC1276k.f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = oVar.f2562b;
        Z z5 = (Z) linkedHashMap.get(str);
        if (z5 != null) {
            return z5;
        }
        Z z6 = new Z();
        linkedHashMap.put(str, z6);
        return z6;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            Bundle bundle = jVar.f2545f;
            if (AbstractC1276k.b(this.f2548i, jVar.f2548i) && AbstractC1276k.b(this.f2544e, jVar.f2544e) && AbstractC1276k.b(this.f2550k.f2998j, jVar.f2550k.f2998j) && AbstractC1276k.b(f(), jVar.f())) {
                Bundle bundle2 = this.f2545f;
                if (AbstractC1276k.b(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!AbstractC1276k.b(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // U1.e
    public final M.q f() {
        return (M.q) this.f2550k.f2996h.f3180f;
    }

    @Override // androidx.lifecycle.InterfaceC0846u
    public final O g() {
        return this.f2550k.f2998j;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f2544e.hashCode() + (this.f2548i.hashCode() * 31);
        Bundle bundle = this.f2545f;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i6 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i6 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return f().hashCode() + ((this.f2550k.f2998j.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f2550k.toString();
    }
}
