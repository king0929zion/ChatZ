package S0;

import com.vladsch.flexmark.parser.PegdownExtensions;
import d1.C0934a;
import d1.C0936c;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o0.AbstractC1404o;
import o0.C1389K;
import q0.AbstractC1499e;

/* loaded from: classes.dex */
public final class G implements InterfaceC0540b {
    public final d1.o a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7571b;

    /* renamed from: c, reason: collision with root package name */
    public final W0.k f7572c;

    /* renamed from: d, reason: collision with root package name */
    public final W0.i f7573d;

    /* renamed from: e, reason: collision with root package name */
    public final W0.j f7574e;

    /* renamed from: f, reason: collision with root package name */
    public final W0.p f7575f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7576g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7577h;

    /* renamed from: i, reason: collision with root package name */
    public final C0934a f7578i;

    /* renamed from: j, reason: collision with root package name */
    public final d1.p f7579j;

    /* renamed from: k, reason: collision with root package name */
    public final Z0.b f7580k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7581l;

    /* renamed from: m, reason: collision with root package name */
    public final d1.l f7582m;

    /* renamed from: n, reason: collision with root package name */
    public final C1389K f7583n;

    /* renamed from: o, reason: collision with root package name */
    public final x f7584o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC1499e f7585p;

    public G(long j3, long j4, W0.k kVar, W0.i iVar, W0.j jVar, W0.p pVar, String str, long j5, C0934a c0934a, d1.p pVar2, Z0.b bVar, long j6, d1.l lVar, C1389K c1389k, x xVar) {
        this(j3 != 16 ? new C0936c(j3) : d1.n.a, j4, kVar, iVar, jVar, pVar, str, j5, c0934a, pVar2, bVar, j6, lVar, c1389k, xVar, null);
    }

    public final boolean a(G g3) {
        if (this == g3) {
            return true;
        }
        return e1.o.a(this.f7571b, g3.f7571b) && AbstractC1276k.b(this.f7572c, g3.f7572c) && AbstractC1276k.b(this.f7573d, g3.f7573d) && AbstractC1276k.b(this.f7574e, g3.f7574e) && AbstractC1276k.b(this.f7575f, g3.f7575f) && AbstractC1276k.b(this.f7576g, g3.f7576g) && e1.o.a(this.f7577h, g3.f7577h) && AbstractC1276k.b(this.f7578i, g3.f7578i) && AbstractC1276k.b(this.f7579j, g3.f7579j) && AbstractC1276k.b(this.f7580k, g3.f7580k) && o0.s.d(this.f7581l, g3.f7581l) && AbstractC1276k.b(this.f7584o, g3.f7584o);
    }

    public final boolean b(G g3) {
        return AbstractC1276k.b(this.a, g3.a) && AbstractC1276k.b(this.f7582m, g3.f7582m) && AbstractC1276k.b(this.f7583n, g3.f7583n) && AbstractC1276k.b(this.f7585p, g3.f7585p);
    }

    public final G c(G g3) {
        if (g3 == null) {
            return this;
        }
        d1.o oVar = g3.a;
        return H.a(this, oVar.b(), oVar.c(), oVar.a(), g3.f7571b, g3.f7572c, g3.f7573d, g3.f7574e, g3.f7575f, g3.f7576g, g3.f7577h, g3.f7578i, g3.f7579j, g3.f7580k, g3.f7581l, g3.f7582m, g3.f7583n, g3.f7584o, g3.f7585p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return a(g3) && b(g3);
    }

    public final int hashCode() {
        d1.o oVar = this.a;
        long b5 = oVar.b();
        int i6 = o0.s.f13482i;
        int hashCode = Long.hashCode(b5) * 31;
        AbstractC1404o c6 = oVar.c();
        int hashCode2 = (Float.hashCode(oVar.a()) + ((hashCode + (c6 != null ? c6.hashCode() : 0)) * 31)) * 31;
        e1.p[] pVarArr = e1.o.f11579b;
        int c7 = AbstractC1135a.c(hashCode2, 31, this.f7571b);
        W0.k kVar = this.f7572c;
        int i7 = (c7 + (kVar != null ? kVar.f8840c : 0)) * 31;
        W0.i iVar = this.f7573d;
        int hashCode3 = (i7 + (iVar != null ? Integer.hashCode(iVar.a) : 0)) * 31;
        W0.j jVar = this.f7574e;
        int hashCode4 = (hashCode3 + (jVar != null ? Integer.hashCode(jVar.a) : 0)) * 31;
        W0.p pVar = this.f7575f;
        int hashCode5 = (hashCode4 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = this.f7576g;
        int c8 = AbstractC1135a.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f7577h);
        C0934a c0934a = this.f7578i;
        int hashCode6 = (c8 + (c0934a != null ? Float.hashCode(c0934a.a) : 0)) * 31;
        d1.p pVar2 = this.f7579j;
        int hashCode7 = (hashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        Z0.b bVar = this.f7580k;
        int c9 = AbstractC1135a.c((hashCode7 + (bVar != null ? bVar.f9855c.hashCode() : 0)) * 31, 31, this.f7581l);
        d1.l lVar = this.f7582m;
        int i8 = (c9 + (lVar != null ? lVar.a : 0)) * 31;
        C1389K c1389k = this.f7583n;
        int hashCode8 = (i8 + (c1389k != null ? c1389k.hashCode() : 0)) * 31;
        x xVar = this.f7584o;
        int hashCode9 = (hashCode8 + (xVar != null ? xVar.hashCode() : 0)) * 31;
        AbstractC1499e abstractC1499e = this.f7585p;
        return hashCode9 + (abstractC1499e != null ? abstractC1499e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        d1.o oVar = this.a;
        sb.append((Object) o0.s.j(oVar.b()));
        sb.append(", brush=");
        sb.append(oVar.c());
        sb.append(", alpha=");
        sb.append(oVar.a());
        sb.append(", fontSize=");
        sb.append((Object) e1.o.d(this.f7571b));
        sb.append(", fontWeight=");
        sb.append(this.f7572c);
        sb.append(", fontStyle=");
        sb.append(this.f7573d);
        sb.append(", fontSynthesis=");
        sb.append(this.f7574e);
        sb.append(", fontFamily=");
        sb.append(this.f7575f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f7576g);
        sb.append(", letterSpacing=");
        sb.append((Object) e1.o.d(this.f7577h));
        sb.append(", baselineShift=");
        sb.append(this.f7578i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f7579j);
        sb.append(", localeList=");
        sb.append(this.f7580k);
        sb.append(", background=");
        AbstractC1135a.p(this.f7581l, sb, ", textDecoration=");
        sb.append(this.f7582m);
        sb.append(", shadow=");
        sb.append(this.f7583n);
        sb.append(", platformStyle=");
        sb.append(this.f7584o);
        sb.append(", drawStyle=");
        sb.append(this.f7585p);
        sb.append(')');
        return sb.toString();
    }

    public G(d1.o oVar, long j3, W0.k kVar, W0.i iVar, W0.j jVar, W0.p pVar, String str, long j4, C0934a c0934a, d1.p pVar2, Z0.b bVar, long j5, d1.l lVar, C1389K c1389k, x xVar, AbstractC1499e abstractC1499e) {
        this.a = oVar;
        this.f7571b = j3;
        this.f7572c = kVar;
        this.f7573d = iVar;
        this.f7574e = jVar;
        this.f7575f = pVar;
        this.f7576g = str;
        this.f7577h = j4;
        this.f7578i = c0934a;
        this.f7579j = pVar2;
        this.f7580k = bVar;
        this.f7581l = j5;
        this.f7582m = lVar;
        this.f7583n = c1389k;
        this.f7584o = xVar;
        this.f7585p = abstractC1499e;
    }

    public G(long j3, long j4, W0.k kVar, W0.i iVar, W0.j jVar, W0.p pVar, String str, long j5, C0934a c0934a, d1.p pVar2, Z0.b bVar, long j6, d1.l lVar, C1389K c1389k, int i6) {
        this((i6 & 1) != 0 ? o0.s.f13481h : j3, (i6 & 2) != 0 ? e1.o.f11580c : j4, (i6 & 4) != 0 ? null : kVar, (i6 & 8) != 0 ? null : iVar, (i6 & 16) != 0 ? null : jVar, (i6 & 32) != 0 ? null : pVar, (i6 & 64) != 0 ? null : str, (i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? e1.o.f11580c : j5, (i6 & PegdownExtensions.WIKILINKS) != 0 ? null : c0934a, (i6 & PegdownExtensions.STRIKETHROUGH) != 0 ? null : pVar2, (i6 & PegdownExtensions.ANCHORLINKS) != 0 ? null : bVar, (i6 & 2048) != 0 ? o0.s.f13481h : j6, (i6 & 4096) != 0 ? null : lVar, (i6 & 8192) != 0 ? null : c1389k, (x) null);
    }
}
