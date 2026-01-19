package com.vladsch.flexmark.util.misc;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.List;
import java.util.Stack;

/* loaded from: classes.dex */
public class DelimitedBuilder {
    private String delimiter;
    private Stack<String> delimiterStack;
    private int lastLen;
    private StringBuilder out;
    private boolean pending;

    public DelimitedBuilder() {
        this(",", 0);
    }

    private void doPending() {
        if (this.out == null) {
            this.out = new StringBuilder();
        }
        if (this.pending) {
            this.out.append(this.delimiter);
            this.pending = false;
        }
    }

    public DelimitedBuilder append(char c6) {
        doPending();
        this.out.append(c6);
        return this;
    }

    public <V> DelimitedBuilder appendAll(V[] vArr) {
        return appendAll(vArr, 0, vArr.length);
    }

    public DelimitedBuilder appendCodePoint(int i6) {
        doPending();
        this.out.appendCodePoint(i6);
        return this;
    }

    public DelimitedBuilder clear() {
        this.out = null;
        unmark();
        return this;
    }

    public String getAndClear() {
        Stack<String> stack = this.delimiterStack;
        if (stack != null && !stack.isEmpty()) {
            throw new IllegalStateException("Delimiter stack is not empty");
        }
        StringBuilder sb = this.out;
        String sb2 = sb == null ? FlexmarkHtmlConverter.DEFAULT_NODE : sb.toString();
        clear();
        return sb2;
    }

    public boolean isEmpty() {
        if (this.pending) {
            return false;
        }
        StringBuilder sb = this.out;
        return sb == null || sb.length() == 0;
    }

    public DelimitedBuilder mark() {
        StringBuilder sb = this.out;
        int length = sb != null ? sb.length() : 0;
        if (this.lastLen != length) {
            this.pending = true;
        }
        this.lastLen = length;
        return this;
    }

    public DelimitedBuilder pop() {
        Stack<String> stack = this.delimiterStack;
        if (stack == null || stack.isEmpty()) {
            throw new IllegalStateException("Nothing on the delimiter stack");
        }
        this.delimiter = this.delimiterStack.pop();
        return this;
    }

    public DelimitedBuilder push() {
        return push(this.delimiter);
    }

    public String toString() {
        Stack<String> stack = this.delimiterStack;
        if (stack != null && !stack.isEmpty()) {
            throw new IllegalStateException("Delimiter stack is not empty");
        }
        StringBuilder sb = this.out;
        return sb == null ? FlexmarkHtmlConverter.DEFAULT_NODE : sb.toString();
    }

    public String toStringOrNull() {
        Stack<String> stack = this.delimiterStack;
        if (stack != null && !stack.isEmpty()) {
            throw new IllegalStateException("Delimiter stack is not empty");
        }
        StringBuilder sb = this.out;
        if (sb == null) {
            return null;
        }
        return sb.toString();
    }

    public DelimitedBuilder unmark() {
        this.pending = false;
        StringBuilder sb = this.out;
        this.lastLen = sb != null ? sb.length() : 0;
        return this;
    }

    public DelimitedBuilder(String str) {
        this(str, 0);
    }

    public <V> DelimitedBuilder appendAll(V[] vArr, int i6, int i7) {
        while (i6 < i7) {
            append(vArr[i6].toString());
            mark();
            i6++;
        }
        return this;
    }

    public DelimitedBuilder push(String str) {
        unmark();
        if (this.delimiterStack == null) {
            this.delimiterStack = new Stack<>();
        }
        this.delimiterStack.push(this.delimiter);
        this.delimiter = str;
        return this;
    }

    public DelimitedBuilder(String str, int i6) {
        this.pending = false;
        this.lastLen = 0;
        this.delimiterStack = null;
        this.delimiter = str;
        this.out = i6 != 0 ? new StringBuilder(i6) : null;
    }

    public DelimitedBuilder append(int i6) {
        doPending();
        this.out.append(i6);
        return this;
    }

    public DelimitedBuilder append(boolean z5) {
        doPending();
        this.out.append(z5);
        return this;
    }

    public <V> DelimitedBuilder appendAll(String str, V[] vArr) {
        return appendAll(str, vArr, 0, vArr.length);
    }

    public <V> DelimitedBuilder appendAll(String str, V[] vArr, int i6, int i7) {
        StringBuilder sb = this.out;
        int length = sb != null ? sb.length() : 0;
        push(str);
        appendAll(vArr, i6, i7);
        pop();
        StringBuilder sb2 = this.out;
        if (length != (sb2 != null ? sb2.length() : 0)) {
            mark();
            return this;
        }
        unmark();
        return this;
    }

    public DelimitedBuilder append(long j3) {
        doPending();
        this.out.append(j3);
        return this;
    }

    public DelimitedBuilder append(float f6) {
        doPending();
        this.out.append(f6);
        return this;
    }

    public DelimitedBuilder append(double d6) {
        doPending();
        this.out.append(d6);
        return this;
    }

    public <V> DelimitedBuilder appendAll(List<? extends V> list) {
        return appendAll(list, 0, list.size());
    }

    public DelimitedBuilder append(String str) {
        if (str != null && !str.isEmpty()) {
            doPending();
            this.out.append(str);
        }
        return this;
    }

    public <V> DelimitedBuilder appendAll(List<? extends V> list, int i6, int i7) {
        while (i6 < i7) {
            append(list.get(i6).toString());
            mark();
            i6++;
        }
        return this;
    }

    public DelimitedBuilder append(String str, int i6, int i7) {
        if (str != null && i6 < i7) {
            doPending();
            this.out.append((CharSequence) str, i6, i7);
        }
        return this;
    }

    public <V> DelimitedBuilder appendAll(String str, List<? extends V> list) {
        return appendAll(str, list, 0, list.size());
    }

    public <V> DelimitedBuilder appendAll(String str, List<? extends V> list, int i6, int i7) {
        StringBuilder sb = this.out;
        int length = sb != null ? sb.length() : 0;
        push(str);
        appendAll(list, i6, i7);
        pop();
        StringBuilder sb2 = this.out;
        if (length != (sb2 != null ? sb2.length() : 0)) {
            mark();
            return this;
        }
        unmark();
        return this;
    }

    public DelimitedBuilder append(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            doPending();
            this.out.append(charSequence);
        }
        return this;
    }

    public DelimitedBuilder append(CharSequence charSequence, int i6, int i7) {
        if (charSequence != null && i6 < i7) {
            doPending();
            this.out.append(charSequence, i6, i7);
        }
        return this;
    }

    public DelimitedBuilder append(char[] cArr) {
        if (cArr.length > 0) {
            doPending();
            this.out.append(cArr);
        }
        return this;
    }

    public DelimitedBuilder append(char[] cArr, int i6, int i7) {
        if (i6 < i7) {
            doPending();
            this.out.append(cArr, i6, i7);
        }
        return this;
    }

    public DelimitedBuilder append(Object obj) {
        return append(obj.toString());
    }
}
