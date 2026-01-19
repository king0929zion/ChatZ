package P2;

import android.net.Uri;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class X implements InterfaceC0346c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.a f4809b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4810c;

    public X(int i6, L2.a aVar) {
        String uri;
        AbstractC1276k.f(aVar, "state");
        this.a = i6;
        this.f4809b = aVar;
        Uri uri2 = aVar.a;
        this.f4810c = "file-" + i6 + "-" + ((uri2 == null || (uri = uri2.toString()) == null) ? aVar.f3050b : uri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x5 = (X) obj;
        return this.a == x5.a && AbstractC1276k.b(this.f4809b, x5.f4809b);
    }

    @Override // P2.InterfaceC0346c
    public final String getKey() {
        return this.f4810c;
    }

    public final int hashCode() {
        return this.f4809b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FileAttachmentItemEntry(index=" + this.a + ", state=" + this.f4809b + ")";
    }
}
