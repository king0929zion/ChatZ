package A2;

import I1.B;
import I1.k;
import L1.i;
import Y3.C;
import Y3.j;
import android.content.Context;
import android.os.Bundle;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f111c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f112e;

    public /* synthetic */ b(Context context, int i6) {
        this.f111c = i6;
        this.f112e = context;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        Boolean bool;
        switch (this.f111c) {
            case 0:
                String str = (String) obj;
                AbstractC1276k.f(str, "it");
                return this.f112e.getDatabasePath(str);
            default:
                Bundle bundle = (Bundle) obj;
                B l3 = AbstractC1410a.l(this.f112e);
                if (bundle != null) {
                    bundle.setClassLoader(l3.a.getClassLoader());
                }
                i iVar = l3.f2518b;
                LinkedHashMap linkedHashMap = iVar.f3026m;
                if (bundle == null) {
                    bool = null;
                } else {
                    iVar.f3017d = bundle.containsKey("android-support-nav:controller:navigatorState") ? C.t("android-support-nav:controller:navigatorState", bundle) : null;
                    iVar.f3018e = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) C.u("android-support-nav:controller:backStack", bundle).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            h5.e.a0("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            h5.e.a0("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < length) {
                            int i8 = i7 + 1;
                            iVar.f3025l.put(Integer.valueOf(intArray[i6]), !AbstractC1276k.b(stringArrayList.get(i7), FlexmarkHtmlConverter.DEFAULT_NODE) ? stringArrayList.get(i7) : null);
                            i6++;
                            i7 = i8;
                        }
                    }
                    bool = null;
                    if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            h5.e.a0("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        int size = stringArrayList2.size();
                        int i9 = 0;
                        while (i9 < size) {
                            String str2 = stringArrayList2.get(i9);
                            i9++;
                            String str3 = str2;
                            String str4 = "android-support-nav:controller:backStackStates:" + str3;
                            AbstractC1276k.f(str4, "key");
                            if (bundle.containsKey(str4)) {
                                ArrayList u5 = C.u("android-support-nav:controller:backStackStates:" + str3, bundle);
                                j jVar = new j(u5.size());
                                int size2 = u5.size();
                                int i10 = 0;
                                while (i10 < size2) {
                                    Object obj2 = u5.get(i10);
                                    i10++;
                                    jVar.addLast(new k((Bundle) obj2));
                                }
                                linkedHashMap.put(str3, jVar);
                            }
                        }
                    }
                }
                if (bundle != null) {
                    boolean z5 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z5 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z5) : bool;
                    l3.f2521e = valueOf != null ? valueOf.booleanValue() : false;
                }
                return l3;
        }
    }
}
