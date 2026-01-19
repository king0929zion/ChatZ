package y1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.lifecycle.N;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1989c extends N {
    @Override // androidx.lifecycle.N
    public final Signature[] t(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
