package V4;

import Q4.A;
import Q4.r;
import d5.C;
import d5.InterfaceC0951k;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g extends A {

    /* renamed from: c, reason: collision with root package name */
    public final String f8818c;

    /* renamed from: e, reason: collision with root package name */
    public final long f8819e;

    /* renamed from: f, reason: collision with root package name */
    public final C f8820f;

    public g(String str, long j3, C c6) {
        this.f8818c = str;
        this.f8819e = j3;
        this.f8820f = c6;
    }

    @Override // Q4.A
    public final long c() {
        return this.f8819e;
    }

    @Override // Q4.A
    public final r d() {
        String str = this.f8818c;
        if (str == null) {
            return null;
        }
        Pattern pattern = r.f6573b;
        try {
            return h5.e.W(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // Q4.A
    public final InterfaceC0951k h() {
        return this.f8820f;
    }
}
