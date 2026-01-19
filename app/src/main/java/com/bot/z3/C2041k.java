package z3;

import I3.AbstractC0239c;
import I3.C0241e;
import java.io.InputStream;
import java.util.List;
import m4.AbstractC1276k;
import x4.AbstractC1898K;
import x4.C1911Y;

/* renamed from: z3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041k extends J3.c {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Long f16279b;

    /* renamed from: c, reason: collision with root package name */
    public final C0241e f16280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16281d;

    public C2041k(E3.d dVar, C0241e c0241e, Object obj) {
        this.f16281d = obj;
        I3.n nVar = dVar.f1306c;
        List list = I3.r.a;
        String j3 = nVar.j("Content-Length");
        this.f16279b = j3 != null ? Long.valueOf(Long.parseLong(j3)) : null;
        if (c0241e == null) {
            C0241e c0241e2 = AbstractC0239c.a;
            c0241e = AbstractC0239c.f2740b;
        }
        this.f16280c = c0241e;
    }

    @Override // J3.d
    public final Long a() {
        switch (this.a) {
            case 0:
                return this.f16279b;
            default:
                return this.f16279b;
        }
    }

    @Override // J3.d
    public final C0241e b() {
        switch (this.a) {
            case 0:
                return this.f16280c;
            default:
                return this.f16280c;
        }
    }

    @Override // J3.c
    public final io.ktor.utils.io.y e() {
        int i6 = this.a;
        Object obj = this.f16281d;
        switch (i6) {
            case 0:
                return (io.ktor.utils.io.y) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                E4.e eVar = AbstractC1898K.a;
                E4.d dVar = E4.d.f1360f;
                W3.a aVar = W3.b.a;
                AbstractC1276k.f(inputStream, "<this>");
                AbstractC1276k.f(dVar, "context");
                AbstractC1276k.f(aVar, "pool");
                return io.ktor.utils.io.u.o(C1911Y.f15677c, dVar, true, new io.ktor.utils.io.jvm.javaio.k(aVar, inputStream, null)).f12088e;
        }
    }

    public C2041k(Q3.f fVar, C0241e c0241e, Object obj) {
        this.f16281d = obj;
        I3.n nVar = ((E3.d) fVar.f6466c).f1306c;
        List list = I3.r.a;
        String j3 = nVar.j("Content-Length");
        this.f16279b = j3 != null ? Long.valueOf(Long.parseLong(j3)) : null;
        if (c0241e == null) {
            C0241e c0241e2 = AbstractC0239c.a;
            c0241e = AbstractC0239c.f2740b;
        }
        this.f16280c = c0241e;
    }
}
