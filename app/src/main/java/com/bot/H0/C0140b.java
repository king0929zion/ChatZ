package H0;

import F0.C0122j;
import F0.C0133v;
import F0.InterfaceC0134w;
import I0.C0219y0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.AbstractC0960b;
import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import h0.InterfaceC1039p;
import l0.InterfaceC1182b;
import m0.EnumC1245A;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: H0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140b extends AbstractC1040q implements InterfaceC0170z, InterfaceC0160o, A0, w0, G0.c, u0, InterfaceC0169y, InterfaceC0161p, m0.h, m0.v, m0.y, s0, InterfaceC1182b {

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1039p f1887r;

    @Override // h0.AbstractC1040q
    public final void E0() {
        M0(true);
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        if (!this.f11819q) {
            E0.a.b("unInitializeModifier called on unattached node");
        }
        if ((this.f11808f & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).E();
        }
    }

    @Override // m0.h
    public final void H(EnumC1245A enumC1245A) {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        E0.a.b("onFocusEvent called on wrong node");
        interfaceC1039p.getClass();
        throw new ClassCastException();
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
        int i6;
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        P0.b bVar = (P0.b) interfaceC1039p;
        P0.m mVar = new P0.m();
        mVar.f4494f = bVar.a;
        bVar.f4431b.f(mVar);
        AbstractC1276k.d(xVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        P0.m mVar2 = (P0.m) xVar;
        k.M m3 = mVar2.f4492c;
        if (mVar.f4494f) {
            mVar2.f4494f = true;
        }
        if (mVar.f4495g) {
            mVar2.f4495g = true;
        }
        k.M m5 = mVar.f4492c;
        Object[] objArr = m5.f12485b;
        Object[] objArr2 = m5.f12486c;
        long[] jArr = m5.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((255 & j3) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr[i11];
                        Object obj2 = objArr2[i11];
                        P0.w wVar = (P0.w) obj;
                        if (!m3.b(wVar)) {
                            m3.m(wVar, obj2);
                        } else if (obj2 instanceof P0.a) {
                            Object g3 = m3.g(wVar);
                            AbstractC1276k.d(g3, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            P0.a aVar = (P0.a) g3;
                            i6 = i8;
                            String str = aVar.a;
                            if (str == null) {
                                str = ((P0.a) obj2).a;
                            }
                            X3.e eVar = aVar.f4430b;
                            if (eVar == null) {
                                eVar = ((P0.a) obj2).f4430b;
                            }
                            m3.m(wVar, new P0.a(str, eVar));
                            j3 >>= i6;
                            i10++;
                            i8 = i6;
                        }
                    }
                    i6 = i8;
                    j3 >>= i6;
                    i10++;
                    i8 = i6;
                }
                if (i9 != i8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    @Override // H0.w0
    public final void L() {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        B0.H h3 = ((B0.I) interfaceC1039p).f397d;
        B0.E e6 = (B0.E) h3.f392e;
        B0.I i6 = (B0.I) h3.f394g;
        if (e6 == B0.E.f383e) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, S.l.f7374V, S.l.f7374V, 0);
            obtain.setSource(0);
            ((B0.J) i6.e()).f(obtain);
            obtain.recycle();
            h3.f392e = B0.E.f382c;
            i6.f396c = false;
            h3.f393f = null;
        }
    }

    public final void M0(boolean z5) {
        if (!this.f11819q) {
            E0.a.b("initializeModifier called on unattached node");
        }
        InterfaceC1039p interfaceC1039p = this.f1887r;
        if ((this.f11808f & 4) != 0 && !z5) {
            AbstractC0157l.t(this, 2).d1();
        }
        if ((this.f11808f & 2) != 0) {
            C0 c02 = AbstractC0157l.v(this).f1721J.f1918e;
            AbstractC1276k.d(c02, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (c02.f1690r) {
                i0 i0Var = this.f11813k;
                AbstractC1276k.c(i0Var);
                ((B) i0Var).y1(this);
                q0 q0Var = i0Var.f1952O;
                if (q0Var != null) {
                    ((C0219y0) q0Var).invalidate();
                }
            }
            if (!z5) {
                AbstractC0157l.t(this, 2).d1();
                AbstractC0157l.v(this).E();
            }
        }
        if (interfaceC1039p instanceof x.p) {
            x.p pVar = (x.p) interfaceC1039p;
            J v5 = AbstractC0157l.v(this);
            switch (pVar.a) {
                case 0:
                    ((x.s) pVar.f15536b).f15554k = v5;
                    break;
                default:
                    ((z.E) pVar.f15536b).f16072y.setValue(v5);
                    break;
            }
        }
        int i6 = this.f11808f;
        if ((i6 & 16) != 0 && (interfaceC1039p instanceof B0.I)) {
            ((B0.I) interfaceC1039p).f397d.f391c = this.f11813k;
        }
        if ((i6 & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).E();
        }
    }

    @Override // H0.InterfaceC0170z
    public final int P(S s5, F0.U u5, int i6) {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((F0.D) interfaceC1039p).d(new C0133v(s5, s5.getLayoutDirection()), new C0122j(u5, F0.Y.f1461c, F0.Z.f1465e, 1), AbstractC0960b.b(i6, 0, 13)).d();
    }

    @Override // H0.InterfaceC0160o
    public final void Q() {
        AbstractC0157l.k(this);
    }

    @Override // H0.w0
    public final void R() {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((B0.I) interfaceC1039p).f397d.getClass();
    }

    @Override // G0.c
    public final G0.a Y() {
        return G0.a.a;
    }

    @Override // l0.InterfaceC1182b
    public final InterfaceC0961c a() {
        return AbstractC0157l.v(this).f1714C;
    }

    @Override // H0.InterfaceC0155j, H0.w0
    public final void b() {
        if (this.f1887r instanceof B0.I) {
            L();
        }
    }

    @Override // l0.InterfaceC1182b
    public final long c() {
        return AbstractC1410a.S(AbstractC0157l.t(this, PegdownExtensions.FENCED_CODE_BLOCKS).f1487f);
    }

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((F0.D) interfaceC1039p).d(x5, u5, j3);
    }

    @Override // m0.v
    public final void e(m0.s sVar) {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        E0.a.b("applyFocusProperties called on wrong node");
        interfaceC1039p.getClass();
        throw new ClassCastException();
    }

    @Override // H0.u0
    public final Object g(InterfaceC0961c interfaceC0961c, Object obj) {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((F0.g0) interfaceC1039p).f();
    }

    @Override // l0.InterfaceC1182b
    public final e1.m getLayoutDirection() {
        return AbstractC0157l.v(this).f1715D;
    }

    @Override // H0.InterfaceC0170z
    public final int j(S s5, F0.U u5, int i6) {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((F0.D) interfaceC1039p).d(new C0133v(s5, s5.getLayoutDirection()), new C0122j(u5, F0.Y.f1461c, F0.Z.f1464c, 1), AbstractC0960b.b(0, i6, 7)).e();
    }

    @Override // H0.InterfaceC0161p
    public final void j0(i0 i0Var) {
        AbstractC1276k.d(this.f1887r, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        throw new ClassCastException();
    }

    @Override // H0.InterfaceC0160o
    public final void k0(L l3) {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        l3.b();
    }

    @Override // H0.InterfaceC0170z
    public final int m0(S s5, F0.U u5, int i6) {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((F0.D) interfaceC1039p).d(new C0133v(s5, s5.getLayoutDirection()), new C0122j(u5, F0.Y.f1462e, F0.Z.f1465e, 1), AbstractC0960b.b(i6, 0, 13)).d();
    }

    @Override // H0.InterfaceC0169y
    public final void o(InterfaceC0134w interfaceC0134w) {
    }

    @Override // H0.w0
    public final boolean p0() {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((B0.I) interfaceC1039p).f397d.getClass();
        return true;
    }

    @Override // H0.InterfaceC0169y
    public final void q(long j3) {
    }

    public final String toString() {
        return this.f1887r.toString();
    }

    @Override // H0.s0
    public final boolean u() {
        return this.f11819q;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // H0.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(B0.C0040p r10, B0.EnumC0041q r11, long r12) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0140b.w(B0.p, B0.q, long):void");
    }

    @Override // H0.InterfaceC0170z
    public final int z0(S s5, F0.U u5, int i6) {
        InterfaceC1039p interfaceC1039p = this.f1887r;
        AbstractC1276k.d(interfaceC1039p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((F0.D) interfaceC1039p).d(new C0133v(s5, s5.getLayoutDirection()), new C0122j(u5, F0.Y.f1462e, F0.Z.f1464c, 1), AbstractC0960b.b(0, i6, 7)).e();
    }
}
