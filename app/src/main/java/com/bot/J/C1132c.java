package j;

import androidx.lifecycle.C0847v;
import androidx.lifecycle.InterfaceC0845t;
import java.util.Map;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132c implements Map.Entry {

    /* renamed from: c, reason: collision with root package name */
    public final Object f12308c;

    /* renamed from: e, reason: collision with root package name */
    public final C0847v f12309e;

    /* renamed from: f, reason: collision with root package name */
    public C1132c f12310f;

    /* renamed from: g, reason: collision with root package name */
    public C1132c f12311g;

    public C1132c(InterfaceC0845t interfaceC0845t, C0847v c0847v) {
        this.f12308c = interfaceC0845t;
        this.f12309e = c0847v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1132c)) {
            return false;
        }
        C1132c c1132c = (C1132c) obj;
        return this.f12308c.equals(c1132c.f12308c) && this.f12309e.equals(c1132c.f12309e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12308c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12309e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12308c.hashCode() ^ this.f12309e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f12308c + "=" + this.f12309e;
    }
}
