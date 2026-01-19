package M4;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: M4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0251a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        Object a = a();
        int b5 = b(a);
        L4.a b6 = decoder.b(getDescriptor());
        while (true) {
            int s5 = b6.s(getDescriptor());
            if (s5 == -1) {
                b6.h(getDescriptor());
                return h(a);
            }
            f(b6, s5 + b5, a);
        }
    }

    public abstract void f(L4.a aVar, int i6, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
