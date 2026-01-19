package com.vladsch.flexmark.util.visitor;

import com.vladsch.flexmark.util.visitor.AstAction;

/* loaded from: classes.dex */
public abstract class AstHandler<N, A extends AstAction<? super N>> {
    private final Class<? extends N> aClass;
    private final A adapter;

    public AstHandler(Class<? extends N> cls, A a) {
        this.aClass = cls;
        this.adapter = a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AstHandler astHandler = (AstHandler) obj;
            if (this.aClass == astHandler.aClass && this.adapter == astHandler.adapter) {
                return true;
            }
        }
        return false;
    }

    public A getAdapter() {
        return this.adapter;
    }

    public Class<? extends N> getNodeType() {
        return this.aClass;
    }

    public int hashCode() {
        return this.adapter.hashCode() + (this.aClass.hashCode() * 31);
    }
}
