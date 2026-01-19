package e0;

import B4.D;
import H0.C0158m;
import S2.Y;
import T.C0616l;
import T.C0626q;
import T.r;
import X3.y;
import Z2.C0782v0;
import Z2.C0789z;
import i4.AbstractC1120d;
import java.util.Arrays;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1291z;

/* loaded from: classes.dex */
public abstract class l {
    public static final k a = new k(0, new C0789z(16), new Y(28));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final k b(l4.e eVar, l4.c cVar) {
        D d6 = new D(eVar, 25);
        AbstractC1291z.b(1, cVar);
        return new k(0, d6, cVar);
    }

    public static final Object c(Object[] objArr, j jVar, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        return d(Arrays.copyOf(objArr, objArr.length), jVar, interfaceC1193a, c0626q, 384 | ((i6 << 3) & 7168), 0);
    }

    public static final Object d(Object[] objArr, j jVar, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6, int i7) {
        Object[] objArr2;
        final Object obj;
        Object d6;
        if ((i7 & 2) != 0) {
            jVar = a;
        }
        final j jVar2 = jVar;
        long j3 = c0626q.f8164T;
        AbstractC1120d.g(36);
        final String l3 = Long.toString(j3, 36);
        AbstractC1276k.e(l3, "toString(...)");
        AbstractC1276k.d(jVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final f fVar = (f) c0626q.j(h.a);
        Object P5 = c0626q.P();
        Object obj2 = C0616l.a;
        if (P5 == obj2) {
            Object d7 = (fVar == null || (d6 = fVar.d(l3)) == null) ? null : jVar2.d(d6);
            if (d7 == null) {
                d7 = interfaceC1193a.b();
            }
            objArr2 = objArr;
            Object c0957b = new C0957b(jVar2, fVar, l3, d7, objArr2);
            c0626q.m0(c0957b);
            P5 = c0957b;
        } else {
            objArr2 = objArr;
        }
        final C0957b c0957b2 = (C0957b) P5;
        Object obj3 = Arrays.equals(objArr2, c0957b2.f11549h) ? c0957b2.f11548g : null;
        if (obj3 == null) {
            obj3 = interfaceC1193a.b();
        }
        boolean h3 = c0626q.h(c0957b2) | ((((i6 & 112) ^ 48) > 32 && c0626q.h(jVar2)) || (i6 & 48) == 32) | c0626q.h(fVar) | c0626q.f(l3) | c0626q.h(obj3) | c0626q.h(objArr2);
        Object P6 = c0626q.P();
        if (h3 || P6 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            Object obj4 = new InterfaceC1193a() { // from class: e0.a
                @Override // l4.InterfaceC1193a
                public final Object b() {
                    boolean z5;
                    C0957b c0957b3 = C0957b.this;
                    f fVar2 = c0957b3.f11546e;
                    f fVar3 = fVar;
                    boolean z6 = true;
                    if (fVar2 != fVar3) {
                        c0957b3.f11546e = fVar3;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    String str = c0957b3.f11547f;
                    String str2 = l3;
                    if (AbstractC1276k.b(str, str2)) {
                        z6 = z5;
                    } else {
                        c0957b3.f11547f = str2;
                    }
                    c0957b3.f11545c = jVar2;
                    c0957b3.f11548g = obj;
                    c0957b3.f11549h = objArr3;
                    e eVar = c0957b3.f11550i;
                    if (eVar != null && z6) {
                        ((C0158m) eVar).t();
                        c0957b3.f11550i = null;
                        c0957b3.c();
                    }
                    return y.a;
                }
            };
            c0626q.m0(obj4);
            P6 = obj4;
        } else {
            obj = obj3;
        }
        r.j((InterfaceC1193a) P6, c0626q);
        return obj;
    }

    public static final Object e(Object[] objArr, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        return d(Arrays.copyOf(objArr, objArr.length), a, interfaceC1193a, c0626q, ((i6 << 6) & 7168) | 384, 0);
    }

    public static final d f(C0626q c0626q) {
        c0626q.b0(1967007413);
        Object[] objArr = new Object[0];
        Object P5 = c0626q.P();
        if (P5 == C0616l.a) {
            P5 = new C0782v0(12);
            c0626q.m0(P5);
        }
        d dVar = (d) c(objArr, d.f11552h, (InterfaceC1193a) P5, c0626q, 384);
        dVar.f11555f = (f) c0626q.j(h.a);
        c0626q.p(false);
        return dVar;
    }
}
