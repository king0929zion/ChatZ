package Z2;

import a3.C0810H;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class M0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10038c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10040f;

    public /* synthetic */ M0(int i6, int i7, Object obj) {
        this.f10038c = i7;
        this.f10039e = i6;
        this.f10040f = obj;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f10038c) {
            case 0:
                T.d1 d1Var = (T.d1) this.f10040f;
                String str = (String) obj;
                AbstractC1276k.f(str, "providerId");
                Iterator it = ((List) d1Var.getValue()).iterator();
                int i6 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i6 = -1;
                    } else if (!AbstractC1276k.b(((C0810H) it.next()).a.a, str)) {
                        i6++;
                    }
                }
                return Integer.valueOf(i6 != -1 ? i6 + this.f10039e : -1);
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f10039e, (Collection) this.f10040f));
        }
    }
}
