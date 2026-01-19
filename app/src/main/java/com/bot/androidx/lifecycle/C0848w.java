package androidx.lifecycle;

import A4.g0;
import android.os.Looper;
import i.C1059a;
import j.AbstractC1134e;
import j.C1130a;
import j.C1132c;
import j1.AbstractC1135a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import m4.AbstractC1276k;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848w extends O {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10882e;

    /* renamed from: f, reason: collision with root package name */
    public C1130a f10883f = new C1130a();

    /* renamed from: g, reason: collision with root package name */
    public EnumC0842p f10884g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakReference f10885h;

    /* renamed from: i, reason: collision with root package name */
    public int f10886i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10887j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10888k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f10889l;

    /* renamed from: m, reason: collision with root package name */
    public final g0 f10890m;

    public C0848w(InterfaceC0846u interfaceC0846u, boolean z5) {
        this.f10882e = z5;
        EnumC0842p enumC0842p = EnumC0842p.f10876e;
        this.f10884g = enumC0842p;
        this.f10889l = new ArrayList();
        this.f10885h = new WeakReference(interfaceC0846u);
        this.f10890m = A4.W.b(enumC0842p);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.v, java.lang.Object] */
    @Override // androidx.lifecycle.O
    public final void a(InterfaceC0845t interfaceC0845t) {
        InterfaceC0844s c0834h;
        C0847v c0847v;
        InterfaceC0846u interfaceC0846u;
        AbstractC1276k.f(interfaceC0845t, "observer");
        m("addObserver");
        EnumC0842p enumC0842p = this.f10884g;
        EnumC0842p enumC0842p2 = EnumC0842p.f10875c;
        if (enumC0842p != enumC0842p2) {
            enumC0842p2 = EnumC0842p.f10876e;
        }
        ?? obj = new Object();
        HashMap hashMap = AbstractC0849x.a;
        boolean z5 = interfaceC0845t instanceof InterfaceC0844s;
        boolean z6 = interfaceC0845t instanceof InterfaceC0832f;
        if (z5 && z6) {
            c0834h = new C0834h((InterfaceC0832f) interfaceC0845t, (InterfaceC0844s) interfaceC0845t);
        } else if (z6) {
            c0834h = new C0834h((InterfaceC0832f) interfaceC0845t, (InterfaceC0844s) null);
        } else if (z5) {
            c0834h = (InterfaceC0844s) interfaceC0845t;
        } else {
            Class<?> cls = interfaceC0845t.getClass();
            if (AbstractC0849x.b(cls) == 2) {
                Object obj2 = AbstractC0849x.f10891b.get(cls);
                AbstractC1276k.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0849x.a((Constructor) list.get(0), interfaceC0845t);
                    throw null;
                }
                int size = list.size();
                InterfaceC0836j[] interfaceC0836jArr = new InterfaceC0836j[size];
                if (size > 0) {
                    AbstractC0849x.a((Constructor) list.get(0), interfaceC0845t);
                    throw null;
                }
                c0834h = new C0831e(interfaceC0836jArr, r6);
            } else {
                c0834h = new C0834h(interfaceC0845t);
            }
        }
        obj.f10881b = c0834h;
        obj.a = enumC0842p2;
        C1130a c1130a = this.f10883f;
        C1132c c1132c = (C1132c) c1130a.f12304h.get(interfaceC0845t);
        if (c1132c != null) {
            c0847v = c1132c.f12309e;
        } else {
            HashMap hashMap2 = c1130a.f12304h;
            C1132c c1132c2 = new C1132c(interfaceC0845t, obj);
            c1130a.f12303g++;
            C1132c c1132c3 = c1130a.f12301e;
            if (c1132c3 == null) {
                c1130a.f12300c = c1132c2;
                c1130a.f12301e = c1132c2;
            } else {
                c1132c3.f12310f = c1132c2;
                c1132c2.f12311g = c1132c3;
                c1130a.f12301e = c1132c2;
            }
            hashMap2.put(interfaceC0845t, c1132c2);
            c0847v = null;
        }
        if (c0847v == null && (interfaceC0846u = (InterfaceC0846u) this.f10885h.get()) != null) {
            r6 = (this.f10886i != 0 || this.f10887j) ? 1 : 0;
            EnumC0842p l3 = l(interfaceC0845t);
            this.f10886i++;
            while (obj.a.compareTo(l3) < 0 && this.f10883f.f12304h.containsKey(interfaceC0845t)) {
                EnumC0842p enumC0842p3 = obj.a;
                ArrayList arrayList = this.f10889l;
                arrayList.add(enumC0842p3);
                C0839m c0839m = EnumC0841o.Companion;
                EnumC0842p enumC0842p4 = obj.a;
                c0839m.getClass();
                AbstractC1276k.f(enumC0842p4, "state");
                int ordinal = enumC0842p4.ordinal();
                EnumC0841o enumC0841o = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0841o.ON_RESUME : EnumC0841o.ON_START : EnumC0841o.ON_CREATE;
                if (enumC0841o == null) {
                    throw new IllegalStateException("no event up from " + obj.a);
                }
                obj.a(interfaceC0846u, enumC0841o);
                arrayList.remove(arrayList.size() - 1);
                l3 = l(interfaceC0845t);
            }
            if (r6 == 0) {
                q();
            }
            this.f10886i--;
        }
    }

    @Override // androidx.lifecycle.O
    public final EnumC0842p g() {
        return this.f10884g;
    }

    @Override // androidx.lifecycle.O
    public final void j(InterfaceC0845t interfaceC0845t) {
        AbstractC1276k.f(interfaceC0845t, "observer");
        m("removeObserver");
        C1130a c1130a = this.f10883f;
        WeakHashMap weakHashMap = c1130a.f12302f;
        HashMap hashMap = c1130a.f12304h;
        C1132c c1132c = (C1132c) hashMap.get(interfaceC0845t);
        if (c1132c != null) {
            c1130a.f12303g--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((AbstractC1134e) it.next()).a(c1132c);
                }
            }
            C1132c c1132c2 = c1132c.f12311g;
            if (c1132c2 != null) {
                c1132c2.f12310f = c1132c.f12310f;
            } else {
                c1130a.f12300c = c1132c.f12310f;
            }
            C1132c c1132c3 = c1132c.f12310f;
            if (c1132c3 != null) {
                c1132c3.f12311g = c1132c2;
            } else {
                c1130a.f12301e = c1132c2;
            }
            c1132c.f12310f = null;
            c1132c.f12311g = null;
        }
        hashMap.remove(interfaceC0845t);
    }

    public final EnumC0842p l(InterfaceC0845t interfaceC0845t) {
        HashMap hashMap = this.f10883f.f12304h;
        C1132c c1132c = hashMap.containsKey(interfaceC0845t) ? ((C1132c) hashMap.get(interfaceC0845t)).f12311g : null;
        EnumC0842p enumC0842p = c1132c != null ? c1132c.f12309e.a : null;
        ArrayList arrayList = this.f10889l;
        EnumC0842p enumC0842p2 = arrayList.isEmpty() ? null : (EnumC0842p) arrayList.get(arrayList.size() - 1);
        EnumC0842p enumC0842p3 = this.f10884g;
        AbstractC1276k.f(enumC0842p3, "state1");
        if (enumC0842p == null || enumC0842p.compareTo(enumC0842p3) >= 0) {
            enumC0842p = enumC0842p3;
        }
        return (enumC0842p2 == null || enumC0842p2.compareTo(enumC0842p) >= 0) ? enumC0842p : enumC0842p2;
    }

    public final void m(String str) {
        if (this.f10882e) {
            C1059a.n0().f11933e.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC1135a.s("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void n(EnumC0841o enumC0841o) {
        AbstractC1276k.f(enumC0841o, "event");
        m("handleLifecycleEvent");
        o(enumC0841o.a());
    }

    public final void o(EnumC0842p enumC0842p) {
        if (this.f10884g == enumC0842p) {
            return;
        }
        InterfaceC0846u interfaceC0846u = (InterfaceC0846u) this.f10885h.get();
        EnumC0842p enumC0842p2 = this.f10884g;
        AbstractC1276k.f(enumC0842p2, "current");
        AbstractC1276k.f(enumC0842p, "next");
        EnumC0842p enumC0842p3 = EnumC0842p.f10876e;
        EnumC0842p enumC0842p4 = EnumC0842p.f10875c;
        if (enumC0842p2 == enumC0842p3 && enumC0842p == enumC0842p4) {
            throw new IllegalStateException(("State must be at least '" + EnumC0842p.f10877f + "' to be moved to '" + enumC0842p + "' in component " + interfaceC0846u).toString());
        }
        if (enumC0842p2 == enumC0842p4 && enumC0842p2 != enumC0842p) {
            throw new IllegalStateException(("State is '" + enumC0842p4 + "' and cannot be moved to `" + enumC0842p + "` in component " + interfaceC0846u).toString());
        }
        this.f10884g = enumC0842p;
        if (this.f10887j || this.f10886i != 0) {
            this.f10888k = true;
            return;
        }
        this.f10887j = true;
        q();
        this.f10887j = false;
        if (this.f10884g == enumC0842p4) {
            this.f10883f = new C1130a();
        }
    }

    public final void p(EnumC0842p enumC0842p) {
        AbstractC1276k.f(enumC0842p, "state");
        m("setCurrentState");
        o(enumC0842p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r12.f10888k = false;
        r12.f10890m.k(r12.f10884g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0848w.q():void");
    }
}
