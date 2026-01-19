package F3;

import I3.s;
import I3.v;
import I3.w;
import io.ktor.utils.io.y;
import u3.C1759c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public abstract class c implements s, InterfaceC1942y {
    public abstract C1759c b();

    public abstract y d();

    public abstract P3.b e();

    public abstract P3.b f();

    public abstract w g();

    public abstract v h();

    public final String toString() {
        return "HttpResponse[" + b().d().getUrl() + ", " + g() + ']';
    }
}
