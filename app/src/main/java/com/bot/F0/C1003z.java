package f0;

import java.util.ConcurrentModificationException;
import java.util.Map;
import m4.AbstractC1276k;
import n4.InterfaceC1375d;

/* renamed from: f0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1003z implements Map.Entry, InterfaceC1375d {

    /* renamed from: c, reason: collision with root package name */
    public final Object f11750c;

    /* renamed from: e, reason: collision with root package name */
    public Object f11751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0971A f11752f;

    public C1003z(C0971A c0971a) {
        this.f11752f = c0971a;
        Map.Entry entry = c0971a.f11644g;
        AbstractC1276k.c(entry);
        this.f11750c = entry.getKey();
        Map.Entry entry2 = c0971a.f11644g;
        AbstractC1276k.c(entry2);
        this.f11751e = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11750c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11751e;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0971A c0971a = this.f11752f;
        if (c0971a.f11641c.e().f11721d != c0971a.f11643f) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f11751e;
        c0971a.f11641c.put(this.f11750c, obj);
        this.f11751e = obj;
        return obj2;
    }
}
