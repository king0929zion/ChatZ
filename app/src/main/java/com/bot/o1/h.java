package o1;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import io.ktor.utils.io.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h extends u {
    public static FontFamily p(r1.d[] dVarArr, ContentResolver contentResolver) {
        int i6;
        ParcelFileDescriptor openFileDescriptor;
        int length = dVarArr.length;
        FontFamily.Builder builder = null;
        while (i6 < length) {
            r1.d dVar = dVarArr[i6];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(dVar.a, "r", null);
            } catch (IOException e6) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            }
            if (openFileDescriptor != null) {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(dVar.f14650c).setSlant(dVar.f14651d ? 1 : 0).setTtcIndex(dVar.f14649b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            } else {
                i6 = openFileDescriptor == null ? i6 + 1 : 0;
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int q(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // io.ktor.utils.io.u
    public final Typeface g(Context context, r1.d[] dVarArr) {
        try {
            FontFamily p5 = p(dVarArr, context.getContentResolver());
            if (p5 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(p5);
            FontStyle fontStyle = new FontStyle(400, 0);
            Font font = p5.getFont(0);
            int q3 = q(fontStyle, font.getStyle());
            for (int i6 = 1; i6 < p5.getSize(); i6++) {
                Font font2 = p5.getFont(i6);
                int q5 = q(fontStyle, font2.getStyle());
                if (q5 < q3) {
                    font = font2;
                    q3 = q5;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // io.ktor.utils.io.u
    public final r1.d i(r1.d[] dVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
