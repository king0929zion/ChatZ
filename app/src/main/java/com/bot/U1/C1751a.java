package u1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1751a extends ClickableSpan {

    /* renamed from: c, reason: collision with root package name */
    public final int f15139c;

    /* renamed from: e, reason: collision with root package name */
    public final C1754d f15140e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15141f;

    public C1751a(int i6, C1754d c1754d, int i7) {
        this.f15139c = i6;
        this.f15140e = c1754d;
        this.f15141f = i7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f15139c);
        this.f15140e.a.performAction(this.f15141f, bundle);
    }
}
