package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.HardLineBreak;
import com.vladsch.flexmark.ast.HtmlEntity;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.SoftLineBreak;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ast.TextBase;
import com.vladsch.flexmark.util.ast.DoNotCollectText;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.ast.Visitor;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.SequenceBuilder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.BiConsumer;

@Deprecated
/* loaded from: classes.dex */
public class TextCollectingVisitor {
    final HashSet<Class<?>> myLineBreakNodes;
    private final NodeVisitor myVisitor;
    SequenceBuilder out;

    public TextCollectingVisitor(Class<?>... clsArr) {
        this.myLineBreakNodes = clsArr.length == 0 ? null : new HashSet<>(Arrays.asList(clsArr));
        final int i6 = 0;
        final int i7 = 1;
        final int i8 = 2;
        final int i9 = 3;
        final int i10 = 4;
        final int i11 = 5;
        this.myVisitor = new NodeVisitor(new VisitHandler(Text.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TextCollectingVisitor f11282b; {
                this.f11282b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i6) {
                    case 0:
                        this.f11282b.visit((Text) node);
                        return;
                    case 1:
                        this.f11282b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11282b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11282b.visit((SoftLineBreak) node);
                        return;
                    case 4:
                        this.f11282b.visit((Paragraph) node);
                        return;
                    default:
                        this.f11282b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(TextBase.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TextCollectingVisitor f11282b; {
                this.f11282b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i7) {
                    case 0:
                        this.f11282b.visit((Text) node);
                        return;
                    case 1:
                        this.f11282b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11282b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11282b.visit((SoftLineBreak) node);
                        return;
                    case 4:
                        this.f11282b.visit((Paragraph) node);
                        return;
                    default:
                        this.f11282b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(HtmlEntity.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TextCollectingVisitor f11282b; {
                this.f11282b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i8) {
                    case 0:
                        this.f11282b.visit((Text) node);
                        return;
                    case 1:
                        this.f11282b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11282b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11282b.visit((SoftLineBreak) node);
                        return;
                    case 4:
                        this.f11282b.visit((Paragraph) node);
                        return;
                    default:
                        this.f11282b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(SoftLineBreak.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TextCollectingVisitor f11282b; {
                this.f11282b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i9) {
                    case 0:
                        this.f11282b.visit((Text) node);
                        return;
                    case 1:
                        this.f11282b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11282b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11282b.visit((SoftLineBreak) node);
                        return;
                    case 4:
                        this.f11282b.visit((Paragraph) node);
                        return;
                    default:
                        this.f11282b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(Paragraph.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TextCollectingVisitor f11282b; {
                this.f11282b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i10) {
                    case 0:
                        this.f11282b.visit((Text) node);
                        return;
                    case 1:
                        this.f11282b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11282b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11282b.visit((SoftLineBreak) node);
                        return;
                    case 4:
                        this.f11282b.visit((Paragraph) node);
                        return;
                    default:
                        this.f11282b.visit((HardLineBreak) node);
                        return;
                }
            }
        }), new VisitHandler(HardLineBreak.class, new Visitor(this) { // from class: com.vladsch.flexmark.ast.util.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TextCollectingVisitor f11282b; {
                this.f11282b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i11) {
                    case 0:
                        this.f11282b.visit((Text) node);
                        return;
                    case 1:
                        this.f11282b.visit((TextBase) node);
                        return;
                    case 2:
                        this.f11282b.visit((HtmlEntity) node);
                        return;
                    case 3:
                        this.f11282b.visit((SoftLineBreak) node);
                        return;
                    case 4:
                        this.f11282b.visit((Paragraph) node);
                        return;
                    default:
                        this.f11282b.visit((HardLineBreak) node);
                        return;
                }
            }
        })) { // from class: com.vladsch.flexmark.ast.util.TextCollectingVisitor.1
            @Override // com.vladsch.flexmark.util.visitor.AstActionHandler
            public void processNode(Node node, boolean z5, BiConsumer<Node, Visitor<Node>> biConsumer) {
                Visitor<Node> action = getAction((AnonymousClass1) node);
                if (action != null) {
                    biConsumer.accept(node, action);
                    return;
                }
                processChildren(node, biConsumer);
                HashSet<Class<?>> hashSet = TextCollectingVisitor.this.myLineBreakNodes;
                if (hashSet == null || !hashSet.contains(node.getClass()) || node.isOrDescendantOfType(DoNotCollectText.class)) {
                    return;
                }
                TextCollectingVisitor.this.out.add(SequenceUtils.EOL);
            }
        };
    }

    public static Class<?>[] concatArrays(Class<?>[]... clsArr) {
        int i6 = 0;
        for (Class<?>[] clsArr2 : clsArr) {
            i6 += clsArr2.length;
        }
        Class<?>[] clsArr3 = new Class[i6];
        int i7 = 0;
        for (Class<?>[] clsArr4 : clsArr) {
            System.arraycopy(clsArr4, 0, clsArr3, i7, clsArr4.length);
            i7 += clsArr4.length;
        }
        return clsArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(Paragraph paragraph) {
        if (paragraph.isOrDescendantOfType(DoNotCollectText.class)) {
            return;
        }
        if (!this.out.isEmpty()) {
            this.out.add("\n\n");
        }
        this.myVisitor.visitChildren(paragraph);
    }

    public void collect(Node node) {
        this.out = SequenceBuilder.emptyBuilder(node.getChars());
        this.myVisitor.visit(node);
    }

    public BasedSequence collectAndGetSequence(Node node) {
        collect(node);
        return this.out.toSequence();
    }

    public String collectAndGetText(Node node) {
        collect(node);
        return this.out.toString();
    }

    public String getText() {
        return this.out.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(SoftLineBreak softLineBreak) {
        this.out.add(softLineBreak.getChars());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(HardLineBreak hardLineBreak) {
        BasedSequence chars = hardLineBreak.getChars();
        this.out.add(chars.subSequence(chars.length() - 1, chars.length()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(HtmlEntity htmlEntity) {
        this.out.add(htmlEntity.getChars().unescape());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(Text text) {
        if (text.isOrDescendantOfType(DoNotCollectText.class)) {
            return;
        }
        this.out.add(text.getChars());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(TextBase textBase) {
        this.out.add(textBase.getChars());
    }
}
