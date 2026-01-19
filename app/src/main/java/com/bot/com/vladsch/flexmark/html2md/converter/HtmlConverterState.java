package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.util.html.Attributes;
import com.vladsch.flexmark.util.html.MutableAttributes;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.nodes.Node;

/* loaded from: classes.dex */
public class HtmlConverterState {
    final List<Node> myElements;
    final Node myParent;
    int myIndex = 0;
    final MutableAttributes myAttributes = new MutableAttributes();
    private LinkedList<Runnable> myPrePopActions = null;

    public HtmlConverterState(Node node) {
        this.myParent = node;
        this.myElements = node.childNodes();
    }

    public void addPrePopAction(Runnable runnable) {
        if (this.myPrePopActions == null) {
            this.myPrePopActions = new LinkedList<>();
        }
        this.myPrePopActions.add(runnable);
    }

    public Attributes getAttributes() {
        return this.myAttributes;
    }

    public List<Node> getElements() {
        return this.myElements;
    }

    public int getIndex() {
        return this.myIndex;
    }

    public Node getParent() {
        return this.myParent;
    }

    public LinkedList<Runnable> getPrePopActions() {
        return this.myPrePopActions;
    }

    public void runPrePopActions() {
        LinkedList<Runnable> linkedList = this.myPrePopActions;
        if (linkedList == null) {
            return;
        }
        int size = linkedList.size();
        while (true) {
            int i6 = size - 1;
            if (size <= 0) {
                return;
            }
            this.myPrePopActions.get(i6).run();
            size = i6;
        }
    }

    public String toString() {
        return "State{myParent=" + this.myParent + ", myElements=" + this.myElements + ", myIndex=" + this.myIndex + ", myAttributes=" + this.myAttributes + "}";
    }
}
