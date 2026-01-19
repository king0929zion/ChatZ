package h0;

import m4.AbstractC1277l;

/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034k extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public static final C1034k f11803e = new AbstractC1277l(2);

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC1039p interfaceC1039p = (InterfaceC1039p) obj2;
        if (str.length() == 0) {
            return interfaceC1039p.toString();
        }
        return str + ", " + interfaceC1039p;
    }
}
