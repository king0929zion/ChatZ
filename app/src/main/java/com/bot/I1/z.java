package I1;

import H0.E0;
import H0.F0;
import android.os.Bundle;
import java.util.List;
import m4.AbstractC1276k;
import m4.C1288w;
import y.b0;
import y.x0;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2604c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1288w f2605e;

    public /* synthetic */ z(C1288w c1288w, int i6) {
        this.f2604c = i6;
        this.f2605e = c1288w;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f2604c) {
            case 0:
                String str = (String) obj;
                AbstractC1276k.f(str, "key");
                Object obj2 = this.f2605e.f12973c;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(str));
            default:
                F0 f02 = (F0) obj;
                AbstractC1276k.d(f02, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                b0 b0Var = ((x0) f02).f15949r;
                C1288w c1288w = this.f2605e;
                List list = (List) c1288w.f12973c;
                if (list != null) {
                    list.add(b0Var);
                } else {
                    list = Y4.l.K(b0Var);
                }
                c1288w.f12973c = list;
                return E0.f1693e;
        }
    }
}
