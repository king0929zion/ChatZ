package C4;

import android.text.TextUtils;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;

/* loaded from: classes.dex */
public final class u implements y1.o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f716c;

    /* renamed from: e, reason: collision with root package name */
    public final String f717e;

    public /* synthetic */ u(String str, int i6) {
        this.f716c = i6;
        this.f717e = str;
    }

    @Override // y1.o
    public Object k() {
        return this;
    }

    @Override // y1.o
    public boolean l(CharSequence charSequence, int i6, int i7, y1.u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i6, i7), this.f717e)) {
            return true;
        }
        uVar.f16005c = (uVar.f16005c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f716c) {
            case 0:
                return B3.e.r(new StringBuilder("<"), this.f717e, BlockQuoteParser.MARKER_CHAR);
            case 1:
                return B3.e.s(new StringBuilder("Phase('"), this.f717e, "')");
            default:
                return super.toString();
        }
    }
}
