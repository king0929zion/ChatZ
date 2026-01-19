package Q;

import F0.InterfaceC0121i;
import T.C0626q;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import t.C1682j;
import t0.AbstractC1688b;

/* renamed from: Q.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0457q2 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6054c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f6055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f6056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6059i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6060j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6061k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6063m;

    public /* synthetic */ C0457q2(float f6, l4.c cVar, InterfaceC1041r interfaceC1041r, boolean z5, r4.d dVar, int i6, InterfaceC1193a interfaceC1193a, C0413f2 c0413f2, C1682j c1682j, int i7) {
        this.f6056f = f6;
        this.f6059i = cVar;
        this.f6055e = interfaceC1041r;
        this.f6057g = z5;
        this.f6060j = dVar;
        this.f6058h = i6;
        this.f6061k = interfaceC1193a;
        this.f6062l = c0413f2;
        this.f6063m = c1682j;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6054c) {
            case 0:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(196657);
                AbstractC0492z2.b(this.f6056f, (l4.c) this.f6059i, this.f6055e, this.f6057g, (r4.d) this.f6060j, this.f6058h, (InterfaceC1193a) this.f6061k, (C0413f2) this.f6062l, (C1682j) this.f6063m, (C0626q) obj, J4);
                break;
            default:
                ((Integer) obj2).getClass();
                j2.n.c((j2.w) this.f6059i, this.f6055e, (AbstractC1688b) this.f6060j, (String) this.f6061k, (InterfaceC1028e) this.f6062l, (InterfaceC0121i) this.f6063m, this.f6056f, this.f6057g, (C0626q) obj, T.r.J(this.f6058h | 1));
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ C0457q2(j2.w wVar, InterfaceC1041r interfaceC1041r, AbstractC1688b abstractC1688b, String str, InterfaceC1028e interfaceC1028e, InterfaceC0121i interfaceC0121i, float f6, boolean z5, int i6) {
        this.f6059i = wVar;
        this.f6055e = interfaceC1041r;
        this.f6060j = abstractC1688b;
        this.f6061k = str;
        this.f6062l = interfaceC1028e;
        this.f6063m = interfaceC0121i;
        this.f6056f = f6;
        this.f6057g = z5;
        this.f6058h = i6;
    }
}
