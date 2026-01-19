package Y2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.database.dao.LLMSettingDao;
import com.bot.core.model.LLMSetting;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class U extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public W f9680h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f9681i;

    /* renamed from: j, reason: collision with root package name */
    public int f9682j;

    /* renamed from: k, reason: collision with root package name */
    public int f9683k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f9684l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f9685m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(List list, W w5, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f9684l = list;
        this.f9685m = w5;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        return new U(this.f9684l, this.f9685m, (InterfaceC0905c) obj).r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6;
        W w5;
        Iterator it;
        int i7 = this.f9683k;
        if (i7 == 0) {
            X3.a.e(obj);
            Iterator it2 = this.f9684l.iterator();
            i6 = 0;
            w5 = this.f9685m;
            it = it2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = this.f9682j;
            it = this.f9681i;
            w5 = this.f9680h;
            X3.a.e(obj);
        }
        while (it.hasNext()) {
            LLMSetting lLMSetting = (LLMSetting) it.next();
            String str = lLMSetting.a;
            if (str != null) {
                LLMSettingDao lLMSettingDao = w5.a;
                long j3 = lLMSetting.f11208m;
                this.f9680h = w5;
                this.f9681i = it;
                this.f9682j = i6;
                this.f9683k = 1;
                Object updateSortOrder = lLMSettingDao.updateSortOrder(str, j3, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (updateSortOrder == enumC0927a) {
                    return enumC0927a;
                }
            }
        }
        return X3.y.a;
    }
}
