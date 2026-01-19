package org.jsoup.select;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

/* loaded from: classes.dex */
public class Elements extends ArrayList<Element> {
    public Elements() {
    }

    private <T extends Node> List<T> childNodesOfType(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            Element element2 = element;
            for (int i7 = 0; i7 < element2.childNodeSize(); i7++) {
                Node childNode = element2.childNode(i7);
                if (cls.isInstance(childNode)) {
                    arrayList.add(cls.cast(childNode));
                }
            }
        }
        return arrayList;
    }

    private Elements siblings(String str, boolean z5, boolean z6) {
        Elements elements = new Elements();
        Evaluator parse = str != null ? QueryParser.parse(str) : null;
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            Element element2 = element;
            do {
                element2 = z5 ? element2.nextElementSibling() : element2.previousElementSibling();
                if (element2 != null) {
                    if (parse == null) {
                        elements.add(element2);
                    } else if (element2.is(parse)) {
                        elements.add(element2);
                    }
                }
            } while (z6);
        }
        return elements;
    }

    public Elements addClass(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.addClass(str);
        }
        return this;
    }

    public Elements after(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.after(str);
        }
        return this;
    }

    public Elements append(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.append(str);
        }
        return this;
    }

    public String attr(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            Element element2 = element;
            if (element2.hasAttr(str)) {
                return element2.attr(str);
            }
        }
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public Elements before(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.before(str);
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        remove();
        super.clear();
    }

    public List<Comment> comments() {
        return childNodesOfType(Comment.class);
    }

    public List<DataNode> dataNodes() {
        return childNodesOfType(DataNode.class);
    }

    public List<String> eachAttr(String str) {
        ArrayList arrayList = new ArrayList(size());
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            Element element2 = element;
            if (element2.hasAttr(str)) {
                arrayList.add(element2.attr(str));
            }
        }
        return arrayList;
    }

    public List<String> eachText() {
        ArrayList arrayList = new ArrayList(size());
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            Element element2 = element;
            if (element2.hasText()) {
                arrayList.add(element2.text());
            }
        }
        return arrayList;
    }

    public Elements empty() {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.empty();
        }
        return this;
    }

    public Elements eq(int i6) {
        return size() > i6 ? new Elements(get(i6)) : new Elements();
    }

    public Elements filter(NodeFilter nodeFilter) {
        NodeTraversor.filter(nodeFilter, this);
        return this;
    }

    public Element first() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public List<FormElement> forms() {
        ArrayList arrayList = new ArrayList();
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            Element element2 = element;
            if (element2 instanceof FormElement) {
                arrayList.add((FormElement) element2);
            }
        }
        return arrayList;
    }

    public boolean hasAttr(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            if (element.hasAttr(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasClass(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            if (element.hasClass(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasText() {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            if (element.hasText()) {
                return true;
            }
        }
        return false;
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            Element element2 = element;
            if (borrowBuilder.length() != 0) {
                borrowBuilder.append(SequenceUtils.EOL);
            }
            borrowBuilder.append(element2.html());
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public boolean is(String str) {
        Evaluator parse = QueryParser.parse(str);
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            if (element.is(parse)) {
                return true;
            }
        }
        return false;
    }

    public Element last() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public Elements next() {
        return siblings(null, true, false);
    }

    public Elements nextAll() {
        return siblings(null, true, true);
    }

    public Elements not(String str) {
        return Selector.filterOut(this, Selector.select(str, this));
    }

    public String outerHtml() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            Element element2 = element;
            if (borrowBuilder.length() != 0) {
                borrowBuilder.append(SequenceUtils.EOL);
            }
            borrowBuilder.append(element2.outerHtml());
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public Elements parents() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            linkedHashSet.addAll(element.parents());
        }
        return new Elements(linkedHashSet);
    }

    public Elements prepend(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.prepend(str);
        }
        return this;
    }

    public Elements prev() {
        return siblings(null, false, false);
    }

    public Elements prevAll() {
        return siblings(null, false, true);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= remove(it.next());
        }
        return z5;
    }

    public Elements removeAttr(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.removeAttr(str);
        }
        return this;
    }

    public Elements removeClass(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.removeClass(str);
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public boolean removeIf(Predicate<? super Element> predicate) {
        Iterator<Element> it = iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.ArrayList, java.util.List
    public void replaceAll(UnaryOperator<Element> unaryOperator) {
        for (int i6 = 0; i6 < size(); i6++) {
            set(i6, (Element) unaryOperator.apply(get(i6)));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        Iterator<Element> it = iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    public Elements tagName(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.tagName(str);
        }
        return this;
    }

    public String text() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            Element element2 = element;
            if (borrowBuilder.length() != 0) {
                borrowBuilder.append(SequenceUtils.SPACE);
            }
            borrowBuilder.append(element2.text());
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public List<TextNode> textNodes() {
        return childNodesOfType(TextNode.class);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return outerHtml();
    }

    public Elements toggleClass(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.toggleClass(str);
        }
        return this;
    }

    public Elements traverse(NodeVisitor nodeVisitor) {
        NodeTraversor.traverse(nodeVisitor, this);
        return this;
    }

    public Elements unwrap() {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.unwrap();
        }
        return this;
    }

    public String val() {
        if (size() > 0) {
            return first().val();
        }
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public Elements wrap(String str) {
        Validate.notEmpty(str);
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.wrap(str);
        }
        return this;
    }

    public Elements(int i6) {
        super(i6);
    }

    @Override // java.util.ArrayList
    public Elements clone() {
        Elements elements = new Elements(size());
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            elements.add(element.clone());
        }
        return elements;
    }

    public Elements next(String str) {
        return siblings(str, true, false);
    }

    public Elements nextAll(String str) {
        return siblings(str, true, true);
    }

    public Elements prev(String str) {
        return siblings(str, false, false);
    }

    public Elements prevAll(String str) {
        return siblings(str, false, true);
    }

    public Elements remove() {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.remove();
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Element set(int i6, Element element) {
        Validate.notNull(element);
        Element element2 = (Element) super.set(i6, (int) element);
        element2.replaceWith(element);
        return element2;
    }

    public Elements(Collection<Element> collection) {
        super(collection);
    }

    public Elements(List<Element> list) {
        super(list);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Element remove(int i6) {
        Element element = (Element) super.remove(i6);
        element.remove();
        return element;
    }

    public Elements val(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.val(str);
        }
        return this;
    }

    public Elements(Element... elementArr) {
        super(Arrays.asList(elementArr));
    }

    public Elements attr(String str, String str2) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.attr(str, str2);
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = super.indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Elements html(String str) {
        int size = size();
        int i6 = 0;
        while (i6 < size) {
            Element element = get(i6);
            i6++;
            element.html(str);
        }
        return this;
    }
}
