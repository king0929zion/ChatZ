package u3;

import N3.j;
import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1759c implements InterfaceC1942y {

    /* renamed from: c, reason: collision with root package name */
    public final t3.d f15161c;

    /* renamed from: e, reason: collision with root package name */
    public E3.b f15162e;

    /* renamed from: f, reason: collision with root package name */
    public F3.c f15163f;
    private volatile /* synthetic */ int received = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final N3.a f15160h = new N3.a("CustomResponse");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15159g = AtomicIntegerFieldUpdater.newUpdater(C1759c.class, "received");

    public C1759c(t3.d dVar) {
        this.f15161c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0095, code lost:
    
        if (r7 == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(R3.a r6, d4.c r7) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C1759c.a(R3.a, d4.c):java.lang.Object");
    }

    public boolean b() {
        return false;
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return e().c();
    }

    public final E3.b d() {
        E3.b bVar = this.f15162e;
        if (bVar != null) {
            return bVar;
        }
        AbstractC1276k.k("request");
        throw null;
    }

    public final F3.c e() {
        F3.c cVar = this.f15163f;
        if (cVar != null) {
            return cVar;
        }
        AbstractC1276k.k("response");
        throw null;
    }

    public Object f() {
        return e().d();
    }

    public final j getAttributes() {
        return d().getAttributes();
    }

    public final String toString() {
        return "HttpClientCall[" + d().getUrl() + ", " + e().g() + ']';
    }
}
