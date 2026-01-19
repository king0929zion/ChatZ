package i2;

import X3.y;
import android.graphics.Bitmap;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.ArrayList;
import n2.k;
import s2.C1661i;
import t2.C1723g;
import x4.InterfaceC1942y;

/* renamed from: i2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1113g extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f12069h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1661i f12070i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1115i f12071j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1723g f12072k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1109c f12073l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12074m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1113g(C1661i c1661i, C1115i c1115i, C1723g c1723g, C1109c c1109c, Bitmap bitmap, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12070i = c1661i;
        this.f12071j = c1115i;
        this.f12072k = c1723g;
        this.f12073l = c1109c;
        this.f12074m = bitmap;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1113g) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1113g(this.f12070i, this.f12071j, this.f12072k, this.f12073l, this.f12074m, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f12069h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        ArrayList arrayList = this.f12071j.f12082h;
        boolean z5 = this.f12074m != null;
        C1661i c1661i = this.f12070i;
        k kVar = new k(c1661i, arrayList, 0, c1661i, this.f12072k, this.f12073l, z5);
        this.f12069h = 1;
        Object b5 = kVar.b(c1661i, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return b5 == enumC0927a ? enumC0927a : b5;
    }
}
