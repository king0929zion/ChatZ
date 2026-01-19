package G;

import android.view.textclassifier.TextClassification;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: b, reason: collision with root package name */
    public final TextClassification f1645b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1646c;

    public h(Object obj, TextClassification textClassification, int i6) {
        super(obj);
        this.f1645b = textClassification;
        this.f1646c = i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.a);
        sb.append(", textClassification=");
        sb.append(this.f1645b);
        sb.append(", index=");
        return B3.e.q(sb, this.f1646c, ')');
    }
}
