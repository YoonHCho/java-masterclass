public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double salary) {
        super(name, birthDate, hireDate);
        this.annualSalary = salary;
    }

    @Override
    public double collectPay() {
        // conversion int to drop the decimal to .0
        // dividing by 26 for paid 2 weeks
        if (!isRetired) {
            return (int) this.annualSalary / 26;
        }
        return (int) (this.annualSalary * 0.9) / 26;
    }

    public void retire() {
        this.endDate = this.getDate();
        this.isRetired = true;
    }
}
