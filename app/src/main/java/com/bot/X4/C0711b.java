package X4;

import androidx.lifecycle.N;
import com.vladsch.flexmark.util.html.Attribute;
import d5.C0952l;
import m4.AbstractC1276k;

/* renamed from: X4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0952l f9418d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0952l f9419e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0952l f9420f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0952l f9421g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0952l f9422h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0952l f9423i;
    public final C0952l a;

    /* renamed from: b, reason: collision with root package name */
    public final C0952l f9424b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9425c;

    static {
        C0952l c0952l = C0952l.f11483g;
        f9418d = N.q(":");
        f9419e = N.q(":status");
        f9420f = N.q(":method");
        f9421g = N.q(":path");
        f9422h = N.q(":scheme");
        f9423i = N.q(":authority");
    }

    public C0711b(C0952l c0952l, C0952l c0952l2) {
        AbstractC1276k.f(c0952l, Attribute.NAME_ATTR);
        AbstractC1276k.f(c0952l2, "value");
        this.a = c0952l;
        this.f9424b = c0952l2;
        this.f9425c = c0952l2.d() + c0952l.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0711b)) {
            return false;
        }
        C0711b c0711b = (C0711b) obj;
        return AbstractC1276k.b(this.a, c0711b.a) && AbstractC1276k.b(this.f9424b, c0711b.f9424b);
    }

    public final int hashCode() {
        return this.f9424b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.q() + ": " + this.f9424b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0711b(String str, String str2) {
        this(N.q(str), N.q(str2));
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(str2, "value");
        C0952l c0952l = C0952l.f11483g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0711b(C0952l c0952l, String str) {
        this(c0952l, N.q(str));
        AbstractC1276k.f(c0952l, Attribute.NAME_ATTR);
        AbstractC1276k.f(str, "value");
        C0952l c0952l2 = C0952l.f11483g;
    }
}
