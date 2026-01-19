package com.vladsch.flexmark.formatter.internal;

import com.vladsch.flexmark.ast.HtmlCommentBlock;
import com.vladsch.flexmark.ast.HtmlInnerBlockComment;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.formatter.FormatterOptions;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public class FormatControlProcessor {
    public static final String CLOSE_COMMENT = "-->";
    public static final String OPEN_COMMENT = "<!--";
    private volatile Pattern formatterOffPattern;
    private final String formatterOffTag;
    private volatile Pattern formatterOnPattern;
    private final String formatterOnTag;
    private boolean formatterTagsAcceptRegexp;
    private final boolean formatterTagsEnabled;
    private boolean myFormatterOff = false;
    private boolean justTurnedOffFormatting = false;
    private boolean justTurnedOnFormatting = false;

    public FormatControlProcessor(Document document, DataHolder dataHolder) {
        FormatterOptions formatterOptions = new FormatterOptions(dataHolder);
        this.formatterOnTag = formatterOptions.formatterOnTag;
        this.formatterOffTag = formatterOptions.formatterOffTag;
        this.formatterTagsEnabled = formatterOptions.formatterTagsEnabled;
        this.formatterTagsAcceptRegexp = formatterOptions.formatterTagsAcceptRegexp;
    }

    private Pattern getPatternOrDisableRegexp(String str) {
        try {
            return Pattern.compile(str);
        } catch (PatternSyntaxException unused) {
            this.formatterTagsAcceptRegexp = false;
            return null;
        }
    }

    private Boolean isFormatterOffTag(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String trim = charSequence.toString().trim().substring(4, r4.length() - 3).trim();
        if (!this.formatterTagsAcceptRegexp || this.formatterOffPattern == null || this.formatterOnPattern == null) {
            if (this.formatterTagsEnabled) {
                if (trim.equals(this.formatterOnTag)) {
                    return Boolean.FALSE;
                }
                if (trim.equals(this.formatterOffTag)) {
                    return Boolean.TRUE;
                }
            }
        } else {
            if (this.formatterOnPattern.matcher(trim).matches()) {
                return Boolean.FALSE;
            }
            if (this.formatterOffPattern.matcher(trim).matches()) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    public Pattern getFormatterOffPattern() {
        if (this.formatterOffPattern == null && this.formatterTagsEnabled && this.formatterTagsAcceptRegexp) {
            this.formatterOffPattern = getPatternOrDisableRegexp(this.formatterOffTag);
        }
        return this.formatterOffPattern;
    }

    public String getFormatterOffTag() {
        return this.formatterOffTag;
    }

    public Pattern getFormatterOnPattern() {
        if (this.formatterOffPattern == null && this.formatterTagsEnabled && this.formatterTagsAcceptRegexp) {
            this.formatterOnPattern = getPatternOrDisableRegexp(this.formatterOnTag);
        }
        return this.formatterOnPattern;
    }

    public String getFormatterOnTag() {
        return this.formatterOnTag;
    }

    public boolean getFormatterRegExEnabled() {
        return this.formatterTagsAcceptRegexp;
    }

    public boolean getFormatterTagsEnabled() {
        return this.formatterTagsEnabled;
    }

    public void initializeFrom(Node node) {
        this.myFormatterOff = !isFormattingRegion(node.getStartOffset(), node, true);
    }

    public boolean isFormattingOff() {
        return this.myFormatterOff;
    }

    public boolean isFormattingRegion() {
        return !this.myFormatterOff;
    }

    public boolean isJustTurnedOffFormatting() {
        return this.justTurnedOffFormatting;
    }

    public boolean isJustTurnedOnFormatting() {
        return this.justTurnedOnFormatting;
    }

    public void processFormatControl(Node node) {
        this.justTurnedOffFormatting = false;
        this.justTurnedOnFormatting = false;
        if (((node instanceof HtmlCommentBlock) || (node instanceof HtmlInnerBlockComment)) && this.formatterTagsEnabled) {
            boolean z5 = this.myFormatterOff;
            Boolean isFormatterOffTag = isFormatterOffTag(node.getChars());
            if (isFormatterOffTag == null) {
                return;
            }
            boolean booleanValue = isFormatterOffTag.booleanValue();
            this.myFormatterOff = booleanValue;
            if (!z5 && booleanValue) {
                this.justTurnedOffFormatting = true;
            }
            if (!z5 || booleanValue) {
                return;
            }
            this.justTurnedOnFormatting = true;
        }
    }

    private boolean isFormattingRegion(int i6, Node node, boolean z5) {
        Boolean isFormatterOffTag;
        while (node != null) {
            if (node.getStartOffset() <= i6) {
                if ((node instanceof Block) && !(node instanceof Paragraph) && node.hasChildren()) {
                    Node lastChild = node.getLastChild();
                    return lastChild != null && isFormattingRegion(i6, lastChild, false);
                }
                if (((node instanceof HtmlCommentBlock) || (node instanceof HtmlInnerBlockComment)) && (isFormatterOffTag = isFormatterOffTag(node.getChars())) != null) {
                    return !isFormatterOffTag.booleanValue();
                }
            }
            if (node.getPrevious() == null && z5) {
                node = node.getParent();
                if (node instanceof Document) {
                    break;
                }
                if (node != null) {
                    node = node.getPrevious();
                }
            } else {
                node = node.getPrevious();
            }
        }
        return true;
    }

    public boolean isFormattingRegion(Node node) {
        if (!this.formatterTagsEnabled || node.getStartOffset() == 0) {
            return true;
        }
        return isFormattingRegion(node.getStartOffset(), node, true);
    }
}
