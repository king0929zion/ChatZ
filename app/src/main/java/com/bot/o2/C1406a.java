package o2;

import java.io.File;
import s2.C1665m;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1406a implements InterfaceC1407b {
    public final boolean a;

    public C1406a(boolean z5) {
        this.a = z5;
    }

    @Override // o2.InterfaceC1407b
    public final String a(Object obj, C1665m c1665m) {
        File file = (File) obj;
        if (!this.a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
