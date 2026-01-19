package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831e implements InterfaceC0844s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10870c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10871e;

    public /* synthetic */ C0831e(Object obj, int i6) {
        this.f10870c = i6;
        this.f10871e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        switch (this.f10870c) {
            case 0:
                new HashMap();
                InterfaceC0836j[] interfaceC0836jArr = (InterfaceC0836j[]) this.f10871e;
                if (interfaceC0836jArr.length > 0) {
                    InterfaceC0836j interfaceC0836j = interfaceC0836jArr[0];
                    throw null;
                }
                if (interfaceC0836jArr.length <= 0) {
                    return;
                }
                InterfaceC0836j interfaceC0836j2 = interfaceC0836jArr[0];
                throw null;
            default:
                if (enumC0841o == EnumC0841o.ON_CREATE) {
                    interfaceC0846u.g().j(this);
                    ((P) this.f10871e).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0841o).toString());
                }
        }
    }
}
