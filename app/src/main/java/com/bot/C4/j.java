package C4;

import T.d1;
import m4.AbstractC1282q;
import m4.AbstractC1289x;
import s4.InterfaceC1671a;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends AbstractC1282q implements s4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f703k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i6, int i7, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i6);
        this.f703k = i7;
    }

    @Override // m4.AbstractC1268c
    public final InterfaceC1671a a() {
        AbstractC1289x.a.getClass();
        return this;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        return get();
    }

    @Override // s4.c
    public final Object get() {
        switch (this.f703k) {
            case 0:
                return this.f12958e.getClass().getSimpleName();
            case 1:
                return ((d1) this.f12958e).getValue();
            case 2:
                return ((d1) this.f12958e).getValue();
            case 3:
                return ((d1) this.f12958e).getValue();
            default:
                return ((d1) this.f12958e).getValue();
        }
    }
}
