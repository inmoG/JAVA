package Java.d.lang.generic;

import java.io.Serializable;

public class CastingDTO implements Serializable {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObjct() {
        return object;
    }
}
