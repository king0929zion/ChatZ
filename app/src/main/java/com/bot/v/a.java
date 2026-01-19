package V;

import java.util.NoSuchElementException;
import k.I;
import k.M;
import k.T;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a {
    public final M a;

    public static final Object a(M m3) {
        Object g3 = m3.g(null);
        if (g3 == null) {
            return null;
        }
        if (!(g3 instanceof I)) {
            m3.k(null);
            return g3;
        }
        I i6 = (I) g3;
        if (i6.h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i7 = i6.f12466b - 1;
        Object f6 = i6.f(i7);
        i6.k(i7);
        AbstractC1276k.d(f6, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (i6.h()) {
            m3.k(null);
        }
        if (i6.f12466b == 1) {
            m3.m(null, i6.e());
        }
        return f6;
    }

    public static final I b(M m3) {
        if (m3.i()) {
            I i6 = T.f12508b;
            AbstractC1276k.d(i6, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return i6;
        }
        I i7 = new I();
        Object[] objArr = m3.f12486c;
        long[] jArr = m3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j3 = jArr[i8];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i8 << 3) + i10];
                            if (obj instanceof I) {
                                AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                i7.c((I) obj);
                            } else {
                                AbstractC1276k.d(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                i7.a(obj);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return AbstractC1276k.b(this.a, ((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
