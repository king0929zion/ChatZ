package X;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f9064f;

    /* renamed from: g, reason: collision with root package name */
    public final k f9065g;

    public h(Object[] objArr, Object[] objArr2, int i6, int i7, int i8) {
        super(i6, i7);
        this.f9064f = objArr2;
        int i9 = (i7 - 1) & (-32);
        this.f9065g = new k(objArr, i6 > i9 ? i9 : i6, i9, i8);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f9065g;
        if (kVar.hasNext()) {
            this.f9046c++;
            return kVar.next();
        }
        int i6 = this.f9046c;
        this.f9046c = i6 + 1;
        return this.f9064f[i6 - kVar.f9047e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f9046c;
        k kVar = this.f9065g;
        int i7 = kVar.f9047e;
        if (i6 <= i7) {
            this.f9046c = i6 - 1;
            return kVar.previous();
        }
        int i8 = i6 - 1;
        this.f9046c = i8;
        return this.f9064f[i8 - i7];
    }
}
