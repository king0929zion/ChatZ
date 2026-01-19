package c1;

import T.C0607g0;
import T.E;
import T.r;
import Y3.l;
import a1.j;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import n0.C1356e;
import o0.AbstractC1388J;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1388J f11104c;

    /* renamed from: e, reason: collision with root package name */
    public final float f11105e;

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f11106f = r.A(new C1356e(9205357640488583168L));

    /* renamed from: g, reason: collision with root package name */
    public final E f11107g = r.s(new l(this, 7));

    public b(AbstractC1388J abstractC1388J, float f6) {
        this.f11104c = abstractC1388J;
        this.f11105e = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.c(textPaint, this.f11105e);
        textPaint.setShader((Shader) this.f11107g.getValue());
    }
}
