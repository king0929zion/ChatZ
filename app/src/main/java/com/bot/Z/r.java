package z;

import D.C0062d;
import D.C0072i;
import O.C0316k;
import T.C0626q;
import T.C0627q0;
import b0.AbstractC0874g;
import com.vladsch.flexmark.parser.PegdownExtensions;
import m4.AbstractC1276k;
import y.AbstractC1975o;
import y.InterfaceC1957N;

/* loaded from: classes.dex */
public final class r implements InterfaceC1957N {
    public final C2004b a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1975o f16142b;

    /* renamed from: c, reason: collision with root package name */
    public final C0316k f16143c;

    public r(C2004b c2004b, q qVar, C0316k c0316k) {
        this.a = c2004b;
        this.f16142b = qVar;
        this.f16143c = c0316k;
    }

    @Override // y.InterfaceC1957N
    public final int a() {
        return this.f16142b.i().f4139b;
    }

    @Override // y.InterfaceC1957N
    public final Object b(int i6) {
        C0316k c0316k = this.f16143c;
        Object[] objArr = (Object[]) c0316k.f4141d;
        int i7 = i6 - c0316k.f4139b;
        Object obj = (i7 < 0 || i7 >= objArr.length) ? null : objArr[i7];
        return obj == null ? this.f16142b.j(i6) : obj;
    }

    @Override // y.InterfaceC1957N
    public final void d(int i6, Object obj, C0626q c0626q, int i7) {
        c0626q.d0(-1201380429);
        int i8 = (c0626q.d(i6) ? 4 : 2) | i7 | (c0626q.h(obj) ? 32 : 16) | (c0626q.f(this) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i8 & 1, (i8 & 147) != 146)) {
            AbstractC1975o.b(obj, i6, this.a.f16042B, AbstractC0874g.c(1142237095, new C0062d(i6, 5, this), c0626q), c0626q, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & 112));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(this, i6, obj, i7, 14);
        }
    }

    @Override // y.InterfaceC1957N
    public final int e(Object obj) {
        return this.f16143c.c(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return AbstractC1276k.b(this.f16142b, ((r) obj).f16142b);
    }

    public final int hashCode() {
        return this.f16142b.hashCode();
    }
}
