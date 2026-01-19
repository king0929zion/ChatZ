package I0;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.tencent.mmkv.R;
import java.util.Iterator;
import m4.AbstractC1276k;
import o0.C1394e;
import t1.C1714q;

/* loaded from: classes.dex */
public final class V0 implements View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2250c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2251e;

    public /* synthetic */ V0(Object obj, int i6) {
        this.f2250c = i6;
        this.f2251e = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f2250c) {
            case 0:
            case 1:
                return;
            default:
                C1394e c1394e = (C1394e) this.f2251e;
                Context context = view.getContext();
                if (c1394e.f13462d) {
                    return;
                }
                context.getApplicationContext().registerComponentCallbacks(c1394e.f13463e);
                c1394e.f13462d = true;
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z5;
        switch (this.f2250c) {
            case 0:
                AbstractC0171a abstractC0171a = (AbstractC0171a) this.f2251e;
                Iterator it = t4.j.q(abstractC0171a.getParent(), C1714q.f14878l).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            AbstractC1276k.f(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z5 = true;
                            }
                        }
                    }
                }
                if (z5) {
                    return;
                }
                abstractC0171a.e();
                return;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                ((x4.s0) this.f2251e).f(null);
                return;
            default:
                C1394e c1394e = (C1394e) this.f2251e;
                Context context = view.getContext();
                if (c1394e.f13462d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c1394e.f13463e);
                    c1394e.f13462d = false;
                    return;
                }
                return;
        }
    }
}
