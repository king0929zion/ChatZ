package a1;

import H0.C;
import H0.C0158m;
import S.l;
import S0.P;
import S0.t;
import T.d1;
import android.text.Layout;
import android.text.TextPaint;
import e1.InterfaceC0961c;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795c implements t {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final P f10554b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10555c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10556d;

    /* renamed from: e, reason: collision with root package name */
    public final W0.d f10557e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0961c f10558f;

    /* renamed from: g, reason: collision with root package name */
    public final C0797e f10559g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f10560h;

    /* renamed from: i, reason: collision with root package name */
    public final T0.e f10561i;

    /* renamed from: j, reason: collision with root package name */
    public C0158m f10562j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10563k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10564l;

    /* JADX WARN: Code restructure failed: missing block: B:154:0x04cd, code lost:
    
        if ((r3.f7613b.f7666c & 1095216660480L) == 0) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x009d, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0974 A[LOOP:7: B:329:0x0972->B:330:0x0974, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ad  */
    /* JADX WARN: Type inference failed for: r0v0, types: [a1.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v44, types: [y1.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.TextPaint, android.graphics.Paint, a1.e] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v98, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0795c(java.lang.String r40, S0.P r41, java.util.List r42, java.util.List r43, W0.d r44, e1.InterfaceC0961c r45) {
        /*
            Method dump skipped, instructions count: 2516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0795c.<init>(java.lang.String, S0.P, java.util.List, java.util.List, W0.d, e1.c):void");
    }

    @Override // S0.t
    public final boolean a() {
        C0158m c0158m = this.f10562j;
        if (c0158m != null ? c0158m.m() : false) {
            return true;
        }
        if (!this.f10563k && j.a(this.f10554b)) {
            A3.c cVar = C0801i.a;
            A3.c cVar2 = C0801i.a;
            d1 d1Var = (d1) cVar2.f119e;
            if (d1Var == null) {
                if (y1.j.d()) {
                    d1Var = cVar2.m();
                    cVar2.f119e = d1Var;
                } else {
                    d1Var = j.a;
                }
            }
            if (((Boolean) d1Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // S0.t
    public final float b() {
        float f6;
        T0.e eVar = this.f10561i;
        float f7 = eVar.f8307e;
        TextPaint textPaint = eVar.f8304b;
        if (!Float.isNaN(f7)) {
            return eVar.f8307e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = eVar.a;
        lineInstance.setText(new T0.b(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C(2));
        int i6 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new X3.i(Integer.valueOf(i6), Integer.valueOf(next)));
            } else {
                X3.i iVar = (X3.i) priorityQueue.peek();
                if (iVar != null && ((Number) iVar.f9394e).intValue() - ((Number) iVar.f9393c).intValue() < next - i6) {
                    priorityQueue.poll();
                    priorityQueue.add(new X3.i(Integer.valueOf(i6), Integer.valueOf(next)));
                }
            }
            i6 = next;
        }
        if (priorityQueue.isEmpty()) {
            f6 = l.f7374V;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            X3.i iVar2 = (X3.i) it.next();
            float desiredWidth = Layout.getDesiredWidth(eVar.b(), ((Number) iVar2.f9393c).intValue(), ((Number) iVar2.f9394e).intValue(), textPaint);
            while (it.hasNext()) {
                X3.i iVar3 = (X3.i) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(eVar.b(), ((Number) iVar3.f9393c).intValue(), ((Number) iVar3.f9394e).intValue(), textPaint));
            }
            f6 = desiredWidth;
        }
        eVar.f8307e = f6;
        return f6;
    }

    @Override // S0.t
    public final float c() {
        return this.f10561i.c();
    }
}
