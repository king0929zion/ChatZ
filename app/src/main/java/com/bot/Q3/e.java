package Q3;

import C4.u;
import Y3.m;
import Y3.v;
import b4.InterfaceC0910h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import n4.InterfaceC1372a;
import n4.InterfaceC1374c;

/* loaded from: classes.dex */
public abstract class e {
    private volatile /* synthetic */ Object _interceptors;
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public int f6463b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6464c;

    /* renamed from: d, reason: collision with root package name */
    public u f6465d;

    public e(u... uVarArr) {
        new N3.j();
        this.a = Y4.l.K(Arrays.copyOf(uVarArr, uVarArr.length));
        this._interceptors = null;
    }

    public final Object a(Object obj, Object obj2, d4.c cVar) {
        int C5;
        InterfaceC0910h o5 = cVar.o();
        if (((List) this._interceptors) == null) {
            int i6 = this.f6463b;
            if (i6 == 0) {
                this._interceptors = v.f9812c;
                this.f6464c = false;
                this.f6465d = null;
            } else {
                ArrayList arrayList = this.a;
                if (i6 == 1 && (C5 = Y4.l.C(arrayList)) >= 0) {
                    int i7 = 0;
                    while (true) {
                        Object obj3 = arrayList.get(i7);
                        d dVar = obj3 instanceof d ? (d) obj3 : null;
                        if (dVar != null && !dVar.f6461c.isEmpty()) {
                            List list = dVar.f6461c;
                            dVar.f6462d = true;
                            this._interceptors = list;
                            this.f6464c = false;
                            this.f6465d = dVar.a;
                            break;
                        }
                        if (i7 == C5) {
                            break;
                        }
                        i7++;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int C6 = Y4.l.C(arrayList);
                if (C6 >= 0) {
                    int i8 = 0;
                    while (true) {
                        Object obj4 = arrayList.get(i8);
                        d dVar2 = obj4 instanceof d ? (d) obj4 : null;
                        if (dVar2 != null) {
                            List list2 = dVar2.f6461c;
                            arrayList2.ensureCapacity(list2.size() + arrayList2.size());
                            int size = list2.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                arrayList2.add(list2.get(i9));
                            }
                        }
                        if (i8 == C6) {
                            break;
                        }
                        i8++;
                    }
                }
                this._interceptors = arrayList2;
                this.f6464c = false;
                this.f6465d = null;
            }
        }
        this.f6464c = true;
        List list3 = (List) this._interceptors;
        AbstractC1276k.c(list3);
        boolean d6 = d();
        AbstractC1276k.f(obj, "context");
        AbstractC1276k.f(obj2, "subject");
        AbstractC1276k.f(o5, "coroutineContext");
        return ((g.a || d6) ? new b(obj, list3, obj2, o5) : new l(obj2, obj, list3)).a(obj2, cVar);
    }

    public final d b(u uVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = arrayList.get(i6);
            if (obj == uVar) {
                d dVar = new d(uVar, i.f6468e);
                arrayList.set(i6, dVar);
                return dVar;
            }
            if (obj instanceof d) {
                d dVar2 = (d) obj;
                if (dVar2.a == uVar) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final int c(u uVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = arrayList.get(i6);
            if (obj == uVar || ((obj instanceof d) && ((d) obj).a == uVar)) {
                return i6;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(u uVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = arrayList.get(i6);
            if (obj == uVar) {
                return true;
            }
            if ((obj instanceof d) && ((d) obj).a == uVar) {
                return true;
            }
        }
        return false;
    }

    public final void f(u uVar, l4.f fVar) {
        AbstractC1276k.f(uVar, "phase");
        d b5 = b(uVar);
        if (b5 == null) {
            throw new c("Phase " + uVar + " was not registered for this pipeline");
        }
        AbstractC1291z.b(3, fVar);
        List list = (List) this._interceptors;
        if (!this.a.isEmpty() && list != null && !this.f6464c && (!(list instanceof InterfaceC1372a) || (list instanceof InterfaceC1374c))) {
            if (AbstractC1276k.b(this.f6465d, uVar)) {
                list.add(fVar);
            } else if (uVar.equals(m.w0(this.a)) || c(uVar) == Y4.l.C(this.a)) {
                d b6 = b(uVar);
                AbstractC1276k.c(b6);
                b6.a(fVar);
                list.add(fVar);
            }
            this.f6463b++;
            return;
        }
        b5.a(fVar);
        this.f6463b++;
        this._interceptors = null;
        this.f6464c = false;
        this.f6465d = null;
    }
}
