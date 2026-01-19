package y;

import T.C0602e;
import T.C0607g0;
import T.d1;
import i4.AbstractC1117a;

/* loaded from: classes.dex */
public final class W implements d1 {

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f15817c;

    /* renamed from: e, reason: collision with root package name */
    public int f15818e;

    public W(int i6) {
        int i7 = (i6 / 30) * 30;
        this.f15817c = new C0607g0(AbstractC1117a.z(Math.max(i7 - 100, 0), i7 + 130), C0602e.f8083j);
        this.f15818e = i6;
    }

    public final void a(int i6) {
        if (i6 != this.f15818e) {
            this.f15818e = i6;
            int i7 = (i6 / 30) * 30;
            this.f15817c.setValue(AbstractC1117a.z(Math.max(i7 - 100, 0), i7 + 130));
        }
    }

    @Override // T.d1
    public final Object getValue() {
        return (r4.g) this.f15817c.getValue();
    }
}
