package O;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.AbstractC1276k;

/* renamed from: O.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340y extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public H4.c f4246h;

    /* renamed from: i, reason: collision with root package name */
    public C0341z f4247i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4248j;

    /* renamed from: k, reason: collision with root package name */
    public long f4249k;

    /* renamed from: l, reason: collision with root package name */
    public int f4250l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4251m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CharSequence f4252n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f4253o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0341z f4254p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0340y(long j3, C0341z c0341z, InterfaceC0905c interfaceC0905c, CharSequence charSequence) {
        super(2, interfaceC0905c);
        this.f4252n = charSequence;
        this.f4253o = j3;
        this.f4254p = c0341z;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0340y) p((InterfaceC0905c) obj2, (TextClassifier) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0340y c0340y = new C0340y(this.f4253o, this.f4254p, interfaceC0905c, this.f4252n);
        c0340y.f4251m = obj;
        return c0340y;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C0341z c0341z;
        TextSelection.Request.Builder defaultLocales;
        TextSelection.Request build;
        TextSelection suggestSelection;
        long j3;
        TextClassification textClassification;
        H4.c cVar;
        TextSelection textSelection;
        CharSequence charSequence;
        TextClassification textClassification2;
        int i6 = this.f4250l;
        if (i6 == 0) {
            X3.a.e(obj);
            TextClassifier textClassifier = (TextClassifier) this.f4251m;
            I.u.A();
            long j4 = this.f4253o;
            int f6 = S0.O.f(j4);
            int e6 = S0.O.e(j4);
            CharSequence charSequence2 = this.f4252n;
            TextSelection.Request.Builder m3 = I.u.m(charSequence2, f6, e6);
            c0341z = this.f4254p;
            defaultLocales = m3.setDefaultLocales(c0341z.b());
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            build = defaultLocales.build();
            suggestSelection = textClassifier.suggestSelection(build);
            long b5 = S0.F.b(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (i7 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    cVar = c0341z.f4259e;
                    this.f4251m = suggestSelection;
                    this.f4246h = cVar;
                    this.f4247i = c0341z;
                    this.f4248j = charSequence2;
                    this.f4249k = b5;
                    this.f4250l = 1;
                    if (cVar.d(this) != enumC0927a) {
                        textSelection = suggestSelection;
                        charSequence = charSequence2;
                        j3 = b5;
                        textClassification2 = textSelection.getTextClassification();
                        AbstractC1276k.c(textClassification2);
                        c0341z.f4261g.setValue(new D0(charSequence, j3, textClassification2));
                    }
                    return enumC0927a;
                }
            }
            this.f4249k = b5;
            this.f4250l = 2;
            if (C0341z.a(c0341z, this.f4252n, b5, textClassifier, this) != enumC0927a) {
                j3 = b5;
            }
            return enumC0927a;
        }
        if (i6 == 1) {
            j3 = this.f4249k;
            charSequence = this.f4248j;
            c0341z = this.f4247i;
            cVar = this.f4246h;
            textSelection = (TextSelection) this.f4251m;
            X3.a.e(obj);
            try {
                textClassification2 = textSelection.getTextClassification();
                AbstractC1276k.c(textClassification2);
                c0341z.f4261g.setValue(new D0(charSequence, j3, textClassification2));
            } finally {
                cVar.c(null);
            }
        } else {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = this.f4249k;
            X3.a.e(obj);
        }
        return new S0.O(j3);
    }
}
