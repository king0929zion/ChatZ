package B0;

import H0.E0;
import f0.C0987j;
import m4.AbstractC1277l;
import m4.C1283r;

/* renamed from: B0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030f extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f446e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1283r f447f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0030f(C0987j c0987j, k0.e eVar, C1283r c1283r) {
        super(1);
        this.f447f = c1283r;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f446e) {
            case 0:
                if (!((AbstractC0032h) obj).f451t) {
                    return E0.f1692c;
                }
                this.f447f.f12968c = false;
                return E0.f1694f;
            default:
                k0.e eVar = (k0.e) obj;
                if (!eVar.f11819q) {
                    return E0.f1693e;
                }
                if (eVar.f12596s != null) {
                    E0.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                eVar.f12596s = null;
                C1283r c1283r = this.f447f;
                c1283r.f12968c = c1283r.f12968c;
                return E0.f1692c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0030f(C1283r c1283r) {
        super(1);
        this.f447f = c1283r;
    }
}
