package u0;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1744e {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15029b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15030c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15031d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15032e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15033f;

    /* renamed from: g, reason: collision with root package name */
    public final float f15034g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15035h;

    /* renamed from: i, reason: collision with root package name */
    public final List f15036i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f15037j;

    public C1744e(String str, float f6, float f7, float f8, float f9, float f10, float f11, float f12, List list, int i6) {
        str = (i6 & 1) != 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : str;
        f6 = (i6 & 2) != 0 ? 0.0f : f6;
        f7 = (i6 & 4) != 0 ? 0.0f : f7;
        f8 = (i6 & 8) != 0 ? 0.0f : f8;
        f9 = (i6 & 16) != 0 ? 1.0f : f9;
        f10 = (i6 & 32) != 0 ? 1.0f : f10;
        f11 = (i6 & 64) != 0 ? 0.0f : f11;
        f12 = (i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? 0.0f : f12;
        if ((i6 & PegdownExtensions.WIKILINKS) != 0) {
            int i7 = H.a;
            list = Y3.v.f9812c;
        }
        ArrayList arrayList = new ArrayList();
        this.a = str;
        this.f15029b = f6;
        this.f15030c = f7;
        this.f15031d = f8;
        this.f15032e = f9;
        this.f15033f = f10;
        this.f15034g = f11;
        this.f15035h = f12;
        this.f15036i = list;
        this.f15037j = arrayList;
    }
}
