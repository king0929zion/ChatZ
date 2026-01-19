package A1;

import com.vladsch.flexmark.util.format.TableCell;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f60c.mark(TableCell.NOT_TRACKED);
    }

    public final void d(long j3) {
        int i6 = this.f61e;
        if (i6 > j3) {
            this.f61e = 0;
            this.f60c.reset();
        } else {
            j3 -= i6;
        }
        c((int) j3);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f60c.mark(TableCell.NOT_TRACKED);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
