package O;

import F0.C0125m;
import M4.C0255c;
import Q.AbstractC0426j;
import Q.C0467t1;
import Q.Q1;
import Q.V1;
import Q.t3;
import T.AbstractC0629s;
import T.e1;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.bot.feature.settings.data.ModelConfig$$serializer;
import com.bot.feature.settings.data.ModelIdsResponse;
import com.bot.feature.settings.data.ModelsResponse;
import com.bot.feature.settings.data.OpenAIModelInfo$$serializer;
import com.bot.feature.settings.data.OpenAIModelsResponse;
import com.bot.feature.settings.data.VendorConfig;
import com.bot.feature.settings.data.VendorConfig$$serializer;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.lang.reflect.Method;
import java.util.UUID;
import l4.InterfaceC1193a;
import v.AbstractC1787b;
import x4.AbstractC1898K;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3916c;

    public /* synthetic */ A(int i6) {
        this.f3916c = i6;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X3.f] */
    @Override // l4.InterfaceC1193a
    public final Object b() {
        Class<?> returnType;
        switch (this.f3916c) {
            case 0:
                E4.e eVar = AbstractC1898K.a;
                return E4.d.f1360f;
            case 1:
                return new z0(1L);
            case 2:
                T.B b5 = A0.a;
                return null;
            case 3:
                return U0.f4041b;
            case 4:
                T.B b6 = P2.M0.a;
                return null;
            case AbstractC1787b.f15290g /* 5 */:
                T.B b7 = P2.Q0.a;
                return null;
            case 6:
                float f6 = AbstractC0426j.a;
                return Q.W.a;
            case 7:
                return Q.O.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case 8:
                e1 e1Var = Q.O.a;
                return Boolean.TRUE;
            case AbstractC1787b.f15287d /* 9 */:
                C0125m c0125m = Q.D0.a;
                return Boolean.TRUE;
            case AbstractC1787b.f15289f /* 10 */:
                return new e1.f(48);
            case 11:
                e1 e1Var2 = Q.E0.a;
                return Boolean.FALSE;
            case 12:
                return C0467t1.a;
            case 13:
                return UUID.randomUUID();
            case 14:
                return new Q1(null, 3);
            case 15:
                return new V1();
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return new e1.f(0);
            case 17:
                return S.E.a;
            case 18:
                return new t3(null, 32767);
            case 19:
                return X3.y.a;
            case 20:
                AbstractC0629s.b("Unexpected call to default provider");
                throw new RuntimeException();
            case 21:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 22:
                ModelIdsResponse.Companion companion = ModelIdsResponse.Companion;
                return new C0255c(M4.n0.a, 0);
            case 23:
                ModelsResponse.Companion companion2 = ModelsResponse.Companion;
                return new C0255c(VendorConfig$$serializer.INSTANCE, 0);
            case 24:
                OpenAIModelsResponse.Companion companion3 = OpenAIModelsResponse.Companion;
                return new C0255c(OpenAIModelInfo$$serializer.INSTANCE, 0);
            case 25:
                VendorConfig.Companion companion4 = VendorConfig.Companion;
                return new C0255c(ModelConfig$$serializer.INSTANCE, 0);
            case 26:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 27:
                try {
                    Method method = (Method) Z1.b.f9858f.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 28:
                return T.r.A(Boolean.FALSE);
            default:
                return T.r.A(FlexmarkHtmlConverter.DEFAULT_NODE);
        }
    }
}
