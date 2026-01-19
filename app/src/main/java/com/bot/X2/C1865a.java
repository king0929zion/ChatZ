package x2;

import I2.A;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.BotApplication;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1865a extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f15567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BotApplication f15568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1865a(BotApplication botApplication, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15568i = botApplication;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1865a) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1865a(this.f15568i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f15567h;
        if (i6 == 0) {
            X3.a.e(obj);
            A a = this.f15568i.f11129g;
            if (a == null) {
                AbstractC1276k.k("reasoningConfigRepository");
                throw null;
            }
            this.f15567h = 1;
            Object c6 = a.c(this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (c6 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return y.a;
    }
}
