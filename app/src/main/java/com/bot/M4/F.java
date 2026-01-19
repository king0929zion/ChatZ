package M4;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class F extends C0256c0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3427l;

    public F(String str, G g3) {
        super(str, g3, 1);
        this.f3427l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, X3.f] */
    @Override // M4.C0256c0
    public final boolean equals(Object obj) {
        int i6;
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a())) {
                F f6 = (F) obj;
                if (f6.f3427l && Arrays.equals((SerialDescriptor[]) this.f3459j.getValue(), (SerialDescriptor[]) f6.f3459j.getValue())) {
                    int f7 = serialDescriptor.f();
                    int i7 = this.f3452c;
                    if (i7 == f7) {
                        for (0; i6 < i7; i6 + 1) {
                            i6 = (AbstractC1276k.b(j(i6).a(), serialDescriptor.j(i6).a()) && AbstractC1276k.b(j(i6).e(), serialDescriptor.j(i6).e())) ? i6 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // M4.C0256c0, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return this.f3427l;
    }

    @Override // M4.C0256c0
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
