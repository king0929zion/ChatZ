package L2;

import android.net.Uri;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b {
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3055b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3056c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3057d;

    public b(Uri uri, String str, boolean z5, boolean z6) {
        this.a = uri;
        this.f3055b = str;
        this.f3056c = z5;
        this.f3057d = z6;
    }

    public static b a(b bVar, String str, boolean z5, int i6) {
        Uri uri = bVar.a;
        if ((i6 & 2) != 0) {
            str = bVar.f3055b;
        }
        bVar.getClass();
        return new b(uri, str, false, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC1276k.b(this.a, bVar.a) && AbstractC1276k.b(this.f3055b, bVar.f3055b) && this.f3056c == bVar.f3056c && this.f3057d == bVar.f3057d;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f3055b;
        return Boolean.hashCode(this.f3057d) + AbstractC1135a.d((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f3056c);
    }

    public final String toString() {
        return "ImageUploadState(uri=" + this.a + ", uploadedUrl=" + this.f3055b + ", isLoading=" + this.f3056c + ", isError=" + this.f3057d + ")";
    }
}
