package com.yxb.dd.model;

import java.math.BigInteger;
import java.util.Date;

/**
 * 用户权限DO
 * DO：Data Object，与数据库完全对应
 */
public class UserRoleDO {

    private BigInteger id;
    // 权限名称
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
}
