package x;

import D.C0062d;
import D.C0072i;
import O.C0316k;
import T.C0626q;
import T.C0627q0;
import b0.AbstractC0874g;
import com.vladsch.flexmark.parser.PegdownExtensions;
import m4.AbstractC1276k;
import y.AbstractC1975o;
import y.C1969i;
import y.InterfaceC1957N;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1857h implements InterfaceC1957N {
    public final s a;

    /* renamed from: b, reason: collision with root package name */
    public final C1856g f15451b;

    /* renamed from: c, reason: collision with root package name */
    public final C1851b f15452c;

    /* renamed from: d, reason: collision with root package name */
    public final C0316k f15453d;

    public C1857h(s sVar, C1856g c1856g, C1851b c1851b, C0316k c0316k) {
        this.a = sVar;
        this.f15451b = c1856g;
        this.f15452c = c1851b;
        this.f15453d = c0316k;
    }

    @Override // y.InterfaceC1957N
    public final int a() {
        return this.f15451b.i().f4139b;
    }

    @Override // y.InterfaceC1957N
    public final Object b(int i6) {
        C0316k c0316k = this.f15453d;
        Object[] objArr = (Object[]) c0316k.f4141d;
        int i7 = i6 - c0316k.f4139b;
        Object obj = (i7 < 0 || i7 >= objArr.length) ? null : objArr[i7];
        return obj == null ? this.f15451b.j(i6) : obj;
    }

    @Override // y.InterfaceC1957N
    public final Object c(int i6) {
        C1969i b5 = this.f15451b.f15449c.b(i6);
        return b5.f15877c.a().f(Integer.valueOf(i6 - b5.a));
    }

    @Override // y.InterfaceC1957N
    public final void d(int i6, Object obj, C0626q c0626q, int i7) {
        c0626q.d0(-462424778);
        int i8 = (c0626q.d(i6) ? 4 : 2) | i7 | (c0626q.h(obj) ? 32 : 16) | (c0626q.f(this) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i8 & 1, (i8 & 147) != 146)) {
            AbstractC1975o.b(obj, i6, this.a.f15561r, AbstractC0874g.c(-824725566, new C0062d(i6, 4, this), c0626q), c0626q, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & 112));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(this, i6, obj, i7, 12);
        }
    }

    @Override // y.InterfaceC1957N
    public final int e(Object obj) {
        return this.f15453d.c(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1857h)) {
            return false;
        }
        return AbstractC1276k.b(this.f15451b, ((C1857h) obj).f15451b);
    }

    public final int hashCode() {
        return this.f15451b.hashCode();
    }
}
