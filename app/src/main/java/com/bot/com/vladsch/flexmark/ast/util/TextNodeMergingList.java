package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class TextNodeMergingList {
    private ArrayList<Node> list = new ArrayList<>();
    private boolean isMerged = true;

    private void mergeList() {
        if (this.isMerged) {
            return;
        }
        ArrayList<Node> arrayList = this.list;
        int size = arrayList.size();
        int i6 = 0;
        Node node = null;
        ArrayList<Node> arrayList2 = null;
        while (i6 < size) {
            Node node2 = arrayList.get(i6);
            i6++;
            Node node3 = node2;
            if (!(node3 instanceof Text)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                if (node != null) {
                    arrayList2.add(node);
                    node = null;
                }
                arrayList2.add(node3);
            } else if (!node3.getChars().isEmpty()) {
                if (node != null) {
                    if (node.getChars().isContinuedBy(node3.getChars())) {
                        node.setChars(node.getChars().spliceAtEnd(node3.getChars()));
                    } else {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        arrayList2.add(node);
                    }
                }
                node = node3;
            }
        }
        if (node != null) {
            if (arrayList2 == null) {
                this.list.clear();
                this.list.add(node);
            } else {
                arrayList2.add(node);
            }
        }
        if (arrayList2 != null) {
            this.list = arrayList2;
        }
    }

    public void add(Node node) {
        this.list.add(node);
        if (node instanceof Text) {
            this.isMerged = false;
        }
    }

    public void addChildrenOf(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            firstChild.unlink();
            add(firstChild);
            firstChild = next;
        }
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
    }

    public void clear() {
        this.list.clear();
        this.isMerged = true;
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

    public void add(BasedSequence basedSequence) {
        if (basedSequence.isEmpty()) {
            return;
        }
        add(new Text(basedSequence));
    }
}
