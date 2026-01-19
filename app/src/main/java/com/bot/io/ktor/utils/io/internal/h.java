package io.ktor.utils.io.internal;

/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: c, reason: collision with root package name */
    public final i f12174c;

    public h(i iVar) {
        super(iVar.a, iVar.f12184b);
        this.f12174c = iVar;
    }

    @Override // io.ktor.utils.io.internal.l
    public final l c() {
        return this.f12174c.f12178f;
    }

    @Override // io.ktor.utils.io.internal.l
    public final l d() {
        return this.f12174c.f12179g;
    }

    public final String toString() {
        return "IDLE(with buffer)";
    }
}
