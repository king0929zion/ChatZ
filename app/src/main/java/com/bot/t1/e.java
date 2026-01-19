package T1;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public final int f8349c;

    /* renamed from: e, reason: collision with root package name */
    public final int f8350e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8351f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8352g;

    public e(String str, int i6, int i7, String str2) {
        AbstractC1276k.f(str, "from");
        AbstractC1276k.f(str2, "to");
        this.f8349c = i6;
        this.f8350e = i7;
        this.f8351f = str;
        this.f8352g = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        AbstractC1276k.f(eVar, "other");
        int i6 = this.f8349c - eVar.f8349c;
        return i6 == 0 ? this.f8350e - eVar.f8350e : i6;
    }
}
