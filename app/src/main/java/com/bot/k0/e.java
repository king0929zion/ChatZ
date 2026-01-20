package k0;

import H0.AbstractC0157l;
import H0.F0InnerInner;
import H0.InterfaceC0169y;
import c.f;
import f0.C0987j;
import h0.AbstractC1040q;
import i4.AbstractC1121e;
import io.ktor.utils.io.u;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e extends AbstractC1040q implements F0, InterfaceC0169y {

    /* renamed from: r, reason: collision with root package name */
    public e f12595r;

    /* renamed from: s, reason: collision with root package name */
    public e f12596s;

    /* renamed from: t, reason: collision with root package name */
    public long f12597t;

    @Override // h0.AbstractC1040q
    public final void F0() {
        this.f12596s = null;
        this.f12595r = null;
    }

    public final boolean M0(C0987j c0987j) {
        e eVar = this.f12595r;
        if (eVar != null) {
            return eVar.M0(c0987j);
        }
        e eVar2 = this.f12596s;
        if (eVar2 != null) {
            return eVar2.M0(c0987j);
        }
        return false;
    }

    public final void N0(C0987j c0987j) {
        e eVar = this.f12596s;
        if (eVar != null) {
            eVar.N0(c0987j);
            return;
        }
        e eVar2 = this.f12595r;
        if (eVar2 != null) {
            eVar2.N0(c0987j);
        }
    }

    public final void O0(C0987j c0987j) {
        e eVar = this.f12596s;
        if (eVar != null) {
            eVar.O0(c0987j);
        }
        e eVar2 = this.f12595r;
        if (eVar2 != null) {
            eVar2.O0(c0987j);
        }
        this.f12595r = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [m4.w, java.lang.Object] */
    public final void P0(C0987j c0987j) {
        F0 f02;
        e eVar;
        e eVar2 = this.f12595r;
        if (eVar2 == null || !AbstractC1121e.b(eVar2, u.l(c0987j))) {
            if (this.f11806c.f11819q) {
                Object obj = new Object();
                AbstractC0157l.B(this, new f(obj, this, c0987j, 3));
                f02 = (F0) obj.f12973c;
            } else {
                f02 = null;
            }
            eVar = (e) f02;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            eVar.N0(c0987j);
            eVar.P0(c0987j);
            e eVar3 = this.f12596s;
            if (eVar3 != null) {
                eVar3.O0(c0987j);
            }
        } else if (eVar == null && eVar2 != null) {
            e eVar4 = this.f12596s;
            if (eVar4 != null) {
                eVar4.N0(c0987j);
                eVar4.P0(c0987j);
            }
            eVar2.O0(c0987j);
        } else if (!AbstractC1276k.b(eVar, eVar2)) {
            if (eVar != null) {
                eVar.N0(c0987j);
                eVar.P0(c0987j);
            }
            if (eVar2 != null) {
                eVar2.O0(c0987j);
            }
        } else if (eVar != null) {
            eVar.P0(c0987j);
        } else {
            e eVar5 = this.f12596s;
            if (eVar5 != null) {
                eVar5.P0(c0987j);
            }
        }
        this.f12595r = eVar;
    }

    public final void Q0(C0987j c0987j) {
        e eVar = this.f12596s;
        if (eVar != null) {
            eVar.Q0(c0987j);
            return;
        }
        e eVar2 = this.f12595r;
        if (eVar2 != null) {
            eVar2.Q0(c0987j);
        }
    }

    @Override // H0.F0Inner
    public final Object m() {
        return d.a;
    }

    @Override // H0.InterfaceC0169y
    public final void q(long j3) {
        this.f12597t = j3;
    }
}
