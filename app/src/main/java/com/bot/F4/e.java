package F4;

import C4.s;
import C4.u;
import X3.y;
import Y3.m;
import Y4.l;
import b4.InterfaceC0910h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import m4.InterfaceC1273h;
import x4.D0;
import x4.InterfaceC1926i;
import x4.InterfaceC1927j;

/* loaded from: classes.dex */
public final class e implements InterfaceC1926i, f, D0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1620i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0910h f1621c;

    /* renamed from: f, reason: collision with root package name */
    public Object f1623f;
    private volatile /* synthetic */ Object state$volatile = h.a;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1622e = new ArrayList(2);

    /* renamed from: g, reason: collision with root package name */
    public int f1624g = -1;

    /* renamed from: h, reason: collision with root package name */
    public Object f1625h = h.f1629d;

    public e(InterfaceC0910h interfaceC0910h) {
        this.f1621c = interfaceC0910h;
    }

    @Override // x4.D0
    public final void a(s sVar, int i6) {
        this.f1623f = sVar;
        this.f1624g = i6;
    }

    @Override // x4.InterfaceC1926i
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1620i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f1627b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h.f1628c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f1622e;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj2 = arrayList.get(i6);
                i6++;
                ((c) obj2).a();
            }
            this.f1625h = h.f1629d;
            this.f1622e = null;
            return;
        }
    }

    public final Object c(d4.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1620i;
        Object obj = atomicReferenceFieldUpdater.get(this);
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar2 = (c) obj;
        Object obj2 = this.f1625h;
        ArrayList arrayList = this.f1622e;
        if (arrayList != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList.get(i6);
                i6++;
                c cVar3 = (c) obj3;
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.f1627b);
            this.f1625h = h.f1629d;
            this.f1622e = null;
        }
        Object d6 = cVar2.f1609c.d(cVar2.a, cVar2.f1610d, obj2);
        InterfaceC1273h interfaceC1273h = cVar2.f1611e;
        return cVar2.f1610d == h.f1630e ? ((l4.c) interfaceC1273h).f(cVar) : ((l4.e) interfaceC1273h).m(d6, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(d4.c r11) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F4.e.d(d4.c):java.lang.Object");
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.f1622e;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            Object obj3 = arrayList.get(i6);
            i6++;
            if (((c) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z5) {
        Object obj = cVar.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1620i;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z5) {
            ArrayList arrayList = this.f1622e;
            AbstractC1276k.c(arrayList);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    if (((c) obj2).a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        cVar.f1608b.d(obj, this, cVar.f1610d);
        if (this.f1625h != h.f1629d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z5) {
            ArrayList arrayList2 = this.f1622e;
            AbstractC1276k.c(arrayList2);
            arrayList2.add(cVar);
        }
        cVar.f1613g = this.f1623f;
        cVar.f1614h = this.f1624g;
        this.f1623f = null;
        this.f1624g = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1620i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC1927j)) {
                if (AbstractC1276k.b(obj3, h.f1627b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (AbstractC1276k.b(obj3, h.f1628c)) {
                    return 2;
                }
                if (AbstractC1276k.b(obj3, h.a)) {
                    List H3 = l.H(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, H3)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList A02 = m.A0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, A02)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            c e6 = e(obj);
            if (e6 != null) {
                l4.f fVar = e6.f1612f;
                l4.f fVar2 = fVar != null ? (l4.f) fVar.d(this, e6.f1610d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, e6)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                InterfaceC1927j interfaceC1927j = (InterfaceC1927j) obj3;
                this.f1625h = obj2;
                u l3 = interfaceC1927j.l(y.a, fVar2);
                if (l3 == null) {
                    this.f1625h = h.f1629d;
                    return 2;
                }
                interfaceC1927j.z(l3);
                return 0;
            }
            continue;
        }
    }
}
