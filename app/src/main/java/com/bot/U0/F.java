package u0;

import T.C0607g0;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import n0.C1356e;
import o0.C1400k;
import q0.InterfaceC1498d;

/* loaded from: classes.dex */
public final class F extends AbstractC1739D {

    /* renamed from: b, reason: collision with root package name */
    public final C1743d f14962b;

    /* renamed from: c, reason: collision with root package name */
    public String f14963c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14964d;

    /* renamed from: e, reason: collision with root package name */
    public final C1740a f14965e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1277l f14966f;

    /* renamed from: g, reason: collision with root package name */
    public final C0607g0 f14967g;

    /* renamed from: h, reason: collision with root package name */
    public C1400k f14968h;

    /* renamed from: i, reason: collision with root package name */
    public final C0607g0 f14969i;

    /* renamed from: j, reason: collision with root package name */
    public long f14970j;

    /* renamed from: k, reason: collision with root package name */
    public float f14971k;

    /* renamed from: l, reason: collision with root package name */
    public float f14972l;

    /* renamed from: m, reason: collision with root package name */
    public final E f14973m;

    public F(C1743d c1743d) {
        this.f14962b = c1743d;
        c1743d.f15018i = new E(this, 0);
        this.f14963c = FlexmarkHtmlConverter.DEFAULT_NODE;
        this.f14964d = true;
        this.f14965e = new C1740a();
        this.f14966f = C1747h.f15060g;
        this.f14967g = T.r.A(null);
        this.f14969i = T.r.A(new C1356e(0L));
        this.f14970j = 9205357640488583168L;
        this.f14971k = 1.0f;
        this.f14972l = 1.0f;
        this.f14973m = new E(this, 1);
    }

    @Override // u0.AbstractC1739D
    public final void a(InterfaceC1498d interfaceC1498d) {
        e(interfaceC1498d, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r3 != (r8 == null ? r8.a() : 0)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        if (r9.f15006d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(q0.InterfaceC1498d r33, float r34, o0.C1400k r35) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.F.e(q0.d, float, o0.k):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f14963c);
        sb.append("\n\tviewportWidth: ");
        C0607g0 c0607g0 = this.f14969i;
        sb.append(Float.intBitsToFloat((int) (((C1356e) c0607g0.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C1356e) c0607g0.getValue()).a & 4294967295L)));
        sb.append(SequenceUtils.EOL);
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
