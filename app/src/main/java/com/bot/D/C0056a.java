package D;

import H0.AbstractC0157l;
import M4.C0256c0;
import O.AbstractC0305e0;
import O.C0303d0;
import O.EnumC0301c0;
import O.InterfaceC0326p;
import O.InterfaceC0331s;
import Q.AbstractC0452p1;
import Q.C0466t0;
import Q.I2;
import Q.s3;
import S0.C0543e;
import S0.C0550l;
import S0.C0551m;
import S0.InterfaceC0540b;
import T.C0599c0;
import T.C0639x;
import T.C0642y0;
import T.EnumC0630s0;
import X2.C0690e;
import X2.C0692g;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bot.feature.settings.data.ModelConfig;
import com.bot.feature.settings.data.VendorConfig;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import f0.AbstractC0973C;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;
import m4.C1270e;
import n.C1316c;
import o0.AbstractC1392c;
import o0.C1387I;
import q0.InterfaceC1498d;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import x4.AbstractC1888A;
import x4.InterfaceC1922e0;

/* renamed from: D.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0056a implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f973c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f974e;

    public /* synthetic */ C0056a(int i6, Object obj, Object obj2) {
        this.f973c = i6;
        this.f974e = obj;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f973c) {
            case 0:
                ((P0.x) obj).a(AbstractC0305e0.f4106c, new C0303d0(EnumC0073i0.f1034c, ((InterfaceC0331s) this.f974e).a(), EnumC0301c0.f4087e, true));
                return X3.y.a;
            case 1:
                Z0 z02 = (Z0) this.f974e;
                float floatValue = ((Float) obj).floatValue();
                C0599c0 c0599c0 = z02.a;
                float g3 = c0599c0.g() + floatValue;
                C0599c0 c0599c02 = z02.f968b;
                if (g3 > c0599c02.g()) {
                    floatValue = c0599c02.g() - c0599c0.g();
                } else if (g3 < S.l.f7374V) {
                    floatValue = -c0599c0.g();
                }
                c0599c0.h(c0599c0.g() + floatValue);
                return Float.valueOf(floatValue);
            case 2:
                ((H4.c) this.f974e).c(null);
                return X3.y.a;
            case 3:
                Drawable drawable = (Drawable) this.f974e;
                InterfaceC1498d interfaceC1498d = (InterfaceC1498d) obj;
                o0.q g6 = interfaceC1498d.g0().g();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC1498d.c() >> 32)), (int) Float.intBitsToFloat((int) (interfaceC1498d.c() & 4294967295L)));
                drawable.draw(AbstractC1392c.a(g6));
                return X3.y.a;
            case 4:
                I1.H h3 = (I1.H) this.f974e;
                I1.j jVar = (I1.j) obj;
                AbstractC1276k.f(jVar, "backStackEntry");
                L1.c cVar = jVar.f2550k;
                I1.v vVar = jVar.f2544e;
                if (vVar == null) {
                    vVar = null;
                }
                if (vVar != null) {
                    cVar.a();
                    I1.v c6 = h3.c(vVar);
                    if (c6 != null) {
                        return c6.equals(vVar) ? jVar : h3.b().b(c6, c6.a(cVar.a()));
                    }
                }
                return null;
            case AbstractC1787b.f15290g /* 5 */:
                I4.c cVar2 = (I4.c) this.f974e;
                K4.a aVar = (K4.a) obj;
                AbstractC1276k.f(aVar, "$this$buildSerialDescriptor");
                K4.a.a(aVar, "type", M4.n0.f3479b);
                K4.a.a(aVar, "value", Y4.d.m("kotlinx.serialization.Polymorphic<" + ((C1270e) cVar2.a).c() + BlockQuoteParser.MARKER_CHAR, K4.j.f2974e, new SerialDescriptor[0]));
                return X3.y.a;
            case 6:
                J.c cVar3 = (J.c) this.f974e;
                cVar3.f2782t.m((F.a) obj, AbstractC0157l.h(cVar3, AndroidCompositionLocals_androidKt.f10780b));
                return X3.y.a;
            case 7:
                ((l4.c) obj).f((F.a) this.f974e);
                return X3.y.a;
            case 8:
                C0056a c0056a = (C0056a) this.f974e;
                H0.F0 f02 = (H0.F0) obj;
                if (!(f02 instanceof J.a)) {
                    throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                c0056a.f(((J.a) f02).f2781r);
                return Boolean.TRUE;
            case AbstractC1787b.f15287d /* 9 */:
                return new Y((K.c) this.f974e, 3);
            case AbstractC1787b.f15289f /* 10 */:
                K4.g gVar = (K4.g) this.f974e;
                int intValue = ((Integer) obj).intValue();
                return gVar.f2962e[intValue] + ": " + gVar.f2963f[intValue].a();
            case 11:
                ((M.z) this.f974e).a((X0.g) obj);
                return X3.y.a;
            case 12:
                Exception exc = (Exception) this.f974e;
                M2.A a = (M2.A) obj;
                AbstractC1276k.f(a, "it");
                L2.e eVar = L2.e.f3077h;
                String message = exc.getMessage();
                if (message == null) {
                    message = "流式生成失败";
                }
                return M2.A.a(a, null, null, null, null, eVar, null, null, null, message, 239);
            case 13:
                M2.z zVar = (M2.z) this.f974e;
                M2.A a6 = (M2.A) obj;
                AbstractC1276k.f(a6, "state");
                String str = a6.a;
                return (AbstractC1776n.Q(str) || str.equals(zVar.f3409b)) ? M2.A.a(a6, zVar.f3409b, null, null, null, L2.e.f3078i, null, null, null, null, 494) : a6;
            case 14:
                I2.m mVar = (I2.m) this.f974e;
                M2.A a7 = (M2.A) obj;
                AbstractC1276k.f(a7, "it");
                return M2.A.a(a7, null, null, null, null, L2.e.f3077h, null, null, null, ((I2.i) mVar).a, 239);
            case 15:
                C0256c0 c0256c0 = (C0256c0) this.f974e;
                int intValue2 = ((Integer) obj).intValue();
                return c0256c0.f3454e[intValue2] + ": " + c0256c0.j(intValue2).a();
            case PegdownExtensions.AUTOLINKS /* 16 */:
                M4.o0 o0Var = (M4.o0) this.f974e;
                K4.a aVar2 = (K4.a) obj;
                AbstractC1276k.f(aVar2, "$this$buildClassSerialDescriptor");
                K4.a.a(aVar2, "first", o0Var.a.getDescriptor());
                K4.a.a(aVar2, "second", o0Var.f3481b.getDescriptor());
                K4.a.a(aVar2, "third", o0Var.f3482c.getDescriptor());
                return X3.y.a;
            case 17:
                N1.r rVar = (N1.r) this.f974e;
                Y1.a aVar3 = (Y1.a) obj;
                AbstractC1276k.f(aVar3, "db");
                rVar.f3766g = aVar3;
                return X3.y.a;
            case 18:
                B0.y yVar = (B0.y) obj;
                if (((InterfaceC0326p) this.f974e).c(yVar.f483c)) {
                    yVar.a();
                }
                return X3.y.a;
            case 19:
                P2.P0 p02 = (P2.P0) this.f974e;
                AbstractC1276k.f((T.H) obj, "$this$DisposableEffect");
                return new Y(p02, 5);
            case 20:
                C1387I c1387i = (C1387I) obj;
                float floatValue2 = ((Number) ((C1316c) this.f974e).d()).floatValue();
                float d6 = AbstractC0452p1.d(c1387i, floatValue2);
                float e6 = AbstractC0452p1.e(c1387i, floatValue2);
                c1387i.k(e6 == S.l.f7374V ? 1.0f : d6 / e6);
                c1387i.p(AbstractC0452p1.f6034c);
                return X3.y.a;
            case 21:
                Q.T0 t02 = (Q.T0) this.f974e;
                t02.show();
                return new Y(t02, 7);
            case 22:
                return Boolean.valueOf(AbstractC1276k.b(((C0466t0) obj).a, (I2) this.f974e));
            case 23:
                S0.M m3 = (S0.M) this.f974e;
                C0543e c0543e = (C0543e) obj;
                InterfaceC0540b interfaceC0540b = (InterfaceC0540b) c0543e.a;
                if (interfaceC0540b instanceof C0551m) {
                    C0551m c0551m = (C0551m) interfaceC0540b;
                    if (c0551m.f7642b == null) {
                        return C0543e.a(c0543e, new C0551m(c0551m.a, m3), 0, 14);
                    }
                }
                if (!(interfaceC0540b instanceof C0550l)) {
                    return c0543e;
                }
                C0550l c0550l = (C0550l) interfaceC0540b;
                return c0550l.f7641b == null ? C0543e.a(c0543e, new C0550l(c0550l.a, m3), 0, 14) : c0543e;
            case 24:
                VendorConfig vendorConfig = (VendorConfig) this.f974e;
                ModelConfig modelConfig = (ModelConfig) obj;
                AbstractC1276k.f(modelConfig, "model");
                return "model:" + vendorConfig.a + ":" + modelConfig.a;
            case 25:
                return new Y((s3) this.f974e, 8);
            case 26:
                C0692g c0692g = (C0692g) this.f974e;
                String str2 = (String) obj;
                AbstractC1276k.f(str2, "newQuery");
                String obj2 = AbstractC1776n.l0(str2).toString();
                A4.g0 g0Var = c0692g.f9285p;
                A4.g0 g0Var2 = c0692g.f9287r;
                Y3.v vVar2 = Y3.v.f9812c;
                A4.g0 g0Var3 = c0692g.f9283n;
                AbstractC1276k.f(obj2, "query");
                if (AbstractC1776n.Q(obj2)) {
                    g0Var3.getClass();
                    g0Var3.l(null, vVar2);
                    g0Var2.getClass();
                    g0Var2.l(null, FlexmarkHtmlConverter.DEFAULT_NODE);
                    Boolean bool = Boolean.FALSE;
                    g0Var.getClass();
                    g0Var.l(null, bool);
                } else {
                    g0Var2.getClass();
                    g0Var2.l(null, obj2);
                    g0Var3.getClass();
                    g0Var3.l(null, vVar2);
                    Boolean bool2 = Boolean.TRUE;
                    g0Var.getClass();
                    g0Var.l(null, bool2);
                    AbstractC1888A.y(androidx.lifecycle.O.i(c0692g), null, new C0690e(c0692g, obj2, null), 3);
                }
                return X3.y.a;
            case 27:
                ((C0639x) this.f974e).z(obj);
                return X3.y.a;
            case 28:
                C0642y0 c0642y0 = (C0642y0) this.f974e;
                Throwable th = (Throwable) obj;
                CancellationException a8 = AbstractC1888A.a("Recomposer effect job completed", th);
                synchronized (c0642y0.f8272c) {
                    try {
                        InterfaceC1922e0 interfaceC1922e0 = c0642y0.f8273d;
                        if (interfaceC1922e0 != null) {
                            A4.g0 g0Var4 = c0642y0.f8290u;
                            EnumC0630s0 enumC0630s0 = EnumC0630s0.f8206e;
                            g0Var4.getClass();
                            g0Var4.l(null, enumC0630s0);
                            interfaceC1922e0.f(a8);
                            c0642y0.f8287r = null;
                            interfaceC1922e0.S(new C0086p(26, c0642y0, th));
                        } else {
                            c0642y0.f8274e = a8;
                            A4.g0 g0Var5 = c0642y0.f8290u;
                            EnumC0630s0 enumC0630s02 = EnumC0630s0.f8205c;
                            g0Var5.getClass();
                            g0Var5.l(null, enumC0630s02);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return X3.y.a;
            default:
                k.N n3 = (k.N) this.f974e;
                if (obj instanceof AbstractC0973C) {
                    ((AbstractC0973C) obj).f(4);
                }
                n3.a(obj);
                return X3.y.a;
        }
    }

    public /* synthetic */ C0056a(Object obj, int i6) {
        this.f973c = i6;
        this.f974e = obj;
    }
}
