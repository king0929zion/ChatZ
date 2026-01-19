package V3;

import W3.e;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b extends U3.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8801i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8802j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f8803k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f8804l;

    /* renamed from: g, reason: collision with root package name */
    public final e f8805g;

    /* renamed from: h, reason: collision with root package name */
    public b f8806h;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    static {
        a aVar = new a(0);
        f8803k = aVar;
        f8804l = new b(S3.b.a, null, aVar);
        f8801i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "nextRef");
        f8802j = AtomicIntegerFieldUpdater.newUpdater(b.class, "refCount");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ByteBuffer byteBuffer, b bVar, e eVar) {
        super(byteBuffer);
        AbstractC1276k.f(byteBuffer, "memory");
        this.f8805g = eVar;
        if (bVar == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.f8806h = bVar;
    }

    public final b f() {
        return (b) f8801i.getAndSet(this, null);
    }

    public final b g() {
        int i6;
        b bVar = this.f8806h;
        if (bVar == null) {
            bVar = this;
        }
        do {
            i6 = bVar.refCount;
            if (i6 <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!f8802j.compareAndSet(bVar, i6, i6 + 1));
        b bVar2 = new b(this.a, bVar, this.f8805g);
        bVar2.f8665e = this.f8665e;
        bVar2.f8664d = this.f8664d;
        bVar2.f8662b = this.f8662b;
        bVar2.f8663c = this.f8663c;
        return bVar2;
    }

    public final b h() {
        return (b) this.nextRef;
    }

    public final int i() {
        return this.refCount;
    }

    public final void j(e eVar) {
        int i6;
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AbstractC1276k.f(eVar, "pool");
        do {
            i6 = this.refCount;
            if (i6 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i7 = i6 - 1;
            atomicIntegerFieldUpdater = f8802j;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, i7));
        if (i7 == 0) {
            b bVar = this.f8806h;
            if (bVar == null) {
                e eVar2 = this.f8805g;
                if (eVar2 != null) {
                    eVar = eVar2;
                }
                eVar.X(this);
                return;
            }
            if (!atomicIntegerFieldUpdater.compareAndSet(this, 0, -1)) {
                throw new IllegalStateException("Unable to unlink: buffer is in use.");
            }
            f();
            this.f8806h = null;
            bVar.j(eVar);
        }
    }

    public final void k() {
        if (this.f8806h != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        d(0);
        int i6 = this.f8666f;
        int i7 = this.f8664d;
        this.f8662b = i7;
        this.f8663c = i7;
        this.f8665e = i6 - i7;
        this.nextRef = null;
    }

    public final void l(b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (bVar == null) {
            f();
            return;
        }
        do {
            atomicReferenceFieldUpdater = f8801i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    public final void m() {
        int i6;
        do {
            i6 = this.refCount;
            if (i6 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i6 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f8802j.compareAndSet(this, i6, 1));
    }
}
