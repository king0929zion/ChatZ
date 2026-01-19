package io.ktor.utils.io.internal;

import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import x4.C1940w;
import x4.InterfaceC1922e0;

/* loaded from: classes.dex */
public final class b implements InterfaceC0905c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12167c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "state");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12168e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    public static final void a(b bVar, InterfaceC1922e0 interfaceC1922e0, Throwable th) {
        while (true) {
            Object obj = bVar.state;
            if (obj instanceof InterfaceC0905c) {
                InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
                if (interfaceC0905c.o().r(C1940w.f15731e) != interfaceC1922e0) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12167c;
                while (!atomicReferenceFieldUpdater.compareAndSet(bVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(bVar) != obj) {
                        break;
                    }
                }
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
                interfaceC0905c.k(X3.a.b(th));
                return;
            }
            return;
        }
    }

    public final void b(Throwable th) {
        AbstractC1276k.f(th, "cause");
        k(X3.a.b(th));
        a aVar = (a) f12168e.getAndSet(this, null);
        if (aVar != null) {
            aVar.a();
        }
    }

    public final Object c(InterfaceC0905c interfaceC0905c) {
        while (true) {
            Object obj = this.state;
            if (obj != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12167c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                return obj;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12167c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, interfaceC0905c)) {
                if (atomicReferenceFieldUpdater2.get(this) != null) {
                    break;
                }
            }
            InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) interfaceC0905c.o().r(C1940w.f15731e);
            a aVar = (a) this.jobCancellationHandler;
            if ((aVar != null ? aVar.f12164c : null) != interfaceC1922e0) {
                if (interfaceC1922e0 == null) {
                    a aVar2 = (a) f12168e.getAndSet(this, null);
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                } else {
                    a aVar3 = new a(this, interfaceC1922e0);
                    while (true) {
                        Object obj2 = this.jobCancellationHandler;
                        a aVar4 = (a) obj2;
                        if (aVar4 != null && aVar4.f12164c == interfaceC1922e0) {
                            aVar3.a();
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f12168e;
                        while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, aVar3)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                                break;
                            }
                        }
                        if (aVar4 != null) {
                            aVar4.a();
                        }
                    }
                }
            }
            return EnumC0927a.f11114c;
        }
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        Object obj2;
        while (true) {
            Object obj3 = this.state;
            if (obj3 == null) {
                obj2 = X3.l.a(obj);
                if (obj2 == null) {
                    X3.a.e(obj);
                    obj2 = obj;
                }
            } else if (!(obj3 instanceof InterfaceC0905c)) {
                return;
            } else {
                obj2 = null;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12167c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    break;
                }
            }
            if (obj3 instanceof InterfaceC0905c) {
                ((InterfaceC0905c) obj3).k(obj);
                return;
            }
            return;
        }
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        InterfaceC0910h o5;
        Object obj = this.state;
        InterfaceC0905c interfaceC0905c = obj instanceof InterfaceC0905c ? (InterfaceC0905c) obj : null;
        return (interfaceC0905c == null || (o5 = interfaceC0905c.o()) == null) ? C0911i.f11057c : o5;
    }
}
