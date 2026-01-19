package I0;

import A4.InterfaceC0008i;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import b4.InterfaceC0905c;
import z4.C2052c;
import z4.C2057h;

/* loaded from: classes.dex */
public final class k1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C2052c f2320h;

    /* renamed from: i, reason: collision with root package name */
    public int f2321i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2322j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f2323k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f2324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l1 f2325m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2057h f2326n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f2327o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(ContentResolver contentResolver, Uri uri, l1 l1Var, C2057h c2057h, Context context, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2323k = contentResolver;
        this.f2324l = uri;
        this.f2325m = l1Var;
        this.f2326n = c2057h;
        this.f2327o = context;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((k1) p((InterfaceC0905c) obj2, (InterfaceC0008i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        k1 k1Var = new k1(this.f2323k, this.f2324l, this.f2325m, this.f2326n, this.f2327o, interfaceC0905c);
        k1Var.f2322j = obj;
        return k1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r6.a(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:15:0x0055, B:17:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f2321i
            r1 = 2
            r2 = 1
            I0.l1 r3 = r10.f2325m
            android.content.ContentResolver r4 = r10.f2323k
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L30
            if (r0 == r2) goto L26
            if (r0 != r1) goto L1e
            z4.c r0 = r10.f2320h
            java.lang.Object r6 = r10.f2322j
            A4.i r6 = (A4.InterfaceC0008i) r6
            X3.a.e(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r0
            goto L44
        L1c:
            r11 = move-exception
            goto L86
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            z4.c r0 = r10.f2320h
            java.lang.Object r6 = r10.f2322j
            A4.i r6 = (A4.InterfaceC0008i) r6
            X3.a.e(r11)     // Catch: java.lang.Throwable -> L1c
            goto L55
        L30:
            X3.a.e(r11)
            java.lang.Object r11 = r10.f2322j
            A4.i r11 = (A4.InterfaceC0008i) r11
            android.net.Uri r0 = r10.f2324l
            r6 = 0
            r4.registerContentObserver(r0, r6, r3)
            z4.h r0 = r10.f2326n     // Catch: java.lang.Throwable -> L1c
            z4.c r6 = new z4.c     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L1c
        L44:
            r10.f2322j = r11     // Catch: java.lang.Throwable -> L1c
            r10.f2320h = r6     // Catch: java.lang.Throwable -> L1c
            r10.f2321i = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r6.b(r10)     // Catch: java.lang.Throwable -> L1c
            if (r0 != r5) goto L51
            goto L7f
        L51:
            r9 = r6
            r6 = r11
            r11 = r0
            r0 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L80
            r0.c()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.f2327o     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.f2322j = r6     // Catch: java.lang.Throwable -> L1c
            r10.f2320h = r0     // Catch: java.lang.Throwable -> L1c
            r10.f2321i = r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.a(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r5) goto L19
        L7f:
            return r5
        L80:
            r4.unregisterContentObserver(r3)
            X3.y r11 = X3.y.a
            return r11
        L86:
            r4.unregisterContentObserver(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.k1.r(java.lang.Object):java.lang.Object");
    }
}
