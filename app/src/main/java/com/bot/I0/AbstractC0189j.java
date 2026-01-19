package I0;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* renamed from: I0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0189j {
    public static /* bridge */ /* synthetic */ Shader.TileMode d() {
        return Shader.TileMode.DECAL;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession e(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget f(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC0216x, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder k(AutofillId autofillId, long j3) {
        return new ViewTranslationRequest.Builder(autofillId, j3);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse m(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void o() {
    }
}
