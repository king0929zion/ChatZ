package f;

import X3.i;
import Y3.B;
import Y3.C;
import Y3.m;
import Y3.n;
import Y3.v;
import Y3.w;
import Y4.l;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bot.MainActivity;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import e.C0954b;
import e.k;
import i4.AbstractC1121e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970a extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0970a(int i6) {
        super(28);
        this.f11640e = i6;
    }

    @Override // Y4.l
    public A3.c D(MainActivity mainActivity, Object obj) {
        switch (this.f11640e) {
            case 0:
                AbstractC1276k.f((String) obj, FlexmarkHtmlConverter.INPUT_NODE);
                return null;
            case 1:
                AbstractC1276k.f((String[]) obj, FlexmarkHtmlConverter.INPUT_NODE);
                return null;
            case 2:
                AbstractC1276k.f((k) obj, FlexmarkHtmlConverter.INPUT_NODE);
                return null;
            case 3:
                String[] strArr = (String[]) obj;
                AbstractC1276k.f(strArr, FlexmarkHtmlConverter.INPUT_NODE);
                if (strArr.length == 0) {
                    return new A3.c(w.f9813c, 29);
                }
                for (String str : strArr) {
                    if (AbstractC1121e.g(mainActivity, str) != 0) {
                        return null;
                    }
                }
                int H3 = C.H(strArr.length);
                if (H3 < 16) {
                    H3 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(H3);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new A3.c(linkedHashMap, 29);
            case 4:
                String str3 = (String) obj;
                AbstractC1276k.f(str3, FlexmarkHtmlConverter.INPUT_NODE);
                if (AbstractC1121e.g(mainActivity, str3) == 0) {
                    return new A3.c(Boolean.TRUE, 29);
                }
                return null;
            case AbstractC1787b.f15290g /* 5 */:
            default:
                return super.D(mainActivity, obj);
            case 6:
                return null;
        }
    }

    @Override // Y4.l
    public final Object M(Intent intent, int i6) {
        List arrayList;
        switch (this.f11640e) {
            case 0:
                if (i6 != -1) {
                    intent = null;
                }
                v vVar = v.f9812c;
                if (intent == null) {
                    return vVar;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return vVar;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i7 = 0; i7 < itemCount; i7++) {
                        Uri uri = clipData.getItemAt(i7).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            case 1:
                if (i6 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Uri data2 = intent.getData();
                    if (data2 != null) {
                        linkedHashSet2.add(data2);
                    }
                    ClipData clipData2 = intent.getClipData();
                    if (clipData2 != null || !linkedHashSet2.isEmpty()) {
                        if (clipData2 != null) {
                            int itemCount2 = clipData2.getItemCount();
                            for (int i8 = 0; i8 < itemCount2; i8++) {
                                Uri uri2 = clipData2.getItemAt(i8).getUri();
                                if (uri2 != null) {
                                    linkedHashSet2.add(uri2);
                                }
                            }
                        }
                        return new ArrayList(linkedHashSet2);
                    }
                }
                return v.f9812c;
            case 2:
                if (i6 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data3 = intent.getData();
                if (data3 != null) {
                    return data3;
                }
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                Uri data4 = intent.getData();
                if (data4 != null) {
                    linkedHashSet3.add(data4);
                }
                ClipData clipData3 = intent.getClipData();
                if (clipData3 == null && linkedHashSet3.isEmpty()) {
                    arrayList = v.f9812c;
                } else {
                    if (clipData3 != null) {
                        int itemCount3 = clipData3.getItemCount();
                        for (int i9 = 0; i9 < itemCount3; i9++) {
                            Uri uri3 = clipData3.getItemAt(i9).getUri();
                            if (uri3 != null) {
                                linkedHashSet3.add(uri3);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet3);
                }
                return (Uri) m.q0(arrayList);
            case 3:
                if (i6 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i10 == 0));
                        }
                        ArrayList r02 = Y3.k.r0(stringArrayExtra);
                        Iterator it = r02.iterator();
                        Iterator it2 = arrayList2.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(n.Z(r02, 10), n.Z(arrayList2, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new i(it.next(), it2.next()));
                        }
                        return B.c0(arrayList3);
                    }
                }
                return w.f9813c;
            case 4:
                if (intent == null || i6 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z5 = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            if (intArrayExtra2[i11] == 0) {
                                z5 = true;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z5);
            case AbstractC1787b.f15290g /* 5 */:
                return new C0954b(intent, i6);
            default:
                if (i6 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return (Bitmap) intent.getParcelableExtra("data");
                }
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r0 >= 2) goto L19;
     */
    @Override // Y4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent v(com.bot.MainActivity r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.C0970a.v(com.bot.MainActivity, java.lang.Object):android.content.Intent");
    }
}
