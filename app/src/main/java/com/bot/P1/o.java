package P1;

import N1.InterfaceC0293o;

/* loaded from: classes.dex */
public final class o implements v, InterfaceC0293o {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4611b;

    public /* synthetic */ o(Object obj, int i6) {
        this.a = i6;
        this.f4611b = obj;
    }

    @Override // N1.InterfaceC0293o
    public final Object b(String str, l4.c cVar, d4.c cVar2) {
        switch (this.a) {
            case 0:
                return ((u) this.f4611b).b(str, cVar, cVar2);
            default:
                return ((Q1.d) this.f4611b).b(str, cVar, cVar2);
        }
    }

    @Override // P1.v
    public final X1.a c() {
        switch (this.a) {
            case 0:
                return ((u) this.f4611b).a;
            default:
                return ((Q1.d) this.f4611b).a;
        }
    }
}
