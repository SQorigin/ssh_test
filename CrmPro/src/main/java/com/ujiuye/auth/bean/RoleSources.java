package com.ujiuye.auth.bean;

public class RoleSources {
    private Integer roleid;

    private Integer sid;

    private String rsdis;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getRsdis() {
        return rsdis;
    }

    public void setRsdis(String rsdis) {
        this.rsdis = rsdis == null ? null : rsdis.trim();
    }
}