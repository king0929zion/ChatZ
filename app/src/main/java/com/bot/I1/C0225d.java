package I1;

import android.os.Bundle;
import i4.AbstractC1120d;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: I1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225d extends F {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2540e;

    public C0225d(boolean z5, int i6) {
        this.f2540e = i6;
    }

    @Override // I1.F
    public final Object a(String str, Bundle bundle) {
        switch (this.f2540e) {
            case 0:
                AbstractC1276k.f(bundle, "bundle");
                if (!bundle.containsKey(str) || Y3.C.A(str, bundle)) {
                    return null;
                }
                boolean z5 = bundle.getBoolean(str, false);
                if (z5 || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z5);
                }
                h5.e.a0(str);
                throw null;
            case 1:
                AbstractC1276k.f(bundle, "bundle");
                return Integer.valueOf(Y3.C.s(str, bundle));
            case 2:
                AbstractC1276k.f(bundle, "bundle");
                long j3 = bundle.getLong(str, Long.MIN_VALUE);
                if (j3 != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j3);
                }
                h5.e.a0(str);
                throw null;
            default:
                AbstractC1276k.f(bundle, "bundle");
                if (!bundle.containsKey(str) || Y3.C.A(str, bundle)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                h5.e.a0(str);
                throw null;
        }
    }

    @Override // I1.F
    public final String b() {
        switch (this.f2540e) {
            case 0:
                return "boolean";
            case 1:
                return "integer";
            case 2:
                return "long";
            default:
                return "string";
        }
    }

    @Override // I1.F
    public final Object d(String str) {
        boolean z5;
        int parseInt;
        String str2;
        long parseLong;
        switch (this.f2540e) {
            case 0:
                if (str.equals("true")) {
                    z5 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 1:
                if (u4.u.D(str, "0x", false)) {
                    String substring = str.substring(2);
                    AbstractC1276k.e(substring, "substring(...)");
                    AbstractC1120d.g(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 2:
                if (u4.u.w(str, "L", false)) {
                    str2 = str.substring(0, str.length() - 1);
                    AbstractC1276k.e(str2, "substring(...)");
                } else {
                    str2 = str;
                }
                if (u4.u.D(str, "0x", false)) {
                    String substring2 = str2.substring(2);
                    AbstractC1276k.e(substring2, "substring(...)");
                    AbstractC1120d.g(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str2);
                }
                return Long.valueOf(parseLong);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // I1.F
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f2540e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AbstractC1276k.f(str, "key");
                bundle.putBoolean(str, booleanValue);
                return;
            case 1:
                int intValue = ((Number) obj).intValue();
                AbstractC1276k.f(str, "key");
                bundle.putInt(str, intValue);
                return;
            case 2:
                long longValue = ((Number) obj).longValue();
                AbstractC1276k.f(str, "key");
                bundle.putLong(str, longValue);
                return;
            default:
                String str2 = (String) obj;
                AbstractC1276k.f(str, "key");
                if (str2 != null) {
                    AbstractC1410a.G(str, str2, bundle);
                    return;
                } else {
                    AbstractC1410a.E(str, bundle);
                    return;
                }
        }
    }
}
