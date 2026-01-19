package E;

import G.g;
import I.p;
import K.e;
import S0.O;
import T.C0626q;
import X3.y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.vladsch.flexmark.parser.PegdownExtensions;
import l4.InterfaceC1193a;
import l4.h;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1283c;

    @Override // l4.h
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i6;
        int i7;
        switch (this.f1283c) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j3 = ((O) obj5).a;
                String obj6 = ((CharSequence) obj4).subSequence(O.f(j3), O.e(j3)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                return y.a;
            case 1:
                g gVar = (g) obj;
                e eVar = (e) obj2;
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) obj3;
                C0626q c0626q = (C0626q) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    i6 = ((intValue & 8) == 0 ? c0626q.f(gVar) : c0626q.h(gVar) ? 4 : 2) | intValue;
                } else {
                    i6 = intValue;
                }
                if ((intValue & 48) == 0) {
                    i6 |= (intValue & 64) == 0 ? c0626q.f(eVar) : c0626q.h(eVar) ? 32 : 16;
                }
                if ((intValue & 384) == 0) {
                    i6 |= c0626q.h(interfaceC1193a) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
                }
                if (c0626q.S(i6 & 1, (i6 & 1171) != 1170)) {
                    p.c(gVar, eVar, interfaceC1193a, c0626q, i6 & 1022);
                } else {
                    c0626q.V();
                }
                return y.a;
            default:
                g gVar2 = (g) obj;
                e eVar2 = (e) obj2;
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) obj3;
                C0626q c0626q2 = (C0626q) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    i7 = ((intValue2 & 8) == 0 ? c0626q2.f(gVar2) : c0626q2.h(gVar2) ? 4 : 2) | intValue2;
                } else {
                    i7 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i7 |= (intValue2 & 64) == 0 ? c0626q2.f(eVar2) : c0626q2.h(eVar2) ? 32 : 16;
                }
                if ((intValue2 & 384) == 0) {
                    i7 |= c0626q2.h(interfaceC1193a2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
                }
                if (c0626q2.S(i7 & 1, (i7 & 1171) != 1170)) {
                    p.c(gVar2, eVar2, interfaceC1193a2, c0626q2, i7 & 1022);
                } else {
                    c0626q2.V();
                }
                return y.a;
        }
    }
}
