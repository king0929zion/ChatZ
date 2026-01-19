package h0;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import m4.AbstractC1276k;

/* renamed from: h0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1035l implements InterfaceC1041r {
    public final InterfaceC1041r a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1041r f11804b;

    public C1035l(InterfaceC1041r interfaceC1041r, InterfaceC1041r interfaceC1041r2) {
        this.a = interfaceC1041r;
        this.f11804b = interfaceC1041r2;
    }

    @Override // h0.InterfaceC1041r
    public final Object a(Object obj, l4.e eVar) {
        return this.f11804b.a(this.a.a(obj, eVar), eVar);
    }

    @Override // h0.InterfaceC1041r
    public final boolean b(l4.c cVar) {
        return this.a.b(cVar) && this.f11804b.b(cVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1035l)) {
            return false;
        }
        C1035l c1035l = (C1035l) obj;
        return AbstractC1276k.b(this.a, c1035l.a) && AbstractC1276k.b(this.f11804b, c1035l.f11804b);
    }

    public final int hashCode() {
        return (this.f11804b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("["), (String) a(FlexmarkHtmlConverter.DEFAULT_NODE, C1034k.f11803e), ']');
    }
}
