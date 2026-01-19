package z;

import com.vladsch.flexmark.util.format.TableCell;
import java.util.List;
import k.AbstractC1168o;
import k.C1147A;
import k.C1148B;
import y.a0;
import y.b0;

/* loaded from: classes.dex */
public final class k {
    public final C1147A a;

    /* renamed from: b, reason: collision with root package name */
    public final C1147A f16118b;

    /* renamed from: c, reason: collision with root package name */
    public int f16119c;

    /* renamed from: d, reason: collision with root package name */
    public int f16120d;

    public k(C2010h c2010h, b0 b0Var, y yVar) {
        C1147A c1147a = AbstractC1168o.a;
        this.a = new C1147A();
        new C1148B();
        this.f16118b = new C1147A();
        this.f16119c = TableCell.NOT_TRACKED;
        this.f16120d = Integer.MIN_VALUE;
    }

    public final void a() {
        this.f16119c = TableCell.NOT_TRACKED;
        this.f16120d = Integer.MIN_VALUE;
        this.f16118b.c();
        C1147A c1147a = this.a;
        long[] jArr = c1147a.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j3) < 128) {
                        int i9 = (i6 << 3) + i8;
                        int i10 = c1147a.f12558b[i9];
                        List list = (List) c1147a.f12559c[i9];
                        int size = list.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((a0) list.get(i11)).cancel();
                        }
                        c1147a.h(i9);
                    }
                    j3 >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }
}
