package com.vladsch.flexmark.util.sequence.mappers;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements CharMapper {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharMapper f11379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CharMapper f11380c;

    public /* synthetic */ a(CharMapper charMapper, CharMapper charMapper2, int i6) {
        this.a = i6;
        this.f11379b = charMapper;
        this.f11380c = charMapper2;
    }

    @Override // com.vladsch.flexmark.util.sequence.mappers.CharMapper
    public final char map(char c6) {
        char lambda$compose$1;
        char lambda$andThen$2;
        switch (this.a) {
            case 0:
                lambda$compose$1 = this.f11379b.lambda$compose$1(this.f11380c, c6);
                return lambda$compose$1;
            default:
                lambda$andThen$2 = this.f11379b.lambda$andThen$2(this.f11380c, c6);
                return lambda$andThen$2;
        }
    }
}
