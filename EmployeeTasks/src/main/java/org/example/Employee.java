package org.example;

public class Employee {
     Integer empID;
     String empName;
     String empDesignation;
     Integer empSalary;
     String empDepartment;

    public Employee() {
    }

    public Employee(Integer empID, String empName, String empDesignation, Integer empSalary, String empDepartment) {
        this.empID = empID;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empDepartment = empDepartment;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }
}
