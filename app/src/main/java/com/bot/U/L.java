package U;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

/* loaded from: classes.dex */
public final class L {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f8546b;

    /* renamed from: c, reason: collision with root package name */
    public int f8547c;

    /* renamed from: d, reason: collision with root package name */
    public int f8548d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8549e;

    public /* synthetic */ L(int i6) {
        this.a = i6;
    }

    public void a(P1.h hVar) {
        Object[] objArr = (Object[]) this.f8549e;
        int i6 = this.f8547c;
        objArr[i6] = hVar;
        int i7 = this.f8548d & (i6 + 1);
        this.f8547c = i7;
        int i8 = this.f8546b;
        if (i7 == i8) {
            int length = objArr.length;
            int i9 = length - i8;
            int i10 = length << 1;
            if (i10 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i10];
            Y3.k.j0(objArr, objArr2, 0, i8, length);
            Y3.k.j0((Object[]) this.f8549e, objArr2, i9, 0, this.f8546b);
            this.f8549e = objArr2;
            this.f8546b = 0;
            this.f8547c = length;
            this.f8548d = i10 - 1;
        }
    }

    public int b() {
        return this.f8548d - this.f8547c;
    }

    public int c(int i6) {
        return ((M) this.f8549e).f8552e[this.f8547c + i6];
    }

    public Object d(int i6) {
        return ((M) this.f8549e).f8554g[this.f8548d + i6];
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return FlexmarkHtmlConverter.DEFAULT_NODE;
            default:
                return super.toString();
        }
    }

    public L(M m3) {
        this.a = 0;
        this.f8549e = m3;
    }
}
