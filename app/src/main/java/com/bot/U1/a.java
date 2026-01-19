package U1;

import M.q;
import X3.i;
import Y3.m;
import android.os.Bundle;
import i4.AbstractC1118b;
import java.util.Arrays;
import java.util.LinkedHashSet;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a = new LinkedHashSet();

    public a(q qVar) {
        qVar.u("androidx.savedstate.Restarter", this);
    }

    @Override // U1.d
    public final Bundle a() {
        Bundle d6 = AbstractC1118b.d((i[]) Arrays.copyOf(new i[0], 0));
        AbstractC1410a.H(d6, "classes_to_restore", m.J0(this.a));
        return d6;
    }
}
