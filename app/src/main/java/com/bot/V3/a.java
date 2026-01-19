package V3;

import W3.e;
import io.ktor.utils.io.internal.f;
import io.ktor.utils.io.internal.i;
import java.nio.ByteBuffer;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8800c;

    public /* synthetic */ a(int i6) {
        this.f8800c = i6;
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // W3.e
    public void X(Object obj) {
        switch (this.f8800c) {
            case 0:
                b bVar = (b) obj;
                AbstractC1276k.f(bVar, "instance");
                if (bVar != b.f8804l) {
                    throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
                }
                return;
            default:
                AbstractC1276k.f(obj, "instance");
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i6 = this.f8800c;
    }

    @Override // W3.e
    public final Object v() {
        switch (this.f8800c) {
            case 0:
                return b.f8804l;
            default:
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(f.a);
                AbstractC1276k.e(allocateDirect, "allocateDirect(BUFFER_SIZE)");
                return new i(allocateDirect, 8);
        }
    }
}
