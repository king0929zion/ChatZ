package io.ktor.utils.io.jvm.javaio;

import B0.G;
import O.C0325o0;
import X3.y;
import b4.InterfaceC0905c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import x4.AbstractC1908V;
import x4.InterfaceC1900M;
import x4.InterfaceC1922e0;
import x4.v0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12195f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "state");
    public final InterfaceC1922e0 a;

    /* renamed from: b, reason: collision with root package name */
    public final a f12196b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1900M f12197c;

    /* renamed from: d, reason: collision with root package name */
    public int f12198d;

    /* renamed from: e, reason: collision with root package name */
    public int f12199e;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    public b(InterfaceC1922e0 interfaceC1922e0) {
        this.a = interfaceC1922e0;
        a aVar = new a(this);
        this.f12196b = aVar;
        this.state = this;
        this.result = 0;
        InterfaceC0905c interfaceC0905c = null;
        this.f12197c = interfaceC1922e0 != null ? interfaceC1922e0.S(new G(this, 19)) : null;
        C0325o0 c0325o0 = new C0325o0(this, interfaceC0905c, 4);
        AbstractC1291z.b(1, c0325o0);
        c0325o0.f(aVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public abstract Object a(d4.c cVar);

    public final int b(byte[] bArr, int i6, int i7) {
        Object runtimeException;
        e eVar = e.f12201b;
        this.f12198d = i6;
        this.f12199e = i7;
        Thread currentThread = Thread.currentThread();
        InterfaceC0905c interfaceC0905c = null;
        while (true) {
            Object obj = this.state;
            if (obj instanceof InterfaceC0905c) {
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                interfaceC0905c = (InterfaceC0905c) obj;
                runtimeException = currentThread;
            } else {
                if (obj instanceof y) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (AbstractC1276k.b(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                runtimeException = new RuntimeException();
            }
            AbstractC1276k.e(runtimeException, "when (value) {\n         …Exception()\n            }");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12195f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, runtimeException)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            AbstractC1276k.c(interfaceC0905c);
            interfaceC0905c.k(bArr);
            AbstractC1276k.e(currentThread, "thread");
            if (this.state == currentThread) {
                i iVar = (i) j.a.get();
                if (iVar == null) {
                    iVar = eVar;
                }
                if (iVar == e.f12202c) {
                    ((f5.a) d.a.getValue()).a();
                }
                while (true) {
                    AbstractC1908V abstractC1908V = (AbstractC1908V) v0.a.get();
                    long l02 = abstractC1908V != null ? abstractC1908V.l0() : Long.MAX_VALUE;
                    if (this.state != currentThread) {
                        break;
                    }
                    if (l02 > 0) {
                        i iVar2 = (i) j.a.get();
                        if (iVar2 == null) {
                            iVar2 = eVar;
                        }
                        iVar2.a(l02);
                    }
                }
            }
            Object obj2 = this.state;
            if (obj2 instanceof Throwable) {
                throw ((Throwable) obj2);
            }
            return this.result;
        }
    }
}
