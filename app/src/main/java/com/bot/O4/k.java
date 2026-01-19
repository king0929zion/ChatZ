package O4;

import M4.C0274v;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class k {
    public final C0274v a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4340b;

    public k(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        this.a = new C0274v(serialDescriptor, new j(2, this, k.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0, 0));
    }
}
