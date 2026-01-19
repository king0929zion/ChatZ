package m0;

import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0149f0;
import H0.J;
import I0.C0208t;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.view.View;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import k.C1152F;
import k.I;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class q implements n {
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x f12899b;

    /* renamed from: d, reason: collision with root package name */
    public final k f12901d;

    /* renamed from: f, reason: collision with root package name */
    public C1152F f12903f;

    /* renamed from: h, reason: collision with root package name */
    public C f12905h;

    /* renamed from: c, reason: collision with root package name */
    public final C f12900c = new C(2, null, 14);

    /* renamed from: e, reason: collision with root package name */
    public final o f12902e = new o(this);

    /* renamed from: g, reason: collision with root package name */
    public final I f12904g = new I(1);

    public q(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x2) {
        this.a = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f12899b = viewTreeObserverOnGlobalLayoutListenerC0216x2;
        this.f12901d = new k(this, viewTreeObserverOnGlobalLayoutListenerC0216x2);
    }

    public final void b(boolean z5) {
        d(8, z5, true);
    }

    public final boolean c(boolean z5) {
        C0149f0 c0149f0;
        if (h() != null) {
            C h3 = h();
            k(null);
            if (h3 != null) {
                EnumC1245A enumC1245A = EnumC1245A.f12868c;
                EnumC1245A enumC1245A2 = EnumC1245A.f12870f;
                h3.N0(enumC1245A, enumC1245A2);
                if (!h3.f11806c.f11819q) {
                    E0.a.b("visitAncestors called on an unattached node");
                }
                AbstractC1040q abstractC1040q = h3.f11806c.f11810h;
                J v5 = AbstractC0157l.v(h3);
                while (v5 != null) {
                    if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ANCHORLINKS) != 0) {
                        while (abstractC1040q != null) {
                            if ((abstractC1040q.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                V.e eVar = null;
                                AbstractC1040q abstractC1040q2 = abstractC1040q;
                                while (abstractC1040q2 != null) {
                                    if (abstractC1040q2 instanceof C) {
                                        ((C) abstractC1040q2).N0(EnumC1245A.f12869e, enumC1245A2);
                                    } else if ((abstractC1040q2.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q2 instanceof AbstractC0156k)) {
                                        int i6 = 0;
                                        for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q2).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                            if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    abstractC1040q2 = abstractC1040q3;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new V.e(new AbstractC1040q[16]);
                                                    }
                                                    if (abstractC1040q2 != null) {
                                                        eVar.b(abstractC1040q2);
                                                        abstractC1040q2 = null;
                                                    }
                                                    eVar.b(abstractC1040q3);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    abstractC1040q2 = AbstractC0157l.e(eVar);
                                }
                            }
                            abstractC1040q = abstractC1040q.f11810h;
                        }
                    }
                    v5 = v5.v();
                    abstractC1040q = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
                }
            }
        }
        return true;
    }

    public final boolean d(int i6, boolean z5, boolean z6) {
        boolean z7 = true;
        if (z5) {
            c(z5);
        } else {
            int ordinal = AbstractC1249d.u(this.f12900c, i6).ordinal();
            if (ordinal == 0) {
                c(z5);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    throw new RuntimeException();
                }
                z7 = false;
            }
        }
        if (z7 && z6) {
            e();
        }
        return z7;
    }

    public final void e() {
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.a;
        if (viewTreeObserverOnGlobalLayoutListenerC0216x.isFocused() || viewTreeObserverOnGlobalLayoutListenerC0216x.hasFocus()) {
            viewTreeObserverOnGlobalLayoutListenerC0216x.clearFocus();
        } else if (viewTreeObserverOnGlobalLayoutListenerC0216x.hasFocus()) {
            View findFocus = viewTreeObserverOnGlobalLayoutListenerC0216x.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            viewTreeObserverOnGlobalLayoutListenerC0216x.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0032, B:18:0x0038, B:19:0x003d, B:21:0x0045, B:23:0x004a, B:25:0x0050, B:29:0x0056, B:34:0x016a, B:36:0x0170, B:37:0x0173, B:39:0x017e, B:42:0x018a, B:46:0x0194, B:81:0x019a, B:82:0x019f, B:75:0x01d9, B:48:0x01a3, B:50:0x01a9, B:52:0x01ad, B:54:0x01b5, B:56:0x01bb, B:62:0x01c3, B:64:0x01cc, B:65:0x01d0, B:60:0x01d3, B:84:0x01de, B:87:0x01e1, B:89:0x01e7, B:96:0x01eb, B:101:0x01f2, B:103:0x01fa, B:111:0x0211, B:113:0x0216, B:147:0x021a, B:142:0x025c, B:115:0x0226, B:117:0x022c, B:119:0x0230, B:121:0x0238, B:123:0x023e, B:129:0x0246, B:131:0x024f, B:132:0x0253, B:127:0x0256, B:153:0x0261, B:157:0x0271, B:159:0x0276, B:193:0x027a, B:188:0x02bc, B:161:0x0286, B:163:0x028c, B:165:0x0290, B:167:0x0298, B:169:0x029e, B:175:0x02a6, B:177:0x02af, B:178:0x02b3, B:173:0x02b6, B:200:0x02c3, B:202:0x02ca, B:215:0x005e, B:217:0x0064, B:218:0x0067, B:220:0x006f, B:223:0x007b, B:227:0x0085, B:262:0x00d8, B:264:0x00dc, B:229:0x008a, B:231:0x0090, B:233:0x0094, B:235:0x009c, B:237:0x00a2, B:243:0x00aa, B:245:0x00b3, B:246:0x00b7, B:241:0x00ba, B:252:0x00c0, B:266:0x00c5, B:269:0x00c8, B:271:0x00ce, B:278:0x00d2, B:283:0x00e2, B:285:0x00e8, B:286:0x00eb, B:288:0x00f5, B:291:0x0101, B:295:0x010b, B:330:0x015e, B:332:0x0162, B:297:0x0110, B:299:0x0116, B:301:0x011a, B:303:0x0122, B:305:0x0128, B:311:0x0130, B:313:0x0139, B:314:0x013d, B:309:0x0140, B:320:0x0146, B:335:0x014b, B:338:0x014e, B:340:0x0154, B:347:0x0158), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [V.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [V.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r15v5, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r15v9, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v35, types: [V.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [V.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.view.KeyEvent r14, l4.InterfaceC1193a r15) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.q.f(android.view.KeyEvent, l4.a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0124, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r14v1, types: [m4.l, l4.c] */
    /* JADX WARN: Type inference failed for: r14v5, types: [m4.l, l4.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean g(int r20, n0.C1354c r21, l4.c r22) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.q.g(int, n0.c, l4.c):java.lang.Boolean");
    }

    public final C h() {
        C c6 = this.f12905h;
        if (c6 == null || !c6.f11819q) {
            return null;
        }
        return c6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [m4.w, java.lang.Object] */
    public final boolean i(int i6, boolean z5) {
        C h3 = h();
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.a;
        if (h3 == null || !h3.f12872r || !viewTreeObserverOnGlobalLayoutListenerC0216x.y(i6)) {
            Object obj = new Object();
            obj.f12973c = Boolean.FALSE;
            C h6 = h();
            Boolean g3 = g(i6, viewTreeObserverOnGlobalLayoutListenerC0216x.getEmbeddedViewFocusRect(), new p(obj, i6));
            if (!AbstractC1276k.b(g3, Boolean.TRUE) || h6 == h()) {
                if (g3 != null && obj.f12973c != null) {
                    if (!g3.booleanValue() || !((Boolean) obj.f12973c).booleanValue()) {
                        if ((i6 == 1 || i6 == 2) && z5 && d(i6, false, false)) {
                            Boolean g6 = g(i6, null, new C0208t(i6, 3));
                            if (g6 != null ? g6.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean j(int i6) {
        if (!d(i6, false, false)) {
            return false;
        }
        Boolean g3 = g(i6, null, new C0208t(i6, 2));
        boolean booleanValue = g3 != null ? g3.booleanValue() : false;
        if (!booleanValue) {
            e();
        }
        return booleanValue;
    }

    public final void k(C c6) {
        C c7 = this.f12905h;
        this.f12905h = c6;
        I i6 = this.f12904g;
        Object[] objArr = i6.a;
        int i7 = i6.f12466b;
        for (int i8 = 0; i8 < i7; i8++) {
            ((l) objArr[i8]).a(c7, c6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0345, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0347, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r4.f12455e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (((r4.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        r3 = r4.f12453c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (java.lang.Long.compareUnsigned(r4.f12454d * 32, r3 * 25) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        r3 = r4.a;
        r8 = r4.f12453c;
        r9 = r4.f12452b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e9, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010b, code lost:
    
        r32 = r6;
        r17 = r15;
        r5 = Y3.k.u0(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012c, code lost:
    
        if (r5 == r8) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012e, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013b, code lost:
    
        if (r13 != r17) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0142, code lost:
    
        if (r13 == 254) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0166, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0168, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0186, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0189, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019a, code lost:
    
        if (((r34 >> r6) & 255) != r17) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019c, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r17 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01db, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c0, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e9, code lost:
    
        r33 = r7;
        r4.f12455e = k.V.a(r4.f12453c) - r4.f12454d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0279, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x027d, code lost:
    
        r32 = r3;
        r4.f12454d++;
        r3 = r4.f12455e;
        r5 = r4.a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0297, code lost:
    
        if (((r7 >> r9) & 255) != r17) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0299, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x029b, code lost:
    
        r4.f12455e = r3 - r21;
        r3 = r4.f12453c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fa, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01fc, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0204, code lost:
    
        r3 = k.V.b(r4.f12453c);
        r5 = r4.a;
        r6 = r4.f12452b;
        r7 = r4.f12453c;
        r4.c(r3);
        r3 = r4.a;
        r8 = r4.f12452b;
        r9 = r4.f12453c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021b, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022a, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022c, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r19 = r5;
        r20 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r22 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r22))) | (r5 << r22);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0270, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r19;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026a, code lost:
    
        r16 = r3;
        r19 = r5;
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0201, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c0, code lost:
    
        r33 = true;
        r17 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.q.l(android.view.KeyEvent):boolean");
    }
}
