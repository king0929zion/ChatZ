package s;

import T.C0607g0;
import X3.y;
import java.util.concurrent.CancellationException;
import m4.C1285t;
import n.C1332k;
import r.InterfaceC1563e1;

/* renamed from: s.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1644h implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14710c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f14711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1285t f14712f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1563e1 f14713g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.c f14714h;

    public /* synthetic */ C1644h(float f6, C1285t c1285t, InterfaceC1563e1 interfaceC1563e1, l4.c cVar, int i6) {
        this.f14710c = i6;
        this.f14711e = f6;
        this.f14712f = c1285t;
        this.f14713g = interfaceC1563e1;
        this.f14714h = cVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        float f6;
        switch (this.f14710c) {
            case 0:
                C1332k c1332k = (C1332k) obj;
                C0607g0 c0607g0 = c1332k.f13171e;
                float abs = Math.abs(((Number) c0607g0.getValue()).floatValue());
                float f7 = this.f14711e;
                float abs2 = Math.abs(f7);
                C1285t c1285t = this.f14712f;
                InterfaceC1563e1 interfaceC1563e1 = this.f14713g;
                l4.c cVar = this.f14714h;
                if (abs >= abs2) {
                    float d6 = AbstractC1647k.d(((Number) c0607g0.getValue()).floatValue(), f7);
                    AbstractC1647k.c(c1332k, interfaceC1563e1, cVar, d6 - c1285t.f12970c);
                    c1332k.a();
                    c1285t.f12970c = d6;
                } else {
                    AbstractC1647k.c(c1332k, interfaceC1563e1, cVar, ((Number) c0607g0.getValue()).floatValue() - c1285t.f12970c);
                    c1285t.f12970c = ((Number) c0607g0.getValue()).floatValue();
                }
                return y.a;
            default:
                InterfaceC1563e1 interfaceC1563e12 = this.f14713g;
                C1332k c1332k2 = (C1332k) obj;
                float d7 = AbstractC1647k.d(((Number) c1332k2.f13171e.getValue()).floatValue(), this.f14711e);
                C1285t c1285t2 = this.f14712f;
                float f8 = d7 - c1285t2.f12970c;
                try {
                    f6 = interfaceC1563e12.a(f8);
                } catch (CancellationException unused) {
                    c1332k2.a();
                    f6 = S.l.f7374V;
                }
                this.f14714h.f(Float.valueOf(f6));
                if (Math.abs(f8 - f6) > 0.5f || d7 != ((Number) c1332k2.f13171e.getValue()).floatValue()) {
                    c1332k2.a();
                }
                c1285t2.f12970c += f6;
                return y.a;
        }
    }
}
