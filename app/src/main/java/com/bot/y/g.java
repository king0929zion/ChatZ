package Y;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends Y3.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9559c;

    /* renamed from: e, reason: collision with root package name */
    public final e f9560e;

    public /* synthetic */ g(int i6, e eVar) {
        this.f9559c = i6;
        this.f9560e = eVar;
    }

    @Override // Y3.g
    public final int a() {
        switch (this.f9559c) {
            case 0:
                e eVar = this.f9560e;
                eVar.getClass();
                return eVar.f9554i;
            default:
                e eVar2 = this.f9560e;
                eVar2.getClass();
                return eVar2.f9554i;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f9559c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9559c) {
            case 0:
                this.f9560e.clear();
                return;
            default:
                this.f9560e.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f9559c) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                e eVar = this.f9560e;
                Object obj2 = eVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.f9560e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9559c) {
            case 0:
                return new h(this.f9560e);
            default:
                o[] oVarArr = new o[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    oVarArr[i6] = new p(1);
                }
                return new f(this.f9560e, oVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f9559c) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.f9560e.remove(entry.getKey(), entry.getValue());
            default:
                e eVar = this.f9560e;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
