package M4;

import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class L implements SerialDescriptor {
    public final SerialDescriptor a;

    public L(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        Integer E5 = u4.u.E(str);
        if (E5 != null) {
            return E5.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Y4.l e() {
        return K4.k.f2977f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l3 = (L) obj;
        return AbstractC1276k.b(this.a, l3.a) && AbstractC1276k.b(a(), l3.a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i6) {
        return String.valueOf(i6);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return Y3.v.f9812c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i6) {
        if (i6 >= 0) {
            return Y3.v.f9812c;
        }
        StringBuilder k3 = AbstractC1135a.k("Illegal index ", i6, ", ");
        k3.append(a());
        k3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k3.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i6) {
        if (i6 >= 0) {
            return this.a;
        }
        StringBuilder k3 = AbstractC1135a.k("Illegal index ", i6, ", ");
        k3.append(a());
        k3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k3.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i6) {
        if (i6 >= 0) {
            return false;
        }
        StringBuilder k3 = AbstractC1135a.k("Illegal index ", i6, ", ");
        k3.append(a());
        k3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k3.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
