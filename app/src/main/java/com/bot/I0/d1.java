package I0;

import T.C0642y0;
import android.view.View;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.tencent.mmkv.R;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class d1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2295h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0642y0 f2296i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f2297j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(C0642y0 c0642y0, View view, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2296i = c0642y0;
        this.f2297j = view;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((d1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new d1(this.f2296i, this.f2297j, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [d4.i, l4.e] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f2295h;
        X3.y yVar = X3.y.a;
        C0642y0 c0642y0 = this.f2296i;
        View view = this.f2297j;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                this.f2295h = 1;
                Object j3 = A4.W.j(c0642y0.f8290u, new d4.i(2, null), this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (j3 != enumC0927a) {
                    j3 = yVar;
                }
                if (j3 == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X3.a.e(obj);
            }
            if (m1.b(view) == c0642y0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return yVar;
        } finally {
            if (m1.b(view) == c0642y0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
