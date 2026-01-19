package I1;

import android.os.Bundle;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public final v f2585c;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f2586e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2587f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2588g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2589h;

    public u(v vVar, Bundle bundle, boolean z5, int i6, boolean z6) {
        this.f2585c = vVar;
        this.f2586e = bundle;
        this.f2587f = z5;
        this.f2588g = i6;
        this.f2589h = z6;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u uVar) {
        AbstractC1276k.f(uVar, "other");
        boolean z5 = uVar.f2589h;
        boolean z6 = uVar.f2587f;
        Bundle bundle = uVar.f2586e;
        boolean z7 = this.f2587f;
        if (z7 && !z6) {
            return 1;
        }
        if (!z7 && z6) {
            return -1;
        }
        int i6 = this.f2588g - uVar.f2588g;
        if (i6 > 0) {
            return 1;
        }
        if (i6 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f2586e;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            AbstractC1276k.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z8 = this.f2589h;
        if (!z8 || z5) {
            return (z8 || !z5) ? 0 : -1;
        }
        return 1;
    }
}
