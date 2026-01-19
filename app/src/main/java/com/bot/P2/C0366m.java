package P2;

import android.content.Context;
import android.net.Uri;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.Iterator;
import java.util.List;
import x4.InterfaceC1942y;

/* renamed from: P2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366m extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public Context f4978h;

    /* renamed from: i, reason: collision with root package name */
    public X2.L f4979i;

    /* renamed from: j, reason: collision with root package name */
    public Iterator f4980j;

    /* renamed from: k, reason: collision with root package name */
    public int f4981k;

    /* renamed from: l, reason: collision with root package name */
    public int f4982l;

    /* renamed from: m, reason: collision with root package name */
    public int f4983m;

    /* renamed from: n, reason: collision with root package name */
    public int f4984n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f4985o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f4986p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ X2.L f4987q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4988r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0366m(List list, Context context, X2.L l3, int i6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4985o = list;
        this.f4986p = context;
        this.f4987q = l3;
        this.f4988r = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0366m) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0366m(this.f4985o, this.f4986p, this.f4987q, this.f4988r, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6;
        Context context;
        X2.L l3;
        int i7;
        Iterator it;
        int i8;
        int i9 = this.f4984n;
        if (i9 == 0) {
            X3.a.e(obj);
            Iterator it2 = this.f4985o.iterator();
            i6 = 0;
            context = this.f4986p;
            l3 = this.f4987q;
            i7 = this.f4988r;
            it = it2;
            i8 = 0;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = this.f4983m;
            i8 = this.f4982l;
            i7 = this.f4981k;
            it = this.f4980j;
            l3 = this.f4979i;
            context = this.f4978h;
            X3.a.e(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            int i10 = i6 + 1;
            if (i6 < 0) {
                Y4.l.U();
                throw null;
            }
            this.f4978h = context;
            this.f4979i = l3;
            this.f4980j = it;
            this.f4981k = i7;
            this.f4982l = i8;
            this.f4983m = i10;
            this.f4984n = 1;
            Object p5 = V.p(context, l3, (Uri) next, i6 + i7, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (p5 == enumC0927a) {
                return enumC0927a;
            }
            i6 = i10;
        }
        return X3.y.a;
    }
}
