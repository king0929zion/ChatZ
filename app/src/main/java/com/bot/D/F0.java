package D;

import android.R;
import android.os.Build;

/* loaded from: classes.dex */
public enum F0 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(G.e.a, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(G.e.f1640b, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(G.e.f1641c, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(G.e.f1642d, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(G.e.f1643e, Build.VERSION.SDK_INT <= 26 ? com.tencent.mmkv.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);


    /* renamed from: c, reason: collision with root package name */
    public final Object f761c;

    /* renamed from: e, reason: collision with root package name */
    public final int f762e;

    /* renamed from: f, reason: collision with root package name */
    public final int f763f;

    F0(Object obj, int i6, int i7) {
        this.f761c = obj;
        this.f762e = i6;
        this.f763f = i7;
    }
}
