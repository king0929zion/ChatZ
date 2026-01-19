package x4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class k0 implements InterfaceC1914a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15709e = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_isCompleting$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15710f = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_rootCause$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15711g = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f15712c;

    public k0(n0 n0Var, Throwable th) {
        this.f15712c = n0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable b5 = b();
        if (b5 == null) {
            f15710f.set(this, th);
            return;
        }
        if (th == b5) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15711g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable b() {
        return (Throwable) f15710f.get(this);
    }

    public final boolean c() {
        return b() != null;
    }

    @Override // x4.InterfaceC1914a0
    public final boolean d() {
        return b() == null;
    }

    @Override // x4.InterfaceC1914a0
    public final n0 e() {
        return this.f15712c;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15711g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable b5 = b();
        if (b5 != null) {
            arrayList.add(0, b5);
        }
        if (th != null && !th.equals(b5)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC1888A.f15644h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(c());
        sb.append(", completing=");
        sb.append(f15709e.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(b());
        sb.append(", exceptions=");
        sb.append(f15711g.get(this));
        sb.append(", list=");
        sb.append(this.f15712c);
        sb.append(']');
        return sb.toString();
    }
}
