package T;

import android.os.Trace;
import b0.AbstractC0874g;
import b0.C0879l;
import java.util.concurrent.atomic.AtomicReference;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* renamed from: T.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611i0 {
    public final C0639x a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0633u f8099b;

    /* renamed from: c, reason: collision with root package name */
    public final C0626q f8100c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.e f8101d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8102e;

    /* renamed from: f, reason: collision with root package name */
    public final H0.G0 f8103f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8104g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f8105h = new AtomicReference(EnumC0613j0.f8116f);

    /* renamed from: i, reason: collision with root package name */
    public long f8106i = AbstractC0874g.b();

    /* renamed from: j, reason: collision with root package name */
    public k.N f8107j;

    /* renamed from: k, reason: collision with root package name */
    public final C0879l f8108k;

    /* renamed from: l, reason: collision with root package name */
    public final C0644z0 f8109l;

    public C0611i0(C0639x c0639x, AbstractC0633u abstractC0633u, C0626q c0626q, k.P p5, l4.e eVar, boolean z5, H0.G0 g02, Object obj) {
        this.a = c0639x;
        this.f8099b = abstractC0633u;
        this.f8100c = c0626q;
        this.f8101d = eVar;
        this.f8102e = z5;
        this.f8103f = g02;
        this.f8104g = obj;
        k.N n3 = k.W.a;
        AbstractC1276k.d(n3, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.f8107j = n3;
        C0879l c0879l = new C0879l();
        c0879l.g(p5, c0626q.C());
        this.f8108k = c0879l;
        this.f8109l = new C0644z0(g02.f1704f);
    }

    public final void a() {
        AtomicReference atomicReference = this.f8105h;
        try {
            switch (((EnumC0613j0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case AbstractC1787b.f15290g /* 5 */:
                    b();
                    EnumC0613j0 enumC0613j0 = EnumC0613j0.f8119i;
                    EnumC0613j0 enumC0613j02 = EnumC0613j0.f8120j;
                    while (!atomicReference.compareAndSet(enumC0613j0, enumC0613j02)) {
                        if (atomicReference.get() != enumC0613j0) {
                            AbstractC0619m0.b("Unexpected state change from: " + enumC0613j0 + " to: " + enumC0613j02 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e6) {
            atomicReference.set(EnumC0613j0.f8114c);
            throw e6;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f8104g) {
                try {
                    this.f8109l.a(this.f8103f, this.f8108k);
                    this.f8108k.c();
                    this.f8108k.d();
                } finally {
                    this.f8108k.b();
                    this.a.f8250t = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((EnumC0613j0) this.f8105h.get()).compareTo(EnumC0613j0.f8119i) >= 0;
    }

    public final void d() {
        EnumC0613j0 enumC0613j0;
        EnumC0613j0 enumC0613j02;
        boolean z5;
        while (true) {
            AtomicReference atomicReference = this.f8105h;
            enumC0613j0 = EnumC0613j0.f8117g;
            enumC0613j02 = EnumC0613j0.f8119i;
            if (atomicReference.compareAndSet(enumC0613j0, enumC0613j02)) {
                z5 = true;
                break;
            } else if (atomicReference.get() != enumC0613j0) {
                z5 = false;
                break;
            }
        }
        if (z5) {
            return;
        }
        AbstractC0619m0.b("Unexpected state change from: " + enumC0613j0 + " to: " + enumC0613j02 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public final boolean e(G0 g02) {
        EnumC0613j0 enumC0613j0 = EnumC0613j0.f8118h;
        AtomicReference atomicReference = this.f8105h;
        try {
            int ordinal = ((EnumC0613j0) atomicReference.get()).ordinal();
            EnumC0613j0 enumC0613j02 = EnumC0613j0.f8117g;
            C0639x c0639x = this.a;
            AbstractC0633u abstractC0633u = this.f8099b;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C0626q c0626q = this.f8100c;
                    boolean z5 = this.f8102e;
                    if (z5) {
                        c0626q.f8190z = 100;
                        c0626q.f8189y = true;
                    }
                    try {
                        this.f8107j = abstractC0633u.b(c0639x, g02, this.f8101d);
                        EnumC0613j0 enumC0613j03 = EnumC0613j0.f8116f;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC0613j03, enumC0613j02)) {
                                if (atomicReference.get() != enumC0613j03) {
                                    AbstractC0619m0.b("Unexpected state change from: " + enumC0613j03 + " to: " + enumC0613j02 + '.');
                                }
                            }
                        }
                        if (this.f8107j.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z5) {
                            c0626q.u();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(enumC0613j02, enumC0613j0)) {
                            if (atomicReference.get() != enumC0613j02) {
                                AbstractC0619m0.b("Unexpected state change from: " + enumC0613j02 + " to: " + enumC0613j0 + '.');
                            }
                        }
                    }
                    long j3 = this.f8106i;
                    try {
                        this.f8106i = AbstractC0874g.b();
                        this.f8107j = abstractC0633u.n(c0639x, g02, this.f8107j);
                        this.f8106i = j3;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC0613j0, enumC0613j02)) {
                                if (atomicReference.get() != enumC0613j0) {
                                    AbstractC0619m0.b("Unexpected state change from: " + enumC0613j0 + " to: " + enumC0613j02 + '.');
                                }
                            }
                        }
                        if (this.f8107j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.f8106i = j3;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC0613j0, enumC0613j02)) {
                                if (atomicReference.get() != enumC0613j0) {
                                    AbstractC0619m0.b("Unexpected state change from: " + enumC0613j0 + " to: " + enumC0613j02 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    AbstractC0629s.b("Recursive call to resume()");
                    throw new RuntimeException();
                case AbstractC1787b.f15290g /* 5 */:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e6) {
            atomicReference.set(EnumC0613j0.f8114c);
            throw e6;
        }
    }
}
