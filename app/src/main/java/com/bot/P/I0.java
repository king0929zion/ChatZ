package p;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public class I0 implements G0 {
    public final Magnifier a;

    public I0(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // p.G0
    public void a(long j3, long j4) {
        this.a.show(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (this.a.getHeight() & 4294967295L) | (this.a.getWidth() << 32);
    }

    public final void d() {
        this.a.update();
    }
}
