package org.jsoup.nodes;

import java.util.Map;
import java.util.function.Consumer;
import org.jsoup.parser.Tag;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13527b;

    public /* synthetic */ a(Object obj, int i6) {
        this.a = i6;
        this.f13527b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Element.b((StringBuilder) this.f13527b, (Node) obj);
                return;
            default:
                Tag.lambda$static$7((Map.Entry) this.f13527b, (Tag) obj);
                return;
        }
    }
}
