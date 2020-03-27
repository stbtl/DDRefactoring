package com.yxb.dd.model;

import java.math.BigInteger;
import java.util.Date;

/**
 * 用户DO
 * DO：Data Object，与数据库完全对应
 */
public class UserDO {

    private BigInteger id;
    // 用户名
    private String username;
    // 密码(加密后)
    private String password;
    // 盐值(key)
    private String salt;
    // 用户权限ID
    private BigInteger userRoleId;
    // 密码输入错误次数
    private Byte pwdFailCount;
    // 是否锁定
    private Boolean isLocked;
    private Date gmtCreate;
    private Date gmtModified;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public BigInteger getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(BigInteger userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Byte getPwdFailCount() {
        return pwdFailCount;
    }

    public void setPwdFailCount(Byte pwdFailCount) {
        this.pwdFailCount = pwdFailCount;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
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
