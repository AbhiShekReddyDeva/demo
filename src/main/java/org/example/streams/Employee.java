package org.example.streams;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee>
{
    int id;
    String name;

    public Employee(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    public int getId()
    {
        return this.id;
    }
    @Override
    public int compareTo(Employee e)
    {
        return Integer.compare(this.id,e.id);
    }
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Abi"));
        employeeList.add(new Employee(3,"Naveen"));
        employeeList.add(new Employee(4,"Mahesh"));
        employeeList.add(new Employee(2,"shiva"));

        List<String> names = employeeList.stream().map(employee -> employee.name.toLowerCase()).toList();
        names.forEach(System.out::println);
    }
}
