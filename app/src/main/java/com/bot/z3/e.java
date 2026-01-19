package Z3;

import androidx.lifecycle.N;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public int f10521c;

    /* renamed from: e, reason: collision with root package name */
    public int f10522e;

    /* renamed from: f, reason: collision with root package name */
    public int f10523f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10524g;

    public e() {
        if (N.f10848e == null) {
            N.f10848e = new N(28);
        }
    }

    public int a(int i6) {
        if (i6 < this.f10523f) {
            return ((ByteBuffer) this.f10524g).getShort(this.f10522e + i6);
        }
        return 0;
    }

    public void b() {
        if (((f) this.f10524g).f10533k != this.f10523f) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i6 = this.f10521c;
            f fVar = (f) this.f10524g;
            if (i6 >= fVar.f10531i || fVar.f10528f[i6] >= 0) {
                return;
            } else {
                this.f10521c = i6 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f10521c < ((f) this.f10524g).f10531i;
    }

    public void remove() {
        f fVar = (f) this.f10524g;
        b();
        if (this.f10522e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        fVar.c();
        fVar.l(this.f10522e);
        this.f10522e = -1;
        this.f10523f = fVar.f10533k;
    }
}
