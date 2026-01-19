package P2;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import l4.InterfaceC1193a;

/* renamed from: P2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0389z implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5108c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f5109e;

    public /* synthetic */ C0389z(l4.c cVar, int i6) {
        this.f5108c = i6;
        this.f5109e = cVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f5108c) {
            case 0:
                this.f5109e.f(Boolean.FALSE);
                break;
            case 1:
                this.f5109e.f(Boolean.FALSE);
                break;
            case 2:
                this.f5109e.f(Boolean.FALSE);
                break;
            default:
                this.f5109e.f(FlexmarkHtmlConverter.DEFAULT_NODE);
                break;
        }
        return X3.y.a;
    }
}
