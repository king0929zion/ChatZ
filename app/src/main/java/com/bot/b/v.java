package b;

import java.util.ListIterator;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class v extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0853B f10959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(C0853B c0853b, int i6) {
        super(1);
        this.f10958e = i6;
        this.f10959f = c0853b;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f10958e) {
            case 0:
                C0858b c0858b = (C0858b) obj;
                AbstractC1276k.f(c0858b, "backEvent");
                C0853B c0853b = this.f10959f;
                Y3.j jVar = c0853b.f10899b;
                ListIterator listIterator = jVar.listIterator(jVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((u) obj2).a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                u uVar = (u) obj2;
                if (c0853b.f10900c != null) {
                    c0853b.b();
                }
                c0853b.f10900c = uVar;
                if (uVar != null) {
                    uVar.d(c0858b);
                }
                return X3.y.a;
            default:
                C0858b c0858b2 = (C0858b) obj;
                AbstractC1276k.f(c0858b2, "backEvent");
                C0853B c0853b2 = this.f10959f;
                u uVar2 = c0853b2.f10900c;
                if (uVar2 == null) {
                    Y3.j jVar2 = c0853b2.f10899b;
                    ListIterator listIterator2 = jVar2.listIterator(jVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((u) obj3).a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    uVar2 = (u) obj3;
                }
                if (uVar2 != null) {
                    uVar2.c(c0858b2);
                }
                return X3.y.a;
        }
    }
}
