package io.ktor.utils.io;

import java.lang.reflect.Constructor;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class F extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Constructor f12098f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(Constructor constructor, int i6) {
        super(1);
        this.f12097e = i6;
        this.f12098f = constructor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.c
    public final Object f(Object obj) {
        Object b5;
        Object b6;
        X3.k kVar;
        Object obj2;
        switch (this.f12097e) {
            case 0:
                Throwable th = (Throwable) obj;
                AbstractC1276k.f(th, "e");
                try {
                    Object newInstance = this.f12098f.newInstance(th.getMessage(), th);
                    AbstractC1276k.d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                    b5 = (Throwable) newInstance;
                } catch (Throwable th2) {
                    b5 = X3.a.b(th2);
                }
                if (b5 instanceof X3.k) {
                    b5 = null;
                }
                return (Throwable) b5;
            case 1:
                Throwable th3 = (Throwable) obj;
                AbstractC1276k.f(th3, "e");
                try {
                    Object newInstance2 = this.f12098f.newInstance(th3);
                    AbstractC1276k.d(newInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                    b6 = (Throwable) newInstance2;
                } catch (Throwable th4) {
                    b6 = X3.a.b(th4);
                }
                if (b6 instanceof X3.k) {
                    b6 = null;
                }
                return (Throwable) b6;
            case 2:
                Throwable th5 = (Throwable) obj;
                AbstractC1276k.f(th5, "e");
                try {
                    Object newInstance3 = this.f12098f.newInstance(th5.getMessage());
                    AbstractC1276k.d(newInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                    Throwable th6 = (Throwable) newInstance3;
                    th6.initCause(th5);
                    kVar = th6;
                } catch (Throwable th7) {
                    kVar = X3.a.b(th7);
                }
                boolean z5 = kVar instanceof X3.k;
                Object obj3 = kVar;
                if (z5) {
                    obj3 = null;
                }
                return (Throwable) obj3;
            default:
                Throwable th8 = (Throwable) obj;
                AbstractC1276k.f(th8, "e");
                try {
                    Object newInstance4 = this.f12098f.newInstance(null);
                    AbstractC1276k.d(newInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                    Throwable th9 = (Throwable) newInstance4;
                    th9.initCause(th8);
                    obj2 = th9;
                } catch (Throwable th10) {
                    obj2 = X3.a.b(th10);
                }
                return (Throwable) (obj2 instanceof X3.k ? null : obj2);
        }
    }
}
