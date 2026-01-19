package M1;

import android.content.Intent;
import android.content.IntentSender;
import b.C0867k;
import e.InterfaceC0955c;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3229c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3232g;

    public /* synthetic */ a(int i6, int i7, Object obj, Object obj2) {
        this.f3229c = i7;
        this.f3231f = obj;
        this.f3230e = i6;
        this.f3232g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3229c) {
            case 0:
                ((f) ((b) this.f3231f).f3234c).b(this.f3230e, this.f3232g);
                return;
            case 1:
                C0867k c0867k = (C0867k) this.f3231f;
                Serializable serializable = (Serializable) ((A3.c) this.f3232g).f119e;
                String str = (String) c0867k.a.get(Integer.valueOf(this.f3230e));
                if (str == null) {
                    return;
                }
                e.e eVar = (e.e) c0867k.f10925e.get(str);
                if ((eVar != null ? eVar.a : null) == null) {
                    c0867k.f10927g.remove(str);
                    c0867k.f10926f.put(str, serializable);
                    return;
                } else {
                    InterfaceC0955c interfaceC0955c = eVar.a;
                    if (c0867k.f10924d.remove(str)) {
                        interfaceC0955c.a(serializable);
                        return;
                    }
                    return;
                }
            default:
                ((C0867k) this.f3231f).a(this.f3230e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f3232g));
                return;
        }
    }
}
