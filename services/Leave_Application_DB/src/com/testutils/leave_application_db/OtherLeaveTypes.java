/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * OtherLeaveTypes generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`other_leave_types`")
public class OtherLeaveTypes implements Serializable {

    private Integer id;
    private String name;
    private Boolean isActive;
    private String displayName;
    private List<OtherLeavesRoleMapping> otherLeavesRoleMappings;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 7)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`name`", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`is_active`", nullable = true)
    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Column(name = "`display_name`", nullable = false, length = 50)
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "otherLeaveTypes")
    public List<OtherLeavesRoleMapping> getOtherLeavesRoleMappings() {
        return this.otherLeavesRoleMappings;
    }

    public void setOtherLeavesRoleMappings(List<OtherLeavesRoleMapping> otherLeavesRoleMappings) {
        this.otherLeavesRoleMappings = otherLeavesRoleMappings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OtherLeaveTypes)) return false;
        final OtherLeaveTypes otherLeaveTypes = (OtherLeaveTypes) o;
        return Objects.equals(getId(), otherLeaveTypes.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

