package L2;

import android.net.Uri;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a {
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3050b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f3051c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3052d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3053e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3054f;

    public a(Uri uri, String str, Long l3, String str2, boolean z5, boolean z6) {
        this.a = uri;
        this.f3050b = str;
        this.f3051c = l3;
        this.f3052d = str2;
        this.f3053e = z5;
        this.f3054f = z6;
    }

    public static a a(a aVar, String str, boolean z5, boolean z6, int i6) {
        Uri uri = aVar.a;
        String str2 = aVar.f3050b;
        Long l3 = aVar.f3051c;
        if ((i6 & 8) != 0) {
            str = aVar.f3052d;
        }
        aVar.getClass();
        aVar.getClass();
        return new a(uri, str2, l3, str, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.f3050b.equals(aVar.f3050b) && AbstractC1276k.b(this.f3051c, aVar.f3051c) && AbstractC1276k.b(this.f3052d, aVar.f3052d) && this.f3053e == aVar.f3053e && this.f3054f == aVar.f3054f;
    }

    public final int hashCode() {
        int e6 = B3.e.e(this.a.hashCode() * 31, 31, this.f3050b);
        Long l3 = this.f3051c;
        int hashCode = (e6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.f3052d;
        return Boolean.hashCode(this.f3054f) + AbstractC1135a.d((hashCode + (str != null ? str.hashCode() : 0)) * 961, 31, this.f3053e);
    }

    public final String toString() {
        return "FileAttachmentState(uri=" + this.a + ", fileName=" + this.f3050b + ", sizeBytes=" + this.f3051c + ", extractedText=" + this.f3052d + ", uploadedUrl=null, isLoading=" + this.f3053e + ", isError=" + this.f3054f + ")";
    }
}
