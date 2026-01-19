package D;

import I0.C0211u0;
import N1.C0290l;
import O.C0332s0;
import Q.ViewOnAttachStateChangeListenerC0462s0;
import Q.s3;
import android.speech.tts.TextToSpeech;
import android.view.ActionMode;
import android.view.View;
import b.InterfaceC0859c;
import c.C0913a;
import c.C0914b;
import f0.C1001x;
import i1.C1105y;
import i1.DialogC1103w;
import java.util.Iterator;
import v.AbstractC1787b;
import x4.C1928k;
import y.C1955L;

/* loaded from: classes.dex */
public final class Y implements T.G {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f964b;

    public /* synthetic */ Y(Object obj, int i6) {
        this.a = i6;
        this.f964b = obj;
    }

    @Override // T.G
    public final void dispose() {
        X3.y yVar;
        switch (this.a) {
            case 0:
                ((O.N0) this.f964b).o();
                return;
            case 1:
                I.i iVar = (I.i) this.f964b;
                C1001x c1001x = iVar.f2089e;
                C0914b c0914b = c1001x.f11744h;
                if (c0914b != null) {
                    c0914b.b();
                }
                c1001x.a();
                ActionMode actionMode = iVar.f2092h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                iVar.f2092h = null;
                return;
            case 2:
                ((C0211u0) this.f964b).f2390e.b();
                return;
            case 3:
                K.b bVar = (K.b) ((K.c) this.f964b).f2914c.getValue();
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            case 4:
                C0332s0 c0332s0 = (C0332s0) this.f964b;
                c0332s0.i();
                c0332s0.f4198i.setValue(Boolean.FALSE);
                return;
            case AbstractC1787b.f15290g /* 5 */:
                P2.P0 p02 = (P2.P0) this.f964b;
                TextToSpeech textToSpeech = p02.a;
                if (textToSpeech != null) {
                    textToSpeech.stop();
                }
                TextToSpeech textToSpeech2 = p02.a;
                if (textToSpeech2 != null) {
                    textToSpeech2.shutdown();
                }
                p02.a = null;
                return;
            case 6:
                ViewOnAttachStateChangeListenerC0462s0 viewOnAttachStateChangeListenerC0462s0 = (ViewOnAttachStateChangeListenerC0462s0) this.f964b;
                View view = viewOnAttachStateChangeListenerC0462s0.f6094e;
                if (viewOnAttachStateChangeListenerC0462s0.f6093c) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(viewOnAttachStateChangeListenerC0462s0);
                    viewOnAttachStateChangeListenerC0462s0.f6093c = false;
                }
                view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0462s0);
                return;
            case 7:
                Q.T0 t02 = (Q.T0) this.f964b;
                t02.dismiss();
                t02.f5522k.e();
                return;
            case 8:
                C1928k c1928k = ((s3) this.f964b).f6104c;
                if (c1928k != null) {
                    c1928k.w(null);
                    return;
                }
                return;
            case AbstractC1787b.f15287d /* 9 */:
                e.h hVar = ((C0913a) this.f964b).a;
                if (hVar != null) {
                    hVar.f11531f.d(hVar.f11532g);
                    yVar = X3.y.a;
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            case AbstractC1787b.f15289f /* 10 */:
                Iterator it = ((c.h) this.f964b).f10956b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0859c) it.next()).cancel();
                }
                return;
            case 11:
                Iterator it2 = ((c.n) this.f964b).f10956b.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC0859c) it2.next()).cancel();
                }
                return;
            case 12:
                DialogC1103w dialogC1103w = (DialogC1103w) this.f964b;
                dialogC1103w.dismiss();
                dialogC1103w.f12024j.e();
                return;
            case 13:
                C1105y c1105y = (C1105y) this.f964b;
                c1105y.e();
                c1105y.getClass();
                androidx.lifecycle.O.k(c1105y, null);
                c1105y.f12042r.removeViewImmediate(c1105y);
                return;
            case 14:
                ((C1955L) this.f964b).f15795d = null;
                return;
            case 15:
                y.b0 b0Var = (y.b0) this.f964b;
                C0290l c0290l = b0Var.f15838c;
                if (c0290l != null) {
                    c0290l.a = false;
                }
                b0Var.f15838c = null;
                return;
            default:
                ((y.X) this.f964b).f15823f = true;
                return;
        }
    }
}
