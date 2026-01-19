package B0;

import H0.C0163s;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import T.C0601d0;
import X4.C0710a;
import java.io.IOException;
import k.C1173u;
import n0.C1353b;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class B {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public Object f378b;

    /* renamed from: c, reason: collision with root package name */
    public Object f379c;

    /* renamed from: d, reason: collision with root package name */
    public Object f380d;

    /* renamed from: e, reason: collision with root package name */
    public Object f381e;

    public IOException a(boolean z5, boolean z6, IOException iOException) {
        U4.i iVar = (U4.i) this.f378b;
        if (iOException != null) {
            d(iOException);
        }
        return iVar.h(this, z6, z5, iOException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int b(M.q qVar, ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, boolean z5) {
        Object[] objArr;
        int i6;
        int i7;
        C0029e c0029e = (C0029e) this.f379c;
        C0163s c0163s = (C0163s) this.f381e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            C0033i o5 = ((A3.c) this.f380d).o(qVar, viewTreeObserverOnGlobalLayoutListenerC0216x);
            C1173u c1173u = (C1173u) o5.f453e;
            int e6 = c1173u.e();
            for (int i8 = 0; i8 < e6; i8++) {
                y yVar = (y) c1173u.f(i8);
                if (!yVar.f484d && !yVar.f488h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int e7 = c1173u.e();
            for (int i9 = 0; i9 < e7; i9++) {
                y yVar2 = (y) c1173u.f(i9);
                if (objArr != false || AbstractC0047x.b(yVar2)) {
                    ((H0.J) this.f378b).A(yVar2.f483c, (C0163s) this.f381e, yVar2.f489i, true);
                    if (!c0163s.f1988c.h()) {
                        c0029e.a(yVar2.a, c0163s, AbstractC0047x.b(yVar2));
                        c0163s.clear();
                    }
                }
            }
            boolean b5 = c0029e.b(o5, z5);
            if (!o5.f452c) {
                int e8 = c1173u.e();
                for (int i10 = 0; i10 < e8; i10++) {
                    y yVar3 = (y) c1173u.f(i10);
                    if (!C1353b.c(AbstractC0047x.h(yVar3, true), 0L) && yVar3.b()) {
                        i6 = 1;
                        break;
                    }
                }
            }
            i6 = 0;
            int e9 = c1173u.e();
            int i11 = 0;
            while (true) {
                if (i11 >= e9) {
                    i7 = 0;
                    break;
                }
                if (((y) c1173u.f(i11)).b()) {
                    i7 = 1;
                    break;
                }
                i11++;
            }
            int i12 = (b5 ? 1 : 0) | (i6 << 1) | (i7 << 2);
            this.a = false;
            return i12;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public Q4.x c(boolean z5) {
        try {
            Q4.x e6 = ((V4.d) this.f380d).e(z5);
            if (e6 == null) {
                return e6;
            }
            e6.f6656m = this;
            return e6;
        } catch (IOException e7) {
            d(e7);
            throw e7;
        }
    }

    public void d(IOException iOException) {
        this.a = true;
        ((U4.e) this.f379c).c(iOException);
        U4.k g3 = ((V4.d) this.f380d).g();
        U4.i iVar = (U4.i) this.f378b;
        synchronized (g3) {
            try {
                if (!(iOException instanceof X4.B)) {
                    if (!(g3.f8733g != null) || (iOException instanceof C0710a)) {
                        g3.f8736j = true;
                        if (g3.f8739m == 0) {
                            U4.k.d(iVar.f8712c, g3.f8728b, iOException);
                            g3.f8738l++;
                        }
                    }
                } else if (((X4.B) iOException).f9417c == 8) {
                    int i6 = g3.f8740n + 1;
                    g3.f8740n = i6;
                    if (i6 > 1) {
                        g3.f8736j = true;
                        g3.f8738l++;
                    }
                } else if (((X4.B) iOException).f9417c != 9 || !iVar.f8725q) {
                    g3.f8736j = true;
                    g3.f8738l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i6, int i7) {
        if (i6 < S.l.f7374V) {
            AbstractC1734b.a("Index should be non-negative (" + i6 + ')');
        }
        ((C0601d0) this.f378b).h(i6);
        ((y.W) this.f381e).a(i6);
        ((C0601d0) this.f379c).h(i7);
    }
}
