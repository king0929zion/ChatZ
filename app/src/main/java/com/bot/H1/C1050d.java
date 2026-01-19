package h1;

import F0.V;
import F0.W;
import F0.X;
import H0.J;
import android.view.View;
import android.view.ViewGroup;
import e1.C0959a;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050d implements V {
    public final /* synthetic */ x a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f11837b;

    public C1050d(x xVar, J j3) {
        this.a = xVar;
        this.f11837b = j3;
    }

    @Override // F0.V
    public final int a(F0.r rVar, List list, int i6) {
        x xVar = this.a;
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        AbstractC1276k.c(layoutParams);
        xVar.measure(i.e(xVar, 0, i6, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return xVar.getMeasuredHeight();
    }

    @Override // F0.V
    public final int d(F0.r rVar, List list, int i6) {
        x xVar = this.a;
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        AbstractC1276k.c(layoutParams);
        xVar.measure(i.e(xVar, 0, i6, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return xVar.getMeasuredHeight();
    }

    @Override // F0.V
    public final W e(X x5, List list, long j3) {
        x xVar = this.a;
        int childCount = xVar.getChildCount();
        Y3.w wVar = Y3.w.f9813c;
        if (childCount == 0) {
            return x5.D(C0959a.j(j3), C0959a.i(j3), wVar, C1048b.f11830g);
        }
        if (C0959a.j(j3) != 0) {
            xVar.getChildAt(0).setMinimumWidth(C0959a.j(j3));
        }
        if (C0959a.i(j3) != 0) {
            xVar.getChildAt(0).setMinimumHeight(C0959a.i(j3));
        }
        int j4 = C0959a.j(j3);
        int h3 = C0959a.h(j3);
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        AbstractC1276k.c(layoutParams);
        int e6 = i.e(xVar, j4, h3, layoutParams.width);
        int i6 = C0959a.i(j3);
        int g3 = C0959a.g(j3);
        ViewGroup.LayoutParams layoutParams2 = xVar.getLayoutParams();
        AbstractC1276k.c(layoutParams2);
        xVar.measure(e6, i.e(xVar, i6, g3, layoutParams2.height));
        return x5.D(xVar.getMeasuredWidth(), xVar.getMeasuredHeight(), wVar, new C1049c(xVar, this.f11837b, 1));
    }

    @Override // F0.V
    public final int h(F0.r rVar, List list, int i6) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        x xVar = this.a;
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        AbstractC1276k.c(layoutParams);
        xVar.measure(makeMeasureSpec, i.e(xVar, 0, i6, layoutParams.height));
        return xVar.getMeasuredWidth();
    }

    @Override // F0.V
    public final int j(F0.r rVar, List list, int i6) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        x xVar = this.a;
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        AbstractC1276k.c(layoutParams);
        xVar.measure(makeMeasureSpec, i.e(xVar, 0, i6, layoutParams.height));
        return xVar.getMeasuredWidth();
    }
}
