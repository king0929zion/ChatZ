package O4;

import M4.A0;
import M4.r0;
import M4.u0;
import M4.x0;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class x {
    public static final Set a = Y3.k.C0(new SerialDescriptor[]{u0.f3493b, x0.f3505b, r0.f3487b, A0.f3418b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "<this>");
        return serialDescriptor.h() && a.contains(serialDescriptor);
    }
}
