package org.example;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        // Adding Departments details with org.example.Department ID and Department Names
        // Create its Model with deptID and deptName
        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();

       // showDepartmentResults(departments);

        showEmployees(employees);

    }

    public static void  showEmployees( ArrayList<Employee> employees){
          //Show all Employees department wise

       List<Employee>  empList = Arrays.asList(
                  new Employee(1,"Rupesh" , "Software Lead",45000,"IT" ),
                  new Employee(1,"Rajiv" , "Software Senior Developer",65000,"HR" ),
                  new Employee(1,"Nidhi" , "Software TechLead",45000,"CT" ),
                  new Employee(1,"Vanshika" , "Software Engineer",55000,"CT" ),
                  new Employee(1,"Taksh" , "Software Tester",85000,"CS" )
                  );

        // Grouping Objects according to Departments
        Map<String ,List<Employee>> result = empList.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment));
        //printing all grouped elements of CS department

        //Groupingby will return Map<String , List<Employee>>
        System.out.println("----------------------------------------------------------");

        result.forEach((k,v)->{
            if(k=="CS") {
                System.out.println("Department " + k );
               // v.forEach((System.out::println) ); //Employee { empID=1, empName='Taksh', empDesignation='Software Tester', empSalary=85000, empDepartment='CS'}
               //v.forEach(employee -> System.out.println(employee.empName));
                v.forEach((emp)->{
                    System.out.println(emp.empName);
                });
            }
        });


        //employees.stream().collect(Collectors.groupingBy(Employee::getEmpName,Collectors.groupingBy(Employee::getEmpDepartment)));
       // System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getEmpName,Collectors.groupingBy(Employee::getEmpDepartment))));
        System.out.println("----------------------------------------------------------");

        //Partitioningby will return Map<boolean , List<Employee>>
        Map<Boolean,List<Employee>> result5 = empList.stream().collect(Collectors.partitioningBy(emp -> emp.getEmpSalary()>60000));
        // Display Employees Salary>50000
        result5.get(true).forEach(System.out::println);
        //Employee { empID=1, empName='Rajiv', empDesignation='Software Senior Developer', empSalary=65000, empDepartment='HR'}
        //Employee { empID=1, empName='Taksh', empDesignation='Software Tester', empSalary=85000, empDepartment='CS'}
        System.out.println("----------------------------------------------------------");
        // Display Employees Salary<50000
        result5.get(false).forEach(System.out::println);
        //Employee { empID=1, empName='Rupesh', empDesignation='Software Lead', empSalary=45000, empDepartment='IT'}
        //Employee { empID=1, empName='Nidhi', empDesignation='Software TechLead', empSalary=45000, empDepartment='CT'}
        //Employee { empID=1, empName='Vanshika', empDesignation='Software Engineer', empSalary=55000, empDepartment='CT'}

    }

    public static void  showDepartmentResults( ArrayList<Department> depts){
          depts.add(new Department(1, "HR"));
          depts.add(new Department(2, "IT"));
          depts.add(new Department(3, "ET"));
          depts.add(new Department(4, "IT"));
          // Use Distinct for removing duplicate Departments

          List<String> res1 = depts.stream().map(d->d.getDeptName()).distinct().collect(Collectors.toList());
           res1.forEach(System.out::println);

          // Use Distinct for removing duplicate Departments
          System.out.println("------------------------------------------------");
          Set<String> res2 = depts.stream().map(d->d.getDeptName()).collect(Collectors.toSet());
          res2.forEach(System.out::println);

          System.out.println("------------------------------------------------");
          // List out all Departments and their counts

        Object res3 = depts.stream().collect(Collectors.groupingBy(Department::getDeptName , Collectors.counting()));

        System.out.println( res3); //{HR=1, IT=2, ET=1}
        //Display total no of departments
        System.out.println("------------------------------------------------");
        Object res4 = depts.stream().map(d->d.getDeptName()).distinct().count();
        System.out.println(res4);

        System.out.println("------------------------------------------------");


    }
}