public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric -> %d Battery size%n", this.batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric -> average usage: %f%n", this.avgKmPerCharge);
    }
}
