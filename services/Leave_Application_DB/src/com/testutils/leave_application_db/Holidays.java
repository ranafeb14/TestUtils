/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Holidays generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`holidays`")
public class Holidays implements Serializable {

    private Integer id;
    private String holidayName;
    private Date holidayDate;
    private String holidayLocation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`Holiday_Name`", nullable = false, length = 255)
    public String getHolidayName() {
        return this.holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    @Column(name = "`Holiday_Date`", nullable = false)
    public Date getHolidayDate() {
        return this.holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
    }

    @Column(name = "`Holiday_Location`", nullable = false, length = 255)
    public String getHolidayLocation() {
        return this.holidayLocation;
    }

    public void setHolidayLocation(String holidayLocation) {
        this.holidayLocation = holidayLocation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Holidays)) return false;
        final Holidays holidays = (Holidays) o;
        return Objects.equals(getId(), holidays.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
