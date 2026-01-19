package b4;

import c4.EnumC0927a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: b4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912j implements InterfaceC0905c, d4.d {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11058e = AtomicReferenceFieldUpdater.newUpdater(C0912j.class, Object.class, "result");

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0905c f11059c;
    private volatile Object result;

    public C0912j(InterfaceC0905c interfaceC0905c) {
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        this.f11059c = interfaceC0905c;
        this.result = enumC0927a;
    }

    @Override // d4.d
    public final d4.d g() {
        InterfaceC0905c interfaceC0905c = this.f11059c;
        if (interfaceC0905c instanceof d4.d) {
            return (d4.d) interfaceC0905c;
        }
        return null;
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC0927a enumC0927a = EnumC0927a.f11115e;
            if (obj2 == enumC0927a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11058e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0927a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC0927a) {
                        break;
                    }
                }
                return;
            }
            EnumC0927a enumC0927a2 = EnumC0927a.f11114c;
            if (obj2 != enumC0927a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11058e;
            EnumC0927a enumC0927a3 = EnumC0927a.f11116f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC0927a2, enumC0927a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC0927a2) {
                    break;
                }
            }
            this.f11059c.k(obj);
            return;
        }
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return this.f11059c.o();
    }

    public final String toString() {
        return "SafeContinuation for " + this.f11059c;
    }
}
