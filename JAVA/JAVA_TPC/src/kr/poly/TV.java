package kr.poly;

public class TV implements RemoCon {
    int currCH = 1;

    @Override
    public void ChDown() {
        // TODO Auto-generated method stub
        if (currCH > RemoCon.MINCH) {
            currCH--;
            System.out.println("TV 채널이 내려간다." + currCH);

        } else {
            currCH = 100;
        }
    }

    @Override
    public void chUp() {
        if (currCH < RemoCon.MAXCH) {
            currCH++;
            System.out.println("TV 채널이 올라간다." + currCH);
        } else {
            currCH = 1;
        }
    }

    @Override
    public void internet() {
        // TODO Auto-generated method stub
        System.out.println("인터넷이 된다");
    }

}
