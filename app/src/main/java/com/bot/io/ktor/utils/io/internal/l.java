package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class l {
    public final ByteBuffer a;

    /* renamed from: b, reason: collision with root package name */
    public final n f12184b;

    public l(ByteBuffer byteBuffer, n nVar) {
        this.a = byteBuffer;
        this.f12184b = nVar;
    }

    public ByteBuffer a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    public ByteBuffer b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public l c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public l d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public l e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public l f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }
}
