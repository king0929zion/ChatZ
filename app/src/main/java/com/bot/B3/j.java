package B3;

import A4.C0017s;
import H0.C0158m;
import X2.H;
import androidx.lifecycle.N;
import b4.InterfaceC0905c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import v.AbstractC1787b;
import z3.C2023A;
import z3.C2025C;
import z3.C2031a;
import z3.C2032b;
import z3.C2036f;
import z3.C2045o;
import z3.J;
import z3.u;
import z3.v;
import z3.w;
import z3.x;

/* loaded from: classes.dex */
public final class j implements u {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i6) {
        this.a = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r1v5, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01e7 -> B:10:0x01ef). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(z3.S r18, E3.d r19, u3.C1759c r20, t3.d r21, d4.c r22) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.j.c(z3.S, E3.d, u3.c, t3.d, d4.c):java.lang.Object");
    }

    @Override // z3.u
    public final Object a(l4.c cVar) {
        switch (this.a) {
            case 0:
                k kVar = new k();
                cVar.f(kVar);
                g gVar = kVar.f526c;
                if (gVar == null) {
                    int i6 = i.a;
                    gVar = new A3.c(2, (byte) 0);
                }
                return new o(gVar, kVar.f527d, kVar.a, kVar.f525b);
            case 1:
                return new Object();
            case 2:
                return new C2036f(cVar);
            case 3:
                C2045o c2045o = new C2045o();
                cVar.f(c2045o);
                return new z3.r(Y3.m.C0(c2045o.a), Y3.m.C0(c2045o.f16288b), c2045o.f16289c);
            case 4:
                C0158m c0158m = new C0158m(15);
                cVar.f(c0158m);
                return new x((LinkedHashSet) c0158m.f1972e, (LinkedHashMap) c0158m.f1973f, (Charset) c0158m.f1974g);
            case AbstractC1787b.f15290g /* 5 */:
                cVar.f(new N(29));
                return new Object();
            case 6:
                return new Object();
            default:
                cVar.f(new Object());
                return new J();
        }
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, o4.a] */
    @Override // z3.u
    public final void b(Object obj, t3.d dVar) {
        AbstractC1410a abstractC1410a;
        C4.u uVar;
        int i6 = 0;
        int i7 = 6;
        int i8 = 4;
        int i9 = 3;
        int i10 = 1;
        InterfaceC0905c interfaceC0905c = null;
        switch (this.a) {
            case 0:
                o oVar = (o) obj;
                AbstractC1276k.f(oVar, "plugin");
                AbstractC1276k.f(dVar, "scope");
                dVar.f14927j.f(E3.f.f1323n, new A3.e(oVar, interfaceC0905c, i10));
                F3.b bVar = dVar.f14928k;
                bVar.f(F3.b.f1578h, new m(oVar, (InterfaceC0905c) null));
                dVar.f14926i.f(F3.b.f1580j, new A3.f(oVar, interfaceC0905c, i9));
                if (e.a(oVar.f545b)) {
                    bVar.f(F3.b.f1579i, new C0017s(new C3.e(new n(oVar, null)), dVar, interfaceC0905c, i10));
                    return;
                }
                return;
            case 1:
                AbstractC1276k.f((C2032b) obj, "plugin");
                AbstractC1276k.f(dVar, "scope");
                C4.u uVar2 = new C4.u("ObservableContent", 1);
                E3.f fVar = dVar.f14925h;
                C4.u uVar3 = E3.f.f1319j;
                ArrayList arrayList = fVar.a;
                AbstractC1276k.f(uVar3, "reference");
                if (!fVar.e(uVar2)) {
                    int c6 = fVar.c(uVar3);
                    if (c6 == -1) {
                        throw new Q3.c("Phase " + uVar3 + " was not registered for this pipeline");
                    }
                    int i11 = c6 + 1;
                    int C5 = Y4.l.C(arrayList);
                    if (i11 <= C5) {
                        while (true) {
                            Object obj2 = arrayList.get(i11);
                            Q3.d dVar2 = obj2 instanceof Q3.d ? (Q3.d) obj2 : null;
                            if (dVar2 != null && (abstractC1410a = dVar2.f6460b) != null) {
                                Q3.h hVar = abstractC1410a instanceof Q3.h ? (Q3.h) abstractC1410a : null;
                                if (hVar != null && (uVar = hVar.f6467e) != null && uVar.equals(uVar3)) {
                                    c6 = i11;
                                }
                                if (i11 != C5) {
                                    i11++;
                                }
                            }
                        }
                    }
                    arrayList.add(c6 + 1, new Q3.d(uVar2, new Q3.h(uVar3)));
                }
                fVar.f(uVar2, new C2031a(i9, i6, interfaceC0905c));
                dVar.f14928k.f(F3.b.f1579i, new A3.e(i9, i8, interfaceC0905c));
                return;
            case 2:
                C2036f c2036f = (C2036f) obj;
                AbstractC1276k.f(c2036f, "plugin");
                AbstractC1276k.f(dVar, "scope");
                dVar.f14925h.f(E3.f.f1316g, new H(c2036f, null));
                return;
            case 3:
                z3.r rVar = (z3.r) obj;
                AbstractC1276k.f(rVar, "plugin");
                AbstractC1276k.f(dVar, "scope");
                dVar.f14925h.f(E3.f.f1316g, new A3.f(rVar, interfaceC0905c, i7));
                C4.u uVar4 = new C4.u("BeforeReceive", 1);
                F3.b bVar2 = dVar.f14926i;
                C4.u uVar5 = F3.b.f1580j;
                bVar2.getClass();
                AbstractC1276k.f(uVar5, "reference");
                if (!bVar2.e(uVar4)) {
                    int c7 = bVar2.c(uVar5);
                    if (c7 == -1) {
                        throw new Q3.c("Phase " + uVar5 + " was not registered for this pipeline");
                    }
                    bVar2.a.add(c7, new Q3.d(uVar4, new Object()));
                }
                bVar2.f(uVar4, new A3.f(rVar, interfaceC0905c, 7));
                j jVar = J.f16246b;
                ((J) v.a(dVar)).a.add(new A3.f(rVar, interfaceC0905c, 8));
                return;
            case 4:
                x xVar = (x) obj;
                AbstractC1276k.f(xVar, "plugin");
                AbstractC1276k.f(dVar, "scope");
                dVar.f14925h.f(E3.f.f1319j, new w(xVar, interfaceC0905c, i6));
                dVar.f14926i.f(F3.b.f1582l, new w(xVar, interfaceC0905c, i10));
                return;
            case AbstractC1787b.f15290g /* 5 */:
                C2023A c2023a = (C2023A) obj;
                AbstractC1276k.f(c2023a, "plugin");
                AbstractC1276k.f(dVar, "scope");
                j jVar2 = J.f16246b;
                ((J) v.a(dVar)).a.add(new m(c2023a, dVar, interfaceC0905c, i9));
                return;
            case 6:
                AbstractC1276k.f((C2025C) obj, "plugin");
                AbstractC1276k.f(dVar, "scope");
                dVar.f14925h.f(E3.f.f1316g, new A3.e(dVar, interfaceC0905c, i7));
                return;
            default:
                J j3 = (J) obj;
                AbstractC1276k.f(j3, "plugin");
                AbstractC1276k.f(dVar, "scope");
                dVar.f14925h.f(E3.f.f1320k, new m(j3, dVar, interfaceC0905c, i8));
                return;
        }
    }

    @Override // z3.u
    public final N3.a getKey() {
        switch (this.a) {
            case 0:
                return o.f544f;
            case 1:
                return C2032b.f16265b;
            case 2:
                return C2036f.f16271c;
            case 3:
                return z3.r.f16299e;
            case 4:
                return x.f16313e;
            case AbstractC1787b.f15290g /* 5 */:
                return C2023A.f16235b;
            case 6:
                return C2025C.f16238b;
            default:
                return J.f16247c;
        }
    }
}
