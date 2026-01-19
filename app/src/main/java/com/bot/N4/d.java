package N4;

import M4.C0253b;
import Y3.v;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final d f3885b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f3886c = "kotlinx.serialization.json.JsonArray";
    public final /* synthetic */ C0253b a;

    public d() {
        SerialDescriptor descriptor = k.a.getDescriptor();
        AbstractC1276k.f(descriptor, "elementDesc");
        this.a = new C0253b(descriptor, 1);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return f3886c;
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
        return K4.k.f2977f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        this.a.getClass();
        return 1;
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
