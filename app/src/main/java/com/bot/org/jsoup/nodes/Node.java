package org.jsoup.nodes;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/* loaded from: classes.dex */
public abstract class Node implements Cloneable {
    static final List<Node> EmptyNodes = Collections.EMPTY_LIST;
    static final String EmptyString = "";
    Node parentNode;
    int siblingIndex;

    /* loaded from: classes.dex */
    public static class OuterHtmlVisitor implements NodeVisitor {
        private final Appendable accum;
        private final Document.OutputSettings out;

        public OuterHtmlVisitor(Appendable appendable, Document.OutputSettings outputSettings) {
            this.accum = appendable;
            this.out = outputSettings;
            outputSettings.prepareEncoder();
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: head */
        public void mo11head(Node node, int i6) {
            try {
                node.outerHtmlHead(this.accum, i6, this.out);
            } catch (IOException e6) {
                throw new SerializationException(e6);
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i6) {
            if (node.nodeName().equals(FlexmarkHtmlConverter.TEXT_NODE)) {
                return;
            }
            try {
                node.outerHtmlTail(this.accum, i6, this.out);
            } catch (IOException e6) {
                throw new SerializationException(e6);
            }
        }
    }

    private void addSiblingHtml(int i6, String str) {
        Validate.notNull(str);
        Validate.notNull(this.parentNode);
        this.parentNode.addChildren(i6, (Node[]) NodeUtils.parser(this).parseFragmentInput(str, parent() instanceof Element ? (Element) parent() : null, baseUri()).toArray(new Node[0]));
    }

    private Element getDeepChild(Element element) {
        Element firstElementChild = element.firstElementChild();
        while (true) {
            Element element2 = firstElementChild;
            Element element3 = element;
            element = element2;
            if (element == null) {
                return element3;
            }
            firstElementChild = element.firstElementChild();
        }
    }

    private void reindexChildren(int i6) {
        int childNodeSize = childNodeSize();
        if (childNodeSize == 0) {
            return;
        }
        List<Node> ensureChildNodes = ensureChildNodes();
        while (i6 < childNodeSize) {
            ensureChildNodes.get(i6).setSiblingIndex(i6);
            i6++;
        }
    }

    public String absUrl(String str) {
        Validate.notEmpty(str);
        return (hasAttributes() && attributes().hasKeyIgnoreCase(str)) ? StringUtil.resolve(baseUri(), attributes().getIgnoreCase(str)) : "";
    }

    public void addChildren(Node... nodeArr) {
        List<Node> ensureChildNodes = ensureChildNodes();
        for (Node node : nodeArr) {
            reparentChild(node);
            ensureChildNodes.add(node);
            node.setSiblingIndex(ensureChildNodes.size() - 1);
        }
    }

    public Node after(String str) {
        addSiblingHtml(this.siblingIndex + 1, str);
        return this;
    }

    public String attr(String str) {
        Validate.notNull(str);
        if (!hasAttributes()) {
            return "";
        }
        String ignoreCase = attributes().getIgnoreCase(str);
        return ignoreCase.length() > 0 ? ignoreCase : str.startsWith("abs:") ? absUrl(str.substring(4)) : "";
    }

    public abstract Attributes attributes();

    public int attributesSize() {
        if (hasAttributes()) {
            return attributes().size();
        }
        return 0;
    }

    public abstract String baseUri();

    public Node before(String str) {
        addSiblingHtml(this.siblingIndex, str);
        return this;
    }

    public Node childNode(int i6) {
        return ensureChildNodes().get(i6);
    }

    public abstract int childNodeSize();

    public List<Node> childNodes() {
        if (childNodeSize() == 0) {
            return EmptyNodes;
        }
        List<Node> ensureChildNodes = ensureChildNodes();
        ArrayList arrayList = new ArrayList(ensureChildNodes.size());
        arrayList.addAll(ensureChildNodes);
        return Collections.unmodifiableList(arrayList);
    }

    public Node[] childNodesAsArray() {
        return (Node[]) ensureChildNodes().toArray(new Node[0]);
    }

    public List<Node> childNodesCopy() {
        List<Node> ensureChildNodes = ensureChildNodes();
        ArrayList arrayList = new ArrayList(ensureChildNodes.size());
        Iterator<Node> it = ensureChildNodes.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().clone());
        }
        return arrayList;
    }

    public Node clearAttributes() {
        if (hasAttributes()) {
            Iterator<Attribute> it = attributes().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        return this;
    }

    public Node doClone(Node node) {
        Document ownerDocument;
        try {
            Node node2 = (Node) super.clone();
            node2.parentNode = node;
            node2.siblingIndex = node == null ? 0 : this.siblingIndex;
            if (node == null && !(this instanceof Document) && (ownerDocument = ownerDocument()) != null) {
                Document shallowClone = ownerDocument.shallowClone();
                node2.parentNode = shallowClone;
                shallowClone.ensureChildNodes().add(node2);
            }
            return node2;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public abstract void doSetBaseUri(String str);

    public abstract Node empty();

    public abstract List<Node> ensureChildNodes();

    public boolean equals(Object obj) {
        return this == obj;
    }

    public Node filter(NodeFilter nodeFilter) {
        Validate.notNull(nodeFilter);
        NodeTraversor.filter(nodeFilter, this);
        return this;
    }

    public Node firstChild() {
        if (childNodeSize() == 0) {
            return null;
        }
        return ensureChildNodes().get(0);
    }

    public Node forEachNode(Consumer<? super Node> consumer) {
        Validate.notNull(consumer);
        nodeStream().forEach(consumer);
        return this;
    }

    public boolean hasAttr(String str) {
        Validate.notNull(str);
        if (!hasAttributes()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (attributes().hasKeyIgnoreCase(substring) && !absUrl(substring).isEmpty()) {
                return true;
            }
        }
        return attributes().hasKeyIgnoreCase(str);
    }

    public abstract boolean hasAttributes();

    public boolean hasParent() {
        return this.parentNode != null;
    }

    public boolean hasSameValue(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return outerHtml().equals(((Node) obj).outerHtml());
    }

    public int hashCode() {
        return super.hashCode();
    }

    public <T extends Appendable> T html(T t5) {
        outerHtml(t5);
        return t5;
    }

    public void indent(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
        appendable.append('\n').append(StringUtil.padding(outputSettings.indentAmount() * i6, outputSettings.maxPaddingWidth()));
    }

    public final boolean isEffectivelyFirst() {
        int i6 = this.siblingIndex;
        if (i6 == 0) {
            return true;
        }
        if (i6 == 1) {
            Node previousSibling = previousSibling();
            if ((previousSibling instanceof TextNode) && ((TextNode) previousSibling).isBlank()) {
                return true;
            }
        }
        return false;
    }

    public Node lastChild() {
        int childNodeSize = childNodeSize();
        if (childNodeSize == 0) {
            return null;
        }
        return ensureChildNodes().get(childNodeSize - 1);
    }

    public boolean nameIs(String str) {
        return normalName().equals(str);
    }

    public Node nextSibling() {
        Node node = this.parentNode;
        if (node == null) {
            return null;
        }
        List<Node> ensureChildNodes = node.ensureChildNodes();
        int i6 = this.siblingIndex + 1;
        if (ensureChildNodes.size() > i6) {
            return ensureChildNodes.get(i6);
        }
        return null;
    }

    public abstract String nodeName();

    public Stream<Node> nodeStream() {
        return NodeUtils.stream(this, Node.class);
    }

    public void nodelistChanged() {
    }

    public String normalName() {
        return nodeName();
    }

    public String outerHtml() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        outerHtml(borrowBuilder);
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public abstract void outerHtmlHead(Appendable appendable, int i6, Document.OutputSettings outputSettings);

    public abstract void outerHtmlTail(Appendable appendable, int i6, Document.OutputSettings outputSettings);

    public Document ownerDocument() {
        Node root = root();
        if (root instanceof Document) {
            return (Document) root;
        }
        return null;
    }

    public Node parent() {
        return this.parentNode;
    }

    public boolean parentElementIs(String str, String str2) {
        Node node = this.parentNode;
        return node != null && (node instanceof Element) && ((Element) node).elementIs(str, str2);
    }

    public boolean parentNameIs(String str) {
        Node node = this.parentNode;
        return node != null && node.normalName().equals(str);
    }

    public final Node parentNode() {
        return this.parentNode;
    }

    public Node previousSibling() {
        Node node = this.parentNode;
        if (node != null && this.siblingIndex > 0) {
            return node.ensureChildNodes().get(this.siblingIndex - 1);
        }
        return null;
    }

    public void remove() {
        Node node = this.parentNode;
        if (node != null) {
            node.removeChild(this);
        }
    }

    public Node removeAttr(String str) {
        Validate.notNull(str);
        if (hasAttributes()) {
            attributes().removeIgnoreCase(str);
        }
        return this;
    }

    public void removeChild(Node node) {
        Validate.isTrue(node.parentNode == this);
        int i6 = node.siblingIndex;
        ensureChildNodes().remove(i6);
        reindexChildren(i6);
        node.parentNode = null;
    }

    public void reparentChild(Node node) {
        node.setParentNode(this);
    }

    public void replaceChild(Node node, Node node2) {
        Validate.isTrue(node.parentNode == this);
        Validate.notNull(node2);
        if (node == node2) {
            return;
        }
        Node node3 = node2.parentNode;
        if (node3 != null) {
            node3.removeChild(node2);
        }
        int i6 = node.siblingIndex;
        ensureChildNodes().set(i6, node2);
        node2.parentNode = this;
        node2.setSiblingIndex(i6);
        node.parentNode = null;
    }

    public void replaceWith(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        this.parentNode.replaceChild(this, node);
    }

    public Node root() {
        Node node = this;
        while (true) {
            Node node2 = node.parentNode;
            if (node2 == null) {
                return node;
            }
            node = node2;
        }
    }

    public void setBaseUri(String str) {
        Validate.notNull(str);
        doSetBaseUri(str);
    }

    public void setParentNode(Node node) {
        Validate.notNull(node);
        Node node2 = this.parentNode;
        if (node2 != null) {
            node2.removeChild(this);
        }
        this.parentNode = node;
    }

    public void setSiblingIndex(int i6) {
        this.siblingIndex = i6;
    }

    public Node shallowClone() {
        return doClone(null);
    }

    public int siblingIndex() {
        return this.siblingIndex;
    }

    public List<Node> siblingNodes() {
        Node node = this.parentNode;
        if (node == null) {
            return Collections.EMPTY_LIST;
        }
        List<Node> ensureChildNodes = node.ensureChildNodes();
        ArrayList arrayList = new ArrayList(ensureChildNodes.size() - 1);
        for (Node node2 : ensureChildNodes) {
            if (node2 != this) {
                arrayList.add(node2);
            }
        }
        return arrayList;
    }

    public Range sourceRange() {
        return Range.of(this, true);
    }

    public String toString() {
        return outerHtml();
    }

    public Node traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        NodeTraversor.traverse(nodeVisitor, this);
        return this;
    }

    public Node unwrap() {
        Validate.notNull(this.parentNode);
        Node firstChild = firstChild();
        this.parentNode.addChildren(this.siblingIndex, childNodesAsArray());
        remove();
        return firstChild;
    }

    public Node wrap(String str) {
        Validate.notEmpty(str);
        Node node = this.parentNode;
        List<Node> parseFragmentInput = NodeUtils.parser(this).parseFragmentInput(str, (node == null || !(node instanceof Element)) ? this instanceof Element ? (Element) this : null : (Element) node, baseUri());
        Node node2 = parseFragmentInput.get(0);
        if (node2 instanceof Element) {
            Element element = (Element) node2;
            Element deepChild = getDeepChild(element);
            Node node3 = this.parentNode;
            if (node3 != null) {
                node3.replaceChild(this, element);
            }
            deepChild.addChildren(this);
            if (parseFragmentInput.size() > 0) {
                for (int i6 = 0; i6 < parseFragmentInput.size(); i6++) {
                    Node node4 = parseFragmentInput.get(i6);
                    if (element != node4) {
                        Node node5 = node4.parentNode;
                        if (node5 != null) {
                            node5.removeChild(node4);
                        }
                        element.after(node4);
                    }
                }
            }
        }
        return this;
    }

    public Node after(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        if (node.parentNode == this.parentNode) {
            node.remove();
        }
        this.parentNode.addChildren(this.siblingIndex + 1, node);
        return this;
    }

    public Node before(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        if (node.parentNode == this.parentNode) {
            node.remove();
        }
        this.parentNode.addChildren(this.siblingIndex, node);
        return this;
    }

    @Override // 
    public Node clone() {
        Node doClone = doClone(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(doClone);
        while (!linkedList.isEmpty()) {
            Node node = (Node) linkedList.remove();
            int childNodeSize = node.childNodeSize();
            for (int i6 = 0; i6 < childNodeSize; i6++) {
                List<Node> ensureChildNodes = node.ensureChildNodes();
                Node doClone2 = ensureChildNodes.get(i6).doClone(node);
                ensureChildNodes.set(i6, doClone2);
                linkedList.add(doClone2);
            }
        }
        return doClone;
    }

    public <T extends Node> Stream<T> nodeStream(Class<T> cls) {
        return NodeUtils.stream(this, cls);
    }

    public void outerHtml(Appendable appendable) {
        NodeTraversor.traverse(new OuterHtmlVisitor(appendable, NodeUtils.outputSettings(this)), this);
    }

    public void addChildren(int i6, Node... nodeArr) {
        Validate.notNull(nodeArr);
        if (nodeArr.length == 0) {
            return;
        }
        List<Node> ensureChildNodes = ensureChildNodes();
        Node parent = nodeArr[0].parent();
        if (parent != null && parent.childNodeSize() == nodeArr.length) {
            List<Node> ensureChildNodes2 = parent.ensureChildNodes();
            int length = nodeArr.length;
            while (true) {
                int i7 = length - 1;
                if (length > 0) {
                    if (nodeArr[i7] != ensureChildNodes2.get(i7)) {
                        break;
                    } else {
                        length = i7;
                    }
                } else {
                    boolean z5 = childNodeSize() == 0;
                    parent.empty();
                    ensureChildNodes.addAll(i6, Arrays.asList(nodeArr));
                    int length2 = nodeArr.length;
                    while (true) {
                        int i8 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        nodeArr[i8].parentNode = this;
                        length2 = i8;
                    }
                    if (z5 && nodeArr[0].siblingIndex == 0) {
                        return;
                    }
                    reindexChildren(i6);
                    return;
                }
            }
        }
        Validate.noNullElements(nodeArr);
        for (Node node : nodeArr) {
            reparentChild(node);
        }
        ensureChildNodes.addAll(i6, Arrays.asList(nodeArr));
        reindexChildren(i6);
    }

    public Node attr(String str, String str2) {
        attributes().putIgnoreCase(NodeUtils.parser(this).settings().normalizeAttribute(str), str2);
        return this;
    }
}
