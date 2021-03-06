/*Generated by WaveMaker Studio*/
package com.testutils.testdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * EmployeeOne generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`employee_one`", uniqueConstraints = {
        @UniqueConstraint(name = "`employee_id_UNIQUE`", columnNames = {"`employee_code`"}),
        @UniqueConstraint(name = "`employee_email_active_unique_idx`", columnNames = {"`email`", "`active`"}),
        @UniqueConstraint(name = "`ldap_uid_UNIQUE`", columnNames = {"`ldap_uid`"})})
public class EmployeeOne implements Serializable {

    private Long id;
    private long employeeCode;
    private String email;
    private String ldapUid;
    private boolean active;
    private boolean isManager;
    private String employmentType;
    private Timestamp createdDate;
    private Timestamp lastModifiedDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 19)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "`employee_code`", nullable = false, scale = 0, precision = 19)
    public long getEmployeeCode() {
        return this.employeeCode;
    }

    public void setEmployeeCode(long employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Column(name = "`email`", nullable = true, length = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "`ldap_uid`", nullable = true, length = 100)
    public String getLdapUid() {
        return this.ldapUid;
    }

    public void setLdapUid(String ldapUid) {
        this.ldapUid = ldapUid;
    }

    @Column(name = "`active`", nullable = false)
    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Column(name = "`is_manager`", nullable = false)
    public boolean isIsManager() {
        return this.isManager;
    }

    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
    }

    @Column(name = "`employment_type`", nullable = true, length = 50)
    public String getEmploymentType() {
        return this.employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    @Column(name = "`created_date`", nullable = false)
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "`last_modified_date`", nullable = false)
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeOne)) return false;
        final EmployeeOne employeeOne = (EmployeeOne) o;
        return Objects.equals(getId(), employeeOne.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

