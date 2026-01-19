package I1;

import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f2537b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(H h3) {
        AbstractC1276k.f(h3, "navigator");
        String d6 = AbstractC0230i.d(h3.getClass());
        if (d6.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.a;
        H h6 = (H) linkedHashMap.get(d6);
        if (AbstractC1276k.b(h6, h3)) {
            return;
        }
        if (h6 != null && h6.f2536b) {
            throw new IllegalStateException(("Navigator " + h3 + " is replacing an already attached " + h6).toString());
        }
        if (!h3.f2536b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + h3 + " is already attached to another NavController").toString());
    }

    public final H b(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        H h3 = (H) this.a.get(str);
        if (h3 != null) {
            return h3;
        }
        throw new IllegalStateException(AbstractC1135a.s("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
