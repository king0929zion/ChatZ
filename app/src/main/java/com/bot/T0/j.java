package T0;

import S.l;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class j {
    public final TextPaint a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f8312b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8313c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8314d;

    /* renamed from: e, reason: collision with root package name */
    public U0.d f8315e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout f8316f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8317g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8318h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8319i;

    /* renamed from: j, reason: collision with root package name */
    public final float f8320j;

    /* renamed from: k, reason: collision with root package name */
    public final float f8321k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8322l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f8323m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8324n;

    /* renamed from: o, reason: collision with root package name */
    public final V0.h[] f8325o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f8326p = new Rect();

    /* renamed from: q, reason: collision with root package name */
    public E1.b f8327q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, T0.e r35) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.j.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, T0.e):void");
    }

    public final int a() {
        boolean z5 = this.f8314d;
        Layout layout = this.f8316f;
        return (z5 ? layout.getLineBottom(this.f8317g - 1) : layout.getHeight()) + this.f8318h + this.f8319i + this.f8324n;
    }

    public final float b(int i6) {
        return i6 == this.f8317g + (-1) ? this.f8320j + this.f8321k : l.f7374V;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E1.b, java.lang.Object] */
    public final E1.b c() {
        E1.b bVar = this.f8327q;
        if (bVar != null) {
            return bVar;
        }
        Object obj = new Object();
        obj.a = this.f8316f;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        do {
            int N5 = AbstractC1776n.N(((Layout) obj.a).getText(), '\n', i6, 4);
            i6 = N5 < 0 ? ((Layout) obj.a).getText().length() : N5 + 1;
            arrayList.add(Integer.valueOf(i6));
        } while (i6 < ((Layout) obj.a).getText().length());
        obj.f1292b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(null);
        }
        obj.f1293c = arrayList2;
        obj.f1294d = new boolean[((ArrayList) obj.f1292b).size()];
        ((ArrayList) obj.f1292b).size();
        this.f8327q = obj;
        return obj;
    }

    public final float d(int i6) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f8318h + ((i6 != this.f8317g + (-1) || (fontMetricsInt = this.f8323m) == null) ? this.f8316f.getLineBaseline(i6) : g(i6) - fontMetricsInt.ascent);
    }

    public final float e(int i6) {
        Paint.FontMetricsInt fontMetricsInt;
        int i7 = this.f8317g;
        int i8 = i7 - 1;
        Layout layout = this.f8316f;
        if (i6 != i8 || (fontMetricsInt = this.f8323m) == null) {
            return this.f8318h + layout.getLineBottom(i6) + (i6 == i7 + (-1) ? this.f8319i : 0);
        }
        return layout.getLineBottom(i6 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i6) {
        ThreadLocal threadLocal = k.a;
        Layout layout = this.f8316f;
        return (layout.getEllipsisCount(i6) <= 0 || this.f8312b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i6) : layout.getText().length();
    }

    public final float g(int i6) {
        return this.f8316f.getLineTop(i6) + (i6 == 0 ? 0 : this.f8318h);
    }

    public final float h(int i6, boolean z5) {
        return b(this.f8316f.getLineForOffset(i6)) + c().m(i6, true, z5);
    }

    public final float i(int i6, boolean z5) {
        return b(this.f8316f.getLineForOffset(i6)) + c().m(i6, false, z5);
    }

    public final U0.d j() {
        U0.d dVar = this.f8315e;
        if (dVar != null) {
            return dVar;
        }
        Layout layout = this.f8316f;
        U0.d dVar2 = new U0.d(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.f8315e = dVar2;
        return dVar2;
    }
}
