package U4;

import Q4.q;
import Q4.t;
import Q4.y;
import java.io.IOException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a implements q {
    public static final a a = new Object();

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, B0.B] */
    @Override // Q4.q
    public final y a(V4.f fVar) {
        i iVar = fVar.a;
        synchronized (iVar) {
            try {
                if (!iVar.f8724p) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f8723o) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f8722n) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = iVar.f8719k;
        AbstractC1276k.c(eVar);
        t tVar = iVar.f8712c;
        try {
            V4.d j3 = eVar.a(fVar.f8814f, fVar.f8815g, fVar.f8816h, tVar.f6610i, !AbstractC1276k.b(fVar.f8813e.f6636b, "GET")).j(tVar, fVar);
            AbstractC1276k.f(eVar, "finder");
            ?? obj = new Object();
            obj.f378b = iVar;
            obj.f379c = eVar;
            obj.f380d = j3;
            obj.f381e = j3.g();
            iVar.f8721m = obj;
            iVar.f8726r = obj;
            synchronized (iVar) {
                iVar.f8722n = true;
                iVar.f8723o = true;
            }
            if (iVar.f8725q) {
                throw new IOException("Canceled");
            }
            return V4.f.a(fVar, 0, obj, null, 61).b(fVar.f8813e);
        } catch (m e6) {
            eVar.c(e6.f8748e);
            throw e6;
        } catch (IOException e7) {
            eVar.c(e7);
            throw new m(e7);
        }
    }
}
