package r4;

import java.util.Iterator;
import n4.InterfaceC1372a;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1635a implements Iterable, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final char f14671c;

    /* renamed from: e, reason: collision with root package name */
    public final char f14672e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14673f = 1;

    public AbstractC1635a(char c6, char c7) {
        this.f14671c = c6;
        this.f14672e = (char) h5.e.Y(c6, c7, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1636b(this.f14671c, this.f14672e, this.f14673f);
    }
}
