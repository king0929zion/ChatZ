package c0;

import k.I;
import k.M;
import m4.AbstractC1276k;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920c implements InterfaceC0921d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f11100e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11101f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11099c = true;

    /* renamed from: g, reason: collision with root package name */
    public final M f11102g = new M();

    public final void a() {
        M m3 = this.f11102g;
        Object[] objArr = m3.f12486c;
        long[] jArr = m3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i6 << 3) + i8];
                            if (obj instanceof I) {
                                AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.retain.impl.SafeMultiValueMap>");
                                I i9 = (I) obj;
                                Object[] objArr2 = i9.a;
                                int i10 = i9.f12466b;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    Object obj2 = objArr2[i11];
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        m3.a();
    }
}
