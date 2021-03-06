/*Generated by WaveMaker Studio*/
package com.testutils.testdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveEmployeeRequest implements Serializable {


    @JsonProperty("name")
    @NotNull
    private List<String> name;

    @JsonProperty("salary")
    @NotNull
    private List<Integer> salary;

    @JsonProperty("employeeCode")
    @NotNull
    private List<BigInteger> employeeCode;

    public List<String> getName() {
        return this.name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<Integer> getSalary() {
        return this.salary;
    }

    public void setSalary(List<Integer> salary) {
        this.salary = salary;
    }

    public List<BigInteger> getEmployeeCode() {
        return this.employeeCode;
    }

    public void setEmployeeCode(List<BigInteger> employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaveEmployeeRequest)) return false;
        final SaveEmployeeRequest saveEmployeeRequest = (SaveEmployeeRequest) o;
        return Objects.equals(getName(), saveEmployeeRequest.getName()) &&
                Objects.equals(getSalary(), saveEmployeeRequest.getSalary()) &&
                Objects.equals(getEmployeeCode(), saveEmployeeRequest.getEmployeeCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                getSalary(),
                getEmployeeCode());
    }
}
