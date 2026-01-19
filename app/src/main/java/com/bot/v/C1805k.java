package v;

import e1.C0959a;
import f0.C0990m;
import java.util.List;

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1805k implements F0.V {

    /* renamed from: b, reason: collision with root package name */
    public static final C1805k f15316b = new C1805k(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1805k f15317c = new C1805k(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C1805k(int i6) {
        this.a = i6;
    }

    @Override // F0.V
    public final F0.W e(F0.X x5, List list, long j3) {
        switch (this.a) {
            case 0:
                return x5.D(C0959a.j(j3), C0959a.i(j3), Y3.w.f9813c, new C0990m(26));
            default:
                return x5.D(C0959a.f(j3) ? C0959a.h(j3) : 0, C0959a.e(j3) ? C0959a.g(j3) : 0, Y3.w.f9813c, new C0990m(26));
        }
    }
}
