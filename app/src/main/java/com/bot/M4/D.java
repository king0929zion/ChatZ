package M4;

import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class D implements SerialDescriptor {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f3422b;

    /* renamed from: c, reason: collision with root package name */
    public final SerialDescriptor f3423c;

    public D(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.a = str;
        this.f3422b = serialDescriptor;
        this.f3423c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
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
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Y4.l e() {
        return K4.k.f2978g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d6 = (D) obj;
        return AbstractC1276k.b(this.a, d6.a) && AbstractC1276k.b(this.f3422b, d6.f3422b) && AbstractC1276k.b(this.f3423c, d6.f3423c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 2;
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
        return this.f3423c.hashCode() + ((this.f3422b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i6) {
        if (i6 >= 0) {
            return Y3.v.f9812c;
        }
        throw new IllegalArgumentException(B3.e.s(AbstractC1135a.k("Illegal index ", i6, ", "), this.a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.s(AbstractC1135a.k("Illegal index ", i6, ", "), this.a, " expects only non-negative indices").toString());
        }
        int i7 = i6 % 2;
        if (i7 == 0) {
            return this.f3422b;
        }
        if (i7 == 1) {
            return this.f3423c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i6) {
        if (i6 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(B3.e.s(AbstractC1135a.k("Illegal index ", i6, ", "), this.a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.a + '(' + this.f3422b + ", " + this.f3423c + ')';
    }
}
