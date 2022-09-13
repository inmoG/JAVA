package c.service;

import c.model.MemberDTO;

public interface MemberManager {
    public boolean addMember(MemberDTO member);

    public boolean removerMember(String name, String phone);

    public boolean updateMember(MemberDTO member);

}
