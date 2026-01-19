package q;

import T.C0626q;
import X3.y;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.C1038o;
import l4.InterfaceC1193a;
import l4.j;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1489a implements j {
    @Override // l4.j
    public final Object j(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C0626q c0626q, Integer num) {
        int i6;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        C1491c c1491c = (C1491c) obj2;
        l4.f fVar = (l4.f) obj3;
        InterfaceC1193a interfaceC1193a = (InterfaceC1193a) obj4;
        int intValue = num.intValue();
        int i7 = intValue & 6;
        C1038o c1038o = C1038o.a;
        if (i7 == 0) {
            i6 = (c0626q.f(c1038o) ? 4 : 2) | intValue;
        } else {
            i6 = intValue;
        }
        if ((intValue & 48) == 0) {
            i6 |= c0626q.f(str) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i6 |= c0626q.g(booleanValue) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((intValue & 3072) == 0) {
            i6 |= c0626q.f(c1491c) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((intValue & 24576) == 0) {
            i6 |= c0626q.h(fVar) ? 16384 : 8192;
        }
        if ((intValue & PegdownExtensions.SUPPRESS_ALL_HTML) == 0) {
            i6 |= c0626q.h(interfaceC1193a) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if (c0626q.S(i6 & 1, (599187 & i6) != 599186)) {
            AbstractC1494f.c(str, booleanValue, c1491c, c1038o, fVar, interfaceC1193a, c0626q, ((i6 >> 3) & 1022) | ((i6 << 9) & 7168) | (57344 & i6) | (i6 & 458752));
        } else {
            c0626q.V();
        }
        return y.a;
    }
}
