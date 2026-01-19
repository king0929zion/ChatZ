package I;

import android.view.View;

/* loaded from: classes.dex */
public final class e {
    public final f a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2077b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2078c;

    /* renamed from: d, reason: collision with root package name */
    public final View f2079d;

    public e(f fVar, b bVar, b bVar2, View view) {
        this.a = fVar;
        this.f2077b = bVar;
        this.f2078c = bVar2;
        this.f2079d = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r7 != false) goto L33;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.Menu r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            I.b r2 = r0.f2077b
            java.lang.Object r2 = r2.b()
            G.c r2 = (G.c) r2
            r3 = 0
            boolean r3 = m4.AbstractC1276k.b(r2, r3)
            r4 = 0
            if (r3 == 0) goto L15
            return r4
        L15:
            r1.clear()
            java.lang.Object r2 = r2.a
            int r3 = r2.size()
            r5 = 1
            r6 = r4
            r7 = r5
            r8 = r7
        L22:
            if (r6 >= r3) goto Lce
            java.lang.Object r9 = r2.get(r6)
            G.b r9 = (G.b) r9
            boolean r10 = r9 instanceof G.d
            r11 = 2
            if (r10 == 0) goto L4b
            int r10 = r7 + 1
            r12 = r9
            G.d r12 = (G.d) r12
            java.lang.String r12 = r12.f1637b
            android.view.MenuItem r7 = r1.add(r8, r7, r7, r12)
            r7.setShowAsAction(r11)
            I.d r11 = new I.d
            G.d r9 = (G.d) r9
            r12 = 0
            r11.<init>()
            r7.setOnMenuItemClickListener(r11)
        L48:
            r7 = r10
            goto Lc9
        L4b:
            boolean r10 = r9 instanceof G.h
            if (r10 == 0) goto Lc3
            int r10 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r10 < r12) goto Lc9
            int r10 = r7 + 1
            android.view.View r12 = r0.f2079d
            android.content.Context r12 = r12.getContext()
            G.h r9 = (G.h) r9
            android.view.textclassifier.TextClassification r13 = r9.f1645b
            int r9 = r9.f1646c
            r14 = 16908353(0x1020041, float:2.387741E-38)
            if (r9 >= 0) goto L84
            java.lang.CharSequence r9 = r13.getLabel()
            android.view.MenuItem r7 = r1.add(r14, r14, r7, r9)
            r7.setShowAsAction(r11)
            android.graphics.drawable.Drawable r9 = r13.getIcon()
            r7.setIcon(r9)
            I.d r9 = new I.d
            r11 = 1
            r9.<init>()
            r7.setOnMenuItemClickListener(r9)
            goto L48
        L84:
            if (r9 != 0) goto L88
            r15 = r5
            goto L89
        L88:
            r15 = r4
        L89:
            java.util.List r13 = I.u.q(r13)
            java.lang.Object r9 = r13.get(r9)
            android.app.RemoteAction r9 = (android.app.RemoteAction) r9
            if (r15 == 0) goto L97
            r13 = r14
            goto L98
        L97:
            r13 = r4
        L98:
            java.lang.CharSequence r4 = r9.getTitle()
            android.view.MenuItem r4 = r1.add(r14, r13, r7, r4)
            if (r15 == 0) goto La3
            goto La4
        La3:
            r11 = 0
        La4:
            r4.setShowAsAction(r11)
            if (r15 != 0) goto Laf
            boolean r7 = I.u.v(r9)
            if (r7 == 0) goto Lba
        Laf:
            android.graphics.drawable.Icon r7 = r9.getIcon()
            android.graphics.drawable.Drawable r7 = r7.loadDrawable(r12)
            r4.setIcon(r7)
        Lba:
            I.x r7 = new I.x
            r7.<init>()
            r4.setOnMenuItemClickListener(r7)
            goto L48
        Lc3:
            boolean r4 = r9 instanceof G.f
            if (r4 == 0) goto Lc9
            int r8 = r8 + 1
        Lc9:
            int r6 = r6 + 1
            r4 = 0
            goto L22
        Lce:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I.e.a(android.view.Menu):boolean");
    }
}
