package Y3;

import i1.AbstractC1087g;
import java.util.Iterator;
import u4.C1770h;

/* loaded from: classes.dex */
public final class t implements t4.h {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9810b;

    public /* synthetic */ t(Object obj, int i6) {
        this.a = i6;
        this.f9810b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [d4.h, l4.e] */
    @Override // t4.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((Iterable) this.f9810b).iterator();
            case 1:
                return AbstractC1087g.m((d4.h) this.f9810b);
            case 2:
                return (Iterator) this.f9810b;
            default:
                return new C1770h((CharSequence) this.f9810b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(l4.e eVar) {
        this.a = 1;
        this.f9810b = (d4.h) eVar;
    }
}
