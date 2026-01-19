package J3;

import I3.C0241e;
import I3.w;
import Y4.l;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import m4.AbstractC1276k;
import u4.AbstractC1763a;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class e extends b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C0241e f2907b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2908c;

    public e(String str, C0241e c0241e) {
        byte[] c6;
        AbstractC1276k.f(str, "text");
        AbstractC1276k.f(c0241e, "contentType");
        this.a = str;
        this.f2907b = c0241e;
        Charset q3 = l.q(c0241e);
        q3 = q3 == null ? AbstractC1763a.a : q3;
        if (AbstractC1276k.b(q3, AbstractC1763a.a)) {
            AbstractC1276k.f(str, "<this>");
            c6 = str.getBytes(AbstractC1763a.a);
            AbstractC1276k.e(c6, "getBytes(...)");
        } else {
            CharsetEncoder newEncoder = q3.newEncoder();
            AbstractC1276k.e(newEncoder, "charset.newEncoder()");
            c6 = T3.a.c(newEncoder, str, str.length());
        }
        this.f2908c = c6;
    }

    @Override // J3.d
    public final Long a() {
        return Long.valueOf(this.f2908c.length);
    }

    @Override // J3.d
    public final C0241e b() {
        return this.f2907b;
    }

    @Override // J3.d
    public final w d() {
        return null;
    }

    @Override // J3.b
    public final byte[] e() {
        return this.f2908c;
    }

    public final String toString() {
        return "TextContent[" + this.f2907b + "] \"" + AbstractC1776n.j0(30, this.a) + '\"';
    }
}
