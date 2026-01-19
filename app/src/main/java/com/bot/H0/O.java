package H0;

import F0.C0127o;
import e1.InterfaceC0961c;
import java.util.Arrays;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class O implements InterfaceC0961c {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1783c;

    /* renamed from: e, reason: collision with root package name */
    public long f1784e = 9223372034707292159L;

    /* renamed from: f, reason: collision with root package name */
    public long f1785f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S f1786g;

    public O(S s5) {
        this.f1786g = s5;
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f1786g.a();
    }

    public final void b(C0127o c0127o, float f6) {
        S s5 = this.f1786g;
        z0 z0Var = s5.f1803p;
        if (z0Var == null) {
            z0Var = new z0();
            s5.f1803p = z0Var;
        }
        int v02 = Y3.k.v0(c0127o, (C0127o[]) z0Var.f2015b);
        if (v02 >= 0) {
            float[] fArr = (float[]) z0Var.f2016c;
            if (fArr[v02] != f6) {
                fArr[v02] = f6;
                ((byte[]) z0Var.f2017d)[v02] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) z0Var.f2017d;
                if (bArr[v02] == 2) {
                    bArr[v02] = 0;
                    return;
                }
                return;
            }
        }
        int i6 = z0Var.a;
        C0127o[] c0127oArr = (C0127o[]) z0Var.f2015b;
        if (i6 == c0127oArr.length) {
            int i7 = i6 * 2;
            Object[] copyOf = Arrays.copyOf(c0127oArr, i7);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            z0Var.f2015b = (C0127o[]) copyOf;
            float[] copyOf2 = Arrays.copyOf((float[]) z0Var.f2016c, i7);
            AbstractC1276k.e(copyOf2, "copyOf(...)");
            z0Var.f2016c = copyOf2;
            byte[] copyOf3 = Arrays.copyOf((byte[]) z0Var.f2017d, i7);
            AbstractC1276k.e(copyOf3, "copyOf(...)");
            z0Var.f2017d = copyOf3;
        }
        ((C0127o[]) z0Var.f2015b)[i6] = c0127o;
        ((byte[]) z0Var.f2017d)[i6] = 3;
        ((float[]) z0Var.f2016c)[i6] = f6;
        z0Var.a++;
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f1786g.b0();
    }
}
