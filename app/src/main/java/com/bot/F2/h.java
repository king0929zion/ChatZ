package F2;

import I1.j;
import I1.v;
import Q4.u;
import W0.k;
import W0.m;
import W0.o;
import Y3.n;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.N;
import b4.InterfaceC0909g;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k.C1175w;
import k.M;
import k.V;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class h implements B3.g, InterfaceC0909g, M1.f, o, Y1.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1567c;

    public /* synthetic */ h(int i6) {
        this.f1567c = i6;
    }

    public static ArrayList a(List list) {
        AbstractC1276k.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((u) obj) != u.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.Z(arrayList, 10));
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            arrayList2.add(((u) obj2).f6635c);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d5.i, java.lang.Object] */
    public static byte[] c(List list) {
        AbstractC1276k.f(list, "protocols");
        ?? obj = new Object();
        ArrayList a = a(list);
        int size = a.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = a.get(i6);
            i6++;
            String str = (String) obj2;
            obj.S(str.length());
            obj.g0(str);
        }
        return obj.r(obj.f11482e);
    }

    public static j f(L1.e eVar, v vVar, Bundle bundle, EnumC0842p enumC0842p, I1.o oVar) {
        String uuid = UUID.randomUUID().toString();
        AbstractC1276k.e(uuid, "toString(...)");
        AbstractC1276k.f(vVar, "destination");
        AbstractC1276k.f(enumC0842p, "hostLifecycleState");
        return new j(eVar, vVar, bundle, enumC0842p, oVar, uuid, null);
    }

    public static Typeface g(String str, k kVar, int i6) {
        Typeface create;
        if (i6 == 0 && AbstractC1276k.b(kVar, k.f8834h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f8840c, i6 == 1);
        return create;
    }

    public static Typeface h(String str, k kVar, int i6) {
        if (i6 == 0 && AbstractC1276k.b(kVar, k.f8834h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int u5 = s4.j.u(kVar, i6);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(u5) : Typeface.create(str, u5);
    }

    public static boolean j() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    private final void l(int i6, Object obj) {
    }

    @Override // M1.f
    public void b(int i6, Object obj) {
        String str;
        switch (this.f1567c) {
            case 6:
                return;
            default:
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
                    return;
                }
                return;
        }
    }

    @Override // Y1.d
    public String d() {
        return "SELECT MAX(rowid) FROM llm_settings";
    }

    @Override // Y1.d
    public void e(Y1.c cVar) {
    }

    public Typeface i(m mVar, k kVar, int i6) {
        switch (this.f1567c) {
            case 20:
                return g(mVar.f8841d, kVar, i6);
            default:
                String str = mVar.f8841d;
                int i7 = kVar.f8840c / 100;
                if (i7 >= 0 && i7 < 2) {
                    str = str.concat("-thin");
                } else if (2 <= i7 && i7 < 4) {
                    str = str.concat("-light");
                } else if (i7 != 4) {
                    if (i7 == 5) {
                        str = str.concat("-medium");
                    } else if ((6 > i7 || i7 >= 8) && 8 <= i7 && i7 < 11) {
                        str = str.concat("-black");
                    }
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface h3 = h(str, kVar, i6);
                    if (!AbstractC1276k.b(h3, Typeface.create(Typeface.DEFAULT, s4.j.u(kVar, i6))) && !AbstractC1276k.b(h3, h(null, kVar, i6))) {
                        typeface = h3;
                    }
                }
                return typeface == null ? h(mVar.f8841d, kVar, i6) : typeface;
        }
    }

    @Override // B3.g
    public void k(String str) {
        AbstractC1276k.f(str, "message");
        i5.a.a.getClass();
        N.k(new Object[0]);
    }

    public h(A0.b bVar) {
        this.f1567c = 4;
    }

    public h() {
        this.f1567c = 18;
        new C1175w(16);
        long[] jArr = V.a;
        new M();
    }
}
