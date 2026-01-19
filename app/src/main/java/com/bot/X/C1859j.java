package x;

import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.C1032i;
import h0.InterfaceC1027d;
import java.util.ArrayList;
import java.util.List;
import k.AbstractC1168o;
import k.C1147A;
import y.U;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1859j {
    public final C1147A a;

    /* renamed from: b, reason: collision with root package name */
    public final C1857h f15469b;

    /* renamed from: c, reason: collision with root package name */
    public final U f15470c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U f15473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15475h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1027d f15476i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1032i f15477j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15478k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15479l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f15480m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f15481n;

    public C1859j(long j3, boolean z5, C1857h c1857h, U u5, int i6, int i7, InterfaceC1027d interfaceC1027d, C1032i c1032i, int i8, int i9, long j4, s sVar) {
        this.f15472e = z5;
        this.f15473f = u5;
        this.f15474g = i6;
        this.f15475h = i7;
        this.f15476i = interfaceC1027d;
        this.f15477j = c1032i;
        this.f15478k = i8;
        this.f15479l = i9;
        this.f15480m = j4;
        this.f15481n = sVar;
        C1147A c1147a = AbstractC1168o.a;
        this.a = new C1147A();
        this.f15469b = c1857h;
        this.f15470c = u5;
        this.f15471d = AbstractC0960b.b(z5 ? C0959a.h(j3) : Integer.MAX_VALUE, z5 ? TableCell.NOT_TRACKED : C0959a.g(j3), 5);
    }

    public final m a(long j3, int i6) {
        C1857h c1857h = this.f15469b;
        Object b5 = c1857h.b(i6);
        Object c6 = c1857h.c(i6);
        C1147A c1147a = this.a;
        List list = (List) c1147a.b(i6);
        if (list == null) {
            List b6 = this.f15470c.b(i6);
            int size = b6.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.add(((F0.U) b6.get(i7)).w(j3));
            }
            c1147a.i(i6, arrayList);
            list = arrayList;
        }
        return new m(i6, list, this.f15472e, this.f15476i, this.f15477j, this.f15473f.f15814e.getLayoutDirection(), this.f15478k, this.f15479l, i6 != this.f15474g + (-1) ? this.f15475h : 0, this.f15480m, b5, c6, this.f15481n.f15557n, j3);
    }
}
