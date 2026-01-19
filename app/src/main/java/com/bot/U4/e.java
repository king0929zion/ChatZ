package U4;

import H0.z0;
import Q4.B;
import Q4.C0493a;
import Q4.p;
import X4.C0710a;
import java.io.IOException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e {
    public final l a;

    /* renamed from: b, reason: collision with root package name */
    public final C0493a f8700b;

    /* renamed from: c, reason: collision with root package name */
    public final i f8701c;

    /* renamed from: d, reason: collision with root package name */
    public n f8702d;

    /* renamed from: e, reason: collision with root package name */
    public z0 f8703e;

    /* renamed from: f, reason: collision with root package name */
    public int f8704f;

    /* renamed from: g, reason: collision with root package name */
    public int f8705g;

    /* renamed from: h, reason: collision with root package name */
    public int f8706h;

    /* renamed from: i, reason: collision with root package name */
    public B f8707i;

    public e(l lVar, C0493a c0493a, i iVar) {
        AbstractC1276k.f(lVar, "connectionPool");
        this.a = lVar;
        this.f8700b = c0493a;
        this.f8701c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x036a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11, types: [H0.z0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [U4.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final U4.k a(int r13, int r14, int r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.e.a(int, int, int, boolean, boolean):U4.k");
    }

    public final boolean b(p pVar) {
        AbstractC1276k.f(pVar, "url");
        p pVar2 = this.f8700b.f6493h;
        return pVar.f6568e == pVar2.f6568e && AbstractC1276k.b(pVar.f6567d, pVar2.f6567d);
    }

    public final void c(IOException iOException) {
        AbstractC1276k.f(iOException, "e");
        this.f8707i = null;
        if ((iOException instanceof X4.B) && ((X4.B) iOException).f9417c == 8) {
            this.f8704f++;
        } else if (iOException instanceof C0710a) {
            this.f8705g++;
        } else {
            this.f8706h++;
        }
    }
}
