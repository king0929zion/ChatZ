package i0;

import X3.y;
import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import f0.C0987j;
import m4.AbstractC1277l;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062a extends AbstractC1277l implements l4.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1064c f11936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1062a(C1064c c1064c, int i6) {
        super(4);
        this.f11936e = c1064c;
        this.f11937f = i6;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        C1064c c1064c = this.f11936e;
        C0987j c0987j = c1064c.f11940c;
        ((AutofillManager) c0987j.f11690e).notifyViewEntered(c1064c.f11942f, this.f11937f, new Rect(intValue, intValue2, intValue3, intValue4));
        return y.a;
    }
}
