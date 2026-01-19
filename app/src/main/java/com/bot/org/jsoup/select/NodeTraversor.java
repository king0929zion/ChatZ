package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;

/* loaded from: classes.dex */
public class NodeTraversor {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static NodeFilter.FilterResult filter(NodeFilter nodeFilter, Node node) {
        Node node2 = node;
        int i6 = 0;
        while (node2 != null) {
            NodeFilter.FilterResult head = nodeFilter.head(node2, i6);
            if (head == NodeFilter.FilterResult.STOP) {
                return head;
            }
            if (head == NodeFilter.FilterResult.CONTINUE && node2.childNodeSize() > 0) {
                node2 = node2.childNode(0);
                i6++;
            } else {
                while (node2.nextSibling() == null && i6 > 0) {
                    NodeFilter.FilterResult filterResult = NodeFilter.FilterResult.CONTINUE;
                    if ((head == filterResult || head == NodeFilter.FilterResult.SKIP_CHILDREN) && (head = nodeFilter.tail(node2, i6)) == NodeFilter.FilterResult.STOP) {
                        return head;
                    }
                    Node parentNode = node2.parentNode();
                    i6--;
                    if (head == NodeFilter.FilterResult.REMOVE) {
                        node2.remove();
                    }
                    head = filterResult;
                    node2 = parentNode;
                }
                if ((head == NodeFilter.FilterResult.CONTINUE || head == NodeFilter.FilterResult.SKIP_CHILDREN) && (head = nodeFilter.tail(node2, i6)) == NodeFilter.FilterResult.STOP) {
                    return head;
                }
                if (node2 == node) {
                    return head;
                }
                Node nextSibling = node2.nextSibling();
                if (head == NodeFilter.FilterResult.REMOVE) {
                    node2.remove();
                }
                node2 = nextSibling;
            }
        }
        return NodeFilter.FilterResult.CONTINUE;
    }

    public static void traverse(NodeVisitor nodeVisitor, Node node) {
        Validate.notNull(nodeVisitor);
        Validate.notNull(node);
        Node node2 = node;
        int i6 = 0;
        while (node2 != null) {
            Node parentNode = node2.parentNode();
            int childNodeSize = parentNode != null ? parentNode.childNodeSize() : 0;
            Node nextSibling = node2.nextSibling();
            nodeVisitor.mo11head(node2, i6);
            if (parentNode != null && !node2.hasParent()) {
                if (childNodeSize == parentNode.childNodeSize()) {
                    node2 = parentNode.childNode(node2.siblingIndex());
                } else if (nextSibling == null) {
                    i6--;
                    node2 = parentNode;
                } else {
                    node2 = nextSibling;
                }
            }
            if (node2.childNodeSize() > 0) {
                node2 = node2.childNode(0);
                i6++;
            } else {
                while (node2.nextSibling() == null && i6 > 0) {
                    nodeVisitor.tail(node2, i6);
                    node2 = node2.parentNode();
                    i6--;
                }
                nodeVisitor.tail(node2, i6);
                if (node2 == node) {
                    return;
                } else {
                    node2 = node2.nextSibling();
                }
            }
        }
    }

    public static void traverse(NodeVisitor nodeVisitor, Elements elements) {
        Validate.notNull(nodeVisitor);
        Validate.notNull(elements);
        int size = elements.size();
        int i6 = 0;
        while (i6 < size) {
            Element element = elements.get(i6);
            i6++;
            traverse(nodeVisitor, element);
        }
    }

    public static void filter(NodeFilter nodeFilter, Elements elements) {
        Validate.notNull(nodeFilter);
        Validate.notNull(elements);
        int size = elements.size();
        int i6 = 0;
        while (i6 < size) {
            Element element = elements.get(i6);
            i6++;
            if (filter(nodeFilter, element) == NodeFilter.FilterResult.STOP) {
                return;
            }
        }
    }
}
