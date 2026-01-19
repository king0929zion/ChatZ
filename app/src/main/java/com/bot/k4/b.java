package K4;

import Y3.v;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;
import m4.C1270e;
import s4.InterfaceC1672b;

/* loaded from: classes.dex */
public final class b implements SerialDescriptor {
    public final g a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1672b f2946b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2947c;

    public b(g gVar, InterfaceC1672b interfaceC1672b) {
        AbstractC1276k.f(interfaceC1672b, "kClass");
        this.a = gVar;
        this.f2946b = interfaceC1672b;
        this.f2947c = gVar.a + '<' + ((C1270e) interfaceC1672b).c() + BlockQuoteParser.MARKER_CHAR;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f2947c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Y4.l e() {
        return this.a.f2959b;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.a.equals(bVar.a) && AbstractC1276k.b(bVar.f2946b, this.f2946b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.a.f2960c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i6) {
        return this.a.f2962e[i6];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return v.f9812c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f2947c.hashCode() + (((C1270e) this.f2946b).hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i6) {
        return this.a.f2964g[i6];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i6) {
        return this.a.f2963f[i6];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i6) {
        return this.a.f2965h[i6];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f2946b + ", original: " + this.a + ')';
    }
}
