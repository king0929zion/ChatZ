package O4;

import O.C0316k;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class v extends h5.e implements N4.i {

    /* renamed from: e, reason: collision with root package name */
    public final N4.c f4365e;

    /* renamed from: f, reason: collision with root package name */
    public final z f4366f;

    /* renamed from: g, reason: collision with root package name */
    public final L1.l f4367g;

    /* renamed from: h, reason: collision with root package name */
    public final F2.h f4368h;

    /* renamed from: i, reason: collision with root package name */
    public int f4369i;

    /* renamed from: j, reason: collision with root package name */
    public final N4.h f4370j;

    /* renamed from: k, reason: collision with root package name */
    public final k f4371k;

    public v(N4.c cVar, z zVar, L1.l lVar, SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        this.f4365e = cVar;
        this.f4366f = zVar;
        this.f4367g = lVar;
        this.f4368h = cVar.f3883b;
        this.f4369i = -1;
        N4.h hVar = cVar.a;
        this.f4370j = hVar;
        this.f4371k = hVar.f3901e ? null : new k(serialDescriptor);
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final float A() {
        L1.l lVar = this.f4367g;
        String k3 = lVar.k();
        try {
            float parseFloat = Float.parseFloat(k3);
            if (this.f4365e.a.f3904h || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            m.o(lVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            L1.l.p(lVar, B3.e.g('\'', "Failed to parse type 'float' for input '", k3), 0, null, 6);
            throw null;
        }
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final double C() {
        L1.l lVar = this.f4367g;
        String k3 = lVar.k();
        try {
            double parseDouble = Double.parseDouble(k3);
            if (this.f4365e.a.f3904h || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            m.o(lVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            L1.l.p(lVar, B3.e.g('\'', "Failed to parse type 'double' for input '", k3), 0, null, 6);
            throw null;
        }
    }

    @Override // L4.a
    public final F2.h a() {
        return this.f4368h;
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final L4.a b(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        N4.c cVar = this.f4365e;
        z n3 = m.n(cVar, serialDescriptor);
        L1.l lVar = this.f4367g;
        C0316k c0316k = (C0316k) lVar.f3048e;
        int i6 = c0316k.f4139b + 1;
        c0316k.f4139b = i6;
        Object[] objArr = (Object[]) c0316k.f4140c;
        if (i6 == objArr.length) {
            int i7 = i6 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i7);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            c0316k.f4140c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) c0316k.f4141d, i7);
            AbstractC1276k.e(copyOf2, "copyOf(...)");
            c0316k.f4141d = copyOf2;
        }
        ((Object[]) c0316k.f4140c)[i6] = serialDescriptor;
        lVar.h(n3.f4387c);
        if (lVar.z() != 4) {
            int ordinal = n3.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new v(cVar, n3, lVar, serialDescriptor) : (this.f4366f == n3 && cVar.a.f3901e) ? this : new v(cVar, n3, lVar, serialDescriptor);
        }
        L1.l.p(lVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final boolean d() {
        boolean z5;
        boolean z6;
        L1.l lVar = this.f4367g;
        int C5 = lVar.C();
        if (C5 == lVar.w().length()) {
            L1.l.p(lVar, "EOF", 0, null, 6);
            throw null;
        }
        if (lVar.w().charAt(C5) == '\"') {
            C5++;
            z5 = true;
        } else {
            z5 = false;
        }
        int B5 = lVar.B(C5);
        if (B5 >= lVar.w().length() || B5 == -1) {
            L1.l.p(lVar, "EOF", 0, null, 6);
            throw null;
        }
        int i6 = B5 + 1;
        int charAt = lVar.w().charAt(B5) | SequenceUtils.SPC;
        if (charAt == 102) {
            lVar.d(i6, "alse");
            z6 = false;
        } else {
            if (charAt != 116) {
                L1.l.p(lVar, "Expected valid boolean literal prefix, but had '" + lVar.k() + '\'', 0, null, 6);
                throw null;
            }
            lVar.d(i6, "rue");
            z6 = true;
        }
        if (!z5) {
            return z6;
        }
        if (lVar.f3045b == lVar.w().length()) {
            L1.l.p(lVar, "EOF", 0, null, 6);
            throw null;
        }
        if (lVar.w().charAt(lVar.f3045b) == '\"') {
            lVar.f3045b++;
            return z6;
        }
        L1.l.p(lVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final char e() {
        L1.l lVar = this.f4367g;
        String k3 = lVar.k();
        if (k3.length() == 1) {
            return k3.charAt(0);
        }
        L1.l.p(lVar, B3.e.g('\'', "Expected single char, but got '", k3), 0, null, 6);
        throw null;
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final int f(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "enumDescriptor");
        return m.j(serialDescriptor, this.f4365e, m(), " at path ".concat(((C0316k) this.f4367g.f3048e).d()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r6.f() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (s(r6) != (-1)) goto L20;
     */
    @Override // h5.e, L4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r5 = this;
            java.lang.String r0 = "descriptor"
            m4.AbstractC1276k.f(r6, r0)
            N4.c r0 = r5.f4365e
            N4.h r0 = r0.a
            boolean r0 = r0.f3898b
            r1 = -1
            if (r0 == 0) goto L1a
            int r0 = r6.f()
            if (r0 != 0) goto L1a
        L14:
            int r0 = r5.s(r6)
            if (r0 != r1) goto L14
        L1a:
            L1.l r6 = r5.f4367g
            boolean r0 = r6.E()
            if (r0 != 0) goto L45
            O4.z r0 = r5.f4366f
            char r0 = r0.f4388e
            r6.h(r0)
            java.lang.Object r6 = r6.f3048e
            O.k r6 = (O.C0316k) r6
            int r0 = r6.f4139b
            java.lang.Object r2 = r6.f4141d
            int[] r2 = (int[]) r2
            r3 = r2[r0]
            r4 = -2
            if (r3 != r4) goto L3d
            r2[r0] = r1
            int r0 = r0 + r1
            r6.f4139b = r0
        L3d:
            int r0 = r6.f4139b
            if (r0 == r1) goto L44
            int r0 = r0 + r1
            r6.f4139b = r0
        L44:
            return
        L45:
            java.lang.String r0 = ""
            O4.m.k(r6, r0)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.v.h(kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    @Override // N4.i
    public final kotlinx.serialization.json.b i() {
        return new u(this.f4365e.a, this.f4367g).b();
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final int k() {
        L1.l lVar = this.f4367g;
        long i6 = lVar.i();
        int i7 = (int) i6;
        if (i6 == i7) {
            return i7;
        }
        L1.l.p(lVar, "Failed to parse int for input '" + i6 + '\'', 0, null, 6);
        throw null;
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final String m() {
        boolean z5 = this.f4370j.f3899c;
        L1.l lVar = this.f4367g;
        return z5 ? lVar.l() : lVar.j();
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final long n() {
        return this.f4367g.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(kotlinx.serialization.KSerializer r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.v.p(kotlinx.serialization.KSerializer):java.lang.Object");
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final boolean r() {
        k kVar = this.f4371k;
        if (!(kVar != null ? kVar.f4340b : false)) {
            L1.l lVar = this.f4367g;
            int B5 = lVar.B(lVar.C());
            int length = lVar.w().length() - B5;
            boolean z5 = false;
            if (length >= 4 && B5 != -1) {
                int i6 = 0;
                while (true) {
                    if (i6 < 4) {
                        if ("null".charAt(i6) != lVar.w().charAt(B5 + i6)) {
                            break;
                        }
                        i6++;
                    } else if (length <= 4 || m.g(lVar.w().charAt(B5 + 4)) != 0) {
                        z5 = true;
                        lVar.f3045b = B5 + 4;
                    }
                }
            }
            if (!z5) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00cd, code lost:
    
        r12 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // L4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(kotlinx.serialization.descriptors.SerialDescriptor r20) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.v.s(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final Decoder u(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return x.a(serialDescriptor) ? new h(this.f4367g, this.f4365e) : this;
    }

    @Override // h5.e, L4.a
    public final Object x(SerialDescriptor serialDescriptor, int i6, KSerializer kSerializer, Object obj) {
        C0316k c0316k = (C0316k) this.f4367g.f3048e;
        AbstractC1276k.f(serialDescriptor, "descriptor");
        AbstractC1276k.f(kSerializer, "deserializer");
        boolean z5 = this.f4366f == z.f4383h && (i6 & 1) == 0;
        if (z5) {
            int[] iArr = (int[]) c0316k.f4141d;
            int i7 = c0316k.f4139b;
            if (iArr[i7] == -2) {
                ((Object[]) c0316k.f4140c)[i7] = n.a;
            }
        }
        Object x5 = super.x(serialDescriptor, i6, kSerializer, obj);
        if (z5) {
            int[] iArr2 = (int[]) c0316k.f4141d;
            int i8 = c0316k.f4139b;
            if (iArr2[i8] != -2) {
                int i9 = i8 + 1;
                c0316k.f4139b = i9;
                Object[] objArr = (Object[]) c0316k.f4140c;
                if (i9 == objArr.length) {
                    int i10 = i9 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i10);
                    AbstractC1276k.e(copyOf, "copyOf(...)");
                    c0316k.f4140c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) c0316k.f4141d, i10);
                    AbstractC1276k.e(copyOf2, "copyOf(...)");
                    c0316k.f4141d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) c0316k.f4140c;
            int i11 = c0316k.f4139b;
            objArr2[i11] = x5;
            ((int[]) c0316k.f4141d)[i11] = -2;
        }
        return x5;
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final byte y() {
        L1.l lVar = this.f4367g;
        long i6 = lVar.i();
        byte b5 = (byte) i6;
        if (i6 == b5) {
            return b5;
        }
        L1.l.p(lVar, "Failed to parse byte for input '" + i6 + '\'', 0, null, 6);
        throw null;
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final short z() {
        L1.l lVar = this.f4367g;
        long i6 = lVar.i();
        short s5 = (short) i6;
        if (i6 == s5) {
            return s5;
        }
        L1.l.p(lVar, "Failed to parse short for input '" + i6 + '\'', 0, null, 6);
        throw null;
    }
}
