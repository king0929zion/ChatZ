package A4;

import B4.AbstractC0049b;
import B4.AbstractC0050c;
import B4.AbstractC0051d;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import x4.C1928k;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public final class g0 extends AbstractC0049b implements O, InterfaceC0007h, B4.w {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f262i = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: h, reason: collision with root package name */
    public int f263h;

    public g0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // A4.N, A4.InterfaceC0008i
    public final Object a(Object obj, InterfaceC0905c interfaceC0905c) {
        k(obj);
        return X3.y.a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c4 -> B:15:0x007e). Please report as a decompilation issue!!! */
    @Override // A4.InterfaceC0007h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(A4.InterfaceC0008i r18, b4.InterfaceC0905c r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.g0.b(A4.i, b4.c):java.lang.Object");
    }

    @Override // B4.w
    public final InterfaceC0007h c(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        return (((i6 < 0 || i6 >= 2) && i6 != -2) || enumC2050a != EnumC2050a.f16328e) ? W.l(this, interfaceC0910h, i6, enumC2050a) : this;
    }

    @Override // B4.AbstractC0049b
    public final AbstractC0051d e() {
        return new h0();
    }

    @Override // B4.AbstractC0049b
    public final AbstractC0051d[] f() {
        return new h0[2];
    }

    @Override // A4.e0
    public final Object getValue() {
        C4.u uVar = AbstractC0050c.f579b;
        Object obj = f262i.get(this);
        if (obj == uVar) {
            return null;
        }
        return obj;
    }

    @Override // A4.N
    public final boolean h(Object obj) {
        l(null, obj);
        return true;
    }

    public final boolean j(Object obj, Object obj2) {
        C4.u uVar = AbstractC0050c.f579b;
        if (obj == null) {
            obj = uVar;
        }
        if (obj2 == null) {
            obj2 = uVar;
        }
        return l(obj, obj2);
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = AbstractC0050c.f579b;
        }
        l(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        int i6;
        AbstractC0051d[] abstractC0051dArr;
        C4.u uVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f262i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC1276k.b(obj3, obj)) {
                return false;
            }
            if (AbstractC1276k.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i7 = this.f263h;
            if ((i7 & 1) != 0) {
                this.f263h = i7 + 2;
                return true;
            }
            int i8 = i7 + 1;
            this.f263h = i8;
            AbstractC0051d[] abstractC0051dArr2 = this.f575c;
            while (true) {
                h0[] h0VarArr = (h0[]) abstractC0051dArr2;
                if (h0VarArr != null) {
                    for (h0 h0Var : h0VarArr) {
                        if (h0Var != null) {
                            AtomicReference atomicReference = h0Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (uVar = W.f222c)) {
                                    C4.u uVar2 = W.f221b;
                                    if (obj4 != uVar2) {
                                        while (!atomicReference.compareAndSet(obj4, uVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C1928k) obj4).k(X3.y.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, uVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i6 = this.f263h;
                    if (i6 == i8) {
                        this.f263h = i8 + 1;
                        return true;
                    }
                    abstractC0051dArr = this.f575c;
                }
                abstractC0051dArr2 = abstractC0051dArr;
                i8 = i6;
            }
        }
    }
}
