package D;

import com.vladsch.flexmark.util.format.TableCell;
import e1.C0959a;
import j1.AbstractC1135a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: D.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081m0 implements F0.D {
    public final Z0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1063b;

    /* renamed from: c, reason: collision with root package name */
    public final X0.B f1064c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1193a f1065d;

    public C0081m0(Z0 z02, int i6, X0.B b5, InterfaceC1193a interfaceC1193a) {
        this.a = z02;
        this.f1063b = i6;
        this.f1064c = b5;
        this.f1065d = interfaceC1193a;
    }

    @Override // F0.D
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        long j4;
        if (u5.q(C0959a.g(j3)) < C0959a.h(j3)) {
            j4 = j3;
        } else {
            j4 = j3;
            j3 = C0959a.a(j4, 0, TableCell.NOT_TRACKED, 0, 0, 13);
        }
        F0.k0 w5 = u5.w(j3);
        int min = Math.min(w5.f1485c, C0959a.h(j4));
        return x5.D(min, w5.f1486e, Y3.w.f9813c, new C0079l0(this, x5, w5, min, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0081m0)) {
            return false;
        }
        C0081m0 c0081m0 = (C0081m0) obj;
        return AbstractC1276k.b(this.a, c0081m0.a) && this.f1063b == c0081m0.f1063b && AbstractC1276k.b(this.f1064c, c0081m0.f1064c) && AbstractC1276k.b(this.f1065d, c0081m0.f1065d);
    }

    public final int hashCode() {
        return this.f1065d.hashCode() + ((this.f1064c.hashCode() + AbstractC1135a.b(this.f1063b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.f1063b + ", transformedText=" + this.f1064c + ", textLayoutResultProvider=" + this.f1065d + ')';
    }
}
