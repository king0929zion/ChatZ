package z;

import b4.C0911i;
import e1.AbstractC0960b;
import i4.AbstractC1117a;
import r.X0;
import s.C1649m;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public abstract class H {
    public static final float a = 56;

    /* renamed from: b, reason: collision with root package name */
    public static final G f16074b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f16075c;

    /* JADX WARN: Type inference failed for: r11v0, types: [z.G, java.lang.Object, e1.c] */
    /* JADX WARN: Type inference failed for: r9v0, types: [F0.W, java.lang.Object] */
    static {
        ?? obj = new Object();
        f16074b = obj;
        f16075c = new t(0, 0, 0, 0, 0, 0, C1649m.a, new Object(), AbstractC1888A.c(C0911i.f11057c), obj, AbstractC0960b.b(0, 0, 15));
    }

    public static final long a(t tVar, int i6) {
        long j3 = (((i6 * (tVar.f16153c + tVar.f16152b)) + (-tVar.f16156f)) + tVar.f16154d) - tVar.f16153c;
        X0 x02 = tVar.f16155e;
        X0 x03 = X0.f14184e;
        long g3 = tVar.g();
        int i7 = (int) (x02 == x03 ? g3 >> 32 : g3 & 4294967295L);
        tVar.f16164n.getClass();
        long f6 = j3 - (i7 - AbstractC1117a.f(0, 0, i7));
        if (f6 < 0) {
            return 0L;
        }
        return f6;
    }
}
