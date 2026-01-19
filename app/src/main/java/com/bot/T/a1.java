package T;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c.C0914b;
import c4.EnumC0927a;
import l4.InterfaceC1193a;
import z4.InterfaceC2061l;

/* loaded from: classes.dex */
public final class a1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public k.N f8058h;

    /* renamed from: i, reason: collision with root package name */
    public l4.c f8059i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC2061l f8060j;

    /* renamed from: k, reason: collision with root package name */
    public C0914b f8061k;

    /* renamed from: l, reason: collision with root package name */
    public Object f8062l;

    /* renamed from: m, reason: collision with root package name */
    public int f8063m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8064n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f8065o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(InterfaceC1193a interfaceC1193a, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8065o = interfaceC1193a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((a1) p((InterfaceC0905c) obj2, (InterfaceC0008i) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        a1 a1Var = new a1(this.f8065o, interfaceC0905c);
        a1Var.f8064n = obj;
        return a1Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a6 A[LOOP:0: B:17:0x00d9->B:22:0x01a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0150 A[EDGE_INSN: B:23:0x0150->B:24:0x0150 BREAK  A[LOOP:0: B:17:0x00d9->B:22:0x01a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0152 A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #0 {all -> 0x0190, blocks: (B:66:0x0117, B:20:0x0143, B:25:0x0152, B:32:0x016a, B:34:0x0173, B:71:0x0122, B:85:0x012e), top: B:65:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x018b -> B:9:0x018c). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.a1.r(java.lang.Object):java.lang.Object");
    }
}
