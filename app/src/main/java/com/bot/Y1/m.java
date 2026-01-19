package y1;

import android.os.Trace;
import q1.AbstractC1500a;

/* loaded from: classes.dex */
public final class m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i6 = AbstractC1500a.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.d()) {
                j.a().e();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i7 = AbstractC1500a.a;
            Trace.endSection();
            throw th;
        }
    }
}
