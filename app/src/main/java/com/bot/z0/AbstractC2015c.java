package z0;

import android.view.KeyEvent;
import h0.InterfaceC1041r;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2015c {
    public static final long a(int i6) {
        long j3 = (i6 << 32) | (0 & 4294967295L);
        int i7 = AbstractC2013a.f16191F;
        return j3;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final InterfaceC1041r d(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new d(cVar, null));
    }

    public static final InterfaceC1041r e(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new d(null, cVar));
    }
}
