package A1;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: c, reason: collision with root package name */
    public long f58c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f59e;

    public a(f fVar) {
        this.f59e = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j4 = this.f58c;
            f fVar = this.f59e;
            if (j4 != j3) {
                if (j4 >= 0 && j3 >= j4 + fVar.f60c.available()) {
                    return -1;
                }
                fVar.d(j3);
                this.f58c = j3;
            }
            if (i7 > fVar.f60c.available()) {
                i7 = fVar.f60c.available();
            }
            int read = fVar.read(bArr, i6, i7);
            if (read >= 0) {
                this.f58c += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f58c = -1L;
        return -1;
    }
}
