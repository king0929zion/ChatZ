package W2;

import X2.L;
import X3.y;
import androidx.lifecycle.N;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.VersionInfo;
import java.util.Objects;
import l4.InterfaceC1193a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f8872h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f8873i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f8874j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.c f8875k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f8876l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z5, L l3, l4.c cVar, InterfaceC1193a interfaceC1193a, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8873i = z5;
        this.f8874j = l3;
        this.f8875k = cVar;
        this.f8876l = interfaceC1193a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((f) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new f(this.f8873i, this.f8874j, this.f8875k, this.f8876l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f8872h;
        y yVar = y.a;
        InterfaceC1193a interfaceC1193a = this.f8876l;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                if (!this.f8873i) {
                    return yVar;
                }
                i5.a.a.getClass();
                N.k(new Object[0]);
                L l3 = this.f8874j;
                this.f8872h = 1;
                obj = l3.l(this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (obj == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X3.a.e(obj);
            }
            VersionInfo versionInfo = (VersionInfo) obj;
            this.f8875k.f(versionInfo);
            N n3 = i5.a.a;
            Objects.toString(versionInfo);
            n3.getClass();
            N.k(new Object[0]);
            return yVar;
        } catch (Exception e6) {
            N n5 = i5.a.a;
            e6.getLocalizedMessage();
            n5.getClass();
            N.o(new Object[0]);
            return yVar;
        } finally {
            interfaceC1193a.b();
        }
    }
}
