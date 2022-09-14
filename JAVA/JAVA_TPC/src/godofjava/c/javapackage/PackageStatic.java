package godofjava.c.javapackage;

// import godofjava.c.javapackage.sub.SubStatic;
// import static godofjava.c.javapackage.sub.SubStatic.subStaticMethod;
// import static godofjava.c.javapackage.sub.SubStatic.CLASS_NAME;
import static godofjava.c.javapackage.sub.SubStatic.*;

public class PackageStatic {
    public static void main(String[] args) {
        // SubStatic.subStaticMethod();
        // System.out.println(SubStatic.CLASS_NAME);
        subStaticMethod();
        System.out.println(CLASS_NAME);
    }
}
