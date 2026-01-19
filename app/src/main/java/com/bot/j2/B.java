package j2;

import T.C0616l;
import T.C0626q;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.AbstractC0960b;
import s2.C1660h;
import s2.C1661i;
import t2.C1721e;
import t2.C1723g;

/* loaded from: classes.dex */
public abstract class B {
    public static final long a = AbstractC0960b.h(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final C1721e f12363b;

    /* JADX WARN: Type inference failed for: r0v3, types: [t2.e, java.lang.Object] */
    static {
        C1723g c1723g = C1723g.f14909c;
        f12363b = new Object();
    }

    public static final C1661i a(Object obj, C0626q c0626q) {
        c0626q.c0(1087186730);
        if (obj instanceof C1661i) {
            C1661i c1661i = (C1661i) obj;
            c0626q.p(false);
            return c1661i;
        }
        Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
        c0626q.c0(-1245195153);
        boolean f6 = c0626q.f(context) | c0626q.f(obj);
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            C1660h c1660h = new C1660h(context);
            c1660h.f14751c = obj;
            P5 = c1660h.a();
            c0626q.m0(P5);
        }
        C1661i c1661i2 = (C1661i) P5;
        c0626q.p(false);
        c0626q.p(false);
        return c1661i2;
    }
}
