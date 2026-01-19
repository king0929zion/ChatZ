package T;

import f0.C1000w;

/* renamed from: T.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624p {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8139b;

    public /* synthetic */ C0624p(Object obj, int i6) {
        this.a = i6;
        this.f8139b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                C0626q c0626q = (C0626q) this.f8139b;
                c0626q.f8145A--;
                return;
            default:
                C1000w c1000w = (C1000w) this.f8139b;
                c1000w.f11735k--;
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((C0626q) this.f8139b).f8145A++;
                return;
            default:
                ((C1000w) this.f8139b).f11735k++;
                return;
        }
    }
}
