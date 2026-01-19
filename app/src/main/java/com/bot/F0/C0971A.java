package f0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import n4.InterfaceC1372a;

/* renamed from: f0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971A implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final C0999v f11641c;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f11642e;

    /* renamed from: f, reason: collision with root package name */
    public int f11643f;

    /* renamed from: g, reason: collision with root package name */
    public Map.Entry f11644g;

    /* renamed from: h, reason: collision with root package name */
    public Map.Entry f11645h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11646i;

    public C0971A(C0999v c0999v, Iterator it, int i6) {
        this.f11646i = i6;
        this.f11641c = c0999v;
        this.f11642e = it;
        this.f11643f = c0999v.e().f11721d;
        a();
    }

    public final void a() {
        this.f11644g = this.f11645h;
        Iterator it = this.f11642e;
        this.f11645h = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11645h != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11646i) {
            case 0:
                a();
                if (this.f11644g != null) {
                    return new C1003z(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f11645h;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f11645h;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0999v c0999v = this.f11641c;
        if (c0999v.e().f11721d != this.f11643f) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f11644g;
        if (entry == null) {
            throw new IllegalStateException();
        }
        c0999v.remove(entry.getKey());
        this.f11644g = null;
        this.f11643f = c0999v.e().f11721d;
    }
}
