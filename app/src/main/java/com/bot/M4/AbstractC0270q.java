package M4;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: M4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0270q implements AbstractC0251a {
    public final KSerializer a;

    public AbstractC0270q(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // M4.AbstractC0251a
    public void f(L4.a aVar, int i6, Object obj) {
        i(i6, obj, aVar.x(getDescriptor(), i6, this.a, null));
    }

    public abstract void i(int i6, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int d6 = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        O4.w p5 = ((O4.w) encoder).p(descriptor);
        Iterator c6 = c(obj);
        for (int i6 = 0; i6 < d6; i6++) {
            p5.w(getDescriptor(), i6, this.a, c6.next());
        }
        p5.y(descriptor);
    }
}
