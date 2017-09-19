/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EmployeeDetails generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`employee_details`")
public class EmployeeDetails implements Serializable {

    private Integer employeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String workLocation;
    private String orgLevel;
    private String roleName;
    private String deptName;
    private String buCode;
    private String buName;
    private Integer projectId;
    private String projectName;
    private String managerEmail;
    @Type(type = "DateTime")
    private LocalDateTime dateOfJoining;
    private Timestamp creationDate;
    private Timestamp lastModifiedDate;
    private Boolean active;
    private List<AccruedElapsedLeaves> accruedElapsedLeaveses;

    @Id
    @Column(name = "`employee_id`", nullable = false, scale = 0, precision = 10)
    public Integer getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Column(name = "`first_name`", nullable = false, length = 50)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "`middle_name`", nullable = true, length = 50)
    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "`last_name`", nullable = false, length = 50)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "`email`", nullable = false, length = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "`work_location`", nullable = true, length = 45)
    public String getWorkLocation() {
        return this.workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    @Column(name = "`org_level`", nullable = false, length = 8)
    public String getOrgLevel() {
        return this.orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }

    @Column(name = "`role_name`", nullable = true, length = 50)
    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Column(name = "`dept_name`", nullable = true, length = 50)
    public String getDeptName() {
        return this.deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Column(name = "`bu_code`", nullable = true, length = 20)
    public String getBuCode() {
        return this.buCode;
    }

    public void setBuCode(String buCode) {
        this.buCode = buCode;
    }

    @Column(name = "`bu_name`", nullable = true, length = 50)
    public String getBuName() {
        return this.buName;
    }

    public void setBuName(String buName) {
        this.buName = buName;
    }

    @Column(name = "`project_id`", nullable = true, scale = 0, precision = 10)
    public Integer getProjectId() {
        return this.projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Column(name = "`project_name`", nullable = true, length = 100)
    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Column(name = "`manager_email`", nullable = true, length = 100)
    public String getManagerEmail() {
        return this.managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    @Column(name = "`date_of_joining`", nullable = true)
    public LocalDateTime getDateOfJoining() {
        return this.dateOfJoining;
    }

    public void setDateOfJoining(LocalDateTime dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Column(name = "`creation_date`", nullable = false)
    public Timestamp getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Column(name = "`last_modified_date`", nullable = false)
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Column(name = "`active`", nullable = true)
    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "employeeDetails")
    public List<AccruedElapsedLeaves> getAccruedElapsedLeaveses() {
        return this.accruedElapsedLeaveses;
    }

    public void setAccruedElapsedLeaveses(List<AccruedElapsedLeaves> accruedElapsedLeaveses) {
        this.accruedElapsedLeaveses = accruedElapsedLeaveses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDetails)) return false;
        final EmployeeDetails employeeDetails = (EmployeeDetails) o;
        return Objects.equals(getEmployeeId(), employeeDetails.getEmployeeId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId());
    }
}

