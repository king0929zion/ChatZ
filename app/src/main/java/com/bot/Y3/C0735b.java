package Y3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: Y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735b extends K4.h implements ListIterator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0737d f9796g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0735b(AbstractC0737d abstractC0737d, int i6) {
        super(abstractC0737d, 5);
        this.f9796g = abstractC0737d;
        int a = abstractC0737d.a();
        if (i6 < 0 || i6 > a) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, a, ", size: "));
        }
        this.f2970e = i6;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2970e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2970e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f2970e - 1;
        this.f2970e = i6;
        return this.f9796g.get(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2970e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
