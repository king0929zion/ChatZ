package com.vladsch.flexmark.util.sequence.builder;

import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SegmentBuilderBase f11376b;

    public /* synthetic */ a(SegmentBuilderBase segmentBuilderBase, int i6) {
        this.a = i6;
        this.f11376b = segmentBuilderBase;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return this.f11376b.optimizeText((Object[]) obj);
            default:
                return this.f11376b.handleOverlap((Object[]) obj);
        }
    }
}
