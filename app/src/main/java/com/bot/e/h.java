package e;

import Y4.l;
import b.C0867k;
import f.C0970a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends h5.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0867k f11531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f11532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f11533h;

    public /* synthetic */ h(C0867k c0867k, String str, l lVar, int i6) {
        this.f11530e = i6;
        this.f11531f = c0867k;
        this.f11532g = str;
        this.f11533h = lVar;
    }

    public final void n0(Object obj) {
        switch (this.f11530e) {
            case 0:
                C0867k c0867k = this.f11531f;
                LinkedHashMap linkedHashMap = c0867k.f10922b;
                ArrayList arrayList = c0867k.f10924d;
                String str = this.f11532g;
                Object obj2 = linkedHashMap.get(str);
                C0970a c0970a = (C0970a) this.f11533h;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + c0970a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    c0867k.b(intValue, c0970a, obj);
                    return;
                } catch (Exception e6) {
                    arrayList.remove(str);
                    throw e6;
                }
            default:
                C0867k c0867k2 = this.f11531f;
                LinkedHashMap linkedHashMap2 = c0867k2.f10922b;
                ArrayList arrayList2 = c0867k2.f10924d;
                String str2 = this.f11532g;
                Object obj3 = linkedHashMap2.get(str2);
                l lVar = this.f11533h;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + lVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    c0867k2.b(intValue2, lVar, obj);
                    return;
                } catch (Exception e7) {
                    arrayList2.remove(str2);
                    throw e7;
                }
        }
    }
}
