package c.inheritance;

public class Member {
    String name;

    Member(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // 주소가 같으므로 true
        if (obj == null)
            return false; // obj가 null이므로 talse
        if (getClass() != obj.getClass())
            return false; // class 종류가 다르므로 false
        Member other = (Member) obj; // 같은 클래스이므로 형 변환 실패
        if (name == null) { // name이 null 이면
            if (other.name != null) // 비교 대상의 name이 null이 아니면 false
                return false;
        } else if (!name.equals(other.name)) // 두 개의 anme이 다르면 false
            return false;
        return true;
        // 모든 조건을 거쳐서 false를 리턴하지 않은 객체는 값은 값 즉, 동등성을 가지고 있다 판단해 true를 .
    }

}
