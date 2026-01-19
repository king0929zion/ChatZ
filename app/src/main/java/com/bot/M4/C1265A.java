package m4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import f0.C0990m;
import i4.AbstractC1117a;
import j1.AbstractC1135a;
import java.util.Collections;
import java.util.List;
import s4.InterfaceC1672b;

/* renamed from: m4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265A implements s4.f {
    public final C1270e a;

    public C1265A(C1270e c1270e) {
        AbstractC1276k.f(Collections.EMPTY_LIST, "arguments");
        this.a = c1270e;
    }

    @Override // s4.f
    public final boolean a() {
        return false;
    }

    @Override // s4.f
    public final List b() {
        return Collections.EMPTY_LIST;
    }

    @Override // s4.f
    public final InterfaceC1672b c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1265A)) {
            return false;
        }
        if (!this.a.equals(((C1265A) obj).a)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return AbstractC1276k.b(list, list);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC1135a.e(Collections.EMPTY_LIST, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Class o5 = AbstractC1117a.o(this.a);
        String name = o5.isArray() ? o5.equals(boolean[].class) ? "kotlin.BooleanArray" : o5.equals(char[].class) ? "kotlin.CharArray" : o5.equals(byte[].class) ? "kotlin.ByteArray" : o5.equals(short[].class) ? "kotlin.ShortArray" : o5.equals(int[].class) ? "kotlin.IntArray" : o5.equals(float[].class) ? "kotlin.FloatArray" : o5.equals(long[].class) ? "kotlin.LongArray" : o5.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : o5.getName();
        List list = Collections.EMPTY_LIST;
        sb.append(name + (list.isEmpty() ? FlexmarkHtmlConverter.DEFAULT_NODE : Y3.m.v0(list, ", ", "<", ">", new C0990m(3), 24)) + FlexmarkHtmlConverter.DEFAULT_NODE);
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
