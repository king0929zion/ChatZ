package X2;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class U {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9230b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9231c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9232d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9233e;

    public U(long j3, boolean z5, float f6, long j4, long j5) {
        this.a = j3;
        this.f9230b = z5;
        this.f9231c = f6;
        this.f9232d = j4;
        this.f9233e = j5;
    }

    public static U a(U u5, boolean z5, float f6, long j3, long j4, int i6) {
        long j5 = u5.a;
        if ((i6 & 4) != 0) {
            f6 = u5.f9231c;
        }
        float f7 = f6;
        if ((i6 & 8) != 0) {
            j3 = u5.f9232d;
        }
        long j6 = j3;
        if ((i6 & 16) != 0) {
            j4 = u5.f9233e;
        }
        u5.getClass();
        return new U(j5, z5, f7, j6, j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u5 = (U) obj;
        return this.a == u5.a && this.f9230b == u5.f9230b && Float.compare(this.f9231c, u5.f9231c) == 0 && this.f9232d == u5.f9232d && this.f9233e == u5.f9233e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9233e) + AbstractC1135a.c(AbstractC1135a.a(this.f9231c, AbstractC1135a.d(Long.hashCode(this.a) * 31, 31, this.f9230b), 31), 31, this.f9232d);
    }

    public final String toString() {
        return "UpdateDownloadState(downloadId=" + this.a + ", isDownloading=" + this.f9230b + ", downloadProgress=" + this.f9231c + ", downloadedBytes=" + this.f9232d + ", totalBytes=" + this.f9233e + ")";
    }
}
