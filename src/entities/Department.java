package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

  private String name;
  private Integer payDay;

  private Address address;
  private List<Employee> employee = new ArrayList<>();

  Employee emp = new Employee();

  public Department() {
  }

  public Department(String name, Integer payDay, Address address) {
    this.name = name;
    this.payDay = payDay;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPayDay() {
    return payDay;
  }

  public void setPayDay(Integer payDay) {
    this.payDay = payDay;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<Employee> getEmployee() {
    return employee;
  }

  public void setEmployee(List<Employee> employee) {
    this.employee = employee;
  }

  public double payroll() {
    double pay = 0;
    return pay += emp.getSalary();
  }
}
