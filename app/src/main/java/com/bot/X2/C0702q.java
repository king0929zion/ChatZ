package X2;

import Y2.C0730t;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.McpServer;
import x4.InterfaceC1942y;

/* renamed from: X2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702q extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C0730t f9348h;

    /* renamed from: i, reason: collision with root package name */
    public McpServer f9349i;

    /* renamed from: j, reason: collision with root package name */
    public int f9350j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ McpServer f9351k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702q(McpServer mcpServer, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9351k = mcpServer;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0702q) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0702q(this.f9351k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        McpServer mcpServer;
        C0730t c0730t;
        Throwable th;
        Object obj2;
        int i6 = this.f9350j;
        if (i6 == 0) {
            X3.a.e(obj);
            mcpServer = this.f9351k;
            C0730t c0730t2 = new C0730t(mcpServer);
            try {
                this.f9348h = c0730t2;
                this.f9349i = mcpServer;
                this.f9350j = 1;
                Object h3 = c0730t2.h(this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (h3 == enumC0927a) {
                    return enumC0927a;
                }
                c0730t = c0730t2;
                obj2 = h3;
            } catch (Throwable th2) {
                c0730t = c0730t2;
                th = th2;
                c0730t.f();
                throw th;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mcpServer = this.f9349i;
            c0730t = this.f9348h;
            try {
                X3.a.e(obj);
                obj2 = ((X3.l) obj).f9396c;
            } catch (Throwable th3) {
                th = th3;
                c0730t.f();
                throw th;
            }
        }
        Y3.v vVar = Y3.v.f9812c;
        if (obj2 instanceof X3.k) {
            obj2 = vVar;
        }
        X3.i iVar = new X3.i(mcpServer, obj2);
        c0730t.f();
        return iVar;
    }
}
