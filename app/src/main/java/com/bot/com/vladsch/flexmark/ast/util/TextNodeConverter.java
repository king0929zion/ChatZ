package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class TextNodeConverter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ArrayList<Node> list = new ArrayList<>();
    private final BasedSequence nodeChars;
    private BasedSequence remainingChars;

    public TextNodeConverter(BasedSequence basedSequence) {
        this.nodeChars = basedSequence;
        this.remainingChars = basedSequence;
    }

    private void mergeList() {
        if (this.remainingChars.isEmpty()) {
            return;
        }
        this.list.add(new Text(this.remainingChars));
        this.remainingChars = BasedSequence.NULL;
    }

    public static void mergeTextNodes(Node node) {
        Node firstChild = node.getFirstChild();
        Node node2 = null;
        while (firstChild != null) {
            Node next = firstChild.getNext();
            if ((node2 instanceof Text) && (firstChild instanceof Text) && node2.getChars().isContinuedBy(firstChild.getChars())) {
                firstChild.setChars(node2.getChars().spliceAtEnd(firstChild.getChars()));
                node2.unlink();
            }
            node2 = firstChild;
            firstChild = next;
        }
    }

    public void addChildrenOf(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            appendChild(firstChild);
            firstChild = next;
        }
    }

    public void appendChild(Node node) {
        BasedSequence chars = node.getChars();
        node.unlink();
        if (node instanceof Text) {
            return;
        }
        if (this.remainingChars.getStartOffset() < chars.getStartOffset()) {
            this.list.add(new Text(this.remainingChars.subSequence(0, chars.getStartOffset() - this.remainingChars.getStartOffset())));
        }
        this.remainingChars = this.remainingChars.subSequence(chars.getEndOffset() - this.remainingChars.getStartOffset());
        this.list.add(node);
    }

    public void appendMergedTo(Node node) {
        mergeList();
        ArrayList<Node> arrayList = this.list;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Node node2 = arrayList.get(i6);
            i6++;
            node.appendChild(node2);
        }
        clear();
    }

    public void clear() {
        this.list.clear();
        this.remainingChars = BasedSequence.NULL;
    }

    public List<Node> getMergedList() {
        mergeList();
        return this.list;
    }

    public void insertMergedAfter(Node node) {
        mergeList();
        ArrayList<Node> arrayList = this.list;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Node node2 = arrayList.get(i6);
            i6++;
            Node node3 = node2;
            node.insertAfter(node3);
            node = node3;
        }
        clear();
    }

    public void insertMergedBefore(Node node) {
        mergeList();
        ArrayList<Node> arrayList = this.list;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Node node2 = arrayList.get(i6);
            i6++;
            node.insertBefore(node2);
        }
        clear();
    }
}
