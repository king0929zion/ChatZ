package P;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import m4.AbstractC1276k;
import n0.C1356e;
import o0.s;
import o0.y;
import o4.AbstractC1410a;
import t.C1684l;

/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: i */
    public static final int[] f4409i = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: j */
    public static final int[] f4410j = new int[0];

    /* renamed from: c */
    public j f4411c;

    /* renamed from: e */
    public Boolean f4412e;

    /* renamed from: f */
    public Long f4413f;

    /* renamed from: g */
    public I.h f4414g;

    /* renamed from: h */
    public A.b f4415h;

    public static /* synthetic */ void a(e eVar) {
        setRippleState$lambda$1(eVar);
    }

    private final void setRippleState(boolean z5) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f4414g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l3 = this.f4413f;
        long longValue = currentAnimationTimeMillis - (l3 != null ? l3.longValue() : 0L);
        if (z5 || longValue >= 5) {
            int[] iArr = z5 ? f4409i : f4410j;
            j jVar = this.f4411c;
            if (jVar != null) {
                jVar.setState(iArr);
            }
        } else {
            I.h hVar = new I.h(this, 2);
            this.f4414g = hVar;
            postDelayed(hVar, 50L);
        }
        this.f4413f = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$1(e eVar) {
        j jVar = eVar.f4411c;
        if (jVar != null) {
            jVar.setState(f4410j);
        }
        eVar.f4414g = null;
    }

    public final void b(C1684l c1684l, boolean z5, long j3, int i6, long j4, float f6, A.b bVar) {
        if (this.f4411c == null || !Boolean.valueOf(z5).equals(this.f4412e)) {
            j jVar = new j(z5);
            setBackground(jVar);
            this.f4411c = jVar;
            this.f4412e = Boolean.valueOf(z5);
        }
        j jVar2 = this.f4411c;
        AbstractC1276k.c(jVar2);
        this.f4415h = bVar;
        e(j3, i6, j4, f6);
        if (z5) {
            jVar2.setHotspot(Float.intBitsToFloat((int) (c1684l.a >> 32)), Float.intBitsToFloat((int) (c1684l.a & 4294967295L)));
        } else {
            jVar2.setHotspot(jVar2.getBounds().centerX(), jVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f4415h = null;
        I.h hVar = this.f4414g;
        if (hVar != null) {
            removeCallbacks(hVar);
            I.h hVar2 = this.f4414g;
            AbstractC1276k.c(hVar2);
            hVar2.run();
        } else {
            j jVar = this.f4411c;
            if (jVar != null) {
                jVar.setState(f4410j);
            }
        }
        j jVar2 = this.f4411c;
        if (jVar2 == null) {
            return;
        }
        jVar2.setVisible(false, false);
        unscheduleDrawable(jVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j3, int i6, long j4, float f6) {
        j jVar = this.f4411c;
        if (jVar == null) {
            return;
        }
        Integer num = jVar.f4428f;
        if (num == null || num.intValue() != i6) {
            jVar.f4428f = Integer.valueOf(i6);
            jVar.setRadius(i6);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f6 *= 2;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        long c6 = s.c(f6, j4);
        s sVar = jVar.f4427e;
        if (!(sVar == null ? false : s.d(sVar.a, c6))) {
            jVar.f4427e = new s(c6);
            jVar.setColor(ColorStateList.valueOf(y.B(c6)));
        }
        Rect rect = new Rect(0, 0, AbstractC1410a.K(C1356e.d(j3)), AbstractC1410a.K(C1356e.b(j3)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        jVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        A.b bVar = this.f4415h;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
