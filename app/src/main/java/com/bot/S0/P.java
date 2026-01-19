package S0;

import R.AbstractC0507l;
import com.vladsch.flexmark.parser.PegdownExtensions;
import d1.C0934a;
import d1.C0936c;
import d1.C0937d;
import d1.C0938e;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o0.C1389K;
import q0.AbstractC1499e;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: d, reason: collision with root package name */
    public static final P f7612d = new P(0, 0, null, null, 0, 0, 0, 16777215);
    public final G a;

    /* renamed from: b, reason: collision with root package name */
    public final u f7613b;

    /* renamed from: c, reason: collision with root package name */
    public final y f7614c;

    public P(G g3, u uVar, y yVar) {
        this.a = g3;
        this.f7613b = uVar;
        this.f7614c = yVar;
    }

    public static P a(P p5, long j3, long j4, W0.k kVar, W0.i iVar, W0.p pVar, long j5, d1.l lVar, long j6, d1.i iVar2, int i6) {
        long j7;
        long j8;
        y yVar = AbstractC0507l.a;
        long b5 = (i6 & 1) != 0 ? p5.a.a.b() : j3;
        long j9 = (i6 & 2) != 0 ? p5.a.f7571b : j4;
        W0.k kVar2 = (i6 & 4) != 0 ? p5.a.f7572c : kVar;
        W0.i iVar3 = (i6 & 8) != 0 ? p5.a.f7573d : iVar;
        G g3 = p5.a;
        W0.j jVar = g3.f7574e;
        W0.p pVar2 = (i6 & 32) != 0 ? g3.f7575f : pVar;
        String str = g3.f7576g;
        long j10 = (i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? g3.f7577h : j5;
        C0934a c0934a = g3.f7578i;
        d1.p pVar3 = g3.f7579j;
        Z0.b bVar = g3.f7580k;
        long j11 = g3.f7581l;
        d1.l lVar2 = (i6 & 4096) != 0 ? g3.f7582m : lVar;
        C1389K c1389k = g3.f7583n;
        AbstractC1499e abstractC1499e = g3.f7585p;
        u uVar = p5.f7613b;
        int i7 = uVar.a;
        int i8 = uVar.f7665b;
        if ((i6 & PegdownExtensions.SUPPRESS_INLINE_HTML) != 0) {
            j7 = j11;
            j8 = uVar.f7666c;
        } else {
            j7 = j11;
            j8 = j6;
        }
        d1.q qVar = uVar.f7667d;
        y yVar2 = (i6 & PegdownExtensions.SUBSCRIPT) != 0 ? p5.f7614c : yVar;
        return new P(new G(o0.s.d(b5, g3.a.b()) ? g3.a : b5 != 16 ? new C0936c(b5) : d1.n.a, j9, kVar2, iVar3, jVar, pVar2, str, j10, c0934a, pVar3, bVar, j7, lVar2, c1389k, yVar2 != null ? yVar2.a : null, abstractC1499e), new u(i7, i8, j8, qVar, yVar2 != null ? yVar2.f7676b : null, (i6 & PegdownExtensions.RELAXEDHRULES) != 0 ? uVar.f7669f : iVar2, uVar.f7670g, uVar.f7671h, uVar.f7672i), yVar2);
    }

    public static P e(P p5, long j3, long j4, W0.k kVar, long j5, int i6, long j6, int i7) {
        long j7 = (i7 & 2) != 0 ? e1.o.f11580c : j4;
        W0.k kVar2 = (i7 & 4) != 0 ? null : kVar;
        long j8 = (i7 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? e1.o.f11580c : j5;
        long j9 = o0.s.f13481h;
        int i8 = (32768 & i7) != 0 ? 0 : i6;
        long j10 = (i7 & PegdownExtensions.SUPPRESS_INLINE_HTML) != 0 ? e1.o.f11580c : j6;
        G a = H.a(p5.a, j3, null, Float.NaN, j7, kVar2, null, null, null, null, j8, null, null, null, j9, null, null, null, null);
        u a6 = v.a(p5.f7613b, i8, 0, j10, null, null, null, 0, 0, null);
        return (p5.a == a && p5.f7613b == a6) ? p5 : new P(a, a6);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(P p5) {
        if (this != p5) {
            return AbstractC1276k.b(this.f7613b, p5.f7613b) && this.a.a(p5.a);
        }
        return true;
    }

    public final P d(P p5) {
        return (p5 == null || p5.equals(f7612d)) ? this : new P(this.a.c(p5.a), this.f7613b.a(p5.f7613b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p5 = (P) obj;
        return AbstractC1276k.b(this.a, p5.a) && AbstractC1276k.b(this.f7613b, p5.f7613b) && AbstractC1276k.b(this.f7614c, p5.f7614c);
    }

    public final int hashCode() {
        int hashCode = (this.f7613b.hashCode() + (this.a.hashCode() * 31)) * 31;
        y yVar = this.f7614c;
        return hashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) o0.s.j(b()));
        sb.append(", brush=");
        G g3 = this.a;
        sb.append(g3.a.c());
        sb.append(", alpha=");
        sb.append(g3.a.a());
        sb.append(", fontSize=");
        sb.append((Object) e1.o.d(g3.f7571b));
        sb.append(", fontWeight=");
        sb.append(g3.f7572c);
        sb.append(", fontStyle=");
        sb.append(g3.f7573d);
        sb.append(", fontSynthesis=");
        sb.append(g3.f7574e);
        sb.append(", fontFamily=");
        sb.append(g3.f7575f);
        sb.append(", fontFeatureSettings=");
        sb.append(g3.f7576g);
        sb.append(", letterSpacing=");
        sb.append((Object) e1.o.d(g3.f7577h));
        sb.append(", baselineShift=");
        sb.append(g3.f7578i);
        sb.append(", textGeometricTransform=");
        sb.append(g3.f7579j);
        sb.append(", localeList=");
        sb.append(g3.f7580k);
        sb.append(", background=");
        AbstractC1135a.p(g3.f7581l, sb, ", textDecoration=");
        sb.append(g3.f7582m);
        sb.append(", shadow=");
        sb.append(g3.f7583n);
        sb.append(", drawStyle=");
        sb.append(g3.f7585p);
        sb.append(", textAlign=");
        u uVar = this.f7613b;
        sb.append((Object) d1.k.a(uVar.a));
        sb.append(", textDirection=");
        sb.append((Object) d1.m.a(uVar.f7665b));
        sb.append(", lineHeight=");
        sb.append((Object) e1.o.d(uVar.f7666c));
        sb.append(", textIndent=");
        sb.append(uVar.f7667d);
        sb.append(", platformStyle=");
        sb.append(this.f7614c);
        sb.append(", lineHeightStyle=");
        sb.append(uVar.f7669f);
        sb.append(", lineBreak=");
        sb.append((Object) C0938e.a(uVar.f7670g));
        sb.append(", hyphens=");
        sb.append((Object) C0937d.a(uVar.f7671h));
        sb.append(", textMotion=");
        sb.append(uVar.f7672i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public P(S0.G r4, S0.u r5) {
        /*
            r3 = this;
            S0.x r0 = r4.f7584o
            S0.w r1 = r5.f7668e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            S0.y r2 = new S0.y
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.P.<init>(S0.G, S0.u):void");
    }

    public P(long j3, long j4, W0.k kVar, W0.p pVar, long j5, int i6, long j6, int i7) {
        this(new G((i7 & 1) != 0 ? o0.s.f13481h : j3, (i7 & 2) != 0 ? e1.o.f11580c : j4, (i7 & 4) != 0 ? null : kVar, (W0.i) null, (W0.j) null, (i7 & 32) != 0 ? null : pVar, (i7 & 64) != 0 ? null : "tnum", (i7 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? e1.o.f11580c : j5, (C0934a) null, (d1.p) null, (Z0.b) null, o0.s.f13481h, (d1.l) null, (C1389K) null, (x) null), new u((32768 & i7) != 0 ? 0 : i6, 0, (i7 & PegdownExtensions.SUPPRESS_INLINE_HTML) != 0 ? e1.o.f11580c : j6, null, null, null, 0, 0, null), null);
    }
}
