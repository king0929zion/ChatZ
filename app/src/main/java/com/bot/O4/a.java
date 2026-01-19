package O4;

import M4.F;
import M4.e0;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import m4.AbstractC1276k;
import m4.AbstractC1289x;

/* loaded from: classes.dex */
public abstract class a implements N4.i, Decoder, L4.a {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4327b;

    /* renamed from: c, reason: collision with root package name */
    public final N4.c f4328c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4329d;

    /* renamed from: e, reason: collision with root package name */
    public final N4.h f4330e;

    public a(N4.c cVar, String str) {
        this.f4328c = cVar;
        this.f4329d = str;
        this.f4330e = cVar.a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float A() {
        return K(T());
    }

    @Override // L4.a
    public final float B(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return K(R(serialDescriptor, i6));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double C() {
        return J(T());
    }

    @Override // L4.a
    public final double D(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return J(R(e0Var, i6));
    }

    public abstract kotlinx.serialization.json.b E(String str);

    public final kotlinx.serialization.json.b F() {
        kotlinx.serialization.json.b E5;
        String str = (String) Y3.m.x0(this.a);
        return (str == null || (E5 = E(str)) == null) ? S() : E5;
    }

    public final boolean G(Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        if (!(E5 instanceof kotlinx.serialization.json.d)) {
            throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of boolean at element: " + V(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) E5;
        try {
            F f6 = N4.j.a;
            AbstractC1276k.f(dVar, "<this>");
            String a = dVar.a();
            String[] strArr = y.a;
            AbstractC1276k.f(a, "<this>");
            Boolean bool = a.equalsIgnoreCase("true") ? Boolean.TRUE : a.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            W(dVar, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(dVar, "boolean", str);
            throw null;
        }
    }

    public final byte H(Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        if (!(E5 instanceof kotlinx.serialization.json.d)) {
            throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of byte at element: " + V(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) E5;
        try {
            int c6 = N4.j.c(dVar);
            Byte valueOf = (-128 > c6 || c6 > 127) ? null : Byte.valueOf((byte) c6);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            W(dVar, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(dVar, "byte", str);
            throw null;
        }
    }

    public final char I(Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        if (!(E5 instanceof kotlinx.serialization.json.d)) {
            throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of char at element: " + V(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) E5;
        try {
            String a = dVar.a();
            AbstractC1276k.f(a, "<this>");
            int length = a.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return a.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            W(dVar, "char", str);
            throw null;
        }
    }

    public final double J(Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        if (!(E5 instanceof kotlinx.serialization.json.d)) {
            throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of double at element: " + V(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) E5;
        try {
            F f6 = N4.j.a;
            AbstractC1276k.f(dVar, "<this>");
            double parseDouble = Double.parseDouble(dVar.a());
            if (this.f4328c.a.f3904h || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            throw m.a(Double.valueOf(parseDouble), str, F().toString());
        } catch (IllegalArgumentException unused) {
            W(dVar, "double", str);
            throw null;
        }
    }

    public final float K(Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        if (!(E5 instanceof kotlinx.serialization.json.d)) {
            throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of float at element: " + V(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) E5;
        try {
            F f6 = N4.j.a;
            AbstractC1276k.f(dVar, "<this>");
            float parseFloat = Float.parseFloat(dVar.a());
            if (this.f4328c.a.f3904h || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            throw m.a(Float.valueOf(parseFloat), str, F().toString());
        } catch (IllegalArgumentException unused) {
            W(dVar, "float", str);
            throw null;
        }
    }

    public final Decoder L(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        AbstractC1276k.f(serialDescriptor, "inlineDescriptor");
        if (!x.a(serialDescriptor)) {
            this.a.add(str);
            return this;
        }
        kotlinx.serialization.json.b E5 = E(str);
        String a = serialDescriptor.a();
        if (E5 instanceof kotlinx.serialization.json.d) {
            String a6 = ((kotlinx.serialization.json.d) E5).a();
            N4.c cVar = this.f4328c;
            AbstractC1276k.f(cVar, "json");
            AbstractC1276k.f(a6, "source");
            return new h(new L1.l(a6), cVar);
        }
        throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of " + a + " at element: " + V(str));
    }

    public final int M(Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        if (E5 instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) E5;
            try {
                return N4.j.c(dVar);
            } catch (IllegalArgumentException unused) {
                W(dVar, "int", str);
                throw null;
            }
        }
        throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of int at element: " + V(str));
    }

    public final long N(Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        if (E5 instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) E5;
            try {
                return N4.j.f(dVar);
            } catch (IllegalArgumentException unused) {
                W(dVar, "long", str);
                throw null;
            }
        }
        throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of long at element: " + V(str));
    }

    public final short O(Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        if (!(E5 instanceof kotlinx.serialization.json.d)) {
            throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of short at element: " + V(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) E5;
        try {
            int c6 = N4.j.c(dVar);
            Short valueOf = (-32768 > c6 || c6 > 32767) ? null : Short.valueOf((short) c6);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            W(dVar, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(dVar, "short", str);
            throw null;
        }
    }

    public final String P(Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        if (!(E5 instanceof kotlinx.serialization.json.d)) {
            throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of string at element: " + V(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) E5;
        if (!(dVar instanceof N4.n)) {
            StringBuilder t5 = B3.e.t("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            t5.append(V(str));
            throw m.d(-1, F().toString(), t5.toString());
        }
        N4.n nVar = (N4.n) dVar;
        if (nVar.f3908c || this.f4328c.a.f3899c) {
            return nVar.f3909e;
        }
        StringBuilder t6 = B3.e.t("String literal for key '", str, "' should be quoted at element: ");
        t6.append(V(str));
        t6.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw m.d(-1, F().toString(), t6.toString());
    }

    public String Q(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return serialDescriptor.g(i6);
    }

    public final String R(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "<this>");
        String Q5 = Q(serialDescriptor, i6);
        AbstractC1276k.f(Q5, "nestedName");
        return Q5;
    }

    public abstract kotlinx.serialization.json.b S();

    public final Object T() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(Y4.l.C(arrayList));
        this.f4327b = true;
        return remove;
    }

    public final String U() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : Y3.m.v0(arrayList, ".", "$.", null, null, 60);
    }

    public final String V(String str) {
        AbstractC1276k.f(str, "currentTag");
        return U() + '.' + str;
    }

    public final void W(kotlinx.serialization.json.d dVar, String str, String str2) {
        throw m.d(-1, F().toString(), "Failed to parse literal '" + dVar + "' as " + (u4.u.D(str, FlexmarkHtmlConverter.I_NODE, false) ? "an " : "a ").concat(str) + " value at element: " + V(str2));
    }

    @Override // L4.a
    public final F2.h a() {
        return this.f4328c.f3883b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public L4.a b(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        kotlinx.serialization.json.b F5 = F();
        Y4.l e6 = serialDescriptor.e();
        boolean b5 = AbstractC1276k.b(e6, K4.k.f2977f);
        N4.c cVar = this.f4328c;
        if (b5 || (e6 instanceof K4.d)) {
            String a = serialDescriptor.a();
            if (F5 instanceof kotlinx.serialization.json.a) {
                return new q(cVar, (kotlinx.serialization.json.a) F5);
            }
            throw m.d(-1, F5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.a.class).c() + ", but had " + AbstractC1289x.a(F5.getClass()).c() + " as the serialized body of " + a + " at element: " + U());
        }
        if (!AbstractC1276k.b(e6, K4.k.f2978g)) {
            String a6 = serialDescriptor.a();
            if (F5 instanceof kotlinx.serialization.json.c) {
                return new p(cVar, (kotlinx.serialization.json.c) F5, this.f4329d, 8);
            }
            throw m.d(-1, F5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.c.class).c() + ", but had " + AbstractC1289x.a(F5.getClass()).c() + " as the serialized body of " + a6 + " at element: " + U());
        }
        SerialDescriptor f6 = m.f(serialDescriptor.j(0), cVar.f3883b);
        Y4.l e7 = f6.e();
        if ((e7 instanceof K4.f) || AbstractC1276k.b(e7, K4.j.f2975f)) {
            String a7 = serialDescriptor.a();
            if (F5 instanceof kotlinx.serialization.json.c) {
                return new r(cVar, (kotlinx.serialization.json.c) F5);
            }
            throw m.d(-1, F5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.c.class).c() + ", but had " + AbstractC1289x.a(F5.getClass()).c() + " as the serialized body of " + a7 + " at element: " + U());
        }
        if (!cVar.a.f3900d) {
            throw m.c(f6);
        }
        String a8 = serialDescriptor.a();
        if (F5 instanceof kotlinx.serialization.json.a) {
            return new q(cVar, (kotlinx.serialization.json.a) F5);
        }
        throw m.d(-1, F5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.a.class).c() + ", but had " + AbstractC1289x.a(F5.getClass()).c() + " as the serialized body of " + a8 + " at element: " + U());
    }

    @Override // L4.a
    public final Decoder c(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return L(R(e0Var, i6), e0Var.j(i6));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean d() {
        return G(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char e() {
        return I(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int f(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "enumDescriptor");
        String str = (String) T();
        AbstractC1276k.f(str, "tag");
        kotlinx.serialization.json.b E5 = E(str);
        String a = serialDescriptor.a();
        if (E5 instanceof kotlinx.serialization.json.d) {
            return m.j(serialDescriptor, this.f4328c, ((kotlinx.serialization.json.d) E5).a(), FlexmarkHtmlConverter.DEFAULT_NODE);
        }
        throw m.d(-1, E5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.d.class).c() + ", but had " + AbstractC1289x.a(E5.getClass()).c() + " as the serialized body of " + a + " at element: " + V(str));
    }

    @Override // L4.a
    public final long g(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return N(R(serialDescriptor, i6));
    }

    @Override // L4.a
    public void h(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
    }

    @Override // N4.i
    public final kotlinx.serialization.json.b i() {
        return F();
    }

    @Override // L4.a
    public final byte j(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return H(R(e0Var, i6));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int k() {
        return M(T());
    }

    @Override // L4.a
    public final int l(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return M(R(serialDescriptor, i6));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String m() {
        return P(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long n() {
        return N(T());
    }

    @Override // L4.a
    public final boolean o(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return G(R(serialDescriptor, i6));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object p(KSerializer kSerializer) {
        String str;
        AbstractC1276k.f(kSerializer, "deserializer");
        if (!(kSerializer instanceof I4.c)) {
            return kSerializer.deserialize(this);
        }
        N4.c cVar = this.f4328c;
        N4.h hVar = cVar.a;
        I4.c cVar2 = (I4.c) kSerializer;
        String h3 = m.h(cVar, cVar2.getDescriptor());
        kotlinx.serialization.json.b F5 = F();
        String a = cVar2.getDescriptor().a();
        if (!(F5 instanceof kotlinx.serialization.json.c)) {
            throw m.d(-1, F5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.c.class).c() + ", but had " + AbstractC1289x.a(F5.getClass()).c() + " as the serialized body of " + a + " at element: " + U());
        }
        kotlinx.serialization.json.c cVar3 = (kotlinx.serialization.json.c) F5;
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar3.get(h3);
        try {
            if (bVar != null) {
                kotlinx.serialization.json.d e6 = N4.j.e(bVar);
                if (!(e6 instanceof JsonNull)) {
                    str = e6.a();
                    h5.e.T((I4.c) kSerializer, this, str);
                    throw null;
                }
            }
            h5.e.T((I4.c) kSerializer, this, str);
            throw null;
        } catch (I4.e e7) {
            String message = e7.getMessage();
            AbstractC1276k.c(message);
            throw m.d(-1, cVar3.toString(), message);
        }
        str = null;
    }

    @Override // L4.a
    public final String q(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return P(R(serialDescriptor, i6));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean r() {
        return !(F() instanceof JsonNull);
    }

    @Override // L4.a
    public final Object t(SerialDescriptor serialDescriptor, int i6, KSerializer kSerializer, Object obj) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        AbstractC1276k.f(kSerializer, "deserializer");
        this.a.add(R(serialDescriptor, i6));
        Object p5 = (kSerializer.getDescriptor().c() || r()) ? p(kSerializer) : null;
        if (!this.f4327b) {
            T();
        }
        this.f4327b = false;
        return p5;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder u(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        if (Y3.m.x0(this.a) != null) {
            return L(T(), serialDescriptor);
        }
        return new o(this.f4328c, S(), this.f4329d).u(serialDescriptor);
    }

    @Override // L4.a
    public final char v(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return I(R(e0Var, i6));
    }

    @Override // L4.a
    public final short w(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return O(R(e0Var, i6));
    }

    @Override // L4.a
    public final Object x(SerialDescriptor serialDescriptor, int i6, KSerializer kSerializer, Object obj) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        AbstractC1276k.f(kSerializer, "deserializer");
        this.a.add(R(serialDescriptor, i6));
        AbstractC1276k.f(kSerializer, "deserializer");
        Object p5 = p(kSerializer);
        if (!this.f4327b) {
            T();
        }
        this.f4327b = false;
        return p5;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte y() {
        return H(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short z() {
        return O(T());
    }
}
