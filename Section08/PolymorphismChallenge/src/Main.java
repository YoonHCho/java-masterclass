public class Main {
    public static void main(String[] args) {
        Car car = new Car("Kia");
        Car gasCar = new GasPoweredCar("Genesis", 28, 6);
        Car electricCar = new ElectricCar("Hyundai", 48, 12500);
        Car hybridCar = new HybridCar("Hyb", 45, 12500, 6);

        runRace(car);
        runRace(gasCar);
        runRace(electricCar);
        runRace(hybridCar);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
