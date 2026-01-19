package k;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class K extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public Z.c f12475f;

    /* renamed from: g, reason: collision with root package name */
    public L f12476g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f12477h;

    /* renamed from: i, reason: collision with root package name */
    public int f12478i;

    /* renamed from: j, reason: collision with root package name */
    public int f12479j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f12480k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L f12481l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z.c f12482m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l3, Z.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12481l = l3;
        this.f12482m = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((K) p((InterfaceC0905c) obj2, (t4.i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        K k3 = new K(this.f12481l, this.f12482m, interfaceC0905c);
        k3.f12480k = obj;
        return k3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        t4.i iVar;
        L l3;
        long[] jArr;
        int i6;
        Z.c cVar;
        int i7 = this.f12479j;
        if (i7 == 0) {
            X3.a.e(obj);
            iVar = (t4.i) this.f12480k;
            l3 = this.f12481l;
            J j3 = l3.f12484e;
            jArr = j3.f12469c;
            i6 = j3.f12471e;
            cVar = this.f12482m;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = this.f12478i;
            jArr = this.f12477h;
            l3 = this.f12476g;
            cVar = this.f12475f;
            iVar = (t4.i) this.f12480k;
            X3.a.e(obj);
        }
        if (i6 == Integer.MAX_VALUE) {
            return X3.y.a;
        }
        int i8 = (int) ((jArr[i6] >> 31) & 2147483647L);
        cVar.f9851e = i6;
        Object obj2 = l3.f12484e.f12468b[i6];
        this.f12480k = iVar;
        this.f12475f = cVar;
        this.f12476g = l3;
        this.f12477h = jArr;
        this.f12478i = i8;
        this.f12479j = 1;
        iVar.b(obj2, this);
        return EnumC0927a.f11114c;
    }
}
