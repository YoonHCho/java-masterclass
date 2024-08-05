public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1984", "07/07/2002");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        System.out.println("-----");

        SalariedEmployee sim = new SalariedEmployee("Sim", "11/11/1984", "07/07/2002", 96000);
        System.out.println(sim);
        System.out.println("Pay = " + sim.collectPay());
        sim.retire();
        System.out.println("Pension pay = " + sim.collectPay());
        System.out.println(sim);
        System.out.println("-----");

        HourlyEmployee lim = new HourlyEmployee("Lim", "01/01/1980", "02/02/2003", 25);
        System.out.println(lim);
        System.out.println("Pay = " + lim.collectPay());
        System.out.println("Double pay = " + lim.getDoublePay());
    }
}
