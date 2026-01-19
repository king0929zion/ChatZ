package M4;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class f0 implements AbstractC0270q {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f3465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(KSerializer kSerializer) {
        super(kSerializer);
        AbstractC1276k.f(kSerializer, "primitiveSerializer");
        this.f3465b = new e0(kSerializer.getDescriptor());
    }

    @Override // M4.AbstractC0251a
    public final Object a() {
        return (d0) g(j());
    }

    @Override // M4.AbstractC0251a
    public final int b(Object obj) {
        d0 d0Var = (d0) obj;
        AbstractC1276k.f(d0Var, "<this>");
        return d0Var.d();
    }

    @Override // M4.AbstractC0251a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // M4.AbstractC0251a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f3465b;
    }

    @Override // M4.AbstractC0251a
    public final Object h(Object obj) {
        d0 d0Var = (d0) obj;
        AbstractC1276k.f(d0Var, "<this>");
        return d0Var.a();
    }

    @Override // M4.AbstractC0270q
    public final void i(int i6, Object obj, Object obj2) {
        AbstractC1276k.f((d0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(O4.w wVar, Object obj, int i6);

    @Override // M4.AbstractC0270q, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int d6 = d(obj);
        e0 e0Var = this.f3465b;
        O4.w p5 = ((O4.w) encoder).p(e0Var);
        k(p5, obj, d6);
        p5.y(e0Var);
    }
}
