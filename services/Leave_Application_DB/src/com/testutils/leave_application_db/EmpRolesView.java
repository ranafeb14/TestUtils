/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * EmpRolesView generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`emp_roles_view`")
@IdClass(EmpRolesViewId.class)
public class EmpRolesView implements Serializable {

    private Integer empId;
    private BigInteger roleId;

    @Id
    @Column(name = "`emp_id`", nullable = false, scale = 0, precision = 10)
    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Id
    @Column(name = "`role_id`", nullable = false, scale = 0, precision = 19)
    public BigInteger getRoleId() {
        return this.roleId;
    }

    public void setRoleId(BigInteger roleId) {
        this.roleId = roleId;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpRolesView)) return false;
        final EmpRolesView empRolesView = (EmpRolesView) o;
        return Objects.equals(getEmpId(), empRolesView.getEmpId()) &&
                Objects.equals(getRoleId(), empRolesView.getRoleId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(),
                getRoleId());
    }
}
