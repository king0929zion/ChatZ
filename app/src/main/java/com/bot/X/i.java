package X;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: f, reason: collision with root package name */
    public final g f9066f;

    /* renamed from: g, reason: collision with root package name */
    public int f9067g;

    /* renamed from: h, reason: collision with root package name */
    public k f9068h;

    /* renamed from: i, reason: collision with root package name */
    public int f9069i;

    public i(g gVar, int i6) {
        super(i6, gVar.f9063k);
        this.f9066f = gVar;
        this.f9067g = gVar.e();
        this.f9069i = -1;
        b();
    }

    public final void a() {
        if (this.f9067g != this.f9066f.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // X.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i6 = this.f9046c;
        g gVar = this.f9066f;
        gVar.add(i6, obj);
        this.f9046c++;
        this.f9047e = gVar.a();
        this.f9067g = gVar.e();
        this.f9069i = -1;
        b();
    }

                public final void b() {
        g gVar = this.f9066f;
        Object[] objArr = gVar.f9061i;
        if (objArr == null) {
            this.f9068h = null;
            return;
        }
        int i6 = (gVar.f9063k - 1) & (-32);
        int i7 = this.f9046c;
        if (i7 > i6) {
            i7 = i6;
        }
        int i8 = (gVar.f9059g / 5) + 1;
        k kVar = this.f9068h;
        if (kVar == null) {
            this.f9068h = new k(objArr, i7, i6, i8);
            return;
        }
        kVar.f9046c = i7;
        kVar.f9047e = i6;
        kVar.f9072f = i8;
        if (kVar.f9073g.length < i8) {
            kVar.f9073g = new Object[i8];
        }
        kVar.f9073g[0] = objArr;
        Object r6 = i7 == i6 ? 1 : 0;
        kVar.f9074h = r6;
        kVar.b(i7 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f9046c;
        this.f9069i = i6;
        k kVar = this.f9068h;
        g gVar = this.f9066f;
        if (kVar == null) {
            Object[] objArr = gVar.f9062j;
            this.f9046c = i6 + 1;
            return objArr[i6];
        }
        if (kVar.hasNext()) {
            this.f9046c++;
            return kVar.next();
        }
        Object[] objArr2 = gVar.f9062j;
        int i7 = this.f9046c;
        this.f9046c = i7 + 1;
        return objArr2[i7 - kVar.f9047e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f9046c;
        this.f9069i = i6 - 1;
        k kVar = this.f9068h;
        g gVar = this.f9066f;
        if (kVar == null) {
            Object[] objArr = gVar.f9062j;
            int i7 = i6 - 1;
            this.f9046c = i7;
            return objArr[i7];
        }
        int i8 = kVar.f9047e;
        if (i6 <= i8) {
            this.f9046c = i6 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = gVar.f9062j;
        int i9 = i6 - 1;
        this.f9046c = i9;
        return objArr2[i9 - i8];
    }

    @Override // X.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i6 = this.f9069i;
        if (i6 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f9066f;
        gVar.b(i6);
        int i7 = this.f9069i;
        if (i7 < this.f9046c) {
            this.f9046c = i7;
        }
        this.f9047e = gVar.a();
        this.f9067g = gVar.e();
        this.f9069i = -1;
        b();
    }

    @Override // X.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i6 = this.f9069i;
        if (i6 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f9066f;
        gVar.set(i6, obj);
        this.f9067g = gVar.e();
        b();
    }
}
