package v3;

import I3.C0241e;
import I3.m;
import I3.w;
import J3.b;
import J3.c;
import J3.d;
import b4.InterfaceC0910h;
import i1.AbstractC1087g;
import io.ktor.utils.io.x;
import io.ktor.utils.io.y;
import l4.f;
import m4.AbstractC1276k;
import x4.t0;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1824a extends c {
    public final d a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0910h f15379b;

    /* renamed from: c, reason: collision with root package name */
    public final f f15380c;

    /* renamed from: d, reason: collision with root package name */
    public final y f15381d;

    public C1824a(d dVar, t0 t0Var, f fVar) {
        y e6;
        AbstractC1276k.f(dVar, "delegate");
        AbstractC1276k.f(t0Var, "callContext");
        this.a = dVar;
        this.f15379b = t0Var;
        this.f15380c = fVar;
        if (dVar instanceof b) {
            e6 = AbstractC1087g.b(((b) dVar).e());
        } else if (dVar instanceof G3.c) {
            y.a.getClass();
            e6 = (y) x.f12290b.getValue();
        } else {
            if (!(dVar instanceof c)) {
                throw new RuntimeException();
            }
            e6 = ((c) dVar).e();
        }
        this.f15381d = e6;
    }

    @Override // J3.d
    public final Long a() {
        return this.a.a();
    }

    @Override // J3.d
    public final C0241e b() {
        return this.a.b();
    }

    @Override // J3.d
    public final m c() {
        return this.a.c();
    }

    @Override // J3.d
    public final w d() {
        return this.a.d();
    }

    @Override // J3.c
    public final y e() {
        return G3.b.a(this.f15381d, this.f15379b, this.a.a(), this.f15380c);
    }
}
