package T0;

import B4.D;
import S.l;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;

/* loaded from: classes.dex */
public abstract class g {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i6, int i7, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i8, TextUtils.TruncateAt truncateAt, int i9, int i10, boolean z5, int i11, int i12, int i13, int i14) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i7 < 0) {
            Y0.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i7 < 0 || i7 > length) {
            Y0.a.a("invalid end value");
        }
        if (i8 < 0) {
            Y0.a.a("invalid maxLines value");
        }
        if (i6 < 0) {
            Y0.a.a("invalid width value");
        }
        if (i9 < 0) {
            Y0.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i7, textPaint, i6);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i8);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i9);
        obtain.setLineSpacing(l.f7374V, 1.0f);
        obtain.setIncludePad(z5);
        obtain.setBreakStrategy(i11);
        obtain.setHyphenationFrequency(i14);
        obtain.setIndents(null, null);
        int i15 = Build.VERSION.SDK_INT;
        obtain.setJustificationMode(i10);
        if (i15 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i15 >= 33) {
            lineBreakStyle = G2.b.c().setLineBreakStyle(i12);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i13);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i15 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i6, int i7) {
        int i8 = i6;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i8 - 1, i7, MetricAffectingSpan.class) != i7) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i8 < i7) {
                    int nextSpanTransition = spanned.nextSpanTransition(i8, i7, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i8, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i8, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i8, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i8 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i8, i7, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i8, i7, rect3);
        return rect3;
    }

    public static final float c(int i6, int i7, float[] fArr) {
        return fArr[((i6 - i7) * 2) + 1];
    }

    public static final int d(Layout layout, int i6, boolean z5) {
        if (i6 <= 0) {
            return 0;
        }
        if (i6 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i6);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i6 || lineEnd == i6) {
            if (lineStart == i6) {
                if (z5) {
                    return lineForOffset - 1;
                }
            } else if (!z5) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final int e(j jVar, Layout layout, E1.b bVar, int i6, RectF rectF, U0.c cVar, D d6, boolean z5) {
        d[] dVarArr;
        int i7;
        d[] dVarArr2;
        int i8;
        int f6;
        int i9;
        int i10;
        int d7;
        Bidi createLineBidi;
        boolean z6;
        float a;
        float a6;
        float f7;
        int lineTop = layout.getLineTop(i6);
        int lineBottom = layout.getLineBottom(i6);
        int lineStart = layout.getLineStart(i6);
        int lineEnd = layout.getLineEnd(i6);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i11 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i11];
        Layout layout2 = jVar.f8316f;
        int lineStart2 = layout2.getLineStart(i6);
        int f8 = jVar.f(i6);
        if (i11 < (f8 - lineStart2) * 2) {
            Y0.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        O0.i iVar = new O0.i(jVar);
        boolean z7 = false;
        boolean z8 = layout2.getParagraphDirection(i6) == 1;
        int i12 = 0;
        while (lineStart2 < f8) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z8 && !isRtlCharAt) {
                a = iVar.a(lineStart2, z7, z7, true);
                f7 = iVar.a(lineStart2 + 1, true, true, true);
                z6 = z8;
            } else if (z8 && isRtlCharAt) {
                z6 = z8;
                f7 = iVar.a(lineStart2, false, false, false);
                a = iVar.a(lineStart2 + 1, true, true, false);
            } else {
                z6 = z8;
                if (isRtlCharAt) {
                    a6 = iVar.a(lineStart2, false, false, true);
                    a = iVar.a(lineStart2 + 1, true, true, true);
                } else {
                    a = iVar.a(lineStart2, false, false, false);
                    a6 = iVar.a(lineStart2 + 1, true, true, false);
                }
                f7 = a6;
            }
            fArr[i12] = a;
            fArr[i12 + 1] = f7;
            i12 += 2;
            lineStart2++;
            z8 = z6;
            z7 = false;
        }
        Layout layout3 = (Layout) bVar.a;
        int lineStart3 = layout3.getLineStart(i6);
        int lineEnd2 = layout3.getLineEnd(i6);
        int n3 = bVar.n(lineStart3, false);
        int o5 = bVar.o(n3);
        int i13 = lineStart3 - o5;
        int i14 = lineEnd2 - o5;
        Bidi g3 = bVar.g(n3);
        if (g3 == null || (createLineBidi = g3.createLineBidi(i13, i14)) == null) {
            dVarArr = new d[]{new d(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            dVarArr = new d[runCount];
            int i15 = 0;
            while (i15 < runCount) {
                int i16 = runCount;
                dVarArr[i15] = new d(createLineBidi.getRunStart(i15) + lineStart3, createLineBidi.getRunLimit(i15) + lineStart3, createLineBidi.getRunLevel(i15) % 2 == 1);
                i15++;
                runCount = i16;
            }
        }
        r4.e eVar = z5 ? new r4.e(0, dVarArr.length - 1, 1) : new r4.e(dVarArr.length - 1, 0, -1);
        int i17 = eVar.f14679c;
        int i18 = eVar.f14680e;
        int i19 = eVar.f14681f;
        if ((i19 <= 0 || i17 > i18) && (i19 >= 0 || i18 > i17)) {
            return -1;
        }
        while (true) {
            d dVar = dVarArr[i17];
            boolean z9 = dVar.f8303c;
            int i20 = dVar.a;
            int i21 = dVar.f8302b;
            float f9 = z9 ? fArr[((i21 - 1) - lineStart) * 2] : fArr[(i20 - lineStart) * 2];
            float c6 = z9 ? c(i20, lineStart, fArr) : c(i21 - 1, lineStart, fArr);
            if (z5) {
                float f10 = rectF.left;
                if (c6 >= f10) {
                    i7 = i19;
                    float f11 = rectF.right;
                    if (f9 <= f11) {
                        if ((z9 || f10 > f9) && (!z9 || f11 < c6)) {
                            int i22 = i21;
                            int i23 = i20;
                            while (true) {
                                i9 = i22;
                                if (i22 - i23 <= 1) {
                                    break;
                                }
                                int i24 = (i9 + i23) / 2;
                                float f12 = fArr[(i24 - lineStart) * 2];
                                if ((z9 || f12 <= rectF.left) && (!z9 || f12 >= rectF.right)) {
                                    i22 = i9;
                                    i23 = i24;
                                } else {
                                    i22 = i24;
                                }
                            }
                            i10 = z9 ? i9 : i23;
                        } else {
                            i10 = i20;
                        }
                        int f13 = cVar.f(i10);
                        if (f13 != -1 && (d7 = cVar.d(f13)) < i21) {
                            if (d7 >= i20) {
                                i20 = d7;
                            }
                            if (f13 > i21) {
                                f13 = i21;
                            }
                            dVarArr2 = dVarArr;
                            RectF rectF2 = new RectF(l.f7374V, lineTop, l.f7374V, lineBottom);
                            int i25 = f13;
                            while (true) {
                                rectF2.left = z9 ? fArr[((i25 - 1) - lineStart) * 2] : fArr[(i20 - lineStart) * 2];
                                rectF2.right = z9 ? c(i20, lineStart, fArr) : c(i25 - 1, lineStart, fArr);
                                if (!((Boolean) d6.m(rectF2, rectF)).booleanValue()) {
                                    i20 = cVar.a(i20);
                                    if (i20 == -1 || i20 >= i21) {
                                        break;
                                    }
                                    i25 = cVar.f(i20);
                                    if (i25 > i21) {
                                        i25 = i21;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i20 = -1;
                        }
                    }
                } else {
                    i7 = i19;
                }
                dVarArr2 = dVarArr;
                i20 = -1;
            } else {
                i7 = i19;
                dVarArr2 = dVarArr;
                float f14 = rectF.left;
                if (c6 >= f14) {
                    float f15 = rectF.right;
                    if (f9 <= f15) {
                        if ((z9 || f15 < c6) && (!z9 || f14 > f9)) {
                            int i26 = i21;
                            int i27 = i20;
                            while (i26 - i27 > 1) {
                                int i28 = (i26 + i27) / 2;
                                float f16 = fArr[(i28 - lineStart) * 2];
                                int i29 = i26;
                                if ((z9 || f16 <= rectF.right) && (!z9 || f16 >= rectF.left)) {
                                    i26 = i29;
                                    i27 = i28;
                                } else {
                                    i26 = i28;
                                }
                            }
                            i8 = z9 ? i26 : i27;
                        } else {
                            i8 = i21 - 1;
                        }
                        int d8 = cVar.d(i8 + 1);
                        if (d8 != -1 && (f6 = cVar.f(d8)) > i20) {
                            if (d8 < i20) {
                                d8 = i20;
                            }
                            if (f6 <= i21) {
                                i21 = f6;
                            }
                            RectF rectF3 = new RectF(l.f7374V, lineTop, l.f7374V, lineBottom);
                            int i30 = d8;
                            while (true) {
                                rectF3.left = z9 ? fArr[((i21 - 1) - lineStart) * 2] : fArr[(i30 - lineStart) * 2];
                                rectF3.right = z9 ? c(i30, lineStart, fArr) : c(i21 - 1, lineStart, fArr);
                                if (!((Boolean) d6.m(rectF3, rectF)).booleanValue()) {
                                    i21 = cVar.b(i21);
                                    if (i21 == -1 || i21 <= i20) {
                                        break;
                                    }
                                    i30 = cVar.d(i21);
                                    if (i30 < i20) {
                                        i30 = i20;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i21 = -1;
                i20 = i21;
            }
            if (i20 >= 0) {
                return i20;
            }
            if (i17 == i18) {
                return -1;
            }
            i17 += i7;
            i19 = i7;
            dVarArr = dVarArr2;
        }
    }

    public static final boolean f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
