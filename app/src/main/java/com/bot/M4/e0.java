package M4;

import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e0 extends L {

    /* renamed from: b, reason: collision with root package name */
    public final String f3463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        AbstractC1276k.f(serialDescriptor, "primitive");
        this.f3463b = serialDescriptor.a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f3463b;
    }
}
