package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.util.ast.BlockNodeVisitor;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class HeadingCollectingVisitor {
    private final ArrayList<Heading> headings;
    private final NodeVisitor myVisitor;

    public HeadingCollectingVisitor() {
        ArrayList<Heading> arrayList = new ArrayList<>();
        this.headings = arrayList;
        this.myVisitor = new BlockNodeVisitor(new VisitHandler(Heading.class, new c(arrayList, 2)));
    }

    public void collect(Node node) {
        this.myVisitor.visit(node);
    }

    public ArrayList<Heading> collectAndGetHeadings(Node node) {
        this.myVisitor.visit(node);
        return this.headings;
    }

    public ArrayList<Heading> getHeadings() {
        return this.headings;
    }
}
