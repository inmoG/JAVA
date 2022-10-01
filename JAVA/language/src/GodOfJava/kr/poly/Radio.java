package kr.poly;

public class Radio implements RemoCon {

    @Override
    public void ChDown() {
        // TODO Auto-generated method stub
        System.out.println("Radio 채널이 올라간다.");
    }

    @Override
    public void chUp() {
        // TODO Auto-generated method stub
        System.out.println("Radio 채널이 내려간다.");
    }

    @Override
    public void internet() {
        // TODO Auto-generated method stub
        System.out.println("Radio는 인터넷이 지원되지 않는다.");
    }

}
