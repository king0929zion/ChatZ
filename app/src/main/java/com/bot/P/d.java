package P;

import M.q;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mmkv.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends ViewGroup {

    /* renamed from: c, reason: collision with root package name */
    public final int f4404c;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4405e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4406f;

    /* renamed from: g, reason: collision with root package name */
    public final q f4407g;

    /* renamed from: h, reason: collision with root package name */
    public int f4408h;

    public d(Context context) {
        super(context);
        this.f4404c = 5;
        ArrayList arrayList = new ArrayList();
        this.f4405e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f4406f = arrayList2;
        this.f4407g = new q(19);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.f4408h = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
