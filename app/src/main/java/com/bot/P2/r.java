package P2;

import f0.AbstractC0983f;
import f0.AbstractC0992o;
import f0.C0989l;
import j2.C1145a;
import j2.C1146b;
import m0.EnumC1245A;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5042c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f5043e;

    public /* synthetic */ r(l4.c cVar, int i6) {
        this.f5042c = i6;
        this.f5043e = cVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f5042c) {
            case 0:
                l4.c cVar = this.f5043e;
                String str = (String) obj;
                AbstractC1276k.f(str, "newMessage");
                cVar.f(str);
                return X3.y.a;
            case 1:
                this.f5043e.f(Integer.valueOf((int) (((e1.l) obj).a & 4294967295L)));
                return X3.y.a;
            case 2:
                this.f5043e.f(Integer.valueOf((int) (((e1.l) obj).a & 4294967295L)));
                return X3.y.a;
            case 3:
                l4.c cVar2 = this.f5043e;
                EnumC1245A enumC1245A = (EnumC1245A) obj;
                AbstractC1276k.f(enumC1245A, "it");
                if (enumC1245A.b()) {
                    cVar2.f(R2.A.f6855e);
                }
                return X3.y.a;
            case 4:
                this.f5043e.f(Boolean.FALSE);
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                AbstractC0983f abstractC0983f = (AbstractC0983f) this.f5043e.f((C0989l) obj);
                synchronized (AbstractC0992o.f11707c) {
                    AbstractC0992o.f11708d = AbstractC0992o.f11708d.e(abstractC0983f.g());
                }
                return abstractC0983f;
            case 6:
                l4.c cVar3 = this.f5043e;
                j2.e eVar = (j2.e) obj;
                if (!(eVar instanceof j2.c)) {
                    if (eVar instanceof j2.d) {
                        if (cVar3 != null) {
                            cVar3.f(eVar);
                        }
                    } else if (!(eVar instanceof C1146b) && !(eVar instanceof C1145a)) {
                        throw new RuntimeException();
                    }
                }
                return X3.y.a;
            default:
                l4.c cVar4 = this.f5043e;
                Long l3 = (Long) obj;
                l3.longValue();
                return cVar4.f(l3);
        }
    }
}
