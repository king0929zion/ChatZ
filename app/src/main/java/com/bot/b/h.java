package B;

import A4.N;
import A4.V;
import X3.y;
import android.database.SQLException;
import l4.InterfaceC1193a;
import m0.w;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f356c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f358f;

    public /* synthetic */ h(Object obj, boolean z5, int i6) {
        this.f356c = i6;
        this.f358f = obj;
        this.f357e = z5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        N i6;
        switch (this.f356c) {
            case 0:
                ((l4.c) this.f358f).f(Boolean.valueOf(!this.f357e));
                break;
            case 1:
                M.e eVar = (M.e) this.f358f;
                boolean z5 = this.f357e;
                y yVar = y.a;
                if (z5 && (i6 = eVar.i()) != null) {
                    ((V) i6).h(yVar);
                }
                return yVar;
            case 2:
                P1.g gVar = (P1.g) this.f358f;
                String str = this.f357e ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                gVar.f4574e.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                gVar.f4573c.d(sb);
                try {
                    h5.e.l0(5, sb.toString());
                    throw null;
                } catch (SQLException e6) {
                    e6.printStackTrace();
                    break;
                }
            default:
                w wVar = (w) this.f358f;
                if (this.f357e) {
                    w.a(wVar);
                }
                return y.a;
        }
        return y.a;
    }

    public /* synthetic */ h(boolean z5, Object obj, int i6) {
        this.f356c = i6;
        this.f357e = z5;
        this.f358f = obj;
    }
}
