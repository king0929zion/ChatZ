package M4;

import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class j0 implements SerialDescriptor, InterfaceC0264k {
    public final SerialDescriptor a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3472b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f3473c;

    public j0(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "original");
        this.a = serialDescriptor;
        this.f3472b = serialDescriptor.a() + '?';
        this.f3473c = AbstractC0252a0.b(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f3472b;
    }

    @Override // M4.InterfaceC0264k
    public final Set b() {
        return this.f3473c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Y4.l e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return AbstractC1276k.b(this.a, ((j0) obj).a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.a.f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i6) {
        return this.a.g(i6);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i6) {
        return this.a.i(i6);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i6) {
        return this.a.j(i6);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i6) {
        return this.a.k(i6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
