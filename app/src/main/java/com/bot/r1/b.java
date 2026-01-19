package r1;

import H0.C;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k.C1175w;
import n1.AbstractC1358b;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public abstract class b {
    public static final C1175w a = new C1175w(2);

    /* renamed from: b, reason: collision with root package name */
    public static final C f14645b = new C(5);

    public static C0.c a(Context context, List list) {
        AbstractC1410a.g("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < list.size(); i6++) {
                c cVar = (c) list.get(i6);
                ProviderInfo b5 = b(context.getPackageManager(), cVar, context.getResources());
                if (b5 == null) {
                    return new C0.c(6, (byte) 0);
                }
                arrayList.add(c(context, cVar, b5.authority));
            }
            return new C0.c(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [r1.a, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, c cVar, Resources resources) {
        C c6 = f14645b;
        C1175w c1175w = a;
        AbstractC1410a.g("FontProvider.getProvider");
        try {
            List list = cVar.f14648d;
            String str = cVar.a;
            String str2 = cVar.f14646b;
            if (list == null) {
                list = AbstractC1358b.f(resources, 0);
            }
            ?? obj = new Object();
            obj.a = str;
            obj.f14643b = str2;
            obj.f14644c = list;
            ProviderInfo providerInfo = (ProviderInfo) c1175w.b(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c6);
            for (int i6 = 0; i6 < list.size(); i6++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i6));
                Collections.sort(arrayList2, c6);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i7), (byte[]) arrayList2.get(i7))) {
                            break;
                        }
                    }
                    c1175w.c(obj, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static d[] c(Context context, c cVar, String str) {
        AbstractC1410a.g("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC1410a.g("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {cVar.f14647c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e6) {
                            Log.w("FontsProvider", "Unable to query the content provider", e6);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i6 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new d(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i6));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (d[]) arrayList.toArray(new d[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
