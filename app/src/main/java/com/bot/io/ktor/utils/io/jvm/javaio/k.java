package io.ktor.utils.io.jvm.javaio;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import io.ktor.utils.io.C;
import io.ktor.utils.io.t;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public byte[] f12212h;

    /* renamed from: i, reason: collision with root package name */
    public int f12213i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f12214j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ W3.e f12215k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InputStream f12216l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(W3.e eVar, InputStream inputStream, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12215k = eVar;
        this.f12216l = inputStream;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((k) p((InterfaceC0905c) obj2, (C) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        k kVar = new k(this.f12215k, this.f12216l, interfaceC0905c);
        kVar.f12214j = obj;
        return kVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        byte[] bArr;
        C c6;
        int i6 = this.f12213i;
        InputStream inputStream = this.f12216l;
        W3.e eVar = this.f12215k;
        if (i6 == 0) {
            X3.a.e(obj);
            C c7 = (C) this.f12214j;
            bArr = (byte[]) eVar.v();
            c6 = c7;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = this.f12212h;
            c6 = (C) this.f12214j;
            try {
                X3.a.e(obj);
            } catch (Throwable th) {
                try {
                    c6.f12089c.i(th);
                    eVar.X(bArr);
                    inputStream.close();
                    return y.a;
                } catch (Throwable th2) {
                    eVar.X(bArr);
                    inputStream.close();
                    throw th2;
                }
            }
        }
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read < 0) {
                eVar.X(bArr);
                break;
            }
            if (read != 0) {
                t tVar = c6.f12089c;
                this.f12214j = c6;
                this.f12212h = bArr;
                this.f12213i = 1;
                Object V5 = tVar.V(bArr, read, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (V5 == enumC0927a) {
                    return enumC0927a;
                }
            }
        }
    }
}
