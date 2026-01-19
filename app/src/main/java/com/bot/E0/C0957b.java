package e0;

import H0.C0158m;
import T.B0;
import T.C0602e;
import f0.InterfaceC0994q;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957b implements B0 {

    /* renamed from: c, reason: collision with root package name */
    public j f11545c;

    /* renamed from: e, reason: collision with root package name */
    public f f11546e;

    /* renamed from: f, reason: collision with root package name */
    public String f11547f;

    /* renamed from: g, reason: collision with root package name */
    public Object f11548g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f11549h;

    /* renamed from: i, reason: collision with root package name */
    public e f11550i;

    /* renamed from: j, reason: collision with root package name */
    public final Y3.l f11551j = new Y3.l(this, 8);

    public C0957b(j jVar, f fVar, String str, Object obj, Object[] objArr) {
        this.f11545c = jVar;
        this.f11546e = fVar;
        this.f11547f = str;
        this.f11548g = obj;
        this.f11549h = objArr;
    }

    @Override // T.B0
    public final void a() {
        e eVar = this.f11550i;
        if (eVar != null) {
            ((C0158m) eVar).t();
        }
    }

    @Override // T.B0
    public final void b() {
        e eVar = this.f11550i;
        if (eVar != null) {
            ((C0158m) eVar).t();
        }
    }

    public final void c() {
        String a;
        f fVar = this.f11546e;
        if (this.f11550i != null) {
            throw new IllegalArgumentException(("entry(" + this.f11550i + ") is not null").toString());
        }
        if (fVar != null) {
            Y3.l lVar = this.f11551j;
            Object b5 = lVar.b();
            if (b5 == null || fVar.b(b5)) {
                this.f11550i = fVar.e(this.f11547f, lVar);
                return;
            }
            if (b5 instanceof InterfaceC0994q) {
                InterfaceC0994q interfaceC0994q = (InterfaceC0994q) b5;
                if (interfaceC0994q.b() == C0602e.f8080g || interfaceC0994q.b() == C0602e.f8083j || interfaceC0994q.b() == C0602e.f8081h) {
                    a = "MutableState containing " + interfaceC0994q.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                a = l.a(b5);
            }
            throw new IllegalArgumentException(a);
        }
    }

    @Override // T.B0
    public final void e() {
        c();
    }
}
