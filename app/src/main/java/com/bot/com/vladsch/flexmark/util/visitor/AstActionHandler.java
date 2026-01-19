package com.vladsch.flexmark.util.visitor;

import com.vladsch.flexmark.ast.util.a;
import com.vladsch.flexmark.util.visitor.AstAction;
import com.vladsch.flexmark.util.visitor.AstActionHandler;
import com.vladsch.flexmark.util.visitor.AstHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public abstract class AstActionHandler<C extends AstActionHandler<C, N, A, H>, N, A extends AstAction<N>, H extends AstHandler<N, A>> {
    private final AstNode<N> astAdapter;
    private final Map<Class<? extends N>, H> customHandlersMap = new HashMap();

    public AstActionHandler(AstNode<N> astNode) {
        this.astAdapter = astNode;
    }

    private A getAction(H h3) {
        if (h3 == null) {
            return null;
        }
        return (A) h3.getAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processNodeOnly$0(Object[] objArr, BiFunction biFunction, Object obj, AstAction astAction) {
        objArr[0] = biFunction.apply(obj, astAction);
    }

    public C addActionHandler(H h3) {
        this.customHandlersMap.put(h3.getNodeType(), h3);
        return this;
    }

    @SafeVarargs
    public final C addActionHandlers(H[]... hArr) {
        for (H[] hArr2 : hArr) {
            for (H h3 : hArr2) {
                this.customHandlersMap.put(h3.getNodeType(), h3);
            }
        }
        return this;
    }

    public H getHandler(N n3) {
        return this.customHandlersMap.get(n3.getClass());
    }

    public Set<Class<? extends N>> getNodeClasses() {
        return this.customHandlersMap.keySet();
    }

    public final void processChildren(N n3, BiConsumer<N, A> biConsumer) {
        N firstChild = this.astAdapter.getFirstChild(n3);
        while (firstChild != null) {
            N next = this.astAdapter.getNext(firstChild);
            processNode(firstChild, true, biConsumer);
            firstChild = next;
        }
    }

    public void processNode(N n3, boolean z5, BiConsumer<N, A> biConsumer) {
        A action = getAction((AstActionHandler<C, N, A, H>) n3);
        if (action != null) {
            biConsumer.accept(n3, action);
        } else if (z5) {
            processChildren(n3, biConsumer);
        }
    }

    public final <R> R processNodeOnly(N n3, R r5, BiFunction<N, A, R> biFunction) {
        Object[] objArr = {r5};
        processNode(n3, false, new a(3, objArr, biFunction));
        return (R) objArr[0];
    }

    public A getAction(N n3) {
        return getAction((AstActionHandler<C, N, A, H>) this.customHandlersMap.get(n3.getClass()));
    }

    public H getHandler(Class<?> cls) {
        return this.customHandlersMap.get(cls);
    }

    public A getAction(Class<?> cls) {
        return getAction((AstActionHandler<C, N, A, H>) this.customHandlersMap.get(cls));
    }
}
