package b;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.InterfaceC0844s;
import com.bot.MainActivity;
import e.C0954b;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import p.O0;
import t4.C1729a;

/* renamed from: b.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0867k {
    public final LinkedHashMap a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10922b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f10923c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10924d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f10925e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f10926f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f10927g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MainActivity f10928h;

    public C0867k(MainActivity mainActivity) {
        this.f10928h = mainActivity;
    }

    public final boolean a(int i6, int i7, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        e.e eVar = (e.e) this.f10925e.get(str);
        if ((eVar != null ? eVar.a : null) != null) {
            ArrayList arrayList = this.f10924d;
            if (arrayList.contains(str)) {
                eVar.a.a(eVar.f11527b.M(intent, i7));
                arrayList.remove(str);
                return true;
            }
        }
        this.f10926f.remove(str);
        this.f10927g.putParcelable(str, new C0954b(intent, i7));
        return true;
    }

    public final void b(int i6, Y4.l lVar, Object obj) {
        Bundle bundle;
        int i7;
        MainActivity mainActivity = this.f10928h;
        A3.c D4 = lVar.D(mainActivity, obj);
        if (D4 != null) {
            new Handler(Looper.getMainLooper()).post(new M1.a(i6, 1, this, D4));
            return;
        }
        Intent v5 = lVar.v(mainActivity, obj);
        if (v5.getExtras() != null) {
            Bundle extras = v5.getExtras();
            AbstractC1276k.c(extras);
            if (extras.getClassLoader() == null) {
                v5.setExtrasClassLoader(mainActivity.getClassLoader());
            }
        }
        if (v5.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = v5.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            v5.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(v5.getAction())) {
            String[] stringArrayExtra = v5.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i8 = 0; i8 < stringArrayExtra.length; i8++) {
                if (TextUtils.isEmpty(stringArrayExtra[i8])) {
                    throw new IllegalArgumentException(B3.e.s(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i8], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i8));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < stringArrayExtra.length; i10++) {
                    if (!hashSet.contains(Integer.valueOf(i10))) {
                        strArr[i9] = stringArrayExtra[i10];
                        i9++;
                    }
                }
            }
            mainActivity.requestPermissions(stringArrayExtra, i6);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(v5.getAction())) {
            mainActivity.startActivityForResult(v5, i6, bundle2);
            return;
        }
        e.j jVar = (e.j) v5.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            AbstractC1276k.c(jVar);
            i7 = i6;
            try {
                mainActivity.startIntentSenderForResult(jVar.f11534c, i7, jVar.f11535e, jVar.f11536f, jVar.f11537g, 0, bundle2);
            } catch (IntentSender.SendIntentException e6) {
                e = e6;
                new Handler(Looper.getMainLooper()).post(new M1.a(i7, 2, this, e));
            }
        } catch (IntentSender.SendIntentException e7) {
            e = e7;
            i7 = i6;
        }
    }

    public final void c(String str) {
        LinkedHashMap linkedHashMap = this.f10922b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new C1729a(new t4.g(e.g.f11529e, new O0(9))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void d(String str) {
        Integer num;
        AbstractC1276k.f(str, "key");
        if (!this.f10924d.contains(str) && (num = (Integer) this.f10922b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.f10925e.remove(str);
        LinkedHashMap linkedHashMap = this.f10926f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder t5 = B3.e.t("Dropping pending result for request ", str, ": ");
            t5.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", t5.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f10927g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0954b) AbstractC1117a.q(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f10923c;
        e.f fVar = (e.f) linkedHashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f11528b;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                fVar.a.j((InterfaceC0844s) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
