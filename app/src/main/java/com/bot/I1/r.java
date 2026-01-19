package I1;

import android.os.Bundle;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2565c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f2566e;

    public /* synthetic */ r(Bundle bundle, int i6) {
        this.f2565c = i6;
        this.f2566e = bundle;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        boolean containsKey;
        String str = (String) obj;
        switch (this.f2565c) {
            case 0:
                AbstractC1276k.f(str, "argName");
                Bundle bundle = this.f2566e;
                AbstractC1276k.f(bundle, "source");
                containsKey = bundle.containsKey(str);
                break;
            default:
                AbstractC1276k.f(str, "key");
                Bundle bundle2 = this.f2566e;
                AbstractC1276k.f(bundle2, "source");
                containsKey = bundle2.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
