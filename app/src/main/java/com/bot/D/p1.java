package D;

import com.vladsch.flexmark.util.format.TableCell;
import e1.C0959a;
import j1.AbstractC1135a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class p1 implements F0.D {
    public final Z0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1131b;

    /* renamed from: c, reason: collision with root package name */
    public final X0.B f1132c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1193a f1133d;

    public p1(Z0 z02, int i6, X0.B b5, InterfaceC1193a interfaceC1193a) {
        this.a = z02;
        this.f1131b = i6;
        this.f1132c = b5;
        this.f1133d = interfaceC1193a;
    }

    @Override // F0.D
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        F0.k0 w5 = u5.w(C0959a.a(j3, 0, 0, 0, TableCell.NOT_TRACKED, 7));
        int min = Math.min(w5.f1486e, C0959a.g(j3));
        return x5.D(w5.f1485c, min, Y3.w.f9813c, new o1(this, w5, min));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return AbstractC1276k.b(this.a, p1Var.a) && this.f1131b == p1Var.f1131b && AbstractC1276k.b(this.f1132c, p1Var.f1132c) && AbstractC1276k.b(this.f1133d, p1Var.f1133d);
    }

    public final int hashCode() {
        return this.f1133d.hashCode() + ((this.f1132c.hashCode() + AbstractC1135a.b(this.f1131b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.f1131b + ", transformedText=" + this.f1132c + ", textLayoutResultProvider=" + this.f1133d + ')';
    }
}
