package J1;

import A4.O;
import A4.g0;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import e0.InterfaceC0958c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import m4.AbstractC1276k;

/* renamed from: J1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246a extends U {

    /* renamed from: b, reason: collision with root package name */
    public final String f2827b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final String f2828c;

    /* renamed from: d, reason: collision with root package name */
    public A3.c f2829d;

    public C0246a(K k3) {
        Object obj;
        k3.getClass();
        E1.b bVar = k3.f10844b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) bVar.f1294d;
        try {
            O o5 = (O) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (o5 == null || (obj = ((g0) o5).getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) bVar.f1293c).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = UUID.randomUUID().toString();
            String str2 = this.f2827b;
            AbstractC1276k.f(str2, "key");
            if (str != null) {
                ArrayList arrayList = E1.c.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj2 = arrayList.get(i6);
                        i6++;
                        if (((Class) obj2).isInstance(str)) {
                        }
                    }
                }
                throw new IllegalArgumentException(("Can't put value with type " + str.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = E1.c.a;
            k3.a.get(str2);
            bVar.s(str, str2);
        }
        this.f2828c = str;
    }

    @Override // androidx.lifecycle.U
    public final void d() {
        A3.c cVar = this.f2829d;
        if (cVar == null) {
            AbstractC1276k.k("saveableStateHolderRef");
            throw null;
        }
        InterfaceC0958c interfaceC0958c = (InterfaceC0958c) ((WeakReference) cVar.f119e).get();
        if (interfaceC0958c != null) {
            interfaceC0958c.a(this.f2828c);
        }
        A3.c cVar2 = this.f2829d;
        if (cVar2 != null) {
            ((WeakReference) cVar2.f119e).clear();
        } else {
            AbstractC1276k.k("saveableStateHolderRef");
            throw null;
        }
    }
}
