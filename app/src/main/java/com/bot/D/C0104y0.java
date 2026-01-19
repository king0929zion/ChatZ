package D;

import B0.AbstractC0047x;
import n0.C1353b;

/* renamed from: D.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0104y0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1236c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H0 f1237e;

    public /* synthetic */ C0104y0(H0 h02, int i6) {
        this.f1236c = i6;
        this.f1237e = h02;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f1236c) {
            case 0:
                this.f1237e.a(((C1353b) obj).a, O.I.f3953d);
                break;
            case 1:
                B0.y yVar = (B0.y) obj;
                this.f1237e.e(AbstractC0047x.h(yVar, false));
                yVar.a();
                break;
            default:
                B0.y yVar2 = (B0.y) obj;
                this.f1237e.e(AbstractC0047x.h(yVar2, false));
                yVar2.a();
                break;
        }
        return X3.y.a;
    }
}
