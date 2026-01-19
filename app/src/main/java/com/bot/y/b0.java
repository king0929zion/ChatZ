package y;

import H0.C0158m;
import N1.C0290l;
import e1.C0959a;

/* loaded from: classes.dex */
public final class b0 {
    public final l4.c a;

    /* renamed from: c, reason: collision with root package name */
    public C0290l f15838c;

    /* renamed from: f, reason: collision with root package name */
    public int f15841f;

    /* renamed from: b, reason: collision with root package name */
    public final C0158m f15837b = new C0158m(13);

    /* renamed from: d, reason: collision with root package name */
    public int f15839d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f15840e = -1;

    public b0(l4.c cVar) {
        this.a = cVar;
    }

    public final a0 a(int i6, long j3, boolean z5, l4.c cVar) {
        C0290l c0290l = this.f15838c;
        if (c0290l == null) {
            return C1968h.a;
        }
        r0 r0Var = (r0) c0290l.f3757d;
        boolean z6 = r0Var instanceof ViewOnAttachStateChangeListenerC1962b;
        q0 q0Var = new q0(c0290l, i6, this.f15837b, cVar);
        q0Var.f15918d = new C0959a(j3);
        if (!z6) {
            r0Var.a(q0Var);
        } else if (z5) {
            ViewOnAttachStateChangeListenerC1962b viewOnAttachStateChangeListenerC1962b = (ViewOnAttachStateChangeListenerC1962b) r0Var;
            viewOnAttachStateChangeListenerC1962b.f15831e.add(new u0(1, q0Var));
            if (!viewOnAttachStateChangeListenerC1962b.f15832f) {
                viewOnAttachStateChangeListenerC1962b.f15832f = true;
                viewOnAttachStateChangeListenerC1962b.f15830c.post(viewOnAttachStateChangeListenerC1962b);
            }
        } else {
            ViewOnAttachStateChangeListenerC1962b viewOnAttachStateChangeListenerC1962b2 = (ViewOnAttachStateChangeListenerC1962b) r0Var;
            viewOnAttachStateChangeListenerC1962b2.f15831e.add(new u0(0, q0Var));
            if (!viewOnAttachStateChangeListenerC1962b2.f15832f) {
                viewOnAttachStateChangeListenerC1962b2.f15832f = true;
                viewOnAttachStateChangeListenerC1962b2.f15830c.post(viewOnAttachStateChangeListenerC1962b2);
            }
        }
        Y4.l.W("compose:lazy:schedule_prefetch:index", i6);
        return q0Var;
    }
}
