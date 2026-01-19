package O4;

import I3.I;
import M4.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class w implements Encoder {
    public final I a;

    /* renamed from: b, reason: collision with root package name */
    public final N4.c f4372b;

    /* renamed from: c, reason: collision with root package name */
    public final z f4373c;

    /* renamed from: d, reason: collision with root package name */
    public final w[] f4374d;

    /* renamed from: e, reason: collision with root package name */
    public final F2.h f4375e;

    /* renamed from: f, reason: collision with root package name */
    public final N4.h f4376f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4377g;

    /* renamed from: h, reason: collision with root package name */
    public String f4378h;

    /* renamed from: i, reason: collision with root package name */
    public String f4379i;

    public w(I i6, N4.c cVar, z zVar, w[] wVarArr) {
        AbstractC1276k.f(i6, "composer");
        this.a = i6;
        this.f4372b = cVar;
        this.f4373c = zVar;
        this.f4374d = wVarArr;
        this.f4375e = cVar.f3883b;
        this.f4376f = cVar.a;
        int ordinal = zVar.ordinal();
        if (wVarArr != null) {
            w wVar = wVarArr[ordinal];
            if (wVar == null && wVar == this) {
                return;
            }
            wVarArr[ordinal] = this;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final F2.h a() {
        return this.f4375e;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final w b(SerialDescriptor serialDescriptor) {
        w wVar;
        AbstractC1276k.f(serialDescriptor, "descriptor");
        N4.c cVar = this.f4372b;
        z n3 = m.n(cVar, serialDescriptor);
        char c6 = n3.f4387c;
        I i6 = this.a;
        i6.g(c6);
        i6.a = true;
        String str = this.f4378h;
        if (str != null) {
            String str2 = this.f4379i;
            if (str2 == null) {
                str2 = serialDescriptor.a();
            }
            i6.e();
            o(str);
            i6.g(':');
            o(str2);
            this.f4378h = null;
            this.f4379i = null;
        }
        if (this.f4373c == n3) {
            return this;
        }
        w[] wVarArr = this.f4374d;
        return (wVarArr == null || (wVar = wVarArr[n3.ordinal()]) == null) ? new w(i6, cVar, n3, wVarArr) : wVar;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void c() {
        this.a.j("null");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void d(double d6) {
        boolean z5 = this.f4377g;
        I i6 = this.a;
        if (z5) {
            o(String.valueOf(d6));
        } else {
            ((C0.c) i6.f2733b).k(String.valueOf(d6));
        }
        if (this.f4376f.f3904h) {
            return;
        }
        if (Double.isInfinite(d6) || Double.isNaN(d6)) {
            throw m.b(Double.valueOf(d6), ((C0.c) i6.f2733b).toString());
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e(short s5) {
        if (this.f4377g) {
            o(String.valueOf((int) s5));
        } else {
            this.a.k(s5);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void f(byte b5) {
        if (this.f4377g) {
            o(String.valueOf((int) b5));
        } else {
            this.a.f(b5);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(boolean z5) {
        if (this.f4377g) {
            o(String.valueOf(z5));
        } else {
            ((C0.c) this.a.f2733b).k(String.valueOf(z5));
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void h(float f6) {
        boolean z5 = this.f4377g;
        I i6 = this.a;
        if (z5) {
            o(String.valueOf(f6));
        } else {
            ((C0.c) i6.f2733b).k(String.valueOf(f6));
        }
        if (this.f4376f.f3904h) {
            return;
        }
        if (Float.isInfinite(f6) || Float.isNaN(f6)) {
            throw m.b(Float.valueOf(f6), ((C0.c) i6.f2733b).toString());
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void i(char c6) {
        o(String.valueOf(c6));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void j(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "enumDescriptor");
        o(serialDescriptor.g(i6));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void k(int i6) {
        if (this.f4377g) {
            o(String.valueOf(i6));
        } else {
            this.a.h(i6);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder l(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        boolean a = x.a(serialDescriptor);
        z zVar = this.f4373c;
        N4.c cVar = this.f4372b;
        I i6 = this.a;
        if (a) {
            if (!(i6 instanceof g)) {
                i6 = new g((C0.c) i6.f2733b, this.f4377g);
            }
            return new w(i6, cVar, zVar, null);
        }
        if (serialDescriptor.h() && serialDescriptor.equals(N4.j.a)) {
            if (!(i6 instanceof f)) {
                i6 = new f((C0.c) i6.f2733b, this.f4377g);
            }
            return new w(i6, cVar, zVar, null);
        }
        if (this.f4378h != null) {
            this.f4379i = serialDescriptor.a();
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
    
        if (m4.AbstractC1276k.b(r1, K4.k.f2979h) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.f3906j != N4.a.f3879c) goto L20;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(kotlinx.serialization.KSerializer r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "serializer"
            m4.AbstractC1276k.f(r6, r0)
            N4.c r0 = r5.f4372b
            N4.h r1 = r0.a
            boolean r2 = r6 instanceof I4.c
            r3 = 0
            if (r2 == 0) goto L15
            N4.a r1 = r1.f3906j
            N4.a r4 = N4.a.f3879c
            if (r1 == r4) goto L4b
            goto L42
        L15:
            N4.a r1 = r1.f3906j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L4b
            r4 = 1
            if (r1 == r4) goto L2a
            r0 = 2
            if (r1 != r0) goto L24
            goto L4b
        L24:
            N0.e r6 = new N0.e
            r6.<init>()
            throw r6
        L2a:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r6.getDescriptor()
            Y4.l r1 = r1.e()
            K4.k r4 = K4.k.f2976e
            boolean r4 = m4.AbstractC1276k.b(r1, r4)
            if (r4 != 0) goto L42
            K4.k r4 = K4.k.f2979h
            boolean r1 = m4.AbstractC1276k.b(r1, r4)
            if (r1 == 0) goto L4b
        L42:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r6.getDescriptor()
            java.lang.String r0 = O4.m.h(r0, r1)
            goto L4c
        L4b:
            r0 = r3
        L4c:
            if (r2 == 0) goto L77
            I4.c r6 = (I4.c) r6
            if (r7 != 0) goto L73
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r7.<init>(r0)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r6.getDescriptor()
            r7.append(r6)
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L73:
            h5.e.U(r6, r5, r7)
            throw r3
        L77:
            if (r0 == 0) goto L85
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r6.getDescriptor()
            java.lang.String r1 = r1.a()
            r5.f4378h = r0
            r5.f4379i = r1
        L85:
            r6.serialize(r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.w.m(kotlinx.serialization.KSerializer, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void n(long j3) {
        if (this.f4377g) {
            o(String.valueOf(j3));
        } else {
            this.a.i(j3);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void o(String str) {
        AbstractC1276k.f(str, "value");
        this.a.l(str);
    }

    public final w p(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return b(serialDescriptor);
    }

    public final void q(SerialDescriptor serialDescriptor, int i6, boolean z5) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        r(serialDescriptor, i6);
        g(z5);
    }

    public final void r(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        int ordinal = this.f4373c.ordinal();
        I i7 = this.a;
        boolean z5 = true;
        if (ordinal == 1) {
            if (!i7.a) {
                i7.g(',');
            }
            i7.e();
            return;
        }
        if (ordinal == 2) {
            if (i7.a) {
                this.f4377g = true;
                i7.e();
                return;
            }
            if (i6 % 2 == 0) {
                i7.g(',');
                i7.e();
            } else {
                i7.g(':');
                i7.m();
                z5 = false;
            }
            this.f4377g = z5;
            return;
        }
        if (ordinal != 3) {
            if (!i7.a) {
                i7.g(',');
            }
            i7.e();
            m.m(this.f4372b, serialDescriptor);
            o(serialDescriptor.g(i6));
            i7.g(':');
            i7.m();
            return;
        }
        if (i6 == 0) {
            this.f4377g = true;
        }
        if (i6 == 1) {
            i7.g(',');
            i7.m();
            this.f4377g = false;
        }
    }

    public final Encoder s(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        r(e0Var, i6);
        return l(e0Var.j(i6));
    }

    public final void t(int i6, int i7, SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        r(serialDescriptor, i6);
        k(i7);
    }

    public final void u(SerialDescriptor serialDescriptor, int i6, long j3) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        r(serialDescriptor, i6);
        n(j3);
    }

    public final void v(SerialDescriptor serialDescriptor, int i6, KSerializer kSerializer, Object obj) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        AbstractC1276k.f(kSerializer, "serializer");
        if (obj != null || this.f4376f.f3901e) {
            AbstractC1276k.f(serialDescriptor, "descriptor");
            AbstractC1276k.f(kSerializer, "serializer");
            r(serialDescriptor, i6);
            if (kSerializer.getDescriptor().c()) {
                m(kSerializer, obj);
            } else if (obj == null) {
                c();
            } else {
                m(kSerializer, obj);
            }
        }
    }

    public final void w(SerialDescriptor serialDescriptor, int i6, KSerializer kSerializer, Object obj) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        AbstractC1276k.f(kSerializer, "serializer");
        r(serialDescriptor, i6);
        m(kSerializer, obj);
    }

    public final void x(SerialDescriptor serialDescriptor, int i6, String str) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        AbstractC1276k.f(str, "value");
        r(serialDescriptor, i6);
        o(str);
    }

    public final void y(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        I i6 = this.a;
        i6.getClass();
        i6.a = false;
        i6.g(this.f4373c.f4388e);
    }

    public final boolean z(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return this.f4376f.a;
    }
}
