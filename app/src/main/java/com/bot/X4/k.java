package X4;

import B0.M;
import Z2.C;
import Z2.a1;
import a3.C0810H;
import a3.C0811I;
import f0.C0996s;
import java.io.IOException;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class k implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9450c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9452f;

    public /* synthetic */ k(int i6, Object obj, Object obj2) {
        this.f9450c = i6;
        this.f9451e = obj;
        this.f9452f = obj2;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f9450c) {
            case 0:
                o oVar = (o) this.f9452f;
                s sVar = (s) this.f9451e;
                try {
                    if (!sVar.c(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                    } while (sVar.c(false, this));
                    oVar.c(1, 9, null);
                } catch (IOException e6) {
                    oVar.c(2, 2, e6);
                } catch (Throwable th) {
                    oVar.c(3, 3, null);
                    R4.b.d(sVar);
                    throw th;
                }
                R4.b.d(sVar);
                return X3.y.a;
            case 1:
                Y3.r.d0((C0996s) this.f9451e, new M((C) this.f9452f, 4));
                return X3.y.a;
            case 2:
                ((l4.c) this.f9451e).f(((C0810H) this.f9452f).a.a);
                return X3.y.a;
            default:
                ((C0811I) this.f9451e).e(((a1) this.f9452f).a);
                return X3.y.a;
        }
    }

    public k(o oVar, s sVar) {
        this.f9450c = 0;
        this.f9452f = oVar;
        this.f9451e = sVar;
    }
}
