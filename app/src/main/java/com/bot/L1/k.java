package L1;

import I1.v;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k.AbstractC1174v;
import k.X;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class k implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public int f3042c = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3044f;

    public k(l lVar) {
        this.f3044f = lVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3042c + 1 < ((X) this.f3044f.f3049f).f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3043e = true;
        X x5 = (X) this.f3044f.f3049f;
        int i6 = this.f3042c + 1;
        this.f3042c = i6;
        return (v) x5.g(i6);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3043e) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        X x5 = (X) this.f3044f.f3049f;
        ((v) x5.g(this.f3042c)).f2593f = null;
        int i6 = this.f3042c;
        Object[] objArr = x5.f12511f;
        Object obj = objArr[i6];
        Object obj2 = AbstractC1174v.f12577c;
        if (obj != obj2) {
            objArr[i6] = obj2;
            x5.f12509c = true;
        }
        this.f3042c = i6 - 1;
        this.f3043e = false;
    }
}
