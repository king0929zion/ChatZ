package D;

import P2.AbstractC0350e;
import Q.f3;
import S0.C0545g;
import T.C0625p0;
import T.C0626q;
import X2.C0692g;
import Y2.EnumC0731u;
import Z2.AbstractC0783w;
import b0.C0873f;
import b3.AbstractC0888d;
import h0.InterfaceC1041r;
import java.util.List;
import l4.InterfaceC1193a;
import v.AbstractC1787b;
import x.C1857h;
import y.InterfaceC1957N;

/* renamed from: D.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0072i implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1030c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1033g;

    public /* synthetic */ C0072i(int i6, int i7, Object obj, Object obj2) {
        this.f1030c = i7;
        this.f1032f = obj;
        this.f1033g = obj2;
        this.f1031e = i6;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f1030c) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC0078l.a((C0545g) this.f1032f, (List) this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0350e.a((InterfaceC1041r) this.f1032f, (InterfaceC1193a) this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case 2:
                ((Integer) obj2).getClass();
                P2.V.b(this.f1031e, (String) this.f1032f, (InterfaceC1193a) this.f1033g, (C0626q) obj, T.r.J(7));
                return X3.y.a;
            case 3:
                ((Integer) obj2).getClass();
                f3.a((S0.P) this.f1032f, (C0873f) this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case 4:
                ((Integer) obj2).intValue();
                T.r.a((C0625p0) this.f1032f, (l4.e) this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                ((Integer) obj2).intValue();
                T.r.b((C0625p0[]) this.f1032f, (l4.e) this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case 6:
                ((Integer) obj2).getClass();
                Y4.l.e((C0692g) this.f1032f, (a3.w) this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case 7:
                ((Integer) obj2).getClass();
                Y4.l.b((X2.L) this.f1032f, (C0692g) this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case 8:
                ((Integer) obj2).intValue();
                AbstractC0783w.d((EnumC0731u) this.f1032f, (String) this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                ((Integer) obj2).intValue();
                ((C0873f) this.f1032f).e(this.f1033g, (C0626q) obj, T.r.J(this.f1031e) | 1);
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                ((Integer) obj2).getClass();
                AbstractC0888d.h((InterfaceC1041r) this.f1032f, (C.d) this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case 11:
                ((Integer) obj2).intValue();
                ((n.y0) this.f1032f).a(this.f1033g, (C0626q) obj, T.r.J(this.f1031e | 1));
                return X3.y.a;
            case 12:
                ((Integer) obj2).getClass();
                ((C1857h) this.f1032f).d(this.f1031e, this.f1033g, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 13:
                InterfaceC1957N interfaceC1957N = (InterfaceC1957N) this.f1032f;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    interfaceC1957N.d(this.f1031e, this.f1033g, c0626q, 0);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                ((Integer) obj2).getClass();
                ((z.r) this.f1032f).d(this.f1031e, this.f1033g, (C0626q) obj, T.r.J(1));
                return X3.y.a;
        }
    }

    public /* synthetic */ C0072i(int i6, Object obj, InterfaceC1957N interfaceC1957N) {
        this.f1030c = 13;
        this.f1032f = interfaceC1957N;
        this.f1031e = i6;
        this.f1033g = obj;
    }

    public /* synthetic */ C0072i(int i6, String str, InterfaceC1193a interfaceC1193a, int i7) {
        this.f1030c = 2;
        this.f1031e = i6;
        this.f1032f = str;
        this.f1033g = interfaceC1193a;
    }

    public /* synthetic */ C0072i(InterfaceC1957N interfaceC1957N, int i6, Object obj, int i7, int i8) {
        this.f1030c = i8;
        this.f1032f = interfaceC1957N;
        this.f1031e = i6;
        this.f1033g = obj;
    }
}
