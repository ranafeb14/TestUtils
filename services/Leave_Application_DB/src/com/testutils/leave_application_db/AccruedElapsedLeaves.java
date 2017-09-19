/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AccruedElapsedLeaves generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`accrued_elapsed_leaves`")
public class AccruedElapsedLeaves implements Serializable {

    private Integer recordId;
    private int employeeId;
    private int totalLeavesCount;
    private String month;
    private String fiscalYear;
    private String action;
    private Timestamp creationDate;
    private Timestamp modifiedDate;
    private String quarter;
    private int totalLeaves;
    private EmployeeDetails employeeDetails;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`record_id`", nullable = false, scale = 0, precision = 10)
    public Integer getRecordId() {
        return this.recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    @Column(name = "`employee_id`", nullable = false, scale = 0, precision = 10)
    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Column(name = "`total_leaves_count`", nullable = false, scale = 0, precision = 10)
    public int getTotalLeavesCount() {
        return this.totalLeavesCount;
    }

    public void setTotalLeavesCount(int totalLeavesCount) {
        this.totalLeavesCount = totalLeavesCount;
    }

    @Column(name = "`month`", nullable = true, length = 3)
    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Column(name = "`fiscal_year`", nullable = true, length = 9)
    public String getFiscalYear() {
        return this.fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Column(name = "`action`", nullable = false, length = 15)
    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Column(name = "`creation_date`", nullable = false)
    public Timestamp getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Column(name = "`modified_date`", nullable = false)
    public Timestamp getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Column(name = "`quarter`", nullable = true, length = 3)
    public String getQuarter() {
        return this.quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    @Column(name = "`total_leaves`", nullable = false, scale = 0, precision = 10)
    public int getTotalLeaves() {
        return this.totalLeaves;
    }

    public void setTotalLeaves(int totalLeaves) {
        this.totalLeaves = totalLeaves;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`employee_id`", referencedColumnName = "`employee_id`", insertable = false, updatable = false)
    public EmployeeDetails getEmployeeDetails() {
        return this.employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        if(employeeDetails != null) {
            this.employeeId = employeeDetails.getEmployeeId();
        }

        this.employeeDetails = employeeDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccruedElapsedLeaves)) return false;
        final AccruedElapsedLeaves accruedElapsedLeaves = (AccruedElapsedLeaves) o;
        return Objects.equals(getRecordId(), accruedElapsedLeaves.getRecordId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRecordId());
    }
}

