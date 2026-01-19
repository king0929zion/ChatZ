package c1;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import m4.AbstractC1276k;
import q0.AbstractC1499e;
import q0.g;
import q0.h;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1499e f11103c;

    public C0922a(AbstractC1499e abstractC1499e) {
        this.f11103c = abstractC1499e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = g.a;
            AbstractC1499e abstractC1499e = this.f11103c;
            if (AbstractC1276k.b(abstractC1499e, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC1499e instanceof h)) {
                throw new RuntimeException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            h hVar = (h) abstractC1499e;
            textPaint.setStrokeWidth(hVar.a);
            textPaint.setStrokeMiter(hVar.f13947b);
            int i6 = hVar.f13949d;
            textPaint.setStrokeJoin(i6 == 0 ? Paint.Join.MITER : i6 == 1 ? Paint.Join.ROUND : i6 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i7 = hVar.f13948c;
            textPaint.setStrokeCap(i7 == 0 ? Paint.Cap.BUTT : i7 == 1 ? Paint.Cap.ROUND : i7 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            hVar.getClass();
            textPaint.setPathEffect(null);
        }
    }
}
