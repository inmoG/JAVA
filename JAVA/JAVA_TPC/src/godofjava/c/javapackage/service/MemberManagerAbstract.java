package c.service;

import c.model.MemberDTO;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDTO member);

    public abstract boolean removerMember(String name, String phone);

    public abstract boolean updateMember(MemberDTO member);

    public void printLog(String data)
    {
        System.out.println("Data="+data);
    }
}
