package com.yxb.dd.model.dto;

import java.math.BigInteger;
import java.util.Date;

/**
 * 用户DTO
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
public class UserDTO {

    private BigInteger id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码(加密后)
     */
    private String password;
    /**
     * 盐值(key)
     */
    private String salt;
    /**
     * 邮箱
     */
    private String mail;
    /**
     * 电话号码
     */
    private String tel;
    /**
     * 用户权限ID
     */
    private BigInteger userRoleId;
    /**
     * 密码输入错误次数
     */
    private Integer pwdFailCount;
    /**
     * 是否锁定
     */
    private Boolean isLocked;
    /**
     * 变更日期
     */
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public BigInteger getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(BigInteger userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getPwdFailCount() {
        return pwdFailCount;
    }

    public void setPwdFailCount(Integer pwdFailCount) {
        this.pwdFailCount = pwdFailCount;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", mail='" + mail + '\'' +
                ", tel='" + tel + '\'' +
                ", userRoleId=" + userRoleId +
                ", pwdFailCount=" + pwdFailCount +
                ", isLocked=" + isLocked +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
