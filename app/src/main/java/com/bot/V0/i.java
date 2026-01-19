package V0;

import S.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: c, reason: collision with root package name */
    public Paint.FontMetricsInt f8792c;

    /* renamed from: e, reason: collision with root package name */
    public int f8793e;

    /* renamed from: f, reason: collision with root package name */
    public int f8794f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8795g;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f8792c;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC1276k.k("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f8795g) {
            Y0.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f8794f;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i6, int i7, float f6, int i8, int i9, int i10, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
        this.f8795g = true;
        paint.getTextSize();
        this.f8792c = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            Y0.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f8793e = (int) Math.ceil(l.f7374V);
        this.f8794f = (int) Math.ceil(l.f7374V);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f8795g) {
            Y0.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f8793e;
    }
}
