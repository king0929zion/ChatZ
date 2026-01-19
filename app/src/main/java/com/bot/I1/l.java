package I1;

import android.content.Context;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.Iterator;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2551c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f2552e;

    public /* synthetic */ l(B b5, int i6) {
        this.f2551c = i6;
        this.f2552e = b5;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m4.i, l4.a] */
    @Override // l4.InterfaceC1193a
    public final Object b() {
        int i6;
        switch (this.f2551c) {
            case 0:
                B b5 = this.f2552e;
                n nVar = b5.f2522f;
                boolean z5 = false;
                if (b5.f2523g) {
                    Y3.j jVar = b5.f2518b.f3019f;
                    if (jVar == null || !jVar.isEmpty()) {
                        Iterator it = jVar.iterator();
                        i6 = 0;
                        while (it.hasNext()) {
                            if (!(((j) it.next()).f2544e instanceof x) && (i6 = i6 + 1) < 0) {
                                Y4.l.T();
                                throw null;
                            }
                        }
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 1) {
                        z5 = true;
                    }
                }
                nVar.a = z5;
                Object r02 = nVar.f10957c;
                if (r02 != 0) {
                    r02.b();
                }
                return X3.y.a;
            case 1:
                B b6 = this.f2552e;
                Context context = b6.a;
                I i7 = b6.f2518b.f3032s;
                AbstractC1276k.f(context, "context");
                AbstractC1276k.f(i7, "navigatorProvider");
                return new Object();
            case 2:
                this.f2552e.c();
                return X3.y.a;
            case 3:
                this.f2552e.c();
                return X3.y.a;
            case 4:
                B.b(this.f2552e, "model-config");
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                B.b(this.f2552e, "model-services");
                return X3.y.a;
            case 6:
                B.b(this.f2552e, "search-services");
                return X3.y.a;
            case 7:
                B.b(this.f2552e, "mcp");
                return X3.y.a;
            case 8:
                B.b(this.f2552e, "about");
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                this.f2552e.c();
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                this.f2552e.c();
                return X3.y.a;
            case 11:
                this.f2552e.c();
                return X3.y.a;
            case 12:
                B.b(this.f2552e, "mcp/add");
                return X3.y.a;
            case 13:
                this.f2552e.c();
                return X3.y.a;
            case 14:
                B.b(this.f2552e, "setting");
                return X3.y.a;
            case 15:
                B.b(this.f2552e, "model-services");
                return X3.y.a;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                this.f2552e.c();
                return X3.y.a;
            case 17:
                this.f2552e.c();
                return X3.y.a;
            case 18:
                B.b(this.f2552e, "model-services/new");
                return X3.y.a;
            case 19:
                B.b(this.f2552e, "model-services/search");
                return X3.y.a;
            case 20:
                this.f2552e.c();
                return X3.y.a;
            case 21:
                this.f2552e.c();
                return X3.y.a;
            case 22:
                this.f2552e.c();
                return X3.y.a;
            case 23:
                this.f2552e.c();
                return X3.y.a;
            default:
                this.f2552e.c();
                return X3.y.a;
        }
    }
}
