package N4;

import Y3.v;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class l implements SerialDescriptor {
    public final X3.n a;

    public l(InterfaceC1193a interfaceC1193a) {
        this.a = X3.a.d(interfaceC1193a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return b().a();
    }

    public final SerialDescriptor b() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        return b().d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Y4.l e() {
        return b().e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return b().f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i6) {
        return b().g(i6);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return v.f9812c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i6) {
        return b().i(i6);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i6) {
        return b().j(i6);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i6) {
        return b().k(i6);
    }
}
