class Employee extends Person {
    int hireDate;
    String companyName;
    double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    @Override
    int getAge() {
        return 2024 - birthdayYear;
    }

    double getJobSeniority() {

        return 2024 - hireDate;
    }

    double getSalary() {
        return salary;
    }
}
 