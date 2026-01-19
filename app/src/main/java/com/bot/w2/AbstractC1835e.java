package w2;

import Q4.n;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.format.TableCell;
import io.ktor.utils.io.u;
import java.io.Closeable;
import java.util.ArrayList;
import m4.AbstractC1276k;
import t2.C1717a;
import t2.EnumC1722f;
import u4.AbstractC1776n;

/* renamed from: w2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1835e {
    public static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f15400b = Bitmap.Config.HARDWARE;

    /* renamed from: c, reason: collision with root package name */
    public static final n f15401c = new n((String[]) new ArrayList(20).toArray(new String[0]));

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || AbstractC1776n.Q(str)) {
            return null;
        }
        String i02 = AbstractC1776n.i0(AbstractC1776n.i0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(AbstractC1776n.g0('.', AbstractC1776n.g0('/', i02, i02), FlexmarkHtmlConverter.DEFAULT_NODE));
    }

    public static final boolean c(Uri uri) {
        return AbstractC1276k.b(uri.getScheme(), "file") && AbstractC1276k.b((String) Y3.m.q0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(u uVar, EnumC1722f enumC1722f) {
        if (uVar instanceof C1717a) {
            return ((C1717a) uVar).f14900b;
        }
        int ordinal = enumC1722f.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return TableCell.NOT_TRACKED;
        }
        throw new RuntimeException();
    }
}
