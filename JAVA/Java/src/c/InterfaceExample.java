package c;

import c.model.MemberDTO;
import c.service.*;

public class InterfaceExample {
    public static void main(String[] args) {
        MemberManager member = new MemberManagerImpl();
        member.addManager(new MemberDTO("inmo"));

        
    }
}
