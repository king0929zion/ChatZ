package v;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import e1.InterfaceC0961c;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1795f implements InterfaceC1793e, InterfaceC1797g {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15296b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.e f15297c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15298d;

    public C1795f(float f6, boolean z5, l4.e eVar) {
        this.a = f6;
        this.f15296b = z5;
        this.f15297c = eVar;
        this.f15298d = f6;
    }

    @Override // v.InterfaceC1793e, v.InterfaceC1797g
    public final float a() {
        return this.f15298d;
    }

    @Override // v.InterfaceC1797g
    public final void b(InterfaceC0961c interfaceC0961c, int i6, int[] iArr, int[] iArr2) {
        c(interfaceC0961c, i6, iArr, e1.m.f11576c, iArr2);
    }

    @Override // v.InterfaceC1793e
    public final void c(InterfaceC0961c interfaceC0961c, int i6, int[] iArr, e1.m mVar, int[] iArr2) {
        int i7;
        int i8;
        if (iArr.length == 0) {
            return;
        }
        int l02 = interfaceC0961c.l0(this.a);
        boolean z5 = this.f15296b && mVar == e1.m.f11577e;
        C1810p c1810p = AbstractC1799h.a;
        if (z5) {
            i7 = 0;
            i8 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i9 = iArr[length];
                int min = Math.min(i7, i6 - i9);
                iArr2[length] = min;
                i8 = Math.min(l02, (i6 - min) - i9);
                i7 = iArr2[length] + i9 + i8;
            }
        } else {
            int length2 = iArr.length;
            int i10 = 0;
            i7 = 0;
            i8 = 0;
            int i11 = 0;
            while (i10 < length2) {
                int i12 = iArr[i10];
                int min2 = Math.min(i7, i6 - i12);
                iArr2[i11] = min2;
                int min3 = Math.min(l02, (i6 - min2) - i12);
                int i13 = iArr2[i11] + i12 + min3;
                i10++;
                i8 = min3;
                i7 = i13;
                i11++;
            }
        }
        int i14 = i7 - i8;
        l4.e eVar = this.f15297c;
        if (eVar == null || i14 >= i6) {
            return;
        }
        int intValue = ((Number) eVar.m(Integer.valueOf(i6 - i14), mVar)).intValue();
        int length3 = iArr2.length;
        for (int i15 = 0; i15 < length3; i15++) {
            iArr2[i15] = iArr2[i15] + intValue;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1795f)) {
            return false;
        }
        C1795f c1795f = (C1795f) obj;
        return e1.f.c(this.a, c1795f.a) && this.f15296b == c1795f.f15296b && AbstractC1276k.b(this.f15297c, c1795f.f15297c);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(Float.hashCode(this.a) * 31, 31, this.f15296b);
        l4.e eVar = this.f15297c;
        return d6 + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15296b ? FlexmarkHtmlConverter.DEFAULT_NODE : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) e1.f.d(this.a));
        sb.append(", ");
        sb.append(this.f15297c);
        sb.append(')');
        return sb.toString();
    }
}
