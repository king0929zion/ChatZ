package p;

import android.os.Build;
import h0.C1038o;
import h0.InterfaceC1041r;

/* loaded from: classes.dex */
public abstract class w0 {
    public static final P0.w a = new P0.w("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static InterfaceC1041r b(l4.c cVar, l4.c cVar2, H0 h02) {
        return a() ? new C1457s0(cVar, cVar2, h02) : C1038o.a;
    }
}
