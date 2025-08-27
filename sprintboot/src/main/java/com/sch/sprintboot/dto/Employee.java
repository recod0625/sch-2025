package com.sch.sprintboot.dto;

public class Employee {
    private long sno;
    private String name;
    private String department;
    private String address;

    public long getSno() {
        return sno;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
