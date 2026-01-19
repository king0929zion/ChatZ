package com.vladsch.flexmark.util.format;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements TableRowManipulator {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11348c;

    public /* synthetic */ c(int i6, int i7, int i8) {
        this.a = i8;
        this.f11347b = i6;
        this.f11348c = i7;
    }

    @Override // com.vladsch.flexmark.util.format.TableRowManipulator
    public final int apply(TableRow tableRow, int i6, ArrayList arrayList, int i7) {
        int lambda$moveColumn$5;
        int lambda$deleteColumns$4;
        int lambda$insertColumns$3;
        switch (this.a) {
            case 0:
                lambda$moveColumn$5 = MarkdownTable.lambda$moveColumn$5(this.f11347b, this.f11348c, tableRow, i6, arrayList, i7);
                return lambda$moveColumn$5;
            case 1:
                lambda$deleteColumns$4 = MarkdownTable.lambda$deleteColumns$4(this.f11347b, this.f11348c, tableRow, i6, arrayList, i7);
                return lambda$deleteColumns$4;
            default:
                lambda$insertColumns$3 = MarkdownTable.lambda$insertColumns$3(this.f11347b, this.f11348c, tableRow, i6, arrayList, i7);
                return lambda$insertColumns$3;
        }
    }
}
