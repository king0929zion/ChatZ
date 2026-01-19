package y2;

import Q.N;
import Q.O;
import Q.S1;
import S.l;
import T.C0602e;
import T.C0603e0;
import T.C0616l;
import T.C0626q;
import T.e1;
import Z2.C0741a0;
import h0.AbstractC1024a;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import l4.InterfaceC1193a;
import l4.f;
import m4.AbstractC1276k;
import o0.s;
import o0.y;
import p.AbstractC1450o0;
import p.AbstractC1464z;
import p.InterfaceC1455r0;
import t.C1682j;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1992b {
    public static final String[] a = {"B", "KB", "MB", "GB", "TB"};

    static {
        AbstractC1276k.e(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.systemDefault()), "withZone(...)");
    }

    public static InterfaceC1041r a(int i6, InterfaceC1041r interfaceC1041r, final InterfaceC1193a interfaceC1193a, final boolean z5) {
        if ((i6 & 2) != 0) {
            z5 = true;
        }
        final boolean z6 = (i6 & 16) != 0;
        AbstractC1276k.f(interfaceC1041r, "<this>");
        AbstractC1276k.f(interfaceC1193a, "onClick");
        return AbstractC1024a.a(interfaceC1041r, new f() { // from class: y2.a
            @Override // l4.f
            public final Object d(Object obj, Object obj2, Object obj3) {
                InterfaceC1455r0 interfaceC1455r0;
                InterfaceC1041r interfaceC1041r2 = (InterfaceC1041r) obj;
                C0626q c0626q = (C0626q) obj2;
                ((Integer) obj3).getClass();
                AbstractC1276k.f(interfaceC1041r2, "$this$composed");
                c0626q.b0(1095546672);
                Object P5 = c0626q.P();
                C0602e c0602e = C0616l.a;
                if (P5 == c0602e) {
                    P5 = new C0603e0(0L);
                    c0626q.m0(P5);
                }
                C0603e0 c0603e0 = (C0603e0) P5;
                c0626q.b0(-25458485);
                Object P6 = c0626q.P();
                if (P6 == c0602e) {
                    P6 = new C1682j();
                    c0626q.m0(P6);
                }
                C1682j c1682j = (C1682j) P6;
                c0626q.p(false);
                if (z6) {
                    c0626q.b0(-25345087);
                    e1 e1Var = O.a;
                    if (y.t(((N) c0626q.j(e1Var)).f5424n) < 0.5f) {
                        c0626q.b0(-25232557);
                        interfaceC1455r0 = S1.a(l.f7374V, 3, s.c(0.85f, ((N) c0626q.j(e1Var)).f5427q), false);
                        c0626q.p(false);
                    } else {
                        c0626q.b0(-25133853);
                        interfaceC1455r0 = (InterfaceC1455r0) c0626q.j(AbstractC1450o0.a);
                        c0626q.p(false);
                    }
                    c0626q.p(false);
                } else {
                    c0626q.b0(-25076162);
                    c0626q.p(false);
                    interfaceC1455r0 = null;
                }
                boolean e6 = c0626q.e(500L);
                InterfaceC1193a interfaceC1193a2 = interfaceC1193a;
                boolean f6 = e6 | c0626q.f(interfaceC1193a2);
                Object P7 = c0626q.P();
                if (f6 || P7 == c0602e) {
                    P7 = new C0741a0(interfaceC1193a2, c0603e0);
                    c0626q.m0(P7);
                }
                InterfaceC1041r j3 = AbstractC1464z.j(interfaceC1041r2, c1682j, interfaceC1455r0, z5, null, (InterfaceC1193a) P7, 24);
                c0626q.p(false);
                return j3;
            }
        });
    }

    public static final String b(long j3) {
        if (j3 <= 0) {
            return "0 B";
        }
        double d6 = j3;
        int f6 = AbstractC1117a.f((int) (Math.log10(d6) / Math.log10(1024.0d)), 0, 4);
        return String.format("%.1f %s", Arrays.copyOf(new Object[]{Double.valueOf(d6 / Math.pow(1024.0d, f6)), a[f6]}, 2));
    }
}
