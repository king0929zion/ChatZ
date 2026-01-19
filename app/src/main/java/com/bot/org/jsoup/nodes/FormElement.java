package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

/* loaded from: classes.dex */
public class FormElement extends Element {
    private final Elements elements;

    public FormElement(Tag tag, String str, Attributes attributes) {
        super(tag, str, attributes);
        this.elements = new Elements();
    }

    public FormElement addElement(Element element) {
        this.elements.add(element);
        return this;
    }

    public Elements elements() {
        return this.elements;
    }

    public List<Connection.KeyVal> formData() {
        Element selectFirst;
        ArrayList arrayList = new ArrayList();
        Elements elements = this.elements;
        int size = elements.size();
        int i6 = 0;
        while (i6 < size) {
            Element element = elements.get(i6);
            i6++;
            Element element2 = element;
            if (element2.tag().isFormSubmittable() && !element2.hasAttr("disabled")) {
                String attr = element2.attr(com.vladsch.flexmark.util.html.Attribute.NAME_ATTR);
                if (attr.length() != 0) {
                    String attr2 = element2.attr("type");
                    if (!attr2.equalsIgnoreCase("button") && !attr2.equalsIgnoreCase("image")) {
                        if (element2.nameIs("select")) {
                            Elements select = element2.select("option[selected]");
                            int size2 = select.size();
                            boolean z5 = false;
                            int i7 = 0;
                            while (i7 < size2) {
                                Element element3 = select.get(i7);
                                i7++;
                                arrayList.add(HttpConnection.KeyVal.create(attr, element3.val()));
                                z5 = true;
                            }
                            if (!z5 && (selectFirst = element2.selectFirst("option")) != null) {
                                arrayList.add(HttpConnection.KeyVal.create(attr, selectFirst.val()));
                            }
                        } else if (!"checkbox".equalsIgnoreCase(attr2) && !"radio".equalsIgnoreCase(attr2)) {
                            arrayList.add(HttpConnection.KeyVal.create(attr, element2.val()));
                        } else if (element2.hasAttr("checked")) {
                            arrayList.add(HttpConnection.KeyVal.create(attr, element2.val().length() > 0 ? element2.val() : "on"));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // org.jsoup.nodes.Node
    public void removeChild(Node node) {
        super.removeChild(node);
        this.elements.remove(node);
    }

    public Connection submit() {
        String absUrl = hasAttr("action") ? absUrl("action") : baseUri();
        Validate.notEmpty(absUrl, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        Connection.Method method = attr("method").equalsIgnoreCase("POST") ? Connection.Method.POST : Connection.Method.GET;
        Document ownerDocument = ownerDocument();
        return (ownerDocument != null ? ownerDocument.connection().newRequest() : Jsoup.newSession()).url(absUrl).data(formData()).method(method);
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public FormElement clone() {
        return (FormElement) super.clone();
    }
}
