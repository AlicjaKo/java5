package myapp;

import java.util.Objects;

public class Pair<T,U> {
    private T t;
    private U u;

    public Pair(T tr, U ur) {
        this.t = tr;
        this.u = ur;
    }

    public void setT(T tr) {
        this.t = tr;
    }
    public T getFirst() {
        return this.t;
    }

    public void setU(U ur) {
        this.u = ur;
    }
    public U getSecond() {
        return this.u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return Objects.equals(t, pair.t) && Objects.equals(u, pair.u);
    }


}
