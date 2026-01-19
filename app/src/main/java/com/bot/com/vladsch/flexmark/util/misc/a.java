package com.vladsch.flexmark.util.misc;

import java.util.Objects;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11363b;

    public /* synthetic */ a(Object obj, int i6) {
        this.a = i6;
        this.f11363b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean equals;
        boolean equals2;
        switch (this.a) {
            case 0:
                equals = Objects.equals(this.f11363b, obj);
                return equals;
            default:
                equals2 = Objects.equals(this.f11363b, obj);
                return equals2;
        }
    }
}
