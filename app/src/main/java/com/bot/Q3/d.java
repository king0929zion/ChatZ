package Q3;

import C4.u;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import n4.InterfaceC1372a;
import n4.InterfaceC1374c;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final ArrayList f6459e = new ArrayList();
    public final u a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1410a f6460b;

    /* renamed from: c, reason: collision with root package name */
    public List f6461c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6462d;

    public d(u uVar, AbstractC1410a abstractC1410a) {
        AbstractC1276k.f(uVar, "phase");
        ArrayList arrayList = f6459e;
        AbstractC1276k.d(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        if ((arrayList instanceof InterfaceC1372a) && !(arrayList instanceof InterfaceC1374c)) {
            AbstractC1291z.f(arrayList, "kotlin.collections.MutableList");
            throw null;
        }
        this.a = uVar;
        this.f6460b = abstractC1410a;
        this.f6461c = arrayList;
        this.f6462d = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final void a(l4.f fVar) {
        if (this.f6462d) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f6461c);
            this.f6461c = arrayList;
            this.f6462d = false;
        }
        this.f6461c.add(fVar);
    }

    public final String toString() {
        return "Phase `" + this.a.f717e + "`, " + this.f6461c.size() + " handlers";
    }
}
