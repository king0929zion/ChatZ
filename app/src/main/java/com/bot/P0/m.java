package P0;

import I0.K;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;
import java.util.Iterator;
import k.C1162i;
import k.C1176x;
import k.M;
import k.V;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class m implements x, Iterable, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final M f4492c;

    /* renamed from: e, reason: collision with root package name */
    public C1176x f4493e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4494f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4495g;

    public m() {
        long[] jArr = V.a;
        this.f4492c = new M();
    }

    @Override // P0.x
    public final void a(w wVar, Object obj) {
        boolean z5 = obj instanceof a;
        M m3 = this.f4492c;
        if (z5 && m3.c(wVar)) {
            Object g3 = m3.g(wVar);
            AbstractC1276k.d(g3, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) g3;
            a aVar2 = (a) obj;
            String str = aVar2.a;
            if (str == null) {
                str = aVar.a;
            }
            X3.e eVar = aVar2.f4430b;
            if (eVar == null) {
                eVar = aVar.f4430b;
            }
            m3.m(wVar, new a(str, eVar));
        } else {
            m3.m(wVar, obj);
        }
        wVar.getClass();
    }

    public final m b() {
        m mVar = new m();
        mVar.f4494f = this.f4494f;
        mVar.f4495g = this.f4495g;
        M m3 = mVar.f4492c;
        m3.getClass();
        M m5 = this.f4492c;
        AbstractC1276k.f(m5, "from");
        Object[] objArr = m5.f12485b;
        Object[] objArr2 = m5.f12486c;
        long[] jArr = m5.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j3) < 128) {
                            int i9 = (i6 << 3) + i8;
                            m3.m(objArr[i9], objArr2[i9]);
                        }
                        j3 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        return mVar;
    }

    public final Object c(w wVar) {
        Object g3 = this.f4492c.g(wVar);
        if (g3 != null) {
            return g3;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final void d(m mVar) {
        M m3 = mVar.f4492c;
        Object[] objArr = m3.f12485b;
        Object[] objArr2 = m3.f12486c;
        long[] jArr = m3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j3) < 128) {
                        int i9 = (i6 << 3) + i8;
                        Object obj = objArr[i9];
                        Object obj2 = objArr2[i9];
                        w wVar = (w) obj;
                        M m5 = this.f4492c;
                        Object g3 = m5.g(wVar);
                        AbstractC1276k.d(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object m6 = wVar.f4549b.m(g3, obj2);
                        if (m6 != null) {
                            m5.m(wVar, m6);
                        }
                    }
                    j3 >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC1276k.b(this.f4492c, mVar.f4492c) && this.f4494f == mVar.f4494f && this.f4495g == mVar.f4495g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4495g) + AbstractC1135a.d(this.f4492c.hashCode() * 31, 31, this.f4494f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1176x c1176x = this.f4493e;
        if (c1176x == null) {
            M m3 = this.f4492c;
            m3.getClass();
            C1176x c1176x2 = new C1176x(m3);
            this.f4493e = c1176x2;
            c1176x = c1176x2;
        }
        return ((C1162i) c1176x.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f4494f) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (this.f4495g) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        M m3 = this.f4492c;
        Object[] objArr = m3.f12485b;
        Object[] objArr2 = m3.f12486c;
        long[] jArr = m3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j3) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj = objArr[i9];
                            Object obj2 = objArr2[i9];
                            sb.append(str);
                            sb.append(((w) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j3 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        return K.q(this) + "{ " + ((Object) sb) + " }";
    }
}
