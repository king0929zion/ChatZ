package c;

import D.Y;
import T.X;
import android.os.Bundle;
import b.C0867k;
import e.C0954b;
import i1.C1079C;
import i1.C1105y;
import i4.AbstractC1117a;
import java.util.LinkedHashMap;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915c extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11062e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f11066i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f11067j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0915c(C0913a c0913a, C0867k c0867k, String str, Y4.l lVar, X x5) {
        super(1);
        this.f11064g = c0913a;
        this.f11065h = c0867k;
        this.f11063f = str;
        this.f11066i = lVar;
        this.f11067j = x5;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f11062e) {
            case 0:
                C0913a c0913a = (C0913a) this.f11064g;
                C0867k c0867k = (C0867k) this.f11065h;
                Y4.l lVar = (Y4.l) this.f11066i;
                C0914b c0914b = new C0914b((X) this.f11067j, 0);
                Bundle bundle = c0867k.f10927g;
                String str = this.f11063f;
                AbstractC1276k.f(str, "key");
                c0867k.c(str);
                c0867k.f10925e.put(str, new e.e(c0914b, lVar));
                LinkedHashMap linkedHashMap = c0867k.f10926f;
                if (linkedHashMap.containsKey(str)) {
                    Object obj2 = linkedHashMap.get(str);
                    linkedHashMap.remove(str);
                    c0914b.a(obj2);
                }
                C0954b c0954b = (C0954b) AbstractC1117a.q(str, bundle);
                if (c0954b != null) {
                    bundle.remove(str);
                    c0914b.a(lVar.M(c0954b.f11522e, c0954b.f11521c));
                }
                c0913a.a = new e.h(c0867k, str, lVar, 1);
                return new Y(c0913a, 9);
            default:
                C1105y c1105y = (C1105y) this.f11064g;
                c1105y.f12042r.addView(c1105y, c1105y.f12043s);
                c1105y.l((InterfaceC1193a) this.f11065h, (C1079C) this.f11066i, this.f11063f, (e1.m) this.f11067j);
                return new Y(c1105y, 13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0915c(C1105y c1105y, InterfaceC1193a interfaceC1193a, C1079C c1079c, String str, e1.m mVar) {
        super(1);
        this.f11064g = c1105y;
        this.f11065h = interfaceC1193a;
        this.f11066i = c1079c;
        this.f11063f = str;
        this.f11067j = mVar;
    }
}
