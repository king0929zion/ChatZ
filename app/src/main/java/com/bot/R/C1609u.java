package r;

import i4.AbstractC1117a;
import java.util.concurrent.CancellationException;
import u.AbstractC1734b;
import x4.InterfaceC1927j;
import y.C1973m;

/* renamed from: r.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1609u {
    public final V.e a;

    public C1609u(int i6) {
        switch (i6) {
            case 1:
                this.a = new V.e(new C1973m[16]);
                return;
            default:
                this.a = new V.e(new C1509A[16]);
                return;
        }
    }

    public void a(CancellationException cancellationException) {
        V.e eVar = this.a;
        int i6 = eVar.f8761f;
        InterfaceC1927j[] interfaceC1927jArr = new InterfaceC1927j[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            interfaceC1927jArr[i7] = ((C1509A) eVar.f8759c[i7]).f13960b;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            interfaceC1927jArr[i8].w(cancellationException);
        }
        if (eVar.f8761f == 0) {
            return;
        }
        AbstractC1734b.c("uncancelled requests present");
    }

    public void b() {
        V.e eVar = this.a;
        r4.g z5 = AbstractC1117a.z(0, eVar.f8761f);
        int i6 = z5.f14679c;
        int i7 = z5.f14680e;
        if (i6 <= i7) {
            while (true) {
                ((C1509A) eVar.f8759c[i6]).f13960b.k(X3.y.a);
                if (i6 == i7) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        eVar.g();
    }
}
