package U3;

import j1.AbstractC1135a;
import java.nio.ByteBuffer;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class g extends W3.c {

    /* renamed from: i, reason: collision with root package name */
    public final int f8677i;

    /* renamed from: j, reason: collision with root package name */
    public final S3.a f8678j;

    public g() {
        super(1000);
        this.f8677i = 4096;
        this.f8678j = S3.a.a;
    }

    @Override // W3.c
    public final Object c(Object obj) {
        V3.b bVar = (V3.b) obj;
        bVar.m();
        bVar.k();
        return bVar;
    }

    @Override // W3.c
    public final void d(Object obj) {
        V3.b bVar = (V3.b) obj;
        AbstractC1276k.f(bVar, "instance");
        ByteBuffer byteBuffer = bVar.a;
        this.f8678j.getClass();
        AbstractC1276k.f(byteBuffer, "instance");
        if (!V3.b.f8802j.compareAndSet(bVar, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        bVar.f();
        bVar.f8806h = null;
    }

    @Override // W3.c
    public final Object f() {
        this.f8678j.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(this.f8677i);
        AbstractC1276k.e(allocate, "allocate(size)");
        ByteBuffer byteBuffer = S3.b.a;
        return new V3.b(allocate, null, this);
    }

    @Override // W3.c
    public final void j(Object obj) {
        V3.b bVar = (V3.b) obj;
        AbstractC1276k.f(bVar, "instance");
        long limit = bVar.a.limit();
        int i6 = this.f8677i;
        if (limit != i6) {
            StringBuilder k3 = AbstractC1135a.k("Buffer size mismatch. Expected: ", i6, ", actual: ");
            k3.append(r0.limit());
            throw new IllegalStateException(k3.toString().toString());
        }
        V3.b bVar2 = V3.b.f8804l;
        if (bVar == bVar2) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (bVar == bVar2) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (bVar.i() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (bVar.h() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (bVar.f8806h != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }
}
