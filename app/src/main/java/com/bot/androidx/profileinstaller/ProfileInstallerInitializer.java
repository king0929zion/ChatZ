package androidx.profileinstaller;

import M1.h;
import android.content.Context;
import android.view.Choreographer;
import b2.InterfaceC0884b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0884b {
    @Override // b2.InterfaceC0884b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // b2.InterfaceC0884b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new h(this, context.getApplicationContext()));
        return new F2.h(8);
    }
}
