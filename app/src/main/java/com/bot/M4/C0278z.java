package M4;

import java.util.Arrays;
import m4.AbstractC1276k;

/* renamed from: M4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278z extends d0 {
    public float[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f3508b;

    @Override // M4.d0
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.a, this.f3508b);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // M4.d0
    public final void b(int i6) {
        float[] fArr = this.a;
        if (fArr.length < i6) {
            int length = fArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i6);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // M4.d0
    public final int d() {
        return this.f3508b;
    }
}
