package io.ktor.utils.io.internal;

import com.vladsch.flexmark.parser.PegdownExtensions;
import i1.AbstractC1087g;

/* loaded from: classes.dex */
public abstract class f {
    public static final int a;

    /* renamed from: b, reason: collision with root package name */
    public static final W3.d f12170b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f12171c;

    /* renamed from: d, reason: collision with root package name */
    public static final V3.a f12172d;

    /* JADX WARN: Type inference failed for: r0v2, types: [io.ktor.utils.io.internal.e, W3.c] */
    static {
        int k3 = AbstractC1087g.k(4096, "BufferSize");
        a = k3;
        int k5 = AbstractC1087g.k(2048, "BufferPoolSize");
        int k6 = AbstractC1087g.k(PegdownExtensions.ANCHORLINKS, "BufferObjectPoolSize");
        f12170b = new W3.d(k5, k3);
        f12171c = new W3.c(k6);
        f12172d = new V3.a(1);
    }
}
