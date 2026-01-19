package Q;

import T.C0599c0;
import i4.AbstractC1117a;
import l4.InterfaceC1193a;

/* renamed from: Q.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0449o2 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6025c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2 f6026e;

    public /* synthetic */ C0449o2(C2 c22, int i6) {
        this.f6025c = i6;
        this.f6026e = c22;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // l4.c
    public final Object f(Object obj) {
        int i6;
        switch (this.f6025c) {
            case 0:
                e1.l lVar = (e1.l) obj;
                int i7 = (int) (lVar.a >> 32);
                C2 c22 = this.f6026e;
                c22.f5189n.h(i7);
                c22.f5190o.h((int) (lVar.a & 4294967295L));
                return X3.y.a;
            case 1:
                C2 c23 = this.f6026e;
                C0599c0 c0599c0 = c23.f5182g;
                float floatValue = ((Float) obj).floatValue();
                r4.d dVar = c23.f5181f;
                float f6 = dVar.a;
                float f7 = dVar.f14678b;
                float e6 = AbstractC1117a.e(floatValue, f6, f7);
                int i8 = c23.f5179c;
                boolean z5 = false;
                if (i8 > 0 && (i6 = i8 + 1) >= 0) {
                    float f8 = e6;
                    float f9 = f8;
                    int i9 = 0;
                    while (true) {
                        float B5 = Y3.C.B(f6, f7, i9 / i6);
                        float f10 = B5 - e6;
                        if (Math.abs(f10) <= f8) {
                            f8 = Math.abs(f10);
                            f9 = B5;
                        }
                        if (i9 != i6) {
                            i9++;
                        } else {
                            e6 = f9;
                        }
                    }
                }
                if (e6 != c0599c0.g()) {
                    if (e6 != c0599c0.g()) {
                        l4.c cVar = c23.f5183h;
                        if (cVar != null) {
                            cVar.f(Float.valueOf(e6));
                        } else {
                            c23.c(e6);
                        }
                    }
                    InterfaceC1193a interfaceC1193a = c23.f5180e;
                    if (interfaceC1193a != null) {
                        interfaceC1193a.b();
                    }
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            default:
                C2 c24 = this.f6026e;
                c24.a(S.l.f7374V);
                c24.f5193r.b();
                return X3.y.a;
        }
    }
}
