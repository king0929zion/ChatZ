package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.BlockQuote;
import com.vladsch.flexmark.ast.BulletList;
import com.vladsch.flexmark.ast.BulletListItem;
import com.vladsch.flexmark.ast.FencedCodeBlock;
import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.HtmlBlock;
import com.vladsch.flexmark.ast.HtmlCommentBlock;
import com.vladsch.flexmark.ast.IndentedCodeBlock;
import com.vladsch.flexmark.ast.OrderedList;
import com.vladsch.flexmark.ast.OrderedListItem;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.Reference;
import com.vladsch.flexmark.ast.ThematicBreak;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.ast.Visitor;
import java.util.Objects;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class BlockVisitorExt {
    public static <V extends BlockVisitor> VisitHandler<?>[] VISIT_HANDLERS(final V v5) {
        Objects.requireNonNull(v5);
        final int i6 = 0;
        final int i7 = 9;
        final int i8 = 10;
        final int i9 = 11;
        final int i10 = 12;
        final int i11 = 13;
        final int i12 = 1;
        final int i13 = 2;
        final int i14 = 3;
        final int i15 = 4;
        final int i16 = 5;
        final int i17 = 6;
        final int i18 = 7;
        final int i19 = 8;
        return new VisitHandler[]{new VisitHandler(BlockQuote.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i6) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(BulletList.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i7) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(Document.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i8) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(FencedCodeBlock.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i9) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(Heading.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i10) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(HtmlBlock.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i11) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(HtmlCommentBlock.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i12) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(IndentedCodeBlock.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i13) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(BulletListItem.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i14) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(OrderedListItem.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i15) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(OrderedList.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i16) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(Paragraph.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i17) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(Reference.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i18) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        }), new VisitHandler(ThematicBreak.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i19) {
                    case 0:
                        v5.visit((BlockQuote) node);
                        return;
                    case 1:
                        v5.visit((HtmlCommentBlock) node);
                        return;
                    case 2:
                        v5.visit((IndentedCodeBlock) node);
                        return;
                    case 3:
                        v5.visit((BulletListItem) node);
                        return;
                    case 4:
                        v5.visit((OrderedListItem) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((OrderedList) node);
                        return;
                    case 6:
                        v5.visit((Paragraph) node);
                        return;
                    case 7:
                        v5.visit((Reference) node);
                        return;
                    case 8:
                        v5.visit((ThematicBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((BulletList) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Document) node);
                        return;
                    case 11:
                        v5.visit((FencedCodeBlock) node);
                        return;
                    case 12:
                        v5.visit((Heading) node);
                        return;
                    default:
                        v5.visit((HtmlBlock) node);
                        return;
                }
            }
        })};
    }
}
