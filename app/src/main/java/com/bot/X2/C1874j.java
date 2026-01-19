package x2;

import T.C0616l;
import T.C0626q;
import T.X;
import T.r;
import X3.y;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import com.bot.MainActivity;

/* renamed from: x2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1874j implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15597c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15598e;

    public /* synthetic */ C1874j(MainActivity mainActivity, int i6) {
        this.f15597c = i6;
        this.f15598e = mainActivity;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f15597c;
        y yVar = y.a;
        MainActivity mainActivity = this.f15598e;
        int i7 = 1;
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i6) {
            case 0:
                int i8 = MainActivity.f11132D;
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    d3.d.a(mainActivity.m(), AbstractC0874g.c(649379213, new C1874j(mainActivity, i7), c0626q), c0626q, 392);
                } else {
                    c0626q.V();
                }
                return yVar;
            default:
                int i9 = MainActivity.f11132D;
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    X r5 = Y4.d.r(mainActivity.m().f1655d, c0626q);
                    boolean z5 = (((Configuration) c0626q.j(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
                    G2.e eVar = (G2.e) r5.getValue();
                    Boolean valueOf = Boolean.valueOf(z5);
                    boolean h3 = c0626q.h(mainActivity);
                    Object P5 = c0626q.P();
                    if (h3 || P5 == C0616l.a) {
                        P5 = new C1875k(mainActivity, null);
                        c0626q.m0(P5);
                    }
                    r.h(eVar, valueOf, (l4.e) P5, c0626q);
                    s4.j.c(null, mainActivity.m(), c0626q, 64);
                } else {
                    c0626q.V();
                }
                return yVar;
        }
    }
}
