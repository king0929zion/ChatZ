package k;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n4.InterfaceC1372a;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155b implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public int f12526c;

    /* renamed from: e, reason: collision with root package name */
    public int f12527e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12529g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12530h;

    public C1155b(int i6) {
        this.f12526c = i6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12527e < this.f12526c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object g3;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f12527e;
        switch (this.f12529g) {
            case 0:
                g3 = ((C1159f) this.f12530h).g(i6);
                break;
            case 1:
                g3 = ((C1159f) this.f12530h).k(i6);
                break;
            default:
                g3 = ((C1160g) this.f12530h).f12544e[i6];
                break;
        }
        this.f12527e++;
        this.f12528f = true;
        return g3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12528f) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i6 = this.f12527e - 1;
        this.f12527e = i6;
        switch (this.f12529g) {
            case 0:
                ((C1159f) this.f12530h).i(i6);
                break;
            case 1:
                ((C1159f) this.f12530h).i(i6);
                break;
            default:
                ((C1160g) this.f12530h).a(i6);
                break;
        }
        this.f12526c--;
        this.f12528f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1155b(C1160g c1160g) {
        this(c1160g.f12545f);
        this.f12529g = 2;
        this.f12530h = c1160g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1155b(C1159f c1159f, int i6) {
        this(c1159f.f12539f);
        this.f12529g = i6;
        switch (i6) {
            case 1:
                this.f12530h = c1159f;
                this(c1159f.f12539f);
                return;
            default:
                this.f12530h = c1159f;
                return;
        }
    }
}
