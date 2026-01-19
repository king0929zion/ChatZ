package c;

import D.Y;
import H0.AbstractC0157l;
import H0.E0;
import H0.F0;
import H0.J;
import H0.r0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import T.d1;
import X3.y;
import android.graphics.Canvas;
import androidx.lifecycle.InterfaceC0846u;
import b.C0853B;
import d5.InterfaceC0951k;
import f0.C0987j;
import f0.C0996s;
import h1.x;
import i4.AbstractC1121e;
import io.ktor.utils.io.u;
import java.nio.ByteBuffer;
import m.C1210Q;
import m.C1211S;
import m.C1217Y;
import m.C1237s;
import m.EnumC1199F;
import m0.C;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import m4.C1286u;
import m4.C1288w;
import o0.AbstractC1392c;
import o0.C1387I;
import o0.O;
import o0.q;
import q0.InterfaceC1498d;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class f extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11076g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11077h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i6) {
        super(1);
        this.f11074e = i6;
        this.f11075f = obj;
        this.f11076g = obj2;
        this.f11077h = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [m4.l, l4.c] */
    @Override // l4.c
    public final Object f(Object obj) {
        boolean booleanValue;
        switch (this.f11074e) {
            case 0:
                C0853B c0853b = (C0853B) this.f11075f;
                InterfaceC0846u interfaceC0846u = (InterfaceC0846u) this.f11076g;
                h hVar = (h) this.f11077h;
                c0853b.a(interfaceC0846u, hVar);
                return new Y(hVar, 10);
            case 1:
                C0853B c0853b2 = (C0853B) this.f11075f;
                InterfaceC0846u interfaceC0846u2 = (InterfaceC0846u) this.f11076g;
                n nVar = (n) this.f11077h;
                c0853b2.a(interfaceC0846u2, nVar);
                return new Y(nVar, 11);
            case 2:
                x xVar = (x) this.f11075f;
                J j3 = (J) this.f11076g;
                x xVar2 = (x) this.f11077h;
                q g3 = ((InterfaceC1498d) obj).g0().g();
                if (xVar.getView().getVisibility() != 8) {
                    xVar.f11852B = true;
                    r0 r0Var = j3.f1747r;
                    ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = r0Var instanceof ViewTreeObserverOnGlobalLayoutListenerC0216x ? (ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC0216x != null) {
                        Canvas a = AbstractC1392c.a(g3);
                        viewTreeObserverOnGlobalLayoutListenerC0216x.getAndroidViewsHandler$ui().getClass();
                        xVar2.draw(a);
                    }
                    xVar.f11852B = false;
                }
                return y.a;
            case 3:
                F0 f02 = (F0) obj;
                k0.e eVar = (k0.e) f02;
                if (!((k0.b) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w((k0.e) this.f11076g)).m8getDragAndDropManager()).f12593b.contains(eVar) || !AbstractC1121e.b(eVar, u.l((C0987j) this.f11077h))) {
                    return E0.f1692c;
                }
                ((C1288w) this.f11075f).f12973c = f02;
                return E0.f1694f;
            case 4:
                return new J1.n((C0996s) this.f11075f, this.f11076g, (C1237s) this.f11077h);
            case AbstractC1787b.f15290g /* 5 */:
                C1387I c1387i = (C1387I) obj;
                d1 d1Var = (d1) this.f11076g;
                d1 d1Var2 = (d1) this.f11075f;
                c1387i.d(d1Var2 != null ? ((Number) d1Var2.getValue()).floatValue() : 1.0f);
                c1387i.j(d1Var != null ? ((Number) d1Var.getValue()).floatValue() : 1.0f);
                c1387i.k(d1Var != null ? ((Number) d1Var.getValue()).floatValue() : 1.0f);
                d1 d1Var3 = (d1) this.f11077h;
                c1387i.p(d1Var3 != null ? ((O) d1Var3.getValue()).a : O.f13454b);
                return y.a;
            case 6:
                C1210Q c1210q = (C1210Q) this.f11076g;
                C1211S c1211s = (C1211S) this.f11077h;
                int ordinal = ((EnumC1199F) obj).ordinal();
                O o5 = null;
                if (ordinal == 0) {
                    C1217Y c1217y = c1210q.a.f12789d;
                    if (c1217y != null) {
                        o5 = new O(c1217y.f12767b);
                    } else {
                        C1217Y c1217y2 = c1211s.a.f12789d;
                        if (c1217y2 != null) {
                            o5 = new O(c1217y2.f12767b);
                        }
                    }
                } else if (ordinal == 1) {
                    o5 = (O) this.f11075f;
                } else {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                    C1217Y c1217y3 = c1211s.a.f12789d;
                    if (c1217y3 != null) {
                        o5 = new O(c1217y3.f12767b);
                    } else {
                        C1217Y c1217y4 = c1210q.a.f12789d;
                        if (c1217y4 != null) {
                            o5 = new O(c1217y4.f12767b);
                        }
                    }
                }
                return new O(o5 != null ? o5.a : O.f13454b);
            case 7:
                C c6 = (C) obj;
                if (AbstractC1276k.b(c6, (C) this.f11075f)) {
                    booleanValue = false;
                } else {
                    if (AbstractC1276k.b(c6, ((m0.q) this.f11076g).f12900c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((AbstractC1277l) this.f11077h).f(c6)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                AbstractC1276k.f(byteBuffer, "buffer");
                try {
                    ((C1286u) this.f11075f).f12971c = ((InterfaceC0951k) this.f11076g).read(byteBuffer);
                    return y.a;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(C c6, m0.q qVar, l4.c cVar) {
        super(1);
        this.f11074e = 7;
        this.f11075f = c6;
        this.f11076g = qVar;
        this.f11077h = (AbstractC1277l) cVar;
    }
}
