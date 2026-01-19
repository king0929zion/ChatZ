package W3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: i, reason: collision with root package name */
    public final int f9022i;

    public d(int i6, int i7) {
        super(i6);
        this.f9022i = i7;
    }

    @Override // W3.c
    public final Object c(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // W3.c
    public final Object f() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f9022i);
        AbstractC1276k.c(allocateDirect);
        return allocateDirect;
    }

    @Override // W3.c
    public final void j(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        AbstractC1276k.f(byteBuffer, "instance");
        if (byteBuffer.capacity() != this.f9022i) {
            throw new IllegalStateException("Check failed.");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
