package M4;

import java.util.Arrays;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class r extends d0 {
    public double[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f3486b;

    @Override // M4.d0
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.a, this.f3486b);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // M4.d0
    public final void b(int i6) {
        double[] dArr = this.a;
        if (dArr.length < i6) {
            int length = dArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i6);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // M4.d0
    public final int d() {
        return this.f3486b;
    }
}
