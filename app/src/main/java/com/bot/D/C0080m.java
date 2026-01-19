package D;

import M4.C0255c;
import M4.C0277y;
import com.bot.core.model.ConversationInfo;
import com.bot.core.model.LLMProvider;
import com.bot.core.model.LLMProvider$$serializer;
import com.bot.core.model.LLMProvidersResponse;
import com.bot.core.model.McpHeader$$serializer;
import com.bot.core.model.McpServer;
import com.bot.core.model.MessageAttachment;
import com.bot.core.model.MessageAttachment$$serializer;
import com.bot.core.model.MessageInfo;
import com.bot.core.model.ReasoningConfig;
import com.bot.core.model.ReasoningRule;
import com.bot.core.model.ReasoningRule$$serializer;
import com.bot.core.model.ToolCallInfo;
import com.bot.core.model.ToolCallInfo$$serializer;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import u4.AbstractC1776n;
import v.AbstractC1787b;

/* renamed from: D.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0080m implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1062c;

    public /* synthetic */ C0080m(int i6) {
        this.f1062c = i6;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f1062c) {
            case 0:
                return new o0.N(o0.y.c(1308617531));
            case 1:
                T.e1 e1Var = F.a;
                return null;
            case 2:
                return new e1.j(0L);
            case 3:
                return new e1.j(0L);
            case 4:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case AbstractC1787b.f15290g /* 5 */:
                ConversationInfo.Companion companion = ConversationInfo.Companion;
                return new M4.E(M4.n0.a, N4.k.a, 1);
            case 6:
                LLMProvider.Companion companion2 = LLMProvider.Companion;
                return new C0255c(M4.n0.a, 0);
            case 7:
                LLMProvidersResponse.Companion companion3 = LLMProvidersResponse.Companion;
                return new C0255c(LLMProvider$$serializer.INSTANCE, 0);
            case 8:
                McpServer.Companion companion4 = McpServer.Companion;
                return new C0255c(McpHeader$$serializer.INSTANCE, 0);
            case AbstractC1787b.f15287d /* 9 */:
                MessageAttachment.Companion companion5 = MessageAttachment.Companion;
                return new M4.E(M4.n0.a, N4.k.a, 1);
            case AbstractC1787b.f15289f /* 10 */:
                MessageInfo.Companion companion6 = MessageInfo.Companion;
                return new C0255c(M4.n0.a, 0);
            case 11:
                MessageInfo.Companion companion7 = MessageInfo.Companion;
                return new C0255c(ToolCallInfo$$serializer.INSTANCE, 0);
            case 12:
                MessageInfo.Companion companion8 = MessageInfo.Companion;
                return new C0255c(MessageAttachment$$serializer.INSTANCE, 0);
            case 13:
                ReasoningConfig.Companion companion9 = ReasoningConfig.Companion;
                return new C0255c(ReasoningRule$$serializer.INSTANCE, 0);
            case 14:
                ReasoningConfig.Companion companion10 = ReasoningConfig.Companion;
                return new C0255c(ReasoningRule$$serializer.INSTANCE, 0);
            case 15:
                ReasoningRule.Companion companion11 = ReasoningRule.Companion;
                return D2.b.Companion.serializer();
            case PegdownExtensions.AUTOLINKS /* 16 */:
                D2.b[] values = D2.b.values();
                AbstractC1276k.f(values, "values");
                return new C0277y("com.bot.core.model.ReasoningStrategy", values);
            case 17:
                ToolCallInfo.Companion companion12 = ToolCallInfo.Companion;
                return new M4.E(M4.n0.a, N4.k.a, 1);
            case 18:
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return h5.e.O(timeUnit.toMillis(30L), timeUnit.toMillis(30L), timeUnit.toMillis(30L), new A2.a(18));
            case 19:
                T.B b5 = G1.a.a;
                return null;
            case 20:
                T.B b6 = K.g.a;
                return null;
            case 21:
                return new androidx.lifecycle.S();
            case 22:
                F1.e eVar = new F1.e(0);
                eVar.a(AbstractC1289x.a(L1.b.class), new I2.x(9));
                return eVar.c();
            case 23:
                K4.k kVar = K4.k.f2979h;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (AbstractC1776n.Q("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (kVar.equals(K4.k.f2976e)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                K4.a aVar = new K4.a("kotlin.Unit");
                return new K4.g("kotlin.Unit", kVar, aVar.f2941b.size(), Y3.k.B0(serialDescriptorArr), aVar);
            case 24:
                return Boolean.TRUE;
            case 25:
                return N4.t.f3915b;
            case 26:
                return N4.q.f3911b;
            case 27:
                return N4.o.f3910b;
            case 28:
                return N4.s.f3914b;
            default:
                return N4.e.f3887b;
        }
    }

    public /* synthetic */ C0080m(M4.Y y5) {
        this.f1062c = 23;
    }
}
