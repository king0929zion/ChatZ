package Y2;

import java.util.Iterator;

/* renamed from: Y2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719h extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Iterator f9725g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9726h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0720i f9727i;

    /* renamed from: j, reason: collision with root package name */
    public int f9728j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719h(C0720i c0720i, d4.c cVar) {
        super(cVar);
        this.f9727i = c0720i;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9726h = obj;
        this.f9728j |= Integer.MIN_VALUE;
        return this.f9727i.k(null, this);
    }
}
