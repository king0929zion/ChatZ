package x3;

import D.P0;
import N3.o;
import X3.n;
import b4.InterfaceC0908f;
import b4.InterfaceC0910h;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import w3.AbstractC1847d;
import w3.InterfaceC1848e;
import x4.AbstractC1888A;
import x4.C1911Y;
import x4.C1940w;
import x4.EnumC1943z;
import x4.InterfaceC1922e0;
import x4.InterfaceC1934q;
import x4.g0;
import z3.N;

/* renamed from: x3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883g extends AbstractC1847d {

    /* renamed from: l, reason: collision with root package name */
    public static final n f15619l = X3.a.d(C1880d.f15606e);

    /* renamed from: g, reason: collision with root package name */
    public final C1878b f15620g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f15621h = Y3.k.C0(new InterfaceC1848e[]{N.f16254d, D3.a.a});

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0910h f15622i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0910h f15623j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f15624k;

    public C1883g(C1878b c1878b) {
        this.f15620g = c1878b;
        Map synchronizedMap = Collections.synchronizedMap(new o(new P0(1, this, C1883g.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0, 0, 12), c1878b.f15603b));
        AbstractC1276k.e(synchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        this.f15624k = synchronizedMap;
        InterfaceC0908f r5 = super.c().r(C1940w.f15731e);
        AbstractC1276k.c(r5);
        InterfaceC0910h P5 = Y4.d.P(new g0((InterfaceC1922e0) r5), new N3.k(C1940w.f15730c, 0));
        this.f15622i = P5;
        this.f15623j = super.c().Y(P5);
        AbstractC1888A.x(C1911Y.f15677c, super.c(), EnumC1943z.f15741f, new C1879c(this, null));
    }

    @Override // w3.AbstractC1847d, x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f15623j;
    }

    @Override // w3.AbstractC1847d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        InterfaceC0908f r5 = this.f15622i.r(C1940w.f15731e);
        AbstractC1276k.d(r5, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((g0) ((InterfaceC1934q) r5)).n0();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(E3.e r23, d4.c r24) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C1883g.d(E3.e, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(Q4.t r15, Q4.v r16, b4.InterfaceC0910h r17, E3.e r18, d4.c r19) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C1883g.f(Q4.t, Q4.v, b4.h, E3.e, d4.c):java.lang.Object");
    }
}
