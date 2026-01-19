package u4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.Iterator;
import m4.AbstractC1276k;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1765c implements t4.h {
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15176b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.e f15177c;

    public C1765c(CharSequence charSequence, int i6, l4.e eVar) {
        AbstractC1276k.f(charSequence, FlexmarkHtmlConverter.INPUT_NODE);
        this.a = charSequence;
        this.f15176b = i6;
        this.f15177c = eVar;
    }

    @Override // t4.h
    public final Iterator iterator() {
        return new C1764b(this);
    }
}
