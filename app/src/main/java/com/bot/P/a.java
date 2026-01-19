package P;

import B0.B;
import H0.AbstractC0157l;
import H0.C0158m;
import H0.InterfaceC0154i;
import H0.InterfaceC0160o;
import H0.InterfaceC0169y;
import H0.L;
import M.q;
import Q.X;
import Q.Y;
import Y4.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC0961c;
import f0.C0987j;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k.I;
import m4.AbstractC1276k;
import n.C1316c;
import n0.C1353b;
import n0.C1356e;
import o0.AbstractC1392c;
import o0.s;
import o4.AbstractC1410a;
import q0.C1496b;
import q0.InterfaceC1498d;
import t.C1682j;
import t.C1683k;
import t.C1684l;
import t.C1685m;
import t.InterfaceC1686n;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class a extends AbstractC1040q implements InterfaceC0154i, InterfaceC0160o, InterfaceC0169y {

    /* renamed from: B, reason: collision with root package name */
    public d f4390B;

    /* renamed from: C, reason: collision with root package name */
    public e f4391C;

    /* renamed from: r, reason: collision with root package name */
    public final C1682j f4392r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4393s;

    /* renamed from: t, reason: collision with root package name */
    public final float f4394t;

    /* renamed from: u, reason: collision with root package name */
    public final Y f4395u;

    /* renamed from: v, reason: collision with root package name */
    public final X f4396v;

    /* renamed from: w, reason: collision with root package name */
    public B f4397w;

    /* renamed from: x, reason: collision with root package name */
    public float f4398x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4400z;

    /* renamed from: y, reason: collision with root package name */
    public long f4399y = 0;

    /* renamed from: A, reason: collision with root package name */
    public final I f4389A = new I();

    public a(C1682j c1682j, boolean z5, float f6, Y y5, X x5) {
        this.f4392r = c1682j;
        this.f4393s = z5;
        this.f4394t = f6;
        this.f4395u = y5;
        this.f4396v = x5;
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        AbstractC1888A.y(A0(), null, new g(this, null), 3);
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        d dVar = this.f4390B;
        if (dVar != null) {
            this.f4391C = null;
            AbstractC0157l.k(this);
            q qVar = dVar.f4407g;
            e eVar = (e) ((LinkedHashMap) qVar.f3179e).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) qVar.f3179e;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.f4406f.add(eVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M0(InterfaceC1686n interfaceC1686n) {
        View view;
        d dVar;
        if (!(interfaceC1686n instanceof C1684l)) {
            if (interfaceC1686n instanceof C1685m) {
                C1684l c1684l = ((C1685m) interfaceC1686n).a;
                e eVar = this.f4391C;
                if (eVar != null) {
                    eVar.d();
                    return;
                }
                return;
            }
            if (interfaceC1686n instanceof C1683k) {
                C1684l c1684l2 = ((C1683k) interfaceC1686n).a;
                e eVar2 = this.f4391C;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            return;
        }
        C1684l c1684l3 = (C1684l) interfaceC1686n;
        long j3 = this.f4399y;
        float f6 = this.f4398x;
        d dVar2 = this.f4390B;
        d dVar3 = dVar2;
        if (dVar2 == null) {
            Object obj = (View) AbstractC0157l.h(this, AndroidCompositionLocals_androidKt.f10784f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    d dVar4 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar4);
                    dVar = dVar4;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i6);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i6++;
                }
            }
            this.f4390B = dVar;
            AbstractC1276k.c(dVar);
            dVar3 = dVar;
        }
        ArrayList arrayList = dVar3.f4405e;
        q qVar = dVar3.f4407g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) qVar.f3179e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) qVar.f3179e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) qVar.f3180f;
        e eVar3 = (e) linkedHashMap.get(this);
        View view2 = eVar3;
        if (eVar3 == null) {
            ArrayList arrayList2 = dVar3.f4406f;
            AbstractC1276k.f(arrayList2, "<this>");
            e eVar4 = (e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            View view3 = eVar4;
            if (eVar4 == null) {
                if (dVar3.f4408h > l.C(arrayList)) {
                    View view4 = new View(dVar3.getContext());
                    dVar3.addView(view4);
                    arrayList.add(view4);
                    view = view4;
                } else {
                    e eVar5 = (e) arrayList.get(dVar3.f4408h);
                    a aVar = (a) linkedHashMap3.get(eVar5);
                    view = eVar5;
                    if (aVar != null) {
                        aVar.f4391C = null;
                        AbstractC0157l.k(aVar);
                        e eVar6 = (e) linkedHashMap2.get(aVar);
                        if (eVar6 != null) {
                        }
                        linkedHashMap2.remove(aVar);
                        eVar5.c();
                        view = eVar5;
                    }
                }
                int i7 = dVar3.f4408h;
                if (i7 < dVar3.f4404c - 1) {
                    dVar3.f4408h = i7 + 1;
                    view3 = view;
                } else {
                    dVar3.f4408h = 0;
                    view3 = view;
                }
            }
            linkedHashMap2.put(this, view3);
            linkedHashMap3.put(view3, this);
            view2 = view3;
        }
        e eVar7 = view2;
        eVar7.b(c1684l3, this.f4393s, j3, AbstractC1410a.K(f6), this.f4395u.a(), ((b) this.f4396v.b()).f4403d, new A.b(this, 20));
        this.f4391C = eVar7;
        AbstractC0157l.k(this);
    }

    @Override // H0.InterfaceC0160o
    public final void k0(L l3) {
        C1496b c1496b = l3.f1765c;
        l3.b();
        B b5 = this.f4397w;
        if (b5 != null) {
            float f6 = this.f4398x;
            long a = this.f4395u.a();
            float floatValue = ((Number) ((C1316c) b5.f379c).d()).floatValue();
            if (floatValue > S.l.f7374V) {
                long c6 = s.c(floatValue, a);
                if (b5.a) {
                    float d6 = C1356e.d(c1496b.c());
                    float b6 = C1356e.b(c1496b.c());
                    C0158m c0158m = c1496b.f13944e;
                    long j3 = c0158m.j();
                    c0158m.g().h();
                    try {
                        ((C0158m) ((C0987j) c0158m.f1972e).f11690e).g().m(S.l.f7374V, S.l.f7374V, d6, b6, 1);
                        InterfaceC1498d.c0(l3, c6, f6, 0L, null, 124);
                    } finally {
                        AbstractC1135a.q(c0158m, j3);
                    }
                } else {
                    InterfaceC1498d.c0(l3, c6, f6, 0L, null, 124);
                }
            }
        }
        o0.q g3 = c1496b.f13944e.g();
        e eVar = this.f4391C;
        if (eVar != null) {
            eVar.e(this.f4399y, AbstractC1410a.K(this.f4398x), this.f4395u.a(), ((b) this.f4396v.b()).f4403d);
            eVar.draw(AbstractC1392c.a(g3));
        }
    }

    @Override // H0.InterfaceC0169y
    public final void q(long j3) {
        float e02;
        this.f4400z = true;
        InterfaceC0961c interfaceC0961c = AbstractC0157l.v(this).f1714C;
        this.f4399y = AbstractC1410a.S(j3);
        float f6 = this.f4394t;
        if (Float.isNaN(f6)) {
            long j4 = this.f4399y;
            float f7 = c.a;
            float d6 = C1356e.d(j4);
            float b5 = C1356e.b(j4);
            e02 = C1353b.d((Float.floatToRawIntBits(b5) & 4294967295L) | (Float.floatToRawIntBits(d6) << 32)) / 2.0f;
            if (this.f4393s) {
                e02 += interfaceC0961c.e0(c.a);
            }
        } else {
            e02 = interfaceC0961c.e0(f6);
        }
        this.f4398x = e02;
        I i6 = this.f4389A;
        Object[] objArr = i6.a;
        int i7 = i6.f12466b;
        for (int i8 = 0; i8 < i7; i8++) {
            M0((InterfaceC1686n) objArr[i8]);
        }
        i6.d();
    }
}
