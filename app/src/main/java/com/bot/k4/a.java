package K4;

import Y3.v;
import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2941b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2942c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2943d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2944e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2945f;

    public a(String str) {
        AbstractC1276k.f(str, "serialName");
        this.a = str;
        this.f2941b = new ArrayList();
        this.f2942c = new HashSet();
        this.f2943d = new ArrayList();
        this.f2944e = new ArrayList();
        this.f2945f = new ArrayList();
    }

    public static void a(a aVar, String str, SerialDescriptor serialDescriptor) {
        aVar.getClass();
        AbstractC1276k.f(serialDescriptor, "descriptor");
        if (!aVar.f2942c.add(str)) {
            StringBuilder t5 = B3.e.t("Element with name '", str, "' is already registered in ");
            t5.append(aVar.a);
            throw new IllegalArgumentException(t5.toString().toString());
        }
        aVar.f2941b.add(str);
        aVar.f2943d.add(serialDescriptor);
        aVar.f2944e.add(v.f9812c);
        aVar.f2945f.add(false);
    }
}
