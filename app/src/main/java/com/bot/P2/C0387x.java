package P2;

import Q.L2;
import android.content.Context;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.tencent.mmkv.R;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* renamed from: P2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387x extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5097h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L2 f5098i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f5099j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0387x(L2 l22, Context context, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5098i = l22;
        this.f5099j = context;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0387x) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0387x(this.f5098i, this.f5099j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5097h;
        if (i6 == 0) {
            X3.a.e(obj);
            String string = this.f5099j.getString(R.string.error_file_too_large);
            AbstractC1276k.e(string, "getString(...)");
            this.f5097h = 1;
            Object b5 = L2.b(this.f5098i, string, this, 14);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
