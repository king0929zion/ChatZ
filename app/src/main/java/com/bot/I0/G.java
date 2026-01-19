package I0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import k.AbstractC1167n;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class G implements ViewTranslationCallback {
    public static final G a = new Object();

    public final boolean onClearTranslation(View view) {
        InterfaceC1193a interfaceC1193a;
        AbstractC1276k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        j0.d contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f12328i = j0.a.f12315c;
        AbstractC1167n e6 = contentCaptureManager$ui.e();
        Object[] objArr = e6.f12559c;
        long[] jArr = e6.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j3) < 128) {
                        k.M m3 = ((P0.q) objArr[(i6 << 3) + i8]).a.f4499d.f4492c;
                        Object g3 = m3.g(P0.t.f4510D);
                        if (g3 == null) {
                            g3 = null;
                        }
                        if (g3 != null) {
                            Object g6 = m3.g(P0.l.f4479n);
                            P0.a aVar = (P0.a) (g6 != null ? g6 : null);
                            if (aVar != null && (interfaceC1193a = (InterfaceC1193a) aVar.f4430b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }

    public final boolean onHideTranslation(View view) {
        l4.c cVar;
        AbstractC1276k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        j0.d contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f12328i = j0.a.f12315c;
        AbstractC1167n e6 = contentCaptureManager$ui.e();
        Object[] objArr = e6.f12559c;
        long[] jArr = e6.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j3) < 128) {
                        k.M m3 = ((P0.q) objArr[(i6 << 3) + i8]).a.f4499d.f4492c;
                        Object g3 = m3.g(P0.t.f4510D);
                        if (g3 == null) {
                            g3 = null;
                        }
                        if (AbstractC1276k.b(g3, Boolean.TRUE)) {
                            Object g6 = m3.g(P0.l.f4478m);
                            P0.a aVar = (P0.a) (g6 != null ? g6 : null);
                            if (aVar != null && (cVar = (l4.c) aVar.f4430b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }

    public final boolean onShowTranslation(View view) {
        l4.c cVar;
        AbstractC1276k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        j0.d contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f12328i = j0.a.f12316e;
        AbstractC1167n e6 = contentCaptureManager$ui.e();
        Object[] objArr = e6.f12559c;
        long[] jArr = e6.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j3) < 128) {
                        k.M m3 = ((P0.q) objArr[(i6 << 3) + i8]).a.f4499d.f4492c;
                        Object g3 = m3.g(P0.t.f4510D);
                        if (g3 == null) {
                            g3 = null;
                        }
                        if (AbstractC1276k.b(g3, Boolean.FALSE)) {
                            Object g6 = m3.g(P0.l.f4478m);
                            P0.a aVar = (P0.a) (g6 != null ? g6 : null);
                            if (aVar != null && (cVar = (l4.c) aVar.f4430b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
