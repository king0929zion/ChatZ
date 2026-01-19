package X;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9050f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9051g;

    public d(Object[] objArr, int i6, int i7) {
        super(i6, i7);
        this.f9051g = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f9050f) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f9051g;
                int i6 = this.f9046c;
                this.f9046c = i6 + 1;
                return objArr[i6];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f9046c++;
                return this.f9051g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f9050f) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f9051g;
                int i6 = this.f9046c - 1;
                this.f9046c = i6;
                return objArr[i6];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f9046c--;
                return this.f9051g;
        }
    }

    public d(Object obj, int i6) {
        super(i6, 1);
        this.f9051g = obj;
    }
}
