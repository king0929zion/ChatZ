package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.HtmlInnerBlock;
import com.vladsch.flexmark.ast.HtmlInnerBlockComment;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.Visitor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Visitor {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11276b;

    public /* synthetic */ c(Object obj, int i6) {
        this.a = i6;
        this.f11276b = obj;
    }

    @Override // com.vladsch.flexmark.util.ast.Visitor
    public final void visit(Node node) {
        switch (this.a) {
            case 0:
                ((HtmlInnerVisitor) this.f11276b).visit((HtmlInnerBlock) node);
                return;
            case 1:
                ((HtmlInnerVisitor) this.f11276b).visit((HtmlInnerBlockComment) node);
                return;
            default:
                ((ArrayList) this.f11276b).add((Heading) node);
                return;
        }
    }
}
