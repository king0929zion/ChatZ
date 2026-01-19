package O0;

import B0.G;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import M.o;
import P0.p;
import S.l;
import T.C0607g0;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import o0.y;
import x4.AbstractC1888A;
import x4.o0;
import x4.s0;

/* loaded from: classes.dex */
public final class f implements ScrollCaptureCallback {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.k f4296b;

    /* renamed from: c, reason: collision with root package name */
    public final A3.c f4297c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x f4298d;

    /* renamed from: e, reason: collision with root package name */
    public final C4.c f4299e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4300f;

    public f(p pVar, e1.k kVar, C4.c cVar, A3.c cVar2, ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x) {
        this.a = pVar;
        this.f4296b = kVar;
        this.f4297c = cVar2;
        this.f4298d = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f4299e = new C4.c(cVar.f686c.Y(g.f4301c));
        this.f4300f = new i(kVar.b(), new e(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        if (r10 == r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(O0.f r12, android.view.ScrollCaptureSession r13, e1.k r14, d4.c r15) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.f.a(O0.f, android.view.ScrollCaptureSession, e1.k, d4.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC1888A.y(this.f4299e, o0.f15720e, new a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        s0 y5 = AbstractC1888A.y(this.f4299e, null, new b(this, scrollCaptureSession, rect, consumer, null), 3);
        y5.S(new G(cancellationSignal, 13));
        cancellationSignal.setOnCancelListener(new o(y5, 1));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(y.y(this.f4296b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f4300f.f4305b = l.f7374V;
        ((C0607g0) this.f4297c.f119e).setValue(Boolean.TRUE);
        runnable.run();
    }
}
