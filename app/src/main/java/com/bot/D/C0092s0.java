package D;

import I0.C0207s0;
import m4.AbstractC1276k;

/* renamed from: D.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092s0 {
    public final I0.S0 a;

    /* renamed from: b, reason: collision with root package name */
    public C0094t0 f1155b;

    /* renamed from: c, reason: collision with root package name */
    public m0.n f1156c;

    public C0092s0(I0.S0 s02) {
        this.a = s02;
    }

    public final C0094t0 a() {
        C0094t0 c0094t0 = this.f1155b;
        if (c0094t0 != null) {
            return c0094t0;
        }
        AbstractC1276k.k("keyboardActions");
        throw null;
    }

    public final boolean b(int i6) {
        l4.c cVar;
        I0.S0 s02;
        if (i6 == 7) {
            cVar = a().a;
        } else {
            if (i6 == 2) {
                a();
            } else if (i6 == 6) {
                a();
            } else if (i6 == 5) {
                a();
            } else if (i6 == 3) {
                a();
            } else if (i6 == 4) {
                a();
            } else if (i6 != 1 && i6 != 0) {
                throw new IllegalStateException("invalid ImeAction");
            }
            cVar = null;
        }
        if (cVar != null) {
            cVar.f(this);
            return true;
        }
        if (i6 == 6) {
            m0.n nVar = this.f1156c;
            if (nVar != null) {
                ((m0.q) nVar).i(1, true);
                return true;
            }
            AbstractC1276k.k("focusManager");
            throw null;
        }
        if (i6 != 5) {
            if (i6 != 7 || (s02 = this.a) == null) {
                return false;
            }
            ((C0207s0) s02).a();
            return true;
        }
        m0.n nVar2 = this.f1156c;
        if (nVar2 != null) {
            ((m0.q) nVar2).i(2, true);
            return true;
        }
        AbstractC1276k.k("focusManager");
        throw null;
    }
}
