package a1;

import S0.C0549k;
import S0.C0554p;
import S0.P;
import S0.r;
import S0.w;
import S0.y;
import android.text.TextPaint;
import d1.l;
import java.util.ArrayList;
import o0.AbstractC1404o;
import o0.C1389K;
import o0.q;
import q0.AbstractC1499e;

/* loaded from: classes.dex */
public abstract class j {
    public static final k a = new k(false);

    public static final boolean a(P p5) {
        w wVar;
        y yVar = p5.f7614c;
        C0549k c0549k = (yVar == null || (wVar = yVar.f7676b) == null) ? null : new C0549k(wVar.f7675b);
        boolean z5 = false;
        if (c0549k != null && c0549k.a == 1) {
            z5 = true;
        }
        return !z5;
    }

    public static final void b(C0554p c0554p, q qVar, AbstractC1404o abstractC1404o, float f6, C1389K c1389k, l lVar, AbstractC1499e abstractC1499e) {
        ArrayList arrayList = c0554p.f7654h;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            r rVar = (r) arrayList.get(i6);
            rVar.a.g(qVar, abstractC1404o, f6, c1389k, lVar, abstractC1499e);
            qVar.n(S.l.f7374V, rVar.a.b());
        }
    }

    public static final void c(TextPaint textPaint, float f6) {
        if (Float.isNaN(f6)) {
            return;
        }
        if (f6 < S.l.f7374V) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f6 * 255));
    }
}
