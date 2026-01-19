package Q;

import android.view.KeyEvent;
import i4.AbstractC1117a;
import l4.InterfaceC1193a;
import z0.AbstractC2013a;
import z0.AbstractC2015c;
import z0.C2014b;

/* renamed from: Q.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484x2 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6224c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f6225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r4.d f6226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6228h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f6229i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6230j;

    public C0484x2(boolean z5, l4.c cVar, r4.d dVar, int i6, boolean z6, float f6, InterfaceC1193a interfaceC1193a) {
        this.f6224c = z5;
        this.f6225e = cVar;
        this.f6226f = dVar;
        this.f6227g = i6;
        this.f6228h = z6;
        this.f6229i = f6;
        this.f6230j = interfaceC1193a;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        l4.c cVar;
        KeyEvent keyEvent = ((C2014b) obj).a;
        r4.d dVar = this.f6226f;
        float f6 = dVar.f14678b;
        if (this.f6224c && (cVar = this.f6225e) != null) {
            int c6 = AbstractC2015c.c(keyEvent);
            boolean z5 = false;
            if (c6 != 2) {
                if (c6 == 1) {
                    long a = AbstractC2015c.a(keyEvent.getKeyCode());
                    if (AbstractC2013a.a(a, AbstractC2013a.f16194d) || AbstractC2013a.a(a, AbstractC2013a.f16195e) || AbstractC2013a.a(a, AbstractC2013a.f16197g) || AbstractC2013a.a(a, AbstractC2013a.f16196f) || AbstractC2013a.a(a, AbstractC2013a.f16212v) || AbstractC2013a.a(a, AbstractC2013a.f16213w) || AbstractC2013a.a(a, AbstractC2013a.f16188C) || AbstractC2013a.a(a, AbstractC2013a.f16189D)) {
                        InterfaceC1193a interfaceC1193a = this.f6230j;
                        if (interfaceC1193a != null) {
                            interfaceC1193a.b();
                        }
                        z5 = true;
                    }
                }
                return Boolean.valueOf(z5);
            }
            float f7 = dVar.a;
            float abs = Math.abs(f6 - f7);
            int i6 = this.f6227g;
            float f8 = abs / (i6 > 0 ? i6 + 1 : 100);
            int i7 = this.f6228h ? -1 : 1;
            long a6 = AbstractC2015c.a(keyEvent.getKeyCode());
            boolean a7 = AbstractC2013a.a(a6, AbstractC2013a.f16194d);
            float f9 = this.f6229i;
            if (a7) {
                cVar.f(AbstractC1117a.i(Float.valueOf((i7 * f8) + f9), dVar));
            } else if (AbstractC2013a.a(a6, AbstractC2013a.f16195e)) {
                cVar.f(AbstractC1117a.i(Float.valueOf(f9 - (i7 * f8)), dVar));
            } else if (AbstractC2013a.a(a6, AbstractC2013a.f16197g)) {
                cVar.f(AbstractC1117a.i(Float.valueOf((i7 * f8) + f9), dVar));
            } else if (AbstractC2013a.a(a6, AbstractC2013a.f16196f)) {
                cVar.f(AbstractC1117a.i(Float.valueOf(f9 - (i7 * f8)), dVar));
            } else if (AbstractC2013a.a(a6, AbstractC2013a.f16212v)) {
                cVar.f(Float.valueOf(f7));
            } else if (AbstractC2013a.a(a6, AbstractC2013a.f16213w)) {
                cVar.f(Float.valueOf(f6));
            } else {
                if (!AbstractC2013a.a(a6, AbstractC2013a.f16188C)) {
                    if (AbstractC2013a.a(a6, AbstractC2013a.f16189D)) {
                        cVar.f(AbstractC1117a.i(Float.valueOf((AbstractC1117a.f(r7 / 10, 1, 10) * f8) + f9), dVar));
                    }
                    return Boolean.valueOf(z5);
                }
                cVar.f(AbstractC1117a.i(Float.valueOf(f9 - (AbstractC1117a.f(r7 / 10, 1, 10) * f8)), dVar));
            }
            z5 = true;
            return Boolean.valueOf(z5);
        }
        return Boolean.FALSE;
    }
}
