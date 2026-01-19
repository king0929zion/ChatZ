package r4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* renamed from: r4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1636b implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final int f14674c;

    /* renamed from: e, reason: collision with root package name */
    public final int f14675e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14676f;

    /* renamed from: g, reason: collision with root package name */
    public int f14677g;

    public C1636b(char c6, char c7, int i6) {
        this.f14674c = i6;
        this.f14675e = c7;
        boolean z5 = false;
        if (i6 <= 0 ? AbstractC1276k.g(c6, c7) >= 0 : AbstractC1276k.g(c6, c7) <= 0) {
            z5 = true;
        }
        this.f14676f = z5;
        this.f14677g = z5 ? c6 : c7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14676f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i6 = this.f14677g;
        if (i6 != this.f14675e) {
            this.f14677g = this.f14674c + i6;
        } else {
            if (!this.f14676f) {
                throw new NoSuchElementException();
            }
            this.f14676f = false;
        }
        return Character.valueOf((char) i6);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
