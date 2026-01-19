package Y3;

import java.util.AbstractList;
import java.util.List;
import n4.InterfaceC1374c;

/* renamed from: Y3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0739f implements AbstractList implements List, InterfaceC1374c,   {
    public abstract int a();

    public abstract Object b(int i6);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i6) {
        return b(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
