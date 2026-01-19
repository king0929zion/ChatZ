package org.jsoup;

import java.io.IOException;

/* loaded from: classes.dex */
public class UncheckedIOException extends java.io.UncheckedIOException {
    public UncheckedIOException(IOException iOException) {
        super(iOException);
    }

    public IOException ioException() {
        return getCause();
    }

    public UncheckedIOException(String str) {
        super(new IOException(str));
    }
}
