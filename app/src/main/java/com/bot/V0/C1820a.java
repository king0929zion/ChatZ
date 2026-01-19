package v0;

import B3.e;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import f0.C0987j;
import m4.AbstractC1276k;
import n1.AbstractC1358b;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1820a {
    public final XmlPullParser a;

    /* renamed from: b, reason: collision with root package name */
    public int f15373b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final C0987j f15374c;

    public C1820a(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        C0987j c0987j = new C0987j(22, false);
        c0987j.f11690e = new float[64];
        this.f15374c = c0987j;
    }

    public final float a(TypedArray typedArray, String str, int i6, float f6) {
        if (AbstractC1358b.b(this.a, str)) {
            f6 = typedArray.getFloat(i6, f6);
        }
        b(typedArray.getChangingConfigurations());
        return f6;
    }

    public final void b(int i6) {
        this.f15373b = i6 | this.f15373b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1820a)) {
            return false;
        }
        C1820a c1820a = (C1820a) obj;
        return AbstractC1276k.b(this.a, c1820a.a) && this.f15373b == c1820a.f15373b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15373b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return e.q(sb, this.f15373b, ')');
    }
}
