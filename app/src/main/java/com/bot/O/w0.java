package O;

import android.os.Build;
import e1.InterfaceC0961c;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4236c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0961c f4237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T.X f4238f;

    public /* synthetic */ w0(InterfaceC0961c interfaceC0961c, T.X x5, int i6) {
        this.f4236c = i6;
        this.f4237e = interfaceC0961c;
        this.f4238f = x5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f4236c) {
            case 0:
                x0 x0Var = new x0(0, (InterfaceC1193a) obj);
                w0 w0Var = new w0(this.f4237e, this.f4238f, 1);
                if (p.w0.a()) {
                    return p.w0.b(x0Var, w0Var, Build.VERSION.SDK_INT == 28 ? p.J0.f13593b : p.J0.f13594c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            case 1:
                float b5 = e1.h.b(((e1.h) obj).a);
                InterfaceC0961c interfaceC0961c = this.f4237e;
                this.f4238f.setValue(new e1.l((interfaceC0961c.l0(b5) << 32) | (interfaceC0961c.l0(e1.h.a(r7.a)) & 4294967295L)));
                return X3.y.a;
            case 2:
                x0 x0Var2 = new x0(1, (InterfaceC1193a) obj);
                w0 w0Var2 = new w0(this.f4237e, this.f4238f, 3);
                if (p.w0.a()) {
                    return p.w0.b(x0Var2, w0Var2, Build.VERSION.SDK_INT == 28 ? p.J0.f13593b : p.J0.f13594c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                float b6 = e1.h.b(((e1.h) obj).a);
                InterfaceC0961c interfaceC0961c2 = this.f4237e;
                this.f4238f.setValue(new e1.l((interfaceC0961c2.l0(b6) << 32) | (interfaceC0961c2.l0(e1.h.a(r7.a)) & 4294967295L)));
                return X3.y.a;
        }
    }
}
