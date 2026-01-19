package e0;

import D.C0091s;
import S2.Y;
import T.C0602e;
import T.C0616l;
import T.C0625p0;
import T.C0626q;
import T.C0627q0;
import T.e1;
import T.r;
import X3.y;
import Z2.C0789z;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.Map;
import k.M;
import k.V;

/* loaded from: classes.dex */
public final class d implements InterfaceC0958c {

    /* renamed from: h, reason: collision with root package name */
    public static final k f11552h = new k(0, new C0789z(15), new Y(27));

    /* renamed from: c, reason: collision with root package name */
    public final Map f11553c;

    /* renamed from: e, reason: collision with root package name */
    public final M f11554e;

    /* renamed from: f, reason: collision with root package name */
    public f f11555f;

    /* renamed from: g, reason: collision with root package name */
    public final W0.e f11556g;

    public d(Map map) {
        this.f11553c = map;
        long[] jArr = V.a;
        this.f11554e = new M();
        this.f11556g = new W0.e(this, 6);
    }

    @Override // e0.InterfaceC0958c
    public final void a(Object obj) {
        if (this.f11554e.k(obj) == null) {
            this.f11553c.remove(obj);
        }
    }

    @Override // e0.InterfaceC0958c
    public final void f(Object obj, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(533563200);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(obj) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0873f) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(this) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            c0626q.e0(obj);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                W0.e eVar = this.f11556g;
                if (!((Boolean) eVar.f(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f11553c.get(obj);
                e1 e1Var = h.a;
                i iVar = new i(new g(map, eVar));
                c0626q.m0(iVar);
                P5 = iVar;
            }
            i iVar2 = (i) P5;
            r.b(new C0625p0[]{h.a.a(iVar2), V1.a.a.a(iVar2)}, c0873f, c0626q, (i7 & 112) | 8);
            boolean h3 = c0626q.h(this) | c0626q.h(obj) | c0626q.h(iVar2);
            Object P6 = c0626q.P();
            if (h3 || P6 == c0602e) {
                P6 = new C0091s(this, obj, iVar2, 21);
                c0626q.m0(P6);
            }
            r.d(y.a, (l4.c) P6, c0626q);
            if (c0626q.f8189y && c0626q.f8151G.f7960i == c0626q.f8190z) {
                c0626q.f8190z = -1;
                c0626q.f8189y = false;
            }
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.e1(this, obj, c0873f, i6, 8);
        }
    }
}
