package I2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.database.dao.ConversationDao;
import com.bot.core.database.dao.MessageDao;
import com.bot.core.database.entity.ConversationEntity;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2663h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f2664i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f2665j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2666k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2667l;

    /* renamed from: m, reason: collision with root package name */
    public Object f2668m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2669n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2670o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar, String str, String str2, String str3, String str4, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f2665j = vVar;
        this.f2666k = str;
        this.f2667l = str2;
        this.f2669n = str3;
        this.f2670o = str4;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f2663h) {
            case 0:
                InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
                return new q(this.f2665j, this.f2666k, this.f2667l, (String) this.f2669n, (String) this.f2670o, interfaceC0905c).r(X3.y.a);
            default:
                InterfaceC0905c interfaceC0905c2 = (InterfaceC0905c) obj;
                return new q((List) this.f2668m, this.f2665j, this.f2666k, this.f2667l, (Long) this.f2669n, (List) this.f2670o, interfaceC0905c2).r(X3.y.a);
        }
    }

    @Override // d4.a
    public final Object r(Object obj) {
        ConversationEntity conversationEntity;
        int i6 = this.f2663h;
        Object obj2 = this.f2670o;
        Object obj3 = this.f2669n;
        v vVar = this.f2665j;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        switch (i6) {
            case 0:
                int i7 = this.f2664i;
                if (i7 == 0) {
                    X3.a.e(obj);
                    String f6 = v.f(vVar);
                    ConversationEntity conversationEntity2 = new ConversationEntity(this.f2666k, this.f2667l, (String) obj3, (String) obj2, false, false, f6, f6, null, 0, 0);
                    ConversationDao conversationDao = vVar.a;
                    this.f2668m = conversationEntity2;
                    this.f2664i = 1;
                    if (conversationDao.upsert(conversationEntity2, this) == enumC0927a) {
                        return enumC0927a;
                    }
                    conversationEntity = conversationEntity2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    conversationEntity = (ConversationEntity) this.f2668m;
                    X3.a.e(obj);
                }
                return v.g(vVar, conversationEntity);
            default:
                int i8 = this.f2664i;
                if (i8 == 0) {
                    X3.a.e(obj);
                    N4.m mVar = L2.g.a;
                    List list = (List) this.f2668m;
                    if (list == null) {
                        list = Y3.v.f9812c;
                    }
                    String a = L2.g.a(list);
                    MessageDao messageDao = vVar.f2687b;
                    Long l3 = (Long) obj3;
                    N4.m mVar2 = J2.a.a;
                    String a6 = J2.a.a((List) obj2);
                    this.f2664i = 1;
                    if (messageDao.updateMessage(this.f2666k, this.f2667l, a, l3, a6, this) == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, v vVar, String str, String str2, Long l3, List list2, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f2668m = list;
        this.f2665j = vVar;
        this.f2666k = str;
        this.f2667l = str2;
        this.f2669n = l3;
        this.f2670o = list2;
    }
}
