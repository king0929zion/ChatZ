package androidx.emoji2.text;

import L1.e;
import N1.w;
import android.content.Context;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.O;
import androidx.lifecycle.ProcessLifecycleInitializer;
import b2.C0883a;
import b2.InterfaceC0884b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import y1.j;
import y1.k;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0884b {
    @Override // b2.InterfaceC0884b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [N1.w, y1.s] */
    @Override // b2.InterfaceC0884b
    public final Object b(Context context) {
        Object obj;
        ?? wVar = new w(new e(context));
        wVar.a = 1;
        if (j.f15974k == null) {
            synchronized (j.f15973j) {
                try {
                    if (j.f15974k == null) {
                        j.f15974k = new j(wVar);
                    }
                } finally {
                }
            }
        }
        C0883a c6 = C0883a.c(context);
        c6.getClass();
        synchronized (C0883a.f11002e) {
            try {
                obj = c6.a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c6.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        O g3 = ((InterfaceC0846u) obj).g();
        g3.a(new k(this, g3));
        return Boolean.TRUE;
    }
}
