package O4;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonNull;
import m4.AbstractC1276k;
import m4.AbstractC1291z;

/* loaded from: classes.dex */
public final class u {
    public final L1.l a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4363b;

    /* renamed from: c, reason: collision with root package name */
    public int f4364c;

    public u(N4.h hVar, L1.l lVar) {
        this.a = lVar;
        this.f4363b = hVar.f3899c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(O4.u r9, X3.b r10, d4.a r11) {
        /*
            L1.l r0 = r9.a
            boolean r1 = r11 instanceof O4.t
            if (r1 == 0) goto L15
            r1 = r11
            O4.t r1 = (O4.t) r1
            int r2 = r1.f4362m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f4362m = r2
            goto L1a
        L15:
            O4.t r1 = new O4.t
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.f4360k
            int r2 = r1.f4362m
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L58
            if (r2 != r8) goto L50
            java.lang.String r9 = r1.f4359j
            java.util.LinkedHashMap r10 = r1.f4358i
            O4.u r0 = r1.f4357h
            X3.b r2 = r1.f4356g
            X3.a.e(r11)
            kotlinx.serialization.json.b r11 = (kotlinx.serialization.json.b) r11
            r10.put(r9, r11)
            L1.l r9 = r0.a
            byte r9 = r9.f()
            if (r9 == r7) goto L4b
            if (r9 != r6) goto L43
            goto L98
        L43:
            L1.l r9 = r0.a
            java.lang.String r10 = "Expected end of the object or comma"
            L1.l.p(r9, r10, r3, r4, r5)
            throw r4
        L4b:
            r11 = r9
            r9 = r0
            r0 = r10
            r10 = r2
            goto L6a
        L50:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L58:
            X3.a.e(r11)
            byte r11 = r0.g(r5)
            byte r2 = r0.z()
            if (r2 == r7) goto Lae
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L6a:
            L1.l r2 = r9.a
            boolean r3 = r2.c()
            if (r3 == 0) goto L95
            boolean r11 = r9.f4363b
            if (r11 == 0) goto L7b
            java.lang.String r11 = r2.k()
            goto L7f
        L7b:
            java.lang.String r11 = r2.j()
        L7f:
            r3 = 5
            r2.g(r3)
            r1.f4356g = r10
            r1.f4357h = r9
            r1.f4358i = r0
            r1.f4359j = r11
            r1.f4362m = r8
            r10.getClass()
            r10.f9386e = r1
            c4.a r9 = c4.EnumC0927a.f11114c
            return r9
        L95:
            r10 = r0
            r0 = r9
            r9 = r11
        L98:
            L1.l r11 = r0.a
            if (r9 != r5) goto La0
            r11.g(r6)
            goto La2
        La0:
            if (r9 == r7) goto La8
        La2:
            kotlinx.serialization.json.c r9 = new kotlinx.serialization.json.c
            r9.<init>(r10)
            return r9
        La8:
            java.lang.String r9 = "object"
            O4.m.k(r11, r9)
            throw r4
        Lae:
            java.lang.String r9 = "Unexpected leading comma"
            L1.l.p(r0, r9, r3, r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.u.a(O4.u, X3.b, d4.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [X3.b, java.lang.Object, b4.c] */
    public final kotlinx.serialization.json.b b() {
        kotlinx.serialization.json.b cVar;
        Object obj;
        L1.l lVar = this.a;
        byte z5 = lVar.z();
        if (z5 == 1) {
            return d(true);
        }
        if (z5 == 0) {
            return d(false);
        }
        if (z5 != 6) {
            if (z5 == 8) {
                return c();
            }
            L1.l.p(lVar, "Cannot read Json element because of unexpected ".concat(m.p(z5)), 0, null, 6);
            throw null;
        }
        int i6 = this.f4364c + 1;
        this.f4364c = i6;
        if (i6 == 200) {
            s sVar = new s(this, null);
            ?? obj2 = new Object();
            obj2.f9385c = sVar;
            obj2.f9386e = obj2;
            EnumC0927a enumC0927a = X3.a.a;
            obj2.f9387f = enumC0927a;
            while (true) {
                obj = obj2.f9387f;
                InterfaceC0905c interfaceC0905c = obj2.f9386e;
                if (interfaceC0905c == null) {
                    break;
                }
                if (AbstractC1276k.b(enumC0927a, obj)) {
                    try {
                        s sVar2 = obj2.f9385c;
                        AbstractC1291z.b(3, sVar2);
                        s sVar3 = new s(sVar2.f4355h, interfaceC0905c);
                        sVar3.f4354g = obj2;
                        Object r5 = sVar3.r(X3.y.a);
                        if (r5 != EnumC0927a.f11114c) {
                            interfaceC0905c.k(r5);
                        }
                    } catch (Throwable th) {
                        interfaceC0905c.k(X3.a.b(th));
                    }
                } else {
                    obj2.f9387f = enumC0927a;
                    interfaceC0905c.k(obj);
                }
            }
            X3.a.e(obj);
            cVar = (kotlinx.serialization.json.b) obj;
        } else {
            byte g3 = lVar.g((byte) 6);
            if (lVar.z() == 4) {
                L1.l.p(lVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!lVar.c()) {
                    break;
                }
                String k3 = this.f4363b ? lVar.k() : lVar.j();
                lVar.g((byte) 5);
                linkedHashMap.put(k3, b());
                g3 = lVar.f();
                if (g3 != 4) {
                    if (g3 != 7) {
                        L1.l.p(lVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (g3 == 6) {
                lVar.g((byte) 7);
            } else if (g3 == 4) {
                m.k(lVar, "object");
                throw null;
            }
            cVar = new kotlinx.serialization.json.c(linkedHashMap);
        }
        this.f4364c--;
        return cVar;
    }

    public final kotlinx.serialization.json.a c() {
        L1.l lVar = this.a;
        byte f6 = lVar.f();
        if (lVar.z() == 4) {
            L1.l.p(lVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (lVar.c()) {
            arrayList.add(b());
            f6 = lVar.f();
            if (f6 != 4) {
                boolean z5 = f6 == 9;
                int i6 = lVar.f3045b;
                if (!z5) {
                    L1.l.p(lVar, "Expected end of the array or comma", i6, null, 4);
                    throw null;
                }
            }
        }
        if (f6 == 8) {
            lVar.g((byte) 9);
        } else if (f6 == 4) {
            m.k(lVar, "array");
            throw null;
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public final kotlinx.serialization.json.d d(boolean z5) {
        boolean z6 = this.f4363b;
        L1.l lVar = this.a;
        String k3 = (z6 || !z5) ? lVar.k() : lVar.j();
        return (z5 || !AbstractC1276k.b(k3, "null")) ? new N4.n(k3, z5) : JsonNull.INSTANCE;
    }
}
