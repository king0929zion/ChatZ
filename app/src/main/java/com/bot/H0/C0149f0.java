package H0;

import I0.C0219y0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import h0.AbstractC1040q;
import h0.InterfaceC1039p;
import h0.InterfaceC1041r;
import java.util.HashSet;
import m4.AbstractC1276k;

/* renamed from: H0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149f0 {
    public final J a;

    /* renamed from: b, reason: collision with root package name */
    public final C0147e0 f1915b;

    /* renamed from: c, reason: collision with root package name */
    public final C0165u f1916c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f1917d;

    /* renamed from: e, reason: collision with root package name */
    public final C0 f1918e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1040q f1919f;

    /* renamed from: g, reason: collision with root package name */
    public V.e f1920g;

    /* renamed from: h, reason: collision with root package name */
    public V.e f1921h;

    /* renamed from: i, reason: collision with root package name */
    public final V.e f1922i;

    /* renamed from: j, reason: collision with root package name */
    public C0145d0 f1923j;

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, H0.e0] */
    public C0149f0(J j3) {
        this.a = j3;
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f11809g = -1;
        this.f1915b = abstractC1040q;
        C0165u c0165u = new C0165u(j3);
        this.f1916c = c0165u;
        this.f1917d = c0165u;
        C0 c02 = c0165u.f1999V;
        this.f1918e = c02;
        this.f1919f = c02;
        this.f1922i = new V.e(new InterfaceC1041r[16]);
    }

    public static final void a(C0149f0 c0149f0, AbstractC1040q abstractC1040q, i0 i0Var) {
        for (AbstractC1040q abstractC1040q2 = abstractC1040q.f11810h; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11810h) {
            if (abstractC1040q2 == c0149f0.f1915b) {
                J v5 = c0149f0.a.v();
                i0Var.f1956t = v5 != null ? v5.f1721J.f1916c : null;
                c0149f0.f1917d = i0Var;
                return;
            } else {
                if ((abstractC1040q2.f11808f & 2) != 0) {
                    return;
                }
                abstractC1040q2.L0(i0Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h0.q, H0.b] */
    public static AbstractC1040q b(InterfaceC1039p interfaceC1039p, AbstractC1040q abstractC1040q) {
        AbstractC1040q abstractC1040q2;
        if (interfaceC1039p instanceof AbstractC0141b0) {
            abstractC1040q2 = ((AbstractC0141b0) interfaceC1039p).e();
            abstractC1040q2.f11808f = j0.f(abstractC1040q2);
        } else {
            ?? abstractC1040q3 = new AbstractC1040q();
            abstractC1040q3.f11808f = j0.d(interfaceC1039p);
            abstractC1040q3.f1887r = interfaceC1039p;
            new HashSet();
            abstractC1040q2 = abstractC1040q3;
        }
        if (abstractC1040q2.f11819q) {
            E0.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC1040q2.f11814l = true;
        AbstractC1040q abstractC1040q4 = abstractC1040q.f11811i;
        if (abstractC1040q4 != null) {
            abstractC1040q4.f11810h = abstractC1040q2;
            abstractC1040q2.f11811i = abstractC1040q4;
        }
        abstractC1040q.f11811i = abstractC1040q2;
        abstractC1040q2.f11810h = abstractC1040q;
        return abstractC1040q2;
    }

    public static AbstractC1040q c(AbstractC1040q abstractC1040q) {
        boolean z5 = abstractC1040q.f11819q;
        if (z5) {
            k.H h3 = j0.a;
            if (!z5) {
                E0.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            j0.a(abstractC1040q, -1, 2);
            abstractC1040q.J0();
            abstractC1040q.D0();
        }
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11811i;
        AbstractC1040q abstractC1040q3 = abstractC1040q.f11810h;
        if (abstractC1040q2 != null) {
            abstractC1040q2.f11810h = abstractC1040q3;
            abstractC1040q.f11811i = null;
        }
        if (abstractC1040q3 != null) {
            abstractC1040q3.f11811i = abstractC1040q2;
            abstractC1040q.f11810h = null;
        }
        AbstractC1276k.c(abstractC1040q3);
        return abstractC1040q3;
    }

    public static void h(InterfaceC1039p interfaceC1039p, InterfaceC1039p interfaceC1039p2, AbstractC1040q abstractC1040q) {
        if ((interfaceC1039p instanceof AbstractC0141b0) && (interfaceC1039p2 instanceof AbstractC0141b0)) {
            AbstractC1276k.d(abstractC1040q, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC0141b0) interfaceC1039p2).g(abstractC1040q);
            if (abstractC1040q.f11819q) {
                j0.c(abstractC1040q);
                return;
            } else {
                abstractC1040q.f11815m = true;
                return;
            }
        }
        if (!(abstractC1040q instanceof C0140b)) {
            E0.a.b("Unknown Modifier.Node type");
            return;
        }
        C0140b c0140b = (C0140b) abstractC1040q;
        boolean z5 = c0140b.f11819q;
        if (z5) {
            if (!z5) {
                E0.a.b("unInitializeModifier called on unattached node");
            }
            if ((c0140b.f11808f & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c0140b)).E();
            }
        }
        c0140b.f1887r = interfaceC1039p2;
        c0140b.f11808f = j0.d(interfaceC1039p2);
        if (c0140b.f11819q) {
            c0140b.M0(false);
        }
        if (abstractC1040q.f11819q) {
            j0.c(abstractC1040q);
        } else {
            abstractC1040q.f11815m = true;
        }
    }

    public final boolean d(int i6) {
        return (i6 & this.f1919f.f11809g) != 0;
    }

    public final void e() {
        for (AbstractC1040q abstractC1040q = this.f1919f; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
            abstractC1040q.I0();
            if (abstractC1040q.f11814l) {
                k.H h3 = j0.a;
                if (!abstractC1040q.f11819q) {
                    E0.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                j0.a(abstractC1040q, -1, 1);
            }
            if (abstractC1040q.f11815m) {
                j0.c(abstractC1040q);
            }
            abstractC1040q.f11814l = false;
            abstractC1040q.f11815m = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
    
        if (r11 <= r15) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r32, V.e r33, V.e r34, h0.AbstractC1040q r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0149f0.f(int, V.e, V.e, h0.q, boolean):void");
    }

    public final void g() {
        J j3;
        B b5;
        AbstractC1040q abstractC1040q = this.f1918e.f11810h;
        i0 i0Var = this.f1916c;
        AbstractC1040q abstractC1040q2 = abstractC1040q;
        while (true) {
            j3 = this.a;
            if (abstractC1040q2 == null) {
                break;
            }
            InterfaceC0170z f6 = AbstractC0157l.f(abstractC1040q2);
            if (f6 != null) {
                i0 i0Var2 = abstractC1040q2.f11813k;
                if (i0Var2 != null) {
                    B b6 = (B) i0Var2;
                    InterfaceC0170z interfaceC0170z = b6.f1688V;
                    b6.y1(f6);
                    b5 = b6;
                    if (interfaceC0170z != abstractC1040q2) {
                        q0 q0Var = b6.f1952O;
                        b5 = b6;
                        if (q0Var != null) {
                            ((C0219y0) q0Var).invalidate();
                            b5 = b6;
                        }
                    }
                } else {
                    B b7 = new B(j3, f6);
                    abstractC1040q2.L0(b7);
                    b5 = b7;
                }
                i0Var.f1956t = b5;
                b5.f1955s = i0Var;
                i0Var = b5;
            } else {
                abstractC1040q2.L0(i0Var);
            }
            abstractC1040q2 = abstractC1040q2.f11810h;
        }
        J v5 = j3.v();
        i0Var.f1956t = v5 != null ? v5.f1721J.f1916c : null;
        this.f1917d = i0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        AbstractC1040q abstractC1040q = this.f1919f;
        C0 c02 = this.f1918e;
        if (abstractC1040q != c02) {
            while (true) {
                if (abstractC1040q == null || abstractC1040q == c02) {
                    break;
                }
                sb.append(String.valueOf(abstractC1040q));
                if (abstractC1040q.f11811i == c02) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                abstractC1040q = abstractC1040q.f11811i;
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
