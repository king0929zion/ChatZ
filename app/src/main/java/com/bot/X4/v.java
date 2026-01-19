package X4;

import d5.C0946f;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends C0946f {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f9516m;

    public v(w wVar) {
        this.f9516m = wVar;
    }

    @Override // d5.C0946f
    public final void j() {
        this.f9516m.e(9);
        o oVar = this.f9516m.f9517b;
        synchronized (oVar) {
            long j3 = oVar.f9479q;
            long j4 = oVar.f9478p;
            if (j3 < j4) {
                return;
            }
            oVar.f9478p = j4 + 1;
            oVar.f9480r = System.nanoTime() + 1000000000;
            oVar.f9473k.c(new T4.b(B3.e.s(new StringBuilder(), oVar.f9468f, " ping"), oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
