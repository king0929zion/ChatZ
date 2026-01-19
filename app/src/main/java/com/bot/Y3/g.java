package Y3;

import java.util.AbstractSet;
import java.util.Set;
import n4.InterfaceC1377f;

/* loaded from: classes.dex */
public abstract class g extends AbstractSet implements Set, InterfaceC1377f {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
