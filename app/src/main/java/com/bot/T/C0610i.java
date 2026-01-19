package T;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import k.C1178z;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import v.AbstractC1787b;

/* renamed from: T.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610i extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f8093f;

    /* renamed from: g, reason: collision with root package name */
    public int f8094g;

    /* renamed from: h, reason: collision with root package name */
    public int f8095h;

    /* renamed from: i, reason: collision with root package name */
    public int f8096i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8097j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0612j f8098k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610i(C0612j c0612j, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8098k = c0612j;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0610i) p((InterfaceC0905c) obj2, (t4.i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0610i c0610i = new C0610i(this.f8098k, interfaceC0905c);
        c0610i.f8097j = obj;
        return c0610i;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        t4.i iVar;
        int i6;
        int i7;
        int i8;
        String str;
        int i9;
        int i10;
        String str2;
        C0612j c0612j = this.f8098k;
        k.I i11 = c0612j.f8110c;
        C1178z c1178z = c0612j.f8112f;
        int i12 = this.f8096i;
        if (i12 == 0) {
            X3.a.e(obj);
            iVar = (t4.i) this.f8097j;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = this.f8095h;
            i7 = this.f8094g;
            i8 = this.f8093f;
            iVar = (t4.i) this.f8097j;
            X3.a.e(obj);
        }
        if (i8 >= Math.min(c0612j.f8113g + 10, c1178z.f12592b)) {
            return X3.y.a;
        }
        int i13 = i8 + 1;
        int c6 = c1178z.c(i8);
        switch (c6) {
            case 0:
                str = "up";
                break;
            case 1:
                Object f6 = i11.f(i7);
                i7++;
                str = "down " + f6;
                break;
            case 2:
                str = "remove " + c1178z.c(i13) + SequenceUtils.SPC + c1178z.c(i8 + 2);
                i13 = i8 + 3;
                break;
            case 3:
                str = "move " + c1178z.c(i13) + SequenceUtils.SPC + c1178z.c(i8 + 2) + SequenceUtils.SPC + c1178z.c(i8 + 3);
                i13 = i8 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case AbstractC1787b.f15290g /* 5 */:
                i9 = i8 + 2;
                int c7 = c1178z.c(i13);
                i10 = i7 + 1;
                str2 = "insertBottomUp " + c7 + SequenceUtils.SPC + i11.f(i7);
                int i14 = i9;
                str = str2;
                i13 = i14;
                i7 = i10;
                break;
            case 6:
                i9 = i8 + 2;
                int c8 = c1178z.c(i13);
                i10 = i7 + 1;
                str2 = "insertTopDown " + c8 + SequenceUtils.SPC + i11.f(i7);
                int i142 = i9;
                str = str2;
                i13 = i142;
                i7 = i10;
                break;
            case 7:
                Object f7 = i11.f(i7);
                AbstractC1276k.d(f7, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                AbstractC1291z.b(2, f7);
                i7 += 2;
                str = "apply " + ((l4.e) f7);
                break;
            case 8:
                str = "reuse " + c0612j.f8111e.f(i6);
                i6++;
                break;
            case AbstractC1787b.f15287d /* 9 */:
                str = "recompose pending";
                break;
            default:
                str = B3.e.h(c6, "unknown op: ");
                break;
        }
        this.f8097j = iVar;
        this.f8093f = i13;
        this.f8094g = i7;
        this.f8095h = i6;
        this.f8096i = 1;
        iVar.b(i8 + ": " + str, this);
        return EnumC0927a.f11114c;
    }
}
