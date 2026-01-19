package u0;

import H0.C0158m;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import f0.C0987j;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.List;
import o0.AbstractC1399j;
import o0.AbstractC1404o;
import o0.C1382D;
import o0.C1397h;
import o0.N;
import q0.InterfaceC1498d;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1743d extends AbstractC1739D {

    /* renamed from: b, reason: collision with root package name */
    public float[] f15011b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15012c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f15013d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f15014e = o0.s.f13481h;

    /* renamed from: f, reason: collision with root package name */
    public List f15015f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15016g;

    /* renamed from: h, reason: collision with root package name */
    public C1397h f15017h;

    /* renamed from: i, reason: collision with root package name */
    public l4.c f15018i;

    /* renamed from: j, reason: collision with root package name */
    public final C1742c f15019j;

    /* renamed from: k, reason: collision with root package name */
    public String f15020k;

    /* renamed from: l, reason: collision with root package name */
    public float f15021l;

    /* renamed from: m, reason: collision with root package name */
    public float f15022m;

    /* renamed from: n, reason: collision with root package name */
    public float f15023n;

    /* renamed from: o, reason: collision with root package name */
    public float f15024o;

    /* renamed from: p, reason: collision with root package name */
    public float f15025p;

    /* renamed from: q, reason: collision with root package name */
    public float f15026q;

    /* renamed from: r, reason: collision with root package name */
    public float f15027r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15028s;

    public C1743d() {
        int i6 = H.a;
        this.f15015f = Y3.v.f9812c;
        this.f15016g = true;
        this.f15019j = new C1742c(this, 0);
        this.f15020k = FlexmarkHtmlConverter.DEFAULT_NODE;
        this.f15024o = 1.0f;
        this.f15025p = 1.0f;
        this.f15028s = true;
    }

    @Override // u0.AbstractC1739D
    public final void a(InterfaceC1498d interfaceC1498d) {
        if (this.f15028s) {
            float[] fArr = this.f15011b;
            if (fArr == null) {
                fArr = C1382D.a();
                this.f15011b = fArr;
            } else {
                C1382D.d(fArr);
            }
            C1382D.f(fArr, this.f15026q + this.f15022m, this.f15027r + this.f15023n);
            float f6 = this.f15021l;
            if (fArr.length >= 16) {
                double d6 = f6 * 0.017453292519943295d;
                float sin = (float) Math.sin(d6);
                float cos = (float) Math.cos(d6);
                float f7 = fArr[0];
                float f8 = fArr[4];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = -sin;
                float f11 = fArr[1];
                float f12 = fArr[5];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = fArr[2];
                float f15 = fArr[6];
                float f16 = (sin * f15) + (cos * f14);
                float f17 = fArr[3];
                float f18 = fArr[7];
                fArr[0] = f9;
                fArr[1] = f13;
                fArr[2] = f16;
                fArr[3] = (sin * f18) + (cos * f17);
                fArr[4] = (f8 * cos) + (f7 * f10);
                fArr[5] = (f12 * cos) + (f11 * f10);
                fArr[6] = (f15 * cos) + (f14 * f10);
                fArr[7] = (cos * f18) + (f10 * f17);
            }
            float f19 = this.f15024o;
            float f20 = this.f15025p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f19;
                fArr[1] = fArr[1] * f19;
                fArr[2] = fArr[2] * f19;
                fArr[3] = fArr[3] * f19;
                fArr[4] = fArr[4] * f20;
                fArr[5] = fArr[5] * f20;
                fArr[6] = fArr[6] * f20;
                fArr[7] = fArr[7] * f20;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            C1382D.f(fArr, -this.f15022m, -this.f15023n);
            this.f15028s = false;
        }
        if (this.f15016g) {
            if (!this.f15015f.isEmpty()) {
                C1397h c1397h = this.f15017h;
                if (c1397h == null) {
                    c1397h = AbstractC1399j.a();
                    this.f15017h = c1397h;
                }
                AbstractC1741b.e(this.f15015f, c1397h);
            }
            this.f15016g = false;
        }
        C0158m g02 = interfaceC1498d.g0();
        long j3 = g02.j();
        g02.g().h();
        try {
            C0158m c0158m = (C0158m) ((C0987j) g02.f1972e).f11690e;
            float[] fArr2 = this.f15011b;
            if (fArr2 != null) {
                c0158m.g().k(fArr2);
            }
            C1397h c1397h2 = this.f15017h;
            if (!this.f15015f.isEmpty() && c1397h2 != null) {
                c0158m.g().f(c1397h2);
            }
            ArrayList arrayList = this.f15012c;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC1739D) arrayList.get(i6)).a(interfaceC1498d);
            }
        } finally {
            AbstractC1135a.q(g02, j3);
        }
    }

    @Override // u0.AbstractC1739D
    public final l4.c b() {
        return this.f15018i;
    }

    @Override // u0.AbstractC1739D
    public final void d(C1742c c1742c) {
        this.f15018i = c1742c;
    }

    public final void e(int i6, AbstractC1739D abstractC1739D) {
        ArrayList arrayList = this.f15012c;
        if (i6 < arrayList.size()) {
            arrayList.set(i6, abstractC1739D);
        } else {
            arrayList.add(abstractC1739D);
        }
        g(abstractC1739D);
        abstractC1739D.d(this.f15019j);
        c();
    }

    public final void f(long j3) {
        if (this.f15013d && j3 != 16) {
            long j4 = this.f15014e;
            if (j4 == 16) {
                this.f15014e = j3;
                return;
            }
            int i6 = H.a;
            if (o0.s.i(j4) == o0.s.i(j3) && o0.s.h(j4) == o0.s.h(j3) && o0.s.f(j4) == o0.s.f(j3)) {
                return;
            }
            this.f15013d = false;
            this.f15014e = o0.s.f13481h;
        }
    }

    public final void g(AbstractC1739D abstractC1739D) {
        if (!(abstractC1739D instanceof C1748i)) {
            if (abstractC1739D instanceof C1743d) {
                C1743d c1743d = (C1743d) abstractC1739D;
                if (c1743d.f15013d && this.f15013d) {
                    f(c1743d.f15014e);
                    return;
                } else {
                    this.f15013d = false;
                    this.f15014e = o0.s.f13481h;
                    return;
                }
            }
            return;
        }
        C1748i c1748i = (C1748i) abstractC1739D;
        AbstractC1404o abstractC1404o = c1748i.f15062b;
        if (this.f15013d && abstractC1404o != null) {
            if (abstractC1404o instanceof N) {
                f(((N) abstractC1404o).a);
            } else {
                this.f15013d = false;
                this.f15014e = o0.s.f13481h;
            }
        }
        AbstractC1404o abstractC1404o2 = c1748i.f15067g;
        if (this.f15013d && abstractC1404o2 != null) {
            if (abstractC1404o2 instanceof N) {
                f(((N) abstractC1404o2).a);
            } else {
                this.f15013d = false;
                this.f15014e = o0.s.f13481h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f15020k);
        ArrayList arrayList = this.f15012c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC1739D abstractC1739D = (AbstractC1739D) arrayList.get(i6);
            sb.append("\t");
            sb.append(abstractC1739D.toString());
            sb.append(SequenceUtils.EOL);
        }
        return sb.toString();
    }
}
