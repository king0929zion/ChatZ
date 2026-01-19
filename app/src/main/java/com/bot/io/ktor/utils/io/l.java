package io.ktor.utils.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import m4.C1283r;
import m4.C1286u;
import m4.C1288w;

/* loaded from: classes.dex */
public final class l extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1288w f12231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ char[] f12233g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1286u f12234h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1286u f12235i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1283r f12236j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1283r f12237k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Appendable f12238l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1286u f12239m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C1288w c1288w, int i6, char[] cArr, C1286u c1286u, C1286u c1286u2, C1283r c1283r, C1283r c1283r2, Appendable appendable, C1286u c1286u3) {
        super(1);
        this.f12231e = c1288w;
        this.f12232f = i6;
        this.f12233g = cArr;
        this.f12234h = c1286u;
        this.f12235i = c1286u2;
        this.f12236j = c1283r;
        this.f12237k = c1283r2;
        this.f12238l = appendable;
        this.f12239m = c1286u3;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6;
        long y5;
        long j3;
        boolean z5;
        int i7;
        boolean z6;
        boolean z7;
        char c6;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c7;
        boolean z14;
        boolean z15;
        boolean z16;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        AbstractC1276k.f(byteBuffer, "buffer");
        int position = byteBuffer.position();
        C1288w c1288w = this.f12231e;
        ByteBuffer byteBuffer2 = (ByteBuffer) c1288w.f12973c;
        if (byteBuffer2 != null) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(Math.min(byteBuffer.limit(), byteBuffer2.remaining() + byteBuffer.position()));
            byteBuffer2.put(byteBuffer);
            byteBuffer2.flip();
            byteBuffer.limit(limit);
        } else {
            byteBuffer2 = byteBuffer;
        }
        int i8 = this.f12232f;
        C1286u c1286u = this.f12234h;
        char[] cArr = this.f12233g;
        int length = cArr.length;
        if (i8 != Integer.MAX_VALUE) {
            length = Math.min(length, i8 - c1286u.f12971c);
        }
        AbstractC1276k.f(cArr, "out");
        if (byteBuffer2.hasArray()) {
            byte[] array = byteBuffer2.array();
            int position2 = byteBuffer2.position() + byteBuffer2.arrayOffset();
            int remaining = byteBuffer2.remaining() + position2;
            if (position2 > remaining) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (remaining > array.length) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (length > cArr.length) {
                throw Y4.l.F(length, cArr.length);
            }
            boolean z17 = false;
            int i9 = 0;
            while (position2 < remaining && i9 < length) {
                int i10 = position2 + 1;
                byte b5 = array[position2];
                if (b5 >= 0) {
                    char c8 = (char) b5;
                    i6 = position;
                    if (c8 == '\r') {
                        z12 = true;
                        z17 = true;
                    } else if (c8 == '\n') {
                        z12 = false;
                        z17 = false;
                    } else {
                        z12 = !z17;
                    }
                    if (!z12) {
                        byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                        j3 = Y4.l.y(i9, -1);
                        break;
                    }
                    cArr[i9] = c8;
                    i9++;
                    position2 = i10;
                    position = i6;
                } else {
                    i6 = position;
                    z11 = z17;
                    if ((b5 & 224) == 192) {
                        if (i10 >= remaining) {
                            byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                            j3 = Y4.l.y(i9, 2);
                            break;
                        }
                        int i11 = position2 + 2;
                        char c9 = (char) ((array[i10] & 63) | ((b5 & 31) << 6));
                        if (c9 == '\r') {
                            z16 = true;
                            z11 = true;
                        } else if (c9 == '\n') {
                            z16 = false;
                            z11 = false;
                        } else {
                            z16 = !z11;
                        }
                        if (!z16) {
                            byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                            j3 = Y4.l.y(i9, -1);
                            break;
                        }
                        cArr[i9] = c9;
                        position2 = i11;
                        i9++;
                        position = i6;
                        z17 = z11;
                    } else {
                        if ((b5 & 240) != 224) {
                            if ((b5 & 248) != 240) {
                                Y4.l.X(b5);
                                throw null;
                            }
                            if (remaining - i10 < 3) {
                                byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                                j3 = Y4.l.y(i9, 4);
                                break;
                            }
                            int i12 = position2 + 4;
                            int i13 = ((array[position2 + 2] & 63) << 6) | ((array[i10] & 63) << 12) | ((b5 & 7) << 18) | (array[position2 + 3] & 63);
                            if (i13 > 1114111) {
                                Y4.l.J(i13);
                                throw null;
                            }
                            if (length - i9 < 2) {
                                byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                                j3 = Y4.l.y(i9, 0);
                                break;
                            }
                            char c10 = (char) ((i13 >>> 10) + 55232);
                            char c11 = (char) ((i13 & 1023) + 56320);
                            if (c10 == '\r') {
                                z14 = true;
                                z11 = true;
                                c7 = '\n';
                            } else {
                                c7 = '\n';
                                if (c10 == '\n') {
                                    z14 = false;
                                    z11 = false;
                                } else {
                                    z14 = !z11;
                                }
                            }
                            if (z14) {
                                if (c11 == '\r') {
                                    z15 = true;
                                    z11 = true;
                                } else if (c11 == c7) {
                                    z15 = false;
                                    z11 = false;
                                } else {
                                    z15 = !z11;
                                }
                                if (z15) {
                                    int i14 = i9 + 1;
                                    cArr[i9] = c10;
                                    i9 += 2;
                                    cArr[i14] = c11;
                                    position = i6;
                                    z17 = z11;
                                    position2 = i12;
                                }
                            }
                            z17 = z11;
                            byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                            j3 = Y4.l.y(i9, -1);
                            break;
                        }
                        if (remaining - i10 < 2) {
                            byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                            j3 = Y4.l.y(i9, 3);
                            break;
                        }
                        byte b6 = array[i10];
                        i10 = position2 + 3;
                        char c12 = (char) ((array[position2 + 2] & 63) | ((b6 & 63) << 6) | ((b5 & 15) << 12));
                        if (c12 == '\r') {
                            z17 = true;
                            z13 = true;
                        } else {
                            if (c12 == '\n') {
                                z17 = false;
                            } else if (z11) {
                                z17 = z11;
                            } else {
                                z13 = true;
                                z17 = z11;
                            }
                            z13 = false;
                        }
                        if (!z13) {
                            byteBuffer2.position((position2 - 1) - byteBuffer2.arrayOffset());
                            j3 = Y4.l.y(i9, -1);
                            break;
                        }
                        cArr[i9] = c12;
                        i9++;
                        position2 = i10;
                        position = i6;
                    }
                }
            }
            i6 = position;
            z11 = z17;
            byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
            j3 = Y4.l.y(i9, 0);
            z17 = z11;
            int i15 = (int) (j3 & 4294967295L);
            if (i15 == -1) {
                int i16 = (int) (j3 >> 32);
                if (z17) {
                    j3 = Y4.l.y(i16 - 1, -1);
                } else {
                    byteBuffer2.position(byteBuffer2.position() + 1);
                    if (i16 > 0) {
                        int i17 = i16 - 1;
                        if (cArr[i17] == '\r') {
                            j3 = Y4.l.y(i17, -1);
                        }
                    }
                }
            } else if (i15 == 0 && z17) {
                byteBuffer2.position(byteBuffer2.position() - 1);
                j3 = Y4.l.y(((int) (j3 >> 32)) - 1, 2);
            }
        } else {
            i6 = position;
            if (length > cArr.length) {
                throw Y4.l.F(length, cArr.length);
            }
            boolean z18 = false;
            int i18 = 0;
            while (byteBuffer2.hasRemaining() && i18 < length) {
                byte b7 = byteBuffer2.get();
                if (b7 >= 0) {
                    char c13 = (char) b7;
                    if (c13 == '\r') {
                        z18 = true;
                        z5 = true;
                    } else {
                        if (c13 == '\n') {
                            z18 = false;
                        } else if (!z18) {
                            z5 = true;
                        }
                        z5 = false;
                    }
                    if (!z5) {
                        byteBuffer2.position(byteBuffer2.position() - 1);
                        j3 = Y4.l.y(i18, -1);
                        break;
                    }
                    i7 = i18 + 1;
                    cArr[i18] = c13;
                    i18 = i7;
                } else if ((b7 & 224) == 192) {
                    if (!byteBuffer2.hasRemaining()) {
                        byteBuffer2.position(byteBuffer2.position() - 1);
                        j3 = Y4.l.y(i18, 2);
                        break;
                    }
                    char c14 = (char) (((b7 & 31) << 6) | (byteBuffer2.get() & 63));
                    if (c14 == '\r') {
                        z18 = true;
                        z6 = true;
                    } else {
                        if (c14 == '\n') {
                            z18 = false;
                        } else if (!z18) {
                            z6 = true;
                        }
                        z6 = false;
                    }
                    if (!z6) {
                        byteBuffer2.position(byteBuffer2.position() - 2);
                        j3 = Y4.l.y(i18, -1);
                        break;
                    }
                    i7 = i18 + 1;
                    cArr[i18] = c14;
                    i18 = i7;
                } else {
                    if ((b7 & 240) != 224) {
                        if ((b7 & 248) != 240) {
                            Y4.l.X(b7);
                            throw null;
                        }
                        if (byteBuffer2.remaining() < 3) {
                            byteBuffer2.position(byteBuffer2.position() - 1);
                            j3 = Y4.l.y(i18, 4);
                            break;
                        }
                        int i19 = ((b7 & 7) << 18) | ((byteBuffer2.get() & 63) << 12) | ((byteBuffer2.get() & 63) << 6) | (byteBuffer2.get() & 63);
                        if (i19 > 1114111) {
                            Y4.l.J(i19);
                            throw null;
                        }
                        if (length - i18 < 2) {
                            byteBuffer2.position(byteBuffer2.position() - 4);
                            y5 = Y4.l.y(i18, 0);
                            break;
                        }
                        char c15 = (char) ((i19 >>> 10) + 55232);
                        char c16 = (char) ((i19 & 1023) + 56320);
                        if (c15 == '\r') {
                            z9 = true;
                            z8 = true;
                            c6 = '\n';
                        } else {
                            c6 = '\n';
                            if (c15 == '\n') {
                                z9 = false;
                                z8 = false;
                            } else if (z18) {
                                z8 = z18;
                                z9 = false;
                            } else {
                                z8 = z18;
                                z9 = true;
                            }
                        }
                        if (z9) {
                            if (c16 == '\r') {
                                z18 = true;
                                z10 = true;
                            } else {
                                if (c16 == c6) {
                                    z18 = false;
                                } else if (z8) {
                                    z18 = z8;
                                } else {
                                    z10 = true;
                                    z18 = z8;
                                }
                                z10 = false;
                            }
                            if (z10) {
                                int i20 = i18 + 1;
                                cArr[i18] = c15;
                                i18 += 2;
                                cArr[i20] = c16;
                            }
                        } else {
                            z18 = z8;
                        }
                        byteBuffer2.position(byteBuffer2.position() - 4);
                        j3 = Y4.l.y(i18, -1);
                        break;
                    }
                    if (byteBuffer2.remaining() < 2) {
                        byteBuffer2.position(byteBuffer2.position() - 1);
                        j3 = Y4.l.y(i18, 3);
                        break;
                    }
                    char c17 = (char) (((b7 & 15) << 12) | ((byteBuffer2.get() & 63) << 6) | (byteBuffer2.get() & 63));
                    if (c17 == '\r') {
                        z18 = true;
                        z7 = true;
                    } else {
                        if (c17 == '\n') {
                            z18 = false;
                        } else if (!z18) {
                            z7 = true;
                        }
                        z7 = false;
                    }
                    if (!z7) {
                        byteBuffer2.position(byteBuffer2.position() - 3);
                        j3 = Y4.l.y(i18, -1);
                        break;
                    }
                    i7 = i18 + 1;
                    cArr[i18] = c17;
                    i18 = i7;
                }
            }
            y5 = Y4.l.y(i18, 0);
            j3 = y5;
            int i21 = (int) (j3 & 4294967295L);
            if (i21 == -1) {
                int i22 = (int) (j3 >> 32);
                if (z18) {
                    j3 = Y4.l.y(i22 - 1, -1);
                } else {
                    byteBuffer2.position(byteBuffer2.position() + 1);
                    if (i22 > 0) {
                        int i23 = i22 - 1;
                        if (cArr[i23] == '\r') {
                            j3 = Y4.l.y(i23, -1);
                        }
                    }
                }
            } else if (i21 == 0 && z18) {
                byteBuffer2.position(byteBuffer2.position() - 1);
                j3 = Y4.l.y(((int) (j3 >> 32)) - 1, 2);
            }
        }
        ByteBuffer byteBuffer3 = (ByteBuffer) c1288w.f12973c;
        C1286u c1286u2 = this.f12239m;
        if (byteBuffer3 != null) {
            byteBuffer.position((byteBuffer3.position() + i6) - c1286u2.f12971c);
            io.ktor.utils.io.internal.f.f12170b.X(byteBuffer3);
            c1288w.f12973c = null;
            c1286u2.f12971c = 0;
        }
        int i24 = (int) (j3 >> 32);
        int i25 = (int) (j3 & 4294967295L);
        this.f12235i.f12971c = Math.max(1, i25);
        C1283r c1283r = this.f12236j;
        int i26 = -1;
        if (i25 == -1) {
            c1283r.f12968c = true;
        }
        if (i25 != -1) {
            if (byteBuffer.hasRemaining() && byteBuffer.get(byteBuffer.position()) == 13) {
                byteBuffer.position(byteBuffer.position() + 1);
                this.f12237k.f12968c = true;
            }
            i26 = -1;
        }
        if (i25 != i26 && byteBuffer.hasRemaining() && byteBuffer.get(byteBuffer.position()) == 10) {
            byteBuffer.position(byteBuffer.position() + 1);
            c1283r.f12968c = true;
        }
        Appendable appendable = this.f12238l;
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(cArr, 0, i24);
        } else {
            appendable.append(CharBuffer.wrap(cArr, 0, i24), 0, i24);
        }
        c1286u.f12971c += i24;
        if (i24 == 0 && byteBuffer.remaining() < i25) {
            Object v5 = io.ktor.utils.io.internal.f.f12170b.v();
            c1286u2.f12971c = byteBuffer.remaining();
            ((ByteBuffer) v5).put(byteBuffer);
            c1288w.f12973c = v5;
        }
        if (i8 == Integer.MAX_VALUE || c1286u.f12971c < i8 || c1283r.f12968c) {
            return X3.y.a;
        }
        throw new T3.b("Line is longer than limit");
    }
}
