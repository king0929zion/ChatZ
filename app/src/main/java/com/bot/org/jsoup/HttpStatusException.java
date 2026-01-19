package org.jsoup;

import java.io.IOException;

/* loaded from: classes.dex */
public class HttpStatusException extends IOException {
    private final int statusCode;
    private final String url;

    public HttpStatusException(String str, int i6, String str2) {
        super(str + ". Status=" + i6 + ", URL=[" + str2 + "]");
        this.statusCode = i6;
        this.url = str2;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getUrl() {
        return this.url;
    }
}
