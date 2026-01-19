package B4;

import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import com.vladsch.flexmark.util.format.TableCell;
import i4.AbstractC1120d;
import java.util.ArrayList;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.EnumC1943z;
import x4.InterfaceC1942y;
import z4.EnumC2050a;

/* renamed from: B4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0054g implements w {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0910h f589c;

    /* renamed from: e, reason: collision with root package name */
    public final int f590e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC2050a f591f;

    public AbstractC0054g(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        this.f589c = interfaceC0910h;
        this.f590e = i6;
        this.f591f = enumC2050a;
    }

    @Override // A4.InterfaceC0007h
    public Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        Object l3 = AbstractC1888A.l(new C0052e(interfaceC0008i, this, null), interfaceC0905c);
        return l3 == EnumC0927a.f11114c ? l3 : X3.y.a;
    }

    @Override // B4.w
    public final InterfaceC0007h c(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        InterfaceC0910h interfaceC0910h2 = this.f589c;
        InterfaceC0910h Y5 = interfaceC0910h.Y(interfaceC0910h2);
        EnumC2050a enumC2050a2 = EnumC2050a.f16327c;
        EnumC2050a enumC2050a3 = this.f591f;
        int i7 = this.f590e;
        if (enumC2050a == enumC2050a2) {
            if (i7 != -3) {
                if (i6 != -3) {
                    if (i7 != -2) {
                        if (i6 != -2) {
                            i6 += i7;
                            if (i6 < 0) {
                                i6 = TableCell.NOT_TRACKED;
                            }
                        }
                    }
                }
                i6 = i7;
            }
            enumC2050a = enumC2050a3;
        }
        return (AbstractC1276k.b(Y5, interfaceC0910h2) && i6 == i7 && enumC2050a == enumC2050a3) ? this : f(Y5, i6, enumC2050a);
    }

    public String d() {
        return null;
    }

    public abstract Object e(z4.u uVar, InterfaceC0905c interfaceC0905c);

    public abstract AbstractC0054g f(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a);

    public InterfaceC0007h g() {
        return null;
    }

    public z4.w i(InterfaceC1942y interfaceC1942y) {
        int i6 = this.f590e;
        if (i6 == -3) {
            i6 = -2;
        }
        l4.e c0053f = new C0053f(this, null);
        z4.t tVar = new z4.t(AbstractC1888A.z(interfaceC1942y, this.f589c), AbstractC1120d.a(i6, 4, this.f591f), true, true);
        tVar.p0(EnumC1943z.f15741f, tVar, c0053f);
        return tVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d6 = d();
        if (d6 != null) {
            arrayList.add(d6);
        }
        C0911i c0911i = C0911i.f11057c;
        InterfaceC0910h interfaceC0910h = this.f589c;
        if (interfaceC0910h != c0911i) {
            arrayList.add("context=" + interfaceC0910h);
        }
        int i6 = this.f590e;
        if (i6 != -3) {
            arrayList.add("capacity=" + i6);
        }
        EnumC2050a enumC2050a = EnumC2050a.f16327c;
        EnumC2050a enumC2050a2 = this.f591f;
        if (enumC2050a2 != enumC2050a) {
            arrayList.add("onBufferOverflow=" + enumC2050a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return B3.e.r(sb, Y3.m.v0(arrayList, ", ", null, null, null, 62), ']');
    }
}
