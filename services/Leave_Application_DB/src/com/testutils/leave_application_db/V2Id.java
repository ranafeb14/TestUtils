/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class V2Id implements Serializable {

    private Integer empId;
    private Long roleId;

    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof V2)) return false;
        final V2 v2 = (V2) o;
        return Objects.equals(getEmpId(), v2.getEmpId()) &&
                Objects.equals(getRoleId(), v2.getRoleId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(),
                getRoleId());
    }
}