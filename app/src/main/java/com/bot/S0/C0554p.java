package S0;

import a1.C0795c;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import e1.AbstractC0960b;
import e1.C0959a;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.List;
import m4.C1285t;
import m4.C1286u;
import n0.C1354c;
import o0.AbstractC1388J;
import o0.AbstractC1404o;
import o0.C1389K;
import q0.AbstractC1499e;

/* renamed from: S0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554p {
    public final E1.b a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7648b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7649c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7650d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7651e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7652f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7653g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f7654h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public C0554p(E1.b bVar, long j3, int i6, int i7) {
        boolean z5;
        int i8;
        int g3;
        int i9;
        this.a = bVar;
        this.f7648b = i6;
        if (C0959a.j(j3) != 0 || C0959a.i(j3) != 0) {
            Y0.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) bVar.f1295e;
        int size = arrayList2.size();
        float f6 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C0556s c0556s = (C0556s) arrayList2.get(i10);
            C0795c c0795c = c0556s.a;
            int h3 = C0959a.h(j3);
            if (C0959a.c(j3)) {
                i8 = i10;
                g3 = C0959a.g(j3) - ((int) Math.ceil(f6));
                if (g3 < 0) {
                    g3 = 0;
                }
            } else {
                i8 = i10;
                g3 = C0959a.g(j3);
            }
            C0539a c0539a = new C0539a(c0795c, this.f7648b - i11, i7, AbstractC0960b.b(h3, g3, 5));
            float b5 = c0539a.b() + f6;
            T0.j jVar = c0539a.f7617d;
            int i12 = i11 + jVar.f8317g;
            arrayList.add(new r(c0539a, c0556s.f7663b, c0556s.f7664c, i11, i12, f6, b5));
            if (!jVar.f8314d) {
                if (i12 == this.f7648b) {
                    i9 = i8;
                    if (i9 != Y4.l.C((ArrayList) this.a.f1295e)) {
                    }
                } else {
                    i9 = i8;
                }
                i10 = i9 + 1;
                i11 = i12;
                f6 = b5;
            }
            z5 = true;
            i11 = i12;
            f6 = b5;
            break;
        }
        z5 = false;
        this.f7651e = f6;
        this.f7652f = i11;
        this.f7649c = z5;
        this.f7654h = arrayList;
        this.f7650d = C0959a.h(j3);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            r rVar = (r) arrayList.get(i13);
            ?? r7 = rVar.a.f7619f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i14 = 0; i14 < size3; i14++) {
                C1354c c1354c = (C1354c) r7.get(i14);
                arrayList4.add(c1354c != null ? rVar.a(c1354c) : null);
            }
            Y3.r.c0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.f1292b).size()) {
            int size4 = ((List) this.a.f1292b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i15 = 0; i15 < size4; i15++) {
                arrayList5.add(null);
            }
            arrayList3 = Y3.m.z0(arrayList3, arrayList5);
        }
        this.f7653g = arrayList3;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, m4.u] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, m4.t] */
    public final void a(long j3, float[] fArr) {
        k(O.f(j3));
        l(O.e(j3));
        ?? obj = new Object();
        obj.f12971c = 0;
        F.g(this.f7654h, j3, new C0553o(j3, fArr, (C1286u) obj, (C1285t) new Object()));
    }

    public final float b(int i6) {
        m(i6);
        ArrayList arrayList = this.f7654h;
        r rVar = (r) arrayList.get(F.e(arrayList, i6));
        C0539a c0539a = rVar.a;
        return c0539a.f7617d.e(i6 - rVar.f7659d) + rVar.f7661f;
    }

    public final int c(int i6, boolean z5) {
        int f6;
        m(i6);
        ArrayList arrayList = this.f7654h;
        r rVar = (r) arrayList.get(F.e(arrayList, i6));
        C0539a c0539a = rVar.a;
        int i7 = i6 - rVar.f7659d;
        T0.j jVar = c0539a.f7617d;
        if (z5) {
            Layout layout = jVar.f8316f;
            ThreadLocal threadLocal = T0.k.a;
            if (layout.getEllipsisCount(i7) <= 0 || jVar.f8312b != TextUtils.TruncateAt.END) {
                E1.b c6 = jVar.c();
                Layout layout2 = (Layout) c6.a;
                f6 = c6.q(layout2.getLineEnd(i7), layout2.getLineStart(i7));
            } else {
                f6 = layout.getEllipsisStart(i7) + layout.getLineStart(i7);
            }
        } else {
            f6 = jVar.f(i7);
        }
        return f6 + rVar.f7657b;
    }

    public final int d(int i6) {
        int length = ((C0545g) this.a.a).f7630e.length();
        ArrayList arrayList = this.f7654h;
        r rVar = (r) arrayList.get(i6 >= length ? Y4.l.C(arrayList) : i6 < 0 ? 0 : F.d(arrayList, i6));
        return rVar.a.f7617d.f8316f.getLineForOffset(rVar.d(i6)) + rVar.f7659d;
    }

    public final int e(float f6) {
        ArrayList arrayList = this.f7654h;
        r rVar = (r) arrayList.get(F.f(arrayList, f6));
        int i6 = rVar.f7658c - rVar.f7657b;
        int i7 = rVar.f7659d;
        if (i6 == 0) {
            return i7;
        }
        C0539a c0539a = rVar.a;
        float f7 = f6 - rVar.f7661f;
        T0.j jVar = c0539a.f7617d;
        return jVar.f8316f.getLineForVertical(((int) f7) - jVar.f8318h) + i7;
    }

    public final float f(int i6) {
        m(i6);
        ArrayList arrayList = this.f7654h;
        r rVar = (r) arrayList.get(F.e(arrayList, i6));
        C0539a c0539a = rVar.a;
        return c0539a.f7617d.g(i6 - rVar.f7659d) + rVar.f7661f;
    }

    public final int g(long j3) {
        int i6 = (int) (j3 & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i6);
        ArrayList arrayList = this.f7654h;
        r rVar = (r) arrayList.get(F.f(arrayList, intBitsToFloat));
        int i7 = rVar.f7658c;
        int i8 = rVar.f7657b;
        if (i7 - i8 == 0) {
            return i8;
        }
        C0539a c0539a = rVar.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i6) - rVar.f7661f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        T0.j jVar = c0539a.f7617d;
        int lineForVertical = jVar.f8316f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - jVar.f8318h);
        return jVar.f8316f.getOffsetForHorizontal(lineForVertical, (jVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i8;
    }

    public final long h(C1354c c1354c, int i6, F0.F f6) {
        long j3;
        long j4;
        float f7 = c1354c.f13295b;
        ArrayList arrayList = this.f7654h;
        int f8 = F.f(arrayList, f7);
        float f9 = ((r) arrayList.get(f8)).f7662g;
        float f10 = c1354c.f13297d;
        if (f9 >= f10 || f8 == Y4.l.C(arrayList)) {
            r rVar = (r) arrayList.get(f8);
            return rVar.b(rVar.a.c(rVar.c(c1354c), i6, f6), true);
        }
        int f11 = F.f(arrayList, f10);
        long j5 = O.f7610b;
        while (true) {
            j3 = O.f7610b;
            if (!O.b(j5, j3) || f8 > f11) {
                break;
            }
            r rVar2 = (r) arrayList.get(f8);
            j5 = rVar2.b(rVar2.a.c(rVar2.c(c1354c), i6, f6), true);
            f8++;
        }
        if (O.b(j5, j3)) {
            return j3;
        }
        while (true) {
            j4 = O.f7610b;
            if (!O.b(j3, j4) || f8 > f11) {
                break;
            }
            r rVar3 = (r) arrayList.get(f11);
            j3 = rVar3.b(rVar3.a.c(rVar3.c(c1354c), i6, f6), true);
            f11--;
        }
        return O.b(j3, j4) ? j5 : F.b((int) (j5 >> 32), (int) (4294967295L & j3));
    }

    public final void i(o0.q qVar, long j3, C1389K c1389k, d1.l lVar, AbstractC1499e abstractC1499e) {
        qVar.h();
        ArrayList arrayList = this.f7654h;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            r rVar = (r) arrayList.get(i6);
            rVar.a.f(qVar, j3, c1389k, lVar, abstractC1499e);
            qVar.n(S.l.f7374V, rVar.a.b());
        }
        qVar.p();
    }

    public final void j(o0.q qVar, AbstractC1404o abstractC1404o, float f6, C1389K c1389k, d1.l lVar, AbstractC1499e abstractC1499e) {
        qVar.h();
        ArrayList arrayList = this.f7654h;
        if (arrayList.size() <= 1) {
            a1.j.b(this, qVar, abstractC1404o, f6, c1389k, lVar, abstractC1499e);
        } else if (abstractC1404o instanceof o0.N) {
            a1.j.b(this, qVar, abstractC1404o, f6, c1389k, lVar, abstractC1499e);
        } else {
            if (!(abstractC1404o instanceof AbstractC1388J)) {
                throw new RuntimeException();
            }
            int size = arrayList.size();
            float f7 = 0.0f;
            float f8 = 0.0f;
            for (int i6 = 0; i6 < size; i6++) {
                r rVar = (r) arrayList.get(i6);
                f8 += rVar.a.b();
                f7 = Math.max(f7, rVar.a.d());
            }
            Shader b5 = ((AbstractC1388J) abstractC1404o).b((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
            Matrix matrix = new Matrix();
            b5.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                C0539a c0539a = ((r) arrayList.get(i7)).a;
                c0539a.g(qVar, new o0.p(b5), f6, c1389k, lVar, abstractC1499e);
                qVar.n(S.l.f7374V, c0539a.b());
                matrix.setTranslate(S.l.f7374V, -c0539a.b());
                b5.setLocalMatrix(matrix);
            }
        }
        qVar.p();
    }

    public final void k(int i6) {
        boolean z5 = false;
        E1.b bVar = this.a;
        if (i6 >= 0 && i6 < ((C0545g) bVar.a).f7630e.length()) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        StringBuilder k3 = AbstractC1135a.k("offset(", i6, ") is out of bounds [0, ");
        k3.append(((C0545g) bVar.a).f7630e.length());
        k3.append(')');
        Y0.a.a(k3.toString());
    }

    public final void l(int i6) {
        boolean z5 = false;
        E1.b bVar = this.a;
        if (i6 >= 0 && i6 <= ((C0545g) bVar.a).f7630e.length()) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        StringBuilder k3 = AbstractC1135a.k("offset(", i6, ") is out of bounds [0, ");
        k3.append(((C0545g) bVar.a).f7630e.length());
        k3.append(']');
        Y0.a.a(k3.toString());
    }

    public final void m(int i6) {
        boolean z5 = false;
        int i7 = this.f7652f;
        if (i6 >= 0 && i6 < i7) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        Y0.a.a("lineIndex(" + i6 + ") is out of bounds [0, " + i7 + ')');
    }
}
