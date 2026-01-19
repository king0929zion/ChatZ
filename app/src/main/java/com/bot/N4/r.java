package N4;

import M4.D;
import M4.n0;
import Y3.v;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class r implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final r f3912b = new r();

    /* renamed from: c, reason: collision with root package name */
    public static final String f3913c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ D a;

    public r() {
        n0 n0Var = n0.a;
        k kVar = k.a;
        SerialDescriptor descriptor = n0Var.getDescriptor();
        SerialDescriptor descriptor2 = kVar.getDescriptor();
        AbstractC1276k.f(descriptor, "keyDesc");
        AbstractC1276k.f(descriptor2, "valueDesc");
        this.a = new D("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return f3913c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Y4.l e() {
        this.a.getClass();
        return K4.k.f2978g;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        this.a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i6) {
        this.a.getClass();
        return String.valueOf(i6);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.a.getClass();
        return v.f9812c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i6) {
        this.a.i(i6);
        return v.f9812c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i6) {
        return this.a.j(i6);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i6) {
        this.a.k(i6);
        return false;
    }
}
