/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * V generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`v`")
@IdClass(VId.class)
public class V implements Serializable {

    private Integer empId;
    private Integer roleId;

    @Id
    @Column(name = "`emp_id`", nullable = false, scale = 0, precision = 10)
    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Id
    @Column(name = "`role_id`", nullable = false, scale = 0, precision = 10)
    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof V)) return false;
        final V v = (V) o;
        return Objects.equals(getEmpId(), v.getEmpId()) &&
                Objects.equals(getRoleId(), v.getRoleId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(),
                getRoleId());
    }
}

