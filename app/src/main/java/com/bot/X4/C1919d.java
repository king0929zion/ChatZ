package x4;

import m4.AbstractC1276k;

/* renamed from: x4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1919d implements InterfaceC1926i {

    /* renamed from: c, reason: collision with root package name */
    public final C1917c[] f15687c;

    public C1919d(C1917c[] c1917cArr) {
        this.f15687c = c1917cArr;
    }

    public final void a() {
        for (C1917c c1917c : this.f15687c) {
            InterfaceC1900M interfaceC1900M = c1917c.f15683i;
            if (interfaceC1900M == null) {
                AbstractC1276k.k("handle");
                throw null;
            }
            interfaceC1900M.dispose();
        }
    }

    @Override // x4.InterfaceC1926i
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f15687c + ']';
    }
}
