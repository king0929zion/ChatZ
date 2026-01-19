package P2;

import A4.InterfaceC0008i;
import T.d1;
import X2.C0689d;
import X2.C0692g;
import b4.InterfaceC0905c;
import m4.C1286u;
import x4.AbstractC1888A;

/* renamed from: P2.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378s0 implements InterfaceC0008i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5053c = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T.X f5055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5057h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1 f5058i;

    public C0378s0(C0692g c0692g, d1 d1Var, d1 d1Var2, d1 d1Var3, T.X x5) {
        this.f5054e = c0692g;
        this.f5056g = d1Var;
        this.f5057h = d1Var2;
        this.f5058i = d1Var3;
        this.f5055f = x5;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List, java.lang.Object] */
    @Override // A4.InterfaceC0008i
    public final Object a(Object obj, InterfaceC0905c interfaceC0905c) {
        switch (this.f5053c) {
            case 0:
                return b((InterfaceC0354g) obj, interfaceC0905c);
            case 1:
                X3.i iVar = (X3.i) obj;
                C1286u c1286u = (C1286u) this.f5057h;
                C1286u c1286u2 = (C1286u) this.f5056g;
                int intValue = ((Number) iVar.f9393c).intValue();
                int intValue2 = ((Number) iVar.f9394e).intValue();
                if (((x.s) this.f5054e).f15552i.b()) {
                    int i6 = c1286u2.f12971c;
                    T.X x5 = this.f5055f;
                    if (intValue < i6 || (intValue == i6 && intValue2 < c1286u.f12971c)) {
                        x5.setValue(EnumC0356h.f4933c);
                    } else if (V.j(this.f5058i)) {
                        x5.setValue(EnumC0356h.f4934e);
                    }
                }
                c1286u2.f12971c = intValue;
                c1286u.f12971c = intValue2;
                return X3.y.a;
            default:
                x.l lVar = (x.l) obj;
                int i7 = lVar.f15504n;
                x.m mVar = (x.m) Y3.m.x0(lVar.f15501k);
                if ((mVar != null ? mVar.a : 0) + 1 > i7 - 3 && ((Boolean) ((d1) this.f5056g).getValue()).booleanValue() && !((Boolean) ((d1) this.f5057h).getValue()).booleanValue() && !((Boolean) this.f5058i.getValue()).booleanValue() && ((String) this.f5055f.getValue()).length() == 0) {
                    C0692g c0692g = (C0692g) this.f5054e;
                    if (!((Boolean) c0692g.f9276g.getValue()).booleanValue() && ((Boolean) c0692g.f9281l.getValue()).booleanValue()) {
                        AbstractC1888A.y(androidx.lifecycle.O.i(c0692g), null, new C0689d(c0692g, null), 3);
                    }
                }
                return X3.y.a;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0034. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(P2.InterfaceC0354g r12, b4.InterfaceC0905c r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.C0378s0.b(P2.g, b4.c):java.lang.Object");
    }

    public C0378s0(x.s sVar, T.X x5, T.X x6, T.X x7, T.X x8) {
        this.f5054e = sVar;
        this.f5055f = x5;
        this.f5056g = x6;
        this.f5057h = x7;
        this.f5058i = x8;
    }

    public C0378s0(x.s sVar, C1286u c1286u, C1286u c1286u2, T.X x5, d1 d1Var) {
        this.f5054e = sVar;
        this.f5056g = c1286u;
        this.f5057h = c1286u2;
        this.f5055f = x5;
        this.f5058i = d1Var;
    }
}
