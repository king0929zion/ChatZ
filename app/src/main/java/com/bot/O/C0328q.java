package O;

import D.C0086p;
import java.util.List;
import java.util.NoSuchElementException;
import k.AbstractC1171s;
import k.C1149C;
import k.C1151E;
import m4.AbstractC1276k;
import u.AbstractC1734b;

/* renamed from: O.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328q implements InterfaceC0307f0 {
    public final C1149C a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4172b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4173c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4174d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4175e;

    /* renamed from: f, reason: collision with root package name */
    public final G f4176f;

    public C0328q(C1149C c1149c, List list, int i6, int i7, boolean z5, G g3) {
        this.a = c1149c;
        this.f4172b = list;
        this.f4173c = i6;
        this.f4174d = i7;
        this.f4175e = z5;
        this.f4176f = g3;
        if (list.size() > 1) {
            return;
        }
        AbstractC1734b.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void n(C1151E c1151e, G g3, D d6, int i6, int i7) {
        G g6;
        if (g3.f3946c) {
            g6 = new G(d6.a(i7), d6.a(i6), i7 > i6);
        } else {
            g6 = new G(d6.a(i6), d6.a(i7), i6 > i7);
        }
        if (i6 > i7) {
            AbstractC1734b.c("minOffset should be less than or equal to maxOffset: " + g6);
        }
        long j3 = d6.a;
        int c6 = c1151e.c(j3);
        Object[] objArr = c1151e.f12448c;
        Object obj = objArr[c6];
        c1151e.f12447b[c6] = j3;
        objArr[c6] = g6;
    }

    @Override // O.InterfaceC0307f0
    public final boolean a() {
        return this.f4175e;
    }

    @Override // O.InterfaceC0307f0
    public final D b() {
        return this.f4175e ? k() : g();
    }

    @Override // O.InterfaceC0307f0
    public final G c() {
        return this.f4176f;
    }

    @Override // O.InterfaceC0307f0
    public final D d() {
        return h() == EnumC0318l.f4145c ? g() : k();
    }

    @Override // O.InterfaceC0307f0
    public final boolean e(InterfaceC0307f0 interfaceC0307f0) {
        if (this.f4176f != null && interfaceC0307f0 != null && (interfaceC0307f0 instanceof C0328q)) {
            C0328q c0328q = (C0328q) interfaceC0307f0;
            List list = c0328q.f4172b;
            if (this.f4175e == c0328q.f4175e && this.f4173c == c0328q.f4173c && this.f4174d == c0328q.f4174d) {
                List list2 = this.f4172b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        D d6 = (D) list2.get(i6);
                        D d7 = (D) list.get(i6);
                        if (d6.a != d7.a || d6.f3924c != d7.f3924c || d6.f3925d != d7.f3925d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // O.InterfaceC0307f0
    public final int f() {
        return this.f4174d;
    }

    @Override // O.InterfaceC0307f0
    public final D g() {
        return (D) this.f4172b.get(p(this.f4174d, false));
    }

    @Override // O.InterfaceC0307f0
    public final EnumC0318l h() {
        int i6 = this.f4173c;
        int i7 = this.f4174d;
        if (i6 < i7) {
            return EnumC0318l.f4146e;
        }
        if (i6 > i7) {
            return EnumC0318l.f4145c;
        }
        return ((D) this.f4172b.get(i6 / 2)).b();
    }

    @Override // O.InterfaceC0307f0
    public final C1151E i(G g3) {
        F f6 = g3.a;
        boolean z5 = g3.f3946c;
        long j3 = f6.f3942c;
        int i6 = f6.f3941b;
        F f7 = g3.f3945b;
        long j4 = f7.f3942c;
        int i7 = f7.f3941b;
        if (j3 != j4) {
            C1151E c1151e = AbstractC1171s.a;
            C1151E c1151e2 = new C1151E();
            n(c1151e2, g3, d(), (z5 ? f7 : f6).f3941b, d().f3927f.a.a.f7630e.length());
            j(new C0086p(this, c1151e2, g3, 9));
            if (!z5) {
                f6 = f7;
            }
            n(c1151e2, g3, h() == EnumC0318l.f4145c ? k() : g(), 0, f6.f3941b);
            return c1151e2;
        }
        if ((!z5 || i6 < i7) && (z5 || i6 > i7)) {
            AbstractC1734b.c("unexpectedly miss-crossed selection: " + g3);
        }
        long j5 = f6.f3942c;
        C1151E c1151e3 = AbstractC1171s.a;
        C1151E c1151e4 = new C1151E();
        c1151e4.h(j5, g3);
        return c1151e4;
    }

    @Override // O.InterfaceC0307f0
    public final void j(l4.c cVar) {
        int o5 = o(d().a);
        int o6 = o((h() == EnumC0318l.f4145c ? k() : g()).a);
        int i6 = o5 + 1;
        if (i6 >= o6) {
            return;
        }
        while (i6 < o6) {
            cVar.f(this.f4172b.get(i6));
            i6++;
        }
    }

    @Override // O.InterfaceC0307f0
    public final D k() {
        return (D) this.f4172b.get(p(this.f4173c, true));
    }

    @Override // O.InterfaceC0307f0
    public final int l() {
        return this.f4173c;
    }

    @Override // O.InterfaceC0307f0
    public final int m() {
        return this.f4172b.size();
    }

    public final int o(long j3) {
        try {
            return this.a.c(j3);
        } catch (NoSuchElementException e6) {
            throw new IllegalStateException(B3.e.m("Invalid selectableId: ", j3), e6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i6, boolean z5) {
        int ordinal = h().ordinal();
        int i7 = z5;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                i7 = 1;
            }
            return (i6 - (i7 ^ 1)) / 2;
        }
        if (z5 != 0) {
            i7 = 0;
            return (i6 - (i7 ^ 1)) / 2;
        }
        i7 = 1;
        return (i6 - (i7 ^ 1)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.f4175e);
        sb.append(", startPosition=");
        boolean z5 = true;
        float f6 = 2;
        sb.append((this.f4173c + 1) / f6);
        sb.append(", endPosition=");
        sb.append((this.f4174d + 1) / f6);
        sb.append(", crossed=");
        sb.append(h());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.f4172b;
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            D d6 = (D) list.get(i6);
            if (z5) {
                z5 = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i6++;
            sb3.append(i6);
            sb3.append(" -> ");
            sb3.append(d6);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String sb4 = sb2.toString();
        AbstractC1276k.e(sb4, "toString(...)");
        sb.append(sb4);
        sb.append(')');
        return sb.toString();
    }
}
