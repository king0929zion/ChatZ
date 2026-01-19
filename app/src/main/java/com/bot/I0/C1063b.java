package i0;

import H0.J;
import X3.y;
import android.view.autofill.AutofillManager;
import f0.C0987j;
import m4.AbstractC1277l;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063b extends AbstractC1277l implements l4.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1064c f11938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J f11939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063b(C1064c c1064c, J j3) {
        super(4);
        this.f11938e = c1064c;
        this.f11939f = j3;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        C1064c c1064c = this.f11938e;
        c1064c.f11945i.set(intValue, intValue2, intValue3, intValue4);
        C0987j c0987j = c1064c.f11940c;
        ((AutofillManager) c0987j.f11690e).requestAutofill(c1064c.f11942f, this.f11939f.f1734e, c1064c.f11945i);
        return y.a;
    }
}
