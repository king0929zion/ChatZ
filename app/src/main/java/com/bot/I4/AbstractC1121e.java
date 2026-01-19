package i4;

import B0.B;
import H0.AbstractC0157l;
import H0.C0158m;
import H0.C0165u;
import S.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import e1.m;
import io.ktor.utils.io.A;
import io.ktor.utils.io.t;
import java.io.BufferedReader;
import java.io.StringWriter;
import k.N;
import k.W;
import l1.C1185b;
import m4.AbstractC1276k;
import o0.AbstractC1380B;
import o0.AbstractC1392c;
import o0.AbstractC1399j;
import o0.C1383E;
import o0.C1384F;
import o0.C1385G;
import o0.C1397h;
import o0.C1400k;
import o0.q;
import o0.y;
import o4.AbstractC1410a;
import q0.C1495a;
import q0.C1496b;
import q0.InterfaceC1498d;
import u0.C1746g;
import v4.EnumC1827c;

/* renamed from: i4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1121e {
    public static C1746g a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f12085b;

    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b9, code lost:
    
        if (r54.d(1) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0344, code lost:
    
        if (r54.d(0) == false) goto L239;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x035b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0347  */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(h0.InterfaceC1041r r42, z.C2004b r43, final v.InterfaceC1802i0 r44, final s.C1643g r45, final boolean r46, final p.C1459u r47, final float r48, final z.C2010h r49, A0.a r50, final h0.C1032i r51, final s.C1649m r52, final b0.C0873f r53, T.C0626q r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC1121e.a(h0.r, z.b, v.i0, s.g, boolean, p.u, float, z.h, A0.a, h0.i, s.m, b0.f, T.q, int, int):void");
    }

    public static final boolean b(k0.e eVar, long j3) {
        if (!eVar.f11806c.f11819q) {
            return false;
        }
        C0165u c0165u = AbstractC0157l.v(eVar).f1721J.f1916c;
        if (!c0165u.f1999V.f11819q) {
            return false;
        }
        long U5 = c0165u.U(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (U5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (U5 & 4294967295L));
        long j4 = eVar.f12597t;
        float f6 = ((int) (j4 >> 32)) + intBitsToFloat;
        float f7 = ((int) (j4 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f6) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f7;
    }

    public static final boolean c(String str) {
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (AbstractC1276k.g(charAt, PegdownExtensions.FENCED_CODE_BLOCKS) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(z4.u r4, A.b r5, d4.c r6) {
        /*
            boolean r0 = r6 instanceof z4.s
            if (r0 == 0) goto L13
            r0 = r6
            z4.s r0 = (z4.s) r0
            int r1 = r0.f16379i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16379i = r1
            goto L18
        L13:
            z4.s r0 = new z4.s
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16378h
            int r1 = r0.f16379i
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            A.b r5 = r0.f16377g
            X3.a.e(r6)     // Catch: java.lang.Throwable -> L27
            goto L65
        L27:
            r4 = move-exception
            goto L6b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            X3.a.e(r6)
            b4.h r6 = r0.f11435e
            m4.AbstractC1276k.c(r6)
            x4.w r1 = x4.C1940w.f15731e
            b4.f r6 = r6.r(r1)
            if (r6 != r4) goto L6f
            r0.f16377g = r5     // Catch: java.lang.Throwable -> L27
            r0.f16379i = r2     // Catch: java.lang.Throwable -> L27
            x4.k r6 = new x4.k     // Catch: java.lang.Throwable -> L27
            b4.c r0 = Y4.d.K(r0)     // Catch: java.lang.Throwable -> L27
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L27
            r6.t()     // Catch: java.lang.Throwable -> L27
            B0.M r0 = new B0.M     // Catch: java.lang.Throwable -> L27
            r1 = 5
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L27
            z4.t r4 = (z4.t) r4     // Catch: java.lang.Throwable -> L27
            r4.q0(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r6.s()     // Catch: java.lang.Throwable -> L27
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r4 != r6) goto L65
            return r6
        L65:
            r5.b()
            X3.y r4 = X3.y.a
            return r4
        L6b:
            r5.b()
            throw r4
        L6f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC1121e.d(z4.u, A.b, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [m4.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(androidx.lifecycle.O r5, d4.c r6) {
        /*
            boolean r0 = r6 instanceof w2.C1832b
            if (r0 == 0) goto L13
            r0 = r6
            w2.b r0 = (w2.C1832b) r0
            int r1 = r0.f15398j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15398j = r1
            goto L18
        L13:
            w2.b r0 = new w2.b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15397i
            int r1 = r0.f15398j
            X3.y r2 = X3.y.a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            m4.w r5 = r0.f15396h
            androidx.lifecycle.O r0 = r0.f15395g
            X3.a.e(r6)     // Catch: java.lang.Throwable -> L2b
            goto L71
        L2b:
            r6 = move-exception
            goto L80
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            X3.a.e(r6)
            androidx.lifecycle.p r6 = r5.g()
            androidx.lifecycle.p r1 = androidx.lifecycle.EnumC0842p.f10878g
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L45
            return r2
        L45:
            m4.w r6 = new m4.w
            r6.<init>()
            r0.f15395g = r5     // Catch: java.lang.Throwable -> L7b
            r0.f15396h = r6     // Catch: java.lang.Throwable -> L7b
            r0.f15398j = r3     // Catch: java.lang.Throwable -> L7b
            x4.k r1 = new x4.k     // Catch: java.lang.Throwable -> L7b
            b4.c r0 = Y4.d.K(r0)     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7b
            r1.t()     // Catch: java.lang.Throwable -> L7b
            w2.c r0 = new w2.c     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7b
            r6.f12973c = r0     // Catch: java.lang.Throwable -> L7b
            r5.a(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r1.s()     // Catch: java.lang.Throwable -> L7b
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
            r5 = r6
        L71:
            java.lang.Object r5 = r5.f12973c
            androidx.lifecycle.t r5 = (androidx.lifecycle.InterfaceC0845t) r5
            if (r5 == 0) goto L7a
            r0.j(r5)
        L7a:
            return r2
        L7b:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L80:
            java.lang.Object r5 = r5.f12973c
            androidx.lifecycle.t r5 = (androidx.lifecycle.InterfaceC0845t) r5
            if (r5 == 0) goto L89
            r0.j(r5)
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC1121e.e(androidx.lifecycle.O, d4.c):java.lang.Object");
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static int g(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new C1185b(context).a.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static final void h(A a6) {
        AbstractC1276k.f(a6, "<this>");
        ((t) a6).i(null);
    }

    public static final double i(double d6, EnumC1827c enumC1827c, EnumC1827c enumC1827c2) {
        AbstractC1276k.f(enumC1827c2, "targetUnit");
        long convert = enumC1827c2.f15393c.convert(1L, enumC1827c.f15393c);
        return convert > 0 ? d6 * convert : d6 / r8.convert(1L, r9);
    }

    public static final long j(long j3, EnumC1827c enumC1827c, EnumC1827c enumC1827c2) {
        AbstractC1276k.f(enumC1827c, "sourceUnit");
        AbstractC1276k.f(enumC1827c2, "targetUnit");
        return enumC1827c2.f15393c.convert(j3, enumC1827c.f15393c);
    }

    public static final long k(long j3, EnumC1827c enumC1827c, EnumC1827c enumC1827c2) {
        AbstractC1276k.f(enumC1827c, "sourceUnit");
        AbstractC1276k.f(enumC1827c2, "targetUnit");
        return enumC1827c2.f15393c.convert(j3, enumC1827c.f15393c);
    }

    public static final void l(InterfaceC1498d interfaceC1498d, r0.b bVar) {
        boolean z5;
        boolean z6;
        Canvas canvas;
        boolean z7;
        float f6;
        q g3 = interfaceC1498d.g0().g();
        r0.b bVar2 = (r0.b) interfaceC1498d.g0().f1973f;
        r0.d dVar = bVar.a;
        if (bVar.f14551s) {
            return;
        }
        bVar.a();
        if (!dVar.p()) {
            try {
                bVar.a.m(bVar.f14534b, bVar.f14535c, bVar, bVar.f14537e);
            } catch (Throwable unused) {
            }
        }
        boolean z8 = dVar.L() > l.f7374V;
        if (z8) {
            g3.s();
        }
        Canvas a6 = AbstractC1392c.a(g3);
        boolean isHardwareAccelerated = a6.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j3 = bVar.f14552t;
            float f7 = (int) (j3 >> 32);
            float f8 = (int) (j3 & 4294967295L);
            long j4 = bVar.f14553u;
            float f9 = ((int) (j4 >> 32)) + f7;
            float f10 = ((int) (j4 & 4294967295L)) + f8;
            float a7 = dVar.a();
            C1400k k3 = dVar.k();
            int O5 = dVar.O();
            if (a7 < 1.0f || O5 != 3 || k3 != null || dVar.j() == 1) {
                L1.d dVar2 = bVar.f14548p;
                if (dVar2 == null) {
                    dVar2 = y.g();
                    bVar.f14548p = dVar2;
                }
                dVar2.c(a7);
                dVar2.d(O5);
                dVar2.f(k3);
                a6 = a6;
                f6 = f7;
                a6.saveLayer(f6, f8, f9, f10, (Paint) dVar2.f3002b);
            } else {
                a6.save();
                a6 = a6;
                f6 = f7;
            }
            a6.translate(f6, f8);
            a6.concat(dVar.I());
        }
        boolean z9 = !isHardwareAccelerated && bVar.f14555w;
        if (z9) {
            g3.h();
            y d6 = bVar.d();
            if (d6 instanceof C1384F) {
                q.q(g3, ((C1384F) d6).f13410f);
            } else if (d6 instanceof C1385G) {
                C1397h c1397h = bVar.f14545m;
                if (c1397h != null) {
                    c1397h.f();
                } else {
                    c1397h = AbstractC1399j.a();
                    bVar.f14545m = c1397h;
                }
                C1397h.b(c1397h, ((C1385G) d6).f13411f);
                g3.f(c1397h);
            } else {
                if (!(d6 instanceof C1383E)) {
                    throw new RuntimeException();
                }
                g3.f(((C1383E) d6).f13409f);
            }
        }
        if (bVar2 != null) {
            B b5 = bVar2.f14550r;
            if (!b5.a) {
                AbstractC1380B.a("Only add dependencies during a tracking");
            }
            N n3 = (N) b5.f380d;
            if (n3 != null) {
                n3.a(bVar);
            } else if (((r0.b) b5.f378b) != null) {
                N n5 = W.a;
                N n6 = new N();
                r0.b bVar3 = (r0.b) b5.f378b;
                AbstractC1276k.c(bVar3);
                n6.a(bVar3);
                n6.a(bVar);
                b5.f380d = n6;
                b5.f378b = null;
            } else {
                b5.f378b = bVar;
            }
            N n7 = (N) b5.f381e;
            if (n7 != null) {
                z7 = !n7.l(bVar);
            } else if (((r0.b) b5.f379c) != bVar) {
                z7 = true;
            } else {
                b5.f379c = null;
                z7 = false;
            }
            if (z7) {
                bVar.f14549q++;
            }
        }
        if (AbstractC1392c.a(g3).isHardwareAccelerated()) {
            z5 = z8;
            z6 = z9;
            canvas = a6;
            dVar.M(g3);
        } else {
            C1496b c1496b = bVar.f14547o;
            if (c1496b == null) {
                c1496b = new C1496b();
                bVar.f14547o = c1496b;
            }
            C0158m c0158m = c1496b.f13944e;
            InterfaceC0961c interfaceC0961c = bVar.f14534b;
            m mVar = bVar.f14535c;
            long S5 = AbstractC1410a.S(bVar.f14553u);
            C1495a c1495a = ((C1496b) c0158m.f1974g).f13943c;
            InterfaceC0961c interfaceC0961c2 = c1495a.a;
            m mVar2 = c1495a.f13940b;
            q g6 = c0158m.g();
            z6 = z9;
            canvas = a6;
            long j5 = c0158m.j();
            z5 = z8;
            r0.b bVar4 = (r0.b) c0158m.f1973f;
            c0158m.q(interfaceC0961c);
            c0158m.r(mVar);
            c0158m.p(g3);
            c0158m.s(S5);
            c0158m.f1973f = bVar;
            g3.h();
            try {
                bVar.c(c1496b);
            } finally {
                g3.p();
                c0158m.q(interfaceC0961c2);
                c0158m.r(mVar2);
                c0158m.p(g6);
                c0158m.s(j5);
                c0158m.f1973f = bVar4;
            }
        }
        if (z6) {
            g3.p();
        }
        if (z5) {
            g3.i();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public static final String m(BufferedReader bufferedReader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = bufferedReader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = bufferedReader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        AbstractC1276k.e(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final int p(x.l lVar) {
        ?? r02 = lVar.f15501k;
        if (r02.isEmpty()) {
            return 0;
        }
        int size = r02.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += ((x.m) r02.get(i7)).f15522p;
        }
        return (i6 / r02.size()) + lVar.f15507q;
    }

    public abstract void n(boolean z5);

    public abstract void o(boolean z5);
}
