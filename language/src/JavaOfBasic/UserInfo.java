package JavaOfBasic;

public class UserInfo implements java.io.Serializable {
    String name;
    String password;
    // transient String password; transient : 직렬화 대상에서 제외시키고 기본값으로 직렬화한다.
    int age;

    public UserInfo() {
        this("Unknown", "1111", 0);
    }

    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String toString() {
        return "(" + name + "," + password + "," + age + ")";
    }
}
