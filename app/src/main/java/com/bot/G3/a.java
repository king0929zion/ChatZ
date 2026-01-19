package G3;

import b4.InterfaceC0905c;
import d4.i;
import io.ktor.utils.io.C;
import io.ktor.utils.io.y;
import l4.e;
import l4.f;

/* loaded from: classes.dex */
public final class a extends i implements e {

    /* renamed from: h, reason: collision with root package name */
    public Object f1662h;

    /* renamed from: i, reason: collision with root package name */
    public y f1663i;

    /* renamed from: j, reason: collision with root package name */
    public f f1664j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1665k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f1666l;

    /* renamed from: m, reason: collision with root package name */
    public long f1667m;

    /* renamed from: n, reason: collision with root package name */
    public long f1668n;

    /* renamed from: o, reason: collision with root package name */
    public int f1669o;

    /* renamed from: p, reason: collision with root package name */
    public int f1670p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1671q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Long f1672r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f1673s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f1674t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Long l3, y yVar, f fVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f1672r = l3;
        this.f1673s = yVar;
        this.f1674t = fVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((a) p((InterfaceC0905c) obj2, (C) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        a aVar = new a(this.f1672r, this.f1673s, this.f1674t, interfaceC0905c);
        aVar.f1671q = obj;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0180, code lost:
    
        if (r12.d(r0, r4, r20) == r8) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:20:0x00c7, B:22:0x00cf, B:27:0x00f0, B:41:0x0153, B:45:0x0162, B:62:0x00b1, B:65:0x00b8), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0153 A[Catch: all -> 0x0020, TRY_ENTER, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:20:0x00c7, B:22:0x00cf, B:27:0x00f0, B:41:0x0153, B:45:0x0162, B:62:0x00b1, B:65:0x00b8), top: B:2:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x014a -> B:19:0x0150). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.a.r(java.lang.Object):java.lang.Object");
    }
}
