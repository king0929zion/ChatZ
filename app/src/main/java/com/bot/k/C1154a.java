package k;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154a extends AbstractSet {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1159f f12525c;

    public C1154a(C1159f c1159f) {
        this.f12525c = c1159f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1157d(this.f12525c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12525c.f12539f;
    }
}
