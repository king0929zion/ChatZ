package org.jsoup.parser;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Token;
import v.AbstractC1787b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public enum HtmlTreeBuilderState {
    Initial { // from class: org.jsoup.parser.HtmlTreeBuilderState.1
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
            } else {
                if (!token.isDoctype()) {
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
                    return htmlTreeBuilder.process(token);
                }
                Token.Doctype asDoctype = token.asDoctype();
                DocumentType documentType = new DocumentType(htmlTreeBuilder.settings.normalizeTag(asDoctype.getName()), asDoctype.getPublicIdentifier(), asDoctype.getSystemIdentifier());
                documentType.setPubSysKey(asDoctype.getPubSysKey());
                htmlTreeBuilder.getDocument().appendChild(documentType);
                htmlTreeBuilder.onNodeInserted(documentType);
                if (asDoctype.isForceQuirks()) {
                    htmlTreeBuilder.getDocument().quirksMode(Document.QuirksMode.quirks);
                }
                htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
            }
            return true;
        }
    },
    BeforeHtml { // from class: org.jsoup.parser.HtmlTreeBuilderState.2
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.processStartTag("html");
            htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
            return htmlTreeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                htmlTreeBuilder.insertElementFor(token.asStartTag());
                htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
                return true;
            }
            if ((!token.isEndTag() || !StringUtil.inSorted(token.asEndTag().normalName(), Constants.BeforeHtmlToHead)) && token.isEndTag()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            return anythingElse(token, htmlTreeBuilder);
        }
    },
    BeforeHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.3
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                return HtmlTreeBuilderState.InBody.process(token, htmlTreeBuilder);
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("head")) {
                htmlTreeBuilder.setHeadElement(htmlTreeBuilder.insertElementFor(token.asStartTag()));
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (token.isEndTag() && StringUtil.inSorted(token.asEndTag().normalName(), Constants.BeforeHtmlToHead)) {
                htmlTreeBuilder.processStartTag("head");
                return htmlTreeBuilder.process(token);
            }
            if (token.isEndTag()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.processStartTag("head");
            return htmlTreeBuilder.process(token);
        }
    },
    InHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.4
        private boolean anythingElse(Token token, TreeBuilder treeBuilder) {
            treeBuilder.processEndTag("head");
            return treeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            int i6 = AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()];
            if (i6 == 1) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
            } else {
                if (i6 == 2) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (i6 == 3) {
                    Token.StartTag asStartTag = token.asStartTag();
                    String normalName = asStartTag.normalName();
                    if (normalName.equals("html")) {
                        return HtmlTreeBuilderState.InBody.process(token, htmlTreeBuilder);
                    }
                    if (StringUtil.inSorted(normalName, Constants.InHeadEmpty)) {
                        Element insertEmptyElementFor = htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                        if (normalName.equals("base") && insertEmptyElementFor.hasAttr("href")) {
                            htmlTreeBuilder.maybeSetBaseUri(insertEmptyElementFor);
                        }
                    } else if (normalName.equals("meta")) {
                        htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                    } else if (normalName.equals(Attribute.TITLE_ATTR)) {
                        HtmlTreeBuilderState.handleRcData(asStartTag, htmlTreeBuilder);
                    } else if (StringUtil.inSorted(normalName, Constants.InHeadRaw)) {
                        HtmlTreeBuilderState.handleRawtext(asStartTag, htmlTreeBuilder);
                    } else if (normalName.equals("noscript")) {
                        htmlTreeBuilder.insertElementFor(asStartTag);
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.InHeadNoscript);
                    } else if (normalName.equals("script")) {
                        htmlTreeBuilder.tokeniser.transition(TokeniserState.ScriptData);
                        htmlTreeBuilder.markInsertionMode();
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.Text);
                        htmlTreeBuilder.insertElementFor(asStartTag);
                    } else {
                        if (normalName.equals("head")) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        if (!normalName.equals("template")) {
                            return anythingElse(token, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.insertElementFor(asStartTag);
                        htmlTreeBuilder.insertMarkerToFormattingElements();
                        htmlTreeBuilder.framesetOk(false);
                        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTemplate;
                        htmlTreeBuilder.transition(htmlTreeBuilderState);
                        htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState);
                    }
                } else {
                    if (i6 != 4) {
                        return anythingElse(token, htmlTreeBuilder);
                    }
                    String normalName2 = token.asEndTag().normalName();
                    if (normalName2.equals("head")) {
                        htmlTreeBuilder.pop();
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterHead);
                    } else {
                        if (StringUtil.inSorted(normalName2, Constants.InHeadEnd)) {
                            return anythingElse(token, htmlTreeBuilder);
                        }
                        if (!normalName2.equals("template")) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        if (htmlTreeBuilder.onStack(normalName2)) {
                            htmlTreeBuilder.generateImpliedEndTags(true);
                            if (!htmlTreeBuilder.currentElementIs(normalName2)) {
                                htmlTreeBuilder.error(this);
                            }
                            htmlTreeBuilder.popStackToClose(normalName2);
                            htmlTreeBuilder.clearFormattingElementsToLastMarker();
                            htmlTreeBuilder.popTemplateMode();
                            htmlTreeBuilder.resetInsertionMode();
                        } else {
                            htmlTreeBuilder.error(this);
                        }
                    }
                }
            }
            return true;
        }
    },
    InHeadNoscript { // from class: org.jsoup.parser.HtmlTreeBuilderState.5
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.insertCharacterNode(new Token.Character().data(token.toString()));
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return true;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEndTag() && token.asEndTag().normalName().equals("noscript")) {
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (HtmlTreeBuilderState.isWhitespace(token) || token.isComment() || (token.isStartTag() && StringUtil.inSorted(token.asStartTag().normalName(), Constants.InHeadNoScriptHead))) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
            }
            if (token.isEndTag() && token.asEndTag().normalName().equals(FlexmarkHtmlConverter.BR_NODE)) {
                return anythingElse(token, htmlTreeBuilder);
            }
            if ((!token.isStartTag() || !StringUtil.inSorted(token.asStartTag().normalName(), Constants.InHeadNoscriptIgnore)) && !token.isEndTag()) {
                return anythingElse(token, htmlTreeBuilder);
            }
            htmlTreeBuilder.error(this);
            return false;
        }
    },
    AfterHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.6
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.processStartTag("body");
            htmlTreeBuilder.framesetOk(true);
            return htmlTreeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return true;
            }
            if (!token.isStartTag()) {
                if (!token.isEndTag()) {
                    anythingElse(token, htmlTreeBuilder);
                    return true;
                }
                String normalName = token.asEndTag().normalName();
                if (StringUtil.inSorted(normalName, Constants.AfterHeadBody)) {
                    anythingElse(token, htmlTreeBuilder);
                    return true;
                }
                if (normalName.equals("template")) {
                    htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                    return true;
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            Token.StartTag asStartTag = token.asStartTag();
            String normalName2 = asStartTag.normalName();
            if (normalName2.equals("html")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (normalName2.equals("body")) {
                htmlTreeBuilder.insertElementFor(asStartTag);
                htmlTreeBuilder.framesetOk(false);
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InBody);
                return true;
            }
            if (normalName2.equals("frameset")) {
                htmlTreeBuilder.insertElementFor(asStartTag);
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InFrameset);
                return true;
            }
            if (!StringUtil.inSorted(normalName2, Constants.InBodyStartToHead)) {
                if (normalName2.equals("head")) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                anythingElse(token, htmlTreeBuilder);
                return true;
            }
            htmlTreeBuilder.error(this);
            Element headElement = htmlTreeBuilder.getHeadElement();
            htmlTreeBuilder.push(headElement);
            htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
            htmlTreeBuilder.removeFromStack(headElement);
            return true;
        }
    },
    InBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.7
        private static final int MaxStackScan = 24;

        private boolean inBodyEndTag(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            Token.EndTag asEndTag = token.asEndTag();
            String normalName = asEndTag.normalName();
            normalName.getClass();
            char c6 = 65535;
            switch (normalName.hashCode()) {
                case -1321546630:
                    if (normalName.equals("template")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 112:
                    if (normalName.equals(FlexmarkHtmlConverter.P_NODE)) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 3152:
                    if (normalName.equals(FlexmarkHtmlConverter.BR_NODE)) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 3200:
                    if (normalName.equals(FlexmarkHtmlConverter.DD_NODE)) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 3216:
                    if (normalName.equals(FlexmarkHtmlConverter.DT_NODE)) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 3273:
                    if (normalName.equals(FlexmarkHtmlConverter.H1_NODE)) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 3274:
                    if (normalName.equals(FlexmarkHtmlConverter.H2_NODE)) {
                        c6 = 6;
                        break;
                    }
                    break;
                case 3275:
                    if (normalName.equals(FlexmarkHtmlConverter.H3_NODE)) {
                        c6 = 7;
                        break;
                    }
                    break;
                case 3276:
                    if (normalName.equals(FlexmarkHtmlConverter.H4_NODE)) {
                        c6 = '\b';
                        break;
                    }
                    break;
                case 3277:
                    if (normalName.equals(FlexmarkHtmlConverter.H5_NODE)) {
                        c6 = '\t';
                        break;
                    }
                    break;
                case 3278:
                    if (normalName.equals(FlexmarkHtmlConverter.H6_NODE)) {
                        c6 = '\n';
                        break;
                    }
                    break;
                case 3453:
                    if (normalName.equals(FlexmarkHtmlConverter.LI_NODE)) {
                        c6 = 11;
                        break;
                    }
                    break;
                case 3029410:
                    if (normalName.equals("body")) {
                        c6 = '\f';
                        break;
                    }
                    break;
                case 3148996:
                    if (normalName.equals("form")) {
                        c6 = '\r';
                        break;
                    }
                    break;
                case 3213227:
                    if (normalName.equals("html")) {
                        c6 = 14;
                        break;
                    }
                    break;
                case 3536714:
                    if (normalName.equals(FlexmarkHtmlConverter.SPAN_NODE)) {
                        c6 = 15;
                        break;
                    }
                    break;
                case 1869063452:
                    if (normalName.equals("sarcasm")) {
                        c6 = 16;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                    return true;
                case 1:
                    if (!htmlTreeBuilder.inButtonScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.processStartTag(normalName);
                        return htmlTreeBuilder.process(asEndTag);
                    }
                    htmlTreeBuilder.generateImpliedEndTags(normalName);
                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(normalName);
                    return true;
                case 2:
                    htmlTreeBuilder.error(this);
                    htmlTreeBuilder.processStartTag(FlexmarkHtmlConverter.BR_NODE);
                    return false;
                case 3:
                case 4:
                    if (!htmlTreeBuilder.inScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags(normalName);
                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(normalName);
                    return true;
                case AbstractC1787b.f15290g /* 5 */:
                case 6:
                case 7:
                case '\b':
                case AbstractC1787b.f15287d /* 9 */:
                case AbstractC1787b.f15289f /* 10 */:
                    String[] strArr = Constants.Headings;
                    if (!htmlTreeBuilder.inScope(strArr)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags(normalName);
                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(strArr);
                    return true;
                case 11:
                    if (!htmlTreeBuilder.inListItemScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags(normalName);
                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(normalName);
                    return true;
                case '\f':
                    if (!htmlTreeBuilder.inScope("body")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (htmlTreeBuilder.onStackNot(Constants.InBodyEndOtherErrors)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.onNodeClosed(htmlTreeBuilder.getFromStack("body"));
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterBody);
                    return true;
                case '\r':
                    if (!htmlTreeBuilder.onStack("template")) {
                        FormElement formElement = htmlTreeBuilder.getFormElement();
                        htmlTreeBuilder.setFormElement(null);
                        if (formElement == null || !htmlTreeBuilder.inScope(normalName)) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        htmlTreeBuilder.generateImpliedEndTags();
                        if (!htmlTreeBuilder.currentElementIs(normalName)) {
                            htmlTreeBuilder.error(this);
                        }
                        htmlTreeBuilder.removeFromStack(formElement);
                    } else {
                        if (!htmlTreeBuilder.inScope(normalName)) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        htmlTreeBuilder.generateImpliedEndTags();
                        if (!htmlTreeBuilder.currentElementIs(normalName)) {
                            htmlTreeBuilder.error(this);
                        }
                        htmlTreeBuilder.popStackToClose(normalName);
                    }
                    return true;
                case 14:
                    if (!htmlTreeBuilder.onStack("body")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (htmlTreeBuilder.onStackNot(Constants.InBodyEndOtherErrors)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterBody);
                    return htmlTreeBuilder.process(token);
                case 15:
                case PegdownExtensions.AUTOLINKS /* 16 */:
                    return anyOtherEndTag(token, htmlTreeBuilder);
                default:
                    if (StringUtil.inSorted(normalName, Constants.InBodyEndAdoptionFormatters)) {
                        return inBodyEndTagAdoption(token, htmlTreeBuilder);
                    }
                    if (StringUtil.inSorted(normalName, Constants.InBodyEndClosers)) {
                        if (!htmlTreeBuilder.inScope(normalName)) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        htmlTreeBuilder.generateImpliedEndTags();
                        if (!htmlTreeBuilder.currentElementIs(normalName)) {
                            htmlTreeBuilder.error(this);
                        }
                        htmlTreeBuilder.popStackToClose(normalName);
                    } else {
                        if (!StringUtil.inSorted(normalName, Constants.InBodyStartApplets)) {
                            return anyOtherEndTag(token, htmlTreeBuilder);
                        }
                        if (!htmlTreeBuilder.inScope(Attribute.NAME_ATTR)) {
                            if (!htmlTreeBuilder.inScope(normalName)) {
                                htmlTreeBuilder.error(this);
                                return false;
                            }
                            htmlTreeBuilder.generateImpliedEndTags();
                            if (!htmlTreeBuilder.currentElementIs(normalName)) {
                                htmlTreeBuilder.error(this);
                            }
                            htmlTreeBuilder.popStackToClose(normalName);
                            htmlTreeBuilder.clearFormattingElementsToLastMarker();
                        }
                    }
                    return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6, types: [int] */
        private boolean inBodyEndTagAdoption(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            String normalName = token.asEndTag().normalName();
            ArrayList<Element> stack = htmlTreeBuilder.getStack();
            boolean z5 = false;
            int i6 = 0;
            while (i6 < 8) {
                Element activeFormattingElement = htmlTreeBuilder.getActiveFormattingElement(normalName);
                if (activeFormattingElement == null) {
                    return anyOtherEndTag(token, htmlTreeBuilder);
                }
                if (!htmlTreeBuilder.onStack(activeFormattingElement)) {
                    htmlTreeBuilder.error(this);
                    htmlTreeBuilder.removeFromActiveFormattingElements(activeFormattingElement);
                    return true;
                }
                if (!htmlTreeBuilder.inScope(activeFormattingElement.normalName())) {
                    htmlTreeBuilder.error(this);
                    return z5;
                }
                if (htmlTreeBuilder.currentElement() != activeFormattingElement) {
                    htmlTreeBuilder.error(this);
                }
                int size = stack.size();
                Element element = null;
                int i7 = -1;
                boolean z6 = z5;
                int i8 = 1;
                Element element2 = null;
                while (true) {
                    if (i8 >= size || i8 >= 64) {
                        break;
                    }
                    Element element3 = stack.get(i8);
                    if (element3 == activeFormattingElement) {
                        element2 = stack.get(i8 - 1);
                        i7 = htmlTreeBuilder.positionOfElement(element3);
                        z6 = true;
                    } else if (z6 && HtmlTreeBuilder.isSpecial(element3)) {
                        element = element3;
                        break;
                    }
                    i8++;
                }
                if (element == null) {
                    htmlTreeBuilder.popStackToClose(activeFormattingElement.normalName());
                    htmlTreeBuilder.removeFromActiveFormattingElements(activeFormattingElement);
                    return true;
                }
                Element element4 = element;
                Element element5 = element4;
                for (Object r8 = z5; r8 < 3; r8++) {
                    if (htmlTreeBuilder.onStack(element4)) {
                        element4 = htmlTreeBuilder.aboveOnStack(element4);
                    }
                    if (!htmlTreeBuilder.isInActiveFormattingElements(element4)) {
                        htmlTreeBuilder.removeFromStack(element4);
                    } else {
                        if (element4 == activeFormattingElement) {
                            break;
                        }
                        Element element6 = new Element(htmlTreeBuilder.tagFor(element4.nodeName(), ParseSettings.preserveCase), htmlTreeBuilder.getBaseUri());
                        htmlTreeBuilder.replaceActiveFormattingElement(element4, element6);
                        htmlTreeBuilder.replaceOnStack(element4, element6);
                        if (element5 == element) {
                            i7 = htmlTreeBuilder.positionOfElement(element6) + 1;
                        }
                        if (element5.parent() != null) {
                            element5.remove();
                        }
                        element6.appendChild(element5);
                        element4 = element6;
                        element5 = element4;
                    }
                }
                if (element2 != null) {
                    if (StringUtil.inSorted(element2.normalName(), Constants.InBodyEndTableFosters)) {
                        if (element5.parent() != null) {
                            element5.remove();
                        }
                        htmlTreeBuilder.insertInFosterParent(element5);
                    } else {
                        if (element5.parent() != null) {
                            element5.remove();
                        }
                        element2.appendChild(element5);
                    }
                }
                Element element7 = new Element(activeFormattingElement.tag(), htmlTreeBuilder.getBaseUri());
                element7.attributes().addAll(activeFormattingElement.attributes());
                element7.appendChildren(element.childNodes());
                element.appendChild(element7);
                htmlTreeBuilder.removeFromActiveFormattingElements(activeFormattingElement);
                htmlTreeBuilder.pushWithBookmark(element7, i7);
                htmlTreeBuilder.removeFromStack(activeFormattingElement);
                htmlTreeBuilder.insertOnStackAfter(element, element7);
                i6++;
                z5 = false;
            }
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private boolean inBodyStartTag(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            char c6;
            char c7;
            Element fromStack;
            FormElement formElement;
            Token.StartTag asStartTag = token.asStartTag();
            String normalName = asStartTag.normalName();
            normalName.getClass();
            switch (normalName.hashCode()) {
                case -1644953643:
                    if (normalName.equals("frameset")) {
                        c6 = 0;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1377687758:
                    if (normalName.equals("button")) {
                        c6 = 1;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1191214428:
                    if (normalName.equals("iframe")) {
                        c6 = 2;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1134665583:
                    if (normalName.equals("keygen")) {
                        c7 = 3;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1010136971:
                    if (normalName.equals("option")) {
                        c7 = 4;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -1003243718:
                    if (normalName.equals("textarea")) {
                        c7 = 5;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -906021636:
                    if (normalName.equals("select")) {
                        c7 = 6;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -891985998:
                    if (normalName.equals(FlexmarkHtmlConverter.STRIKE_NODE)) {
                        c7 = 7;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -891980137:
                    if (normalName.equals(FlexmarkHtmlConverter.STRONG_NODE)) {
                        c7 = '\b';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case -80773204:
                    if (normalName.equals("optgroup")) {
                        c7 = '\t';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 97:
                    if (normalName.equals(FlexmarkHtmlConverter.A_NODE)) {
                        c7 = '\n';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 98:
                    if (normalName.equals(FlexmarkHtmlConverter.B_NODE)) {
                        c7 = 11;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 105:
                    if (normalName.equals(FlexmarkHtmlConverter.I_NODE)) {
                        c7 = '\f';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 115:
                    if (normalName.equals("s")) {
                        c7 = '\r';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 117:
                    if (normalName.equals(FlexmarkHtmlConverter.U_NODE)) {
                        c7 = 14;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3152:
                    if (normalName.equals(FlexmarkHtmlConverter.BR_NODE)) {
                        c7 = 15;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3200:
                    if (normalName.equals(FlexmarkHtmlConverter.DD_NODE)) {
                        c7 = 16;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3216:
                    if (normalName.equals(FlexmarkHtmlConverter.DT_NODE)) {
                        c7 = 17;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3240:
                    if (normalName.equals(FlexmarkHtmlConverter.EM_NODE)) {
                        c7 = 18;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3273:
                    if (normalName.equals(FlexmarkHtmlConverter.H1_NODE)) {
                        c7 = 19;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3274:
                    if (normalName.equals(FlexmarkHtmlConverter.H2_NODE)) {
                        c7 = 20;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3275:
                    if (normalName.equals(FlexmarkHtmlConverter.H3_NODE)) {
                        c7 = 21;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3276:
                    if (normalName.equals(FlexmarkHtmlConverter.H4_NODE)) {
                        c7 = 22;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3277:
                    if (normalName.equals(FlexmarkHtmlConverter.H5_NODE)) {
                        c7 = 23;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3278:
                    if (normalName.equals(FlexmarkHtmlConverter.H6_NODE)) {
                        c6 = 24;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3338:
                    if (normalName.equals(FlexmarkHtmlConverter.HR_NODE)) {
                        c6 = 25;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3453:
                    if (normalName.equals(FlexmarkHtmlConverter.LI_NODE)) {
                        c7 = 26;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3632:
                    if (normalName.equals("rb")) {
                        c7 = 27;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3646:
                    if (normalName.equals("rp")) {
                        c7 = 28;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3650:
                    if (normalName.equals("rt")) {
                        c7 = 29;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3712:
                    if (normalName.equals("tt")) {
                        c7 = 30;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 97536:
                    if (normalName.equals("big")) {
                        c7 = 31;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 104387:
                    if (normalName.equals(FlexmarkHtmlConverter.IMG_NODE)) {
                        c7 = SequenceUtils.SPC;
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 111267:
                    if (normalName.equals(FlexmarkHtmlConverter.PRE_NODE)) {
                        c7 = '!';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 113249:
                    if (normalName.equals("rtc")) {
                        c7 = '\"';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 114276:
                    if (normalName.equals(FlexmarkHtmlConverter.SVG_NODE)) {
                        c7 = '#';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 117511:
                    if (normalName.equals("wbr")) {
                        c7 = '$';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 118811:
                    if (normalName.equals("xmp")) {
                        c7 = '%';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3002509:
                    if (normalName.equals("area")) {
                        c7 = '&';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3029410:
                    if (normalName.equals("body")) {
                        c7 = '\'';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3059181:
                    if (normalName.equals(FlexmarkHtmlConverter.CODE_NODE)) {
                        c7 = '(';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3148879:
                    if (normalName.equals("font")) {
                        c7 = ')';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3148996:
                    if (normalName.equals("form")) {
                        c7 = '*';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3213227:
                    if (normalName.equals("html")) {
                        c7 = '+';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3344136:
                    if (normalName.equals(FlexmarkHtmlConverter.MATH_NODE)) {
                        c7 = ',';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3386833:
                    if (normalName.equals("nobr")) {
                        c7 = '-';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 3536714:
                    if (normalName.equals(FlexmarkHtmlConverter.SPAN_NODE)) {
                        c7 = '.';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 96620249:
                    if (normalName.equals("embed")) {
                        c7 = '/';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 100313435:
                    if (normalName.equals("image")) {
                        c7 = '0';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 100358090:
                    if (normalName.equals(FlexmarkHtmlConverter.INPUT_NODE)) {
                        c7 = '1';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 109548807:
                    if (normalName.equals("small")) {
                        c7 = '2';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 110115790:
                    if (normalName.equals(FlexmarkHtmlConverter.TABLE_NODE)) {
                        c7 = '3';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 181975684:
                    if (normalName.equals("listing")) {
                        c7 = '4';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1973234167:
                    if (normalName.equals("plaintext")) {
                        c7 = '5';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 2091304424:
                    if (normalName.equals("isindex")) {
                        c7 = '6';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 2115613112:
                    if (normalName.equals("noembed")) {
                        c7 = '7';
                        c6 = c7;
                        break;
                    }
                    c6 = 65535;
                    break;
                default:
                    c6 = 65535;
                    break;
            }
            switch (c6) {
                case 0:
                    htmlTreeBuilder.error(this);
                    ArrayList<Element> stack = htmlTreeBuilder.getStack();
                    if (stack.size() == 1) {
                        return false;
                    }
                    if ((stack.size() > 2 && !stack.get(1).nameIs("body")) || !htmlTreeBuilder.framesetOk()) {
                        return false;
                    }
                    Element element = stack.get(1);
                    if (element.parent() != null) {
                        element.remove();
                    }
                    while (stack.size() > 1) {
                        stack.remove(stack.size() - 1);
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InFrameset);
                    return true;
                case 1:
                    if (htmlTreeBuilder.inButtonScope("button")) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.processEndTag("button");
                        htmlTreeBuilder.process(asStartTag);
                    } else {
                        htmlTreeBuilder.reconstructFormattingElements();
                        htmlTreeBuilder.insertElementFor(asStartTag);
                        htmlTreeBuilder.framesetOk(false);
                    }
                    return true;
                case 2:
                    htmlTreeBuilder.framesetOk(false);
                    HtmlTreeBuilderState.handleRawtext(asStartTag, htmlTreeBuilder);
                    return true;
                case 3:
                case 15:
                case ' ':
                case '$':
                case '&':
                case '/':
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    return true;
                case 4:
                case AbstractC1787b.f15287d /* 9 */:
                    if (htmlTreeBuilder.currentElementIs("option")) {
                        htmlTreeBuilder.processEndTag("option");
                    }
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case AbstractC1787b.f15290g /* 5 */:
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    if (!asStartTag.isSelfClosing()) {
                        htmlTreeBuilder.tokeniser.transition(TokeniserState.Rcdata);
                        htmlTreeBuilder.markInsertionMode();
                        htmlTreeBuilder.framesetOk(false);
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.Text);
                    }
                    return true;
                case 6:
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    if (!asStartTag.selfClosing) {
                        HtmlTreeBuilderState state = htmlTreeBuilder.state();
                        if (state.equals(HtmlTreeBuilderState.InTable) || state.equals(HtmlTreeBuilderState.InCaption) || state.equals(HtmlTreeBuilderState.InTableBody) || state.equals(HtmlTreeBuilderState.InRow) || state.equals(HtmlTreeBuilderState.InCell)) {
                            htmlTreeBuilder.transition(HtmlTreeBuilderState.InSelectInTable);
                        } else {
                            htmlTreeBuilder.transition(HtmlTreeBuilderState.InSelect);
                        }
                    }
                    return true;
                case 7:
                case '\b':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 18:
                case 30:
                case 31:
                case '(':
                case ')':
                case '2':
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.pushActiveFormattingElements(htmlTreeBuilder.insertElementFor(asStartTag));
                    return true;
                case AbstractC1787b.f15289f /* 10 */:
                    if (htmlTreeBuilder.getActiveFormattingElement(FlexmarkHtmlConverter.A_NODE) != null) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.A_NODE);
                        Element fromStack2 = htmlTreeBuilder.getFromStack(FlexmarkHtmlConverter.A_NODE);
                        if (fromStack2 != null) {
                            htmlTreeBuilder.removeFromActiveFormattingElements(fromStack2);
                            htmlTreeBuilder.removeFromStack(fromStack2);
                        }
                    }
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.pushActiveFormattingElements(htmlTreeBuilder.insertElementFor(asStartTag));
                    return true;
                case PegdownExtensions.AUTOLINKS /* 16 */:
                case 17:
                    htmlTreeBuilder.framesetOk(false);
                    ArrayList<Element> stack2 = htmlTreeBuilder.getStack();
                    int size = stack2.size();
                    int i6 = size - 1;
                    int i7 = i6 >= MaxStackScan ? size - 25 : 0;
                    while (true) {
                        if (i6 >= i7) {
                            Element element2 = stack2.get(i6);
                            if (StringUtil.inSorted(element2.normalName(), Constants.DdDt)) {
                                htmlTreeBuilder.processEndTag(element2.normalName());
                            } else if (!HtmlTreeBuilder.isSpecial(element2) || StringUtil.inSorted(element2.normalName(), Constants.InBodyStartLiBreakers)) {
                                i6--;
                            }
                        }
                    }
                    if (htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                        htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.P_NODE);
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case MaxStackScan /* 24 */:
                    if (htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                        htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.P_NODE);
                    }
                    if (StringUtil.inSorted(htmlTreeBuilder.currentElement().normalName(), Constants.Headings)) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.pop();
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case 25:
                    if (htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                        htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.P_NODE);
                    }
                    htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    return true;
                case 26:
                    htmlTreeBuilder.framesetOk(false);
                    ArrayList<Element> stack3 = htmlTreeBuilder.getStack();
                    int size2 = stack3.size() - 1;
                    while (true) {
                        if (size2 > 0) {
                            Element element3 = stack3.get(size2);
                            if (element3.nameIs(FlexmarkHtmlConverter.LI_NODE)) {
                                htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.LI_NODE);
                            } else if (!HtmlTreeBuilder.isSpecial(element3) || StringUtil.inSorted(element3.normalName(), Constants.InBodyStartLiBreakers)) {
                                size2--;
                            }
                        }
                    }
                    if (htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                        htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.P_NODE);
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case 27:
                case '\"':
                    if (htmlTreeBuilder.inScope("ruby")) {
                        htmlTreeBuilder.generateImpliedEndTags();
                        if (!htmlTreeBuilder.currentElementIs("ruby")) {
                            htmlTreeBuilder.error(this);
                        }
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case 28:
                case 29:
                    if (htmlTreeBuilder.inScope("ruby")) {
                        htmlTreeBuilder.generateImpliedEndTags("rtc");
                        if (!htmlTreeBuilder.currentElementIs("rtc") && !htmlTreeBuilder.currentElementIs("ruby")) {
                            htmlTreeBuilder.error(this);
                        }
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case '!':
                case '4':
                    if (htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                        htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.P_NODE);
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.reader.matchConsume(SequenceUtils.EOL);
                    htmlTreeBuilder.framesetOk(false);
                    return true;
                case '#':
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertForeignElementFor(asStartTag, Parser.NamespaceSvg);
                    return true;
                case '%':
                    if (htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                        htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.P_NODE);
                    }
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.framesetOk(false);
                    HtmlTreeBuilderState.handleRawtext(asStartTag, htmlTreeBuilder);
                    return true;
                case '\'':
                    htmlTreeBuilder.error(this);
                    ArrayList<Element> stack4 = htmlTreeBuilder.getStack();
                    if (stack4.size() == 1) {
                        return false;
                    }
                    if ((stack4.size() > 2 && !stack4.get(1).nameIs("body")) || htmlTreeBuilder.onStack("template")) {
                        return false;
                    }
                    htmlTreeBuilder.framesetOk(false);
                    if (asStartTag.hasAttributes() && (fromStack = htmlTreeBuilder.getFromStack("body")) != null) {
                        Iterator<org.jsoup.nodes.Attribute> it = asStartTag.attributes.iterator();
                        while (it.hasNext()) {
                            org.jsoup.nodes.Attribute next = it.next();
                            if (!fromStack.hasAttr(next.getKey())) {
                                fromStack.attributes().put(next);
                            }
                        }
                    }
                    return true;
                case '*':
                    if (htmlTreeBuilder.getFormElement() != null && !htmlTreeBuilder.onStack("template")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                        htmlTreeBuilder.closeElement(FlexmarkHtmlConverter.P_NODE);
                    }
                    htmlTreeBuilder.insertFormElement(asStartTag, true, true);
                    return true;
                case '+':
                    htmlTreeBuilder.error(this);
                    if (htmlTreeBuilder.onStack("template")) {
                        return false;
                    }
                    if (htmlTreeBuilder.getStack().size() > 0) {
                        Element element4 = htmlTreeBuilder.getStack().get(0);
                        if (asStartTag.hasAttributes()) {
                            Iterator<org.jsoup.nodes.Attribute> it2 = asStartTag.attributes.iterator();
                            while (it2.hasNext()) {
                                org.jsoup.nodes.Attribute next2 = it2.next();
                                if (!element4.hasAttr(next2.getKey())) {
                                    element4.attributes().put(next2);
                                }
                            }
                        }
                    }
                    return true;
                case ',':
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertForeignElementFor(asStartTag, Parser.NamespaceMathml);
                    return true;
                case '-':
                    htmlTreeBuilder.reconstructFormattingElements();
                    if (htmlTreeBuilder.inScope("nobr")) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.processEndTag("nobr");
                        htmlTreeBuilder.reconstructFormattingElements();
                    }
                    htmlTreeBuilder.pushActiveFormattingElements(htmlTreeBuilder.insertElementFor(asStartTag));
                    return true;
                case '.':
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case '0':
                    if (htmlTreeBuilder.getFromStack(FlexmarkHtmlConverter.SVG_NODE) == null) {
                        return htmlTreeBuilder.process(asStartTag.name(FlexmarkHtmlConverter.IMG_NODE));
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case '1':
                    htmlTreeBuilder.reconstructFormattingElements();
                    if (!htmlTreeBuilder.insertEmptyElementFor(asStartTag).attr("type").equalsIgnoreCase("hidden")) {
                        htmlTreeBuilder.framesetOk(false);
                    }
                    return true;
                case '3':
                    if (htmlTreeBuilder.getDocument().quirksMode() != Document.QuirksMode.quirks && htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                        htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.P_NODE);
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
                    return true;
                case '5':
                    if (htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                        htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.P_NODE);
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.tokeniser.transition(TokeniserState.PLAINTEXT);
                    return true;
                case '6':
                    htmlTreeBuilder.error(this);
                    if (htmlTreeBuilder.getFormElement() != null) {
                        return false;
                    }
                    htmlTreeBuilder.processStartTag("form");
                    if (asStartTag.hasAttribute("action") && (formElement = htmlTreeBuilder.getFormElement()) != null && asStartTag.hasAttribute("action")) {
                        formElement.attributes().put("action", asStartTag.attributes.get("action"));
                    }
                    htmlTreeBuilder.processStartTag(FlexmarkHtmlConverter.HR_NODE);
                    htmlTreeBuilder.processStartTag("label");
                    htmlTreeBuilder.process(new Token.Character().data(asStartTag.hasAttribute("prompt") ? asStartTag.attributes.get("prompt") : "This is a searchable index. Enter search keywords: "));
                    Attributes attributes = new Attributes();
                    if (asStartTag.hasAttributes()) {
                        Iterator<org.jsoup.nodes.Attribute> it3 = asStartTag.attributes.iterator();
                        while (it3.hasNext()) {
                            org.jsoup.nodes.Attribute next3 = it3.next();
                            if (!StringUtil.inSorted(next3.getKey(), Constants.InBodyStartInputAttribs)) {
                                attributes.put(next3);
                            }
                        }
                    }
                    attributes.put(Attribute.NAME_ATTR, "isindex");
                    htmlTreeBuilder.processStartTag(FlexmarkHtmlConverter.INPUT_NODE, attributes);
                    htmlTreeBuilder.processEndTag("label");
                    htmlTreeBuilder.processStartTag(FlexmarkHtmlConverter.HR_NODE);
                    htmlTreeBuilder.processEndTag("form");
                    return true;
                case '7':
                    HtmlTreeBuilderState.handleRawtext(asStartTag, htmlTreeBuilder);
                    return true;
                default:
                    if (!Tag.isKnownTag(normalName)) {
                        htmlTreeBuilder.insertElementFor(asStartTag);
                    } else if (StringUtil.inSorted(normalName, Constants.InBodyStartPClosers)) {
                        if (htmlTreeBuilder.inButtonScope(FlexmarkHtmlConverter.P_NODE)) {
                            htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.P_NODE);
                        }
                        htmlTreeBuilder.insertElementFor(asStartTag);
                    } else {
                        if (StringUtil.inSorted(normalName, Constants.InBodyStartToHead)) {
                            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        }
                        if (StringUtil.inSorted(normalName, Constants.InBodyStartApplets)) {
                            htmlTreeBuilder.reconstructFormattingElements();
                            htmlTreeBuilder.insertElementFor(asStartTag);
                            htmlTreeBuilder.insertMarkerToFormattingElements();
                            htmlTreeBuilder.framesetOk(false);
                        } else {
                            if (!StringUtil.inSorted(normalName, Constants.InBodyStartMedia)) {
                                if (StringUtil.inSorted(normalName, Constants.InBodyStartDrop)) {
                                    htmlTreeBuilder.error(this);
                                    return false;
                                }
                                htmlTreeBuilder.reconstructFormattingElements();
                                htmlTreeBuilder.insertElementFor(asStartTag);
                                return true;
                            }
                            htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                        }
                    }
                    return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean anyOtherEndTag(org.jsoup.parser.Token r7, org.jsoup.parser.HtmlTreeBuilder r8) {
            /*
                r6 = this;
                org.jsoup.parser.Token$EndTag r7 = r7.asEndTag()
                java.lang.String r7 = r7.normalName
                java.util.ArrayList r0 = r8.getStack()
                org.jsoup.nodes.Element r1 = r8.getFromStack(r7)
                r2 = 0
                if (r1 != 0) goto L15
                r8.error(r6)
                return r2
            L15:
                int r1 = r0.size()
                r3 = 1
                int r1 = r1 - r3
            L1b:
                if (r1 < 0) goto L46
                java.lang.Object r4 = r0.get(r1)
                org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
                boolean r5 = r4.nameIs(r7)
                if (r5 == 0) goto L39
                r8.generateImpliedEndTags(r7)
                boolean r0 = r8.currentElementIs(r7)
                if (r0 != 0) goto L35
                r8.error(r6)
            L35:
                r8.popStackToClose(r7)
                goto L46
            L39:
                boolean r4 = org.jsoup.parser.HtmlTreeBuilder.isSpecial(r4)
                if (r4 == 0) goto L43
                r8.error(r6)
                return r2
            L43:
                int r1 = r1 + (-1)
                goto L1b
            L46:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.AnonymousClass7.anyOtherEndTag(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()]) {
                case 1:
                    htmlTreeBuilder.insertCommentNode(token.asComment());
                    return true;
                case 2:
                    htmlTreeBuilder.error(this);
                    return false;
                case 3:
                    return inBodyStartTag(token, htmlTreeBuilder);
                case 4:
                    return inBodyEndTag(token, htmlTreeBuilder);
                case AbstractC1787b.f15290g /* 5 */:
                    Token.Character asCharacter = token.asCharacter();
                    if (asCharacter.getData().equals(HtmlTreeBuilderState.nullString)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (htmlTreeBuilder.framesetOk() && HtmlTreeBuilderState.isWhitespace(asCharacter)) {
                        htmlTreeBuilder.reconstructFormattingElements();
                        htmlTreeBuilder.insertCharacterNode(asCharacter);
                        return true;
                    }
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertCharacterNode(asCharacter);
                    htmlTreeBuilder.framesetOk(false);
                    return true;
                case 6:
                    if (htmlTreeBuilder.templateModeSize() > 0) {
                        return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InTemplate);
                    }
                    if (!htmlTreeBuilder.onStackNot(Constants.InBodyEndOtherErrors)) {
                        return true;
                    }
                    htmlTreeBuilder.error(this);
                    return true;
                default:
                    return true;
            }
        }
    },
    Text { // from class: org.jsoup.parser.HtmlTreeBuilderState.8
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isCharacter()) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isEOF()) {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(htmlTreeBuilder.originalState());
                return htmlTreeBuilder.process(token);
            }
            if (!token.isEndTag()) {
                return true;
            }
            htmlTreeBuilder.pop();
            htmlTreeBuilder.transition(htmlTreeBuilder.originalState());
            return true;
        }
    },
    InTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.9
        public boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.setFosterInserts(true);
            htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            htmlTreeBuilder.setFosterInserts(false);
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isCharacter() && StringUtil.inSorted(htmlTreeBuilder.currentElement().normalName(), Constants.InTableFoster)) {
                htmlTreeBuilder.resetPendingTableCharacters();
                htmlTreeBuilder.markInsertionMode();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableText);
                return htmlTreeBuilder.process(token);
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (!token.isStartTag()) {
                if (!token.isEndTag()) {
                    if (!token.isEOF()) {
                        return anythingElse(token, htmlTreeBuilder);
                    }
                    if (htmlTreeBuilder.currentElementIs("html")) {
                        htmlTreeBuilder.error(this);
                    }
                    return true;
                }
                String normalName = token.asEndTag().normalName();
                if (normalName.equals(FlexmarkHtmlConverter.TABLE_NODE)) {
                    if (!htmlTreeBuilder.inTableScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.popStackToClose(FlexmarkHtmlConverter.TABLE_NODE);
                    htmlTreeBuilder.resetInsertionMode();
                } else {
                    if (StringUtil.inSorted(normalName, Constants.InTableEndErr)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (!normalName.equals("template")) {
                        return anythingElse(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                }
                return true;
            }
            Token.StartTag asStartTag = token.asStartTag();
            String normalName2 = asStartTag.normalName();
            if (normalName2.equals(FlexmarkHtmlConverter.CAPTION_NODE)) {
                htmlTreeBuilder.clearStackToTableContext();
                htmlTreeBuilder.insertMarkerToFormattingElements();
                htmlTreeBuilder.insertElementFor(asStartTag);
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InCaption);
            } else if (normalName2.equals("colgroup")) {
                htmlTreeBuilder.clearStackToTableContext();
                htmlTreeBuilder.insertElementFor(asStartTag);
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InColumnGroup);
            } else {
                if (normalName2.equals("col")) {
                    htmlTreeBuilder.clearStackToTableContext();
                    htmlTreeBuilder.processStartTag("colgroup");
                    return htmlTreeBuilder.process(token);
                }
                if (StringUtil.inSorted(normalName2, Constants.InTableToBody)) {
                    htmlTreeBuilder.clearStackToTableContext();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                } else {
                    if (StringUtil.inSorted(normalName2, Constants.InTableAddBody)) {
                        htmlTreeBuilder.clearStackToTableContext();
                        htmlTreeBuilder.processStartTag(FlexmarkHtmlConverter.TBODY_NODE);
                        return htmlTreeBuilder.process(token);
                    }
                    if (normalName2.equals(FlexmarkHtmlConverter.TABLE_NODE)) {
                        htmlTreeBuilder.error(this);
                        if (!htmlTreeBuilder.inTableScope(normalName2)) {
                            return false;
                        }
                        htmlTreeBuilder.popStackToClose(normalName2);
                        if (htmlTreeBuilder.resetInsertionMode()) {
                            return htmlTreeBuilder.process(token);
                        }
                        htmlTreeBuilder.insertElementFor(asStartTag);
                        return true;
                    }
                    if (StringUtil.inSorted(normalName2, Constants.InTableToHead)) {
                        return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                    }
                    if (normalName2.equals(FlexmarkHtmlConverter.INPUT_NODE)) {
                        if (!asStartTag.hasAttributes() || !asStartTag.attributes.get("type").equalsIgnoreCase("hidden")) {
                            return anythingElse(token, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                    } else {
                        if (!normalName2.equals("form")) {
                            return anythingElse(token, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.error(this);
                        if (htmlTreeBuilder.getFormElement() != null || htmlTreeBuilder.onStack("template")) {
                            return false;
                        }
                        htmlTreeBuilder.insertFormElement(asStartTag, false, false);
                    }
                }
            }
            return true;
        }
    },
    InTableText { // from class: org.jsoup.parser.HtmlTreeBuilderState.10
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.type == Token.TokenType.Character) {
                Token.Character asCharacter = token.asCharacter();
                if (asCharacter.getData().equals(HtmlTreeBuilderState.nullString)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.addPendingTableCharacters(asCharacter);
                return true;
            }
            if (htmlTreeBuilder.getPendingTableCharacters().size() > 0) {
                Token token2 = htmlTreeBuilder.currentToken;
                for (Token.Character character : htmlTreeBuilder.getPendingTableCharacters()) {
                    htmlTreeBuilder.currentToken = character;
                    if (HtmlTreeBuilderState.isWhitespace(character)) {
                        htmlTreeBuilder.insertCharacterNode(character);
                    } else {
                        htmlTreeBuilder.error(this);
                        if (StringUtil.inSorted(htmlTreeBuilder.currentElement().normalName(), Constants.InTableFoster)) {
                            htmlTreeBuilder.setFosterInserts(true);
                            htmlTreeBuilder.process(character, HtmlTreeBuilderState.InBody);
                            htmlTreeBuilder.setFosterInserts(false);
                        } else {
                            htmlTreeBuilder.process(character, HtmlTreeBuilderState.InBody);
                        }
                    }
                }
                htmlTreeBuilder.currentToken = token2;
                htmlTreeBuilder.resetPendingTableCharacters();
            }
            htmlTreeBuilder.transition(htmlTreeBuilder.originalState());
            return htmlTreeBuilder.process(token);
        }
    },
    InCaption { // from class: org.jsoup.parser.HtmlTreeBuilderState.11
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isEndTag() && token.asEndTag().normalName().equals(FlexmarkHtmlConverter.CAPTION_NODE)) {
                if (!htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.CAPTION_NODE)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.generateImpliedEndTags();
                if (!htmlTreeBuilder.currentElementIs(FlexmarkHtmlConverter.CAPTION_NODE)) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose(FlexmarkHtmlConverter.CAPTION_NODE);
                htmlTreeBuilder.clearFormattingElementsToLastMarker();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
                return true;
            }
            if ((!token.isStartTag() || !StringUtil.inSorted(token.asStartTag().normalName(), Constants.InCellCol)) && (!token.isEndTag() || !token.asEndTag().normalName().equals(FlexmarkHtmlConverter.TABLE_NODE))) {
                if (!token.isEndTag() || !StringUtil.inSorted(token.asEndTag().normalName(), Constants.InCaptionIgnore)) {
                    return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            if (!htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.CAPTION_NODE)) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.generateImpliedEndTags(false);
            if (!htmlTreeBuilder.currentElementIs(FlexmarkHtmlConverter.CAPTION_NODE)) {
                htmlTreeBuilder.error(this);
            }
            htmlTreeBuilder.popStackToClose(FlexmarkHtmlConverter.CAPTION_NODE);
            htmlTreeBuilder.clearFormattingElementsToLastMarker();
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
            htmlTreeBuilder.transition(htmlTreeBuilderState);
            htmlTreeBuilderState.process(token, htmlTreeBuilder);
            return true;
        }
    },
    InColumnGroup { // from class: org.jsoup.parser.HtmlTreeBuilderState.12
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.currentElementIs("colgroup")) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.pop();
            htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
            htmlTreeBuilder.process(token);
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
        
            if (r3.equals("html") == false) goto L37;
         */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean process(org.jsoup.parser.Token r10, org.jsoup.parser.HtmlTreeBuilder r11) {
            /*
                r9 = this;
                boolean r0 = org.jsoup.parser.HtmlTreeBuilderState.access$100(r10)
                r1 = 1
                if (r0 == 0) goto Lf
                org.jsoup.parser.Token$Character r10 = r10.asCharacter()
                r11.insertCharacterNode(r10)
                return r1
            Lf:
                int[] r0 = org.jsoup.parser.HtmlTreeBuilderState.AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType
                org.jsoup.parser.Token$TokenType r2 = r10.type
                int r2 = r2.ordinal()
                r0 = r0[r2]
                if (r0 == r1) goto Lc0
                r2 = 2
                if (r0 == r2) goto Lbc
                r3 = 3
                r4 = 0
                java.lang.String r5 = "template"
                java.lang.String r6 = "html"
                if (r0 == r3) goto L74
                r2 = 4
                if (r0 == r2) goto L3d
                r2 = 6
                if (r0 == r2) goto L31
                boolean r10 = r9.anythingElse(r10, r11)
                return r10
            L31:
                boolean r0 = r11.currentElementIs(r6)
                if (r0 == 0) goto L38
                return r1
            L38:
                boolean r10 = r9.anythingElse(r10, r11)
                return r10
            L3d:
                org.jsoup.parser.Token$EndTag r0 = r10.asEndTag()
                java.lang.String r0 = r0.normalName()
                r0.getClass()
                boolean r2 = r0.equals(r5)
                if (r2 != 0) goto L6e
                java.lang.String r2 = "colgroup"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L5b
                boolean r10 = r9.anythingElse(r10, r11)
                return r10
            L5b:
                boolean r10 = r11.currentElementIs(r0)
                if (r10 != 0) goto L65
                r11.error(r9)
                return r4
            L65:
                r11.pop()
                org.jsoup.parser.HtmlTreeBuilderState r10 = org.jsoup.parser.HtmlTreeBuilderState.InTable
                r11.transition(r10)
                goto Lc7
            L6e:
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InHead
                r11.process(r10, r0)
                goto Lc7
            L74:
                org.jsoup.parser.Token$StartTag r0 = r10.asStartTag()
                java.lang.String r3 = r0.normalName()
                r3.getClass()
                int r7 = r3.hashCode()
                r8 = -1
                switch(r7) {
                    case -1321546630: goto L9b;
                    case 98688: goto L90;
                    case 3213227: goto L89;
                    default: goto L87;
                }
            L87:
                r2 = r8
                goto La3
            L89:
                boolean r3 = r3.equals(r6)
                if (r3 != 0) goto La3
                goto L87
            L90:
                java.lang.String r2 = "col"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L99
                goto L87
            L99:
                r2 = r1
                goto La3
            L9b:
                boolean r2 = r3.equals(r5)
                if (r2 != 0) goto La2
                goto L87
            La2:
                r2 = r4
            La3:
                switch(r2) {
                    case 0: goto Lb6;
                    case 1: goto Lb2;
                    case 2: goto Lab;
                    default: goto La6;
                }
            La6:
                boolean r10 = r9.anythingElse(r10, r11)
                return r10
            Lab:
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InBody
                boolean r10 = r11.process(r10, r0)
                return r10
            Lb2:
                r11.insertEmptyElementFor(r0)
                goto Lc7
            Lb6:
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InHead
                r11.process(r10, r0)
                goto Lc7
            Lbc:
                r11.error(r9)
                goto Lc7
            Lc0:
                org.jsoup.parser.Token$Comment r10 = r10.asComment()
                r11.insertCommentNode(r10)
            Lc7:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.AnonymousClass12.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }
    },
    InTableBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.13
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InTable);
        }

        private boolean exitTableBody(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.TBODY_NODE) && !htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.THEAD_NODE) && !htmlTreeBuilder.inScope("tfoot")) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.clearStackToTableBodyContext();
            htmlTreeBuilder.processEndTag(htmlTreeBuilder.currentElement().normalName());
            return htmlTreeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            int i6 = AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()];
            if (i6 == 3) {
                Token.StartTag asStartTag = token.asStartTag();
                String normalName = asStartTag.normalName();
                if (normalName.equals(FlexmarkHtmlConverter.TR_NODE)) {
                    htmlTreeBuilder.clearStackToTableBodyContext();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InRow);
                    return true;
                }
                if (!StringUtil.inSorted(normalName, Constants.InCellNames)) {
                    return StringUtil.inSorted(normalName, Constants.InTableBodyExit) ? exitTableBody(token, htmlTreeBuilder) : anythingElse(token, htmlTreeBuilder);
                }
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.processStartTag(FlexmarkHtmlConverter.TR_NODE);
                return htmlTreeBuilder.process(asStartTag);
            }
            if (i6 != 4) {
                return anythingElse(token, htmlTreeBuilder);
            }
            String normalName2 = token.asEndTag().normalName();
            if (!StringUtil.inSorted(normalName2, Constants.InTableEndIgnore)) {
                if (normalName2.equals(FlexmarkHtmlConverter.TABLE_NODE)) {
                    return exitTableBody(token, htmlTreeBuilder);
                }
                if (!StringUtil.inSorted(normalName2, Constants.InTableBodyEndIgnore)) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            if (!htmlTreeBuilder.inTableScope(normalName2)) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.clearStackToTableBodyContext();
            htmlTreeBuilder.pop();
            htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
            return true;
        }
    },
    InRow { // from class: org.jsoup.parser.HtmlTreeBuilderState.14
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InTable);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isStartTag()) {
                Token.StartTag asStartTag = token.asStartTag();
                String normalName = asStartTag.normalName();
                if (StringUtil.inSorted(normalName, Constants.InCellNames)) {
                    htmlTreeBuilder.clearStackToTableRowContext();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InCell);
                    htmlTreeBuilder.insertMarkerToFormattingElements();
                    return true;
                }
                if (!StringUtil.inSorted(normalName, Constants.InRowMissing)) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                if (!htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.TR_NODE)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.clearStackToTableRowContext();
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                return htmlTreeBuilder.process(token);
            }
            if (!token.isEndTag()) {
                return anythingElse(token, htmlTreeBuilder);
            }
            String normalName2 = token.asEndTag().normalName();
            if (normalName2.equals(FlexmarkHtmlConverter.TR_NODE)) {
                if (!htmlTreeBuilder.inTableScope(normalName2)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.clearStackToTableRowContext();
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                return true;
            }
            if (normalName2.equals(FlexmarkHtmlConverter.TABLE_NODE)) {
                if (!htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.TR_NODE)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.clearStackToTableRowContext();
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                return htmlTreeBuilder.process(token);
            }
            if (!StringUtil.inSorted(normalName2, Constants.InTableToBody)) {
                if (!StringUtil.inSorted(normalName2, Constants.InRowIgnore)) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            if (!htmlTreeBuilder.inTableScope(normalName2)) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (!htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.TR_NODE)) {
                return false;
            }
            htmlTreeBuilder.clearStackToTableRowContext();
            htmlTreeBuilder.pop();
            htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
            return htmlTreeBuilder.process(token);
        }
    },
    InCell { // from class: org.jsoup.parser.HtmlTreeBuilderState.15
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
        }

        private void closeCell(HtmlTreeBuilder htmlTreeBuilder) {
            if (htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.TD_NODE)) {
                htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.TD_NODE);
            } else {
                htmlTreeBuilder.processEndTag(FlexmarkHtmlConverter.TH_NODE);
            }
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!token.isEndTag()) {
                if (!token.isStartTag() || !StringUtil.inSorted(token.asStartTag().normalName(), Constants.InCellCol)) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                if (htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.TD_NODE) || htmlTreeBuilder.inTableScope(FlexmarkHtmlConverter.TH_NODE)) {
                    closeCell(htmlTreeBuilder);
                    return htmlTreeBuilder.process(token);
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            String normalName = token.asEndTag().normalName();
            if (!StringUtil.inSorted(normalName, Constants.InCellNames)) {
                if (StringUtil.inSorted(normalName, Constants.InCellBody)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (!StringUtil.inSorted(normalName, Constants.InCellTable)) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                if (htmlTreeBuilder.inTableScope(normalName)) {
                    closeCell(htmlTreeBuilder);
                    return htmlTreeBuilder.process(token);
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            if (!htmlTreeBuilder.inTableScope(normalName)) {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InRow);
                return false;
            }
            htmlTreeBuilder.generateImpliedEndTags();
            if (!htmlTreeBuilder.currentElementIs(normalName)) {
                htmlTreeBuilder.error(this);
            }
            htmlTreeBuilder.popStackToClose(normalName);
            htmlTreeBuilder.clearFormattingElementsToLastMarker();
            htmlTreeBuilder.transition(HtmlTreeBuilderState.InRow);
            return true;
        }
    },
    InSelect { // from class: org.jsoup.parser.HtmlTreeBuilderState.16
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.error(this);
            return false;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()]) {
                case 1:
                    htmlTreeBuilder.insertCommentNode(token.asComment());
                    return true;
                case 2:
                    htmlTreeBuilder.error(this);
                    return false;
                case 3:
                    Token.StartTag asStartTag = token.asStartTag();
                    String normalName = asStartTag.normalName();
                    if (normalName.equals("html")) {
                        return htmlTreeBuilder.process(asStartTag, HtmlTreeBuilderState.InBody);
                    }
                    if (normalName.equals("option")) {
                        if (htmlTreeBuilder.currentElementIs("option")) {
                            htmlTreeBuilder.processEndTag("option");
                        }
                        htmlTreeBuilder.insertElementFor(asStartTag);
                    } else {
                        if (!normalName.equals("optgroup")) {
                            if (normalName.equals("select")) {
                                htmlTreeBuilder.error(this);
                                return htmlTreeBuilder.processEndTag("select");
                            }
                            if (!StringUtil.inSorted(normalName, Constants.InSelectEnd)) {
                                return (normalName.equals("script") || normalName.equals("template")) ? htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead) : anythingElse(token, htmlTreeBuilder);
                            }
                            htmlTreeBuilder.error(this);
                            if (!htmlTreeBuilder.inSelectScope("select")) {
                                return false;
                            }
                            htmlTreeBuilder.processEndTag("select");
                            return htmlTreeBuilder.process(asStartTag);
                        }
                        if (htmlTreeBuilder.currentElementIs("option")) {
                            htmlTreeBuilder.processEndTag("option");
                        }
                        if (htmlTreeBuilder.currentElementIs("optgroup")) {
                            htmlTreeBuilder.processEndTag("optgroup");
                        }
                        htmlTreeBuilder.insertElementFor(asStartTag);
                    }
                    return true;
                case 4:
                    String normalName2 = token.asEndTag().normalName();
                    normalName2.getClass();
                    char c6 = 65535;
                    switch (normalName2.hashCode()) {
                        case -1321546630:
                            if (normalName2.equals("template")) {
                                c6 = 0;
                                break;
                            }
                            break;
                        case -1010136971:
                            if (normalName2.equals("option")) {
                                c6 = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (normalName2.equals("select")) {
                                c6 = 2;
                                break;
                            }
                            break;
                        case -80773204:
                            if (normalName2.equals("optgroup")) {
                                c6 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c6) {
                        case 0:
                            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        case 1:
                            if (htmlTreeBuilder.currentElementIs("option")) {
                                htmlTreeBuilder.pop();
                            } else {
                                htmlTreeBuilder.error(this);
                            }
                            return true;
                        case 2:
                            if (!htmlTreeBuilder.inSelectScope(normalName2)) {
                                htmlTreeBuilder.error(this);
                                return false;
                            }
                            htmlTreeBuilder.popStackToClose(normalName2);
                            htmlTreeBuilder.resetInsertionMode();
                            return true;
                        case 3:
                            if (htmlTreeBuilder.currentElementIs("option") && htmlTreeBuilder.aboveOnStack(htmlTreeBuilder.currentElement()) != null && htmlTreeBuilder.aboveOnStack(htmlTreeBuilder.currentElement()).nameIs("optgroup")) {
                                htmlTreeBuilder.processEndTag("option");
                            }
                            if (htmlTreeBuilder.currentElementIs("optgroup")) {
                                htmlTreeBuilder.pop();
                            } else {
                                htmlTreeBuilder.error(this);
                            }
                            return true;
                        default:
                            return anythingElse(token, htmlTreeBuilder);
                    }
                case AbstractC1787b.f15290g /* 5 */:
                    Token.Character asCharacter = token.asCharacter();
                    if (asCharacter.getData().equals(HtmlTreeBuilderState.nullString)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.insertCharacterNode(asCharacter);
                    return true;
                case 6:
                    if (!htmlTreeBuilder.currentElementIs("html")) {
                        htmlTreeBuilder.error(this);
                    }
                    return true;
                default:
                    return anythingElse(token, htmlTreeBuilder);
            }
        }
    },
    InSelectInTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.17
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isStartTag() && StringUtil.inSorted(token.asStartTag().normalName(), Constants.InSelectTableEnd)) {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.popStackToClose("select");
                htmlTreeBuilder.resetInsertionMode();
                return htmlTreeBuilder.process(token);
            }
            if (!token.isEndTag() || !StringUtil.inSorted(token.asEndTag().normalName(), Constants.InSelectTableEnd)) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InSelect);
            }
            htmlTreeBuilder.error(this);
            if (!htmlTreeBuilder.inTableScope(token.asEndTag().normalName())) {
                return false;
            }
            htmlTreeBuilder.popStackToClose("select");
            htmlTreeBuilder.resetInsertionMode();
            return htmlTreeBuilder.process(token);
        }
    },
    InTemplate { // from class: org.jsoup.parser.HtmlTreeBuilderState.18
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()]) {
                case 1:
                case 2:
                case AbstractC1787b.f15290g /* 5 */:
                    htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
                    return true;
                case 3:
                    String normalName = token.asStartTag().normalName();
                    if (StringUtil.inSorted(normalName, Constants.InTemplateToHead)) {
                        htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        return true;
                    }
                    if (StringUtil.inSorted(normalName, Constants.InTemplateToTable)) {
                        htmlTreeBuilder.popTemplateMode();
                        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
                        htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState);
                        htmlTreeBuilder.transition(htmlTreeBuilderState);
                        return htmlTreeBuilder.process(token);
                    }
                    if (normalName.equals("col")) {
                        htmlTreeBuilder.popTemplateMode();
                        HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InColumnGroup;
                        htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState2);
                        htmlTreeBuilder.transition(htmlTreeBuilderState2);
                        return htmlTreeBuilder.process(token);
                    }
                    if (normalName.equals(FlexmarkHtmlConverter.TR_NODE)) {
                        htmlTreeBuilder.popTemplateMode();
                        HtmlTreeBuilderState htmlTreeBuilderState3 = HtmlTreeBuilderState.InTableBody;
                        htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState3);
                        htmlTreeBuilder.transition(htmlTreeBuilderState3);
                        return htmlTreeBuilder.process(token);
                    }
                    if (normalName.equals(FlexmarkHtmlConverter.TD_NODE) || normalName.equals(FlexmarkHtmlConverter.TH_NODE)) {
                        htmlTreeBuilder.popTemplateMode();
                        HtmlTreeBuilderState htmlTreeBuilderState4 = HtmlTreeBuilderState.InRow;
                        htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState4);
                        htmlTreeBuilder.transition(htmlTreeBuilderState4);
                        return htmlTreeBuilder.process(token);
                    }
                    htmlTreeBuilder.popTemplateMode();
                    HtmlTreeBuilderState htmlTreeBuilderState5 = HtmlTreeBuilderState.InBody;
                    htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState5);
                    htmlTreeBuilder.transition(htmlTreeBuilderState5);
                    return htmlTreeBuilder.process(token);
                case 4:
                    if (token.asEndTag().normalName().equals("template")) {
                        htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        return true;
                    }
                    htmlTreeBuilder.error(this);
                    return false;
                case 6:
                    if (!htmlTreeBuilder.onStack("template")) {
                        return true;
                    }
                    htmlTreeBuilder.error(this);
                    htmlTreeBuilder.popStackToClose("template");
                    htmlTreeBuilder.clearFormattingElementsToLastMarker();
                    htmlTreeBuilder.popTemplateMode();
                    htmlTreeBuilder.resetInsertionMode();
                    if (htmlTreeBuilder.state() == HtmlTreeBuilderState.InTemplate || htmlTreeBuilder.templateModeSize() >= 12) {
                        return true;
                    }
                    return htmlTreeBuilder.process(token);
                default:
                    return true;
            }
        }
    },
    AfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.19
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            Element fromStack = htmlTreeBuilder.getFromStack("html");
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                if (fromStack != null) {
                    htmlTreeBuilder.insertCharacterToElement(token.asCharacter(), fromStack);
                    return true;
                }
                htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (!token.isEndTag() || !token.asEndTag().normalName().equals("html")) {
                if (token.isEOF()) {
                    return true;
                }
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.resetBody();
                return htmlTreeBuilder.process(token);
            }
            if (htmlTreeBuilder.isFragmentParsing()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (fromStack != null) {
                htmlTreeBuilder.onNodeClosed(fromStack);
            }
            htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterAfterBody);
            return true;
        }
    },
    InFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.20
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
            } else if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
            } else {
                if (token.isDoctype()) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (token.isStartTag()) {
                    Token.StartTag asStartTag = token.asStartTag();
                    String normalName = asStartTag.normalName();
                    normalName.getClass();
                    char c6 = 65535;
                    switch (normalName.hashCode()) {
                        case -1644953643:
                            if (normalName.equals("frameset")) {
                                c6 = 0;
                                break;
                            }
                            break;
                        case 3213227:
                            if (normalName.equals("html")) {
                                c6 = 1;
                                break;
                            }
                            break;
                        case 97692013:
                            if (normalName.equals("frame")) {
                                c6 = 2;
                                break;
                            }
                            break;
                        case 1192721831:
                            if (normalName.equals("noframes")) {
                                c6 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c6) {
                        case 0:
                            htmlTreeBuilder.insertElementFor(asStartTag);
                            break;
                        case 1:
                            return htmlTreeBuilder.process(asStartTag, HtmlTreeBuilderState.InBody);
                        case 2:
                            htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                            break;
                        case 3:
                            return htmlTreeBuilder.process(asStartTag, HtmlTreeBuilderState.InHead);
                        default:
                            htmlTreeBuilder.error(this);
                            return false;
                    }
                } else if (token.isEndTag() && token.asEndTag().normalName().equals("frameset")) {
                    if (htmlTreeBuilder.currentElementIs("html")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.pop();
                    if (!htmlTreeBuilder.isFragmentParsing() && !htmlTreeBuilder.currentElementIs("frameset")) {
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterFrameset);
                    }
                } else {
                    if (!token.isEOF()) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (!htmlTreeBuilder.currentElementIs("html")) {
                        htmlTreeBuilder.error(this);
                    }
                }
            }
            return true;
        }
    },
    AfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.21
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEndTag() && token.asEndTag().normalName().equals("html")) {
                htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterAfterFrameset);
                return true;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("noframes")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
            }
            if (token.isEOF()) {
                return true;
            }
            htmlTreeBuilder.error(this);
            return false;
        }
    },
    AfterAfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.22
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype() || (token.isStartTag() && token.asStartTag().normalName().equals("html"))) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterToElement(token.asCharacter(), htmlTreeBuilder.getDocument());
                return true;
            }
            if (token.isEOF()) {
                return true;
            }
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.resetBody();
            return htmlTreeBuilder.process(token);
        }
    },
    AfterAfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.23
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype() || HtmlTreeBuilderState.isWhitespace(token) || (token.isStartTag() && token.asStartTag().normalName().equals("html"))) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEOF()) {
                return true;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("noframes")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
            }
            htmlTreeBuilder.error(this);
            return false;
        }
    },
    ForeignContent { // from class: org.jsoup.parser.HtmlTreeBuilderState.24
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            int i6 = AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()];
            if (i6 == 1) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
            } else if (i6 == 2) {
                htmlTreeBuilder.error(this);
            } else if (i6 == 3) {
                Token.StartTag asStartTag = token.asStartTag();
                if (StringUtil.in(asStartTag.normalName, Constants.InForeignToHtml)) {
                    return processAsHtml(token, htmlTreeBuilder);
                }
                if (asStartTag.normalName.equals("font") && (asStartTag.hasAttributeIgnoreCase("color") || asStartTag.hasAttributeIgnoreCase("face") || asStartTag.hasAttributeIgnoreCase("size"))) {
                    return processAsHtml(token, htmlTreeBuilder);
                }
                htmlTreeBuilder.insertForeignElementFor(asStartTag, htmlTreeBuilder.currentElement().tag().namespace());
            } else if (i6 == 4) {
                Token.EndTag asEndTag = token.asEndTag();
                if (asEndTag.normalName.equals(FlexmarkHtmlConverter.BR_NODE) || asEndTag.normalName.equals(FlexmarkHtmlConverter.P_NODE)) {
                    return processAsHtml(token, htmlTreeBuilder);
                }
                if (asEndTag.normalName.equals("script") && htmlTreeBuilder.currentElementIs("script", Parser.NamespaceSvg)) {
                    htmlTreeBuilder.pop();
                    return true;
                }
                ArrayList<Element> stack = htmlTreeBuilder.getStack();
                if (stack.isEmpty()) {
                    Validate.wtf("Stack unexpectedly empty");
                }
                int size = stack.size() - 1;
                Element element = stack.get(size);
                if (!element.nameIs(asEndTag.normalName)) {
                    htmlTreeBuilder.error(this);
                }
                while (size != 0) {
                    if (element.nameIs(asEndTag.normalName)) {
                        htmlTreeBuilder.popStackToCloseAnyNamespace(element.normalName());
                        return true;
                    }
                    size--;
                    element = stack.get(size);
                    if (element.tag().namespace().equals(Parser.NamespaceHtml)) {
                        return processAsHtml(token, htmlTreeBuilder);
                    }
                }
            } else if (i6 == 5) {
                Token.Character asCharacter = token.asCharacter();
                if (asCharacter.getData().equals(HtmlTreeBuilderState.nullString)) {
                    htmlTreeBuilder.error(this);
                } else if (HtmlTreeBuilderState.isWhitespace(asCharacter)) {
                    htmlTreeBuilder.insertCharacterNode(asCharacter);
                } else {
                    htmlTreeBuilder.insertCharacterNode(asCharacter);
                    htmlTreeBuilder.framesetOk(false);
                }
            }
            return true;
        }

        public boolean processAsHtml(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.state().process(token, htmlTreeBuilder);
        }
    };

    private static final String nullString = String.valueOf((char) 0);

    /* renamed from: org.jsoup.parser.HtmlTreeBuilderState$25, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass25 {
        static final /* synthetic */ int[] $SwitchMap$org$jsoup$parser$Token$TokenType;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            $SwitchMap$org$jsoup$parser$Token$TokenType = iArr;
            try {
                iArr[Token.TokenType.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Constants {
        static final String[] InHeadEmpty = {"base", "basefont", "bgsound", "command", "link"};
        static final String[] InHeadRaw = {"noframes", Attribute.STYLE_ATTR};
        static final String[] InHeadEnd = {"body", FlexmarkHtmlConverter.BR_NODE, "html"};
        static final String[] AfterHeadBody = {"body", FlexmarkHtmlConverter.BR_NODE, "html"};
        static final String[] BeforeHtmlToHead = {"body", FlexmarkHtmlConverter.BR_NODE, "head", "html"};
        static final String[] InHeadNoScriptHead = {"basefont", "bgsound", "link", "meta", "noframes", Attribute.STYLE_ATTR};
        static final String[] InBodyStartToHead = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", Attribute.STYLE_ATTR, "template", Attribute.TITLE_ATTR};
        static final String[] InBodyStartPClosers = {"address", "article", FlexmarkHtmlConverter.ASIDE_NODE, FlexmarkHtmlConverter.BLOCKQUOTE_NODE, "center", "details", "dir", FlexmarkHtmlConverter.DIV_NODE, FlexmarkHtmlConverter.DL_NODE, "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", FlexmarkHtmlConverter.OL_NODE, FlexmarkHtmlConverter.P_NODE, "section", "summary", FlexmarkHtmlConverter.UL_NODE};
        static final String[] Headings = {FlexmarkHtmlConverter.H1_NODE, FlexmarkHtmlConverter.H2_NODE, FlexmarkHtmlConverter.H3_NODE, FlexmarkHtmlConverter.H4_NODE, FlexmarkHtmlConverter.H5_NODE, FlexmarkHtmlConverter.H6_NODE};
        static final String[] InBodyStartLiBreakers = {"address", FlexmarkHtmlConverter.DIV_NODE, FlexmarkHtmlConverter.P_NODE};
        static final String[] DdDt = {FlexmarkHtmlConverter.DD_NODE, FlexmarkHtmlConverter.DT_NODE};
        static final String[] InBodyStartApplets = {"applet", "marquee", "object"};
        static final String[] InBodyStartMedia = {"param", "source", "track"};
        static final String[] InBodyStartInputAttribs = {"action", Attribute.NAME_ATTR, "prompt"};
        static final String[] InBodyStartDrop = {FlexmarkHtmlConverter.CAPTION_NODE, "col", "colgroup", "frame", "head", FlexmarkHtmlConverter.TBODY_NODE, FlexmarkHtmlConverter.TD_NODE, "tfoot", FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InBodyEndClosers = {"address", "article", FlexmarkHtmlConverter.ASIDE_NODE, FlexmarkHtmlConverter.BLOCKQUOTE_NODE, "button", "center", "details", "dir", FlexmarkHtmlConverter.DIV_NODE, FlexmarkHtmlConverter.DL_NODE, "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", FlexmarkHtmlConverter.OL_NODE, FlexmarkHtmlConverter.PRE_NODE, "section", "summary", FlexmarkHtmlConverter.UL_NODE};
        static final String[] InBodyEndOtherErrors = {"body", FlexmarkHtmlConverter.DD_NODE, FlexmarkHtmlConverter.DT_NODE, "html", FlexmarkHtmlConverter.LI_NODE, "optgroup", "option", FlexmarkHtmlConverter.P_NODE, "rb", "rp", "rt", "rtc", FlexmarkHtmlConverter.TBODY_NODE, FlexmarkHtmlConverter.TD_NODE, "tfoot", FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InBodyEndAdoptionFormatters = {FlexmarkHtmlConverter.A_NODE, FlexmarkHtmlConverter.B_NODE, "big", FlexmarkHtmlConverter.CODE_NODE, FlexmarkHtmlConverter.EM_NODE, "font", FlexmarkHtmlConverter.I_NODE, "nobr", "s", "small", FlexmarkHtmlConverter.STRIKE_NODE, FlexmarkHtmlConverter.STRONG_NODE, "tt", FlexmarkHtmlConverter.U_NODE};
        static final String[] InBodyEndTableFosters = {FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InTableToBody = {FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.THEAD_NODE};
        static final String[] InTableAddBody = {FlexmarkHtmlConverter.TD_NODE, FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InTableToHead = {"script", Attribute.STYLE_ATTR, "template"};
        static final String[] InCellNames = {FlexmarkHtmlConverter.TD_NODE, FlexmarkHtmlConverter.TH_NODE};
        static final String[] InCellBody = {"body", FlexmarkHtmlConverter.CAPTION_NODE, "col", "colgroup", "html"};
        static final String[] InCellTable = {FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InCellCol = {FlexmarkHtmlConverter.CAPTION_NODE, "col", "colgroup", FlexmarkHtmlConverter.TBODY_NODE, FlexmarkHtmlConverter.TD_NODE, "tfoot", FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InTableEndErr = {"body", FlexmarkHtmlConverter.CAPTION_NODE, "col", "colgroup", "html", FlexmarkHtmlConverter.TBODY_NODE, FlexmarkHtmlConverter.TD_NODE, "tfoot", FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InTableFoster = {FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InTableBodyExit = {FlexmarkHtmlConverter.CAPTION_NODE, "col", "colgroup", FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.THEAD_NODE};
        static final String[] InTableBodyEndIgnore = {"body", FlexmarkHtmlConverter.CAPTION_NODE, "col", "colgroup", "html", FlexmarkHtmlConverter.TD_NODE, FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InRowMissing = {FlexmarkHtmlConverter.CAPTION_NODE, "col", "colgroup", FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InRowIgnore = {"body", FlexmarkHtmlConverter.CAPTION_NODE, "col", "colgroup", "html", FlexmarkHtmlConverter.TD_NODE, FlexmarkHtmlConverter.TH_NODE};
        static final String[] InSelectEnd = {FlexmarkHtmlConverter.INPUT_NODE, "keygen", "textarea"};
        static final String[] InSelectTableEnd = {FlexmarkHtmlConverter.CAPTION_NODE, FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.TBODY_NODE, FlexmarkHtmlConverter.TD_NODE, "tfoot", FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InTableEndIgnore = {FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.THEAD_NODE};
        static final String[] InHeadNoscriptIgnore = {"head", "noscript"};
        static final String[] InCaptionIgnore = {"body", "col", "colgroup", "html", FlexmarkHtmlConverter.TBODY_NODE, FlexmarkHtmlConverter.TD_NODE, "tfoot", FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
        static final String[] InTemplateToHead = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", Attribute.STYLE_ATTR, "template", Attribute.TITLE_ATTR};
        static final String[] InTemplateToTable = {FlexmarkHtmlConverter.CAPTION_NODE, "colgroup", FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.THEAD_NODE};
        static final String[] InForeignToHtml = {FlexmarkHtmlConverter.B_NODE, "big", FlexmarkHtmlConverter.BLOCKQUOTE_NODE, "body", FlexmarkHtmlConverter.BR_NODE, "center", FlexmarkHtmlConverter.CODE_NODE, FlexmarkHtmlConverter.DD_NODE, FlexmarkHtmlConverter.DIV_NODE, FlexmarkHtmlConverter.DL_NODE, FlexmarkHtmlConverter.DT_NODE, FlexmarkHtmlConverter.EM_NODE, "embed", FlexmarkHtmlConverter.H1_NODE, FlexmarkHtmlConverter.H2_NODE, FlexmarkHtmlConverter.H3_NODE, FlexmarkHtmlConverter.H4_NODE, FlexmarkHtmlConverter.H5_NODE, FlexmarkHtmlConverter.H6_NODE, "head", FlexmarkHtmlConverter.HR_NODE, FlexmarkHtmlConverter.I_NODE, FlexmarkHtmlConverter.IMG_NODE, FlexmarkHtmlConverter.LI_NODE, "listing", "menu", "meta", "nobr", FlexmarkHtmlConverter.OL_NODE, FlexmarkHtmlConverter.P_NODE, FlexmarkHtmlConverter.PRE_NODE, "ruby", "s", "small", FlexmarkHtmlConverter.SPAN_NODE, FlexmarkHtmlConverter.STRIKE_NODE, FlexmarkHtmlConverter.STRONG_NODE, FlexmarkHtmlConverter.SUB_NODE, FlexmarkHtmlConverter.SUP_NODE, FlexmarkHtmlConverter.TABLE_NODE, "tt", FlexmarkHtmlConverter.U_NODE, FlexmarkHtmlConverter.UL_NODE, "var"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRawtext(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.tokeniser.transition(TokeniserState.Rawtext);
        htmlTreeBuilder.markInsertionMode();
        htmlTreeBuilder.transition(Text);
        htmlTreeBuilder.insertElementFor(startTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRcData(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.tokeniser.transition(TokeniserState.Rcdata);
        htmlTreeBuilder.markInsertionMode();
        htmlTreeBuilder.transition(Text);
        htmlTreeBuilder.insertElementFor(startTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(Token token) {
        if (token.isCharacter()) {
            return StringUtil.isBlank(token.asCharacter().getData());
        }
        return false;
    }

    public abstract boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder);
}
