package H0;

import f0.AbstractC0997t;
import f0.C0996s;
import h0.AbstractC1040q;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* renamed from: H0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162q implements ListIterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1980c;

    /* renamed from: e, reason: collision with root package name */
    public int f1981e;

    /* renamed from: f, reason: collision with root package name */
    public int f1982f;

    /* renamed from: g, reason: collision with root package name */
    public int f1983g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1984h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0162q(C0163s c0163s, int i6, int i7) {
        this(c0163s, (i7 & 1) != 0 ? 0 : i6, 0, c0163s.f1988c.f12466b);
        this.f1980c = 0;
    }

    public void a() {
        int i6;
        i6 = ((AbstractList) ((Z3.a) this.f1984h).f10512h).modCount;
        if (i6 != this.f1983g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i6;
        int i7;
        switch (this.f1980c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                Z3.a aVar = (Z3.a) this.f1984h;
                int i8 = this.f1981e;
                this.f1981e = i8 + 1;
                aVar.add(i8, obj);
                this.f1982f = -1;
                i6 = ((AbstractList) aVar).modCount;
                this.f1983g = i6;
                return;
            case 2:
                b();
                Z3.b bVar = (Z3.b) this.f1984h;
                int i9 = this.f1981e;
                this.f1981e = i9 + 1;
                bVar.add(i9, obj);
                this.f1982f = -1;
                i7 = ((AbstractList) bVar).modCount;
                this.f1983g = i7;
                return;
            default:
                c();
                C0996s c0996s = (C0996s) this.f1984h;
                c0996s.add(this.f1981e + 1, obj);
                this.f1982f = -1;
                this.f1981e++;
                this.f1983g = AbstractC0997t.g(c0996s);
                return;
        }
    }

    public void b() {
        int i6;
        i6 = ((AbstractList) ((Z3.b) this.f1984h)).modCount;
        if (i6 != this.f1983g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (AbstractC0997t.g((C0996s) this.f1984h) != this.f1983g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1980c) {
            case 0:
                return this.f1981e < this.f1983g;
            case 1:
                return this.f1981e < ((Z3.a) this.f1984h).f10510f;
            case 2:
                return this.f1981e < ((Z3.b) this.f1984h).f10515e;
            default:
                return this.f1981e < ((C0996s) this.f1984h).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1980c) {
            case 0:
                return this.f1981e > this.f1982f;
            case 1:
                return this.f1981e > 0;
            case 2:
                return this.f1981e > 0;
            default:
                return this.f1981e >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1980c) {
            case 0:
                k.I i6 = ((C0163s) this.f1984h).f1988c;
                int i7 = this.f1981e;
                this.f1981e = i7 + 1;
                Object f6 = i6.f(i7);
                AbstractC1276k.d(f6, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC1040q) f6;
            case 1:
                a();
                int i8 = this.f1981e;
                Z3.a aVar = (Z3.a) this.f1984h;
                if (i8 >= aVar.f10510f) {
                    throw new NoSuchElementException();
                }
                this.f1981e = i8 + 1;
                this.f1982f = i8;
                return aVar.f10508c[aVar.f10509e + i8];
            case 2:
                b();
                int i9 = this.f1981e;
                Z3.b bVar = (Z3.b) this.f1984h;
                if (i9 >= bVar.f10515e) {
                    throw new NoSuchElementException();
                }
                this.f1981e = i9 + 1;
                this.f1982f = i9;
                return bVar.f10514c[i9];
            default:
                c();
                int i10 = this.f1981e + 1;
                this.f1982f = i10;
                C0996s c0996s = (C0996s) this.f1984h;
                AbstractC0997t.a(i10, c0996s.size());
                Object obj = c0996s.get(i10);
                this.f1981e = i10;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1980c) {
            case 0:
                return this.f1981e - this.f1982f;
            case 1:
                return this.f1981e;
            case 2:
                return this.f1981e;
            default:
                return this.f1981e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1980c) {
            case 0:
                k.I i6 = ((C0163s) this.f1984h).f1988c;
                int i7 = this.f1981e - 1;
                this.f1981e = i7;
                Object f6 = i6.f(i7);
                AbstractC1276k.d(f6, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC1040q) f6;
            case 1:
                a();
                int i8 = this.f1981e;
                if (i8 <= 0) {
                    throw new NoSuchElementException();
                }
                int i9 = i8 - 1;
                this.f1981e = i9;
                this.f1982f = i9;
                Z3.a aVar = (Z3.a) this.f1984h;
                return aVar.f10508c[aVar.f10509e + i9];
            case 2:
                b();
                int i10 = this.f1981e;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f1981e = i11;
                this.f1982f = i11;
                return ((Z3.b) this.f1984h).f10514c[i11];
            default:
                c();
                int i12 = this.f1981e;
                C0996s c0996s = (C0996s) this.f1984h;
                AbstractC0997t.a(i12, c0996s.size());
                int i13 = this.f1981e;
                this.f1982f = i13;
                this.f1981e--;
                return c0996s.get(i13);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i6;
        switch (this.f1980c) {
            case 0:
                i6 = this.f1981e - this.f1982f;
                break;
            case 1:
                i6 = this.f1981e;
                break;
            case 2:
                i6 = this.f1981e;
                break;
            default:
                return this.f1981e;
        }
        return i6 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i6;
        int i7;
        switch (this.f1980c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                Z3.a aVar = (Z3.a) this.f1984h;
                a();
                int i8 = this.f1982f;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                aVar.b(i8);
                this.f1981e = this.f1982f;
                this.f1982f = -1;
                i6 = ((AbstractList) aVar).modCount;
                this.f1983g = i6;
                return;
            case 2:
                Z3.b bVar = (Z3.b) this.f1984h;
                b();
                int i9 = this.f1982f;
                if (i9 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.b(i9);
                this.f1981e = this.f1982f;
                this.f1982f = -1;
                i7 = ((AbstractList) bVar).modCount;
                this.f1983g = i7;
                return;
            default:
                c();
                C0996s c0996s = (C0996s) this.f1984h;
                c0996s.remove(this.f1982f);
                this.f1981e--;
                this.f1982f = -1;
                this.f1983g = AbstractC0997t.g(c0996s);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1980c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i6 = this.f1982f;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((Z3.a) this.f1984h).set(i6, obj);
                return;
            case 2:
                b();
                int i7 = this.f1982f;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((Z3.b) this.f1984h).set(i7, obj);
                return;
            default:
                C0996s c0996s = (C0996s) this.f1984h;
                c();
                int i8 = this.f1982f;
                if (i8 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                c0996s.set(i8, obj);
                this.f1983g = AbstractC0997t.g(c0996s);
                return;
        }
    }

    public C0162q(Z3.b bVar, int i6) {
        int i7;
        this.f1980c = 2;
        this.f1984h = bVar;
        this.f1981e = i6;
        this.f1982f = -1;
        i7 = ((AbstractList) bVar).modCount;
        this.f1983g = i7;
    }

    public C0162q(C0996s c0996s, int i6) {
        this.f1980c = 3;
        this.f1984h = c0996s;
        this.f1981e = i6 - 1;
        this.f1982f = -1;
        this.f1983g = AbstractC0997t.g(c0996s);
    }

    public C0162q(C0163s c0163s, int i6, int i7, int i8) {
        this.f1980c = 0;
        this.f1984h = c0163s;
        this.f1981e = i6;
        this.f1982f = i7;
        this.f1983g = i8;
    }

    public C0162q(Z3.a aVar, int i6) {
        int i7;
        this.f1980c = 1;
        this.f1984h = aVar;
        this.f1981e = i6;
        this.f1982f = -1;
        i7 = ((AbstractList) aVar).modCount;
        this.f1983g = i7;
    }
}
