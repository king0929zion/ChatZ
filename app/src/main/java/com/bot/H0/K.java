package H0;

import F0.AbstractC0107a;
import F0.AbstractC0113d;
import F0.C0125m;
import I0.C0219y0;
import java.util.HashMap;
import java.util.Map;
import m4.AbstractC1276k;
import n0.C1353b;

/* loaded from: classes.dex */
public final class K {
    public final F0.k0 a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1757c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1758d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1759e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1760f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1761g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0138a f1762h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1764j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1756b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f1763i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC0138a interfaceC0138a, int i6) {
        this.f1764j = i6;
        this.a = (F0.k0) interfaceC0138a;
    }

            public static final void a(K k3, AbstractC0107a abstractC0107a, int i6, i0 i0Var) {
        HashMap hashMap = k3.f1763i;
        float f6 = i6;
        long floatToRawIntBits = Float.floatToRawIntBits(f6) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f6) & 4294967295L;
        while (true) {
            long j3 = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (k3.f1764j) {
                    case 0:
                        q0 q0Var = i0Var.f1952O;
                        if (q0Var != null) {
                            j3 = ((C0219y0) q0Var).c(j3, false);
                        }
                        j3 = Y3.C.O(j3, i0Var.f1940C);
                        break;
                    default:
                        T U02 = i0Var.U0();
                        AbstractC1276k.c(U02);
                        long j4 = U02.f1806s;
                        j3 = C1353b.f((Float.floatToRawIntBits((int) (j4 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j4 >> 32)) << 32), j3);
                        break;
                }
                i0Var = i0Var.f1956t;
                AbstractC1276k.c(i0Var);
                if (i0Var.equals(k3.a.g())) {
                    int round = Math.round(abstractC0107a instanceof C0125m ? Float.intBitsToFloat((int) (j3 & 4294967295L)) : Float.intBitsToFloat((int) (j3 >> 32)));
                    if (hashMap.containsKey(abstractC0107a)) {
                        int intValue = ((Number) Y3.B.Y(abstractC0107a, hashMap)).intValue();
                        C0125m c0125m = AbstractC0113d.a;
                        round = ((Number) abstractC0107a.a.m(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(abstractC0107a, Integer.valueOf(round));
                    return;
                }
            } while (!k3.b(i0Var).containsKey(abstractC0107a));
            float c6 = k3.c(i0Var, abstractC0107a);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c6);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c6);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(i0 i0Var) {
        switch (this.f1764j) {
            case 0:
                return i0Var.E0().b();
            default:
                T U02 = i0Var.U0();
                AbstractC1276k.c(U02);
                return U02.E0().b();
        }
    }

    public final int c(i0 i0Var, AbstractC0107a abstractC0107a) {
        switch (this.f1764j) {
            case 0:
                return i0Var.f0(abstractC0107a);
            default:
                T U02 = i0Var.U0();
                AbstractC1276k.c(U02);
                return U02.f0(abstractC0107a);
        }
    }

    public final boolean d() {
        return this.f1757c || this.f1759e || this.f1760f || this.f1761g;
    }

    public final boolean e() {
        h();
        return this.f1762h != null;
    }

        public final void f() {
        this.f1756b = true;
        Object r02 = this.a;
        InterfaceC0138a h3 = r02.h();
        if (h3 == null) {
            return;
        }
        if (this.f1757c) {
            h3.Y();
        } else if (this.f1759e || this.f1758d) {
            h3.requestLayout();
        }
        if (this.f1760f) {
            r02.Y();
        }
        if (this.f1761g) {
            r02.requestLayout();
        }
        h3.b().f();
    }

        public final void g() {
        HashMap hashMap = this.f1763i;
        hashMap.clear();
        B0.G g3 = new B0.G(this, 2);
        Object r22 = this.a;
        r22.F(g3);
        hashMap.putAll(b(r22.g()));
        this.f1756b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
        /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            F0.k0 r1 = r2.a
            if (r0 == 0) goto L9
            goto L51
        L9:
            H0.a r0 = r1.h()
            if (r0 != 0) goto L10
            goto L53
        L10:
            H0.K r0 = r0.b()
            H0.a r1 = r0.f1762h
            if (r1 == 0) goto L23
            H0.K r0 = r1.b()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            H0.a r0 = r2.f1762h
            if (r0 == 0) goto L53
            H0.K r1 = r0.b()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            H0.a r1 = r0.h()
            if (r1 == 0) goto L41
            H0.K r1 = r1.b()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            H0.a r0 = r0.h()
            if (r0 == 0) goto L50
            H0.K r0 = r0.b()
            if (r0 == 0) goto L50
            H0.a r1 = r0.f1762h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f1762h = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.K.h():void");
    }
}
