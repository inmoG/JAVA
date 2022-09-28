package c.inheritance;

public class MemberDTO {
    public String name; // instance variable
    public String email;
    public String phone;
    public int age;

    public MemberDTO() {
        // // 아무 정보도 모를 때
    }

    public MemberDTO(String name) {
        // 이름만 알 때
        this.name = name;
    }

    public MemberDTO(int age) {
        this.age = age;
    }

    public MemberDTO(String name, String phone) {
        // 이름과 전화번호만 알 때
        this.name = name;
        this.phone = phone;
    }

    public MemberDTO(String name, String phone, String email) {
        // 모든 정보를 알고 있을 때
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // 주소가 같으므로 true
        if (obj == null)
            return false; // obj가 null이므로 false
        if (getClass() != obj.getClass())
            return false; // class 종류가 다르므로 false
        MemberDTO other = (MemberDTO) obj; // 같은 클래스이므로 형 변환 실행
        // 각 인스턴스 변수가 같은지 비교 작업
        if (age != other.age)
            return false; // age가 다르므로 false
        if (email == null) { // name과 같은 비교 수행
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (name == null) { // name이 null일 때
            if (other.name != null)
                return false; // 비교 대상의 name이 null이 아니면 false
        } else if (!name.equals(other.name))
            return false; // 두 개의 name 값이 다르면 false
        if (phone == null) { // name과 같은 비교 수행
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;

        // 모든 조건을 거쳐서 false를 리턴하지 않은 객체는 같은 값을 가지는 객체로 생각해서 true를 리턴한다.
        return true;
    }
}
