public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double rate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = rate;
    }

    public double getDoublePay() {
        return collectPay() * 2;
    }

    @Override
    public double collectPay() {
        return 40 * this.hourlyPayRate;
    }
}
