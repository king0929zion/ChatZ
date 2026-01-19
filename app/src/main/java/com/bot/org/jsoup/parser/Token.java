package org.jsoup.parser;

import B3.e;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.SharedConstants;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Range;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class Token {
    static final int Unset = -1;
    private int endPos;
    private int startPos;
    final TokenType type;

    /* loaded from: classes.dex */
    public static final class CData extends Character {
        public CData(String str) {
            data(str);
        }

        @Override // org.jsoup.parser.Token.Character
        public String toString() {
            return e.s(new StringBuilder("<![CDATA["), getData(), "]]>");
        }
    }

    /* loaded from: classes.dex */
    public static class Character extends Token implements Cloneable {
        private String data;

        public Character() {
            super(TokenType.Character);
        }

        public Character data(String str) {
            this.data = str;
            return this;
        }

        public String getData() {
            return this.data;
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            super.reset();
            this.data = null;
            return this;
        }

        public String toString() {
            return getData();
        }

        public Character clone() {
            try {
                return (Character) super.clone();
            } catch (CloneNotSupportedException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Doctype extends Token {
        boolean forceQuirks;
        final StringBuilder name;
        String pubSysKey;
        final StringBuilder publicIdentifier;
        final StringBuilder systemIdentifier;

        public Doctype() {
            super(TokenType.Doctype);
            this.name = new StringBuilder();
            this.pubSysKey = null;
            this.publicIdentifier = new StringBuilder();
            this.systemIdentifier = new StringBuilder();
            this.forceQuirks = false;
        }

        public String getName() {
            return this.name.toString();
        }

        public String getPubSysKey() {
            return this.pubSysKey;
        }

        public String getPublicIdentifier() {
            return this.publicIdentifier.toString();
        }

        public String getSystemIdentifier() {
            return this.systemIdentifier.toString();
        }

        public boolean isForceQuirks() {
            return this.forceQuirks;
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            super.reset();
            Token.reset(this.name);
            this.pubSysKey = null;
            Token.reset(this.publicIdentifier);
            Token.reset(this.systemIdentifier);
            this.forceQuirks = false;
            return this;
        }

        public String toString() {
            return e.s(new StringBuilder("<!doctype "), getName(), ">");
        }
    }

    /* loaded from: classes.dex */
    public static final class EOF extends Token {
        public EOF() {
            super(TokenType.EOF);
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            super.reset();
            return this;
        }

        public String toString() {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
    }

    /* loaded from: classes.dex */
    public static final class EndTag extends Tag {
        public EndTag(TreeBuilder treeBuilder) {
            super(TokenType.EndTag, treeBuilder);
        }

        @Override // org.jsoup.parser.Token.Tag
        public String toString() {
            return e.s(new StringBuilder("</"), toStringName(), ">");
        }
    }

    /* loaded from: classes.dex */
    public static final class StartTag extends Tag {
        public StartTag(TreeBuilder treeBuilder) {
            super(TokenType.StartTag, treeBuilder);
        }

        public StartTag nameAttr(String str, Attributes attributes) {
            this.tagName = str;
            this.attributes = attributes;
            this.normalName = ParseSettings.normalName(str);
            return this;
        }

        @Override // org.jsoup.parser.Token.Tag
        public String toString() {
            String str = isSelfClosing() ? "/>" : ">";
            if (!hasAttributes() || this.attributes.size() <= 0) {
                return e.s(new StringBuilder("<"), toStringName(), str);
            }
            return "<" + toStringName() + SequenceUtils.SPACE + this.attributes.toString() + str;
        }

        @Override // org.jsoup.parser.Token.Tag, org.jsoup.parser.Token
        public Tag reset() {
            super.reset();
            this.attributes = null;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Tag extends Token {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final int MaxAttributes = 512;
        private String attrName;
        int attrNameEnd;
        private final StringBuilder attrNameSb;
        int attrNameStart;
        int attrValEnd;
        int attrValStart;
        private String attrValue;
        private final StringBuilder attrValueSb;
        Attributes attributes;
        private boolean hasAttrName;
        private boolean hasAttrValue;
        private boolean hasEmptyAttrValue;
        protected String normalName;
        boolean selfClosing;
        protected String tagName;
        final boolean trackSource;
        final TreeBuilder treeBuilder;

        public Tag(TokenType tokenType, TreeBuilder treeBuilder) {
            super(tokenType);
            this.selfClosing = false;
            this.attrNameSb = new StringBuilder();
            this.hasAttrName = false;
            this.attrValueSb = new StringBuilder();
            this.hasAttrValue = false;
            this.hasEmptyAttrValue = false;
            this.treeBuilder = treeBuilder;
            this.trackSource = treeBuilder.trackSourceRange;
        }

        private void ensureAttrName(int i6, int i7) {
            this.hasAttrName = true;
            String str = this.attrName;
            if (str != null) {
                this.attrNameSb.append(str);
                this.attrName = null;
            }
            if (this.trackSource) {
                int i8 = this.attrNameStart;
                if (i8 > -1) {
                    i6 = i8;
                }
                this.attrNameStart = i6;
                this.attrNameEnd = i7;
            }
        }

        private void ensureAttrValue(int i6, int i7) {
            this.hasAttrValue = true;
            String str = this.attrValue;
            if (str != null) {
                this.attrValueSb.append(str);
                this.attrValue = null;
            }
            if (this.trackSource) {
                int i8 = this.attrValStart;
                if (i8 > -1) {
                    i6 = i8;
                }
                this.attrValStart = i6;
                this.attrValEnd = i7;
            }
        }

        private void resetPendingAttr() {
            Token.reset(this.attrNameSb);
            this.attrName = null;
            this.hasAttrName = false;
            Token.reset(this.attrValueSb);
            this.attrValue = null;
            this.hasEmptyAttrValue = false;
            this.hasAttrValue = false;
            if (this.trackSource) {
                this.attrValEnd = -1;
                this.attrValStart = -1;
                this.attrNameEnd = -1;
                this.attrNameStart = -1;
            }
        }

        private void trackAttributeRange(String str) {
            if (this.trackSource && isStartTag()) {
                TreeBuilder treeBuilder = asStartTag().treeBuilder;
                CharacterReader characterReader = treeBuilder.reader;
                boolean preserveAttributeCase = treeBuilder.settings.preserveAttributeCase();
                Map map = (Map) this.attributes.userData(SharedConstants.AttrRangeKey);
                if (map == null) {
                    map = new HashMap();
                    this.attributes.userData(SharedConstants.AttrRangeKey, map);
                }
                if (!preserveAttributeCase) {
                    str = Normalizer.lowerCase(str);
                }
                if (map.containsKey(str)) {
                    return;
                }
                if (!this.hasAttrValue) {
                    int i6 = this.attrNameEnd;
                    this.attrValEnd = i6;
                    this.attrValStart = i6;
                }
                int i7 = this.attrNameStart;
                Range.Position position = new Range.Position(i7, characterReader.lineNumber(i7), characterReader.columnNumber(this.attrNameStart));
                int i8 = this.attrNameEnd;
                Range range = new Range(position, new Range.Position(i8, characterReader.lineNumber(i8), characterReader.columnNumber(this.attrNameEnd)));
                int i9 = this.attrValStart;
                Range.Position position2 = new Range.Position(i9, characterReader.lineNumber(i9), characterReader.columnNumber(this.attrValStart));
                int i10 = this.attrValEnd;
                map.put(str, new Range.AttributeRange(range, new Range(position2, new Range.Position(i10, characterReader.lineNumber(i10), characterReader.columnNumber(this.attrValEnd)))));
            }
        }

        public final void appendAttributeName(String str, int i6, int i7) {
            String replace = str.replace((char) 0, SequenceUtils.ENC_NUL);
            ensureAttrName(i6, i7);
            if (this.attrNameSb.length() == 0) {
                this.attrName = replace;
            } else {
                this.attrNameSb.append(replace);
            }
        }

        public final void appendAttributeValue(String str, int i6, int i7) {
            ensureAttrValue(i6, i7);
            if (this.attrValueSb.length() == 0) {
                this.attrValue = str;
            } else {
                this.attrValueSb.append(str);
            }
        }

        public final void appendTagName(String str) {
            String replace = str.replace((char) 0, SequenceUtils.ENC_NUL);
            String str2 = this.tagName;
            if (str2 != null) {
                replace = str2.concat(replace);
            }
            this.tagName = replace;
            this.normalName = ParseSettings.normalName(replace);
        }

        public final void finaliseTag() {
            if (this.hasAttrName) {
                newAttribute();
            }
        }

        public final boolean hasAttribute(String str) {
            Attributes attributes = this.attributes;
            return attributes != null && attributes.hasKey(str);
        }

        public final boolean hasAttributeIgnoreCase(String str) {
            Attributes attributes = this.attributes;
            return attributes != null && attributes.hasKeyIgnoreCase(str);
        }

        public final boolean hasAttributes() {
            return this.attributes != null;
        }

        public final boolean isSelfClosing() {
            return this.selfClosing;
        }

        public final String name() {
            String str = this.tagName;
            Validate.isFalse(str == null || str.length() == 0);
            return this.tagName;
        }

        public final void newAttribute() {
            if (this.attributes == null) {
                this.attributes = new Attributes();
            }
            if (this.hasAttrName && this.attributes.size() < 512) {
                String trim = (this.attrNameSb.length() > 0 ? this.attrNameSb.toString() : this.attrName).trim();
                if (trim.length() > 0) {
                    this.attributes.add(trim, this.hasAttrValue ? this.attrValueSb.length() > 0 ? this.attrValueSb.toString() : this.attrValue : this.hasEmptyAttrValue ? FlexmarkHtmlConverter.DEFAULT_NODE : null);
                    trackAttributeRange(trim);
                }
            }
            resetPendingAttr();
        }

        public final String normalName() {
            return this.normalName;
        }

        public final void setEmptyAttributeValue() {
            this.hasEmptyAttrValue = true;
        }

        public abstract String toString();

        public final String toStringName() {
            String str = this.tagName;
            return str != null ? str : "[unset]";
        }

        @Override // org.jsoup.parser.Token
        public Tag reset() {
            super.reset();
            this.tagName = null;
            this.normalName = null;
            this.selfClosing = false;
            this.attributes = null;
            resetPendingAttr();
            return this;
        }

        public final Tag name(String str) {
            this.tagName = str;
            this.normalName = ParseSettings.normalName(str);
            return this;
        }

        public final void appendTagName(char c6) {
            appendTagName(String.valueOf(c6));
        }

        public final void appendAttributeValue(char c6, int i6, int i7) {
            ensureAttrValue(i6, i7);
            this.attrValueSb.append(c6);
        }

        public final void appendAttributeName(char c6, int i6, int i7) {
            ensureAttrName(i6, i7);
            this.attrNameSb.append(c6);
        }

        public final void appendAttributeValue(int[] iArr, int i6, int i7) {
            ensureAttrValue(i6, i7);
            for (int i8 : iArr) {
                this.attrValueSb.appendCodePoint(i8);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    public final Character asCharacter() {
        return (Character) this;
    }

    public final Comment asComment() {
        return (Comment) this;
    }

    public final Doctype asDoctype() {
        return (Doctype) this;
    }

    public final EndTag asEndTag() {
        return (EndTag) this;
    }

    public final StartTag asStartTag() {
        return (StartTag) this;
    }

    public int endPos() {
        return this.endPos;
    }

    public final boolean isCData() {
        return this instanceof CData;
    }

    public final boolean isCharacter() {
        return this.type == TokenType.Character;
    }

    public final boolean isComment() {
        return this.type == TokenType.Comment;
    }

    public final boolean isDoctype() {
        return this.type == TokenType.Doctype;
    }

    public final boolean isEOF() {
        return this.type == TokenType.EOF;
    }

    public final boolean isEndTag() {
        return this.type == TokenType.EndTag;
    }

    public final boolean isStartTag() {
        return this.type == TokenType.StartTag;
    }

    public Token reset() {
        this.startPos = -1;
        this.endPos = -1;
        return this;
    }

    public int startPos() {
        return this.startPos;
    }

    public String tokenType() {
        return getClass().getSimpleName();
    }

    private Token(TokenType tokenType) {
        this.endPos = -1;
        this.type = tokenType;
    }

    public void endPos(int i6) {
        this.endPos = i6;
    }

    public void startPos(int i6) {
        this.startPos = i6;
    }

    public static void reset(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* loaded from: classes.dex */
    public static final class Comment extends Token {
        boolean bogus;
        private final StringBuilder data;
        private String dataS;

        public Comment() {
            super(TokenType.Comment);
            this.data = new StringBuilder();
            this.bogus = false;
        }

        private void ensureData() {
            String str = this.dataS;
            if (str != null) {
                this.data.append(str);
                this.dataS = null;
            }
        }

        public Comment append(String str) {
            ensureData();
            if (this.data.length() == 0) {
                this.dataS = str;
                return this;
            }
            this.data.append(str);
            return this;
        }

        public String getData() {
            String str = this.dataS;
            return str != null ? str : this.data.toString();
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            super.reset();
            Token.reset(this.data);
            this.dataS = null;
            this.bogus = false;
            return this;
        }

        public String toString() {
            return e.s(new StringBuilder("<!--"), getData(), "-->");
        }

        public Comment append(char c6) {
            ensureData();
            this.data.append(c6);
            return this;
        }
    }
}
