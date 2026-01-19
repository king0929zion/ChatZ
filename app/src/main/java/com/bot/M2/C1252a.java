package m2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import i2.C1115i;
import java.io.File;
import java.nio.ByteBuffer;
import m4.AbstractC1276k;
import s2.C1665m;
import v.AbstractC1787b;
import w2.AbstractC1835e;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1252a implements InterfaceC1257f {
    public final /* synthetic */ int a;

    public /* synthetic */ C1252a(int i6) {
        this.a = i6;
    }

    @Override // m2.InterfaceC1257f
    public final InterfaceC1258g a(Object obj, C1665m c1665m, C1115i c1115i) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if (AbstractC1835e.c(uri)) {
                    return new C1253b(uri, c1665m, 0);
                }
                return null;
            case 1:
                return new C1254c((Bitmap) obj, c1665m, 0);
            case 2:
                return new C1254c((ByteBuffer) obj, c1665m, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (AbstractC1276k.b(uri2.getScheme(), "content")) {
                    return new C1253b(uri2, c1665m, 1);
                }
                return null;
            case 4:
                return new C1254c((Drawable) obj, c1665m, 2);
            case AbstractC1787b.f15290g /* 5 */:
                return new C1259h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (AbstractC1276k.b(uri3.getScheme(), "android.resource")) {
                    return new C1253b(uri3, c1665m, 2);
                }
                return null;
        }
    }
}
