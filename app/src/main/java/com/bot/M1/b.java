package M1;

import B0.C0040p;
import B0.y;
import android.content.res.AssetManager;
import android.os.Build;
import android.view.ViewConfiguration;
import b0.C0872e;
import com.vladsch.flexmark.util.format.TableCell;
import e1.InterfaceC0961c;
import f0.C0987j;
import i1.AbstractC1087g;
import i4.AbstractC1120d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import n0.C1353b;
import r.B1;
import r.C1534M0;
import r.E1;
import r.U0;
import z4.C2057h;
import z4.C2063n;

/* loaded from: classes.dex */
public final class b {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3233b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3234c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f3235d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3236e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3237f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3238g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3239h;

    public b(E1 e12, C0987j c0987j, C0872e c0872e, InterfaceC0961c interfaceC0961c) {
        this.f3233b = e12;
        this.f3234c = c0987j;
        this.f3235d = c0872e;
        this.f3236e = interfaceC0961c;
        this.f3237f = AbstractC1120d.a(TableCell.NOT_TRACKED, 6, null);
        this.f3239h = new e0.k(5);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
                /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(M1.b r16, r.E1 r17, r.C1534M0 r18, float r19, float r20, d4.c r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.b.a(M1.b, r.E1, r.M0, float, float, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(M1.b r11, m4.C1288w r12, m4.C1285t r13, r.E1 r14, m4.C1288w r15, long r16, d4.c r18) {
        /*
            r0 = r16
            r2 = r18
            boolean r3 = r2 instanceof r.R0
            if (r3 == 0) goto L17
            r3 = r2
            r.R0 r3 = (r.R0) r3
            int r4 = r3.f14142m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f14142m = r4
            goto L1c
        L17:
            r.R0 r3 = new r.R0
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f14141l
            int r4 = r3.f14142m
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L37
            m4.w r11 = r3.f14140k
            r.E1 r12 = r3.f14139j
            m4.t r0 = r3.f14138i
            m4.w r1 = r3.f14137h
            M1.b r3 = r3.f14136g
            X3.a.e(r2)
            r7 = r11
            r6 = r12
            r12 = r1
            r11 = r3
            goto L69
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            X3.a.e(r2)
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L4b
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L4b:
            r.S0 r2 = new r.S0
            r4 = 0
            r2.<init>(r11, r4)
            r3.f14136g = r11
            r3.f14137h = r12
            r3.f14138i = r13
            r3.f14139j = r14
            r3.f14140k = r15
            r3.f14142m = r5
            java.lang.Object r2 = x4.AbstractC1888A.I(r0, r2, r3)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r2 != r0) goto L66
            return r0
        L66:
            r0 = r13
            r6 = r14
            r7 = r15
        L69:
            r.M0 r2 = (r.C1534M0) r2
            if (r2 == 0) goto La3
            java.lang.Object r1 = r12.f12973c
            r.M0 r1 = (r.C1534M0) r1
            boolean r1 = r1.f14086c
            long r3 = r2.a
            long r8 = r2.f14085b
            r.M0 r10 = new r.M0
            r18 = r1
            r14 = r3
            r16 = r8
            r13 = r10
            r13.<init>(r14, r16, r18)
            r1 = r13
            r12.f12973c = r1
            long r3 = r6.e(r3)
            float r12 = r6.i(r3)
            r0.f12970c = r12
            r12 = 30
            r1 = 0
            n.m r12 = n.AbstractC1318d.b(r1, r1, r12)
            r7.f12973c = r12
            r11.h(r2)
            float r11 = r0.f12970c
            boolean r11 = r.AbstractC1532L0.a(r11)
            r11 = r11 ^ r5
            goto La4
        La3:
            r11 = 0
        La4:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.b.b(M1.b, m4.w, m4.t, r.E1, m4.w, long, d4.c):java.lang.Object");
    }

    public static C1534M0 g(C2057h c2057h) {
        C1534M0 c1534m0 = null;
        t4.i m3 = AbstractC1087g.m(new U0(new Y3.l(c2057h, 18), null));
        while (m3.hasNext()) {
            C1534M0 c1534m02 = (C1534M0) m3.next();
            if (c1534m0 != null) {
                c1534m02 = c1534m0.a(c1534m02);
            }
            c1534m0 = c1534m02;
        }
        return c1534m0;
    }

    public float c(B1 b1, float f6) {
        E1 e12 = (E1) this.f3233b;
        long h3 = e12.h(e12.d(f6));
        E1 e13 = b1.a;
        return e12.g(e12.e(e13.c(e13.f14022k, h3, 1)));
    }

            public boolean d(C0040p c0040p) {
        long j3;
        C0987j c0987j = (C0987j) this.f3234c;
        InterfaceC0961c interfaceC0961c = (InterfaceC0961c) this.f3236e;
        ViewConfiguration viewConfiguration = (ViewConfiguration) c0987j.f11690e;
        int i6 = Build.VERSION.SDK_INT;
        float f6 = -(i6 > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : interfaceC0961c.e0(64));
        float f7 = -(i6 > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : interfaceC0961c.e0(64));
        Object r12 = c0040p.a;
        C1353b c1353b = new C1353b(0L);
        int size = r12.size();
        int i7 = 0;
        while (true) {
            j3 = c1353b.a;
            if (i7 >= size) {
                break;
            }
            c1353b = new C1353b(C1353b.f(j3, ((y) r12.get(i7)).f490j));
            i7++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) * f7) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) * f6) & 4294967295L);
        E1 e12 = (E1) this.f3233b;
        float i8 = e12.i(e12.e(floatToRawIntBits));
        return i8 != S.l.f7374V ? (i8 > S.l.f7374V ? 1 : (i8 == S.l.f7374V ? 0 : -1)) > 0 ? e12.a.d() : e12.a.c() : false ? !(((C2057h) this.f3237f).t(new C1534M0(floatToRawIntBits, ((y) Y3.m.o0(c0040p.a)).f482b, false)) instanceof C2063n) : this.a;
    }

    public FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void f(int i6, Serializable serializable) {
        ((Executor) this.f3233b).execute(new a(i6, 0, this, serializable));
    }

    public void h(C1534M0 c1534m0) {
        e0.k kVar = (e0.k) this.f3239h;
        long j3 = c1534m0.f14085b;
        long j4 = c1534m0.a;
        ((C0.e) kVar.f11564e).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
        ((C0.e) kVar.f11565f).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(r.E1 r5, r.Q0 r6, d4.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof r.V0
            if (r0 == 0) goto L13
            r0 = r7
            r.V0 r0 = (r.V0) r0
            int r1 = r0.f14165i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14165i = r1
            goto L18
        L13:
            r.V0 r0 = new r.V0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f14163g
            int r1 = r0.f14165i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r7)
            goto L4e
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            X3.a.e(r7)
            r4.a = r2
            r.W0 r7 = new r.W0
            r1 = 0
            r7.<init>(r5, r6, r1)
            r0.f14165i = r2
            B4.u r5 = new B4.u
            b4.h r6 = r0.f11435e
            m4.AbstractC1276k.c(r6)
            r1 = 1
            r5.<init>(r6, r0, r1)
            java.lang.Object r5 = Y3.C.T(r5, r5, r7)
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r5 != r6) goto L4e
            return r6
        L4e:
            r5 = 0
            r4.a = r5
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.b.i(r.E1, r.Q0, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
                            public b(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        Object r12;
        this.a = false;
        this.f3233b = executor;
        this.f3234c = fVar;
        this.f3238g = str;
        this.f3237f = file;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            r12 = g.f3251d;
        } else {
            switch (i6) {
                case 26:
                    r12 = g.f3254g;
                    break;
                case 27:
                    r12 = g.f3253f;
                    break;
                case 28:
                case 29:
                case 30:
                    r12 = g.f3252e;
                    break;
                default:
                    r12 = 0;
                    break;
            }
        }
        this.f3235d = r12;
    }
}
