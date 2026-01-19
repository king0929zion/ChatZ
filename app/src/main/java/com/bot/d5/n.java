package d5;

import java.util.ArrayList;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class n {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11490b;

    /* renamed from: c, reason: collision with root package name */
    public final y f11491c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f11492d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f11493e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f11494f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f11495g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f11496h;

    public n(boolean z5, boolean z6, y yVar, Long l3, Long l5, Long l6, Long l7, Map map) {
        AbstractC1276k.f(map, "extras");
        this.a = z5;
        this.f11490b = z6;
        this.f11491c = yVar;
        this.f11492d = l3;
        this.f11493e = l5;
        this.f11494f = l6;
        this.f11495g = l7;
        this.f11496h = Y3.B.d0(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.f11490b) {
            arrayList.add("isDirectory");
        }
        Long l3 = this.f11492d;
        if (l3 != null) {
            arrayList.add("byteCount=" + l3);
        }
        Long l5 = this.f11493e;
        if (l5 != null) {
            arrayList.add("createdAt=" + l5);
        }
        Long l6 = this.f11494f;
        if (l6 != null) {
            arrayList.add("lastModifiedAt=" + l6);
        }
        Long l7 = this.f11495g;
        if (l7 != null) {
            arrayList.add("lastAccessedAt=" + l7);
        }
        Map map = this.f11496h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return Y3.m.v0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ n(boolean z5, boolean z6, y yVar, Long l3, Long l5, Long l6, Long l7) {
        this(z5, z6, yVar, l3, l5, l6, l7, Y3.w.f9813c);
    }
}
