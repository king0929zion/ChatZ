package X2;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class X extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9240h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y f9241i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9242j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9243k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y5, String str, String str2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9241i = y5;
        this.f9242j = str;
        this.f9243k = str2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((X) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new X(this.f9241i, this.f9242j, this.f9243k, interfaceC0905c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:9|10|11|(3:13|(1:15)(1:65)|(18:17|18|19|(1:21)|22|(3:24|(1:26)|27)(2:60|(1:62))|(11:32|33|(2:35|(1:37))|(2:42|(1:44))|45|(2:46|(1:49)(1:48))|50|(1:52)|53|54|(1:56)(1:57))|59|33|(0)|(3:39|42|(0))|45|(3:46|(0)(0)|48)|50|(0)|53|54|(0)(0)))|66|18|19|(0)|22|(0)(0)|(12:29|32|33|(0)|(0)|45|(3:46|(0)(0)|48)|50|(0)|53|54|(0)(0))|59|33|(0)|(0)|45|(3:46|(0)(0)|48)|50|(0)|53|54|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:11:0x002d, B:13:0x0045, B:17:0x004f, B:22:0x0077, B:24:0x007d, B:27:0x0086, B:29:0x0095, B:32:0x009c, B:33:0x00b8, B:35:0x00c0, B:37:0x00cb, B:39:0x00d0, B:42:0x00d7, B:44:0x00e1, B:45:0x00f1, B:46:0x0134, B:50:0x0152, B:52:0x0156, B:53:0x0159, B:59:0x00b4, B:60:0x008b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0 A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:11:0x002d, B:13:0x0045, B:17:0x004f, B:22:0x0077, B:24:0x007d, B:27:0x0086, B:29:0x0095, B:32:0x009c, B:33:0x00b8, B:35:0x00c0, B:37:0x00cb, B:39:0x00d0, B:42:0x00d7, B:44:0x00e1, B:45:0x00f1, B:46:0x0134, B:50:0x0152, B:52:0x0156, B:53:0x0159, B:59:0x00b4, B:60:0x008b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0 A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:11:0x002d, B:13:0x0045, B:17:0x004f, B:22:0x0077, B:24:0x007d, B:27:0x0086, B:29:0x0095, B:32:0x009c, B:33:0x00b8, B:35:0x00c0, B:37:0x00cb, B:39:0x00d0, B:42:0x00d7, B:44:0x00e1, B:45:0x00f1, B:46:0x0134, B:50:0x0152, B:52:0x0156, B:53:0x0159, B:59:0x00b4, B:60:0x008b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:11:0x002d, B:13:0x0045, B:17:0x004f, B:22:0x0077, B:24:0x007d, B:27:0x0086, B:29:0x0095, B:32:0x009c, B:33:0x00b8, B:35:0x00c0, B:37:0x00cb, B:39:0x00d0, B:42:0x00d7, B:44:0x00e1, B:45:0x00f1, B:46:0x0134, B:50:0x0152, B:52:0x0156, B:53:0x0159, B:59:0x00b4, B:60:0x008b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169 A[LOOP:0: B:46:0x0134->B:48:0x0169, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152 A[EDGE_INSN: B:49:0x0152->B:50:0x0152 BREAK  A[LOOP:0: B:46:0x0134->B:48:0x0169], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156 A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:11:0x002d, B:13:0x0045, B:17:0x004f, B:22:0x0077, B:24:0x007d, B:27:0x0086, B:29:0x0095, B:32:0x009c, B:33:0x00b8, B:35:0x00c0, B:37:0x00cb, B:39:0x00d0, B:42:0x00d7, B:44:0x00e1, B:45:0x00f1, B:46:0x0134, B:50:0x0152, B:52:0x0156, B:53:0x0159, B:59:0x00b4, B:60:0x008b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008b A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:11:0x002d, B:13:0x0045, B:17:0x004f, B:22:0x0077, B:24:0x007d, B:27:0x0086, B:29:0x0095, B:32:0x009c, B:33:0x00b8, B:35:0x00c0, B:37:0x00cb, B:39:0x00d0, B:42:0x00d7, B:44:0x00e1, B:45:0x00f1, B:46:0x0134, B:50:0x0152, B:52:0x0156, B:53:0x0159, B:59:0x00b4, B:60:0x008b), top: B:10:0x002d }] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.X.r(java.lang.Object):java.lang.Object");
    }
}
