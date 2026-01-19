package b;

import android.content.res.Resources;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* renamed from: b.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855D extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0855D f10905f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0855D f10906g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10907e;

    static {
        int i6 = 1;
        f10905f = new C0855D(i6, 0);
        f10906g = new C0855D(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0855D(int i6, int i7) {
        super(i6);
        this.f10907e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f10907e) {
            case 0:
                AbstractC1276k.f((Resources) obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
            default:
                AbstractC1276k.f((Resources) obj, "<anonymous parameter 0>");
                return Boolean.FALSE;
        }
    }
}
