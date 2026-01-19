package I0;

import T.InterfaceC0617l0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m4.AbstractC1277l;

/* renamed from: I0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201p extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0201p f2340f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0201p f2341g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0201p f2342h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0201p f2343i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2344e;

    static {
        int i6 = 1;
        f2340f = new C0201p(i6, 0);
        f2341g = new C0201p(i6, 1);
        f2342h = new C0201p(i6, 2);
        f2343i = new C0201p(i6, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0201p(int i6, int i7) {
        super(i6);
        this.f2344e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f2344e) {
            case 0:
                return Boolean.TRUE;
            case 1:
                P0.m k3 = ((P0.p) obj).k();
                return Boolean.valueOf(k3.f4492c.c(P0.t.f4507A));
            case 2:
                InterfaceC0617l0 interfaceC0617l0 = (InterfaceC0617l0) obj;
                T.B b5 = AndroidCompositionLocals_androidKt.a;
                interfaceC0617l0.getClass();
                T.r.B(interfaceC0617l0, b5);
                return ((Context) T.r.B(interfaceC0617l0, AndroidCompositionLocals_androidKt.f10780b)).getResources();
            default:
                return Boolean.valueOf(K.e(obj));
        }
    }
}
