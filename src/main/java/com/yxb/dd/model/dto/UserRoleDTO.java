package com.yxb.dd.model.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * 用户权限DTO
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
public class UserRoleDTO implements Serializable {

    private BigInteger id;
    /**
     * 权限名称
     */
    private String roleName;
    private Date gmtCreate;
    private Date gmtModified;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "UserRoleDTO{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
