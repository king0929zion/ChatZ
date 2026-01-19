package y1;

import B0.H;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import i4.AbstractC1120d;
import java.nio.ByteBuffer;
import z1.C2016a;

/* loaded from: classes.dex */
public final class v extends ReplacementSpan {

    /* renamed from: e, reason: collision with root package name */
    public final u f16007e;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f16010h;

    /* renamed from: c, reason: collision with root package name */
    public final Paint.FontMetricsInt f16006c = new Paint.FontMetricsInt();

    /* renamed from: f, reason: collision with root package name */
    public short f16008f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f16009g = 1.0f;

    public v(u uVar) {
        AbstractC1120d.f(uVar, "rasterizer cannot be null");
        this.f16007e = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i6, int i7, float f6, int i8, int i9, int i10, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i6, i7, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f16010h;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f16010h = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f6, i8, f6 + this.f16008f, i10, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        j.a().getClass();
        float f7 = i9;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        u uVar = this.f16007e;
        H h3 = uVar.f16004b;
        Typeface typeface = (Typeface) h3.f394g;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) h3.f392e, uVar.a * 2, 2, f6, f7, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f16006c;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f16007e;
        this.f16009g = abs / (uVar.b().a(14) != 0 ? ((ByteBuffer) r8.f10524g).getShort(r1 + r8.f10521c) : (short) 0);
        C2016a b5 = uVar.b();
        int a = b5.a(14);
        if (a != 0) {
            ((ByteBuffer) b5.f10524g).getShort(a + b5.f10521c);
        }
        short s5 = (short) ((uVar.b().a(12) != 0 ? ((ByteBuffer) r5.f10524g).getShort(r7 + r5.f10521c) : (short) 0) * this.f16009g);
        this.f16008f = s5;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s5;
    }
}
