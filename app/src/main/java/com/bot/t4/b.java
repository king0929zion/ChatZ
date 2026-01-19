package T4;

import U4.k;
import U4.l;
import X4.o;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8521f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i6) {
        super(str, true);
        this.f8520e = i6;
        this.f8521f = obj;
    }

    @Override // T4.a
    public final long a() {
        switch (this.f8520e) {
            case 0:
                ((InterfaceC1193a) this.f8521f).b();
                return -1L;
            case 1:
                l lVar = (l) this.f8521f;
                long nanoTime = System.nanoTime();
                Iterator it = lVar.f8746d.iterator();
                int i6 = 0;
                long j3 = Long.MIN_VALUE;
                k kVar = null;
                int i7 = 0;
                while (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    AbstractC1276k.e(kVar2, "connection");
                    synchronized (kVar2) {
                        if (lVar.b(kVar2, nanoTime) > 0) {
                            i7++;
                        } else {
                            i6++;
                            long j4 = nanoTime - kVar2.f8743q;
                            if (j4 > j3) {
                                kVar = kVar2;
                                j3 = j4;
                            }
                        }
                    }
                }
                long j5 = lVar.a;
                if (j3 < j5 && i6 <= 5) {
                    if (i6 > 0) {
                        return j5 - j3;
                    }
                    if (i7 > 0) {
                        return j5;
                    }
                    return -1L;
                }
                AbstractC1276k.c(kVar);
                synchronized (kVar) {
                    if (!kVar.f8742p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f8743q + j3 != nanoTime) {
                        return 0L;
                    }
                    kVar.f8736j = true;
                    lVar.f8746d.remove(kVar);
                    Socket socket = kVar.f8730d;
                    AbstractC1276k.c(socket);
                    R4.b.e(socket);
                    if (!lVar.f8746d.isEmpty()) {
                        return 0L;
                    }
                    lVar.f8744b.a();
                    return 0L;
                }
            default:
                o oVar = (o) this.f8521f;
                oVar.getClass();
                try {
                    oVar.f9488z.p(2, 0, false);
                    return -1L;
                } catch (IOException e6) {
                    oVar.c(2, 2, e6);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.f8520e = 1;
        this.f8521f = lVar;
    }
}
