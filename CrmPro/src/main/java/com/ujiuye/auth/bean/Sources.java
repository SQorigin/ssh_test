package com.ujiuye.auth.bean;

public class Sources {
    private Integer sid;

    private String sndis;

    private String spath;

    private String remark;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSndis() {
        return sndis;
    }

    public void setSndis(String sndis) {
        this.sndis = sndis == null ? null : sndis.trim();
    }

    public String getSpath() {
        return spath;
    }

    public void setSpath(String spath) {
        this.spath = spath == null ? null : spath.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}