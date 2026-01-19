package com.vladsch.flexmark.util.format;

import java.util.ArrayList;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements TableRowManipulator {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f11355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer[] f11356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BiFunction f11357d;

    public /* synthetic */ f(int[] iArr, Integer[] numArr, BiFunction biFunction, int i6) {
        this.a = i6;
        this.f11355b = iArr;
        this.f11356c = numArr;
        this.f11357d = biFunction;
    }

    @Override // com.vladsch.flexmark.util.format.TableRowManipulator
    public final int apply(TableRow tableRow, int i6, ArrayList arrayList, int i7) {
        int lambda$aggregateTotalColumnsWithoutRows$12;
        int lambda$aggregateTotalColumnsWithoutColumns$11;
        switch (this.a) {
            case 0:
                lambda$aggregateTotalColumnsWithoutRows$12 = MarkdownTable.lambda$aggregateTotalColumnsWithoutRows$12(this.f11355b, this.f11356c, this.f11357d, tableRow, i6, arrayList, i7);
                return lambda$aggregateTotalColumnsWithoutRows$12;
            default:
                lambda$aggregateTotalColumnsWithoutColumns$11 = MarkdownTable.lambda$aggregateTotalColumnsWithoutColumns$11(this.f11355b, this.f11356c, this.f11357d, tableRow, i6, arrayList, i7);
                return lambda$aggregateTotalColumnsWithoutColumns$11;
        }
    }
}
