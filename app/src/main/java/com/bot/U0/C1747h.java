package u0;

import android.graphics.PathMeasure;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;
import o0.C1398i;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1747h extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1747h f15059f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1747h f15060g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15061e;

    static {
        int i6 = 0;
        f15059f = new C1747h(i6, 0);
        f15060g = new C1747h(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1747h(int i6, int i7) {
        super(i6);
        this.f15061e = i7;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f15061e) {
            case 0:
                return new C1398i(new PathMeasure());
            default:
                return X3.y.a;
        }
    }
}
