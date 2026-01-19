package E1;

import A4.O;
import A4.g0;
import U1.d;
import X3.i;
import Y3.B;
import android.os.Bundle;
import b.C0867k;
import com.bot.MainActivity;
import e0.g;
import i4.AbstractC1118b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1291b;

    public /* synthetic */ a(Object obj, int i6) {
        this.a = i6;
        this.f1291b = obj;
    }

    @Override // U1.d
    public final Bundle a() {
        i[] iVarArr;
        switch (this.a) {
            case 0:
                b bVar = (b) this.f1291b;
                for (Map.Entry entry : B.d0((LinkedHashMap) bVar.f1294d).entrySet()) {
                    bVar.s(((g0) ((O) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : B.d0((LinkedHashMap) bVar.f1292b).entrySet()) {
                    bVar.s(((d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.a;
                if (linkedHashMap.isEmpty()) {
                    iVarArr = new i[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new i((String) entry3.getKey(), entry3.getValue()));
                    }
                    iVarArr = (i[]) arrayList.toArray(new i[0]);
                }
                return AbstractC1118b.d((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
            case 1:
                Map c6 = ((g) this.f1291b).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry4 : c6.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            default:
                MainActivity mainActivity = (MainActivity) this.f1291b;
                Bundle bundle2 = new Bundle();
                C0867k c0867k = mainActivity.f10940l;
                c0867k.getClass();
                LinkedHashMap linkedHashMap2 = c0867k.f10922b;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap2.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap2.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0867k.f10924d));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0867k.f10927g));
                return bundle2;
        }
    }
}
