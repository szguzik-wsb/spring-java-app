package org.example.firstappspring.service;

import org.springframework.stereotype.Service;

@Service
public class AclService {
    private String acl_group = "user";

    public void setAcl_group(String acl_group) {
        this.acl_group = acl_group;
    }

    public String getAcl_group() {
        return acl_group;
    }

}
