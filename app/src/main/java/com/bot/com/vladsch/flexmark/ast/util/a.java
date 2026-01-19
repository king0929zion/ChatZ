package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.util.AttributeProvidingHandler;
import com.vladsch.flexmark.html.renderer.AttributablePart;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.html.MutableAttributeImpl;
import com.vladsch.flexmark.util.html.MutableAttributes;
import com.vladsch.flexmark.util.visitor.AstAction;
import com.vladsch.flexmark.util.visitor.AstActionHandler;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements BiConsumer {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11274c;

    public /* synthetic */ a(int i6, Object obj, Object obj2) {
        this.a = i6;
        this.f11273b = obj;
        this.f11274c = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                AttributeProviderAdapter.b((AttributablePart) this.f11273b, (MutableAttributes) this.f11274c, (Node) obj, (AttributeProvidingHandler.AttributeProvidingVisitor) obj2);
                return;
            case 1:
                MutableAttributeImpl.b((MutableAttributeImpl) this.f11273b, (Map) this.f11274c, (String) obj, (String) obj2);
                return;
            case 2:
                MutableAttributeImpl.a((Map) this.f11273b, (boolean[]) this.f11274c, (String) obj, (String) obj2);
                return;
            default:
                AstActionHandler.lambda$processNodeOnly$0((Object[]) this.f11273b, (BiFunction) this.f11274c, obj, (AstAction) obj2);
                return;
        }
    }
}
