package I1;

import android.app.Activity;
import android.content.Context;
import j1.AbstractC1135a;
import java.util.Iterator;
import m4.AbstractC1276k;

@G("activity")
/* renamed from: I1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0223b extends H {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f2538c;

    public C0223b(Context context) {
        Object obj;
        AbstractC1276k.f(context, "context");
        Iterator it = t4.j.q(context, new A2.a(23)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f2538c = (Activity) obj;
    }

    @Override // I1.H
    public final v a() {
        return new v(this);
    }

    @Override // I1.H
    public final v c(v vVar) {
        throw new IllegalStateException(AbstractC1135a.i(new StringBuilder("Destination "), ((C0222a) vVar).f2592e.a, " does not have an Intent set.").toString());
    }

    @Override // I1.H
    public final boolean f() {
        Activity activity = this.f2538c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
