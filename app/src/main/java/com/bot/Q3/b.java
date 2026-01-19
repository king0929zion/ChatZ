package Q3;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: e, reason: collision with root package name */
    public final List f6455e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0910h f6456f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6457g;

    /* renamed from: h, reason: collision with root package name */
    public int f6458h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, List list, Object obj2, InterfaceC0910h interfaceC0910h) {
        super(obj);
        AbstractC1276k.f(obj, "context");
        AbstractC1276k.f(list, "interceptors");
        AbstractC1276k.f(obj2, "subject");
        this.f6455e = list;
        this.f6456f = interfaceC0910h;
        this.f6457g = obj2;
    }

    @Override // Q3.f
    public final Object a(Object obj, d4.c cVar) {
        this.f6458h = 0;
        AbstractC1276k.f(obj, "<set-?>");
        this.f6457g = obj;
        return d(cVar);
    }

    @Override // Q3.f
    public final Object b() {
        return this.f6457g;
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f6456f;
    }

    @Override // Q3.f
    public final Object d(InterfaceC0905c interfaceC0905c) {
        int i6 = this.f6458h;
        if (i6 < 0) {
            return this.f6457g;
        }
        if (i6 < this.f6455e.size()) {
            return f(interfaceC0905c);
        }
        this.f6458h = -1;
        return this.f6457g;
    }

    @Override // Q3.f
    public final Object e(InterfaceC0905c interfaceC0905c, Object obj) {
        AbstractC1276k.f(obj, "<set-?>");
        this.f6457g = obj;
        return d(interfaceC0905c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(b4.InterfaceC0905c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Q3.a
            if (r0 == 0) goto L13
            r0 = r7
            Q3.a r0 = (Q3.a) r0
            int r1 = r0.f6454j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6454j = r1
            goto L18
        L13:
            Q3.a r0 = new Q3.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f6452h
            int r1 = r0.f6454j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            Q3.b r1 = r0.f6451g
            X3.a.e(r7)
            goto L33
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            X3.a.e(r7)
            r1 = r6
        L33:
            int r7 = r1.f6458h
            r3 = -1
            if (r7 != r3) goto L39
            goto L43
        L39:
            java.util.List r4 = r1.f6455e
            int r5 = r4.size()
            if (r7 < r5) goto L46
            r1.f6458h = r3
        L43:
            java.lang.Object r7 = r1.f6457g
            return r7
        L46:
            java.lang.Object r3 = r4.get(r7)
            l4.f r3 = (l4.f) r3
            int r7 = r7 + 1
            r1.f6458h = r7
            java.lang.String r7 = "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }"
            m4.AbstractC1276k.d(r3, r7)
            java.lang.Object r7 = r1.f6457g
            r0.f6451g = r1
            r0.f6454j = r2
            java.lang.Object r7 = r3.d(r1, r7, r0)
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r7 != r3) goto L33
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.b.f(b4.c):java.lang.Object");
    }
}
