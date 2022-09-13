package c.service;

import c.model.MemberDTO;

public class MemberManagerImpl implements MemberManager {

    @Override
    public boolean addMember(MemberDTO member) {
        if (member.name == "inmo") {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removerMember(String name, String phone) {
        if (name == "inmo") {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        if (member.name == "inmo") {
            return true;
        } else {
            return false;
        }
    }

}
