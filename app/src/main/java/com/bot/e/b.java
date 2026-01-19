package E;

import G.d;
import G.g;
import S0.O;
import X3.y;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    public static final A2.a a = new A2.a(15);

    /* renamed from: b, reason: collision with root package name */
    public static final a f1284b = new a(0);

    public static final void a(F.a aVar, final Context context, final boolean z5, final CharSequence charSequence, final long j3) {
        if (O.c(j3) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) a.f(context);
        if (list.isEmpty()) {
            return;
        }
        aVar.a();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i6);
            aVar.a.a(new d(new G.a(i6), resolveInfo.loadLabel(packageManager).toString(), 0, new l4.c() { // from class: E.c
                @Override // l4.c
                public final Object f(Object obj) {
                    b.f1284b.n(context, resolveInfo, Boolean.valueOf(z5), charSequence, new O(j3));
                    ((g) obj).close();
                    return y.a;
                }
            }));
        }
        aVar.a();
    }
}
