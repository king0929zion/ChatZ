package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public abstract class LinkNodeBase extends Node {
    protected BasedSequence anchorMarker;
    protected BasedSequence anchorRef;
    protected BasedSequence pageRef;
    protected BasedSequence title;
    protected BasedSequence titleClosingMarker;
    protected BasedSequence titleOpeningMarker;
    protected BasedSequence url;
    protected BasedSequence urlClosingMarker;
    protected BasedSequence urlOpeningMarker;

    public LinkNodeBase() {
        BasedSequence basedSequence = BasedSequence.NULL;
        this.urlOpeningMarker = basedSequence;
        this.url = basedSequence;
        this.pageRef = basedSequence;
        this.anchorMarker = basedSequence;
        this.anchorRef = basedSequence;
        this.urlClosingMarker = basedSequence;
        this.titleOpeningMarker = basedSequence;
        this.title = basedSequence;
        this.titleClosingMarker = basedSequence;
    }

    public BasedSequence getAnchorMarker() {
        return this.anchorMarker;
    }

    public BasedSequence getAnchorRef() {
        return this.anchorRef;
    }

    public BasedSequence getPageRef() {
        return this.pageRef;
    }

    public BasedSequence getTitle() {
        return this.title;
    }

    public BasedSequence getTitleClosingMarker() {
        return this.titleClosingMarker;
    }

    public BasedSequence getTitleOpeningMarker() {
        return this.titleOpeningMarker;
    }

    public BasedSequence getUrl() {
        return this.url;
    }

    public BasedSequence getUrlClosingMarker() {
        return this.urlClosingMarker;
    }

    public BasedSequence getUrlOpeningMarker() {
        return this.urlOpeningMarker;
    }

    public void setAnchorMarker(BasedSequence basedSequence) {
        this.anchorMarker = basedSequence;
    }

    public void setAnchorRef(BasedSequence basedSequence) {
        this.anchorRef = basedSequence;
    }

    public void setPageRef(BasedSequence basedSequence) {
        this.pageRef = basedSequence;
    }

    public void setTitle(BasedSequence basedSequence) {
        this.title = basedSequence;
    }

    public void setTitleChars(BasedSequence basedSequence) {
        if (basedSequence == null || basedSequence == BasedSequence.NULL) {
            BasedSequence basedSequence2 = BasedSequence.NULL;
            this.titleOpeningMarker = basedSequence2;
            this.title = basedSequence2;
            this.titleClosingMarker = basedSequence2;
            return;
        }
        int length = basedSequence.length();
        this.titleOpeningMarker = basedSequence.subSequence(0, 1);
        int i6 = length - 1;
        this.title = basedSequence.subSequence(1, i6);
        this.titleClosingMarker = basedSequence.subSequence(i6, length);
    }

    public void setTitleClosingMarker(BasedSequence basedSequence) {
        this.titleClosingMarker = basedSequence;
    }

    public void setTitleOpeningMarker(BasedSequence basedSequence) {
        this.titleOpeningMarker = basedSequence;
    }

    public void setUrl(BasedSequence basedSequence) {
        this.url = basedSequence;
    }

    public void setUrlChars(BasedSequence basedSequence) {
        if (basedSequence == null || basedSequence == BasedSequence.NULL) {
            BasedSequence basedSequence2 = BasedSequence.NULL;
            this.urlOpeningMarker = basedSequence2;
            this.url = basedSequence2;
            this.urlClosingMarker = basedSequence2;
            return;
        }
        if (basedSequence.startsWith("<") && basedSequence.endsWith(">")) {
            this.urlOpeningMarker = basedSequence.subSequence(0, 1);
            this.url = basedSequence.subSequence(1, basedSequence.length() - 1);
            this.urlClosingMarker = basedSequence.subSequence(basedSequence.length() - 1);
        } else {
            this.url = basedSequence;
        }
        int indexOf = this.url.indexOf('#');
        if (indexOf < 0) {
            this.pageRef = this.url;
            return;
        }
        this.pageRef = this.url.subSequence(0, indexOf);
        int i6 = indexOf + 1;
        this.anchorMarker = this.url.subSequence(indexOf, i6);
        this.anchorRef = this.url.subSequence(i6);
    }

    public void setUrlClosingMarker(BasedSequence basedSequence) {
        this.urlClosingMarker = basedSequence;
    }

    public void setUrlOpeningMarker(BasedSequence basedSequence) {
        this.urlOpeningMarker = basedSequence;
    }

    public LinkNodeBase(BasedSequence basedSequence) {
        super(basedSequence);
        BasedSequence basedSequence2 = BasedSequence.NULL;
        this.urlOpeningMarker = basedSequence2;
        this.url = basedSequence2;
        this.pageRef = basedSequence2;
        this.anchorMarker = basedSequence2;
        this.anchorRef = basedSequence2;
        this.urlClosingMarker = basedSequence2;
        this.titleOpeningMarker = basedSequence2;
        this.title = basedSequence2;
        this.titleClosingMarker = basedSequence2;
    }
}
