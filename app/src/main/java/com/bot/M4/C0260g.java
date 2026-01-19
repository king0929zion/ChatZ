package M4;

import java.util.Arrays;
import m4.AbstractC1276k;

/* renamed from: M4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260g extends d0 {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f3466b;

    @Override // M4.d0
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.a, this.f3466b);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // M4.d0
    public final void b(int i6) {
        byte[] bArr = this.a;
        if (bArr.length < i6) {
            int length = bArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i6);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // M4.d0
    public final int d() {
        return this.f3466b;
    }
}
