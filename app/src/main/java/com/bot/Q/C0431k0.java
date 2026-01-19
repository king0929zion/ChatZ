package Q;

import F0.InterfaceC0134w;
import T.C0601d0;
import android.graphics.Rect;
import android.view.View;
import i4.AbstractC1117a;
import m4.AbstractC1276k;
import n0.C1354c;
import o4.AbstractC1410a;
import v.AbstractC1787b;
import v.C1813t;

/* renamed from: Q.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0431k0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5926c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5930h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5931i;

    public /* synthetic */ C0431k0(v3 v3Var, int i6, T.X x5, C0601d0 c0601d0, C0601d0 c0601d02) {
        this.f5928f = v3Var;
        this.f5927e = i6;
        this.f5929g = x5;
        this.f5930h = c0601d0;
        this.f5931i = c0601d02;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6;
        switch (this.f5926c) {
            case 0:
                v3 v3Var = (v3) this.f5928f;
                T.X x5 = (T.X) this.f5929g;
                C0601d0 c0601d0 = (C0601d0) this.f5930h;
                C0601d0 c0601d02 = (C0601d0) this.f5931i;
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) obj;
                x5.setValue(interfaceC0134w);
                c0601d0.h((int) (interfaceC0134w.m() >> 32));
                View view = v3Var.a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i7 = rect.top;
                int i8 = rect.bottom;
                InterfaceC0134w interfaceC0134w2 = (InterfaceC0134w) x5.getValue();
                C1354c a = (interfaceC0134w2 == null || !interfaceC0134w2.j()) ? C1354c.f13294e : AbstractC1117a.a(interfaceC0134w2.e(0L), AbstractC1410a.S(interfaceC0134w2.m()));
                int i9 = this.f5927e;
                int i10 = i7 + i9;
                int i11 = i8 - i9;
                float f6 = a.f13295b;
                if (f6 <= i8) {
                    float f7 = a.f13297d;
                    if (f7 >= i7) {
                        i6 = AbstractC1410a.K(Math.max(f6 - i10, i11 - f7));
                        c0601d02.h(Math.max(i6, 0));
                        return X3.y.a;
                    }
                }
                i6 = i11 - i10;
                c0601d02.h(Math.max(i6, 0));
                return X3.y.a;
            default:
                F0.k0[] k0VarArr = (F0.k0[]) this.f5928f;
                C1813t c1813t = (C1813t) this.f5929g;
                F0.X x6 = (F0.X) this.f5930h;
                int[] iArr = (int[]) this.f5931i;
                F0.j0 j0Var = (F0.j0) obj;
                int length = k0VarArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    F0.k0 k0Var = k0VarArr[i12];
                    int i14 = i13 + 1;
                    AbstractC1276k.c(k0Var);
                    Object H3 = k0Var.H();
                    v.n0 n0Var = H3 instanceof v.n0 ? (v.n0) H3 : null;
                    e1.m layoutDirection = x6.getLayoutDirection();
                    AbstractC1787b abstractC1787b = n0Var != null ? n0Var.f15332c : null;
                    int i15 = this.f5927e;
                    j0Var.h(k0Var, abstractC1787b != null ? abstractC1787b.i(i15, layoutDirection, k0Var) : c1813t.f15347b.a(k0Var.f1485c, i15, layoutDirection), iArr[i13], S.l.f7374V);
                    i12++;
                    i13 = i14;
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ C0431k0(F0.k0[] k0VarArr, C1813t c1813t, int i6, F0.X x5, int[] iArr) {
        this.f5928f = k0VarArr;
        this.f5929g = c1813t;
        this.f5927e = i6;
        this.f5930h = x5;
        this.f5931i = iArr;
    }
}
