/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class EmpRolesId implements Serializable {

    private Integer empId;
    private Integer roleId;

    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpRoles)) return false;
        final EmpRoles empRoles = (EmpRoles) o;
        return Objects.equals(getEmpId(), empRoles.getEmpId()) &&
                Objects.equals(getRoleId(), empRoles.getRoleId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(),
                getRoleId());
    }
}