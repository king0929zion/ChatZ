package Y;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends Y3.h implements W.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9565c;

    /* renamed from: e, reason: collision with root package name */
    public final c f9566e;

    public /* synthetic */ k(c cVar, int i6) {
        this.f9565c = i6;
        this.f9566e = cVar;
    }

    @Override // Y3.AbstractC0734a
    public final int a() {
        switch (this.f9565c) {
            case 0:
                c cVar = this.f9566e;
                cVar.getClass();
                return cVar.f9545e;
            default:
                c cVar2 = this.f9566e;
                cVar2.getClass();
                return cVar2.f9545e;
        }
    }

    @Override // Y3.AbstractC0734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f9565c) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f9566e;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f9566e.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9565c) {
            case 0:
                n nVar = this.f9566e.f9544c;
                o[] oVarArr = new o[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    oVarArr[i6] = new p(0);
                }
                return new d(nVar, oVarArr);
            default:
                n nVar2 = this.f9566e.f9544c;
                o[] oVarArr2 = new o[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    oVarArr2[i7] = new p(1);
                }
                return new d(nVar2, oVarArr2);
        }
    }
}
