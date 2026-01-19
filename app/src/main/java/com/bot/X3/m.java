package X3;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class m implements f, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9397f = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "e");

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC1193a f9398c;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f9399e;

    @Override // X3.f
    public final boolean a() {
        return this.f9399e != v.a;
    }

    @Override // X3.f
    public final Object getValue() {
        Object obj = this.f9399e;
        v vVar = v.a;
        if (obj != vVar) {
            return obj;
        }
        InterfaceC1193a interfaceC1193a = this.f9398c;
        if (interfaceC1193a != null) {
            Object b5 = interfaceC1193a.b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9397f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b5)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                }
            }
            this.f9398c = null;
            return b5;
        }
        return this.f9399e;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
