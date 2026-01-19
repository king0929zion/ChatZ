package j;

import java.util.Iterator;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131b extends AbstractC1134e implements Iterator {

    /* renamed from: c, reason: collision with root package name */
    public C1132c f12305c;

    /* renamed from: e, reason: collision with root package name */
    public C1132c f12306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12307f;

    public C1131b(C1132c c1132c, C1132c c1132c2, int i6) {
        this.f12307f = i6;
        this.f12305c = c1132c2;
        this.f12306e = c1132c;
    }

    @Override // j.AbstractC1134e
    public final void a(C1132c c1132c) {
        C1132c c1132c2;
        C1132c c1132c3 = null;
        if (this.f12305c == c1132c && c1132c == this.f12306e) {
            this.f12306e = null;
            this.f12305c = null;
        }
        C1132c c1132c4 = this.f12305c;
        if (c1132c4 == c1132c) {
            switch (this.f12307f) {
                case 0:
                    c1132c2 = c1132c4.f12311g;
                    break;
                default:
                    c1132c2 = c1132c4.f12310f;
                    break;
            }
            this.f12305c = c1132c2;
        }
        C1132c c1132c5 = this.f12306e;
        if (c1132c5 == c1132c) {
            C1132c c1132c6 = this.f12305c;
            if (c1132c5 != c1132c6 && c1132c6 != null) {
                c1132c3 = b(c1132c5);
            }
            this.f12306e = c1132c3;
        }
    }

    public final C1132c b(C1132c c1132c) {
        switch (this.f12307f) {
            case 0:
                return c1132c.f12310f;
            default:
                return c1132c.f12311g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12306e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1132c c1132c = this.f12306e;
        C1132c c1132c2 = this.f12305c;
        this.f12306e = (c1132c == c1132c2 || c1132c2 == null) ? null : b(c1132c);
        return c1132c;
    }
}
