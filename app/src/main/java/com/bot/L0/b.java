package L0;

import B0.AbstractC0037m;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes.dex */
public final class b {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2988b;

    public b(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.f2988b = view;
    }

    public final AutofillId a(long j3) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.b(AbstractC0037m.f(this.a), this.f2988b.getAutofillId(), j3);
        }
        return null;
    }
}
