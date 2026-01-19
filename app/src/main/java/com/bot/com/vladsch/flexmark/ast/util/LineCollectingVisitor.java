package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.HardLineBreak;
import com.vladsch.flexmark.ast.HtmlEntity;
import com.vladsch.flexmark.ast.HtmlInline;
import com.vladsch.flexmark.ast.SoftLineBreak;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ast.TextBase;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.ast.Visitor;
import com.vladsch.flexmark.util.sequence.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class LineCollectingVisitor {
    private List<Integer> myEOLs;
    private int myEndOffset;
    private List<Range> myLines = Collections.EMPTY_LIST;
    private int myStartOffset;
    private final NodeVisitor myVisitor;

    public LineCollectingVisitor() {
        final int i6 = 0;
        final int i7 = 1;
        final int i8 = 2;
        final int i9 = 3;
        final int i10 = 4;
        final int i11 = 5;
        this.myVisitor = new NodeVisitor(new VisitHandler(Text.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LineCollectingVisitor f11278b;

            {
                this.f11278b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i6) {
                    case 0:
                        this.f11278b.visit((Text) node);
                        return;
                    case 1:
                        this.f11278b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11278b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11278b.visit((HtmlInline) node);
                        return;
                    case 4:
                        this.f11278b.visit((SoftLineBreak) node);
                        return;
                    default:
                        this.f11278b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(TextBase.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LineCollectingVisitor f11278b;

            {
                this.f11278b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i7) {
                    case 0:
                        this.f11278b.visit((Text) node);
                        return;
                    case 1:
                        this.f11278b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11278b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11278b.visit((HtmlInline) node);
                        return;
                    case 4:
                        this.f11278b.visit((SoftLineBreak) node);
                        return;
                    default:
                        this.f11278b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(HtmlEntity.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LineCollectingVisitor f11278b;

            {
                this.f11278b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i8) {
                    case 0:
                        this.f11278b.visit((Text) node);
                        return;
                    case 1:
                        this.f11278b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11278b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11278b.visit((HtmlInline) node);
                        return;
                    case 4:
                        this.f11278b.visit((SoftLineBreak) node);
                        return;
                    default:
                        this.f11278b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(HtmlInline.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LineCollectingVisitor f11278b;

            {
                this.f11278b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i9) {
                    case 0:
                        this.f11278b.visit((Text) node);
                        return;
                    case 1:
                        this.f11278b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11278b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11278b.visit((HtmlInline) node);
                        return;
                    case 4:
                        this.f11278b.visit((SoftLineBreak) node);
                        return;
                    default:
                        this.f11278b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(SoftLineBreak.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LineCollectingVisitor f11278b;

            {
                this.f11278b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i10) {
                    case 0:
                        this.f11278b.visit((Text) node);
                        return;
                    case 1:
                        this.f11278b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11278b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11278b.visit((HtmlInline) node);
                        return;
                    case 4:
                        this.f11278b.visit((SoftLineBreak) node);
                        return;
                    default:
                        this.f11278b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(HardLineBreak.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LineCollectingVisitor f11278b;

            {
                this.f11278b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i11) {
                    case 0:
                        this.f11278b.visit((Text) node);
                        return;
                    case 1:
                        this.f11278b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11278b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11278b.visit((HtmlInline) node);
                        return;
                    case 4:
                        this.f11278b.visit((SoftLineBreak) node);
                        return;
                    default:
                        this.f11278b.visit((HardLineBreak) node);
                        return;
                }
            }
        }));
    }

    private void finalizeLines() {
        int i6 = this.myStartOffset;
        int i7 = this.myEndOffset;
        if (i6 < i7) {
            this.myLines.add(Range.of(i6, i7));
            this.myEOLs.add(0);
            this.myStartOffset = this.myEndOffset;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(SoftLineBreak softLineBreak) {
        this.myLines.add(Range.of(this.myStartOffset, softLineBreak.getEndOffset()));
        this.myEOLs.add(Integer.valueOf(softLineBreak.getTextLength()));
        this.myStartOffset = softLineBreak.getEndOffset();
    }

    public void collect(Node node) {
        this.myLines = new ArrayList();
        this.myEOLs = new ArrayList();
        this.myStartOffset = node.getStartOffset();
        this.myEndOffset = node.getEndOffset();
        this.myVisitor.visit(node);
    }

    public List<Range> collectAndGetRanges(Node node) {
        collect(node);
        return getLines();
    }

    public List<Integer> getEOLs() {
        finalizeLines();
        return this.myEOLs;
    }

    public List<Range> getLines() {
        finalizeLines();
        return this.myLines;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(HardLineBreak hardLineBreak) {
        this.myLines.add(Range.of(this.myStartOffset, hardLineBreak.getEndOffset()));
        this.myEOLs.add(Integer.valueOf(hardLineBreak.getTextLength()));
        this.myStartOffset = hardLineBreak.getEndOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(HtmlEntity htmlEntity) {
        this.myEndOffset = htmlEntity.getEndOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(HtmlInline htmlInline) {
        this.myEndOffset = htmlInline.getEndOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(Text text) {
        this.myEndOffset = text.getEndOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(TextBase textBase) {
        this.myEndOffset = textBase.getEndOffset();
    }
}
