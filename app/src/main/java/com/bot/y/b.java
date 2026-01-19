package Y;

import java.util.NoSuchElementException;
import n4.InterfaceC1375d;

/* loaded from: classes.dex */
public final class b extends a implements InterfaceC1375d {

    /* renamed from: g, reason: collision with root package name */
    public final h f9541g;

    /* renamed from: h, reason: collision with root package name */
    public Object f9542h;

    public b(h hVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f9541g = hVar;
        this.f9542h = obj2;
    }

    @Override // Y.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f9542h;
    }

    @Override // Y.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f9542h;
        this.f9542h = obj;
        f fVar = (f) this.f9541g.f9562e;
        e eVar = fVar.f9555g;
        Object obj3 = this.f9539e;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z5 = fVar.f9548f;
        if (!z5) {
            eVar.put(obj3, obj);
        } else {
            if (!z5) {
                throw new NoSuchElementException();
            }
            o oVar = fVar.f9546c[fVar.f9547e];
            Object obj4 = oVar.f9573c[oVar.f9575f];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f9551f, obj4, 0);
        }
        fVar.f9558j = eVar.f9553h;
        return obj2;
    }
}
