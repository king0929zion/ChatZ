package t1;

import I0.AbstractC0221z0;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends WindowInsetsAnimation$Callback {
    public final O4.d a;

    /* renamed from: b, reason: collision with root package name */
    public List f14893b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f14894c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f14895d;

    public w(O4.d dVar) {
        super(dVar.f4332c);
        this.f14895d = new HashMap();
        this.a = dVar;
    }

    public final z a(WindowInsetsAnimation windowInsetsAnimation) {
        z zVar = (z) this.f14895d.get(windowInsetsAnimation);
        if (zVar == null) {
            zVar = new z(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                zVar.a = new x(windowInsetsAnimation);
            }
            this.f14895d.put(windowInsetsAnimation, zVar);
        }
        return zVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.f14895d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.c();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f14894c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f14894c = arrayList2;
            this.f14893b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j3 = AbstractC0221z0.j(list.get(size));
            z a = a(j3);
            fraction = j3.getFraction();
            a.a.e(fraction);
            this.f14894c.add(a);
        }
        return this.a.d(P.c(null, windowInsets), this.f14893b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        e0.k e6 = this.a.e(a(windowInsetsAnimation), new e0.k(bounds));
        e6.getClass();
        AbstractC0221z0.l();
        return AbstractC0221z0.h(((o1.c) e6.f11564e).d(), ((o1.c) e6.f11565f).d());
    }
}
