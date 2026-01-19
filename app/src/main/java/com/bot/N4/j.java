package N4;

import M4.AbstractC0252a0;
import M4.F;
import M4.n0;
import kotlinx.serialization.json.JsonNull;
import m4.AbstractC1276k;
import m4.AbstractC1289x;

/* loaded from: classes.dex */
public abstract class j {
    public static final F a = AbstractC0252a0.a("kotlinx.serialization.json.JsonUnquotedLiteral", n0.a);

    public static final kotlinx.serialization.json.d a(String str) {
        return str == null ? JsonNull.INSTANCE : new n(str, true);
    }

    public static final void b(String str, kotlinx.serialization.json.b bVar) {
        throw new IllegalArgumentException("Element " + AbstractC1289x.a(bVar.getClass()) + " is not a " + str);
    }

    public static final int c(kotlinx.serialization.json.d dVar) {
        AbstractC1276k.f(dVar, "<this>");
        try {
            long i6 = new L1.l(dVar.a()).i();
            if (-2147483648L <= i6 && i6 <= 2147483647L) {
                return (int) i6;
            }
            throw new NumberFormatException(dVar.a() + " is not an Int");
        } catch (O4.i e6) {
            throw new NumberFormatException(e6.getMessage());
        }
    }

    public static final kotlinx.serialization.json.c d(kotlinx.serialization.json.b bVar) {
        AbstractC1276k.f(bVar, "<this>");
        kotlinx.serialization.json.c cVar = bVar instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        b("JsonObject", bVar);
        throw null;
    }

    public static final kotlinx.serialization.json.d e(kotlinx.serialization.json.b bVar) {
        kotlinx.serialization.json.d dVar = bVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar : null;
        if (dVar != null) {
            return dVar;
        }
        b("JsonPrimitive", bVar);
        throw null;
    }

    public static final long f(kotlinx.serialization.json.d dVar) {
        AbstractC1276k.f(dVar, "<this>");
        try {
            return new L1.l(dVar.a()).i();
        } catch (O4.i e6) {
            throw new NumberFormatException(e6.getMessage());
        }
    }
}
