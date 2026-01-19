package e5;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import d5.y;
import java.util.ArrayList;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class g {
    public final y a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11610b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11611c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11612d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11613e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11614f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11615g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11616h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11617i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11618j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f11619k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f11620l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f11621m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f11622n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f11623o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f11624p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f11625q;

    public g(y yVar, boolean z5, String str, long j3, long j4, long j5, int i6, long j6, int i7, int i8, Long l3, Long l5, Long l6, Integer num, Integer num2, Integer num3) {
        AbstractC1276k.f(yVar, "canonicalPath");
        AbstractC1276k.f(str, "comment");
        this.a = yVar;
        this.f11610b = z5;
        this.f11611c = str;
        this.f11612d = j3;
        this.f11613e = j4;
        this.f11614f = j5;
        this.f11615g = i6;
        this.f11616h = j6;
        this.f11617i = i7;
        this.f11618j = i8;
        this.f11619k = l3;
        this.f11620l = l5;
        this.f11621m = l6;
        this.f11622n = num;
        this.f11623o = num2;
        this.f11624p = num3;
        this.f11625q = new ArrayList();
    }

    public /* synthetic */ g(y yVar, boolean z5, String str, long j3, long j4, long j5, int i6, long j6, int i7, int i8, Long l3, Long l5, Long l6, int i9) {
        this(yVar, z5, (i9 & 4) != 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : str, (i9 & 8) != 0 ? -1L : j3, (i9 & 16) != 0 ? -1L : j4, (i9 & 32) != 0 ? -1L : j5, (i9 & 64) != 0 ? -1 : i6, (i9 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? -1L : j6, (i9 & PegdownExtensions.WIKILINKS) != 0 ? -1 : i7, (i9 & PegdownExtensions.STRIKETHROUGH) != 0 ? -1 : i8, (i9 & PegdownExtensions.ANCHORLINKS) != 0 ? null : l3, (i9 & 2048) != 0 ? null : l5, (i9 & 4096) != 0 ? null : l6, null, null, null);
    }
}
