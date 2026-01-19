package Z2;

import H0.C0162q;
import Y2.C0730t;
import Y2.EnumC0731u;
import a3.C0812a;
import a3.C0816e;
import a3.C0818g;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.McpHeader;
import com.bot.core.model.McpServer;
import f0.C0996s;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class O extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10052h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0996s f10053i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ McpServer f10054j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0818g f10055k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f10056l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T.X f10057m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T.X f10058n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C0996s c0996s, McpServer mcpServer, C0818g c0818g, T.X x5, T.X x6, T.X x7, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10053i = c0996s;
        this.f10054j = mcpServer;
        this.f10055k = c0818g;
        this.f10056l = x5;
        this.f10057m = x6;
        this.f10058n = x7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((O) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new O(this.f10053i, this.f10054j, this.f10055k, this.f10056l, this.f10057m, this.f10058n, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        String str;
        int i6 = this.f10052h;
        T.X x5 = this.f10057m;
        T.X x6 = this.f10056l;
        if (i6 == 0) {
            X3.a.e(obj);
            if (!AbstractC1776n.Q((String) x6.getValue()) && !AbstractC1776n.Q((String) x5.getValue())) {
                this.f10052h = 1;
                Object m3 = AbstractC1888A.m(500L, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (m3 == enumC0927a) {
                    return enumC0927a;
                }
            }
            return X3.y.a;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        X3.a.e(obj);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = this.f10053i.listIterator();
        while (true) {
            C0162q c0162q = (C0162q) listIterator;
            if (!c0162q.hasNext()) {
                break;
            }
            C c6 = (C) c0162q.next();
            String obj2 = AbstractC1776n.l0(c6.f9899b).toString();
            McpHeader mcpHeader = AbstractC1776n.Q(obj2) ? null : new McpHeader(obj2, AbstractC1776n.l0(c6.f9900c).toString());
            if (mcpHeader != null) {
                arrayList.add(mcpHeader);
            }
        }
        McpServer mcpServer = this.f10054j;
        if (mcpServer == null || (str = mcpServer.a) == null) {
            str = "temp";
        }
        String str2 = str;
        String obj3 = AbstractC1776n.l0((String) this.f10058n.getValue()).toString();
        if (AbstractC1776n.Q(obj3)) {
            obj3 = "Test";
        }
        String str3 = obj3;
        List list = D2.a.a;
        String str4 = (String) x6.getValue();
        AbstractC1276k.b(str4 != null ? AbstractC1776n.l0(str4).toString() : null, "Streamable HTTP");
        McpServer mcpServer2 = new McpServer(str2, true, str3, "Streamable HTTP", AbstractC1776n.l0((String) x5.getValue()).toString(), arrayList);
        C0818g c0818g = this.f10055k;
        c0818g.getClass();
        C0730t c0730t = c0818g.f10661g;
        if (c0730t != null) {
            c0730t.f();
        }
        A4.g0 g0Var = c0818g.f10659e;
        C0812a c0812a = new C0812a(EnumC0731u.f9774e, null, null, 6);
        g0Var.getClass();
        g0Var.l(null, c0812a);
        AbstractC1888A.y(androidx.lifecycle.O.i(c0818g), null, new C0816e(c0818g, null, mcpServer2), 3);
        return X3.y.a;
    }
}
