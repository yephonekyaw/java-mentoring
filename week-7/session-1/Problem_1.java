import java.util.Scanner;

class Employee {
  private String firstName;
  private String lastName;
  private double monthlySalary;

  public Employee(String fname, String lname, double msalary) {
    this.firstName = fname;
    this.lastName = lname;
    this.monthlySalary = msalary;
  }

  // getter methods
  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public double getMonthlySalary() {
    return this.monthlySalary;
  }

  // setter methods
  public void setFirstName(String fname) {
    this.firstName = fname;
  }

  public void setLastName(String lname) {
    this.lastName = lname;
  }

  public void setMonthlySalary(double msalary) {
    this.monthlySalary = msalary;
  }

  public double getYearlySalary() {
    return this.monthlySalary * 12;
  }

  public double getRaiseSalary() {
    double newSalary = this.monthlySalary + (this.monthlySalary * 0.1);
    this.monthlySalary = newSalary; // to update your current salary
    return this.getYearlySalary(); // same as return this.monthlySalary * 12;
  }
}

public class Problem_1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String fname = scan.nextLine();
    String lname = scan.nextLine();
    double salary = scan.nextDouble();

    Employee emp = new Employee(fname, lname, salary);
    System.out.println("Employee: " + (emp.getFirstName() + " " + emp.getLastName()));
    System.out.println("Yearly salary: " + String.format("%.2f", emp.getYearlySalary()));
    System.out.println("Yearly salary after a raise: " + String.format("%.2f", emp.getRaiseSalary()));
  }
}