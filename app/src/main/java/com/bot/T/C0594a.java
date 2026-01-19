package T;

import j1.AbstractC1135a;

/* renamed from: T.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594a {
    public int a;

    public C0594a(int i6) {
        this.a = i6;
    }

    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return AbstractC1135a.i(sb, this.a, " }");
    }
}
