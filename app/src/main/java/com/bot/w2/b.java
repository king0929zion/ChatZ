package W2;

import A4.g0;
import X2.C0692g;
import X2.M;
import X2.N;
import X3.y;
import b4.InterfaceC0905c;
import com.bot.core.model.ConversationInfo;
import java.util.ArrayList;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class b extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8862h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0692g f8863i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0692g c0692g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8863i = c0692g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        b bVar = (b) p((InterfaceC0905c) obj2, (N) obj);
        y yVar = y.a;
        bVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        b bVar = new b(this.f8863i, interfaceC0905c);
        bVar.f8862h = obj;
        return bVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        N n3 = (N) this.f8862h;
        X3.a.e(obj);
        if (!(n3 instanceof M)) {
            throw new RuntimeException();
        }
        ConversationInfo conversationInfo = ((M) n3).a;
        C0692g c0692g = this.f8863i;
        g0 g0Var = c0692g.f9272c;
        AbstractC1276k.f(conversationInfo, "conversation");
        String str = conversationInfo.a;
        if (!AbstractC1776n.Q(str)) {
            Z3.b w5 = Y4.l.w();
            w5.add(conversationInfo);
            Iterable iterable = (Iterable) g0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (!AbstractC1276k.b(((ConversationInfo) obj2).a, str)) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList.get(i6);
                i6++;
                w5.add((ConversationInfo) obj3);
            }
            Z3.b p5 = Y4.l.p(w5);
            g0Var.k(p5);
            if (c0692g.f9291v) {
                c0692g.f9289t = p5.a();
            }
            androidx.lifecycle.N n5 = i5.a.a;
            "本地更新对话列表: ".concat(str);
            n5.getClass();
            androidx.lifecycle.N.k(new Object[0]);
        }
        return y.a;
    }
}
