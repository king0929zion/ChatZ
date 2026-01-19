package X2;

import b4.InterfaceC0905c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public Collection f9352h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f9353i;

    /* renamed from: j, reason: collision with root package name */
    public Collection f9354j;

    /* renamed from: k, reason: collision with root package name */
    public int f9355k;

    /* renamed from: l, reason: collision with root package name */
    public int f9356l;

    /* renamed from: m, reason: collision with root package name */
    public int f9357m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f9358n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9359o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ArrayList arrayList, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9359o = arrayList;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((r) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        r rVar = new r(this.f9359o, interfaceC0905c);
        rVar.f9358n = obj;
        return rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x008c -> B:5:0x008d). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f9358n
            x4.y r0 = (x4.InterfaceC1942y) r0
            int r1 = r10.f9357m
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L27
            if (r1 != r2) goto L1f
            int r0 = r10.f9356l
            int r1 = r10.f9355k
            java.util.Collection r4 = r10.f9354j
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r10.f9353i
            java.util.Collection r6 = r10.f9352h
            java.util.Collection r6 = (java.util.Collection) r6
            X3.a.e(r11)
            goto L8d
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L27:
            X3.a.e(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.ArrayList r1 = r10.f9359o
            r4 = 10
            int r5 = Y3.n.Z(r1, r4)
            r11.<init>(r5)
            int r5 = r1.size()
            r6 = 0
            r7 = r6
        L3d:
            if (r7 >= r5) goto L55
            java.lang.Object r8 = r1.get(r7)
            int r7 = r7 + 1
            com.bot.core.model.McpServer r8 = (com.bot.core.model.McpServer) r8
            X2.q r9 = new X2.q
            r9.<init>(r8, r3)
            r8 = 3
            x4.E r8 = x4.AbstractC1888A.f(r0, r3, r9, r8)
            r11.add(r8)
            goto L3d
        L55:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = Y3.n.Z(r11, r4)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
            r5 = r11
            r4 = r0
            r0 = r6
            r1 = r0
        L66:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L94
            java.lang.Object r11 = r5.next()
            x4.D r11 = (x4.InterfaceC1891D) r11
            r10.f9358n = r3
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            r10.f9352h = r6
            r10.f9353i = r5
            r10.f9354j = r6
            r10.f9355k = r1
            r10.f9356l = r0
            r10.f9357m = r2
            java.lang.Object r11 = r11.O(r10)
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r11 != r6) goto L8c
            return r6
        L8c:
            r6 = r4
        L8d:
            X3.i r11 = (X3.i) r11
            r4.add(r11)
            r4 = r6
            goto L66
        L94:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.r.r(java.lang.Object):java.lang.Object");
    }
}
