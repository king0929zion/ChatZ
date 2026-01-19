package h1;

import H0.J;
import X3.y;
import androidx.lifecycle.InterfaceC0846u;
import e1.InterfaceC0961c;
import h0.InterfaceC1041r;
import m4.AbstractC1277l;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class l extends AbstractC1277l implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public static final l f11877f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f11878g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f11879h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f11880i;

    /* renamed from: j, reason: collision with root package name */
    public static final l f11881j;

    /* renamed from: k, reason: collision with root package name */
    public static final l f11882k;

    /* renamed from: l, reason: collision with root package name */
    public static final l f11883l;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11884e;

    static {
        int i6 = 2;
        f11877f = new l(i6, 0);
        f11878g = new l(i6, 1);
        f11879h = new l(i6, 2);
        f11880i = new l(i6, 3);
        f11881j = new l(i6, 4);
        f11882k = new l(i6, 5);
        f11883l = new l(i6, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i6, int i7) {
        super(i6);
        this.f11884e = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6;
        switch (this.f11884e) {
            case 0:
                k.e((J) obj).setUpdateBlock((l4.c) obj2);
                return y.a;
            case 1:
                k.e((J) obj).setReleaseBlock((l4.c) obj2);
                return y.a;
            case 2:
                k.e((J) obj).setModifier((InterfaceC1041r) obj2);
                return y.a;
            case 3:
                k.e((J) obj).setDensity((InterfaceC0961c) obj2);
                return y.a;
            case 4:
                k.e((J) obj).setLifecycleOwner((InterfaceC0846u) obj2);
                return y.a;
            case AbstractC1787b.f15290g /* 5 */:
                k.e((J) obj).setSavedStateRegistryOwner((U1.e) obj2);
                return y.a;
            default:
                x e6 = k.e((J) obj);
                int ordinal = ((e1.m) obj2).ordinal();
                if (ordinal != 0) {
                    i6 = 1;
                    if (ordinal != 1) {
                        throw new RuntimeException();
                    }
                } else {
                    i6 = 0;
                }
                e6.setLayoutDirection(i6);
                return y.a;
        }
    }
}
