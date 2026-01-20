package O;

import m4.AbstractC1276k;
import m4.C1283r;
import r.C1566f1;

/* renamed from: O.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0311h0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4127c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1283r f4128e;

    public /* synthetic */ C0311h0(C1283r c1283r, int i6) {
        this.f4127c = i6;
        this.f4128e = c1283r;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        boolean z5;
        switch (this.f4127c) {
            case 0:
                if (((D) obj).f3927f.a.a.f7630e.length() > 0) {
                    this.f4128e.f12968c = false;
                }
                return X3.y.a;
            default:
                H0.F0Inner f02 = (H0.F0Inner) obj;
                C1283r c1283r = this.f4128e;
                if (!c1283r.f12968c) {
                    AbstractC1276k.d(f02, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (!((C1566f1) f02).f14316r) {
                        z5 = false;
                        c1283r.f12968c = z5;
                        return Boolean.valueOf(!z5);
                    }
                }
                z5 = true;
                c1283r.f12968c = z5;
                return Boolean.valueOf(!z5);
        }
    }
}
