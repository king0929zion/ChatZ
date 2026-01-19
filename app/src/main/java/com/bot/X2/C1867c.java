package x2;

import java.util.Collections;
import java.util.LinkedHashMap;
import o3.InterfaceC1409a;
import r3.InterfaceC1634a;
import s3.C1670b;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1867c implements InterfaceC1876l, InterfaceC1409a, o3.f, InterfaceC1634a {
    public final C1871g a;

    /* renamed from: b, reason: collision with root package name */
    public final C1869e f15569b;

    public C1867c(C1871g c1871g, C1869e c1869e) {
        this.a = c1871g;
        this.f15569b = c1869e;
    }

    public final C1670b a() {
        F1.e eVar = new F1.e(5);
        Boolean bool = Boolean.TRUE;
        LinkedHashMap linkedHashMap = eVar.a;
        linkedHashMap.put("X2.g", bool);
        linkedHashMap.put("X2.L", bool);
        linkedHashMap.put("a3.g", bool);
        linkedHashMap.put("a3.w", bool);
        linkedHashMap.put("a3.F", bool);
        linkedHashMap.put("a3.I", bool);
        linkedHashMap.put("X2.Y", bool);
        return new C1670b(linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap));
    }
}
