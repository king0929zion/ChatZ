package A3;

import A4.W;
import A4.g0;
import B0.A;
import B0.C0033i;
import B0.y;
import B0.z;
import H0.AbstractC0157l;
import H0.B0;
import H0.J;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import I1.F;
import I3.C0241e;
import I3.InterfaceC0242f;
import T.AbstractC0633u;
import T.C0607g0;
import T.d1;
import T.r;
import a1.C0799g;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import androidx.profileinstaller.ProfileInstallReceiver;
import c0.C0920c;
import c0.InterfaceC0921d;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import e0.InterfaceC0958c;
import e1.q;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C1173u;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class c implements InterfaceC0242f, B3.g, InterfaceC0921d, M1.f, X1.b, Y1.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f118c;

    /* renamed from: e, reason: collision with root package name */
    public Object f119e;

    public /* synthetic */ c(char c6, int i6) {
        this.f118c = i6;
    }

    @Override // I3.InterfaceC0242f
    public boolean a(C0241e c0241e) {
        AbstractC1276k.f(c0241e, "contentType");
        return c0241e.f((C0241e) this.f119e);
    }

    @Override // M1.f
    public void b(int i6, Object obj) {
        String str;
        switch (i6) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case AbstractC1787b.f15290g /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case AbstractC1787b.f15287d /* 9 */:
            default:
                str = FlexmarkHtmlConverter.DEFAULT_NODE;
                break;
            case AbstractC1787b.f15289f /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i6 == 6 || i6 == 7 || i6 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f119e).setResultCode(i6);
    }

    @Override // X1.b
    public X1.a c(String str) {
        AbstractC1276k.f(str, "fileName");
        return new Q1.a(((Y1.b) this.f119e).G());
    }

    @Override // Y1.d
    public String d() {
        return ((Q1.e) this.f119e).f6358e;
    }

    @Override // Y1.d
    public void e(Y1.c cVar) {
        Q1.e eVar = (Q1.e) this.f119e;
        int length = eVar.f6350g.length;
        for (int i6 = 1; i6 < length; i6++) {
            int i7 = eVar.f6350g[i6];
            if (i7 == 1) {
                cVar.a(eVar.f6351h[i6], i6);
            } else if (i7 == 2) {
                cVar.b(eVar.f6352i[i6], i6);
            } else if (i7 == 3) {
                String str = eVar.f6353j[i6];
                AbstractC1276k.c(str);
                cVar.o(i6, str);
            } else if (i7 == 4) {
                byte[] bArr = eVar.f6354k[i6];
                AbstractC1276k.c(bArr);
                cVar.I(bArr, i6);
            } else if (i7 == 5) {
                cVar.e(i6);
            }
        }
    }

    public void f(J j3) {
        if (!j3.H()) {
            E0.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((B0) this.f119e).add(j3);
    }

    public long g(long j3) {
        C0.b bVar = (C0.b) this.f119e;
        bVar.getClass();
        if (q.b(j3) <= S.l.f7374V || q.c(j3) <= S.l.f7374V) {
            E0.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) q.g(j3)));
        }
        return Y4.d.g(bVar.a.b(q.b(j3)), bVar.f646b.b(q.c(j3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(B4.m r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof N1.C0291m
            if (r0 == 0) goto L13
            r0 = r6
            N1.m r0 = (N1.C0291m) r0
            int r1 = r0.f3760i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3760i = r1
            goto L18
        L13:
            N1.m r0 = new N1.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3758g
            int r1 = r0.f3760i
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            X3.a.e(r6)
            N0.e r5 = new N0.e
            r5.<init>()
            throw r5
        L32:
            X3.a.e(r6)
            java.lang.Object r6 = r4.f119e
            A4.g0 r6 = (A4.g0) r6
            r0.f3760i = r2
            r6.b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.c.h(B4.m, d4.c):void");
    }

    public void i() {
        ((AbstractC0633u) this.f119e).getClass();
    }

    public void j() {
        Socket socket;
        U4.l lVar = (U4.l) this.f119e;
        Iterator it = lVar.f8746d.iterator();
        AbstractC1276k.e(it, "connections.iterator()");
        while (it.hasNext()) {
            U4.k kVar = (U4.k) it.next();
            AbstractC1276k.e(kVar, "connection");
            synchronized (kVar) {
                if (kVar.f8742p.isEmpty()) {
                    it.remove();
                    kVar.f8736j = true;
                    socket = kVar.f8730d;
                    AbstractC1276k.c(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                R4.b.e(socket);
            }
        }
        if (lVar.f8746d.isEmpty()) {
            lVar.f8744b.a();
        }
    }

    @Override // B3.g
    public void k(String str) {
        AbstractC1276k.f(str, "message");
        ((f5.a) this.f119e).b(str);
    }

    public Object l(SerialDescriptor serialDescriptor, O4.n nVar) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f119e).get(serialDescriptor);
        Object obj = map != null ? map.get(nVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public d1 m() {
        y1.j a = y1.j.a();
        if (a.c() == 1) {
            return new a1.k(true);
        }
        C0607g0 A5 = r.A(Boolean.FALSE);
        C0799g c0799g = new C0799g(A5, this);
        a.a.writeLock().lock();
        try {
            if (a.f15976c != 1 && a.f15976c != 2) {
                a.f15975b.add(c0799g);
                a.a.writeLock().unlock();
                return A5;
            }
            a.f15977d.post(new y1.h(Arrays.asList(c0799g), a.f15976c, null));
            a.a.writeLock().unlock();
            return A5;
        } catch (Throwable th) {
            a.a.writeLock().unlock();
            throw th;
        }
    }

    public void n(Set set) {
        Object value;
        int[] iArr;
        AbstractC1276k.f(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        g0 g0Var = (g0) this.f119e;
        do {
            value = g0Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i6 = 0; i6 < length; i6++) {
                iArr[i6] = set.contains(Integer.valueOf(i6)) ? iArr2[i6] + 1 : iArr2[i6];
            }
        } while (!g0Var.j(value, iArr));
    }

    public C0033i o(M.q qVar, ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x) {
        int i6;
        long J4;
        long j3;
        boolean z5;
        C1173u c1173u = (C1173u) this.f119e;
        List list = (List) qVar.f3179e;
        C1173u c1173u2 = new C1173u(list.size());
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            A a = (A) list.get(i7);
            long j4 = a.a;
            z zVar = (z) c1173u.a(j4);
            if (zVar == null) {
                i6 = i7;
                j3 = a.f368b;
                J4 = a.f370d;
                z5 = false;
            } else {
                long j5 = zVar.a;
                boolean z6 = zVar.f497c;
                i6 = i7;
                J4 = viewTreeObserverOnGlobalLayoutListenerC0216x.J(zVar.f496b);
                j3 = j5;
                z5 = z6;
            }
            long j6 = a.a;
            List list2 = list;
            int i8 = size;
            c1173u2.c(j6, new y(j6, a.f368b, a.f370d, a.f371e, a.f372f, j3, J4, z5, a.f373g, a.f375i, a.f376j, a.f377k));
            boolean z7 = a.f371e;
            if (z7) {
                c1173u.c(j4, new z(a.f368b, a.f369c, z7));
            } else {
                c1173u.d(j4);
            }
            i7 = i6 + 1;
            list = list2;
            size = i8;
        }
        return new C0033i(c1173u2, qVar);
    }

    public void p(F2.h hVar) {
        AbstractC1276k.f(hVar, "definition");
        B3.e.y(((O3.a) this.f119e).a(hVar));
    }

    public boolean q(J j3) {
        if (!j3.H()) {
            E0.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((B0) this.f119e).remove(j3);
    }

    public void r() {
        ((c) this.f119e).f119e = F.f2535d;
    }

    public String toString() {
        switch (this.f118c) {
            case AbstractC1787b.f15290g /* 5 */:
                return ((B0) this.f119e).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(Object obj, int i6) {
        this.f118c = i6;
        this.f119e = obj;
    }

    public c(Y1.b bVar) {
        this.f118c = 18;
        AbstractC1276k.f(bVar, "openHelper");
        this.f119e = bVar;
    }

    public c(InterfaceC0958c interfaceC0958c) {
        this.f118c = 10;
        this.f119e = new WeakReference(interfaceC0958c);
    }

    public c(int i6, byte b5) {
        F2.h hVar;
        this.f118c = i6;
        switch (i6) {
            case 2:
                this.f119e = f5.b.d(t3.d.class);
                return;
            case 3:
                this.f119e = new C0.b();
                return;
            case AbstractC1787b.f15290g /* 5 */:
                this.f119e = new TreeSet(AbstractC0157l.a);
                return;
            case 6:
                this.f119e = new O3.a();
                return;
            case 7:
                C0920c c0920c = new C0920c();
                this.f119e = c0920c;
                if (c0920c.f11100e) {
                    return;
                }
                if (c0920c.f11101f) {
                    d0.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                }
                c0920c.a();
                c0920c.f11101f = true;
                return;
            case AbstractC1787b.f15287d /* 9 */:
                this.f119e = new c((char) 0, 8);
                return;
            case 15:
                this.f119e = r.A(Boolean.FALSE);
                return;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                this.f119e = new ConcurrentHashMap(16);
                return;
            case 17:
                this.f119e = new Region();
                return;
            case 20:
                AbstractC1276k.f(TimeUnit.MINUTES, "timeUnit");
                this.f119e = new U4.l(T4.d.f8528i);
                return;
            case 24:
                this.f119e = new LinkedHashSet();
                return;
            case 25:
                if (Build.VERSION.SDK_INT >= 28) {
                    hVar = new F2.h(20);
                } else {
                    hVar = new F2.h(21);
                }
                this.f119e = hVar;
                return;
            default:
                this.f119e = new C1173u((Object) null);
                return;
        }
    }

    public c(R4.a aVar) {
        this.f118c = 23;
        this.f119e = new ThreadPoolExecutor(0, TableCell.NOT_TRACKED, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }

    public c(int i6) {
        this.f118c = 14;
        this.f119e = W.b(new int[i6]);
    }
}
