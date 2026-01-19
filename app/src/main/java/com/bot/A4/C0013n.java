package A4;

import B4.AbstractC0050c;
import R.AbstractC0507l;
import R.C0508m;
import R.C0510o;
import R.C0513s;
import T.C0599c0;
import T.C0607g0;
import Y2.C0720i;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.database.dao.LLMProviderDao;
import f0.C1001x;
import m4.C1288w;
import r.AbstractC1573i;
import r.C1517E;
import r.C1591o;
import r.C1594p;
import r.C1606t;

/* renamed from: A4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f280h;

    /* renamed from: i, reason: collision with root package name */
    public int f281i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f282j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f283k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0013n(InterfaceC0905c interfaceC0905c, l4.f fVar, C1606t c1606t) {
        super(1, interfaceC0905c);
        this.f280h = 5;
        this.f282j = c1606t;
        this.f283k = (d4.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [l4.f, d4.i] */
    @Override // l4.c
    public final Object f(Object obj) {
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
        switch (this.f280h) {
            case 0:
                return new C0013n((InterfaceC0008i) this.f282j, (C1288w) this.f283k, interfaceC0905c, 0).r(X3.y.a);
            case 1:
                return new C0013n((I.i) this.f282j, (K.e) this.f283k, interfaceC0905c, 1).r(X3.y.a);
            case 2:
                return new C0013n((K.c) this.f282j, (K.b) this.f283k, interfaceC0905c, 2).r(X3.y.a);
            case 3:
                return new C0013n((C0513s) this.f282j, (l4.f) this.f283k, interfaceC0905c, 3).r(X3.y.a);
            case 4:
                return new C0013n((C0720i) this.f282j, (String) this.f283k, interfaceC0905c, 4).r(X3.y.a);
            default:
                return new C0013n(interfaceC0905c, (d4.i) this.f283k, (C1606t) this.f282j).r(X3.y.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r1v4, types: [f0.x] */
    /* JADX WARN: Type inference failed for: r3v23, types: [l4.f, d4.i] */
    @Override // d4.a
    public final Object r(Object obj) {
        Handler handler;
        I.e eVar;
        switch (this.f280h) {
            case 0:
                C1288w c1288w = (C1288w) this.f283k;
                int i6 = this.f281i;
                if (i6 == 0) {
                    X3.a.e(obj);
                    InterfaceC0008i interfaceC0008i = (InterfaceC0008i) this.f282j;
                    C4.u uVar = AbstractC0050c.f579b;
                    Object obj2 = c1288w.f12973c;
                    if (obj2 == uVar) {
                        obj2 = null;
                    }
                    this.f281i = 1;
                    Object a = interfaceC0008i.a(obj2, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (a == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                c1288w.f12973c = null;
                return X3.y.a;
            case 1:
                I.i iVar = (I.i) this.f282j;
                C1001x c1001x = iVar.f2089e;
                View view = iVar.a;
                int i7 = this.f281i;
                X3.y yVar = X3.y.a;
                try {
                    if (i7 == 0) {
                        X3.a.e(obj);
                        I.f fVar = new I.f();
                        K.e eVar2 = (K.e) this.f283k;
                        I.e eVar3 = new I.e(fVar, new I.b(iVar, eVar2, 0), new I.b(iVar, eVar2, 1), view);
                        l4.c cVar = iVar.f2086b;
                        if (cVar != null && (eVar = (I.e) cVar.f(eVar3)) != null) {
                            eVar3 = eVar;
                        }
                        Looper myLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (myLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            I.g gVar = iVar.f2093i;
                            if (gVar == null) {
                                gVar = new I.g(iVar, eVar3, fVar, 0);
                                iVar.f2093i = gVar;
                            }
                            view.post(gVar);
                        } else {
                            ActionMode startActionMode = view.startActionMode(new I.q(eVar3), 1);
                            if (startActionMode == null) {
                                return yVar;
                            }
                            iVar.f2092h = startActionMode;
                        }
                        this.f281i = 1;
                        Object p5 = fVar.a.p(this);
                        EnumC0927a enumC0927a2 = EnumC0927a.f11114c;
                        if (p5 != enumC0927a2) {
                            p5 = yVar;
                        }
                        if (p5 == enumC0927a2) {
                            return enumC0927a2;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        X3.a.e(obj);
                    }
                    if (Looper.myLooper() != (handler != 0 ? handler.getLooper() : null)) {
                        Runnable runnable = iVar.f2094j;
                        if (runnable == null) {
                            runnable = new I.h(iVar, 0);
                            iVar.f2094j = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = iVar.f2092h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    I.g gVar2 = iVar.f2093i;
                    if (gVar2 != null) {
                        view.removeCallbacks(gVar2);
                    }
                    iVar.f2092h = null;
                    return yVar;
                } finally {
                    c1001x.a();
                    Looper myLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (myLooper2 != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnable2 = iVar.f2094j;
                        if (runnable2 == null) {
                            runnable2 = new I.h(iVar, 0);
                            iVar.f2094j = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode2 = iVar.f2092h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    I.g gVar3 = iVar.f2093i;
                    if (gVar3 != null) {
                        view.removeCallbacks(gVar3);
                    }
                    iVar.f2092h = null;
                }
            case 2:
                K.b bVar = (K.b) this.f283k;
                C0607g0 c0607g0 = ((K.c) this.f282j).f2914c;
                int i8 = this.f281i;
                X3.y yVar2 = X3.y.a;
                try {
                    if (i8 == 0) {
                        X3.a.e(obj);
                        c0607g0.setValue(bVar);
                        this.f281i = 1;
                        Object p6 = bVar.f2912b.p(this);
                        EnumC0927a enumC0927a3 = EnumC0927a.f11114c;
                        if (p6 != enumC0927a3) {
                            p6 = yVar2;
                        }
                        if (p6 == enumC0927a3) {
                            return enumC0927a3;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        X3.a.e(obj);
                    }
                    return yVar2;
                } finally {
                    c0607g0.setValue(null);
                }
            case 3:
                int i9 = this.f281i;
                if (i9 == 0) {
                    X3.a.e(obj);
                    C0513s c0513s = (C0513s) this.f282j;
                    C0508m c0508m = new C0508m(c0513s, 3);
                    C0510o c0510o = new C0510o((l4.f) this.f283k, c0513s, null);
                    this.f281i = 1;
                    Object g3 = AbstractC0507l.g(c0508m, c0510o, this);
                    EnumC0927a enumC0927a4 = EnumC0927a.f11114c;
                    if (g3 == enumC0927a4) {
                        return enumC0927a4;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                return X3.y.a;
            case 4:
                int i10 = this.f281i;
                if (i10 == 0) {
                    X3.a.e(obj);
                    LLMProviderDao lLMProviderDao = ((C0720i) this.f282j).a;
                    String str = (String) this.f283k;
                    this.f281i = 1;
                    Object delete = lLMProviderDao.delete(str, this);
                    EnumC0927a enumC0927a5 = EnumC0927a.f11114c;
                    if (delete == enumC0927a5) {
                        return enumC0927a5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                return Boolean.TRUE;
            default:
                C1606t c1606t = (C1606t) this.f282j;
                int i11 = this.f281i;
                if (i11 == 0) {
                    X3.a.e(obj);
                    C1591o c1591o = new C1591o(c1606t, 2);
                    C1594p c1594p = new C1594p(null, (d4.i) this.f283k, c1606t);
                    this.f281i = 1;
                    Object d6 = AbstractC1573i.d(c1591o, c1594p, this);
                    EnumC0927a enumC0927a6 = EnumC0927a.f11114c;
                    if (d6 == enumC0927a6) {
                        return enumC0927a6;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                C1517E b5 = c1606t.b();
                C0599c0 c0599c0 = c1606t.f14472f;
                Object a6 = b5.a(c0599c0.g());
                if (a6 != null) {
                    if (Math.abs(c0599c0.g() - c1606t.b().c(a6)) < 0.5f) {
                        c1606t.f14470d.setValue(a6);
                        c1606t.e(a6);
                    }
                }
                return X3.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0013n(Object obj, Object obj2, InterfaceC0905c interfaceC0905c, int i6) {
        super(1, interfaceC0905c);
        this.f280h = i6;
        this.f282j = obj;
        this.f283k = obj2;
    }
}
