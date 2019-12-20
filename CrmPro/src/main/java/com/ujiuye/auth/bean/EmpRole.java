package com.ujiuye.auth.bean;

public class EmpRole {
    private Integer empFk;

    private Integer roleFk;

    private String erdis;

    public Integer getEmpFk() {
        return empFk;
    }

    public void setEmpFk(Integer empFk) {
        this.empFk = empFk;
    }

    public Integer getRoleFk() {
        return roleFk;
    }

    public void setRoleFk(Integer roleFk) {
        this.roleFk = roleFk;
    }

    public String getErdis() {
        return erdis;
    }

    public void setErdis(String erdis) {
        this.erdis = erdis == null ? null : erdis.trim();
    }
}