package o2;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import m4.AbstractC1276k;
import s2.C1665m;
import w2.AbstractC1835e;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1408c implements InterfaceC1407b {
    @Override // o2.InterfaceC1407b
    public final String a(Object obj, C1665m c1665m) {
        Uri uri = (Uri) obj;
        if (!AbstractC1276k.b(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = c1665m.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = AbstractC1835e.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
