package Q;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import f0.C0996s;
import t.C1673a;
import t.C1674b;
import t.C1675c;
import t.C1676d;
import t.C1677e;
import t.C1679g;
import t.C1680h;
import t.C1683k;
import t.C1684l;
import t.C1685m;
import t.InterfaceC1681i;

/* renamed from: Q.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465t implements InterfaceC0008i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6105c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0996s f6106e;

    public /* synthetic */ C0465t(C0996s c0996s, int i6) {
        this.f6105c = i6;
        this.f6106e = c0996s;
    }

    @Override // A4.InterfaceC0008i
    public final Object a(Object obj, InterfaceC0905c interfaceC0905c) {
        switch (this.f6105c) {
            case 0:
                InterfaceC1681i interfaceC1681i = (InterfaceC1681i) obj;
                boolean z5 = interfaceC1681i instanceof C1679g;
                C0996s c0996s = this.f6106e;
                if (z5) {
                    c0996s.add(interfaceC1681i);
                } else if (interfaceC1681i instanceof C1680h) {
                    c0996s.remove(((C1680h) interfaceC1681i).a);
                } else if (interfaceC1681i instanceof C1676d) {
                    c0996s.add(interfaceC1681i);
                } else if (interfaceC1681i instanceof C1677e) {
                    c0996s.remove(((C1677e) interfaceC1681i).a);
                } else if (interfaceC1681i instanceof C1684l) {
                    c0996s.add(interfaceC1681i);
                } else if (interfaceC1681i instanceof C1685m) {
                    c0996s.remove(((C1685m) interfaceC1681i).a);
                } else if (interfaceC1681i instanceof C1683k) {
                    c0996s.remove(((C1683k) interfaceC1681i).a);
                }
                return X3.y.a;
            default:
                InterfaceC1681i interfaceC1681i2 = (InterfaceC1681i) obj;
                boolean z6 = interfaceC1681i2 instanceof C1684l;
                C0996s c0996s2 = this.f6106e;
                if (z6) {
                    c0996s2.add(interfaceC1681i2);
                } else if (interfaceC1681i2 instanceof C1685m) {
                    c0996s2.remove(((C1685m) interfaceC1681i2).a);
                } else if (interfaceC1681i2 instanceof C1683k) {
                    c0996s2.remove(((C1683k) interfaceC1681i2).a);
                } else if (interfaceC1681i2 instanceof C1674b) {
                    c0996s2.add(interfaceC1681i2);
                } else if (interfaceC1681i2 instanceof C1675c) {
                    c0996s2.remove(((C1675c) interfaceC1681i2).a);
                } else if (interfaceC1681i2 instanceof C1673a) {
                    c0996s2.remove(((C1673a) interfaceC1681i2).a);
                }
                return X3.y.a;
        }
    }
}
