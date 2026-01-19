package M2;

import I2.E;
import I2.F;
import X2.C0696k;
import X2.L;
import androidx.lifecycle.N;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class n extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3358h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0696k f3359i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f3360j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f3361k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f3362l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f3363m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0696k c0696k, E e6, List list, t tVar, String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3359i = c0696k;
        this.f3360j = e6;
        this.f3361k = list;
        this.f3362l = tVar;
        this.f3363m = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((n) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new n(this.f3359i, this.f3360j, this.f3361k, this.f3362l, this.f3363m, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        F f6;
        int i6;
        Object obj2;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        int i7 = this.f3358h;
        try {
            if (i7 == 0) {
                X3.a.e(obj);
                C0696k c0696k = this.f3359i;
                E e6 = this.f3360j;
                this.f3358h = 1;
                switch (c0696k.a) {
                    case 0:
                        obj = L.f(c0696k.f9311b, e6, c0696k.f9312c, this);
                        break;
                    default:
                        obj = L.f(c0696k.f9311b, e6, c0696k.f9312c, this);
                        break;
                }
                if (obj == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X3.a.e(obj);
            }
            f6 = (F) obj;
        } catch (Exception e7) {
            N n3 = i5.a.a;
            String str = this.f3360j.f2615b;
            n3.getClass();
            N.p(new Object[0]);
            E e8 = this.f3360j;
            String str2 = e8.a;
            String str3 = e8.f2615b;
            Map map = e8.f2616c;
            String message = e7.getMessage();
            if (message == null) {
                message = "工具执行失败";
            }
            f6 = new F(str2, str3, map, message, false);
        }
        List list = this.f3361k;
        E e9 = this.f3360j;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                L2.h hVar = (L2.h) it.next();
                i6 = (AbstractC1276k.b(hVar.a, e9.a) || AbstractC1276k.b(hVar.f3085b, e9.f2615b)) ? 0 : i6 + 1;
            } else {
                i6 = -1;
            }
        }
        if (i6 >= 0) {
            List list2 = this.f3361k;
            synchronized (list2) {
                try {
                    L2.h hVar2 = (L2.h) list2.get(i6);
                    L2.i iVar = f6.f2620e ? L2.i.f3094f : L2.i.f3095g;
                    Object obj3 = f6.f2619d;
                    String str4 = null;
                    String obj4 = obj3 != null ? obj3.toString() : null;
                    if (!f6.f2620e && (obj2 = f6.f2619d) != null) {
                        str4 = obj2.toString();
                    }
                    list2.set(i6, L2.h.a(hVar2, iVar, obj4, str4, new Long(System.currentTimeMillis()), 71));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f3362l.i(this.f3363m, new C0250a(this.f3361k, 1));
        }
        this.f3362l.f3402f.h(new x(this.f3363m, f6));
        return f6;
    }
}
