package T0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import com.vladsch.flexmark.util.format.TableCell;
import o0.AbstractC1390a;

/* loaded from: classes.dex */
public final class i extends Canvas {
    public Canvas a;

    public final Canvas a() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas;
        }
        Y0.a.c("Text drawing wrapper is missing a Canvas!");
        throw new RuntimeException();
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        return a().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        return a().clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return a().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return a().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        AbstractC1390a.h(a());
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i6, int i7, int i8, int i9) {
        a().drawARGB(i6, i7, i8, i9);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f6, float f7, boolean z5, Paint paint) {
        a().drawArc(rectF, f6, f7, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f6, float f7, Paint paint) {
        a().drawBitmap(bitmap, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i6, int i7, float[] fArr, int i8, int[] iArr, int i9, Paint paint) {
        a().drawBitmapMesh(bitmap, i6, i7, fArr, i8, iArr, i9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f6, float f7, float f8, Paint paint) {
        a().drawCircle(f6, f7, f8, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i6) {
        a().drawColor(i6);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f6, float f7, RectF rectF2, float f8, float f9, Paint paint) {
        a().drawDoubleRoundRect(rectF, f6, f7, rectF2, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i6, float[] fArr, int i7, int i8, Font font, Paint paint) {
        a().drawGlyphs(iArr, i6, fArr, i7, i8, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f6, float f7, float f8, float f9, Paint paint) {
        a().drawLine(f6, f7, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i6, int i7, Paint paint) {
        a().drawLines(fArr, i6, i7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        a().drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f6, float f7, Paint paint) {
        a().drawPoint(f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i6, int i7, Paint paint) {
        a().drawPoints(fArr, i6, i7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i6, int i7, float[] fArr, Paint paint) {
        a().drawPosText(cArr, i6, i7, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i6, int i7, int i8) {
        a().drawRGB(i6, i7, i8);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        a().drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f6, float f7, Paint paint) {
        a().drawRoundRect(rectF, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i6, int i7, float f6, float f7, Paint paint) {
        a().drawText(cArr, i6, i7, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i6, int i7, Path path, float f6, float f7, Paint paint) {
        a().drawTextOnPath(cArr, i6, i7, path, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i6, int i7, int i8, int i9, float f6, float f7, boolean z5, Paint paint) {
        a().drawTextRun(cArr, i6, i7, i8, i9, f6, f7, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i6, float[] fArr, int i7, float[] fArr2, int i8, int[] iArr, int i9, short[] sArr, int i10, int i11, Paint paint) {
        a().drawVertices(vertexMode, i6, fArr, i7, fArr2, i8, iArr, i9, sArr, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        AbstractC1390a.e(a());
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), TableCell.NOT_TRACKED);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i6) {
        a().restoreToCount(i6);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f6) {
        a().rotate(f6);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i6) {
        return a().saveLayer(rectF, paint, i6);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i6, int i7) {
        return a().saveLayerAlpha(rectF, i6, i7);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f6, float f7) {
        a().scale(f6, f7);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i6) {
        a().setDensity(i6);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f6, float f7) {
        a().skew(f6, f7);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f6, float f7) {
        a().translate(f6, f7);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f6, float f7, float f8, float f9, float f10, float f11, boolean z5, Paint paint) {
        a().drawArc(f6, f7, f8, f9, f10, f11, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3) {
        a().drawColor(j3);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f6, float f7, float f8, float f9, Paint paint) {
        a().drawOval(f6, f7, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f6, float f7, float f8, float f9, float f10, float f11, Paint paint) {
        a().drawRoundRect(f6, f7, f8, f9, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f6, float f7, Paint paint) {
        a().drawText(str, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f6, float f7, Paint paint) {
        a().drawTextOnPath(str, path, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        boolean quickReject;
        quickReject = a().quickReject(rectF);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i6) {
        return a().saveLayerAlpha(rectF, i6);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        return a().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        a().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        a().drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f6, float f7, float f8, float f9, Paint paint) {
        a().drawRect(f6, f7, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i6, int i7, float f6, float f7, Paint paint) {
        a().drawText(str, i6, i7, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i6, int i7, int i8, int i9, float f6, float f7, boolean z5, Paint paint) {
        a().drawTextRun(charSequence, i6, i7, i8, i9, f6, f7, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f7, float f8, float f9, Paint paint, int i6) {
        return a().saveLayer(f6, f7, f8, f9, paint, i6);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f7, float f8, float f9, int i6, int i7) {
        return a().saveLayerAlpha(f6, f7, f8, f9, i6, i7);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i6, int i7, float f6, float f7, int i8, int i9, boolean z5, Paint paint) {
        a().drawBitmap(iArr, i6, i7, f6, f7, i8, i9, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i6, PorterDuff.Mode mode) {
        a().drawColor(i6, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i6, int i7, float f6, float f7, Paint paint) {
        a().drawText(charSequence, i6, i7, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f7, float f8, float f9, Paint paint) {
        return a().saveLayer(f6, f7, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f7, float f8, float f9, int i6) {
        return a().saveLayerAlpha(f6, f7, f8, f9, i6);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f6, float f7, float f8, float f9) {
        return a().clipOutRect(f6, f7, f8, f9);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f7, float f8, float f9, Region.Op op) {
        return a().clipRect(f6, f7, f8, f9, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i6, int i7, int i8, int i9, int i10, int i11, boolean z5, Paint paint) {
        a().drawBitmap(iArr, i6, i7, i8, i9, i10, i11, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i6, BlendMode blendMode) {
        a().drawColor(i6, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i6, int i7, int i8, int i9, float f6, float f7, boolean z5, Paint paint) {
        a().drawTextRun(measuredText, i6, i7, i8, i9, f6, f7, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        boolean quickReject;
        quickReject = a().quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f7, float f8, float f9) {
        return a().clipRect(f6, f7, f8, f9);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i6, int i7, int i8, int i9) {
        return a().clipOutRect(i6, i7, i8, i9);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i6, int i7, int i8, int i9) {
        return a().clipRect(i6, i7, i8, i9);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3, BlendMode blendMode) {
        a().drawColor(j3, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f7, float f8, float f9, Canvas.EdgeType edgeType) {
        return a().quickReject(f6, f7, f8, f9, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f7, float f8, float f9) {
        boolean quickReject;
        quickReject = a().quickReject(f6, f7, f8, f9);
        return quickReject;
    }
}
