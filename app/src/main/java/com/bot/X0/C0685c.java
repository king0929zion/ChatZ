package X0;

import H0.C0158m;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
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
import o4.AbstractC1410a;

/* renamed from: X0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685c {
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x a;

    /* renamed from: b, reason: collision with root package name */
    public final C0158m f9085b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9087d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9088e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9089f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9090g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9091h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9092i;

    /* renamed from: j, reason: collision with root package name */
    public v f9093j;

    /* renamed from: k, reason: collision with root package name */
    public L f9094k;

    /* renamed from: l, reason: collision with root package name */
    public p f9095l;

    /* renamed from: n, reason: collision with root package name */
    public C1354c f9097n;

    /* renamed from: o, reason: collision with root package name */
    public C1354c f9098o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9086c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public l4.c f9096m = C0684b.f9079g;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f9099p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f9100q = C1382D.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f9101r = new Matrix();

    public C0685c(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, C0158m c0158m) {
        this.a = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f9085b = c0158m;
    }

        public final void a() {
        View view;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        C0158m c0158m = this.f9085b;
        Object r22 = c0158m.f1973f;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view2 = (View) c0158m.f1972e;
        if (inputMethodManager.isActive(view2)) {
            l4.c cVar = this.f9096m;
            float[] fArr = this.f9100q;
            cVar.f(new C1382D(fArr));
            this.a.u(fArr);
            Matrix matrix = this.f9101r;
            o0.y.u(matrix, fArr);
            v vVar = this.f9093j;
            AbstractC1276k.c(vVar);
            long j3 = vVar.f9125b;
            p pVar = this.f9095l;
            AbstractC1276k.c(pVar);
            L l3 = this.f9094k;
            AbstractC1276k.c(l3);
            C0554p c0554p = l3.f7599b;
            C1354c c1354c = this.f9097n;
            AbstractC1276k.c(c1354c);
            float f6 = c1354c.f13297d;
            float f7 = c1354c.f13295b;
            C1354c c1354c2 = this.f9098o;
            AbstractC1276k.c(c1354c2);
            boolean z5 = this.f9089f;
            boolean z6 = this.f9090g;
            boolean z7 = this.f9091h;
            boolean z8 = this.f9092i;
            CursorAnchorInfo.Builder builder = this.f9099p;
            builder.reset();
            builder.setMatrix(matrix);
            O o5 = vVar.f9126c;
            int f8 = O.f(j3);
            builder.setSelectionRange(f8, O.e(j3));
            d1.j jVar = d1.j.f11391e;
            if (!z5 || f8 < 0) {
                view = view2;
            } else {
                int b5 = pVar.b(f8);
                C1354c c6 = l3.c(b5);
                view = view2;
                float e6 = AbstractC1117a.e(c6.a, S.l.f7374V, (int) (l3.f7600c >> 32));
                boolean k3 = AbstractC1410a.k(c1354c, e6, c6.f13295b);
                boolean k5 = AbstractC1410a.k(c1354c, e6, c6.f13297d);
                boolean z9 = l3.a(b5) == jVar;
                int i6 = (k3 || k5) ? 1 : 0;
                if (!k3 || !k5) {
                    i6 |= 2;
                }
                if (z9) {
                    i6 |= 4;
                }
                float f9 = c6.f13295b;
                float f10 = c6.f13297d;
                builder.setInsertionMarkerLocation(e6, f9, f10, f10, i6);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z6) {
                int f11 = o5 != null ? O.f(o5.a) : -1;
                int e7 = o5 != null ? O.e(o5.a) : -1;
                if (f11 >= 0 && f11 < e7) {
                    builder2.setComposingText(f11, vVar.a.f7630e.subSequence(f11, e7));
                    int b6 = pVar.b(f11);
                    int b7 = pVar.b(e7);
                    float[] fArr2 = new float[(b7 - b6) * 4];
                    c0554p.a(F.b(b6, b7), fArr2);
                    while (f11 < e7) {
                        int b8 = pVar.b(f11);
                        int i7 = (b8 - b6) * 4;
                        float f12 = fArr2[i7];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f13 = fArr2[i7 + 1];
                        int i8 = e7;
                        float f14 = fArr2[i7 + 2];
                        float f15 = fArr2[i7 + 3];
                        int i9 = f11;
                        int i10 = (c1354c.a < f14 ? 1 : 0) & (f12 < c1354c.f13296c ? 1 : 0) & (f7 < f15 ? 1 : 0) & (f13 < f6 ? 1 : 0);
                        if (!AbstractC1410a.k(c1354c, f12, f13) || !AbstractC1410a.k(c1354c, f14, f15)) {
                            i10 |= 2;
                        }
                        if (l3.a(b8) == jVar) {
                            i10 |= 4;
                        }
                        builder3.addCharacterBounds(i9, f12, f13, f14, f15, i10);
                        builder2 = builder3;
                        f11 = i9 + 1;
                        e7 = i8;
                    }
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33 && z7) {
                editorBounds = G2.b.k().setEditorBounds(o0.y.z(c1354c2));
                handwritingBounds = editorBounds.setHandwritingBounds(o0.y.z(c1354c2));
                build = handwritingBounds.build();
                builder2.setEditorBoundsInfo(build);
            }
            if (i11 >= 34 && z8 && !c1354c.g()) {
                int i12 = c0554p.f7652f - 1;
                if (i12 < 0) {
                    i12 = 0;
                }
                int f16 = AbstractC1117a.f(c0554p.e(f7), 0, i12);
                int f17 = AbstractC1117a.f(c0554p.e(f6), 0, i12);
                if (f16 <= f17) {
                    while (true) {
                        builder2.addVisibleLineBounds(l3.g(f16), c0554p.f(f16), l3.h(f16), c0554p.b(f16));
                        if (f16 == f17) {
                            break;
                        } else {
                            f16++;
                        }
                    }
                }
            }
            ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.f9088e = false;
        }
    }
}
