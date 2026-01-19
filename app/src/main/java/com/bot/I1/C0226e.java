package I1;

import android.os.Bundle;
import m4.AbstractC1276k;

/* renamed from: I1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226e extends F {
    @Override // I1.F
    public final Object a(String str, Bundle bundle) {
        AbstractC1276k.f(bundle, "bundle");
        float f6 = bundle.getFloat(str, Float.MIN_VALUE);
        if (f6 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return Float.valueOf(f6);
        }
        h5.e.a0(str);
        throw null;
    }

    @Override // I1.F
    public final String b() {
        return "float";
    }

    @Override // I1.F
    public final Object d(String str) {
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // I1.F
    public final void e(Bundle bundle, String str, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        AbstractC1276k.f(str, "key");
        bundle.putFloat(str, floatValue);
    }
}
