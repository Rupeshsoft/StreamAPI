package org.example;

public class Department {
    Integer DeptId;
    String DeptName;

    public Department() {
    }

    public Department(Integer deptId, String deptName) {
        DeptId = deptId;
        DeptName = deptName;
    }

    public Integer getDeptId() {
        return DeptId;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public void setDeptId(Integer deptId) {
        DeptId = deptId;
    }


    @Override
    public String toString() {
        return "org.example.Department { " +
                "DeptId=" + DeptId +
                ", DeptName='" + DeptName + '\'' +
                '}';
    }
}