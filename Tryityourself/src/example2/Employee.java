package example2;

  public class Employee  {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
      private int AnnualSalary =salary*12;

      public Employee(int employeeId,String employeeFirstName,String employeeLastName,int employeeSalary) {
          id = employeeId;
          firstName = employeeFirstName;
          lastName = employeeLastName;
          salary = employeeSalary;
      }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
      public int getAnnualSalary() {
          return AnnualSalary;
      }

      @Override
      public String toString() {
          return "Employee{" +
                  "id=" + id +
                  ", firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", salary=" + salary +
                  ", AnnualSalary=" + AnnualSalary +
                  '}';
      }
  }
