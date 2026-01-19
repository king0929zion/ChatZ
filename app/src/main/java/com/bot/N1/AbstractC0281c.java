package N1;

import i4.AbstractC1120d;
import java.util.Collection;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: N1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0281c {
    public abstract void bind(X1.c cVar, Object obj);

    public abstract String createQuery();

    public final void insert(X1.a aVar, Object obj) {
        AbstractC1276k.f(aVar, "connection");
        if (obj == null) {
            return;
        }
        X1.c c02 = aVar.c0(createQuery());
        try {
            bind(c02, obj);
            c02.Z();
            AbstractC1120d.h(c02, null);
        } finally {
        }
    }

    public final long insertAndReturnId(X1.a aVar, Object obj) {
        AbstractC1276k.f(aVar, "connection");
        if (obj == null) {
            return -1L;
        }
        X1.c c02 = aVar.c0(createQuery());
        try {
            bind(c02, obj);
            c02.Z();
            AbstractC1120d.h(c02, null);
            return s4.j.x(aVar);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(X1.a aVar, Collection<Object> collection) {
        long j3;
        AbstractC1276k.f(aVar, "connection");
        if (collection == null) {
            return new long[0];
        }
        X1.c c02 = aVar.c0(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i6 = 0; i6 < size; i6++) {
                Object m02 = Y3.m.m0(i6, collection);
                if (m02 != null) {
                    bind(c02, m02);
                    c02.Z();
                    c02.reset();
                    j3 = s4.j.x(aVar);
                } else {
                    j3 = -1;
                }
                jArr[i6] = j3;
            }
            AbstractC1120d.h(c02, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(X1.a aVar, Collection<Object> collection) {
        long j3;
        AbstractC1276k.f(aVar, "connection");
        if (collection == null) {
            return new Long[0];
        }
        X1.c c02 = aVar.c0(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i6 = 0; i6 < size; i6++) {
                Object m02 = Y3.m.m0(i6, collection);
                if (m02 != null) {
                    bind(c02, m02);
                    c02.Z();
                    c02.reset();
                    j3 = s4.j.x(aVar);
                } else {
                    j3 = -1;
                }
                lArr[i6] = Long.valueOf(j3);
            }
            AbstractC1120d.h(c02, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(X1.a aVar, Object[] objArr) {
        AbstractC1276k.f(aVar, "connection");
        if (objArr == null) {
            return Y3.v.f9812c;
        }
        Z3.b w5 = Y4.l.w();
        X1.c c02 = aVar.c0(createQuery());
        try {
            for (Object obj : objArr) {
                if (obj != null) {
                    bind(c02, obj);
                    c02.Z();
                    c02.reset();
                    w5.add(Long.valueOf(s4.j.x(aVar)));
                } else {
                    w5.add(-1L);
                }
            }
            AbstractC1120d.h(c02, null);
            return Y4.l.p(w5);
        } finally {
        }
    }

    public final void insert(X1.a aVar, Object[] objArr) {
        AbstractC1276k.f(aVar, "connection");
        if (objArr == null) {
            return;
        }
        X1.c c02 = aVar.c0(createQuery());
        try {
            K4.h i6 = AbstractC1276k.i(objArr);
            while (i6.hasNext()) {
                Object next = i6.next();
                if (next != null) {
                    bind(c02, next);
                    c02.Z();
                    c02.reset();
                }
            }
            AbstractC1120d.h(c02, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1120d.h(c02, th);
                throw th2;
            }
        }
    }

    public final void insert(X1.a aVar, Iterable<Object> iterable) {
        AbstractC1276k.f(aVar, "connection");
        if (iterable == null) {
            return;
        }
        X1.c c02 = aVar.c0(createQuery());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(c02, obj);
                    c02.Z();
                    c02.reset();
                }
            }
            AbstractC1120d.h(c02, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1120d.h(c02, th);
                throw th2;
            }
        }
    }

    public final long[] insertAndReturnIdsArray(X1.a aVar, Object[] objArr) {
        long j3;
        AbstractC1276k.f(aVar, "connection");
        if (objArr == null) {
            return new long[0];
        }
        X1.c c02 = aVar.c0(createQuery());
        try {
            int length = objArr.length;
            long[] jArr = new long[length];
            for (int i6 = 0; i6 < length; i6++) {
                Object obj = objArr[i6];
                if (obj != null) {
                    bind(c02, obj);
                    c02.Z();
                    c02.reset();
                    j3 = s4.j.x(aVar);
                } else {
                    j3 = -1;
                }
                jArr[i6] = j3;
            }
            AbstractC1120d.h(c02, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(X1.a aVar, Object[] objArr) {
        long j3;
        AbstractC1276k.f(aVar, "connection");
        if (objArr == null) {
            return new Long[0];
        }
        X1.c c02 = aVar.c0(createQuery());
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i6 = 0; i6 < length; i6++) {
                Object obj = objArr[i6];
                if (obj != null) {
                    bind(c02, obj);
                    c02.Z();
                    c02.reset();
                    j3 = s4.j.x(aVar);
                } else {
                    j3 = -1;
                }
                lArr[i6] = Long.valueOf(j3);
            }
            AbstractC1120d.h(c02, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(X1.a aVar, Collection<Object> collection) {
        AbstractC1276k.f(aVar, "connection");
        if (collection == null) {
            return Y3.v.f9812c;
        }
        Z3.b w5 = Y4.l.w();
        X1.c c02 = aVar.c0(createQuery());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    bind(c02, obj);
                    c02.Z();
                    c02.reset();
                    w5.add(Long.valueOf(s4.j.x(aVar)));
                } else {
                    w5.add(-1L);
                }
            }
            AbstractC1120d.h(c02, null);
            return Y4.l.p(w5);
        } finally {
        }
    }
}
