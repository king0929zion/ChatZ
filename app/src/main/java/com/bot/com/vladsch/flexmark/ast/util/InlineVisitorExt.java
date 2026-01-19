package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.AutoLink;
import com.vladsch.flexmark.ast.Code;
import com.vladsch.flexmark.ast.Emphasis;
import com.vladsch.flexmark.ast.HardLineBreak;
import com.vladsch.flexmark.ast.HtmlEntity;
import com.vladsch.flexmark.ast.HtmlInline;
import com.vladsch.flexmark.ast.HtmlInlineComment;
import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.ast.ImageRef;
import com.vladsch.flexmark.ast.Link;
import com.vladsch.flexmark.ast.LinkRef;
import com.vladsch.flexmark.ast.MailLink;
import com.vladsch.flexmark.ast.SoftLineBreak;
import com.vladsch.flexmark.ast.StrongEmphasis;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.ast.Visitor;
import java.util.Objects;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class InlineVisitorExt {
    public static <V extends InlineVisitor> VisitHandler<?>[] VISIT_HANDLERS(final V v5) {
        Objects.requireNonNull(v5);
        final int i6 = 0;
        VisitHandler visitHandler = new VisitHandler(AutoLink.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i6) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i7 = 11;
        VisitHandler visitHandler2 = new VisitHandler(Code.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i7) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i8 = 12;
        VisitHandler visitHandler3 = new VisitHandler(Emphasis.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i8) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i9 = 13;
        VisitHandler visitHandler4 = new VisitHandler(HardLineBreak.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i9) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i10 = 14;
        VisitHandler visitHandler5 = new VisitHandler(HtmlEntity.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i10) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i11 = 1;
        VisitHandler visitHandler6 = new VisitHandler(HtmlInline.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i11) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i12 = 2;
        VisitHandler visitHandler7 = new VisitHandler(HtmlInlineComment.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i12) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i13 = 3;
        VisitHandler visitHandler8 = new VisitHandler(Image.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i13) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i14 = 4;
        VisitHandler visitHandler9 = new VisitHandler(ImageRef.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i14) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i15 = 5;
        VisitHandler visitHandler10 = new VisitHandler(Link.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i15) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i16 = 6;
        VisitHandler visitHandler11 = new VisitHandler(LinkRef.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i16) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i17 = 7;
        VisitHandler visitHandler12 = new VisitHandler(MailLink.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i17) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i18 = 8;
        VisitHandler visitHandler13 = new VisitHandler(SoftLineBreak.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i18) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i19 = 9;
        VisitHandler visitHandler14 = new VisitHandler(StrongEmphasis.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i19) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        });
        final int i20 = 10;
        return new VisitHandler[]{visitHandler, visitHandler2, visitHandler3, visitHandler4, visitHandler5, visitHandler6, visitHandler7, visitHandler8, visitHandler9, visitHandler10, visitHandler11, visitHandler12, visitHandler13, visitHandler14, new VisitHandler(Text.class, new Visitor() { // from class: com.vladsch.flexmark.ast.util.d
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i20) {
                    case 0:
                        v5.visit((AutoLink) node);
                        return;
                    case 1:
                        v5.visit((HtmlInline) node);
                        return;
                    case 2:
                        v5.visit((HtmlInlineComment) node);
                        return;
                    case 3:
                        v5.visit((Image) node);
                        return;
                    case 4:
                        v5.visit((ImageRef) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((Link) node);
                        return;
                    case 6:
                        v5.visit((LinkRef) node);
                        return;
                    case 7:
                        v5.visit((MailLink) node);
                        return;
                    case 8:
                        v5.visit((SoftLineBreak) node);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        v5.visit((StrongEmphasis) node);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        v5.visit((Text) node);
                        return;
                    case 11:
                        v5.visit((Code) node);
                        return;
                    case 12:
                        v5.visit((Emphasis) node);
                        return;
                    case 13:
                        v5.visit((HardLineBreak) node);
                        return;
                    default:
                        v5.visit((HtmlEntity) node);
                        return;
                }
            }
        })};
    }
}
