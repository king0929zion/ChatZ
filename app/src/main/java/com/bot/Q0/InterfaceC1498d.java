package q0;

import H0.C0158m;
import H0.L;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import e1.m;
import i4.AbstractC1120d;
import n0.C1356e;
import o0.AbstractC1404o;
import o0.C1395f;
import o0.C1397h;
import o0.C1400k;

/* renamed from: q0.d */
/* loaded from: classes.dex */
public interface InterfaceC1498d extends InterfaceC0961c {
    static /* synthetic */ void K(InterfaceC1498d interfaceC1498d, C1397h c1397h, long j3, AbstractC1499e abstractC1499e, int i6) {
        if ((i6 & 8) != 0) {
            abstractC1499e = g.a;
        }
        interfaceC1498d.y(c1397h, j3, abstractC1499e);
    }

    static void W(L l3, AbstractC1404o abstractC1404o, long j3, long j4, long j5, AbstractC1499e abstractC1499e, int i6) {
        if ((i6 & 2) != 0) {
            j3 = 0;
        }
        long j6 = j3;
        l3.e(abstractC1404o, j6, (i6 & 4) != 0 ? X(l3.f1765c.c(), j6) : j4, j5, 1.0f, (i6 & 32) != 0 ? g.a : abstractC1499e);
    }

    static long X(long j3, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void c0(InterfaceC1498d interfaceC1498d, long j3, float f6, long j4, AbstractC1499e abstractC1499e, int i6) {
        if ((i6 & 2) != 0) {
            f6 = C1356e.c(interfaceC1498d.c()) / 2.0f;
        }
        float f7 = f6;
        if ((i6 & 4) != 0) {
            j4 = interfaceC1498d.o0();
        }
        long j5 = j4;
        if ((i6 & 16) != 0) {
            abstractC1499e = g.a;
        }
        interfaceC1498d.B(j3, f7, j5, abstractC1499e);
    }

    static /* synthetic */ void f(InterfaceC1498d interfaceC1498d, C1397h c1397h, AbstractC1404o abstractC1404o, float f6, h hVar, int i6) {
        if ((i6 & 4) != 0) {
            f6 = 1.0f;
        }
        float f7 = f6;
        AbstractC1499e abstractC1499e = hVar;
        if ((i6 & 8) != 0) {
            abstractC1499e = g.a;
        }
        interfaceC1498d.h0(c1397h, abstractC1404o, f7, abstractC1499e, (i6 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void n0(InterfaceC1498d interfaceC1498d, long j3, long j4, long j5, float f6, int i6) {
        if ((i6 & 2) != 0) {
            j4 = 0;
        }
        long j6 = j4;
        interfaceC1498d.w0(j3, j6, (i6 & 4) != 0 ? X(interfaceC1498d.c(), j6) : j5, (i6 & 8) != 0 ? 1.0f : f6, (i6 & 64) != 0 ? 3 : 0);
    }

    static void q0(InterfaceC1498d interfaceC1498d, C1395f c1395f, long j3, long j4, float f6, C1400k c1400k, int i6, int i7) {
        interfaceC1498d.n(c1395f, 0L, j3, (i7 & 16) != 0 ? j3 : j4, (i7 & 32) != 0 ? 1.0f : f6, c1400k, (i7 & PegdownExtensions.STRIKETHROUGH) != 0 ? 1 : i6);
    }

    static /* synthetic */ void v(InterfaceC1498d interfaceC1498d, AbstractC1404o abstractC1404o, long j3, long j4, float f6, AbstractC1499e abstractC1499e, int i6) {
        if ((i6 & 2) != 0) {
            j3 = 0;
        }
        long j5 = j3;
        interfaceC1498d.C(abstractC1404o, j5, (i6 & 4) != 0 ? X(interfaceC1498d.c(), j5) : j4, (i6 & 8) != 0 ? 1.0f : f6, (i6 & 16) != 0 ? g.a : abstractC1499e, (i6 & 64) != 0 ? 3 : 5);
    }

    void B(long j3, float f6, long j4, AbstractC1499e abstractC1499e);

    void C(AbstractC1404o abstractC1404o, long j3, long j4, float f6, AbstractC1499e abstractC1499e, int i6);

    void G(long j3, long j4, long j5, float f6, int i6);

    default long c() {
        return g0().j();
    }

    C0158m g0();

    m getLayoutDirection();

    void h0(C1397h c1397h, AbstractC1404o abstractC1404o, float f6, AbstractC1499e abstractC1499e, int i6);

    void i(long j3, long j4, long j5, long j6, AbstractC1499e abstractC1499e);

    void n(C1395f c1395f, long j3, long j4, long j5, float f6, C1400k c1400k, int i6);

    default long o0() {
        return AbstractC1120d.p(g0().j());
    }

    void w0(long j3, long j4, long j5, float f6, int i6);

    void x(long j3, float f6, float f7, long j4, long j5, AbstractC1499e abstractC1499e);

    void y(C1397h c1397h, long j3, AbstractC1499e abstractC1499e);
}
