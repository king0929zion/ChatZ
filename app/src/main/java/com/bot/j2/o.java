package j2;

import i2.C1115i;
import j1.AbstractC1135a;
import java.util.Arrays;
import m4.AbstractC1276k;
import s2.C1661i;

/* loaded from: classes.dex */
public final class o {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final u f12394b;

    /* renamed from: c, reason: collision with root package name */
    public final C1115i f12395c;

    public o(Object obj, u uVar, C1115i c1115i) {
        this.a = obj;
        this.f12394b = uVar;
        this.f12395c = c1115i;
    }

    public final boolean equals(Object obj) {
        boolean b5;
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                Object obj2 = oVar.a;
                this.f12394b.getClass();
                Object obj3 = this.a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof C1661i) && (obj2 instanceof C1661i)) {
                        C1661i c1661i = (C1661i) obj3;
                        C1661i c1661i2 = (C1661i) obj2;
                        if (!AbstractC1276k.b(c1661i.a, c1661i2.a) || !c1661i.f14766b.equals(c1661i2.f14766b) || c1661i.f14768d != c1661i2.f14768d || !AbstractC1276k.b(c1661i.f14770f, c1661i2.f14770f) || !AbstractC1276k.b(c1661i.f14772h, c1661i2.f14772h) || c1661i.f14774j != c1661i2.f14774j || c1661i.f14775k != c1661i2.f14775k || c1661i.f14776l != c1661i2.f14776l || c1661i.f14777m != c1661i2.f14777m || c1661i.f14778n != c1661i2.f14778n || c1661i.f14779o != c1661i2.f14779o || c1661i.f14780p != c1661i2.f14780p || !c1661i.f14786v.equals(c1661i2.f14786v) || c1661i.f14787w != c1661i2.f14787w || c1661i.f14769e != c1661i2.f14769e || !c1661i.f14788x.equals(c1661i2.f14788x)) {
                            b5 = false;
                        }
                    } else {
                        b5 = AbstractC1276k.b(obj3, obj2);
                    }
                    if (b5 || !this.f12395c.equals(oVar.f12395c)) {
                    }
                }
                b5 = true;
                if (b5) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        this.f12394b.getClass();
        Object obj = this.a;
        if (obj instanceof C1661i) {
            C1661i c1661i = (C1661i) obj;
            hashCode = c1661i.f14788x.f14806c.hashCode() + ((c1661i.f14769e.hashCode() + ((c1661i.f14787w.hashCode() + ((c1661i.f14786v.hashCode() + ((c1661i.f14780p.hashCode() + ((c1661i.f14779o.hashCode() + ((c1661i.f14778n.hashCode() + AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d((AbstractC1135a.e(c1661i.f14770f, (c1661i.f14768d.hashCode() + ((c1661i.f14766b.hashCode() + (c1661i.a.hashCode() * 31)) * 923521)) * 961, 31) + Arrays.hashCode(c1661i.f14772h.f6556c)) * 31, 31, c1661i.f14774j), 31, c1661i.f14775k), 31, c1661i.f14776l), 31, c1661i.f14777m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else {
            hashCode = obj != null ? obj.hashCode() : 0;
        }
        return this.f12395c.hashCode() + (hashCode * 31);
    }
}
