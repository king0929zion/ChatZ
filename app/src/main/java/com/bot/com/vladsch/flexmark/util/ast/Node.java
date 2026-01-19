package com.vladsch.flexmark.util.ast;

import B3.e;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterable;
import com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterator;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Range;
import com.vladsch.flexmark.util.sequence.SegmentedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.SequenceBuilder;
import com.vladsch.flexmark.util.visitor.AstNode;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class Node {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String SPLICE = " … ";
    private BasedSequence chars;
    Node firstChild;
    private Node lastChild;
    Node next;
    private Node parent;
    private Node prev;
    public static final BasedSequence[] EMPTY_SEGMENTS = BasedSequence.EMPTY_ARRAY;
    public static final AstNode<Node> AST_ADAPTER = new AstNode<Node>() { // from class: com.vladsch.flexmark.util.ast.Node.1
        @Override // com.vladsch.flexmark.util.visitor.AstNode
        public Node getFirstChild(Node node) {
            return node.firstChild;
        }

        @Override // com.vladsch.flexmark.util.visitor.AstNode
        public Node getNext(Node node) {
            return node.next;
        }
    };

    public Node() {
        this.parent = null;
        this.firstChild = null;
        this.lastChild = null;
        this.prev = null;
        this.next = null;
        this.chars = BasedSequence.NULL;
    }

    public static void astChars(StringBuilder sb, CharSequence charSequence, String str) {
        if (charSequence.length() > 0) {
            if (charSequence.length() <= 10) {
                sb.append(SequenceUtils.SPC);
                sb.append(str);
                sb.append(" \"");
                sb.append(charSequence);
                sb.append("\"");
                return;
            }
            sb.append(SequenceUtils.SPC);
            sb.append(str);
            sb.append(" \"");
            sb.append(charSequence.subSequence(0, 5));
            sb.append(SPLICE);
            sb.append(charSequence.subSequence(charSequence.length() - 5, charSequence.length()));
            sb.append("\"");
        }
    }

    public static void delimitedSegmentSpan(StringBuilder sb, BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, String str) {
        StringBuilder sb2;
        String str2;
        segmentSpanChars(sb, basedSequence.getStartOffset(), basedSequence.getEndOffset(), e.n(str, "Open"), basedSequence.toString());
        if (basedSequence2.length() <= 10) {
            segmentSpanChars(sb, basedSequence2.getStartOffset(), basedSequence2.getEndOffset(), str, basedSequence2.toVisibleWhitespaceString());
            sb2 = sb;
            str2 = str;
        } else {
            sb2 = sb;
            str2 = str;
            segmentSpanChars(sb2, basedSequence2.getStartOffset(), basedSequence2.getEndOffset(), str2, basedSequence2.subSequence(0, 5).toVisibleWhitespaceString(), SPLICE, basedSequence2.endSequence(basedSequence2.length() - 5).toVisibleWhitespaceString());
        }
        segmentSpanChars(sb2, basedSequence3.getStartOffset(), basedSequence3.getEndOffset(), e.n(str2, "Close"), basedSequence3.toString());
    }

    public static void delimitedSegmentSpanChars(StringBuilder sb, BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, String str) {
        if (basedSequence.isNotNull()) {
            segmentSpanChars(sb, basedSequence.getStartOffset(), basedSequence.getEndOffset(), e.n(str, "Open"), basedSequence.toString());
        }
        if (basedSequence2.isNotNull()) {
            segmentSpanChars(sb, basedSequence2.getStartOffset(), basedSequence2.getEndOffset(), str, basedSequence2.toVisibleWhitespaceString());
        }
        if (basedSequence3.isNotNull()) {
            segmentSpanChars(sb, basedSequence3.getStartOffset(), basedSequence3.getEndOffset(), e.n(str, "Close"), basedSequence3.toString());
        }
    }

    public static BasedSequence getLeadSegment(BasedSequence[] basedSequenceArr) {
        for (BasedSequence basedSequence : basedSequenceArr) {
            if (basedSequence != BasedSequence.NULL) {
                return basedSequence;
            }
        }
        return BasedSequence.NULL;
    }

    public static int getNodeOfTypeIndex(Node node, Class<?>... clsArr) {
        int i6 = 0;
        for (Class<?> cls : clsArr) {
            if (cls.isInstance(node)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static BasedSequence getTrailSegment(BasedSequence[] basedSequenceArr) {
        int length = basedSequenceArr.length;
        while (true) {
            int i6 = length - 1;
            if (length <= 0) {
                return BasedSequence.NULL;
            }
            BasedSequence basedSequence = basedSequenceArr[i6];
            if (basedSequence != BasedSequence.NULL) {
                return basedSequence;
            }
            length = i6;
        }
    }

    public static void segmentSpan(StringBuilder sb, int i6, int i7, String str) {
        if (str != null && !str.trim().isEmpty()) {
            sb.append(SequenceUtils.SPACE);
            sb.append(str);
            sb.append(":");
        }
        sb.append("[");
        sb.append(i6);
        sb.append(", ");
        sb.append(i7);
        sb.append("]");
    }

    public static void segmentSpanChars(StringBuilder sb, int i6, int i7, String str, String str2) {
        segmentSpanChars(sb, i6, i7, str, str2, FlexmarkHtmlConverter.DEFAULT_NODE, FlexmarkHtmlConverter.DEFAULT_NODE);
    }

    public static void segmentSpanCharsToVisible(StringBuilder sb, BasedSequence basedSequence, String str) {
        if (basedSequence.isNotNull()) {
            if (basedSequence.length() <= 10) {
                segmentSpanChars(sb, basedSequence.getStartOffset(), basedSequence.getEndOffset(), str, basedSequence.toVisibleWhitespaceString());
            } else {
                segmentSpanChars(sb, basedSequence.getStartOffset(), basedSequence.getEndOffset(), str, basedSequence.subSequence(0, 5).toVisibleWhitespaceString(), SPLICE, basedSequence.endSequence(basedSequence.length() - 5).toVisibleWhitespaceString());
            }
        }
    }

    public static BasedSequence spanningChars(BasedSequence... basedSequenceArr) {
        int i6 = TableCell.NOT_TRACKED;
        int i7 = -1;
        BasedSequence basedSequence = null;
        BasedSequence basedSequence2 = null;
        for (BasedSequence basedSequence3 : basedSequenceArr) {
            if (basedSequence3 != BasedSequence.NULL) {
                if (i6 > basedSequence3.getStartOffset()) {
                    i6 = basedSequence3.getStartOffset();
                    basedSequence = basedSequence3;
                }
                if (i7 <= basedSequence3.getEndOffset()) {
                    i7 = basedSequence3.getEndOffset();
                    basedSequence2 = basedSequence3;
                }
            }
        }
        return (basedSequence == null || basedSequence2 == null) ? BasedSequence.NULL : basedSequence.baseSubSequence(basedSequence.getStartOffset(), basedSequence2.getEndOffset());
    }

    public static String toSegmentSpan(BasedSequence basedSequence, String str) {
        StringBuilder sb = new StringBuilder();
        segmentSpan(sb, basedSequence, str);
        return sb.toString();
    }

    public void appendChain(Node node) {
        while (node != null) {
            Node node2 = node.next;
            appendChild(node);
            node = node2;
        }
    }

    public void appendChild(Node node) {
        node.unlink();
        node.setParent(this);
        Node node2 = this.lastChild;
        if (node2 == null) {
            this.firstChild = node;
            this.lastChild = node;
        } else {
            node2.next = node;
            node.prev = node2;
            this.lastChild = node;
        }
    }

    public void astExtraChars(StringBuilder sb) {
        if (getChars().length() > 0) {
            if (getChars().length() <= 10) {
                segmentSpanChars(sb, getChars(), "chars");
            } else {
                segmentSpanChars(sb, getChars().getStartOffset(), getChars().getEndOffset(), "chars", getChars().subSequence(0, 5).toVisibleWhitespaceString(), SPLICE, getChars().subSequence(getChars().length() - 5).toVisibleWhitespaceString());
            }
        }
    }

    public void astString(StringBuilder sb, boolean z5) {
        sb.append(getNodeName());
        sb.append("[");
        sb.append(getStartOffset());
        sb.append(", ");
        sb.append(getEndOffset());
        sb.append("]");
        if (z5) {
            getAstExtra(sb);
        }
    }

    public BasedSequence baseSubSequence(int i6, int i7) {
        return this.chars.baseSubSequence(i6, i7);
    }

    public int countAncestorsOfType(Class<?>... clsArr) {
        int i6 = 0;
        for (Node parent = getParent(); parent != null; parent = parent.getParent()) {
            int length = clsArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (clsArr[i7].isInstance(parent)) {
                    i6++;
                    break;
                }
                i7++;
            }
        }
        return i6;
    }

    public int countDirectAncestorsOfType(Class<?> cls, Class<?>... clsArr) {
        boolean z5;
        int i6 = 0;
        for (Node parent = getParent(); parent != null; parent = parent.getParent()) {
            int length = clsArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    z5 = false;
                    break;
                }
                z5 = true;
                if (clsArr[i7].isInstance(parent)) {
                    i6++;
                    break;
                }
                if (cls != null && cls.isInstance(parent)) {
                    break;
                }
                i7++;
            }
            if (!z5) {
                return i6;
            }
        }
        return i6;
    }

    public int endOfLine(int i6) {
        return this.chars.baseEndOfLine(i6);
    }

    public void extractChainTo(Node node) {
        Node node2 = this;
        while (true) {
            Node next = node2.getNext();
            node.appendChild(node2);
            if (!getClass().isInstance(next)) {
                return;
            } else {
                node2 = next;
            }
        }
    }

    public void extractToFirstInChain(Node node) {
        getFirstInChain().extractChainTo(node);
    }

    public Node getAncestorOfType(Class<?>... clsArr) {
        for (Node parent = getParent(); parent != null; parent = parent.getParent()) {
            for (Class<?> cls : clsArr) {
                if (cls.isInstance(parent)) {
                    return parent;
                }
            }
        }
        return null;
    }

    public void getAstExtra(StringBuilder sb) {
    }

    public BasedSequence getBaseSequence() {
        return this.chars.getBaseSequence();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vladsch.flexmark.util.ast.Node getBlankLineSibling() {
        /*
            r6 = this;
            com.vladsch.flexmark.util.ast.Node r0 = r6.parent
            r1 = r6
            r2 = r1
        L4:
            com.vladsch.flexmark.util.ast.Node r3 = r0.parent
            if (r3 == 0) goto L24
            java.lang.Class<com.vladsch.flexmark.util.ast.BlankLine> r4 = com.vladsch.flexmark.util.ast.BlankLine.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}
            com.vladsch.flexmark.util.ast.Node r3 = r3.getLastChildAnyNot(r4)
            if (r0 != r3) goto L24
            boolean r2 = r0 instanceof com.vladsch.flexmark.util.ast.BlankLineContainer
            if (r2 == 0) goto L1a
            r2 = r0
            goto L1b
        L1a:
            r2 = r1
        L1b:
            com.vladsch.flexmark.util.ast.Node r0 = r0.parent
            if (r0 != 0) goto L20
            return r1
        L20:
            r5 = r2
            r2 = r1
            r1 = r5
            goto L4
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.ast.Node.getBlankLineSibling():com.vladsch.flexmark.util.ast.Node");
    }

    public BasedSequence getChars() {
        return this.chars;
    }

    public BasedSequence getCharsFromSegments() {
        BasedSequence[] segmentsForChars = getSegmentsForChars();
        return segmentsForChars.length == 0 ? BasedSequence.NULL : SegmentedSequence.create(segmentsForChars[0], Arrays.asList(segmentsForChars));
    }

    public BasedSequence getChildChars() {
        Node node = this.firstChild;
        return (node == null || this.lastChild == null) ? BasedSequence.NULL : node.baseSubSequence(node.getStartOffset(), this.lastChild.getEndOffset());
    }

    public ReversiblePeekingIterator<Node> getChildIterator() {
        return this.firstChild == null ? NodeIterator.EMPTY : new NodeIterator(this.firstChild, this.lastChild, false);
    }

    public Node getChildOfType(Class<?>... clsArr) {
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            for (Class<?> cls : clsArr) {
                if (cls.isInstance(firstChild)) {
                    return firstChild;
                }
            }
        }
        return null;
    }

    public ReversiblePeekingIterable<Node> getChildren() {
        return this.firstChild == null ? NodeIterable.EMPTY : new NodeIterable(this.firstChild, this.lastChild, false);
    }

    public ReversiblePeekingIterable<Node> getDescendants() {
        return this.firstChild == null ? NodeIterable.EMPTY : new DescendantNodeIterable(getChildren());
    }

    public Document getDocument() {
        Node node = this;
        while (node != null && !(node instanceof Document)) {
            node = node.getParent();
        }
        return (Document) node;
    }

    public BasedSequence getEmptyPrefix() {
        return this.chars.getEmptyPrefix();
    }

    public BasedSequence getEmptySuffix() {
        return this.chars.getEmptySuffix();
    }

    public int getEndLineNumber() {
        int endOffset = this.chars.getEndOffset();
        Document document = getDocument();
        if (endOffset > 0) {
            endOffset--;
        }
        return document.getLineNumber(endOffset);
    }

    public int getEndOfLine() {
        return this.chars.baseEndOfLine();
    }

    public int getEndOffset() {
        return this.chars.getEndOffset();
    }

    public BasedSequence getExactChildChars() {
        if (this.firstChild == null || this.lastChild == null) {
            return BasedSequence.NULL;
        }
        SequenceBuilder emptyBuilder = SequenceBuilder.emptyBuilder(getChars());
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            firstChild.getChars().addSegments(emptyBuilder.getSegmentBuilder());
        }
        return emptyBuilder.toSequence();
    }

    public Node getFirstChild() {
        return this.firstChild;
    }

    public Node getFirstChildAny(Class<?>... clsArr) {
        Node node = this.firstChild;
        if (clsArr.length > 0) {
            while (node != null && getNodeOfTypeIndex(node, clsArr) == -1) {
                node = node.next;
            }
        }
        return node;
    }

    public Node getFirstChildAnyNot(Class<?>... clsArr) {
        Node node = this.firstChild;
        if (clsArr.length > 0) {
            while (node != null && getNodeOfTypeIndex(node, clsArr) != -1) {
                node = node.next;
            }
        }
        return node;
    }

    public Node getFirstInChain() {
        Node node = this;
        while (getClass().isInstance(node.getPrevious())) {
            node = node.getPrevious();
        }
        return node;
    }

    public Node getGrandParent() {
        Node node = this.parent;
        if (node == null) {
            return null;
        }
        return node.getParent();
    }

    public Node getLastBlankLineChild() {
        return null;
    }

    public Node getLastChild() {
        return this.lastChild;
    }

    public Node getLastChildAny(Class<?>... clsArr) {
        Node node = this.lastChild;
        if (clsArr.length > 0) {
            while (node != null && getNodeOfTypeIndex(node, clsArr) == -1) {
                node = node.prev;
            }
        }
        return node;
    }

    public Node getLastChildAnyNot(Class<?>... clsArr) {
        Node node = this.lastChild;
        if (clsArr.length > 0) {
            while (node != null && getNodeOfTypeIndex(node, clsArr) != -1) {
                node = node.prev;
            }
        }
        return node;
    }

    public Node getLastInChain() {
        Node node = this;
        while (getClass().isInstance(node.getNext())) {
            node = node.getNext();
        }
        return node;
    }

    public Pair<Integer, Integer> getLineColumnAtEnd() {
        return this.chars.baseLineColumnAtEnd();
    }

    public int getLineNumber() {
        return getStartLineNumber();
    }

    public Node getNext() {
        return this.next;
    }

    public Node getNextAny(Class<?>... clsArr) {
        Node node = this.next;
        if (clsArr.length > 0) {
            while (node != null && getNodeOfTypeIndex(node, clsArr) == -1) {
                node = node.next;
            }
        }
        return node;
    }

    public Node getNextAnyNot(Class<?>... clsArr) {
        Node node = this.next;
        if (clsArr.length > 0) {
            while (node != null && getNodeOfTypeIndex(node, clsArr) != -1) {
                node = node.next;
            }
        }
        return node;
    }

    public String getNodeName() {
        return getClass().getName().substring(getClass().getPackage().getName().length() + 1);
    }

    public Node getOldestAncestorOfTypeAfter(Class<?> cls, Class<?> cls2) {
        Node node = null;
        for (Node parent = getParent(); parent != null; parent = parent.getParent()) {
            if (!cls.isInstance(parent)) {
                if (cls2.isInstance(parent)) {
                    break;
                }
            } else {
                node = parent;
            }
        }
        return node;
    }

    public Node getParent() {
        return this.parent;
    }

    public Node getPrevious() {
        return this.prev;
    }

    public Node getPreviousAny(Class<?>... clsArr) {
        Node node = this.prev;
        if (clsArr.length > 0) {
            while (node != null && getNodeOfTypeIndex(node, clsArr) == -1) {
                node = node.prev;
            }
        }
        return node;
    }

    public Node getPreviousAnyNot(Class<?>... clsArr) {
        Node node = this.prev;
        if (clsArr.length > 0) {
            while (node != null && getNodeOfTypeIndex(node, clsArr) != -1) {
                node = node.prev;
            }
        }
        return node;
    }

    public ReversiblePeekingIterator<Node> getReversedChildIterator() {
        return this.firstChild == null ? NodeIterator.EMPTY : new NodeIterator(this.firstChild, this.lastChild, true);
    }

    public ReversiblePeekingIterable<Node> getReversedChildren() {
        return this.firstChild == null ? NodeIterable.EMPTY : new NodeIterable(this.firstChild, this.lastChild, true);
    }

    public ReversiblePeekingIterable<Node> getReversedDescendants() {
        return this.firstChild == null ? NodeIterable.EMPTY : new DescendantNodeIterable(getReversedChildren());
    }

    public abstract BasedSequence[] getSegments();

    public BasedSequence[] getSegmentsForChars() {
        return getSegments();
    }

    public Range getSourceRange() {
        return this.chars.getSourceRange();
    }

    public int getStartLineNumber() {
        return getDocument().getLineNumber(this.chars.getStartOffset());
    }

    public int getStartOfLine() {
        return this.chars.baseStartOfLine();
    }

    public int getStartOffset() {
        return this.chars.getStartOffset();
    }

    public int getTextLength() {
        return this.chars.length();
    }

    public boolean hasChildren() {
        return this.firstChild != null;
    }

    public boolean hasOrMoreChildren(int i6) {
        if (this.firstChild != null) {
            ReversiblePeekingIterator<Node> it = getChildren().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                it.next();
                i7++;
                if (i7 >= i6) {
                    return true;
                }
            }
        }
        return false;
    }

    public void insertAfter(Node node) {
        node.unlink();
        Node node2 = this.next;
        node.next = node2;
        if (node2 != null) {
            node2.prev = node;
        }
        node.prev = this;
        this.next = node;
        Node node3 = this.parent;
        node.parent = node3;
        if (node.next == null) {
            node3.lastChild = node;
        }
    }

    public void insertBefore(Node node) {
        node.unlink();
        Node node2 = this.prev;
        node.prev = node2;
        if (node2 != null) {
            node2.next = node;
        }
        node.next = this;
        this.prev = node;
        Node node3 = this.parent;
        node.parent = node3;
        if (node.prev == null) {
            node3.firstChild = node;
        }
    }

    public void insertChainAfter(Node node) {
        Node node2 = this;
        while (node != null) {
            Node node3 = node.next;
            node2.insertAfter(node);
            node2 = node;
            node = node3;
        }
    }

    public void insertChainBefore(Node node) {
        while (node != null) {
            Node node2 = node.next;
            insertBefore(node);
            node = node2;
        }
    }

    public boolean isOrDescendantOfType(Class<?>... clsArr) {
        for (Node node = this; node != null; node = node.getParent()) {
            if (node.getNodeOfTypeIndex(clsArr) != -1) {
                return true;
            }
        }
        return false;
    }

    public Pair<Integer, Integer> lineColumnAtIndex(int i6) {
        return this.chars.baseLineColumnAtIndex(i6);
    }

    public Pair<Integer, Integer> lineColumnAtStart() {
        return this.chars.baseLineColumnAtStart();
    }

    public void moveTrailingBlankLines() {
        Node lastChild = getLastChild();
        if (lastChild instanceof BlankLine) {
            Node blankLineSibling = getBlankLineSibling();
            blankLineSibling.insertChainAfter(lastChild.getFirstInChain());
            Node node = this;
            do {
                node.setCharsFromContentOnly();
                node = node.parent;
                if (node == null) {
                    return;
                }
            } while (node != blankLineSibling.getParent());
        }
    }

    public void prependChild(Node node) {
        node.unlink();
        node.setParent(this);
        Node node2 = this.firstChild;
        if (node2 == null) {
            this.firstChild = node;
            this.lastChild = node;
        } else {
            node2.prev = node;
            node.next = node2;
            this.firstChild = node;
        }
    }

    public void removeChildren() {
        Node node = this.firstChild;
        while (node != null) {
            Node next = node.getNext();
            node.unlink();
            node = next;
        }
    }

    public void setChars(BasedSequence basedSequence) {
        this.chars = basedSequence;
    }

    public void setCharsFromContent() {
        BasedSequence spanningChars;
        Node node;
        Node node2;
        BasedSequence[] segments = getSegments();
        if (segments.length > 0) {
            BasedSequence leadSegment = getLeadSegment(segments);
            BasedSequence trailSegment = getTrailSegment(segments);
            Node node3 = this.firstChild;
            spanningChars = (node3 == null || (node2 = this.lastChild) == null) ? spanningChars(leadSegment, trailSegment) : spanningChars(leadSegment, trailSegment, node3.chars, node2.chars);
        } else {
            Node node4 = this.firstChild;
            spanningChars = (node4 == null || (node = this.lastChild) == null) ? null : spanningChars(node4.chars, node.chars);
        }
        if (spanningChars != null) {
            if (this.chars.isNull()) {
                setChars(spanningChars);
            } else {
                setChars(this.chars.baseSubSequence(Utils.min(this.chars.getStartOffset(), spanningChars.getStartOffset()), Utils.max(this.chars.getEndOffset(), spanningChars.getEndOffset())));
            }
        }
    }

    public void setCharsFromContentOnly() {
        this.chars = BasedSequence.NULL;
        setCharsFromContent();
    }

    public void setCharsFromSegments() {
        setChars(getCharsFromSegments());
    }

    public void setParent(Node node) {
        this.parent = node;
    }

    public int startOfLine(int i6) {
        return this.chars.baseStartOfLine(i6);
    }

    public void takeChildren(Node node) {
        Node node2 = node.firstChild;
        if (node2 != null) {
            Node node3 = node.lastChild;
            if (node3 == node2) {
                appendChild(node2);
                return;
            }
            node.firstChild = null;
            node.lastChild = null;
            node2.parent = this;
            node3.parent = this;
            Node node4 = this.lastChild;
            if (node4 != null) {
                node4.next = node2;
                node2.prev = node4;
            } else {
                this.firstChild = node2;
            }
            this.lastChild = node3;
        }
    }

    public String toAstString(boolean z5) {
        StringBuilder sb = new StringBuilder();
        astString(sb, z5);
        return sb.toString();
    }

    public String toString() {
        return getClass().getName().substring(getClass().getPackage().getName().length() + 1) + "{" + toStringAttributes() + "}";
    }

    public String toStringAttributes() {
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public void unlink() {
        Node node = this.prev;
        if (node != null) {
            node.next = this.next;
        } else {
            Node node2 = this.parent;
            if (node2 != null) {
                node2.firstChild = this.next;
            }
        }
        Node node3 = this.next;
        if (node3 != null) {
            node3.prev = node;
        } else {
            Node node4 = this.parent;
            if (node4 != null) {
                node4.lastChild = node;
            }
        }
        this.parent = null;
        this.next = null;
        this.prev = null;
    }

    public static void segmentSpanChars(StringBuilder sb, int i6, int i7, String str, String str2, String str3, String str4) {
        if (str != null && !str.trim().isEmpty()) {
            sb.append(SequenceUtils.SPACE);
            sb.append(str);
            sb.append(":");
        }
        sb.append("[");
        sb.append(i6);
        sb.append(", ");
        sb.append(i7);
        if (!str2.isEmpty() || !str4.isEmpty()) {
            sb.append(", \"");
            Utils.escapeJavaString(sb, str2);
            sb.append(str3);
            Utils.escapeJavaString(sb, str4);
            sb.append("\"");
        }
        sb.append("]");
    }

    public BasedSequence baseSubSequence(int i6) {
        return this.chars.baseSubSequence(i6);
    }

    public static void segmentSpan(StringBuilder sb, BasedSequence basedSequence, String str) {
        if (basedSequence.isNotNull()) {
            segmentSpan(sb, basedSequence.getStartOffset(), basedSequence.getEndOffset(), str);
        }
    }

    public int getNodeOfTypeIndex(Class<?>... clsArr) {
        return getNodeOfTypeIndex(this, clsArr);
    }

    public Node(BasedSequence basedSequence) {
        this.parent = null;
        this.firstChild = null;
        this.lastChild = null;
        this.prev = null;
        this.next = null;
        BasedSequence basedSequence2 = BasedSequence.NULL;
        this.chars = basedSequence;
    }

    public static void segmentSpanChars(StringBuilder sb, BasedSequence basedSequence, String str) {
        if (basedSequence.isNotNull()) {
            segmentSpanChars(sb, basedSequence.getStartOffset(), basedSequence.getEndOffset(), str, basedSequence.toString());
        }
    }
}
