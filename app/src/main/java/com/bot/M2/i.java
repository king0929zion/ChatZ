package M2;

import b4.InterfaceC0905c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public I2.m f3315g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3316h;

    /* renamed from: i, reason: collision with root package name */
    public String f3317i;

    /* renamed from: j, reason: collision with root package name */
    public String f3318j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3319k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f3320l;

    /* renamed from: m, reason: collision with root package name */
    public int f3321m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f3320l = jVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3319k = obj;
        this.f3321m |= Integer.MIN_VALUE;
        return this.f3320l.a(null, this);
    }
}
