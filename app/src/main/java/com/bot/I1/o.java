package I1;

import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import i4.AbstractC1120d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o extends U {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2562b = new LinkedHashMap();

    @Override // androidx.lifecycle.U
    public final void d() {
        LinkedHashMap linkedHashMap = this.f2562b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Z) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        AbstractC1120d.g(16);
        sb.append(X3.a.g(identityHashCode & 4294967295L, 16));
        sb.append("} ViewModelStores (");
        Iterator it = this.f2562b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
