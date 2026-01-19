package m2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import b4.InterfaceC0905c;
import d2.AbstractC0939a;
import io.ktor.utils.io.u;
import java.nio.ByteBuffer;
import k2.o;
import s2.C1665m;
import w2.AbstractC1835e;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254c implements InterfaceC1258g {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final C1665m f12926b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12927c;

    public /* synthetic */ C1254c(Object obj, C1665m c1665m, int i6) {
        this.a = i6;
        this.f12927c = obj;
        this.f12926b = c1665m;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [d5.k, d5.i, java.lang.Object] */
    @Override // m2.InterfaceC1258g
    public final Object a(InterfaceC0905c interfaceC0905c) {
        int i6 = this.a;
        k2.f fVar = k2.f.f12611e;
        Object obj = this.f12927c;
        C1665m c1665m = this.f12926b;
        switch (i6) {
            case 0:
                return new C1255d(new BitmapDrawable(c1665m.a.getResources(), (Bitmap) obj), false, fVar);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    Object obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = c1665m.a;
                    return new C1264m(new o(obj2, null), null, fVar);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = AbstractC1835e.a;
                boolean z5 = (drawable instanceof VectorDrawable) || (drawable instanceof AbstractC0939a);
                if (z5) {
                    drawable = new BitmapDrawable(c1665m.a.getResources(), u.f(drawable, c1665m.f14791b, c1665m.f14793d, c1665m.f14794e, c1665m.f14795f));
                }
                return new C1255d(drawable, z5, fVar);
        }
    }
}
