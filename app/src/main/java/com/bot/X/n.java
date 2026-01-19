package x;

import T.C0601d0;
import i4.AbstractC1117a;
import i4.AbstractC1118b;
import i4.AbstractC1121e;
import o4.AbstractC1410a;
import r.InterfaceC1563e1;
import r.InterfaceC1623y1;
import z.C2009g;
import z.E;

/* loaded from: classes.dex */
public final class n implements InterfaceC1563e1 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1563e1 f15530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1623y1 f15531c;

    public /* synthetic */ n(InterfaceC1563e1 interfaceC1563e1, InterfaceC1623y1 interfaceC1623y1, int i6) {
        this.a = i6;
        this.f15531c = interfaceC1623y1;
        this.f15530b = interfaceC1563e1;
    }

    @Override // r.InterfaceC1563e1
    public final float a(float f6) {
        switch (this.a) {
            case 0:
                return this.f15530b.a(f6);
            default:
                return this.f15530b.a(f6);
        }
    }

            public final int b(int i6) {
        Object obj;
        switch (this.a) {
            case 0:
                l g3 = ((s) this.f15531c).g();
                if (g3.f15501k.isEmpty()) {
                    return 0;
                }
                int c6 = c();
                if (i6 > e() || c6 > i6) {
                    return ((i6 - c()) * AbstractC1121e.p(g3)) - d();
                }
                Object r02 = g3.f15501k;
                int size = r02.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        obj = r02.get(i7);
                        if (((m) obj).a != i6) {
                            i7++;
                        }
                    } else {
                        obj = null;
                    }
                }
                m mVar = (m) obj;
                if (mVar != null) {
                    return mVar.f15521o;
                }
                return 0;
            default:
                E e6 = (E) this.f15531c;
                return (int) (AbstractC1117a.g(AbstractC1118b.k(e6) + AbstractC1410a.K(((e6.o() * (i6 - e6.f16051d.f16172b.g())) - (e6.f16051d.f16173c.g() * e6.o())) + 0), e6.f16055h, e6.f16054g) - AbstractC1118b.k(e6));
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return ((C0601d0) ((s) this.f15531c).f15548e.f378b).g();
            default:
                return ((E) this.f15531c).f16052e;
        }
    }

    public final int d() {
        switch (this.a) {
            case 0:
                return ((C0601d0) ((s) this.f15531c).f15548e.f379c).g();
            default:
                return ((E) this.f15531c).f16053f;
        }
    }

        public final int e() {
        switch (this.a) {
            case 0:
                m mVar = (m) Y3.m.x0(((s) this.f15531c).g().f15501k);
                if (mVar != null) {
                    return mVar.a;
                }
                return 0;
            default:
                return ((C2009g) Y3.m.w0(((E) this.f15531c).l().a)).a;
        }
    }

    public final void f(int i6) {
        switch (this.a) {
            case 0:
                ((s) this.f15531c).j(i6);
                return;
            default:
                ((E) this.f15531c).t(i6, 0 / r1.o(), true);
                return;
        }
    }
}
