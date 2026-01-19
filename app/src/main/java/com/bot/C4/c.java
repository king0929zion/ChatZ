package C4;

import b4.InterfaceC0910h;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class c implements InterfaceC1942y {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0910h f686c;

    public c(InterfaceC0910h interfaceC0910h) {
        this.f686c = interfaceC0910h;
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f686c;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f686c + ')';
    }
}
