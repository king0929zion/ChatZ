package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f12175c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f12176d;

    /* renamed from: e, reason: collision with root package name */
    public final h f12177e;

    /* renamed from: f, reason: collision with root package name */
    public final j f12178f;

    /* renamed from: g, reason: collision with root package name */
    public final j f12179g;

    /* renamed from: h, reason: collision with root package name */
    public final j f12180h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ByteBuffer byteBuffer, int i6) {
        super(byteBuffer, new n(byteBuffer.capacity() - i6));
        AbstractC1276k.f(byteBuffer, "backingBuffer");
        if (byteBuffer.position() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (byteBuffer.limit() != byteBuffer.capacity()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        AbstractC1276k.e(duplicate, "backingBuffer.duplicate()");
        this.f12175c = duplicate;
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        AbstractC1276k.e(duplicate2, "backingBuffer.duplicate()");
        this.f12176d = duplicate2;
        this.f12177e = new h(this);
        this.f12178f = new j(this, 0);
        this.f12179g = new j(this, 2);
        this.f12180h = new j(this, 1);
    }

    @Override // io.ktor.utils.io.internal.l
    public final ByteBuffer a() {
        return this.f12176d;
    }

    @Override // io.ktor.utils.io.internal.l
    public final ByteBuffer b() {
        return this.f12175c;
    }

    @Override // io.ktor.utils.io.internal.l
    public final l c() {
        return this.f12178f;
    }

    @Override // io.ktor.utils.io.internal.l
    public final l d() {
        return this.f12179g;
    }

    public final String toString() {
        return "Initial";
    }
}
