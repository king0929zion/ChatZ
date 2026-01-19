package P2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import b4.InterfaceC0905c;
import j1.AbstractC1135a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* renamed from: P2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370o extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f4999h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Uri f5000i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0370o(Context context, Uri uri, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4999h = context;
        this.f5000i = uri;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0370o) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0370o(this.f4999h, this.f5000i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        byte[] byteArray;
        X3.a.e(obj);
        InputStream openInputStream = this.f4999h.getContentResolver().openInputStream(this.f5000i);
        if (openInputStream == null) {
            throw new Exception("无法打开 URI");
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
        openInputStream.close();
        if (decodeStream == null) {
            throw new Exception("无法读取图片");
        }
        int i6 = 100;
        do {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeStream.compress(Bitmap.CompressFormat.JPEG, i6, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            AbstractC1276k.e(byteArray, "toByteArray(...)");
            byteArrayOutputStream.close();
            i6 -= 5;
            if (byteArray.length <= 204800) {
                break;
            }
        } while (i6 > 10);
        return AbstractC1135a.f("data:image/jpeg;base64,", Base64.encodeToString(byteArray, 2));
    }
}
