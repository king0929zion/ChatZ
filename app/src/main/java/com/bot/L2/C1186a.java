package l2;

import N1.C0290l;
import d5.y;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1186a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f12676b = new long[2];

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12677c = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12678d = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name */
    public boolean f12679e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12680f;

    /* renamed from: g, reason: collision with root package name */
    public C0290l f12681g;

    /* renamed from: h, reason: collision with root package name */
    public int f12682h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1190e f12683i;

    public C1186a(C1190e c1190e, String str) {
        this.f12683i = c1190e;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i6 = 0; i6 < 2; i6++) {
            sb.append(i6);
            this.f12677c.add(this.f12683i.f12690c.d(sb.toString()));
            sb.append(".tmp");
            this.f12678d.add(this.f12683i.f12690c.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final C1187b a() {
        if (!this.f12679e || this.f12681g != null || this.f12680f) {
            return null;
        }
        ArrayList arrayList = this.f12677c;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            C1190e c1190e = this.f12683i;
            if (i6 >= size) {
                this.f12682h++;
                return new C1187b(c1190e, this);
            }
            if (!c1190e.f12705s.f((y) arrayList.get(i6))) {
                try {
                    c1190e.u(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i6++;
        }
    }
}
