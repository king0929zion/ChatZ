package io.ktor.utils.io.jvm.javaio;

import X3.y;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import x4.InterfaceC1900M;
import x4.InterfaceC1922e0;

/* loaded from: classes.dex */
public final class a implements InterfaceC0905c {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0910h f12193c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f12194e;

    public a(b bVar) {
        InterfaceC0910h interfaceC0910h;
        this.f12194e = bVar;
        InterfaceC1922e0 interfaceC1922e0 = bVar.a;
        if (interfaceC1922e0 != null) {
            l lVar = l.f12217f;
            lVar.getClass();
            interfaceC0910h = Y4.d.P(lVar, interfaceC1922e0);
        } else {
            interfaceC0910h = l.f12217f;
        }
        this.f12193c = interfaceC0910h;
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        Object obj2;
        boolean z5;
        boolean z6;
        Throwable a;
        InterfaceC1922e0 interfaceC1922e0;
        Object a6 = X3.l.a(obj);
        if (a6 == null) {
            a6 = y.a;
        }
        b bVar = this.f12194e;
        do {
            obj2 = bVar.state;
            z5 = obj2 instanceof Thread;
            z6 = true;
            if (!(z5 ? true : obj2 instanceof InterfaceC0905c ? true : AbstractC1276k.b(obj2, this))) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f12195f;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(bVar, obj2, a6)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(bVar) != obj2) {
                    z6 = false;
                    break;
                }
            }
        } while (!z6);
        if (z5) {
            i iVar = (i) j.a.get();
            if (iVar == null) {
                iVar = e.f12201b;
            }
            iVar.b(obj2);
        } else if ((obj2 instanceof InterfaceC0905c) && (a = X3.l.a(obj)) != null) {
            ((InterfaceC0905c) obj2).k(X3.a.b(a));
        }
        if ((obj instanceof X3.k) && !(X3.l.a(obj) instanceof CancellationException) && (interfaceC1922e0 = this.f12194e.a) != null) {
            interfaceC1922e0.f(null);
        }
        InterfaceC1900M interfaceC1900M = this.f12194e.f12197c;
        if (interfaceC1900M != null) {
            interfaceC1900M.dispose();
        }
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return this.f12193c;
    }
}
