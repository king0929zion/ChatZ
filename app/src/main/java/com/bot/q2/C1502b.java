package q2;

import android.graphics.Bitmap;
import java.util.Map;
import m4.AbstractC1276k;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1502b {
    public final Bitmap a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13952b;

    public C1502b(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.f13952b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1502b)) {
            return false;
        }
        C1502b c1502b = (C1502b) obj;
        return AbstractC1276k.b(this.a, c1502b.a) && AbstractC1276k.b(this.f13952b, c1502b.f13952b);
    }

    public final int hashCode() {
        return this.f13952b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.f13952b + ')';
    }
}
