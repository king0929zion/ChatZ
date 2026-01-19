package m2;

import X3.n;
import android.net.Uri;
import i2.C1115i;
import m4.AbstractC1276k;
import s2.C1665m;

/* renamed from: m2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1260i implements InterfaceC1257f {
    public final n a;

    /* renamed from: b, reason: collision with root package name */
    public final n f12930b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12931c;

    public C1260i(n nVar, n nVar2, boolean z5) {
        this.a = nVar;
        this.f12930b = nVar2;
        this.f12931c = z5;
    }

    @Override // m2.InterfaceC1257f
    public final InterfaceC1258g a(Object obj, C1665m c1665m, C1115i c1115i) {
        Uri uri = (Uri) obj;
        if (!AbstractC1276k.b(uri.getScheme(), "http") && !AbstractC1276k.b(uri.getScheme(), "https")) {
            return null;
        }
        return new C1263l(uri.toString(), c1665m, this.a, this.f12930b, this.f12931c);
    }
}
