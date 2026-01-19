package U1;

import M.q;
import android.os.Bundle;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import b.C0865i;
import com.bot.MainActivity;
import j1.AbstractC1135a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b implements InterfaceC0844s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8604c;

    /* renamed from: e, reason: collision with root package name */
    public final e f8605e;

    public /* synthetic */ b(e eVar, int i6) {
        this.f8604c = i6;
        this.f8605e = eVar;
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        switch (this.f8604c) {
            case 0:
                if (enumC0841o != EnumC0841o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0846u.g().j(this);
                e eVar = this.f8605e;
                Bundle j3 = eVar.f().j("androidx.savedstate.Restarter");
                if (j3 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = j3.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    String str = stringArrayList.get(i6);
                    i6++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        AbstractC1276k.c(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                AbstractC1276k.c(newInstance);
                                if (!(eVar instanceof a0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + eVar).toString());
                                }
                                LinkedHashMap linkedHashMap = ((a0) eVar).e().a;
                                q f6 = eVar.f();
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    AbstractC1276k.f(str3, "key");
                                    U u5 = (U) linkedHashMap.get(str3);
                                    if (u5 != null) {
                                        O.b(u5, f6, eVar.g());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    f6.v();
                                }
                            } catch (Exception e6) {
                                throw new RuntimeException(AbstractC1135a.f("Failed to instantiate ", str2), e6);
                            }
                        } catch (NoSuchMethodException e7) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                        }
                    } catch (ClassNotFoundException e8) {
                        throw new RuntimeException(AbstractC1135a.s("Class ", str2, " wasn't found"), e8);
                    }
                }
                return;
            default:
                MainActivity mainActivity = (MainActivity) this.f8605e;
                if (mainActivity.f10936h == null) {
                    C0865i c0865i = (C0865i) mainActivity.getLastNonConfigurationInstance();
                    if (c0865i != null) {
                        mainActivity.f10936h = c0865i.a;
                    }
                    if (mainActivity.f10936h == null) {
                        mainActivity.f10936h = new Z();
                    }
                }
                mainActivity.f10932c.j(this);
                return;
        }
    }
}
