package N3;

import b4.AbstractC0903a;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class k extends AbstractC0903a implements CoroutineExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(InterfaceC0909g interfaceC0909g, int i6) {
        super(interfaceC0909g);
        this.f3865e = i6;
    }

    private final void d0(InterfaceC0910h interfaceC0910h, Throwable th) {
    }

    private final void e0(InterfaceC0910h interfaceC0910h, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void N(InterfaceC0910h interfaceC0910h, Throwable th) {
        int i6 = this.f3865e;
    }
}
