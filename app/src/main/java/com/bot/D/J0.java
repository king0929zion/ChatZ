package D;

import H0.AbstractC0157l;
import I0.AbstractC0204q0;
import Z2.AbstractC0783w;
import android.graphics.Paint;
import android.os.Bundle;
import b0.C0873f;
import com.bot.core.database.dao.MessageDao_Impl;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1276k;
import m4.C1283r;
import m4.C1285t;
import m4.C1286u;
import m4.C1288w;
import n0.C1354c;
import o0.C1400k;
import q0.C1496b;
import r.AbstractC1532L0;
import r.C1534M0;
import r.E1;
import x.C1856g;
import x4.InterfaceC1942y;
import z4.C2057h;

/* loaded from: classes.dex */
public final /* synthetic */ class J0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f794c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f799i;

    public /* synthetic */ J0(X0.v vVar, M.e eVar, X0.k kVar, C0091s c0091s, l4.c cVar) {
        this.f794c = 2;
        this.f797g = vVar;
        this.f795e = eVar;
        this.f796f = kVar;
        this.f798h = c0091s;
        this.f799i = cVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6;
        List list;
        X3.y updateMessage$lambda$5;
        int i7 = this.f794c;
        X3.y yVar = X3.y.a;
        Object obj2 = this.f799i;
        Object obj3 = this.f798h;
        Object obj4 = this.f797g;
        Object obj5 = this.f796f;
        Object obj6 = this.f795e;
        switch (i7) {
            case 0:
                X0.p pVar = (X0.p) obj5;
                X0.v vVar = (X0.v) obj4;
                C0098v0 c0098v0 = (C0098v0) obj3;
                o0.N n3 = (o0.N) obj2;
                H0.L l3 = (H0.L) obj;
                l3.b();
                C1496b c1496b = l3.f1765c;
                float g3 = ((M.m) obj6).f3176c.g();
                if (g3 != S.l.f7374V) {
                    long j3 = vVar.f9125b;
                    int i8 = S0.O.f7611c;
                    int b5 = pVar.b((int) (j3 >> 32));
                    d1 d6 = c0098v0.d();
                    C1354c c6 = d6 != null ? d6.a.c(b5) : new C1354c(S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V);
                    float floor = (float) Math.floor(l3.e0(L0.a));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f6 = floor / 2;
                    float f7 = c6.a + f6;
                    float intBitsToFloat = Float.intBitsToFloat((int) (c1496b.c() >> 32)) - f6;
                    float f8 = f7 > intBitsToFloat ? intBitsToFloat : f7;
                    if (f8 >= f6) {
                        f6 = f8;
                    }
                    float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(f6)) + 0.5f : (float) Math.rint(f6);
                    long floatToRawIntBits = (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(c6.f13295b) & 4294967295L);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(c6.f13297d) & 4294967295L);
                    o0.q qVar = c1496b.f13943c.f13941c;
                    L1.d dVar = c1496b.f13946g;
                    if (dVar == null) {
                        dVar = o0.y.g();
                        dVar.l(1);
                        c1496b.f13946g = dVar;
                    }
                    n3.a(g3, c1496b.c(), dVar);
                    Paint paint = (Paint) dVar.f3002b;
                    if (!AbstractC1276k.b((C1400k) dVar.f3004d, null)) {
                        dVar.f(null);
                    }
                    if (dVar.a != 3) {
                        dVar.d(3);
                    }
                    if (paint.getStrokeWidth() != floor) {
                        dVar.k(floor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        ((Paint) dVar.f3002b).setStrokeMiter(4.0f);
                    }
                    if (dVar.a() == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        dVar.i(0);
                    }
                    if (dVar.b() != 0) {
                        dVar.j(i6);
                    }
                    if (!paint.isFilterBitmap()) {
                        dVar.g(1);
                    }
                    qVar.g(floatToRawIntBits, floatToRawIntBits2, dVar);
                }
                return yVar;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                C1286u c1286u = (C1286u) obj4;
                L1.i iVar = (L1.i) obj3;
                Bundle bundle = (Bundle) obj2;
                I1.j jVar = (I1.j) obj;
                AbstractC1276k.f(jVar, "entry");
                ((C1283r) obj6).f12968c = true;
                int indexOf = arrayList.indexOf(jVar);
                if (indexOf != -1) {
                    int i9 = indexOf + 1;
                    list = arrayList.subList(c1286u.f12971c, i9);
                    c1286u.f12971c = i9;
                } else {
                    list = Y3.v.f9812c;
                }
                iVar.a(jVar.f2544e, bundle, jVar, list);
                return yVar;
            case 2:
                M.y yVar2 = (M.y) obj;
                M.t tVar = ((M.e) obj6).a;
                yVar2.f3213h = (X0.v) obj4;
                yVar2.f3214i = (X0.k) obj5;
                yVar2.f3208c = (C0091s) obj3;
                yVar2.f3209d = (l4.c) obj2;
                yVar2.f3210e = tVar != null ? tVar.f3187s : null;
                yVar2.f3211f = tVar != null ? tVar.f3188t : null;
                yVar2.f3212g = tVar != null ? (I0.X0) AbstractC0157l.h(tVar, AbstractC0204q0.f2369s) : null;
                return yVar;
            case 3:
                List list2 = (List) obj6;
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) obj5;
                T.X x5 = (T.X) obj4;
                l4.c cVar = (l4.c) obj3;
                T.X x6 = (T.X) obj2;
                C1856g c1856g = (C1856g) obj;
                AbstractC1276k.f(c1856g, "$this$LazyColumn");
                if (list2.isEmpty()) {
                    C1856g.n(c1856g, null, AbstractC0783w.f10439q, 3);
                } else {
                    c1856g.o(list2.size(), new C0069g0(12, new S2.Y(12), list2), new P2.S(list2, 10), new C0873f(new J1.B(list2, interfaceC1942y, x5, cVar, x6), true, 802480018));
                }
                return yVar;
            case 4:
                M1.b bVar = (M1.b) obj6;
                C1288w c1288w = (C1288w) obj5;
                C1285t c1285t = (C1285t) obj4;
                E1 e12 = (E1) obj3;
                C1283r c1283r = (C1283r) obj2;
                float floatValue = ((Float) obj).floatValue();
                C1534M0 g6 = M1.b.g((C2057h) bVar.f3237f);
                if (g6 != null) {
                    bVar.h(g6);
                    C1534M0 a = ((C1534M0) c1288w.f12973c).a(g6);
                    c1288w.f12973c = a;
                    c1285t.f12970c = e12.i(e12.e(a.a));
                    c1283r.f12968c = !AbstractC1532L0.a(r4 - floatValue);
                }
                return Boolean.valueOf(g6 != null);
            default:
                updateMessage$lambda$5 = MessageDao_Impl.updateMessage$lambda$5("\n        UPDATE messages SET\n            content = ?,\n            reasoningContent = ?,\n            reasoningDurationMs = ?,\n            toolCallsJson = ?\n        WHERE id = ?\n    ", (String) obj6, (String) obj5, (Long) obj4, (String) obj3, (String) obj2, (X1.a) obj);
                return updateMessage$lambda$5;
        }
    }

    public /* synthetic */ J0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i6) {
        this.f794c = i6;
        this.f795e = obj;
        this.f796f = obj2;
        this.f797g = obj3;
        this.f798h = obj4;
        this.f799i = obj5;
    }
}
