package z2;

import S.l;
import S0.C0539a;
import S0.r;
import T0.j;
import X3.y;
import android.graphics.Path;
import com.bot.core.database.dao.ConversationDao_Impl;
import com.bot.core.database.dao.MessageDao_Impl;
import j1.AbstractC1135a;
import java.util.List;
import o0.C1397h;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2018a implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16220c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16223g;

    public /* synthetic */ C2018a(Object obj, int i6, int i7, int i8) {
        this.f16220c = i8;
        this.f16221e = obj;
        this.f16222f = i6;
        this.f16223g = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        List messages$lambda$1;
        switch (this.f16220c) {
            case 0:
                return ConversationDao_Impl.b((String) this.f16221e, this.f16222f, this.f16223g, (X1.a) obj);
            case 1:
                messages$lambda$1 = MessageDao_Impl.getMessages$lambda$1("\n        SELECT * FROM messages\n        WHERE conversationId = ?\n        ORDER BY createdAt ASC\n        LIMIT ? OFFSET ?\n    ", (String) this.f16221e, this.f16222f, this.f16223g, (X1.a) obj);
                return messages$lambda$1;
            default:
                C1397h c1397h = (C1397h) this.f16221e;
                r rVar = (r) obj;
                C0539a c0539a = rVar.a;
                int d6 = rVar.d(this.f16222f);
                int d7 = rVar.d(this.f16223g);
                CharSequence charSequence = c0539a.f7618e;
                if (d6 < 0 || d6 > d7 || d7 > charSequence.length()) {
                    StringBuilder j3 = AbstractC1135a.j(d6, "start(", d7, ") or end(", ") is out of range [0..");
                    j3.append(charSequence.length());
                    j3.append("], or start > end!");
                    Y0.a.a(j3.toString());
                }
                Path path = new Path();
                j jVar = c0539a.f7617d;
                jVar.f8316f.getSelectionPath(d6, d7, path);
                int i6 = jVar.f8318h;
                if (i6 != 0 && !path.isEmpty()) {
                    path.offset(l.f7374V, i6);
                }
                C1397h c1397h2 = new C1397h(path);
                float f6 = rVar.f7661f;
                c1397h2.g((Float.floatToRawIntBits(l.f7374V) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
                C1397h.a(c1397h, c1397h2);
                return y.a;
        }
    }
}
