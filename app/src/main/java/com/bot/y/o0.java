package y;

import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.e1;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e0.InterfaceC0958c;
import java.util.Map;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class o0 implements e0.f, InterfaceC0958c {

    /* renamed from: c, reason: collision with root package name */
    public final e0.g f15906c;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0958c f15907e;

    /* renamed from: f, reason: collision with root package name */
    public final k.N f15908f;

    public o0(e0.f fVar, Map map, InterfaceC0958c interfaceC0958c) {
        W0.e eVar = new W0.e(fVar, 19);
        e1 e1Var = e0.h.a;
        this.f15906c = new e0.g(map, eVar);
        this.f15907e = interfaceC0958c;
        k.N n3 = k.W.a;
        this.f15908f = new k.N();
    }

    @Override // e0.InterfaceC0958c
    public final void a(Object obj) {
        this.f15907e.a(obj);
    }

    @Override // e0.f
    public final boolean b(Object obj) {
        return this.f15906c.b(obj);
    }

    @Override // e0.f
    public final Map c() {
        k.N n3 = this.f15908f;
        Object[] objArr = n3.f12490b;
        long[] jArr = n3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j3) < 128) {
                            this.f15907e.a(objArr[(i6 << 3) + i8]);
                        }
                        j3 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        return this.f15906c.c();
    }

    @Override // e0.f
    public final Object d(String str) {
        return this.f15906c.d(str);
    }

    @Override // e0.f
    public final e0.e e(String str, InterfaceC1193a interfaceC1193a) {
        return this.f15906c.e(str, interfaceC1193a);
    }

    @Override // e0.InterfaceC0958c
    public final void f(Object obj, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-858296452);
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
            this.f15907e.f(obj, c0873f, c0626q, i7 & 126);
            boolean h3 = c0626q.h(this) | c0626q.h(obj);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new Z2.X(23, this, obj);
                c0626q.m0(P5);
            }
            T.r.d(obj, (l4.c) P5, c0626q);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.e1(this, obj, c0873f, i6, 13);
        }
    }
}
