package com.vladsch.flexmark.util.misc;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements CharPredicate {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharPredicate f11364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CharPredicate f11365c;

    public /* synthetic */ b(CharPredicate charPredicate, CharPredicate charPredicate2, int i6) {
        this.a = i6;
        this.f11364b = charPredicate;
        this.f11365c = charPredicate2;
    }

    @Override // com.vladsch.flexmark.util.misc.CharPredicate, java.util.function.IntPredicate
    public final boolean test(int i6) {
        boolean lambda$and$29;
        boolean lambda$or$31;
        switch (this.a) {
            case 0:
                lambda$and$29 = this.f11364b.lambda$and$29(this.f11365c, i6);
                return lambda$and$29;
            default:
                lambda$or$31 = this.f11364b.lambda$or$31(this.f11365c, i6);
                return lambda$or$31;
        }
    }
}
