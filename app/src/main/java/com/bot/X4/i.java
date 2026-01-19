package X4;

import java.io.IOException;
import m4.AbstractC1276k;
import m4.C1288w;

/* loaded from: classes.dex */
public final class i extends T4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i6) {
        super(str, true);
        this.f9443e = i6;
        this.f9444f = obj;
        this.f9445g = obj2;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [m4.w, java.lang.Object] */
    @Override // T4.a
    public final long a() {
        long a;
        int i6;
        w[] wVarArr;
        w[] wVarArr2;
        switch (this.f9443e) {
            case 0:
                o oVar = (o) this.f9444f;
                oVar.f9466c.a(oVar, (A) ((C1288w) this.f9445g).f12973c);
                return -1L;
            case 1:
                try {
                    ((o) this.f9444f).f9466c.b((w) this.f9445g);
                } catch (IOException e6) {
                    Y4.n nVar = Y4.n.a;
                    Y4.n nVar2 = Y4.n.a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f9444f).f9468f;
                    nVar2.getClass();
                    Y4.n.i(str, 4, e6);
                    try {
                        ((w) this.f9445g).c(2, e6);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                k kVar = (k) this.f9444f;
                A a6 = (A) this.f9445g;
                Object obj = new Object();
                o oVar2 = (o) kVar.f9452f;
                synchronized (oVar2.f9488z) {
                    synchronized (oVar2) {
                        try {
                            A a7 = oVar2.f9482t;
                            A a8 = new A();
                            a8.b(a7);
                            a8.b(a6);
                            obj.f12973c = a8;
                            a = a8.a() - a7.a();
                            i6 = 0;
                            if (a != 0 && !oVar2.f9467e.isEmpty()) {
                                wVarArr = (w[]) oVar2.f9467e.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                A a9 = (A) obj.f12973c;
                                AbstractC1276k.f(a9, "<set-?>");
                                oVar2.f9482t = a9;
                                oVar2.f9475m.c(new i(oVar2.f9468f + " onSettings", oVar2, obj, i6), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            A a92 = (A) obj.f12973c;
                            AbstractC1276k.f(a92, "<set-?>");
                            oVar2.f9482t = a92;
                            oVar2.f9475m.c(new i(oVar2.f9468f + " onSettings", oVar2, obj, i6), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f9488z.c((A) obj.f12973c);
                    } catch (IOException e7) {
                        oVar2.c(2, 2, e7);
                    }
                }
                if (wVarArr2 != null) {
                    int length = wVarArr2.length;
                    while (i6 < length) {
                        w wVar = wVarArr2[i6];
                        synchronized (wVar) {
                            wVar.f9521f += a;
                            if (a > 0) {
                                wVar.notifyAll();
                            }
                        }
                        i6++;
                    }
                }
                return -1L;
        }
    }
}
