package P2;

import android.net.Uri;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Y implements InterfaceC0346c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.b f4811b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4812c;

    public Y(int i6, L2.b bVar) {
        String str;
        AbstractC1276k.f(bVar, "state");
        this.a = i6;
        this.f4811b = bVar;
        Uri uri = bVar.a;
        if ((uri == null || (str = uri.toString()) == null) && (str = bVar.f3055b) == null) {
            str = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        this.f4812c = "image-" + i6 + "-" + str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y5 = (Y) obj;
        return this.a == y5.a && AbstractC1276k.b(this.f4811b, y5.f4811b);
    }

    @Override // P2.InterfaceC0346c
    public final String getKey() {
        return this.f4812c;
    }

    public final int hashCode() {
        return this.f4811b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ImageAttachmentItem(index=" + this.a + ", state=" + this.f4811b + ")";
    }
}
