package i1;

import D.Y;
import m4.AbstractC1277l;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081a extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogC1103w f11963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1081a(DialogC1103w dialogC1103w, int i6) {
        super(1);
        this.f11962e = i6;
        this.f11963f = dialogC1103w;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f11962e) {
            case 0:
                DialogC1103w dialogC1103w = this.f11963f;
                dialogC1103w.show();
                return new Y(dialogC1103w, 12);
            default:
                DialogC1103w dialogC1103w2 = this.f11963f;
                if (dialogC1103w2.f12022h.a) {
                    dialogC1103w2.f12021g.b();
                }
                return X3.y.a;
        }
    }
}
