package S3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class b {
    public static final ByteBuffer a;

    static {
        ByteBuffer order = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        AbstractC1276k.e(order, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        a = order;
    }

    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i6, int i7, int i8) {
        AbstractC1276k.f(byteBuffer2, "destination");
        if (byteBuffer.hasArray() && byteBuffer2.hasArray() && !byteBuffer.isReadOnly() && !byteBuffer2.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i6, byteBuffer2.array(), byteBuffer2.arrayOffset() + i8, i7);
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i6);
        duplicate.limit(i6 + i7);
        ByteBuffer duplicate2 = byteBuffer2.duplicate();
        duplicate2.position(i8);
        duplicate2.put(duplicate);
    }
}
