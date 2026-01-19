package f0;

import H0.L;
import I0.AbstractC0204q0;
import T.InterfaceC0617l0;
import T.e1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import g2.InterfaceC1019c;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.C0;
import n.C1321e0;
import n.C1338n;
import n.C1340o;
import n.C1342q;
import n.V;
import n0.C1353b;
import n0.C1354c;
import n0.C1356e;
import o4.AbstractC1410a;
import p.AbstractC1461w;
import p.C1460v;
import p.D0;
import p.E0;
import v.AbstractC1787b;

/* renamed from: f0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0990m implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11702c;

    public /* synthetic */ C0990m(int i6) {
        this.f11702c = i6;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X3.f] */
    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f11702c;
        X3.y yVar = X3.y.a;
        switch (i6) {
            case 0:
                C0990m c0990m = AbstractC0992o.a;
                return yVar;
            case 1:
                InterfaceC1019c interfaceC1019c = (InterfaceC1019c) obj;
                AbstractC1276k.f(interfaceC1019c, "it");
                return interfaceC1019c;
            case 2:
                return (j2.e) obj;
            case 3:
                if (obj != null) {
                    throw new ClassCastException();
                }
                AbstractC1276k.f(null, "it");
                throw null;
            case 4:
                return yVar;
            case AbstractC1787b.f15290g /* 5 */:
                C1321e0 c1321e0 = (C1321e0) obj;
                long j3 = c1321e0.f13138f;
                ((C1001x) C0.f12980b.getValue()).d(c1321e0, C0.a, c1321e0.f13139g);
                long j4 = c1321e0.f13138f;
                if (j3 != j4) {
                    V v5 = c1321e0.f13146n;
                    if (v5 != null) {
                        if (v5.a > j4) {
                            c1321e0.y();
                        } else {
                            v5.f13051g = j4;
                            if (v5.f13046b == null) {
                                v5.f13052h = AbstractC1410a.L((1.0d - v5.f13049e.a(0)) * c1321e0.f13138f);
                            }
                        }
                    } else if (j4 != 0) {
                        c1321e0.B();
                    }
                }
                return yVar;
            case 6:
                ((InterfaceC1193a) obj).b();
                return yVar;
            case 7:
                return new C1338n(((Float) obj).floatValue());
            case 8:
                return new C1338n(((Integer) obj).intValue());
            case AbstractC1787b.f15287d /* 9 */:
                return Integer.valueOf((int) ((C1338n) obj).a);
            case AbstractC1787b.f15289f /* 10 */:
                return new C1338n(((e1.f) obj).f11571c);
            case 11:
                return new e1.f(((C1338n) obj).a);
            case 12:
                e1.g gVar = (e1.g) obj;
                return new C1340o(Float.intBitsToFloat((int) (gVar.a >> 32)), Float.intBitsToFloat((int) (gVar.a & 4294967295L)));
            case 13:
                C1340o c1340o = (C1340o) obj;
                return new e1.g((Float.floatToRawIntBits(c1340o.a) << 32) | (Float.floatToRawIntBits(c1340o.f13202b) & 4294967295L));
            case 14:
                C1356e c1356e = (C1356e) obj;
                return new C1340o(Float.intBitsToFloat((int) (c1356e.a >> 32)), Float.intBitsToFloat((int) (c1356e.a & 4294967295L)));
            case 15:
                C1340o c1340o2 = (C1340o) obj;
                return new C1356e((Float.floatToRawIntBits(c1340o2.a) << 32) | (Float.floatToRawIntBits(c1340o2.f13202b) & 4294967295L));
            case PegdownExtensions.AUTOLINKS /* 16 */:
                C1353b c1353b = (C1353b) obj;
                return new C1340o(Float.intBitsToFloat((int) (c1353b.a >> 32)), Float.intBitsToFloat((int) (c1353b.a & 4294967295L)));
            case 17:
                C1340o c1340o3 = (C1340o) obj;
                return new C1353b((Float.floatToRawIntBits(c1340o3.a) << 32) | (Float.floatToRawIntBits(c1340o3.f13202b) & 4294967295L));
            case 18:
                long j5 = ((e1.j) obj).a;
                return new C1340o((int) (j5 >> 32), (int) (j5 & 4294967295L));
            case 19:
                C1340o c1340o4 = (C1340o) obj;
                return new e1.j((Math.round(c1340o4.a) << 32) | (Math.round(c1340o4.f13202b) & 4294967295L));
            case 20:
                long j6 = ((e1.l) obj).a;
                return new C1340o((int) (j6 >> 32), (int) (j6 & 4294967295L));
            case 21:
                C1340o c1340o5 = (C1340o) obj;
                int round = Math.round(c1340o5.a);
                if (round < 0) {
                    round = 0;
                }
                return new e1.l((round << 32) | ((Math.round(c1340o5.f13202b) >= 0 ? r11 : 0) & 4294967295L));
            case 22:
                C1354c c1354c = (C1354c) obj;
                return new C1342q(c1354c.a, c1354c.f13295b, c1354c.f13296c, c1354c.f13297d);
            case 23:
                C1342q c1342q = (C1342q) obj;
                return new C1354c(c1342q.a, c1342q.f13215b, c1342q.f13216c, c1342q.f13217d);
            case 24:
                return Float.valueOf(((C1338n) obj).a);
            case 25:
                ((L) obj).b();
                return yVar;
            case 26:
                return yVar;
            case 27:
                ((Long) obj).getClass();
                return yVar;
            case 28:
                InterfaceC0617l0 interfaceC0617l0 = (InterfaceC0617l0) obj;
                int i7 = AbstractC1461w.a;
                e1 e1Var = AndroidCompositionLocals_androidKt.f10780b;
                interfaceC0617l0.getClass();
                Context context = (Context) T.r.B(interfaceC0617l0, e1Var);
                InterfaceC0961c interfaceC0961c = (InterfaceC0961c) T.r.B(interfaceC0617l0, AbstractC0204q0.f2358h);
                D0 d02 = (D0) T.r.B(interfaceC0617l0, E0.a);
                if (d02 == null) {
                    return null;
                }
                return new C1460v(context, interfaceC0961c, d02.a, d02.f13573b);
            default:
                P0.h hVar = P0.h.f4438d;
                s4.e[] eVarArr = P0.v.a;
                P0.w wVar = P0.t.f4524c;
                s4.e eVar = P0.v.a[1];
                ((P0.x) obj).a(wVar, hVar);
                return yVar;
        }
    }
}
