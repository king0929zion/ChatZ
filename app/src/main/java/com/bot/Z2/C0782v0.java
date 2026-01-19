package Z2;

import b3.AbstractC0897m;
import c0.AbstractC0919b;
import c0.C0918a;
import com.bot.BotApplication;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.C0990m;
import f0.C1001x;
import java.util.LinkedHashMap;
import l4.InterfaceC1193a;
import p.AbstractC1450o0;
import r.AbstractC1571h0;
import v.AbstractC1787b;

/* renamed from: Z2.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0782v0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10381c;

    public /* synthetic */ C0782v0(int i6) {
        this.f10381c = i6;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f10381c) {
            case 0:
                return T.r.A(FlexmarkHtmlConverter.DEFAULT_NODE);
            case 1:
                return T.r.A(FlexmarkHtmlConverter.DEFAULT_NODE);
            case 2:
                return T.r.A("openai");
            case 3:
                return T.r.A("chat_completions");
            case 4:
                return T.r.A("ai_studio");
            case AbstractC1787b.f15290g /* 5 */:
                return T.r.A(FlexmarkHtmlConverter.DEFAULT_NODE);
            case 6:
                return T.r.A(FlexmarkHtmlConverter.DEFAULT_NODE);
            case 7:
                return T.r.A(Boolean.TRUE);
            case 8:
                return T.r.A(FlexmarkHtmlConverter.DEFAULT_NODE);
            case AbstractC1787b.f15287d /* 9 */:
                return T.r.A(FlexmarkHtmlConverter.DEFAULT_NODE);
            case AbstractC1787b.f15289f /* 10 */:
                T.B b5 = AbstractC0897m.a;
                return null;
            case 11:
                T.e1 e1Var = AbstractC0919b.a;
                return C0918a.f11098c;
            case 12:
                return new e0.d(new LinkedHashMap());
            case 13:
                T.e1 e1Var2 = e0.h.a;
                return null;
            case 14:
                T.e1 e1Var3 = g0.e.a;
                return null;
            case 15:
                T.e1 e1Var4 = g0.g.a;
                return null;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return new Q4.t(new Q4.s());
            case 17:
                return null;
            case 18:
                C1001x c1001x = new C1001x(new C0990m(6));
                c1001x.e();
                return c1001x;
            case 19:
                T.B b6 = AbstractC1450o0.a;
                return p.V.a;
            case 20:
                return new p.D0();
            case 21:
                return new p.P0(0);
            case 22:
                float f6 = AbstractC1571h0.a;
                return Boolean.TRUE;
            case 23:
                float f7 = AbstractC1571h0.a;
                return X3.y.a;
            case 24:
                return new x.s(0, 0);
            default:
                int i6 = BotApplication.f11125j;
                return h5.e.O(30000L, 30000L, 30000L, new A2.a(16));
        }
    }
}
