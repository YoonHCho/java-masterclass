public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders with %d Battery size%n", this.cylinders, this.batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> average usage: %f%n", this.avgKmPerLitre);
    }
}
