package b4;

import java.io.Serializable;
import m4.AbstractC1276k;

/* renamed from: b4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911i implements InterfaceC0910h, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0911i f11057c = new Object();

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        AbstractC1276k.f(interfaceC0910h, "context");
        return interfaceC0910h;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        AbstractC1276k.f(interfaceC0909g, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return obj;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        AbstractC1276k.f(interfaceC0909g, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
