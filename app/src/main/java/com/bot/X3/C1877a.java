package x3;

import Q4.s;
import Q4.t;
import X3.y;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877a extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1877a f15600f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1877a f15601g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15602e;

    static {
        int i6 = 1;
        f15600f = new C1877a(i6, 0);
        f15601g = new C1877a(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1877a(int i6, int i7) {
        super(i6);
        this.f15602e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f15602e) {
            case 0:
                s sVar = (s) obj;
                AbstractC1276k.f(sVar, "$this$null");
                sVar.f6581h = false;
                sVar.f6582i = false;
                sVar.f6579f = true;
                return y.a;
            default:
                AbstractC1276k.f((t) obj, "it");
                return y.a;
        }
    }
}
