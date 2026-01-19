package b3;

import Q.L2;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import l4.InterfaceC1193a;
import u4.AbstractC1776n;
import x4.InterfaceC1942y;

/* renamed from: b3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901q extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f11049h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f11050i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L2 f11051j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f11052k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0901q(String str, L2 l22, InterfaceC1193a interfaceC1193a, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f11050i = str;
        this.f11051j = l22;
        this.f11052k = interfaceC1193a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0901q) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0901q(this.f11050i, this.f11051j, this.f11052k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f11049h;
        if (i6 == 0) {
            X3.a.e(obj);
            String str = this.f11050i;
            String obj2 = str != null ? AbstractC1776n.l0(str).toString() : null;
            if (obj2 == null) {
                obj2 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            if (obj2.length() > 0) {
                this.f11049h = 1;
                Object b5 = L2.b(this.f11051j, obj2, this, 6);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (b5 == enumC0927a) {
                    return enumC0927a;
                }
            }
            return y.a;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        X3.a.e(obj);
        this.f11052k.b();
        return y.a;
    }
}
