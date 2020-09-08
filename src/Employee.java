public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public Employee(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return this.firstname + " " + this.lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualsalary (){
        return this.salary*12;
    }

    public int raisesalary(int percent) {
        int nylon = this.salary + this.salary*(percent/100);
        return nylon;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }

}
