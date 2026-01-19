package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12181c;

    /* renamed from: d, reason: collision with root package name */
    public final i f12182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, int i6) {
        super(iVar.a, iVar.f12184b);
        this.f12181c = i6;
        switch (i6) {
            case 1:
                super(iVar.a, iVar.f12184b);
                this.f12182d = iVar;
                return;
            case 2:
                super(iVar.a, iVar.f12184b);
                this.f12182d = iVar;
                return;
            default:
                this.f12182d = iVar;
                return;
        }
    }

    @Override // io.ktor.utils.io.internal.l
    public ByteBuffer a() {
        switch (this.f12181c) {
            case 0:
                return this.f12182d.f12176d;
            case 1:
                return this.f12182d.f12176d;
            default:
                return super.a();
        }
    }

    @Override // io.ktor.utils.io.internal.l
    public ByteBuffer b() {
        switch (this.f12181c) {
            case 1:
                return this.f12182d.f12175c;
            case 2:
                return this.f12182d.f12175c;
            default:
                return super.b();
        }
    }

    @Override // io.ktor.utils.io.internal.l
    public l c() {
        switch (this.f12181c) {
            case 2:
                return this.f12182d.f12180h;
            default:
                return super.c();
        }
    }

    @Override // io.ktor.utils.io.internal.l
    public l d() {
        switch (this.f12181c) {
            case 0:
                return this.f12182d.f12180h;
            default:
                return super.d();
        }
    }

    @Override // io.ktor.utils.io.internal.l
    public l e() {
        switch (this.f12181c) {
            case 0:
                return this.f12182d.f12177e;
            case 1:
                return this.f12182d.f12179g;
            default:
                return super.e();
        }
    }

    @Override // io.ktor.utils.io.internal.l
    public l f() {
        switch (this.f12181c) {
            case 1:
                return this.f12182d.f12178f;
            case 2:
                return this.f12182d.f12177e;
            default:
                return super.f();
        }
    }

    public final String toString() {
        switch (this.f12181c) {
            case 0:
                return "Reading";
            case 1:
                return "Reading+Writing";
            default:
                return "Writing";
        }
    }
}
