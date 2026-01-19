package p2;

import Q4.p;
import Y3.m;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import m4.AbstractC1276k;
import s2.C1665m;
import u4.AbstractC1776n;
import w2.AbstractC1835e;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485a {
    public final /* synthetic */ int a;

    public /* synthetic */ C1485a(int i6) {
        this.a = i6;
    }

    public final Object a(Object obj, C1665m c1665m) {
        String scheme;
        String authority;
        switch (this.a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!AbstractC1835e.c(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = FlexmarkHtmlConverter.DEFAULT_NODE;
                    }
                    if (AbstractC1776n.d0(path, '/') && ((String) m.q0(uri.getPathSegments())) != null) {
                        if (!AbstractC1276k.b(uri.getScheme(), "file")) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((p) obj).f6571h;
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = c1665m.a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!AbstractC1276k.b(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || AbstractC1776n.Q(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                Resources resourcesForApplication = c1665m.a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
