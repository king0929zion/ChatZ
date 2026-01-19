package M;

import F0.InterfaceC0134w;
import S0.C0554p;
import S0.F;
import S0.L;
import S0.O;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import i4.AbstractC1117a;
import m4.AbstractC1276k;
import n0.C1354c;
import o0.C1382D;

/* loaded from: classes.dex */
public final class v {
    public final b a;

    /* renamed from: b, reason: collision with root package name */
    public final q f3190b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3192d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3193e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3194f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3195g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3196h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3197i;

    /* renamed from: j, reason: collision with root package name */
    public X0.v f3198j;

    /* renamed from: k, reason: collision with root package name */
    public L f3199k;

    /* renamed from: l, reason: collision with root package name */
    public X0.p f3200l;

    /* renamed from: m, reason: collision with root package name */
    public C1354c f3201m;

    /* renamed from: n, reason: collision with root package name */
    public C1354c f3202n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3191c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f3203o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f3204p = C1382D.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f3205q = new Matrix();

    public v(b bVar, q qVar) {
        this.a = bVar;
        this.f3190b = qVar;
    }

    public final void a() {
        float f6;
        float f7;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        q qVar = this.f3190b;
        InputMethodManager o5 = qVar.o();
        View view = (View) qVar.f3179e;
        if (!o5.isActive(view) || this.f3198j == null || this.f3200l == null || this.f3199k == null || this.f3201m == null || this.f3202n == null) {
            return;
        }
        float[] fArr = this.f3204p;
        C1382D.d(fArr);
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.a.f3132l.f3189u.getValue();
        if (interfaceC0134w != null) {
            if (!interfaceC0134w.j()) {
                interfaceC0134w = null;
            }
            if (interfaceC0134w != null) {
                interfaceC0134w.k(fArr);
            }
        }
        C1354c c1354c = this.f3202n;
        AbstractC1276k.c(c1354c);
        float f8 = -c1354c.a;
        C1354c c1354c2 = this.f3202n;
        AbstractC1276k.c(c1354c2);
        C1382D.f(fArr, f8, -c1354c2.f13295b);
        Matrix matrix = this.f3205q;
        o0.y.u(matrix, fArr);
        X0.v vVar = this.f3198j;
        AbstractC1276k.c(vVar);
        long j3 = vVar.f9125b;
        X0.p pVar = this.f3200l;
        AbstractC1276k.c(pVar);
        L l3 = this.f3199k;
        AbstractC1276k.c(l3);
        C0554p c0554p = l3.f7599b;
        C1354c c1354c3 = this.f3201m;
        AbstractC1276k.c(c1354c3);
        float f9 = c1354c3.f13297d;
        float f10 = c1354c3.f13295b;
        C1354c c1354c4 = this.f3202n;
        AbstractC1276k.c(c1354c4);
        boolean z5 = this.f3194f;
        boolean z6 = this.f3195g;
        boolean z7 = this.f3196h;
        boolean z8 = this.f3197i;
        CursorAnchorInfo.Builder builder = this.f3203o;
        builder.reset();
        builder.setMatrix(matrix);
        O o6 = vVar.f9126c;
        int f11 = O.f(j3);
        builder.setSelectionRange(f11, O.e(j3));
        d1.j jVar = d1.j.f11391e;
        if (!z5 || f11 < 0) {
            f6 = f9;
            f7 = f10;
        } else {
            int b5 = pVar.b(f11);
            C1354c c6 = l3.c(b5);
            f6 = f9;
            f7 = f10;
            float e6 = AbstractC1117a.e(c6.a, S.l.f7374V, (int) (l3.f7600c >> 32));
            boolean f12 = u.f(c1354c3, e6, c6.f13295b);
            boolean f13 = u.f(c1354c3, e6, c6.f13297d);
            boolean z9 = l3.a(b5) == jVar;
            int i6 = (f12 || f13) ? 1 : 0;
            if (!f12 || !f13) {
                i6 |= 2;
            }
            if (z9) {
                i6 |= 4;
            }
            float f14 = c6.f13295b;
            float f15 = c6.f13297d;
            builder.setInsertionMarkerLocation(e6, f14, f15, f15, i6);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z6) {
            int f16 = o6 != null ? O.f(o6.a) : -1;
            int e7 = o6 != null ? O.e(o6.a) : -1;
            if (f16 >= 0 && f16 < e7) {
                builder2.setComposingText(f16, vVar.a.f7630e.subSequence(f16, e7));
                int b6 = pVar.b(f16);
                int b7 = pVar.b(e7);
                float[] fArr2 = new float[(b7 - b6) * 4];
                c0554p.a(F.b(b6, b7), fArr2);
                while (f16 < e7) {
                    int b8 = pVar.b(f16);
                    int i7 = (b8 - b6) * 4;
                    float f17 = fArr2[i7];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f18 = fArr2[i7 + 1];
                    int i8 = b6;
                    float f19 = fArr2[i7 + 2];
                    float f20 = fArr2[i7 + 3];
                    int i9 = e7;
                    int i10 = (c1354c3.a < f19 ? 1 : 0) & (f17 < c1354c3.f13296c ? 1 : 0) & (f7 < f20 ? 1 : 0) & (f18 < f6 ? 1 : 0);
                    if (!u.f(c1354c3, f17, f18) || !u.f(c1354c3, f19, f20)) {
                        i10 |= 2;
                    }
                    if (l3.a(b8) == jVar) {
                        i10 |= 4;
                    }
                    int i11 = f16;
                    builder3.addCharacterBounds(i11, f17, f18, f19, f20, i10);
                    builder2 = builder3;
                    f16 = i11 + 1;
                    b6 = i8;
                    e7 = i9;
                }
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33 && z7) {
            editorBounds = G2.b.k().setEditorBounds(o0.y.z(c1354c4));
            handwritingBounds = editorBounds.setHandwritingBounds(o0.y.z(c1354c4));
            build = handwritingBounds.build();
            builder2.setEditorBoundsInfo(build);
        }
        if (i12 >= 34 && z8 && !c1354c3.g()) {
            int i13 = c0554p.f7652f - 1;
            if (i13 < 0) {
                i13 = 0;
            }
            int f21 = AbstractC1117a.f(c0554p.e(f7), 0, i13);
            int f22 = AbstractC1117a.f(c0554p.e(f6), 0, i13);
            if (f21 <= f22) {
                while (true) {
                    builder2.addVisibleLineBounds(l3.g(f21), c0554p.f(f21), l3.h(f21), c0554p.b(f21));
                    if (f21 == f22) {
                        break;
                    } else {
                        f21++;
                    }
                }
            }
        }
        qVar.o().updateCursorAnchorInfo(view, builder2.build());
        this.f3193e = false;
    }
}
