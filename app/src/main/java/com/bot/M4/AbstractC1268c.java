package m4;

import java.io.Serializable;
import s4.InterfaceC1671a;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1268c implements InterfaceC1671a, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public transient InterfaceC1671a f12957c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12958e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f12959f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12960g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12961h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12962i;

    public AbstractC1268c(Object obj, Class cls, String str, String str2, boolean z5) {
        this.f12958e = obj;
        this.f12959f = cls;
        this.f12960g = str;
        this.f12961h = str2;
        this.f12962i = z5;
    }

    public abstract InterfaceC1671a a();

    public final InterfaceC1269d e() {
        boolean z5 = this.f12962i;
        Class cls = this.f12959f;
        if (!z5) {
            return AbstractC1289x.a(cls);
        }
        AbstractC1289x.a.getClass();
        return new C1280o(cls);
    }
}
