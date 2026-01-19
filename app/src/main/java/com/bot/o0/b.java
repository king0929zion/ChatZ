package O0;

import X3.y;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.function.Consumer;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class b extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f4278i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f4279j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Rect f4280k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Consumer f4281l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4278i = fVar;
        this.f4279j = scrollCaptureSession;
        this.f4280k = rect;
        this.f4281l = consumer;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((b) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new b(this.f4278i, this.f4279j, this.f4280k, this.f4281l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4277h;
        if (i6 == 0) {
            X3.a.e(obj);
            ScrollCaptureSession scrollCaptureSession = this.f4279j;
            Rect rect = this.f4280k;
            e1.k kVar = new e1.k(rect.left, rect.top, rect.right, rect.bottom);
            this.f4277h = 1;
            obj = f.a(this.f4278i, scrollCaptureSession, kVar, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        this.f4281l.accept(o0.y.y((e1.k) obj));
        return y.a;
    }
}
