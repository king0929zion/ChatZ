package B0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class W extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f420h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X f421i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f421i = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((W) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new W(this.f421i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f420h;
        if (i6 == 0) {
            X3.a.e(obj);
            X x5 = this.f421i;
            PointerInputEventHandler pointerInputEventHandler = x5.f425t;
            this.f420h = 2;
            Object invoke = pointerInputEventHandler.invoke(x5, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (invoke == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1 && i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
