package P2;

import android.graphics.Bitmap;
import b4.InterfaceC0905c;
import o0.C1395f;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class T0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T.X f4794h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T.X f4795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4794h = x5;
        this.f4795i = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        T0 t02 = (T0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        t02.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new T0(this.f4794h, this.f4795i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        C1395f c1395f = ((W) this.f4794h.getValue()).a;
        X3.y yVar = X3.y.a;
        if (c1395f != null) {
            Bitmap bitmap = c1395f.a;
            if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                this.f4795i.setValue(Float.valueOf(bitmap.getWidth() / bitmap.getHeight()));
            }
        }
        return yVar;
    }
}
