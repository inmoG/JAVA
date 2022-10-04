package Java.d.lang.generic;

import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObjct() {
        return object;
    }
}
