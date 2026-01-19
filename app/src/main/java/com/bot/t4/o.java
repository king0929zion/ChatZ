package t4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements h {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final h f14955b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.c f14956c;

    public /* synthetic */ o(h hVar, l4.c cVar, int i6) {
        this.a = i6;
        this.f14955b = hVar;
        this.f14956c = cVar;
    }

    @Override // t4.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new e(this);
            default:
                return new N3.l(this);
        }
    }
}
