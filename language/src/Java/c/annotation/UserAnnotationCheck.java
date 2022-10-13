package Java.c.annotation;

public class UserAnnotationCheck {
    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class useClass){
        Method[] methods = useClass.getDeclaredMethods();
        for(Method tempMethod:methods){
            
        }
    }
}
