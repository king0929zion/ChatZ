package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.formatter.internal.CoreNodeFormatter;
import com.vladsch.flexmark.util.misc.Utils;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.jsoup.nodes.Node;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Function {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11310b;

    public /* synthetic */ i(Object obj, int i6) {
        this.a = i6;
        this.f11310b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Boolean lambda$removeIf$0;
        switch (this.a) {
            case 0:
                return NodeRepositoryFormatter.d((NodeRepositoryFormatter) this.f11310b, (String) obj);
            case 1:
                return CoreNodeFormatter.o((CoreNodeFormatter) this.f11310b, (String) obj);
            case 2:
                lambda$removeIf$0 = Utils.lambda$removeIf$0((BiFunction) this.f11310b, (Map.Entry) obj);
                return lambda$removeIf$0;
            default:
                return ((Class) this.f11310b).cast((Node) obj);
        }
    }
}
