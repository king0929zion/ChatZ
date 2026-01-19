package b4;

import Z2.C0789z;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.Serializable;
import m4.AbstractC1276k;

/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904b implements InterfaceC0910h, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0910h f11054c;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0908f f11055e;

    public C0904b(InterfaceC0908f interfaceC0908f, InterfaceC0910h interfaceC0910h) {
        AbstractC1276k.f(interfaceC0910h, "left");
        AbstractC1276k.f(interfaceC0908f, "element");
        this.f11054c = interfaceC0910h;
        this.f11055e = interfaceC0908f;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        AbstractC1276k.f(interfaceC0910h, "context");
        return interfaceC0910h == C0911i.f11057c ? this : (InterfaceC0910h) interfaceC0910h.q(this, new C0789z(14));
    }

    public final boolean equals(Object obj) {
        boolean z5;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0904b) {
            C0904b c0904b = (C0904b) obj;
            c0904b.getClass();
            int i6 = 2;
            C0904b c0904b2 = c0904b;
            int i7 = 2;
            while (true) {
                InterfaceC0910h interfaceC0910h = c0904b2.f11054c;
                c0904b2 = interfaceC0910h instanceof C0904b ? (C0904b) interfaceC0910h : null;
                if (c0904b2 == null) {
                    break;
                }
                i7++;
            }
            C0904b c0904b3 = this;
            while (true) {
                InterfaceC0910h interfaceC0910h2 = c0904b3.f11054c;
                c0904b3 = interfaceC0910h2 instanceof C0904b ? (C0904b) interfaceC0910h2 : null;
                if (c0904b3 == null) {
                    break;
                }
                i6++;
            }
            if (i7 == i6) {
                C0904b c0904b4 = this;
                while (true) {
                    InterfaceC0908f interfaceC0908f = c0904b4.f11055e;
                    if (!AbstractC1276k.b(c0904b.r(interfaceC0908f.getKey()), interfaceC0908f)) {
                        z5 = false;
                        break;
                    }
                    InterfaceC0910h interfaceC0910h3 = c0904b4.f11054c;
                    if (!(interfaceC0910h3 instanceof C0904b)) {
                        AbstractC1276k.d(interfaceC0910h3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC0908f interfaceC0908f2 = (InterfaceC0908f) interfaceC0910h3;
                        z5 = AbstractC1276k.b(c0904b.r(interfaceC0908f2.getKey()), interfaceC0908f2);
                        break;
                    }
                    c0904b4 = (C0904b) interfaceC0910h3;
                }
                if (z5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        AbstractC1276k.f(interfaceC0909g, "key");
        InterfaceC0908f interfaceC0908f = this.f11055e;
        InterfaceC0908f r5 = interfaceC0908f.r(interfaceC0909g);
        InterfaceC0910h interfaceC0910h = this.f11054c;
        if (r5 != null) {
            return interfaceC0910h;
        }
        InterfaceC0910h h3 = interfaceC0910h.h(interfaceC0909g);
        return h3 == interfaceC0910h ? this : h3 == C0911i.f11057c ? interfaceC0908f : new C0904b(interfaceC0908f, h3);
    }

    public final int hashCode() {
        return this.f11055e.hashCode() + this.f11054c.hashCode();
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return eVar.m(this.f11054c.q(obj, eVar), this.f11055e);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        AbstractC1276k.f(interfaceC0909g, "key");
        C0904b c0904b = this;
        while (true) {
            InterfaceC0908f r5 = c0904b.f11055e.r(interfaceC0909g);
            if (r5 != null) {
                return r5;
            }
            InterfaceC0910h interfaceC0910h = c0904b.f11054c;
            if (!(interfaceC0910h instanceof C0904b)) {
                return interfaceC0910h.r(interfaceC0909g);
            }
            c0904b = (C0904b) interfaceC0910h;
        }
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("["), (String) q(FlexmarkHtmlConverter.DEFAULT_NODE, new C0789z(13)), ']');
    }
}
