package O4;

import i4.AbstractC1117a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class h extends h5.e {

    /* renamed from: e, reason: collision with root package name */
    public final L1.l f4337e;

    /* renamed from: f, reason: collision with root package name */
    public final F2.h f4338f;

    public h(L1.l lVar, N4.c cVar) {
        AbstractC1276k.f(cVar, "json");
        this.f4337e = lVar;
        this.f4338f = cVar.f3883b;
    }

    @Override // L4.a
    public final F2.h a() {
        return this.f4338f;
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final int k() {
        L1.l lVar = this.f4337e;
        String k3 = lVar.k();
        try {
            AbstractC1276k.f(k3, "<this>");
            X3.r x5 = AbstractC1117a.x(k3);
            if (x5 != null) {
                return x5.f9408c;
            }
            u4.u.y(k3);
            throw null;
        } catch (IllegalArgumentException unused) {
            L1.l.p(lVar, B3.e.g('\'', "Failed to parse type 'UInt' for input '", k3), 0, null, 6);
            throw null;
        }
    }

    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    public final long n() {
        L1.l lVar = this.f4337e;
        String k3 = lVar.k();
        try {
            AbstractC1276k.f(k3, "<this>");
            X3.t y5 = AbstractC1117a.y(k3);
            if (y5 != null) {
                return y5.f9410c;
            }
            u4.u.y(k3);
            throw null;
        } catch (IllegalArgumentException unused) {
            L1.l.p(lVar, B3.e.g('\'', "Failed to parse type 'ULong' for input '", k3), 0, null, 6);
            throw null;
        }
    }

    @Override // L4.a
    public final int s(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[Catch: IllegalArgumentException -> 0x002e, TryCatch #0 {IllegalArgumentException -> 0x002e, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x001d, B:10:0x0027, B:13:0x002a, B:14:0x002d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: IllegalArgumentException -> 0x002e, TryCatch #0 {IllegalArgumentException -> 0x002e, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x001d, B:10:0x0027, B:13:0x002a, B:14:0x002d), top: B:2:0x0007 }] */
    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte y() {
        /*
            r5 = this;
            L1.l r0 = r5.f4337e
            java.lang.String r1 = r0.k()
            r2 = 0
            java.lang.String r3 = "<this>"
            m4.AbstractC1276k.f(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L2e
            X3.r r3 = i4.AbstractC1117a.x(r1)     // Catch: java.lang.IllegalArgumentException -> L2e
            if (r3 == 0) goto L24
            int r3 = r3.f9408c     // Catch: java.lang.IllegalArgumentException -> L2e
            r4 = 255(0xff, float:3.57E-43)
            int r4 = java.lang.Integer.compareUnsigned(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L2e
            if (r4 <= 0) goto L1d
            goto L24
        L1d:
            byte r3 = (byte) r3     // Catch: java.lang.IllegalArgumentException -> L2e
            X3.p r4 = new X3.p     // Catch: java.lang.IllegalArgumentException -> L2e
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L2e
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 == 0) goto L2a
            byte r0 = r4.f9406c     // Catch: java.lang.IllegalArgumentException -> L2e
            return r0
        L2a:
            u4.u.y(r1)     // Catch: java.lang.IllegalArgumentException -> L2e
            throw r2     // Catch: java.lang.IllegalArgumentException -> L2e
        L2e:
            java.lang.String r3 = "Failed to parse type 'UByte' for input '"
            r4 = 39
            java.lang.String r1 = B3.e.g(r4, r3, r1)
            r3 = 0
            r4 = 6
            L1.l.p(r0, r1, r3, r2, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.h.y():byte");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[Catch: IllegalArgumentException -> 0x002f, TryCatch #0 {IllegalArgumentException -> 0x002f, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x001e, B:10:0x0028, B:13:0x002b, B:14:0x002e), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: IllegalArgumentException -> 0x002f, TryCatch #0 {IllegalArgumentException -> 0x002f, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x001e, B:10:0x0028, B:13:0x002b, B:14:0x002e), top: B:2:0x0007 }] */
    @Override // h5.e, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short z() {
        /*
            r5 = this;
            L1.l r0 = r5.f4337e
            java.lang.String r1 = r0.k()
            r2 = 0
            java.lang.String r3 = "<this>"
            m4.AbstractC1276k.f(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L2f
            X3.r r3 = i4.AbstractC1117a.x(r1)     // Catch: java.lang.IllegalArgumentException -> L2f
            if (r3 == 0) goto L25
            int r3 = r3.f9408c     // Catch: java.lang.IllegalArgumentException -> L2f
            r4 = 65535(0xffff, float:9.1834E-41)
            int r4 = java.lang.Integer.compareUnsigned(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L2f
            if (r4 <= 0) goto L1e
            goto L25
        L1e:
            short r3 = (short) r3     // Catch: java.lang.IllegalArgumentException -> L2f
            X3.w r4 = new X3.w     // Catch: java.lang.IllegalArgumentException -> L2f
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L2f
            goto L26
        L25:
            r4 = r2
        L26:
            if (r4 == 0) goto L2b
            short r0 = r4.f9412c     // Catch: java.lang.IllegalArgumentException -> L2f
            return r0
        L2b:
            u4.u.y(r1)     // Catch: java.lang.IllegalArgumentException -> L2f
            throw r2     // Catch: java.lang.IllegalArgumentException -> L2f
        L2f:
            java.lang.String r3 = "Failed to parse type 'UShort' for input '"
            r4 = 39
            java.lang.String r1 = B3.e.g(r4, r3, r1)
            r3 = 0
            r4 = 6
            L1.l.p(r0, r1, r3, r2, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.h.z():short");
    }
}
