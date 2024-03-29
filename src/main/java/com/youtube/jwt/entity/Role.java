package com.youtube.jwt.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @Id
    private String roleName;

    private String roleDescription;


}
