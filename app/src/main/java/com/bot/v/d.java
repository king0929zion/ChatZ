package V;

import java.util.List;
import java.util.ListIterator;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class d implements ListIterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8756c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8757e;

    /* renamed from: f, reason: collision with root package name */
    public int f8758f;

    public d(List list, int i6, int i7) {
        this.f8756c = i7;
        switch (i7) {
            case 1:
                this.f8757e = list;
                this.f8758f = i6 - 1;
                return;
            default:
                this.f8757e = list;
                this.f8758f = i6;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f8756c) {
            case 0:
                this.f8757e.add(this.f8758f, obj);
                this.f8758f++;
                return;
            default:
                int i6 = this.f8758f + 1;
                this.f8758f = i6;
                this.f8757e.add(i6, obj);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8756c) {
            case 0:
                return this.f8758f < this.f8757e.size();
            default:
                return this.f8758f < this.f8757e.size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f8756c) {
            case 0:
                return this.f8758f > 0;
            default:
                return this.f8758f >= 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f8756c) {
            case 0:
                int i6 = this.f8758f;
                this.f8758f = i6 + 1;
                return this.f8757e.get(i6);
            default:
                int i7 = this.f8758f + 1;
                this.f8758f = i7;
                return this.f8757e.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f8756c) {
            case 0:
                return this.f8758f;
            default:
                return this.f8758f + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f8756c) {
            case 0:
                int i6 = this.f8758f - 1;
                this.f8758f = i6;
                return this.f8757e.get(i6);
            default:
                int i7 = this.f8758f;
                this.f8758f = i7 - 1;
                return this.f8757e.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f8756c) {
            case 0:
                return this.f8758f - 1;
            default:
                return this.f8758f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f8756c) {
            case 0:
                int i6 = this.f8758f - 1;
                this.f8758f = i6;
                this.f8757e.remove(i6);
                return;
            default:
                this.f8757e.remove(this.f8758f);
                this.f8758f--;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f8756c) {
            case 0:
                this.f8757e.set(this.f8758f, obj);
                return;
            default:
                this.f8757e.set(this.f8758f, obj);
                return;
        }
    }
}
