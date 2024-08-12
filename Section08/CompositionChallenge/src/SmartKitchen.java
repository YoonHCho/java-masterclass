public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return this.brewMaster;
    }

    public DishWasher getDishWasher() {
        return this.dishWasher;
    }

    public Refrigerator getIceBox() {
        return this.iceBox;
    }

    public void setKitchenState(boolean brew, boolean dish, boolean ice) {
        this.brewMaster.setHasWorkToDo(brew);
        this.dishWasher.setHasWorkToDo(dish);
        this.iceBox.setHasWorkToDo(ice);
    }

    public void doKitchenWork() {
        this.brewMaster.brewCoffee();
        this.dishWasher.doDishes();
        this.iceBox.orderFood();
    }
}
