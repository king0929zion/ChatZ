package I0;

import android.os.Looper;
import android.view.Choreographer;
import i4.AbstractC1120d;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class V extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ V(int i6) {
        this.a = i6;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                X x5 = new X(choreographer, AbstractC1120d.i(myLooper));
                return Y4.d.P(x5, x5.f2264o);
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(R4.b.f7081d);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
