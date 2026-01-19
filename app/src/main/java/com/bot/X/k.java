package X;

import java.util.NoSuchElementException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: f, reason: collision with root package name */
    public int f9072f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f9073g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9074h;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i6, int i7, int i8) {
        super(i6, i7);
        this.f9072f = i8;
        Object[] objArr2 = new Object[i8];
        this.f9073g = objArr2;
        ?? r5 = i6 == i7 ? 1 : 0;
        this.f9074h = r5;
        objArr2[0] = objArr;
        b(i6 - r5, 1);
    }

    public final Object a() {
        int i6 = this.f9046c & 31;
        Object obj = this.f9073g[this.f9072f - 1];
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i6];
    }

    public final void b(int i6, int i7) {
        int i8 = (this.f9072f - i7) * 5;
        while (i7 < this.f9072f) {
            Object[] objArr = this.f9073g;
            Object obj = objArr[i7 - 1];
            AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i7] = ((Object[]) obj)[h5.e.Z(i6, i8)];
            i8 -= 5;
            i7++;
        }
    }

    public final void c(int i6) {
        int i7 = 0;
        while (h5.e.Z(this.f9046c, i7) == i6) {
            i7 += 5;
        }
        if (i7 > 0) {
            b(this.f9046c, ((this.f9072f - 1) - (i7 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = a();
        int i6 = this.f9046c + 1;
        this.f9046c = i6;
        if (i6 == this.f9047e) {
            this.f9074h = true;
            return a;
        }
        c(0);
        return a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f9046c--;
        if (this.f9074h) {
            this.f9074h = false;
            return a();
        }
        c(31);
        return a();
    }
}
