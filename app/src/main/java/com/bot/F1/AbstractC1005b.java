package f1;

import S.l;
import e1.i;
import k.AbstractC1174v;
import k.X;
import l.AbstractC1180a;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1005b {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile X f11753b = new X(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f11754c;

    static {
        Object[] objArr = new Object[0];
        f11754c = objArr;
        synchronized (objArr) {
            f11753b.e((int) 115.0f, new C1006c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f11753b.e((int) 130.0f, new C1006c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f11753b.e((int) 150.0f, new C1006c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f11753b.e((int) 180.0f, new C1006c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f11753b.e((int) 200.0f, new C1006c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f11753b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static InterfaceC1004a a(float f6) {
        float d6;
        InterfaceC1004a interfaceC1004a;
        float[] fArr = a;
        if (f6 < 1.03f) {
            return null;
        }
        int i6 = (int) (f6 * 100.0f);
        InterfaceC1004a interfaceC1004a2 = (InterfaceC1004a) f11753b.c(i6);
        if (interfaceC1004a2 != null) {
            return interfaceC1004a2;
        }
        X x5 = f11753b;
        if (x5.f12509c) {
            AbstractC1174v.a(x5);
        }
        int a6 = AbstractC1180a.a(x5.f12510e, x5.f12512g, i6);
        if (a6 >= 0) {
            return (InterfaceC1004a) f11753b.g(a6);
        }
        int i7 = -(a6 + 1);
        int i8 = i7 - 1;
        if (i7 >= f11753b.f()) {
            C1006c c1006c = new C1006c(new float[]{1.0f}, new float[]{f6});
            b(f6, c1006c);
            return c1006c;
        }
        if (i8 < 0) {
            interfaceC1004a = new C1006c(fArr, fArr);
            d6 = 1.0f;
        } else {
            d6 = f11753b.d(i8) / 100.0f;
            interfaceC1004a = (InterfaceC1004a) f11753b.g(i8);
        }
        float d7 = f11753b.d(i7) / 100.0f;
        float max = (Math.max(l.f7374V, Math.min(1.0f, d6 == d7 ? 0.0f : (f6 - d6) / (d7 - d6))) * 1.0f) + l.f7374V;
        InterfaceC1004a interfaceC1004a3 = (InterfaceC1004a) f11753b.g(i7);
        float[] fArr2 = new float[9];
        for (int i9 = 0; i9 < 9; i9++) {
            float f7 = fArr[i9];
            float b5 = interfaceC1004a.b(f7);
            fArr2[i9] = ((interfaceC1004a3.b(f7) - b5) * max) + b5;
        }
        C1006c c1006c2 = new C1006c(fArr, fArr2);
        b(f6, c1006c2);
        return c1006c2;
    }

    public static void b(float f6, C1006c c1006c) {
        synchronized (f11754c) {
            X clone = f11753b.clone();
            clone.e((int) (f6 * 100.0f), c1006c);
            f11753b = clone;
        }
    }
}
