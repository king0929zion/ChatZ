package N1;

import F0.v0;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import l2.C1186a;
import l2.C1188c;
import l2.C1190e;
import m4.AbstractC1276k;
import w2.AbstractC1835e;
import y.C1956M;
import y.r0;

/* renamed from: N1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290l {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3755b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3756c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3757d;

    public C0290l() {
        this.f3755b = new Object();
        this.f3756c = new ArrayList();
        this.f3757d = new ArrayList();
        this.a = true;
    }

    public void a(boolean z5) {
        C1190e c1190e = (C1190e) this.f3756c;
        synchronized (c1190e) {
            try {
                if (this.a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC1276k.b(((C1186a) this.f3755b).f12681g, this)) {
                    C1190e.c(c1190e, this, z5);
                }
                this.a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public d5.y b(int i6) {
        d5.y yVar;
        C1190e c1190e = (C1190e) this.f3756c;
        synchronized (c1190e) {
            if (this.a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f3757d)[i6] = true;
            Object obj = ((C1186a) this.f3755b).f12678d.get(i6);
            C1188c c1188c = c1190e.f12705s;
            d5.y yVar2 = (d5.y) obj;
            if (!c1188c.f(yVar2)) {
                AbstractC1835e.a(c1188c.k(yVar2));
            }
            yVar = (d5.y) obj;
        }
        return yVar;
    }

    public C0290l(C1956M c1956m, v0 v0Var, r0 r0Var) {
        this.f3755b = c1956m;
        this.f3756c = v0Var;
        this.f3757d = r0Var;
        this.a = true;
    }

    public C0290l(int i6) {
        this.f3755b = new ReentrantLock();
        this.f3756c = new long[i6];
        this.f3757d = new boolean[i6];
    }

    public C0290l(C1190e c1190e, C1186a c1186a) {
        this.f3756c = c1190e;
        this.f3755b = c1186a;
        this.f3757d = new boolean[2];
    }
}
